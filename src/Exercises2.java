/**
 * @author Branium Academy
 * @version 2022.11.16
 * @see <a href="https://braniumacademy.net">...</a>
 */

public class Exercises2 {
    public static void main(String[] args) {
        // tạo đối tượng lưu địa chỉ của một ai đó với số nhà của họ:
        Address address1 = new Address("120A");
        // tạo  đối tượng lưu địa chỉ của một ai đó với số nhà, ngõ của họ:
        Address address2 = new Address("120A", "127");
        // tạo  đối tượng lưu địa chỉ của một ai đó với số nhà, ngõ, tên đường:
        Address address3 = new Address("120A", "325", "Hoàng Diệu");
        // tạo đối tượng lưu thông tin địa chỉ với số nhà, ngõ, đường, xóm/tổ
        Address address4 = new Address("120A", "325",
                "Hoàng Diệu", "Trung Tâm");
        // tạo đối tượng lưu thông tin địa chỉ với số nhà, ngõ, đường, xóm/tổ, phường/xã
        Address address5 = new Address("120A", "325",
                "Hoàng Diệu", "Trung Tâm", "Quang Minh");
        // tạo đối tượng lưu thông tin địa chỉ với số nhà, ngõ, đường, xóm/tổ, phường/xã,
        // quận/huyện
        Address address6 = new Address("120A", "325",
                "Hoàng Diệu", "Trung Tâm",
                "Quang Minh", "Quận 70");
        // tạo đối tượng lưu thông tin địa chỉ với số nhà, ngõ, đường, xóm/tổ, phường/xã,
        // quận/huyện, thành phố
        Address address7 = new Address("120A", "325",
                "Hoàng Diệu", "Trung Tâm",
                "Quang Minh", "Quận 70", "Hồ Chí Minh");
    }
}

class Address {
    // các thuộc tính:
    public String number;       // số nhà
    public String lane;         // ngõ
    public String road;         // tên đường
    public String village;      // tên xóm
    public String wards;        // phường/xã
    public String district;     // quận/huyện
    public String city;         // thành phố

    // phương thức khởi tạo mặc định:
    public Address() {
        number = "";
        lane = "";
        road = "";
        village = "";
        wards = "";
        district = "";
        city = "";
    }

    // phương thức khởi tạo 1 tham số
    public Address(String number) {
        this.number = number;
    }

    // phương thức khởi tạo 2 tham số
    public Address(String number, String lane) {
        this(number); // gọi constructor 1 tham số
        this.lane = lane;
    }

    // phương thức khởi tạo 3 tham số
    public Address(String number, String lane, String road) {
        this(number, lane); // gọi constructor 2 tham số
        this.road = road;
    }

    // phương thức khởi tạo 4 tham số
    public Address(String number, String lane,
                   String road, String village) {
        this(number, lane, road); // gọi constructor 3 tham số
        this.village = village;
    }

    // phương thức khởi tạo 5 tham số
    public Address(String number, String lane,
                   String road, String village, String wards) {
        this(number, lane, road, village); // gọi constructor 4 tham số
        this.wards = wards;
    }

    // phương thức khởi tạo 6 tham số
    public Address(String number, String lane,
                   String road, String village,
                   String wards, String district) {
        this(number, lane, road, village, wards); // gọi constructor 5 tham số
        this.district = district;
    }

    // phương thức khởi tạo 7 tham số
    public Address(String number, String lane,
                   String road, String village,
                   String wards, String district, String city) {
        // gọi constructor 6 tham số
        this(number, lane, road, village, wards, district);
        this.city = city;
    }

    // phương thức trả về thông tin đầy đủ của địa chỉ
    public String fullAddress() {
        String address = "";
        if (!number.isEmpty()) {
            address += "Số " + number;
        }
        if (!lane.isEmpty()) {
            address += " ngõ " + lane;
        }
        if (!road.isEmpty()) {
            address += " đường " + road;
        }
        if (!village.isEmpty()) {
            address += " thôn/xóm " + village;
        }
        if (!wards.isEmpty()) {
            address += " xã/phường " + wards;
        }
        if (!district.isEmpty()) {
            address += " quận/huyện " + district;
        }
        if (!city.isEmpty()) {
            address += " tỉnh/thành phố " + city;
        }
        return address;
    }
}