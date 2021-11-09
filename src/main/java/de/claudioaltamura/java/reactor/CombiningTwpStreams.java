package de.claudioaltamura.java.reactor;

import reactor.core.publisher.Flux;

class CombiningTwpStreams {

	Flux<String> combine() {
		return Flux.just(1, 2, 3, 4)
				.map(i -> i * 2)
				.zipWith(Flux.range(0, 10),
						(one, two) -> String.format("First Flux: %d, Second Flux: %d", one, two));

	}
}
