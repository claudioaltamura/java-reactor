package de.claudioaltamura.java.reactor;

import reactor.core.publisher.Flux;

public class FluxExample {

	Flux<Integer> justAFlux() {
		return Flux.just(1,2,3,4);
	}

	Flux<Integer> mappedFlux() {

		return Flux.just(1, 2, 3, 4)
				.log()
				.map(i -> i * 2);

	}

}
