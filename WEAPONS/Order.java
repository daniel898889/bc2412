public class Order {
    public static void main(String[] args) {
        Weapons ak47_1 = WeaponFactory.createWeapon("AK47", WeaponColor.RED_BLOWN, Accessories.SILENCER , Bullet.ARMOR_PIERCING);
        Weapons ak47_2 = WeaponFactory.createWeapon("AK47", WeaponColor.RED_BLOWN, Accessories.SILENCER , Bullet.ARMOR_PIERCING);
        Weapons m4a1_1 = WeaponFactory.createWeapon("M4A1", WeaponColor.BLUE, Accessories.SILENCER , Bullet.ARMOR_PIERCING);
        Weapons m4a1_2 = WeaponFactory.createWeapon("M4A1", WeaponColor.FADE, Accessories.SILENCER , Bullet.ARMOR_PIERCING);
        Weapons awp_1 = WeaponFactory.createWeapon("AWP", WeaponColor.GREEN, Accessories.SILENCER , Bullet.ARMOR_PIERCING);
        System.out.print("【 " + ak47_1 + " 】" + " + " + "【 " + ak47_2 + " 】"  );
        System.out.println("【 " + m4a1_1 + " 】" + " + " + "【 " +  m4a1_2 + " 】");
        System.out.println("【 " + awp_1 + " 】");
       
}}