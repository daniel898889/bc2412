public class WeaponFactory {
public static Weapons createWeapon(String type, WeaponColor color) {
        switch (type) {
            case "AK47":
                return new AK47(color);
            case "M4A1":
                return new M4A1(color);
            case "AWP":
                return new AWP(color);
            default:
                throw new IllegalArgumentException("Unknown weapon type: " + type);
        }
    }
}