package com.google.common.collect.AbstractMapBasedMultimap$j;
import java.util.SortedSet;
import com.google.common.collect.AbstractMapBasedMultimap$e;
import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.SortedMap;
import java.util.Map;
import java.util.Comparator;
import com.google.common.collect.Maps$m;
import java.lang.Object;

public class AbstractMapBasedMultimap$j extends AbstractMapBasedMultimap$e implements SortedSet	// class@001798
{
    public final AbstractMapBasedMultimap d;

    public void AbstractMapBasedMultimap$j(AbstractMapBasedMultimap p0,SortedMap p1){
       this.d = p0;
       super(p0, p1);
    }
    public Comparator comparator(){
       return this.d().comparator();
    }
    public SortedMap d(){
       return this.b();
    }
    public Object first(){
       return this.d().firstKey();
    }
    public SortedSet headSet(Object p0){
       return new AbstractMapBasedMultimap$j(this.d, this.d().headMap(p0));
    }
    public Object last(){
       return this.d().lastKey();
    }
    public SortedSet subSet(Object p0,Object p1){
       return new AbstractMapBasedMultimap$j(this.d, this.d().subMap(p0, p1));
    }
    public SortedSet tailSet(Object p0){
       return new AbstractMapBasedMultimap$j(this.d, this.d().tailMap(p0));
    }
}
