
public class AWP implements Weapons {
    private WeaponColor color;
    
    public AWP(WeaponColor color) {
    this.color = color;
    }
    @Override
    public void Shoot() {
    System.out.println("This is a AWP. Color: " + color);
    }
    @Override
     public void UseScope() {
    System.out.println("Scope !");
    }
    
    @Override
    public void Color(WeaponColor color) {
    this.color = color;
    System.out.println("AWP color : " + color);
    }
    }