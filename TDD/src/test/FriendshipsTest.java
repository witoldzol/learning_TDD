package test;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.Friendships;

public class FriendshipsTest {

	Friendships friendships;

	@BeforeClass
	public static void beforeClass() {

	}

	@Before
	public void before() {
		friendships = new Friendships();
		friendships.makeFriends("Joe", "Audrey");
		friendships.makeFriends("Joe", "Peter");
		friendships.makeFriends("Joe", "Michael");
		friendships.makeFriends("Joe", "Britney");
		friendships.makeFriends("Joe", "Paul");
	}

	@Test
	public void alexDoesNotHaveFriends() {
		Assert.assertTrue("Alex does not have friends",
				friendships.getFriendsList("Alex").isEmpty());
	}

	@Test
	public void joeHas5Friends() {
		Assert.assertEquals("Joe has 5 friends", 5,
				friendships.getFriendsList("Joe").size());
	}

	@Test
	public void joeIsFriendWithEveryone() {
		List<String> frindsOfJoe = Arrays.asList("Audrey", "Peter", "Michael",
				"Britney", "Paul");
		Assert.assertTrue(
				friendships.getFriendsList("Joe").containsAll(frindsOfJoe));
	}

}
