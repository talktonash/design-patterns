package com.learning.design.patterns.creational.builder;

public class BagOrder {
    private final String modelName;
    private final int modelId;
    private final double price;
    private final double discount;
    private final String brandName;
    private final int quantity;

    private BagOrder(Builder builder) {
        this.modelName = builder.modelName;
        this.modelId = builder.modelId;
        this.price = builder.price;
        this.discount = builder.discount;
        this.brandName = builder.brandName;
        this.quantity = builder.quantity;
    }

    //Below pattern can be outside the class as well and need not be static.
    public static class Builder {
        private String modelName;
        private int modelId;
        private double price;
        private double discount;
        private String brandName;
        private int quantity;

        public Builder() {
        }

        public BagOrder build() {
            return new BagOrder(this);
        }

        public Builder modelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        public Builder brandName(String brandName) {
            this.brandName = brandName;
            return this;
        }

        public Builder modelId(int modelId) {
            this.modelId = modelId;
            return this;
        }

        public Builder quantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public Builder discount(double discount) {
            this.discount = discount;
            return this;
        }

    }

    public String getModelName() {
        return modelName;
    }

    public int getModelId() {
        return modelId;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public String getBrandName() {
        return brandName;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "BagOrder{" +
                "modelName='" + modelName + '\'' +
                ", modelId=" + modelId +
                ", price=" + price +
                ", discount=" + discount +
                ", brandName='" + brandName + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public static void main(String[] args) {
        BagOrder.Builder builder = new BagOrder.Builder();
        BagOrder.Builder builder1 = new BagOrder.Builder();
        BagOrder bagOrder = builder.brandName("Wildcraft").modelName("W01").price(1100.0).discount(100.0).quantity(1).build();
        BagOrder bagOrder1 = builder1.brandName("Wildcraft1").modelName("W02").price(1101.0).quantity(2).build();

        System.out.println("With Discount" + bagOrder.toString());
        System.out.println("Without Discount" + bagOrder1.toString());
    }


}
