package devsbox.com.jihanislam007.designprojecttaqi.ModelClass;

public class FeaturePetLover {

    public int CategoryId;

    String CategoryImage;
    String CategoryName;
    String CategoryAddress;
    String CategoryFeature;
    String CategoryDetails;

    public FeaturePetLover() {
    }

    public FeaturePetLover(int categoryId, String categoryImage, String categoryName, String categoryAddress, String categoryFeature, String categoryDetails) {
        CategoryId = categoryId;
        CategoryImage = categoryImage;
        CategoryName = categoryName;
        CategoryAddress = categoryAddress;
        CategoryFeature = categoryFeature;
        CategoryDetails = categoryDetails;
    }

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int categoryId) {
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

    public String getCategoryAddress() {
        return CategoryAddress;
    }

    public void setCategoryAddress(String categoryAddress) {
        CategoryAddress = categoryAddress;
    }

    public String getCategoryFeature() {
        return CategoryFeature;
    }

    public void setCategoryFeature(String categoryFeature) {
        CategoryFeature = categoryFeature;
    }

    public String getCategoryDetails() {
        return CategoryDetails;
    }

    public void setCategoryDetails(String categoryDetails) {
        CategoryDetails = categoryDetails;
    }
}
