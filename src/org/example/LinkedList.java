package org.example;

// definitie de clasa pentru lista
class LinkedList {
    int count;
    Item head;

    LinkedList() {
        super();
        head = null;
        count = 0;
    }

    public void add(int a) {
        Item i = head;
        if (i == null) {
            System.out.println("se adauga primul element in lista: "+a);
            head = new Item(a);
            count = 1;
        } else {
            while(i.next != null)
                i = i.next;
            i.next = new Item(a);
            count++;
        }
    }

    // adauga un obiect Item in lista inlantuita
    public void Add(Item obj){
        Item i = head;
        if (i==null) {
            head = obj;
            count = 1;
        } else {
            while(i.next != null)
                i = i.next;
            i.next = obj;
            count++;
        }
    }

    // construieste un tablou cu valorile din lista
    public int[] List() {
        int[] arrayLL = new int[count];
        Item i = head;
        int k = 0;
        while (i != null) {
            arrayLL[k++] = i.item;
            i = i.next;
        }
        return arrayLL;
    }

    // construieste un tablou cu elementele listei
    public Item[] OList() {
        Item[] arrayOL = new Item[count];
        Item i = head;
        int k = 0;
        while (i != null) {
            arrayOL[k++] = i;
            i = i.next;
        }
        return arrayOL;
    }

    // afiseaza elementele listei
    public void list() {
        System.out.print("\nelementele listei:");
        Item i = head;
        while (i != null) {
            System.out.print(" " + i.item);
            i = i.next;
        }
        System.out.println(" .");
    }


    public String toString() {
        Item[] temp = OList();
        String result = "";
        for(Item i : temp)
            result += i;
        return result + "\n";
    }


    public int count() {
        // cate elemente sunt in lista
        return count;
    }


    public int Count() {
        // cate elemente pozitive sunt in lista
        int np = 0;
        Item i = head;
        if (i == null)
            return 0;
        else {
            while (i != null) {
                if (i.item > 0)
                    np++;
                i = i.next;
            }
            return np;
        }
    }


    // sterge primul element din lista
    public void Delete() {
        head = head.next;
    }

    // sterge ultimul element din lista
    public void deleteLastEl() {
        Item it = head;
        if(it == null) return;
        while(it.next != null) it = it.next;
        it.next = null;
    }

    // sterge un element din lista
    public void delete(int k) {

        if(head == null) return;

        if(head.item == k) {
            // sterge primul element din lista
            head = head.next;
        }
        else {
            Item e = head;
            while(e != null) {
                if (e.next.item == k) {
                    e.next = e.next.next;
                    break;
                }
                e = e.next;
            }
        }
    }


    // sterge un element din lista (param: referinta la obiect)
    public void delete(Item i) {
        if(head == null) return;

        if(head == i) {
            // sterge primul element din lista
            head = head.next;
        }
        else {
            Item e = head;
            while(e != null) {
                if(e.next == i) {
                    e.next = e.next.next;
                    break;
                }
                e = e.next;
            }
        }
    }

}

