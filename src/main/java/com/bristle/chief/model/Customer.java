package com.bristle.chief.model;

import jdk.jfr.Enabled;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "customers")
public class Customer {

    // Column names, reusable from outside of class
    public static final String CUSTOMERS_COLM_CUSTOMER_ID = "customer_id";
    public static final String CUSTOMERS_COLM_NAME = "name";
    public static final String CUSTOMERS_COLM_CONTACT_NAME = "contact_name";
    public static final String CUSTOMERS_COLM_CONTACT_NUMBER = "contact_number";
    public static final String CUSTOMERS_COLM_CONTACT_MOBILE_NUMBER = "contact_mobile_number";
    public static final String CUSTOMERS_COLM_FAX_NUMBER = "fax_number";
    public static final String CUSTOMERS_COLM_POSTAL_CODE = "postal_code";
    public static final String CUSTOMERS_COLM_ADDRESS = "address";
    public static final String CUSTOMERS_COLM_TAX_ID = "tax_id";
    public static final String CUSTOMERS_COLM_RECEIVER = "receiver";
    public static final String CUSTOMERS_COLM_NOTE = "note";


    @Id
    @Column(name = CUSTOMERS_COLM_CUSTOMER_ID)
    String customerId;

    @Column(name = CUSTOMERS_COLM_NAME)
    String name;

    @Column(name = CUSTOMERS_COLM_CONTACT_NAME)
    String contactName;

    @Column(name = CUSTOMERS_COLM_CONTACT_NUMBER)
    String contactNumber;

    @Column(name = CUSTOMERS_COLM_CONTACT_MOBILE_NUMBER)
    String contactMobileNumber;

    @Column(name = CUSTOMERS_COLM_FAX_NUMBER)
    String faxNumber;

    @Column(name = CUSTOMERS_COLM_POSTAL_CODE)
    String postalCode;

    @Column(name = CUSTOMERS_COLM_ADDRESS)
    String address;

    @Column(name = CUSTOMERS_COLM_TAX_ID)
    int taxId;

    @Column(name = CUSTOMERS_COLM_RECEIVER)
    String receiver;

    @Column(name = CUSTOMERS_COLM_NOTE)
    String note;



}
