package com.kuaishou.gifshow.kuaishan.logic.i1;
import erd.g;
import com.kuaishou.gifshow.kuaishan.logic.m1;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.util.List;
import java.lang.Object;
import kotlin.Pair;
import java.util.Objects;
import java.lang.Integer;
import com.kuaishou.gifshow.kuaishan.logic.o1;
import java.lang.System;
import t90.i;
import java.lang.StringBuilder;
import java.lang.String;
import com.kuaishou.gifshow.kuaishan.utils.e;
import x80.e2;
import t36.f$a;
import t36.f;
import x80.d2;

public final class i1 implements g	// class@001a52
{
    public final m1 b;
    public final long c;
    public final KSTemplateDetailInfo d;
    public final List e;

    public void i1(m1 p0,long p1,KSTemplateDetailInfo p2,List p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       i1 tb = this.b;
       i1 tc = this.c;
       i1 td = this.d;
       i1 te = this.e;
       Objects.requireNonNull(tb);
       int i = p0.getFirst().intValue();
       if (i >= 100 && p0.getSecond() instanceof o1) {
          i.a((System.currentTimeMillis() - tc));
          e.w("Preparing works for template: "+td.mTemplateId+"completed");
          tb.s0(new e2(p0));
       }else {
          int i1 = 0;
          if (i < te.get(i1).intValue()) {
             i = te.get(i1).intValue();
          }
          te.clear();
          te.add(Integer.valueOf(i));
          tb.s0(new d2(td, te));
       }
       return;
    }
}
