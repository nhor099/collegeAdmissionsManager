import java.util.List;

public class ThiSinh {

    private String soBaoDanh;
    private String hoTen;
    private String gioiTinh;
    private int namSinh;
    private String queQuan;
    private Float diemThi;
    private Float diemUuTien;

    public List<NguyenVong> getList_NguyenVong() {
        return list_NguyenVong;
    }

    public void setList_NguyenVong(List<NguyenVong> list_NguyenVong) {
        this.list_NguyenVong = list_NguyenVong;
    }

    private List<NguyenVong> list_NguyenVong;

    public ThiSinh() {

    }
    public ThiSinh(String soBaoDanh, String hoTen, String gioiTinh, int namSinh, String queQuan, Float diemThi, Float diemUuTien, List<NguyenVong> list_NguyenVong) {
        this.soBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
        this.queQuan = queQuan;
        this.diemThi = diemThi;
        this.diemUuTien = diemUuTien;
        this.list_NguyenVong = list_NguyenVong;
    }

    public String getsoBaoDanh() {
        return soBaoDanh;
    }

    public void setsoBaoDanh(String soBaoDanh) {
        this.soBaoDanh = soBaoDanh;
    }

    public String gethoTen() {
        return hoTen;
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

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public Float getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(Float diemThi) {
        this.diemThi = diemThi;
    }

    public Float getDiemUuTien() {
        return diemUuTien;
    }

    public void setDiem_UuTien(Float diemUuTien) {
        this.diemUuTien = diemUuTien;
    }

    public ThiSinh showTrungTuyen(ThiSinh ts, String maNganh, float diemChuan) {
     //   int size = ts.list_NguyenVong.size();
        return getThiSinh(ts, maNganh, diemChuan);
    }

    private ThiSinh getThiSinh(ThiSinh ts, String maNganh, float diemChuan) {
        int size = ts.list_NguyenVong.size();
        for (int i = 0; i < size; i++) {
            if (ts.getList_NguyenVong().get(i).getMaNganh().equals(maNganh)) {

                if (ts.getList_NguyenVong().get(i).getDiemThi() >= diemChuan) {

                    return ts;

                }
            }
        }

        return null;
    }

    public ThiSinh showTrungTuyen1(ThiSinh ts, String maNganh, float diemChuan) {
        return getThiSinh(ts, maNganh, diemChuan);
    }

    @Override
    public String toString() {
        float diemtong = this.diemThi + this.diemUuTien;
        return "Thi Sinh { " +
                "SBD= '" + soBaoDanh + '\'' +
                ", Họ Tên= '" + hoTen + '\'' +
                ", Giới Tính= '" + gioiTinh + '\'' +
                ", Năm sinh= " + namSinh +
                ", Quê quán= '" + queQuan + '\'' +
                ", Điểm thi= " + diemThi +
                ", Điểm ưu tiên= " + diemUuTien +
                ", Điểm tổng là " + diemtong +
                '}';
    }
}
