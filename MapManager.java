public class MapManager {
    public static void main(String[] args) {
        Map<String, Integer> priceMap = new HashMap<>();
        priceMap.put("Mobile", 15000);
        priceMap.put("laptop", 120000);
        priceMap.put("Tablet", 20000);
        priceMap.put("playstation 5", 60000);
        priceMap.put("xbox", 72000);


        System.out.println("price map: " + priceMap);

        Set<String> keys = priceMap.keySet();


        System.out.println("keys of Map : " + keys);


    }
}