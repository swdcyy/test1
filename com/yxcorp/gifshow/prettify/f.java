package com.yxcorp.gifshow.prettify.f;
import m0d.a;
import com.yxcorp.gifshow.prettify.e;
import com.yxcorp.gifshow.camera.bubble.c;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautyBubbleConfig;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.Objects;
import com.yxcorp.gifshow.camera.bubble.b;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import ra9.c;
import android.view.View;
import lnc.a1;
import l0c.z;
import com.yxcorp.gifshow.bubble.b$c;
import l0c.c0;
import com.yxcorp.gifshow.camera.bubble.b$c;
import l0c.q;
import k07.g;
import l0c.h;
import com.yxcorp.gifshow.camera.bubble.b$d;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.bubble.PostBubbleManager;

public class f extends a	// class@001145
{
    public final c b;
    public final BeautyBubbleConfig c;
    public final e d;

    public void f(e p0,c p1,BeautyBubbleConfig p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onCompleted(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "PrettifyController";
       a.D().w(str, "fetch bubble img complete : "+p0, objArray);
       if (p0 != null) {
          f td = this.d;
          f tb = this.b;
          f tc = this.c;
          Objects.requireNonNull(td);
          if (!PatchProxy.applyVoidThreeRefs(tb, p0, tc, td, e.class, "52")) {
             Object[] objArray1 = new Object[i];
             a.D().w(str, "realShowMedicalBeautyGuideBubble", objArray1);
             b uob = new b(RecordBubbleItem.MEDIA_BEAUTY_GUIDE_BUBBLE).n(td.s);
             uob.s(R.layout.arg_RES_7f0d11a5);
             uob.t((- a1.e(12.00f)));
             uob.y = a1.e(19.00f);
             uob.x(true);
             uob = uob.z(new z(td));
             uob.v(new c0(td));
             uob.o(new q(td));
             uob.w(new h(tc, p0));
             tb.n(uob);
          }
       }
       return;
    }
}
