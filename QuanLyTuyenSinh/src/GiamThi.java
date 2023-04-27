public class GiamThi {

    private String maGiamThi;
    private String donViCongTac;
    private String hoTen;
    private String gioiTinh;
    private int namSinh;
    private String queQuan;

    public GiamThi() {
    }

    public GiamThi(String maGiamThi, String donViCongTac, String hoTen, String gioiTinh, int namSinh, String queQuan) {
        this.maGiamThi = maGiamThi;
        this.donViCongTac = donViCongTac;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
        this.queQuan = queQuan;
    }

    public String getMaGiamThi() {
        return maGiamThi;
    }

    public void setMaGiamThi(String maGiamThi) {
        this.maGiamThi = maGiamThi;
    }

    public void setdonViCongTac(String donViCongTac) {
        this.donViCongTac = donViCongTac;
    }

    public void sethoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setgioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    @Override
    public String toString() {
        return "Giám Thị { " +
                "Mã GT=' " + maGiamThi + '\'' +
                ", Đơn vị Công tác=' " + donViCongTac + '\'' +
                ", Họ và Tên=' " + hoTen + '\'' +
                ", Giới tính=' " + gioiTinh + '\'' +
                ", Năm sinh= " + namSinh +
                ", Quê quán=' " + queQuan + '\'' +
                '}';
    }
}
