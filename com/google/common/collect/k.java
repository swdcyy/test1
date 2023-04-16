package com.google.common.collect.k;
import java.util.Collection;
import java.lang.Object;
import java.util.Set;
import java.util.Iterator;
import java.lang.String;

public interface abstract k implements Collection	// class@0018bd
{

    int add(Object p0,int p1);
    boolean add(Object p0);
    boolean contains(Object p0);
    boolean containsAll(Collection p0);
    int count(Object p0);
    Set elementSet();
    Set entrySet();
    boolean equals(Object p0);
    int hashCode();
    Iterator iterator();
    int remove(Object p0,int p1);
    boolean remove(Object p0);
    boolean removeAll(Collection p0);
    boolean retainAll(Collection p0);
    int setCount(Object p0,int p1);
    boolean setCount(Object p0,int p1,int p2);
    int size();
    String toString();
}
