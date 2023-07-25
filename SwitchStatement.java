public class SwitchStatement {
    public static void main(String[] args) {
        
        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("Meep meep lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Cukup baik");
                break;
            case "D":
                System.out.println("Tidak lulus");
                break;
            default:
                System.out.println("Salah jurusan");

        }

        switch (nilai) {
            case "A" -> System.out.println("Meep meep lulus dengan baik");
            case "B", "C" -> System.out.println("Cukup baik");
            case "D" -> System.out.println("Tidak lulus");
            default -> System.out.println("Salah jurusan");
        }
    }
}
