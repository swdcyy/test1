package com.kuaishou.commercial.search.widget.AdSearchHomeWidgetViewPresenter$initView$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.commercial.search.widget.a;
import java.lang.Object;
import android.view.View;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import xy.c;
import xy.d;
import java.util.Iterator;
import java.util.List;
import nl9.h;

public final class AdSearchHomeWidgetViewPresenter$initView$2 extends Lambda implements l	// class@001575
{
    public final a this$0;

    public void AdSearchHomeWidgetViewPresenter$initView$2(a p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdSearchHomeWidgetViewPresenter$initView$2.class, "1")) {
          return;
       }
       a.p(p0, "it");
       AdSearchHomeWidgetViewPresenter$initView$2 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       a uoa = a.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tthis$0, uoa, "8")) {
          a v = tthis$0.v;
          a.o(v, "mAdSuspendedBallManager");
          int i = v.b();
          int i1 = 1;
          if (i) {
             if (i == i1) {
                tthis$0.X8();
                tthis$0.v.d(2, tthis$0.G);
                if (!PatchProxy.applyVoid(objArray, tthis$0, uoa, "11")) {
                   uoa = tthis$0.D;
                   if (uoa != null) {
                      Iterator iterator = uoa.iterator();
                      while (iterator.hasNext()) {
                         iterator.next().c(tthis$0.z);
                      }
                   }
                }
             }
          }else {
             tthis$0.X8();
             tthis$0.v.d(i1, tthis$0.G);
          }
       }
       return;
    }
}
