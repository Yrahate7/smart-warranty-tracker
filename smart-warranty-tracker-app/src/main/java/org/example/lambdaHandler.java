package main.java.org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class lambdaHandler {

    private static final Logger logger = LoggerFactory.getLogger(lambdaHandler.class);
    public String handleRequest(String requestBody) {
        logger.info("lambdaHandler handleRequest Input " + requestBody);
        return "Response Body";
    }

    public static void main(String[] args) {
        logger.info("lambdaHandler main method called");
        System.out.println("Hello World...!!!");
    }
}
