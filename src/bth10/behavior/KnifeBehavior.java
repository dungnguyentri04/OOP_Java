package bth10.behavior;

import bth10.WeaponBehavior;

public class KnifeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Knife Behavior");
    }
}
