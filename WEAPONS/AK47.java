public class AK47 implements Weapons {
    private WeaponColor color;
    private Accessories accessories;
    private Bullet bullet;
    private Code code;
    private static int codeCounter = 1; // Counter specific to AK47

    public AK47(WeaponColor color ,Accessories accessories , Bullet bullet) {
        this.color = color;
        this.accessories = accessories;
        this.bullet = bullet;
        this.code = generateCode();
    }

    private Code generateCode() {
        String code = String.format("%04d",codeCounter++); 
        return new Code("AK47-" + code);
    }

    public void withBullet() {
        System.out.println("AK47 is loaded with bullets.");
    }

    public void withScope() {
        System.out.println("AK47 is equipped with a scope.");
    }

   

    @Override
    public String toString() {
        return "AK47 - Color: " + color + ", Code: " + code + " Accessories: " + accessories + " Bullet: " + bullet;
    }
}