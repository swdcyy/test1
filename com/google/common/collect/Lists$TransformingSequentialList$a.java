package com.google.common.collect.Lists$TransformingSequentialList$a;
import qk.s0;
import com.google.common.collect.Lists$TransformingSequentialList;
import java.util.ListIterator;
import java.lang.Object;
import ok.h;

public class Lists$TransformingSequentialList$a extends s0	// class@00181f
{
    public final Lists$TransformingSequentialList c;

    public void Lists$TransformingSequentialList$a(Lists$TransformingSequentialList p0,ListIterator p1){
       this.c = p0;
       super(p1);
    }
    public Object a(Object p0){
       return this.c.function.apply(p0);
    }
}
