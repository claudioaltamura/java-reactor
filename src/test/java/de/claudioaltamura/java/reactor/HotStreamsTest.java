package de.claudioaltamura.java.reactor;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import reactor.core.publisher.ConnectableFlux;

class HotStreamsTest {

	@Test
	void test() {
		HotStreams example = new HotStreams();
		List<Integer> elements = new ArrayList<>();
		ConnectableFlux<Integer> connectable = example.connectable();
		connectable.subscribe(elements::add);

		assertThat(elements).isEmpty();
		connectable.connect();
		assertThat(elements).containsExactly(1, 2, 3, 4);
	}

}