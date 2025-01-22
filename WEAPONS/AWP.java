public class AWP implements Weapons {
    private WeaponColor color;
    private Code code;
    private Accessories accessories;
    private Bullet bullet;
    private static int codeCounter = 1; 

    public AWP(WeaponColor color,Accessories accessories , Bullet bullet) {
        this.color = color;
        this.accessories = accessories;
        this.bullet = bullet;
        this.code = generateCode();
    }

    private Code generateCode() {
        String code = String.format("%04d", codeCounter++); 
        return new Code("AWP-" + code);
    }

    public void withBullet() {
        System.out.println("AWP is loaded with bullets.");
    }

    public void withScope() {
        System.out.println("AWP is equipped with a scope.");
    }

    @Override
    public String toString() {
        return "AWP - Color: " + color + ", Code: " + code+ " Accessories: " + accessories + " Bullet: " + bullet;
    }
}