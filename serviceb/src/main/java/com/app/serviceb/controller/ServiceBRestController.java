package com.app.serviceb.controller;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

import java.util.List;

@RestController
public class ServiceBRestController {

	private final DiscoveryClient discoveryClient;
	private final RestClient restClient;

	public ServiceBRestController(DiscoveryClient discoveryClient, RestClient.Builder restClientBuilder) {
		this.discoveryClient = discoveryClient;
		this.restClient = restClientBuilder.build();
	}

	@GetMapping("/helloEureka")
	public String helloWorld() {
		// Obtém todas as instâncias do serviço "servicea"
		List<ServiceInstance> instances = discoveryClient.getInstances("servicea");

		if (instances.isEmpty()) {
			return "Service A is not available";
		}

		// Escolhe a primeira instância disponível (poderia ser melhorado com balanceamento)
		ServiceInstance serviceInstance = instances.get(0);

		// Constrói a URL da requisição
		String url = serviceInstance.getUri() + "/helloWorld";

		// Chama o serviço A e retorna a resposta
		return restClient.get()
				.uri(url)
				.retrieve()
				.body(String.class);
	}
}
