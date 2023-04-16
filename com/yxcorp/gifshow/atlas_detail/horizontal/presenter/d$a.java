package com.yxcorp.gifshow.atlas_detail.horizontal.presenter.d$a;
import d6a.a;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j99.r;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import com.yxcorp.gifshow.log.widget.CommonLogViewPager;
import java.lang.Runnable;
import ekd.k1;
import android.util.SparseIntArray;

public class d$a extends a	// class@001bc2
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void B0(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "1")) {
          return;
       }
       d v = this.b.v;
       int i = 1;
       if (v != null) {
          PhotoDetailLogger.reportAtlas(i, (long)v.j(), (long)this.b.z);
       }
       d$a tb = this.b;
       tb.C = i;
       v = tb.p;
       if (v != null) {
          v.setCurrentItem(0);
       }
       k1.m(this.b.B);
       return;
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "3")) {
          return;
       }
       d$a tb = this.b;
       d v = tb.v;
       if (v != null) {
          d$a tb1 = this.b;
          tb.w.logAtlasCnt(v.j(), tb1.z, tb1.x.size());
       }
       return;
    }
    public void k1(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "2")) {
          return;
       }
       this.b.C = false;
       return;
    }
}
