package Application;

import GetterSetter.Category;

public class CategoryAPP {

    public static void main(String[] args) {
        
        Category category = new Category();
        category.setId("ID");
        category.setId(null);
        System.out.println(category.getId());

        category.setExpensive(true);
        category.setExpensive(false);
        System.out.println(category.isExpensive());
    }
    
}
