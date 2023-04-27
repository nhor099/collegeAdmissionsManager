import java.util.*;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String choose = null;
        boolean exit = false;

        List<ThiSinh> ds_ts = new ArrayList<>();
        List<GiamThi> ds_gt = new ArrayList<>();

        System.out.print("Nhập số lượng sinh viên: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập danh sách sinh viên: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên thứ " + (i + 1) + " là: ");
            ThiSinh ts = new ThiSinh();
            ts.setsoBaoDanh(inputsoBaoDanh());
            ts.sethoTen(inputhoTen());
            ts.setgioiTinh(inputGioiTinh());
            ts.setNamSinh(inputNamSinh());
            ts.setQueQuan(inputQueQuan());
            ts.setDiemThi(inputDiemThi());
            ts.setDiem_UuTien(inputDiemUuTien());

            System.out.println("Nhập số nguyện vọng của sinh viên: " + ts.gethoTen());
            int nv = Integer.parseInt(scanner.nextLine());
            List<NguyenVong> ds_nguyenvong = new ArrayList<>();
            for (int j = 0; j < nv; j++) {
                NguyenVong nv_ts = new NguyenVong();
                nv_ts.setMaNganh(inputMaNganh());

                nv_ts.setTenNganh(inputTenNganh());
                nv_ts.setMaTruong(inputMaTruong());
                nv_ts.setKhoiXetTuyen(inputKhoi());
                nv_ts.setDiemThi(ts.getDiemThi() + ts.getDiemUuTien());
                nv_ts.setThiSinh(ts);
                ds_nguyenvong.add(nv_ts);
            }
            ts.setList_NguyenVong(ds_nguyenvong);
            ds_ts.add(ts);
        }
        System.out.print("Nhập số lượng giám thị: ");
        int soLuongGiamThi = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập danh sách giám thị: ");
        for (int soluong = 0; soluong < soLuongGiamThi; soluong++) {
            System.out.println("Giám thị thứ " + (soluong+ 1) + " là: ");
            GiamThi gt = new GiamThi();
            gt.setMaGiamThi(inputMGT());
            gt.setdonViCongTac(inputDVCT());
            gt.sethoTen(inputhoTen());
            gt.setgioiTinh(inputGioiTinh());
            gt.setNamSinh(inputNamSinh());
            gt.setQueQuan(inputQueQuan());

            ds_gt.add(gt);

        }
        showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    System.out.println("Nhập SBD sinh viên cần chỉnh sửa: ");
                    String soBaoDanh = scanner.nextLine();
                    boolean isExisted = false;
                    int size = ds_ts.size();
                    for (int i = 0; i < size; i++) {
                        if (ds_ts.get(i).getsoBaoDanh().equals(soBaoDanh)) {
                            isExisted = true;
                            ds_ts.get(i).sethoTen(inputhoTen());
                            ds_ts.get(i).setgioiTinh(inputGioiTinh());
                            ds_ts.get(i).setNamSinh(inputNamSinh());
                            ds_ts.get(i).setQueQuan(inputQueQuan());
                            ds_ts.get(i).setDiemThi(inputDiemThi());
                            ds_ts.get(i).setDiem_UuTien(inputDiemUuTien());

                        }
                    }
                    if (!isExisted) {
                        System.out.printf("SBD = %d not existed.\n", soBaoDanh);
                    } else {
                        System.out.println("Chỉnh sửa như sau: ");
                    }
                    break;
                case "3":
                    System.out.println("Nhập mã giám thị cần chỉnh sửa: ");
                    String maGT = scanner.nextLine();

                    int size_gt = ds_gt.size();
                    for (int i = 0; i < size_gt; i++) {
                        if (ds_gt.get(i).getMaGiamThi().equals(maGT)) {
                            ds_gt.get(i).setdonViCongTac(inputDVCT());
                            ds_gt.get(i).sethoTen(inputhoTen());
                            ds_gt.get(i).setgioiTinh(inputGioiTinh());
                            ds_gt.get(i).setNamSinh(inputNamSinh());
                            ds_gt.get(i).setQueQuan(inputQueQuan());

                        }
                    }

                    break;
                case "4":

                    System.out.println("Nhập mã ngành:");
                    String maNganh = scanner.nextLine();
                    System.out.println("Nhập điểm chuẩn để xét tuyển");
                    Float diemChuan = Float.valueOf(scanner.nextLine());

                    int size1 = ds_ts.size();
                    List<ThiSinh> sx_ts2 = new ArrayList<>();

                    for (int i = 0; i < size1; i++) {
                        if (ds_ts.get(i).showTrungTuyen(ds_ts.get(i), maNganh, diemChuan) != null) {
                            sx_ts2.add(ds_ts.get(i));
                        }
                    }
                    System.out.println("Danh sách những sinh viên trúng truyển mã ngành " + maNganh + " là:");
                    for (ThiSinh student : sx_ts2) {
                        System.out.println(student.toString());
                    }

                    break;
                case "5":
                    System.out.println("Nhập mã ngành:");
                    String maNganh1 = scanner.nextLine();
                    System.out.println("Nhập điểm chuẩn để xét tuyển:");
                    Float diemChuan1 = Float.valueOf(scanner.nextLine());

                    int size3 = ds_ts.size();
                    List<ThiSinh> sx_ts = new ArrayList<>();
                    for (int i = 0; i < size3; i++) {
                        if (ds_ts.get(i).showTrungTuyen1(ds_ts.get(i), maNganh1, diemChuan1) != null) {
                            sx_ts.add(ds_ts.get(i));
                        }
                    }
                    sx_ts.sort((o1, o2) -> o1.getDiemThi() < o2.getDiemThi() ? 1 : -1);
                    // show list students
                    System.out.println("Danh sách trúng tuyển ngành " + maNganh1 + " theo thứ tự giảm dần là: \n");
                    for (ThiSinh student : sx_ts) {
                        System.out.println(student.toString());
                    }
                    break;
                case "6":
                    System.out.println("Danh sách những giám thị quê TPHCM là \n");

                    int size_gt1 = ds_gt.size();
                    for (int i = 0; i < size_gt1; i++) {
                        if (ds_gt.get(i).getQueQuan().equals("TPHCM")) {
                            System.out.println(ds_gt.get(i).toString());
                        }
                    }

                    break;
                case "0":

                default:

            }
            if (exit) {
                break;
            }
            // show menu
            showMenu();
        }
    }

    private static String inputsoBaoDanh() {
        System.out.print("Nhập SBD: ");
        return scanner.nextLine();
    }

    private static String inputMGT() {
        System.out.print("Nhập mã giám thị: ");
        return scanner.nextLine();
    }

    private static String inputDVCT() {
        System.out.print("Nhập Đơn vị công tác: ");
        return scanner.nextLine();
    }

    private static Integer inputNamSinh() {
        System.out.print("Nhập Năm Sinh: ");
        return Integer.parseInt(scanner.nextLine());
    }

    private static String inputQueQuan() {
        System.out.print("Nhập Quê Quán: ");
        return scanner.nextLine();
    }

    private static String inputhoTen() {
        System.out.print("Nhập họ tên: ");
        return scanner.nextLine();
    }

    private static String inputGioiTinh() {
        System.out.print("Nhập giới tính: ");
        return scanner.nextLine();
    }

    private static Float inputDiemThi() {
        System.out.print("Nhập Điểm Thi: ");
        return Float.parseFloat(scanner.nextLine());
    }

    private static Float inputDiemUuTien() {
        System.out.print("Nhập Điểm Ưu Tiên: ");
        return Float.parseFloat(scanner.nextLine());
    }

    private static String inputMaNganh() {
        System.out.print("Nhập mã ngành: ");
        return scanner.nextLine();
    }

    private static String inputTenNganh() {
        System.out.print("Nhập tên ngành: ");
        return scanner.nextLine();
    }

    private static String inputKhoi() {
        System.out.print("Nhập khoi xét tuyển: ");
        return scanner.nextLine();
    }

    private static String inputMaTruong() {
        System.out.print("Nhập mã trường: ");
        return scanner.nextLine();
    }

    public static void showMenu() {
        System.out.println("-----------Quản lý danh sách thi sinh------------");
        System.out.println("1. Chỉnh sửa thí sinh");
        System.out.println("2. Chỉnh sửa nguyen vong");
        System.out.println("3. Chỉnh sửa giam thi");
        System.out.println("4. Danh sách trúng truyển");
        System.out.println("5. Danh sách trúng truyển giảm dần");
        System.out.println("6. Những giám thị có quê ở TPHCM.");
        System.out.println("---------------------------");
        System.out.print("Vui lòng chọn: ");
    }
}