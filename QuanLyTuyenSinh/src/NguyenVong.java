
public class NguyenVong {

    private String maNganh;
    private String tenNganh;
    private String maTruong;
    private String khoiXetTuyen;
    private Float diemThi;
    private ThiSinh thiSinh;


    public void setThiSinh(ThiSinh thiSinh) {
        this.thiSinh = thiSinh;
    }

    public NguyenVong() {
    }

    public NguyenVong(String maNganh, String tenNganh, String maTruong, String khoiXetTuyen, Float diemThi) {
        this.maNganh = maNganh;
        this.tenNganh = tenNganh;
        this.maTruong = maTruong;
        this.khoiXetTuyen = khoiXetTuyen;
        this.diemThi = diemThi;
    }

    public String getMaNganh() {
        return maNganh;
    }

    public void setMaNganh(String maNganh) {
        this.maNganh = maNganh;
    }

    public void setTenNganh(String tenNganh) {
        this.tenNganh = tenNganh;
    }

    public void setMaTruong(String maTruong) {
        this.maTruong = maTruong;
    }

    public void setKhoiXetTuyen(String khoiXetTuyen) {
        this.khoiXetTuyen = khoiXetTuyen;
    }

    public Float getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(Float diemThi) {
        this.diemThi = diemThi;
    }

    @Override
    public String toString() {
        return "NguyenVong {" +
                "Mã Ngành= '" + maNganh + '\'' +
                ", Tên Ngành= '" + tenNganh + '\'' +
                ", Mã Trường= '" + maTruong + '\'' +
                ", Khối XetTuyen= '" + khoiXetTuyen + '\'' +
                ", Điểm Thi= " + diemThi +
                ", Thí Sinh= " + thiSinh +
                '}';
    }

}
