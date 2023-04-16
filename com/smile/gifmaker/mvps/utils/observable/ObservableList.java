package com.smile.gifmaker.mvps.utils.observable.ObservableList;
import java.util.List;
import com.smile.gifmaker.mvps.utils.DefaultObservable;
import java.lang.Object;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import java.util.Comparator;

public final class ObservableList extends DefaultObservable implements List	// class@000c37
{
    public final List mDelegate;

    public void ObservableList(List p0){
       super();
       this.mDelegate = p0;
    }
    public void add(int p0,Object p1){
       this.mDelegate.add(p0, p1);
    }
    public boolean add(Object p0){
       this.notifyChanged();
       return this.mDelegate.add(p0);
    }
    public boolean addAll(int p0,Collection p1){
       this.notifyChanged();
       return this.mDelegate.addAll(p0, p1);
    }
    public boolean addAll(Collection p0){
       this.notifyChanged();
       return this.mDelegate.addAll(p0);
    }
    public void clear(){
       this.mDelegate.clear();
    }
    public boolean contains(Object p0){
       return this.mDelegate.contains(p0);
    }
    public boolean containsAll(Collection p0){
       return this.mDelegate.containsAll(p0);
    }
    public Object get(int p0){
       return this.mDelegate.get(p0);
    }
    public int indexOf(Object p0){
       return this.mDelegate.indexOf(p0);
    }
    public boolean isEmpty(){
       return this.mDelegate.isEmpty();
    }
    public Iterator iterator(){
       return this.mDelegate.iterator();
    }
    public int lastIndexOf(Object p0){
       return this.mDelegate.lastIndexOf(p0);
    }
    public ListIterator listIterator(){
       return this.mDelegate.listIterator();
    }
    public ListIterator listIterator(int p0){
       return this.mDelegate.listIterator(p0);
    }
    public void notifyChanged(){
       this.notifyChanged(this.mDelegate);
    }
    public Object remove(int p0){
       this.notifyChanged();
       return this.mDelegate.remove(p0);
    }
    public boolean remove(Object p0){
       this.notifyChanged();
       return this.mDelegate.remove(p0);
    }
    public boolean removeAll(Collection p0){
       this.notifyChanged();
       return this.mDelegate.removeAll(p0);
    }
    public void replaceAll(UnaryOperator p0){
       this.mDelegate.replaceAll(p0);
    }
    public boolean retainAll(Collection p0){
       this.notifyChanged();
       return this.mDelegate.retainAll(p0);
    }
    public Object set(int p0,Object p1){
       this.notifyChanged();
       return this.mDelegate.set(p0, p1);
    }
    public int size(){
       return this.mDelegate.size();
    }
    public void sort(Comparator p0){
       this.mDelegate.sort(p0);
    }
    public List subList(int p0,int p1){
       return this.mDelegate.subList(p0, p1);
    }
    public Object[] toArray(){
       return this.mDelegate.toArray();
    }
    public Object[] toArray(Object[] p0){
       return this.mDelegate.toArray(p0);
    }
}
