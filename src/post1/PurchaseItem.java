/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package post1;

/**
 *
 * @author lev
 */
public class PurchaseItem {
    private String upc;
    private int quantity;
    private double subtotal;
    
    public PurchaseItem(String _upc, int _quantity){
        upc = _upc;
        quantity = _quantity;
    }
    
    public String getUPC(){
        return upc;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public void setSubtotal(double _subtotal){
        subtotal = _subtotal;
    }
    
    public double getSubtotal(){
        return subtotal;
    }
}
