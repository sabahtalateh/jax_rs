package com.sabahtalateh.jax_rs;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class MongoTest {
    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase mongoDatabase = mongoClient.getDatabase("test");

        MongoCollection<Document> collection = mongoDatabase.getCollection("groups");

        List<String> r = new ArrayList<>();

        for (Document document : collection.find()) {
            r.add(document.toString());
        }


        System.out.println(r);
    }
}
