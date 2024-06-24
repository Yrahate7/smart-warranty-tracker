/**
 * 
 */
package main.java.org.bits.service;

import java.util.List;

import main.java.org.bits.businessobject.ProductBO;

/**
 * @author Srinivasulu Y
 *
 */
public interface ProductsWarrantyService {
    public List<ProductBO> retrieveProductsList();

    public void saveProductInfo(ProductBO productBO);

    public void uploadProductReceipt(ProductBO productBO);

    public void generateInventoryCount();
}
