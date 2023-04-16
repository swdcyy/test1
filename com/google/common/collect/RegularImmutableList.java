package com.google.common.collect.RegularImmutableList;
import com.google.common.collect.ImmutableList;
import java.lang.Object;
import java.lang.System;
import ok.n;

public class RegularImmutableList extends ImmutableList	// class@000512
{
    public final Object[] array;
    public final int d;
    public static final ImmutableList EMPTY;

    static {
       Object[] objArray = new Object[0];
       RegularImmutableList.EMPTY = new RegularImmutableList(objArray, 0);
    }
    public void RegularImmutableList(Object[] p0,int p1){
       super();
       this.array = p0;
       this.d = p1;
    }
    public int copyIntoArray(Object[] p0,int p1){
       System.arraycopy(this.array, 0, p0, p1, this.d);
       return (p1 + this.d);
    }
    public Object get(int p0){
       n.i(p0, this.d);
       return this.array[p0];
    }
    public boolean isPartialView(){
       return false;
    }
    public int size(){
       return this.d;
    }
}
