
public class AK47 implements Weapons {
private WeaponColor color;

public AK47(WeaponColor color) {
this.color = color;
}
@Override
public void Shoot() {
System.out.println("This is a AK47. Color: " + color);
}
@Override
 public void UseScope() {
System.out.println("Scope !");
}

@Override
public void Color(WeaponColor color) {
this.color = color;
System.out.println("Ak47 color : " + color);
}
}
