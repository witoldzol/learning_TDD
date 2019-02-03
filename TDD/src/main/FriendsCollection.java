package main;

import java.net.UnknownHostException;

public class FriendsCollection {
	private MongoCollection friends;
	public FriendsCollection() {
		try {
			DB db = new MongoClient().getDB("friendships");
			friends = new Jong(db).getCollection("friends");
		} catch (UnknownHostExceptionException e){
			
		}
	}
}
