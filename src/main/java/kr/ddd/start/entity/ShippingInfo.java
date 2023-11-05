package kr.ddd.start.entity;

import lombok.Getter;

@Getter
public class ShippingInfo {
    private String receiverName;
    private String receiverPhoneNumber;
    private String shippingAddress1;
    private String shippingAddress2;
    private String shippingAddress3;
    private String shippingZipcode;
}
