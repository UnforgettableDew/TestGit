package service;

import java.util.List;

public class Service {
    private List<String> list;

    public Service(List<String> list) {
        this.list = list;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public static void serviceGreeting(){
        System.out.println("hello service");
    }
}
