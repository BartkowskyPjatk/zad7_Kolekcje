public class Item {
    private int id;
    private String name;
    public Item (int id, String name){
        this.id = id;
        this.name = name;
    }
    public void show(String text){
        System.out.println(text);
    }
    public void show(int number){
        System.out.println(number);
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int compareTo(Item item){
        return Integer.compare(this.id, item.id);
    }
}
