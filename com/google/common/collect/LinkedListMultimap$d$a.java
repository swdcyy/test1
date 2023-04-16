package com.google.common.collect.LinkedListMultimap$d$a;
import qk.s0;
import com.google.common.collect.LinkedListMultimap$d;
import java.util.ListIterator;
import com.google.common.collect.LinkedListMultimap$h;
import java.lang.Object;
import java.util.Map$Entry;
import ok.n;
import com.google.common.collect.LinkedListMultimap$g;

public class LinkedListMultimap$d$a extends s0	// class@001817
{
    public final LinkedListMultimap$h c;
    public final LinkedListMultimap$d d;

    public void LinkedListMultimap$d$a(LinkedListMultimap$d p0,ListIterator p1,LinkedListMultimap$h p2){
       this.d = p0;
       this.c = p2;
       super(p1);
    }
    public Object a(Object p0){
       return p0.getValue();
    }
    public void set(Object p0){
       LinkedListMultimap$d$a tc = this.c;
       boolean b = (tc.d != null)? true: false;
       n.n(b);
       tc.d.c = p0;
       return;
    }
}
