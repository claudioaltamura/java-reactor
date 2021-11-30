package de.claudioaltamura.java.reactor;

import reactor.core.publisher.ConnectableFlux;
import reactor.core.publisher.Flux;

class HotStreams {

	ConnectableFlux<Integer> connectable() {
		return Flux.just(1, 2, 3, 4).publish();
	}
}
