package com.yxcorp.gifshow.detail.player.panel.elements.CollectDislikeElementView$bind$1;
import com.yxcorp.gifshow.widget.m;
import k3a.l;
import k3a.j;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.player.panel.elements.CollectDislikeElementView$bind$1$doClick$1;
import msd.p;
import qrd.l1;

public final class CollectDislikeElementView$bind$1 extends m	// class@001629
{
    public final l c;
    public final j d;

    public void CollectDislikeElementView$bind$1(l p0,j p1,boolean p2,long p3){
       this.c = p0;
       this.d = p1;
       super(p2, p3);
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CollectDislikeElementView$bind$1.class, "1")) {
          return;
       }
       a.p(p0, "view");
       j f = this.d.f;
       if (f != null) {
          f.invoke(p0, new CollectDislikeElementView$bind$1$doClick$1(this.c));
       }
       return;
    }
}
