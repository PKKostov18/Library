public class Reader {

    private String name;
    private String address;
    private String UCN;

    public Reader(String name, String address, String UCN) {
        this.name = name;
        this.address = address;
        this.UCN = UCN;
    }

    public Reader() {
        this.name = "Kaloyan";
        this.address = "address1";
        this.UCN = "0443050523";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUCN() {
        return UCN;
    }

    public void setUCN(String UCN) {
        this.UCN = UCN;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", UCN='" + UCN + '\'' +
                '}';
    }
}
