package com.google.common.collect.RegularImmutableSet;
import com.google.common.collect.ImmutableSet;
import java.lang.Object;
import qk.w;
import java.lang.System;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import qk.t0;

public final class RegularImmutableSet extends ImmutableSet	// class@000517
{
    public final int d;
    public final int e;
    public final Object[] elements;
    public final int f;
    public final Object[] table;
    public static final RegularImmutableSet EMPTY;

    static {
       Object[] objArray = new Object[0];
       RegularImmutableSet regularImmut = new RegularImmutableSet(objArray, 0, null, 0, 0);
       RegularImmutableSet.EMPTY = v6;
    }
    public void RegularImmutableSet(Object[] p0,int p1,Object[] p2,int p3,int p4){
       super();
       this.elements = p0;
       this.table = p2;
       this.d = p3;
       this.e = p1;
       this.f = p4;
    }
    public boolean contains(Object p0){
       RegularImmutableSet ttable = this.table;
       if (p0 == null || ttable == null) {
          return false;
       }
       int i = w.c(p0);
       while (true) {
          i = i & this.d;
          object oobject = ttable[i];
          if (oobject == null) {
             return false;
          }
          if (oobject.equals(p0)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public int copyIntoArray(Object[] p0,int p1){
       System.arraycopy(this.elements, 0, p0, p1, this.f);
       return (p1 + this.f);
    }
    public ImmutableList createAsList(){
       return ImmutableList.asImmutableList(this.elements, this.f);
    }
    public int hashCode(){
       return this.e;
    }
    public boolean isHashCodeFast(){
       return true;
    }
    public boolean isPartialView(){
       return false;
    }
    public Iterator iterator(){
       return this.iterator();
    }
    public t0 iterator(){
       return this.asList().iterator();
    }
    public int size(){
       return this.f;
    }
}
