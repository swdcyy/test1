package com.yxcorp.gifshow.activity.share.presenter.c1$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.activity.share.presenter.c1;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.activity.share.presenter.c1$e;
import com.kuaishou.android.model.mix.Location;
import xw8.p0;
import android.app.Activity;
import com.yxcorp.utility.n;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;

public class c1$a extends m	// class@0013c9
{
    public final c1 c;

    public void c1$a(c1 p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       c1$e a;
       if (PatchProxy.applyVoidOneRefs(p0, this, c1$a.class, "1")) {
          return;
       }
       c1$a tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, c1.class, "19")) {
          c1 g = tc.G;
          int i = 0;
          if (g != null) {
             a = g.a;
             if (a != null) {
                tc.V8(a, g.b, true);
                g = tc.G;
                tc.Z8(g.a, i, g.b);
                if (tc.x.i()) {
                   n.C(tc.w);
                   tc.x.k(i);
                }
             }
          }
          Object[] objArray = new Object[i];
          a.b().t("ShareLocationPresenter", "clearLocationTag locationWrapper: "+tc.G, objArray);
       }
       return;
    }
}
