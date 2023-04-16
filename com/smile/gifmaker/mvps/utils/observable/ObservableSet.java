package com.smile.gifmaker.mvps.utils.observable.ObservableSet;
import java.util.Set;
import com.smile.gifmaker.mvps.utils.DefaultObservable;
import mrd.c;
import java.lang.Object;
import java.util.Collection;
import java.util.Iterator;

public class ObservableSet extends DefaultObservable implements Set	// class@000c3a
{
    public final Set mDelegate;

    public void ObservableSet(Set p0){
       super();
       this.mDelegate = p0;
    }
    public void ObservableSet(Set p0,c p1){
       super(p1);
       this.mDelegate = p0;
    }
    public boolean add(Object p0){
       this.notifyChanged();
       return this.mDelegate.add(p0);
    }
    public boolean addAll(Collection p0){
       this.notifyChanged();
       return this.mDelegate.addAll(p0);
    }
    public void clear(){
       this.mDelegate.clear();
       this.notifyChanged();
    }
    public boolean contains(Object p0){
       return this.mDelegate.contains(p0);
    }
    public boolean containsAll(Collection p0){
       return this.mDelegate.containsAll(p0);
    }
    public boolean isEmpty(){
       return this.mDelegate.isEmpty();
    }
    public Iterator iterator(){
       return this.mDelegate.iterator();
    }
    public void notifyChanged(){
       this.notifyChanged(this.mDelegate);
    }
    public boolean remove(Object p0){
       this.notifyChanged();
       return this.mDelegate.remove(p0);
    }
    public boolean removeAll(Collection p0){
       this.notifyChanged();
       return this.mDelegate.removeAll(p0);
    }
    public boolean retainAll(Collection p0){
       this.notifyChanged();
       return this.mDelegate.retainAll(p0);
    }
    public int size(){
       return this.mDelegate.size();
    }
    public Object[] toArray(){
       return this.mDelegate.toArray();
    }
    public Object[] toArray(Object[] p0){
       return this.mDelegate.toArray(p0);
    }
}
