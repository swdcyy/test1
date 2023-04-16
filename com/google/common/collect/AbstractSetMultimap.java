package com.google.common.collect.AbstractSetMultimap;
import qk.m0;
import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Map;
import com.google.common.collect.a;
import java.util.Collection;
import java.util.Set;
import java.util.Collections;
import java.lang.Object;
import java.lang.Iterable;
import com.google.common.collect.AbstractMapBasedMultimap$m;

public abstract class AbstractSetMultimap extends AbstractMapBasedMultimap implements m0	// class@0017a3
{
    public static final long serialVersionUID = 0x67226fd4cd0928d8;

    public void AbstractSetMultimap(Map p0){
       super(p0);
    }
    public Map asMap(){
       return super.asMap();
    }
    public Collection createCollection(){
       return this.createCollection();
    }
    public abstract Set createCollection();
    public Collection createUnmodifiableEmptyCollection(){
       return this.createUnmodifiableEmptyCollection();
    }
    public Set createUnmodifiableEmptyCollection(){
       return Collections.emptySet();
    }
    public Collection entries(){
       return this.entries();
    }
    public Set entries(){
       return super.entries();
    }
    public boolean equals(Object p0){
       return super.equals(p0);
    }
    public Collection get(Object p0){
       return this.get(p0);
    }
    public Set get(Object p0){
       return super.get(p0);
    }
    public boolean put(Object p0,Object p1){
       return super.put(p0, p1);
    }
    public Collection removeAll(Object p0){
       return this.removeAll(p0);
    }
    public Set removeAll(Object p0){
       return super.removeAll(p0);
    }
    public Collection replaceValues(Object p0,Iterable p1){
       return this.replaceValues(p0, p1);
    }
    public Set replaceValues(Object p0,Iterable p1){
       return super.replaceValues(p0, p1);
    }
    public Collection unmodifiableCollectionSubclass(Collection p0){
       return Collections.unmodifiableSet(p0);
    }
    public Collection wrapCollection(Object p0,Collection p1){
       return new AbstractMapBasedMultimap$m(this, p0, p1);
    }
}
