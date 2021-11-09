package de.claudioaltamura.java.reactor;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class CombiningTwpStreamsTest {

	@Test
	void test() {
		CombiningTwpStreams example = new CombiningTwpStreams();

		List<String> elements = new ArrayList<>();

		example.combine().log().subscribe(elements::add);

		assertThat(elements).containsExactly("First Flux: 2, Second Flux: 0","First Flux: 4, Second Flux: 1","First Flux: 6, Second Flux: 2","First Flux: 8, Second Flux: 3");
	}

}