package Q_04;

class Owner {
    private String ownerName;
    private String phoneNo;

    public Owner(String ownerName, String phoneNo) {
        this.ownerName = ownerName;
        this.phoneNo = phoneNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}

class Bicycle {
    private Owner owner;

    public Bicycle() {
        this.owner = new Owner("Unknown", "Unknown");
    }

    public Bicycle(Owner owner) {
        this.owner = owner;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}

public class BicycleTest {
    public static void main(String[] args) {
        Owner owner = new Owner("Thanuka Sachith", "076 5698607");
        Bicycle bike = new Bicycle(owner);

        System.out.println("Bicycle Owner: " + bike.getOwner().getOwnerName());
        System.out.println("Owner Phone No: " + bike.getOwner().getPhoneNo());
    }
}

