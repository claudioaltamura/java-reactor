package de.claudioaltamura.java.reactor;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class FluxExampleTest {

	@Test
	void test() {
		FluxExample example = new FluxExample();

		List<Integer> elements = new ArrayList<>();

		example.justAFlux().log().subscribe(elements::add);

		assertThat(elements).containsExactly(1,2,3,4);
	}

}