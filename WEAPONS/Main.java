public class Main {
public static void main(String[] args) {
Weapons AK47 = WeaponFactory.createWeapon("AK47", WeaponColor.RED);
AK47.Shoot();
AK47.UseScope();
Weapons M4A1 = WeaponFactory.createWeapon("M4A1", WeaponColor.BLUE);
M4A1.Shoot();
M4A1.UseScope();
Weapons AWP = WeaponFactory.createWeapon("AWP", WeaponColor.GREEN);
AWP.Shoot();
AWP.UseScope();

}}