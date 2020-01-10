package com.nacerbits;

public class SubCatMain {

    public enum Category implements CategoryInterface {
        RED(ASubCategory.MAROON, ASubCategory.ORANGE, ASubCategory.BORDEAUX),
        BLUE(BSubCategory.LIGHT, BSubCategory.DARK, BSubCategory.AZURE);

        final private CategoryInterface[] subcategory;

        Category(CategoryInterface... subcategories) {
            this.subcategory = subcategories;
        }

        public CategoryInterface[] getSubcategory() {
            return subcategory;
        }
        private String code;
        private String name;

        @Override
        public String getName() {
            return name;
        }

        @Override
        public String getCode() {
            return code;
        }
    }

    public enum ASubCategory implements CategoryInterface {
        MAROON("M", "Maroon"), ORANGE("0", "Orange"), BORDEAUX("B", "Bordeaux");
        private String code;
        private String name;

        ASubCategory(String code, String name) {
            this.code = code;
            this.name = name;
        }
        @Override
        public String getName() {
            return name;
        }

        @Override
        public String getCode() {
            return code;
        }
    }

    public enum BSubCategory implements CategoryInterface {
        LIGHT("L", "Light"), DARK("D", "Dark"), AZURE("A", "Azure");

        private String code;
        private String name;

        BSubCategory(String code, String name) {
            this.code = code;
            this.name = name;
        }
        @Override
        public String getName() {
            return name;
        }

        @Override
        public String getCode() {
            return code;
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < Category.values().length; i++) {
            CategoryInterface category = Category.values()[i];
            CategoryInterface[] subCategories = ((Category) category).subcategory;
            System.out.println("Cat " + Category.values()[i]);
            for (int j = 0; j < subCategories.length; j++) {
                System.out.println("\t" + subCategories[j].getName());
            }
        }

    }
}
