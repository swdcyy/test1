package com.yxcorp.gifshow.aicutv2.r;
import erd.o;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$k0;
import java.lang.Object;
import o69.g1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import tkd.b;
import tkd.d;
import ra0.d;
import java.util.List;
import o69.c;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.yxcorp.gifshow.models.QMedia;
import brd.t;

public final class r implements o	// class@0019b7
{
    public final VideoTemplateProject$k0 b;

    public void r(VideoTemplateProject$k0 p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, r.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          p0 = d.a(0x1bf6ff1d);
          List list = this.b.b.M();
          ArrayList uArrayList = new ArrayList(u.Y(list, 10));
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(iterator.next().path);
          }
          ot = p0.Mm(uArrayList);
       }
       return ot;
    }
}
