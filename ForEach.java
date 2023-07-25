public class ForEach {
    public static void main(String[] args) {
        
        String[] names = {
            "A1", "A2", "A3",
            "A4", "A5", "A6"
        };

        for (var i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("FOR EACH");

        for(String name: names){
            System.out.println(name);
        }
    }
}
