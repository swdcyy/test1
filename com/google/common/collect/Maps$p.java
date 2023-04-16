package com.google.common.collect.Maps$p;
import java.util.SortedSet;
import com.google.common.collect.Maps$m;
import java.util.SortedMap;
import java.util.Map;
import java.util.Comparator;
import java.lang.Object;

public class Maps$p extends Maps$m implements SortedSet	// class@001851
{

    public void Maps$p(SortedMap p0){
       super(p0);
    }
    public Map b(){
       return this.d();
    }
    public Comparator comparator(){
       return this.d().comparator();
    }
    public SortedMap d(){
       return super.b();
    }
    public Object first(){
       return this.d().firstKey();
    }
    public SortedSet headSet(Object p0){
       return new Maps$p(this.d().headMap(p0));
    }
    public Object last(){
       return this.d().lastKey();
    }
    public SortedSet subSet(Object p0,Object p1){
       return new Maps$p(this.d().subMap(p0, p1));
    }
    public SortedSet tailSet(Object p0){
       return new Maps$p(this.d().tailMap(p0));
    }
}
