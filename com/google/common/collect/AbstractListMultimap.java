package com.google.common.collect.AbstractListMultimap;
import qk.e0;
import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Map;
import com.google.common.collect.a;
import java.util.Collection;
import java.util.List;
import java.util.Collections;
import java.lang.Object;
import java.lang.Iterable;
import com.google.common.collect.AbstractMapBasedMultimap$k;

public abstract class AbstractListMultimap extends AbstractMapBasedMultimap implements e0	// class@00178b
{
    public static final long serialVersionUID = 0x5b6e85fc5d362ea5;

    public void AbstractListMultimap(Map p0){
       super(p0);
    }
    public Map asMap(){
       return super.asMap();
    }
    public Collection createCollection(){
       return this.createCollection();
    }
    public abstract List createCollection();
    public Collection createUnmodifiableEmptyCollection(){
       return this.createUnmodifiableEmptyCollection();
    }
    public List createUnmodifiableEmptyCollection(){
       return Collections.emptyList();
    }
    public boolean equals(Object p0){
       return super.equals(p0);
    }
    public Collection get(Object p0){
       return this.get(p0);
    }
    public List get(Object p0){
       return super.get(p0);
    }
    public boolean put(Object p0,Object p1){
       return super.put(p0, p1);
    }
    public Collection removeAll(Object p0){
       return this.removeAll(p0);
    }
    public List removeAll(Object p0){
       return super.removeAll(p0);
    }
    public Collection replaceValues(Object p0,Iterable p1){
       return this.replaceValues(p0, p1);
    }
    public List replaceValues(Object p0,Iterable p1){
       return super.replaceValues(p0, p1);
    }
    public Collection unmodifiableCollectionSubclass(Collection p0){
       return Collections.unmodifiableList(p0);
    }
    public Collection wrapCollection(Object p0,Collection p1){
       return this.wrapList(p0, p1, null);
    }
}
