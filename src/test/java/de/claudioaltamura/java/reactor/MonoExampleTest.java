package de.claudioaltamura.java.reactor;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import reactor.core.publisher.Mono;

class MonoExampleTest {

	@Test
	void justAMono() {
		var monoExample = new MonoExample();

		var mono = monoExample.justAMono();

		assertThat(mono.block()).isEqualTo(1);
	}
}