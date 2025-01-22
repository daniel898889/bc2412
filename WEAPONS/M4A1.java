public class M4A1 implements Weapons {
    private WeaponColor color;
    private Code code;
    private Accessories accessories;
    private Bullet bullet;
    private static int codeCounter = 1; 

    public M4A1(WeaponColor color,Accessories accessories , Bullet bullet) {
        this.color = color;
        this.accessories =accessories;
        this.bullet = bullet;
        this.code = generateCode();
    }

    private Code generateCode() {
        String codeString = String.format("%04d", codeCounter++); // Format as 001, 002, 003...
        return new Code("M4A1-" + codeString);
    }

    public void withBullet() {
        System.out.println("M4A1 is loaded with bullets.");
    }

    public void withScope() {
        System.out.println("M4A1 is equipped with a scope.");
    }

    @Override
    public String toString() {
        return "M4A1 - Color: " + color + ", Code: " + code + " Accessories: " + accessories + " Bullet: " + bullet;
    }
}