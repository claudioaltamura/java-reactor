package de.claudioaltamura.java.reactor;

import reactor.core.publisher.Mono;

public class MonoExample {

	Mono<Integer> justAMono() {
		return Mono.just(1);
	}
}
