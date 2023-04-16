package com.yxcorp.gifshow.activity.share.presenter.w2$l;
import hkd.d;
import com.yxcorp.gifshow.activity.share.presenter.w2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.LinearLayout;
import java.lang.Math;
import lnc.a1;
import android.os.Handler;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Runnable;
import java.util.Objects;
import android.view.View;

public class w2$l extends d	// class@00144d
{
    public final w2 b;

    public void w2$l(w2 p0){
       this.b = p0;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, w2$l.class, "1")) {
          return;
       }
       w2$l tb = this.b;
       if (tb.M != null) {
          w2 v = tb.V;
          if (v != null && tb.R != null) {
             if ((float)Math.abs((v - tb.t.getHeight())) - Math.max(((float)this.b.R * 0.10f), (float)a1.e(20.00f)) > 0) {
                tb = this.b;
                tb.V = tb.t.getHeight();
                this.b.M.V2().postDelayed(this.b.h1, 50);
             }else {
                tb = this.b;
                Objects.requireNonNull(tb);
                if (!PatchProxy.applyVoid(objArray, tb, w2.class, "11")) {
                   if (tb.A.getVisibility()) {
                      tb.c9();
                   }
                   tb.X = false;
                }
             }
          }
       }
       return;
    }
}
