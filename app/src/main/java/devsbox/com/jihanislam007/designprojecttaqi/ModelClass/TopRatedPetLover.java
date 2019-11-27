package devsbox.com.jihanislam007.designprojecttaqi.ModelClass;

public class TopRatedPetLover {

    String CategoryImage;
    String CategoryName;
    String CategorySubTitle;
    public int CategoryId;

    public TopRatedPetLover() {
    }

    public TopRatedPetLover(String categoryImage, String categoryName, String categorySubTitle, int categoryId) {
        CategoryImage = categoryImage;
        CategoryName = categoryName;
        CategorySubTitle = categorySubTitle;
        CategoryId = categoryId;
    }

    public String getCategoryImage() {
        return CategoryImage;
    }

    public void setCategoryImage(String categoryImage) {
        CategoryImage = categoryImage;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public String getCategorySubTitle() {
        return CategorySubTitle;
    }

    public void setCategorySubTitle(String categorySubTitle) {
        CategorySubTitle = categorySubTitle;
    }

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int categoryId) {
        CategoryId = categoryId;
    }
}
