package com.miaoshaproject.dataobject;

import java.math.BigDecimal;

public class ItemDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.id
     *
     * @mbg.generated Tue Feb 09 21:46:46 CST 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.title
     *
     * @mbg.generated Tue Feb 09 21:46:46 CST 2021
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.price
     *
     * @mbg.generated Tue Feb 09 21:46:46 CST 2021
     */
    private BigDecimal price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.description
     *
     * @mbg.generated Tue Feb 09 21:46:46 CST 2021
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.sales
     *
     * @mbg.generated Tue Feb 09 21:46:46 CST 2021
     */
    private Integer sales;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.img_url
     *
     * @mbg.generated Tue Feb 09 21:46:46 CST 2021
     */
    private String imgUrl;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.id
     *
     * @return the value of item.id
     *
     * @mbg.generated Tue Feb 09 21:46:46 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.id
     *
     * @param id the value for item.id
     *
     * @mbg.generated Tue Feb 09 21:46:46 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.title
     *
     * @return the value of item.title
     *
     * @mbg.generated Tue Feb 09 21:46:46 CST 2021
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.title
     *
     * @param title the value for item.title
     *
     * @mbg.generated Tue Feb 09 21:46:46 CST 2021
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.price
     *
     * @return the value of item.price
     *
     * @mbg.generated Tue Feb 09 21:46:46 CST 2021
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.price
     *
     * @param price the value for item.price
     *
     * @mbg.generated Tue Feb 09 21:46:46 CST 2021
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.description
     *
     * @return the value of item.description
     *
     * @mbg.generated Tue Feb 09 21:46:46 CST 2021
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.description
     *
     * @param description the value for item.description
     *
     * @mbg.generated Tue Feb 09 21:46:46 CST 2021
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.sales
     *
     * @return the value of item.sales
     *
     * @mbg.generated Tue Feb 09 21:46:46 CST 2021
     */
    public Integer getSales() {
        return sales;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.sales
     *
     * @param sales the value for item.sales
     *
     * @mbg.generated Tue Feb 09 21:46:46 CST 2021
     */
    public void setSales(Integer sales) {
        this.sales = sales;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.img_url
     *
     * @return the value of item.img_url
     *
     * @mbg.generated Tue Feb 09 21:46:46 CST 2021
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.img_url
     *
     * @param imgUrl the value for item.img_url
     *
     * @mbg.generated Tue Feb 09 21:46:46 CST 2021
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }
}