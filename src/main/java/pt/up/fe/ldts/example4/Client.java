package pt.up.fe.ldts.example4;

public class Client implements ClientInterface {

    private String name;
    private String phone;

    public Client(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPhone() {
        return phone;
    }
}
