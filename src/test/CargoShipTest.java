package test;

import main.CargoShip;
import main.CrewMember;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CargoShipTest {
    private CargoShip uut;

    @Before
    public void setup(){
        uut = new CargoShip("SS Java", 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorShouldThrowExceptionWhenNameIsNull1(){
        uut = new CargoShip(null, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorShouldThrowExceptionWhenNameIsNull2(){
        uut = new CargoShip(null, 5, new ArrayList<CrewMember>(4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorShouldThrowExceptionWhenNameIsEmpty1(){
        uut = new CargoShip("", 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorShouldThrowExceptionWhenNameIsEmpty2() {
        uut = new CargoShip("", 5, new ArrayList<CrewMember>(4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorShouldThrowExceptionWhenMaxStaffAmmountBelowZero(){
        uut = new CargoShip("SS Test", -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorShouldThrowExceptionWhenMaxStaffAmmountBelowZero2(){
        uut = new CargoShip("SS Test", -1, new ArrayList<CrewMember>());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorShouldThrowExceptionWhenMaxStaffAmmountEqualsZero(){
        uut = new CargoShip("SS Test", 0, new ArrayList<CrewMember>());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorShouldThrowExceptionWhenMaxStaffAmmountEqualsZero2(){
        uut = new CargoShip("SS Test", 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorShouldThrowExceptionWhenInitialCrewMembersAmountIsGreaterThanMaxStaffAmount(){
        uut = new CargoShip("SS Test", 3, new ArrayList<CrewMember>(4));
    }
}
