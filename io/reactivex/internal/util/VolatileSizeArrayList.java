package io.reactivex.internal.util.VolatileSizeArrayList;
import java.util.List;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.ArrayList;
import java.lang.Object;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.lang.String;

public final class VolatileSizeArrayList extends AtomicInteger implements List, RandomAccess	// class@0014d1
{
    public final ArrayList list;
    public static final long serialVersionUID = 0x3720ca74d4749213;

    public void VolatileSizeArrayList(){
       super();
       this.list = new ArrayList();
    }
    public void VolatileSizeArrayList(int p0){
       super();
       this.list = new ArrayList(p0);
    }
    public void add(int p0,Object p1){
       this.list.add(p0, p1);
       this.lazySet(this.list.size());
    }
    public boolean add(Object p0){
       this.lazySet(this.list.size());
       return this.list.add(p0);
    }
    public boolean addAll(int p0,Collection p1){
       this.lazySet(this.list.size());
       return this.list.addAll(p0, p1);
    }
    public boolean addAll(Collection p0){
       this.lazySet(this.list.size());
       return this.list.addAll(p0);
    }
    public void clear(){
       this.list.clear();
       this.lazySet(0);
    }
    public boolean contains(Object p0){
       return this.list.contains(p0);
    }
    public boolean containsAll(Collection p0){
       return this.list.containsAll(p0);
    }
    public boolean equals(Object p0){
       if (p0 instanceof VolatileSizeArrayList) {
          return this.list.equals(p0.list);
       }
       return this.list.equals(p0);
    }
    public Object get(int p0){
       return this.list.get(p0);
    }
    public int hashCode(){
       return this.list.hashCode();
    }
    public int indexOf(Object p0){
       return this.list.indexOf(p0);
    }
    public boolean isEmpty(){
       boolean b = (!this.get())? true: false;
       return b;
    }
    public Iterator iterator(){
       return this.list.iterator();
    }
    public int lastIndexOf(Object p0){
       return this.list.lastIndexOf(p0);
    }
    public ListIterator listIterator(){
       return this.list.listIterator();
    }
    public ListIterator listIterator(int p0){
       return this.list.listIterator(p0);
    }
    public Object remove(int p0){
       this.lazySet(this.list.size());
       return this.list.remove(p0);
    }
    public boolean remove(Object p0){
       this.lazySet(this.list.size());
       return this.list.remove(p0);
    }
    public boolean removeAll(Collection p0){
       this.lazySet(this.list.size());
       return this.list.removeAll(p0);
    }
    public boolean retainAll(Collection p0){
       this.lazySet(this.list.size());
       return this.list.retainAll(p0);
    }
    public Object set(int p0,Object p1){
       return this.list.set(p0, p1);
    }
    public int size(){
       return this.get();
    }
    public List subList(int p0,int p1){
       return this.list.subList(p0, p1);
    }
    public Object[] toArray(){
       return this.list.toArray();
    }
    public Object[] toArray(Object[] p0){
       return this.list.toArray(p0);
    }
    public String toString(){
       return this.list.toString();
    }
}
