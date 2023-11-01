package DuongVanHoan;

public abstract class Class1_Hoan {
    private String name_Hoan;
    private int age_Hoan;


    public Class1_Hoan(String name_Hoan, int age_Hoan) {
        this.name_Hoan = name_Hoan;
        this.age_Hoan = age_Hoan;

    }
    public String getName_Hoan(){
        return name_Hoan;
    }
    public void setName_Hoan(String name_Hoan){
        this.name_Hoan = name_Hoan;
    }

    public int getAge_Hoan() {
        return age_Hoan;
    }

    public void setAge_Hoan(int age_Hoan) {
        this.age_Hoan = age_Hoan;
    }
    public abstract void gpa();
    public abstract void salary();
    public void printfInfor(){
        System.out.println("Name: " + getName_Hoan());
        System.out.println("Age: " + getAge_Hoan());
    }
}
