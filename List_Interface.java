interface List_Interface<D> {
    void add(D object); // add object at last node ;
    void add(D object ,Integer pos); // add object at given index ;  
    void remove(Integer pos); //remove from also last
    void transverse(); // print list;
    void search(D object); // search a number
    void sizeof();
    void reverse(); // reverse the linked list;
    void getElementat(Integer pos);

}
