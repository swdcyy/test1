package com.google.common.collect.Lists;
import java.lang.Iterable;
import java.util.List;
import java.util.ArrayList;
import java.lang.Object;
import ok.n;
import java.util.Collection;
import com.google.common.collect.e;
import java.util.Iterator;
import com.google.common.collect.Iterators;
import java.lang.String;
import qk.g;
import com.google.common.primitives.Ints;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;
import ok.h;
import java.util.RandomAccess;
import com.google.common.collect.Lists$TransformingRandomAccessList;
import com.google.common.collect.Lists$TransformingSequentialList;

public final class Lists	// class@0004f5
{

    public static List a(Iterable p0){
       return p0;
    }
    public static ArrayList b(){
       return new ArrayList();
    }
    public static ArrayList c(Iterable p0){
       n.j(p0);
       ArrayList uArrayList = (p0 instanceof Collection)? new ArrayList(e.a(p0)): Lists.d(p0.iterator());
       return uArrayList;
    }
    public static ArrayList d(Iterator p0){
       ArrayList uArrayList = Lists.b();
       Iterators.a(uArrayList, p0);
       return uArrayList;
    }
    public static ArrayList e(Object[] p0){
       n.j(p0);
       int len = p0.length;
       g.b(len, "arraySize");
       ArrayList uArrayList = new ArrayList(Ints.d((((long)len + 5) + (long)(len / 10))));
       Collections.addAll(uArrayList, p0);
       return uArrayList;
    }
    public static ArrayList f(int p0){
       g.b(p0, "initialArraySize");
       return new ArrayList(p0);
    }
    public static CopyOnWriteArrayList g(){
       return new CopyOnWriteArrayList();
    }
    public static List h(List p0,h p1){
       Lists$TransformingRandomAccessList transforming = (p0 instanceof RandomAccess)? new Lists$TransformingRandomAccessList(p0, p1): new Lists$TransformingSequentialList(p0, p1);
       return transforming;
    }
}
