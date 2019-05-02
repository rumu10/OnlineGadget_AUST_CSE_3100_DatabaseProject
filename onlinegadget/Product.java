/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinegadget;

/**
 *
 * @author USER
 */
public class Product {
  private int p_id;
    private String p_name,p_brand,p_price,p_image,p_camera,p_ram,p_os,p_processor,p_display;

    public Product(int p_id, String p_name, String p_brand, String p_details) {
        this.p_id = p_id;
        this.p_name = p_name;
        this.p_brand = p_brand;
        this.p_image=p_image;
        this.p_camera=p_camera;
        this.p_ram=p_ram;
        this.p_os=p_os;
        this.p_processor=p_processor;
        this.p_display=p_display;
    }

    Product() {
     
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getP_brand() {
        return p_brand;
    }

    public void setP_brand(String p_brand) {
        this.p_brand = p_brand;
    }

    public String getP_price() {
        return p_price;
    }

    public void setP_price(String p_price) {
        this.p_price = p_price;
    }

    public String getP_image() {
        return p_image;
    }

    public void setP_image(String p_image) {
        this.p_image = p_image;
    }

    public String getP_camera() {
        return p_camera;
    }

    public void setP_camera(String p_camera) {
        this.p_camera = p_camera;
    }

    public String getP_ram() {
        return p_ram;
    }

    public void setP_ram(String p_ram) {
        this.p_ram = p_ram;
    }

    public String getP_os() {
        return p_os;
    }

    public void setP_os(String p_os) {
        this.p_os = p_os;
    }

    public String getP_processor() {
        return p_processor;
    }

    public void setP_processor(String p_processor) {
        this.p_processor = p_processor;
    }

    public String getP_display() {
        return p_display;
    }

    public void setP_display(String p_display) {
        this.p_display = p_display;
    }
}
