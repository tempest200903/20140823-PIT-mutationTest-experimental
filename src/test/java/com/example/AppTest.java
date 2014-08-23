package com.example;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

import static org.hamcrest.MatcherAssert.assertThat;

public class AppTest {

	App app = new App();

	@Test
	public void testBar() {
		{
			String actual2 = app.foobar(-1);
			assertThat(actual2, is("bar"));
		}
		{
			String actual2 = app.foobar(-2);
			assertThat(actual2, is("bar"));
		}
	}

	@Test
	public void testFoo() {
		if (false) {
			String actual = app.foobar(0);
			assertThat(actual, is("foo"));
		}
		if (false) {
			String actual = app.foobar(1);
			assertThat(actual, is("foo"));
		}
	}

}
