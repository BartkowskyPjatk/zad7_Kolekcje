import java.util.*;

public class Main {
    public static void main(String[] args) {

        //ZAD 1
        /*ArrayList<Car> CarList = new ArrayList<Car>();
        Car audi_a1 = new Car("Audi a1", 2014);
        Car audi_a3 = new Car("Audi a1", 2024);
        Car audi_a4 = new Car("Audi a1", 2016);
        Car audi_a5 = new Car("Audi a1", 2006);
        Car audi_a6 = new Car("Audi a1", 2010);
        Car audi_a7 = new Car("Audi a1", 2021);
        Car audi_a8 = new Car("Audi a1", 2020);
        Car bmw_m2 = new Car("BMW m2", 2017);
        Car bmw_m3 = new Car("BMW m3", 2013);
        Car bmw_m4 = new Car("BMW m4", 2015);
        Car bmw_m5 = new Car("BMW m5",  2022);
        CarList.add(audi_a1);
        CarList.add(audi_a3);
        CarList.add(audi_a4);
        CarList.add(audi_a5);
        CarList.add(audi_a6);
        CarList.add(audi_a7);
        CarList.add(audi_a8);
        CarList.add(bmw_m2);
        CarList.add(bmw_m3);
        CarList.add(bmw_m4);
        CarList.add(bmw_m5);

        Collections.sort(CarList);
        for (Car car:CarList) {
            System.out.println(car.getCarModel() +" "+ car.getProductionYear());
        }*/

        //ZAD2
        ArrayList<Item> itemList = new ArrayList<Item>();
        Item a = new Item(2, "itemA");
        Item b = new Item(1, "itemB");
        Item c = new Item(4, "itemC");
        Item d = new Item(5, "itemD");
        Item e = new Item(3, "itemE");
        itemList.add(a);
        itemList.add(b);
        itemList.add(c);
        itemList.add(d);
        itemList.add(e);
        /*
        Map<Integer, String> items = new HashMap<>();
        for (Item item:itemList) {
            item.show(item.getId()+" | "+item.getName());
            items.put(item.getId(), item.getName());
        }
        System.out.println("===================================");
        for (Map.Entry<Integer, String> entry : items.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }*/

        //ZAD 3
        Item f = new Item(8, "itemF");
        Item g = new Item(9, "itemG");
        Item h = new Item(6, "itemH");
        Item i = new Item(10, "itemI");
        Item j = new Item(3, "itemJ");
        Item k = new Item(14, "itemK");
        Item l = new Item(13, "itemL");
        Item m = new Item(12, "itemM");
        Item n = new Item(15, "itemN");
        Item o = new Item(11, "itemO");
        itemList.add(f);
        itemList.add(g);
        itemList.add(h);
        itemList.add(i);
        itemList.add(j);
        itemList.add(k);
        itemList.add(l);
        itemList.add(m);
        itemList.add(n);
        itemList.add(o);

        HashSet<Item> itemListSub = new HashSet<>(itemList.subList(0, 4));

        //to wyżej podpowiedział mi intelliJ
        /*HashSet<Item> itemListSub = new HashSet<>();
        for (Item item : itemList.subList(0,4)) {
            itemListSub.add(item);
        }*/
    }
}