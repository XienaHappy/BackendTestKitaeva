package HW4Kitaeva;

public class GetMealNameBuilder {
    private String mealname;


    public GetMealNameBuilder setMealName(String mealname) {
        this.mealname = mealname;
        return this;
    }


    public GetMealName buildGetMealName() {
        return new GetMealName(mealname);
    }

}
