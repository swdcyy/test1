package com.smile.gifmaker.mvps.utils.observable.ObservableMap;
import java.util.Map;
import com.smile.gifmaker.mvps.utils.DefaultObservable;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;

public final class ObservableMap extends DefaultObservable implements Map	// class@000c38
{
    public final Map mDelegate;

    public void ObservableMap(Map p0){
       super();
       this.mDelegate = p0;
    }
    public void clear(){
       this.mDelegate.clear();
       this.notifyChanged();
    }
    public boolean containsKey(Object p0){
       return this.mDelegate.containsKey(p0);
    }
    public boolean containsValue(Object p0){
       return this.mDelegate.containsValue(p0);
    }
    public Set entrySet(){
       return this.mDelegate.entrySet();
    }
    public Object get(Object p0){
       return this.mDelegate.get(p0);
    }
    public boolean isEmpty(){
       return this.mDelegate.isEmpty();
    }
    public Set keySet(){
       return this.mDelegate.keySet();
    }
    public void notifyChanged(){
       this.notifyChanged(this.mDelegate);
    }
    public Object put(Object p0,Object p1){
       this.notifyChanged();
       return this.mDelegate.put(p0, p1);
    }
    public void putAll(Map p0){
       this.mDelegate.putAll(p0);
       this.notifyChanged();
    }
    public Object remove(Object p0){
       this.notifyChanged();
       return this.mDelegate.remove(p0);
    }
    public int size(){
       return this.mDelegate.size();
    }
    public Collection values(){
       return this.mDelegate.values();
    }
}
