package com.yxcorp.gifshow.featured.detail.featured.presenter.k$d;
import jta.a;
import com.yxcorp.gifshow.featured.detail.featured.presenter.k;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import com.kwai.library.widget.popup.common.c;

public class k$d extends a	// class@000f7d
{
    public final k a;

    public void k$d(k p0){
       this.a = p0;
       super();
    }
    public void c(float p0){
       if (PatchProxy.isSupport(k$d.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, k$d.class, "1")) {
          return;
       }
       k v = this.a.v;
       if (v != null) {
          v.o();
       }
       return;
    }
}
