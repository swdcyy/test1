package com.yxcorp.gifshow.activity.share.presenter.w2$f;
import a2.n0;
import com.yxcorp.gifshow.activity.share.presenter.w2;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.RelativeLayout;
import uw8.b;
import java.util.Map;
import t36.f;
import com.yxcorp.gifshow.activity.share.presenter.y2;
import t36.f$a;
import com.yxcorp.gifshow.activity.share.presenter.x2;

public class w2$f implements n0	// class@001447
{
    public final float a;
    public final w2 b;

    public void w2$f(w2 p0,float p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w2$f.class, "2")) {
          return;
       }
       w2$f tb = this.b;
       if (tb.S != null) {
          tb.x.setAlpha(this.a);
       }else {
          tb.x.setVisibility(8);
       }
       return;
    }
    public void b(View p0){
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, w2$f.class, "1")) {
          return;
       }
       w2$f tb = this.b;
       if (tb.S != null) {
          f.p0(tb.K, uob).s0(y2.a);
       }else {
          f.p0(tb.K, uob).s0(x2.a);
       }
       return;
    }
    public void c(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w2$f.class, "3")) {
          return;
       }
       w2$f tb = this.b;
       if (tb.S != null) {
          tb.x.setAlpha(this.a);
       }else {
          tb.x.setVisibility(8);
       }
       return;
    }
}
