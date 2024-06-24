package main.java.org.bits.controller;

import main.java.org.bits.businessobject.ProductBO;
import main.java.org.bits.service.ProductsWarrantyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UploadReceiptHandler {

	private static final Logger logger = LoggerFactory.getLogger(UploadReceiptHandler.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	private ProductsWarrantyService productsWarrantyService;

	public ProductsWarrantyService getProductsWarrantyService() {
		return productsWarrantyService;
	}

	public void setProductsWarrantyService(ProductsWarrantyService productsWarrantyService) {
		this.productsWarrantyService = productsWarrantyService;
	}
	
	public void uploadProductReceipt(ProductBO productBO) {
		logger.info("UploadReceiptHandler uploadProductReceipt " + productBO);
		productsWarrantyService.uploadProductReceipt(productBO);
	}
}
