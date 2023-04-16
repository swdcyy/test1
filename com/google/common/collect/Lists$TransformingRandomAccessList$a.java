package com.google.common.collect.Lists$TransformingRandomAccessList$a;
import qk.s0;
import com.google.common.collect.Lists$TransformingRandomAccessList;
import java.util.ListIterator;
import java.lang.Object;
import ok.h;

public class Lists$TransformingRandomAccessList$a extends s0	// class@00181d
{
    public final Lists$TransformingRandomAccessList c;

    public void Lists$TransformingRandomAccessList$a(Lists$TransformingRandomAccessList p0,ListIterator p1){
       this.c = p0;
       super(p1);
    }
    public Object a(Object p0){
       return this.c.function.apply(p0);
    }
}
