package org.example;

// clasa pentru obiectele din lista
class Item {
    int item;
    Item next;

    Item(int x) {
        super();
        item = x;
        next = null;
    }
    public String toString(){
        return "\t" + item;
    }
}
