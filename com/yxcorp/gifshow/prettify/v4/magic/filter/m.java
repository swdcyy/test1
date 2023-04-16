package com.yxcorp.gifshow.prettify.v4.magic.filter.m;
import com.yxcorp.download.k;
import java.util.Map;
import java.lang.String;
import j16.b;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import java.util.List;
import t16.b;
import com.yxcorp.download.DownloadTask;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.util.Collection;
import java.util.Iterator;
import com.yxcorp.gifshow.prettify.v4.magic.filter.n;
import o1c.x;
import java.lang.Runnable;
import t45.c;
import t16.f;
import xyb.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Throwable;
import java.lang.Long;
import java.lang.Math;

public class m extends k	// class@0011c8
{
    public final Map c;
    public final String d;
    public final b e;
    public final FilterConfig f;
    public final int g;
    public final List h;
    public final b i;

    public void m(Map p0,String p1,b p2,FilterConfig p3,int p4,List p5,b p6){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       this.h = p5;
       this.i = p6;
       super();
    }
    public void c(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "2")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       float f = 0x3f800000;
       this.c.put(this.d, Float.valueOf(f));
       Iterator iterator = this.c.values().iterator();
       x ox = null;
       int i = 0;
       while (iterator.hasNext()) {
          if (!iterator.next().floatValue() - f) {
             i = i + 1;
          }
       }
       if (i == this.g) {
          m te = this.e;
          if (te != null) {
             te.a(this.f.mFilterId, f);
          }
          te = this.h;
          m tf = this.f;
          m te1 = this.e;
          m ti = this.i;
          if (!PatchProxy.applyVoidFourRefs(te, tf, te1, ti, null, n.class, "19")) {
             if (tf.mSourceType == 1) {
                c.a(new x(tf, te1, ti, te));
             }else if(te1 != null){
                te1.onComplete(tf.mFilterId);
             }
             f.c(ti, "downloadSuccess");
             Object[] objArray = new Object[ox];
             a.D().w("FilterDownloadHelper", "handleResComplete "+te, objArray);
          }
       }
       return;
    }
    public void e(DownloadTask p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m.class, "3")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       n.k(this.f, this.e, this.i);
       return;
    }
    public void k(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, m.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       float f = 0;
       this.c.put(this.d, Float.valueOf((((float)p1 * 0x3f800000) / (float)p2)));
       Iterator iterator = this.c.values().iterator();
       while (iterator.hasNext()) {
          f = f + iterator.next().floatValue();
       }
       m te = this.e;
       if (te != null) {
          te.a(this.f.mFilterId, Math.min((f / (float)this.g), 0x3f7d70a4));
       }
       return;
    }
    public void o(DownloadTask p0){
    }
}
