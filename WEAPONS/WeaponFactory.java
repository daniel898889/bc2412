public class WeaponFactory {
    public static Weapons createWeapon(String type, WeaponColor color , Accessories accessories , Bullet bullet) {
        switch (type) {
            case "AK47":
                return new AK47(color , accessories ,bullet); 
            case "M4A1":
                return new M4A1(color , accessories ,bullet); 
            case "AWP":
                return new AWP(color , accessories ,bullet); 
            default:
                throw new IllegalArgumentException("Unknown weapon type: " + type);
        }
    }
}