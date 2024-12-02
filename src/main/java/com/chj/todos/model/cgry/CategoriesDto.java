package com.chj.todos.model.cgry;

public class CategoriesDto {

    private long categoryId;

    private String categoryName;

    private String categoryMemo;

    @Override
    public String toString() {
        return "categoriesDto{" + "categoryId=" + categoryId + ", categoryName='" + categoryName + '\''
                + ", categoryMemo='" + categoryMemo + '\'' + '}';
    }
}
