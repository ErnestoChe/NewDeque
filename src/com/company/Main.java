package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

}
class Deque<T>
{
    private ArrayList<T> list;
    public Deque()
    {
        list = new ArrayList<T>();
        // инициализация внутреннего хранилища
    }

    public void addFront(T item)
    {
        list.add(0, item);
        // добавление в голову
    }

    public void addTail(T item)
    {
        list.add(item);
        // добавление в хвост
    }

    public T removeFront()
    {
        if(list.size() == 0){
            return null;
        }else return list.remove(0);
        // удаление из головы
    }

    public T removeTail()
    {
        if(list.size() == 0){
            return null;
        }else return list.remove(list.size()-1);
        // удаление из хвоста
    }

    public int size()
    {
        return list.size(); // размер очереди
    }
}
