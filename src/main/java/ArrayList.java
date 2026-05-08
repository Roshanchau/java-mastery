public class ArrayList {
    public void main(StringOperation[] args){
        java.util.ArrayList<StringOperation> teachers= new java.util.ArrayList<>();

        teachers.add("groot");
        teachers.add("stark");
        teachers.add("thor");
        teachers.add("loki");

        int index=0;

        while(index<teachers.size()){
            System.out.println(teachers.get(index));
            index+=1;
        }
    }
}
