package com.kuaishou.commercial.home.c$a;
import android.view.ViewTreeObserver$OnScrollChangedListener;
import com.kuaishou.commercial.home.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import kz8.c;
import android.widget.ImageView;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverMediaInfo;
import tw.j;
import java.lang.Runnable;
import ekd.k1;

public class c$a implements ViewTreeObserver$OnScrollChangedListener	// class@0014d8
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void onScrollChanged(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "1")) {
          return;
       }
       if (c.a(this.a.q)) {
          c$a ta = this.a;
          c p = ta.p;
          if (p != null) {
             p.getLocationInWindow(ta.A);
             ta = this.a;
             int i = 1;
             if ((float)ta.A[i] - ((float)ta.K - ((float)ta.p.getHeight() * 0x3f000000)) < 0) {
                ta = this.a;
                if (ta.A[i] > 0) {
                   if (ta.v != null) {
                      this.a.v = false;
                      ta = this.a;
                      k1.r(ta.T, j.m(ta.q).coverStart);
                   }
                }
             }
             ta = this.a;
             if ((float)ta.A[i] - ((float)(- ta.p.getHeight()) * 0x3f000000) < 0 && this.a.w != null) {
                this.a.R8();
             }
          }
       }
    label_007e :
       return;
    }
}
