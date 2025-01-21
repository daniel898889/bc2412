
public class M4A1 implements Weapons {
    private WeaponColor color;
    
    public M4A1(WeaponColor color) {
    this.color = color;
    }
    @Override
    public void Shoot() {
    System.out.println("This is a M4A1. Color: " + color);
    }
    @Override
     public void UseScope() {
    System.out.println("Scope !");
    }
    
    @Override
    public void Color(WeaponColor color) {
    this.color = color;
    System.out.println("M4A1 color : " + color);
    }
    }