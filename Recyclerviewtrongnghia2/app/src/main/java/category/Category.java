package category;

import java.util.List;

import phone.Phone;

public class Category {
    private String namecategory;
    private List<Phone>phone;

    public Category(String namecategory, List<Phone> phone) {
        this.namecategory = namecategory;
        this.phone = phone;
    }

    public String getNamecategory() {
        return namecategory;
    }

    public void setNamecategory(String namecategory) {
        this.namecategory = namecategory;
    }

    public List<Phone> getPhone() {
        return phone;
    }

    public void setPhone(List<Phone> phone) {
        this.phone = phone;
    }
}
