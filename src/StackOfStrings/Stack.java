package StackOfStrings;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<String> data = new ArrayList<>();

    public void push(String item){
        this.data.add(item);
    }
    public String pop(){
        if (!data.isEmpty()){
            return data.remove(0);
        }
        return null;
    }

    public String peek(){
        if (!data.isEmpty()){
            return data.get(0);
        }
        return null;
    }
    public boolean isEmpty(){
        if (data.size() > 0){
            return true;
        }
        return false;
    }

}
