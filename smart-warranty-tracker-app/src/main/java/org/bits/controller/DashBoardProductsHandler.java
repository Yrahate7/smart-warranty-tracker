package main.java.org.bits.controller;

import java.util.List;

import main.java.org.bits.businessobject.ProductBO;
import main.java.org.bits.service.ProductsWarrantyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DashBoardProductsHandler {

    private static final Logger logger = LoggerFactory.getLogger(DashBoardProductsHandler.class);

    private ProductsWarrantyService productsWarrantyService;

    public ProductsWarrantyService getProductsWarrantyService() {
        return productsWarrantyService;
    }

    public void setProductsWarrantyService(ProductsWarrantyService productsWarrantyService) {
        this.productsWarrantyService = productsWarrantyService;
    }

    public static void main(String[] args) {
        System.out.println("DashBoardProductsHandler........");
    }

    public List<ProductBO> handleRequest(String requestBody) {
        logger.info("DashBoardProductsHandler handleRequest Input " + requestBody);
        System.out.println("Input " + requestBody);
        return retrieveProductsList();
    }

    public List<ProductBO> retrieveProductsList() {
        logger.info("DashBoardProductsHandlerInside retrieve products list");
        System.out.println("Inside retrieve products list");
        return productsWarrantyService.retrieveProductsList();
    }

    public void generateInventoryCount() {
        productsWarrantyService.generateInventoryCount();
    }

}
