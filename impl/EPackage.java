package OOP.less1.practice.Task1.impl;

public enum EPackage {
    PLASTIC("пластик"), GLASS("стекло"), POLYSTYRENE("полистерол");

    private final String material;
    EPackage(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
