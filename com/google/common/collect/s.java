package com.google.common.collect.s;
import java.util.Set;
import java.lang.Object;
import java.util.Map;
import java.util.Collection;

public interface abstract s	// class@000537
{

    Set cellSet();
    void clear();
    Map column(Object p0);
    Set columnKeySet();
    Map columnMap();
    boolean contains(Object p0,Object p1);
    boolean containsColumn(Object p0);
    boolean containsRow(Object p0);
    boolean containsValue(Object p0);
    boolean equals(Object p0);
    Object get(Object p0,Object p1);
    int hashCode();
    boolean isEmpty();
    Object put(Object p0,Object p1,Object p2);
    void putAll(s p0);
    Object remove(Object p0,Object p1);
    Map row(Object p0);
    Set rowKeySet();
    Map rowMap();
    int size();
    Collection values();
}
