package com.yxcorp.gifshow.util.LatestBrowsedFeedCache$currentFeedLruMap$1;
import java.util.LinkedHashMap;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Set;
import java.util.Collection;
import java.util.Map$Entry;

public final class LatestBrowsedFeedCache$currentFeedLruMap$1 extends LinkedHashMap	// class@001ef3
{

    public void LatestBrowsedFeedCache$currentFeedLruMap$1(){
       super();
    }
    public final boolean containsKey(Object p0){
       if (p0 instanceof String) {
          return this.containsKey(p0);
       }
       return false;
    }
    public boolean containsKey(String p0){
       return super.containsKey(p0);
    }
    public boolean containsValue(QPhoto p0){
       return super.containsValue(p0);
    }
    public final boolean containsValue(Object p0){
       if (p0 instanceof QPhoto) {
          return this.containsValue(p0);
       }
       return false;
    }
    public final Set entrySet(){
       return this.getEntries();
    }
    public QPhoto get(String p0){
       return super.get(p0);
    }
    public final Object get(Object p0){
       if (p0 instanceof String) {
          return this.get(p0);
       }
       return null;
    }
    public Set getEntries(){
       return super.entrySet();
    }
    public Set getKeys(){
       return super.keySet();
    }
    public QPhoto getOrDefault(String p0,QPhoto p1){
       return super.getOrDefault(p0, p1);
    }
    public final Object getOrDefault(Object p0,Object p1){
       if (p0 instanceof String) {
          return this.getOrDefault(p0, p1);
       }
       return p1;
    }
    public int getSize(){
       return super.size();
    }
    public Collection getValues(){
       return super.values();
    }
    public final Set keySet(){
       return this.getKeys();
    }
    public QPhoto remove(String p0){
       return super.remove(p0);
    }
    public final Object remove(Object p0){
       if (p0 instanceof String) {
          return this.remove(p0);
       }
       return null;
    }
    public final boolean remove(Object p0,Object p1){
       if (p0 instanceof String && p1 instanceof QPhoto) {
          return this.remove(p0, p1);
       }
       return false;
    }
    public boolean remove(String p0,QPhoto p1){
       return super.remove(p0, p1);
    }
    public boolean removeEldestEntry(Map$Entry p0){
       boolean b = (this.size() > 10)? true: false;
       return b;
    }
    public final int size(){
       return this.getSize();
    }
    public final Collection values(){
       return this.getValues();
    }
}
