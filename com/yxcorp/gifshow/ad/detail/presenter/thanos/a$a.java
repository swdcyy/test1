package com.yxcorp.gifshow.ad.detail.presenter.thanos.a$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.view.View;
import i19.k;
import java.util.Map;
import lnc.a1;

public class a$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@0016be
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       this.b.D.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       if (!this.b.W8()) {
          return;
       }
       a$a tb = this.b;
       tb.v.remove(tb.D);
       tb = this.b;
       tb.v.remove(tb.B);
       tb = this.b;
       tb.u.remove(tb.D);
       tb = this.b;
       tb.u.remove(tb.B);
       this.b.x = (float)a1.h();
       tb = this.b;
       tb.P8(0x3f800000, tb.x, tb.y);
       return;
    }
}
