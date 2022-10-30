// Stock list
package com.bridgelabz.oops;

public class Stock {
    private String shareName;
    private int numberOfShare,sharePrice,valueOfStock;
    public String getShareName() {
        return shareName;
    }
    public void setShareName(String shareName) {
        this.shareName = shareName;
    }
    public int getNumberOfShare() {
        return numberOfShare;
    }
    public void setNumberOfShare(int numberOfShare) {
        this.numberOfShare = numberOfShare;
    }
    public int getSharePrice() {
        return sharePrice;
    }
    public void setSharePrice(int sharePrice) {
        this.sharePrice = sharePrice;
    }
    public int getValueOfStock() {
        return valueOfStock;
    }
    public void setValueOfStock(int valueOfStock) {
        this.valueOfStock = valueOfStock;
    }
    public Stock() {
    }
    public Stock(String shareName, int numberOfShare, int sharePrice) {
        this.shareName = shareName;
        this.numberOfShare = numberOfShare;
        this.sharePrice = sharePrice;
    }

        @Override
    public String toString() {
        return "\nStock List : \t" +
                "Share Name : '" + shareName + "',\s"+
                "Number of Share : '" + numberOfShare + "',\s" +
                "Share Price : '" + sharePrice + "',\s"+
                "Value of Stock : '" + valueOfStock+'\'';
    }
}