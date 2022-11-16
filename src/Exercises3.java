/**
 * @author Branium Academy
 * @version 2022.11.16
 * @see <a href="https://braniumacademy.net">...</a>
 */

public class Exercises3 {
    public static void main(String[] args) {
        // tạo tài khoản với constructor 0 tham số:
        BankAccount account = new BankAccount();
        // tạo tài khoản với constructor 1 tham số:
        BankAccount account1 = new BankAccount("0021000439800");
        // tạo tài khoản với constructor 2 tham số:
        BankAccount account2 = new BankAccount("0021000439800", "Trần Văn Hưng");
        // tương tự ta tạo tài khoản với nhiều hơn các thông tin ban đầu
        // bằng cách gọi đến các phương thức khởi tạo khác và cung cấp thêm các đối số:
        BankAccount account3 = new BankAccount("0021000439800",
                "Trần Văn Hưng", "Tiết kiệm");
        BankAccount account4 = new BankAccount("0021000439800",
                "Trần Văn Hưng", "Tiết kiệm", 999999999);
        BankAccount account5 = new BankAccount("0021000439800",
                "Trần Văn Hưng", "Tiết kiệm", 999999999, "ViraniumBank");
        BankAccount account6 = new BankAccount("0021000439800",
                "Trần Văn Hưng", "Tiết kiệm", 999999999,
                "ViraniumBank", "12/06/2025");
        BankAccount account7 = new BankAccount("0021000439800",
                "Trần Văn Hưng", "Tiết kiệm", 999999999,
                "ViraniumBank", "12/06/2025", "12/6/2030");
    }
}

class BankAccount {
    // các thuộc tính:
    public String accNumber;    // số tài khoản
    public String owner;        // chủ tài khoản
    public String type;         // loại tài khoản(vd: tiết kiệm)
    public long ballance;       // số dư
    public String bankName;     // tên ngân hàng
    public String startDate;    // ngày phát hành
    public String endDate;      // ngày hết hạn

    // phương thức khởi tạo mặc định
    public BankAccount() {
        accNumber = "";
        owner = "";
        type = "";
        ballance = 0;
        bankName = "";
        startDate = "";
        endDate = "";
    }

    // phương thức khởi tạo 1 tham số
    public BankAccount(String accNumber) {
        this.accNumber = accNumber;
    }

    // phương thức khởi tạo 2 tham số
    public BankAccount(String accNumber, String owner) {
        this(accNumber); // gọi constructor 1 tham số
        this.owner = owner;
    }

    // phương thức khởi tạo 3 tham số
    public BankAccount(String accNumber, String owner, String type) {
        this(accNumber, owner); // gọi constructor 2 tham số
        this.type = type;
    }

    // phương thức khởi tạo 4 tham số
    public BankAccount(String accNumber, String owner,
                       String type, long ballance) {
        this(accNumber, owner, type); // gọi constructor 3 tham số
        this.ballance = ballance;
    }

    // phương thức khởi tạo 5 tham số
    public BankAccount(String accNumber, String owner,
                       String type, long ballance, String bankName) {
        this(accNumber, owner, type, ballance); // gọi constructor 4 tham số
        this.bankName = bankName;
    }

    // phương thức khởi tạo 6 tham số
    public BankAccount(String accNumber, String owner, String type,
                       long ballance, String bankName, String startDate) {
        // gọi constructor 5 tham số
        this(accNumber, owner, type, ballance, bankName);
        this.startDate = startDate;
    }

    // phương thức khởi tạo 7 tham số
    public BankAccount(String accNumber, String owner,
                       String type, long ballance,
                       String bankName, String startDate, String endDate) {
        // gọi constructor 6 tham số
        this(accNumber, owner, type, ballance, bankName, startDate);
        this.endDate = endDate;
    }

    // nạp tiền vào tk ngân hàng
    public boolean deposit(long amount) {
        if (amount > 0) {
            ballance += amount;
            return true; // gửi tiền vào tk thành công
        }
        return false; // gửi tiền vào tài khoản thất bại
    }

    // rút tiền
    public boolean withdraw(long amount) {
        if (amount > 0 && amount < ballance) {
            ballance -= amount;
            return true;
        }
        return false; // rút thất bại
    }

    // chuyển khoản từ tài khoản nguồn(hiện tại) sang tài khoản đích(tk nhận)
    public boolean bankTransfer(BankAccount other, long amount) {
        // nếu số tiền cần chuyển hợp lệ
        if (0 < amount && amount < ballance) {
            ballance -= amount; // giảm số tiền ở Tk hiện thời
            other.ballance += amount; // tăng số tiền ở tk đích
            return true; // chuyển khoản thành công
        }
        return false; // chuyển khoản thất bại
    }

    // kiểm tra số dư:
    public void checkAccBallance() {
        System.out.println("Số dư của bạn hiện tại là: " + ballance);
    }

    // thanh toán các dịch vụ khác
    public boolean pay(String service, long amount) {
        if (!service.isEmpty() && amount > 0 && amount < ballance) {
            ballance -= amount;
            return true; // thanh toán thành công
        }
        return false; // thanh toán thất bại
    }
}

