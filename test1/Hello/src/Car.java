class Car extends InterfaceCar {
    private String model;
    private String brand;
    private int age;

    public void setModel(String model) {
        this.model = model;
    }

    public void getModel() {
        System.out.println(this.model);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void getBrand() {
        System.out.println(this.brand);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getAge() {
        System.out.println(this.age);
    }

}
