package de.claudioaltamura.java.reactor;

import reactor.core.publisher.Mono;

class MonoExample {

	Mono<Integer> justAMono() {
		return Mono.just(1);
	}
}
