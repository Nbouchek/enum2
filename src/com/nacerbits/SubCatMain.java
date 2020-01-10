package com.nacerbits;

public class SubCatMain {

    public enum AllegationCategoryNew implements CategoryInterface {
        RED("R", "Red", AllegationSubCategoryA.MAROON, AllegationSubCategoryA.ORANGE, AllegationSubCategoryA.BORDEAUX),
        BLUE("B", "Blue",AllegationSubCategoryB.LIGHT, AllegationSubCategoryB.DARK, AllegationSubCategoryB.AZURE);

        private String code;
        private String name;

        final private CategoryInterface[] subcategory;

        AllegationCategoryNew(String name, String code, CategoryInterface... subcategories) {
            this.code = code;
            this.name = name;
            this.subcategory = subcategories;
        }

        public CategoryInterface[] getSubcategory() {
            return subcategory;
        }


        @Override
        public String getName() {
            return name;
        }

        @Override
        public String getCode() {
            return code;
        }

        @Override
        public String getCodeAndName() {
            return name + ": " + code;
        }
    }

    public enum AllegationSubCategoryA implements CategoryInterface {
        MAROON("M", "Maroon"), ORANGE("O", "Orange"), BORDEAUX("B", "Bordeaux");
        private String code;
        private String name;

        AllegationSubCategoryA(String code, String name) {
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

        @Override
        public String getCodeAndName() {
            return name + ": " + code;
        }
    }

    public enum AllegationSubCategoryB implements CategoryInterface {
        LIGHT("L", "Light"), DARK("D", "Dark"), AZURE("A", "Azure");

        private String code;
        private String name;

        AllegationSubCategoryB(String code, String name) {
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

        @Override
        public String getCodeAndName() {
            return name + ": " + code;
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < AllegationCategoryNew.values().length; i++) {
            CategoryInterface category = AllegationCategoryNew.values()[i];
            CategoryInterface[] subCategories = ((AllegationCategoryNew) category).subcategory;
            System.out.println("Cat " + AllegationCategoryNew.values()[i].getCodeAndName());
            for (int j = 0; j < subCategories.length; j++) {
                System.out.println("\t" + subCategories[j].getCodeAndName());
            }
        }
    }
}
