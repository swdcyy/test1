package com.google.common.collect.Lists$OnePlusArrayList;
import java.io.Serializable;
import java.util.RandomAccess;
import java.util.AbstractList;
import java.lang.Object;
import ok.n;
import tk.c;

public class Lists$OnePlusArrayList extends AbstractList implements Serializable, RandomAccess	// class@00181c
{
    public final Object first;
    public final Object[] rest;
    public static final long serialVersionUID;

    public void Lists$OnePlusArrayList(Object p0,Object[] p1){
       super();
       this.first = p0;
       n.j(p1);
       this.rest = p1;
    }
    public Object get(int p0){
       Lists$OnePlusArrayList tfirst;
       n.i(p0, this.size());
       if (!p0) {
          tfirst = this.first;
       }else {
          p0--;
          tfirst = this.rest[p0];
       }
       return tfirst;
    }
    public int size(){
       return c.a(this.rest.length, 1);
    }
}
