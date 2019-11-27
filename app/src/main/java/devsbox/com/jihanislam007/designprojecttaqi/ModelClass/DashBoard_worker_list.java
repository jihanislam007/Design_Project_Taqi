package devsbox.com.jihanislam007.designprojecttaqi.ModelClass;

public class DashBoard_worker_list {

    public int CategoryId;

    String CategoryImage;
    String CategoryName;
    String CategoryTimeShedule;
    String CategoryDate;

    public DashBoard_worker_list() {
    }

    public DashBoard_worker_list(int categoryId, String categoryImage, String categoryName, String categoryTimeShedule, String categoryDate) {
        CategoryId = categoryId;
        CategoryImage = categoryImage;
        CategoryName = categoryName;
        CategoryTimeShedule = categoryTimeShedule;
        CategoryDate = categoryDate;
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

    public String getCategoryTimeShedule() {
        return CategoryTimeShedule;
    }

    public void setCategoryTimeShedule(String categoryTimeShedule) {
        CategoryTimeShedule = categoryTimeShedule;
    }

    public String getCategoryDate() {
        return CategoryDate;
    }

    public void setCategoryDate(String categoryDate) {
        CategoryDate = categoryDate;
    }
}

