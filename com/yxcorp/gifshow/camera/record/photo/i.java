package com.yxcorp.gifshow.camera.record.photo.i;
import oc9.d0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import ekd.m1;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import o56.c;
import o56.a;
import xf6.l;
import com.kwai.framework.abtest.f;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.camera.record.photo.q;
import android.view.View$OnTouchListener;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.camera.record.photo.i$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import hg9.v;
import erd.g;
import crd.b;
import eoc.f;

public class i extends d0	// class@000eb0
{
    public int o;
    public View p;
    public View q;
    public View r;

    public void i(CameraPageType p0,b p1){
       super(p0, p1);
       this.o = Integer.MIN_VALUE;
    }
    public void k(View p0){
       q oq;
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       super.k(p0);
       this.p = m1.f(p0, 0x7f0a3d49);
       this.q = m1.f(p0, 0x7f0a3d4c);
       this.r = m1.f(p0, 0x7f0a0086);
       if (this.q != null) {
          int b = false;
          boolean b1 = true;
          if (!a.a().c() || !l.c("key_take_picture_btn_color", b)) {
             if (f.e("enablePicShootButtonColorAdr") == b1) {
                oq = 1;
             }
             b1 = oq;
          }
          if (b1) {
             ViewGroup$LayoutParams layoutParams = this.q.getLayoutParams();
             if (layoutParams != null) {
                b = a1.d(R.dimen.arg_RES_7f0710a8);
                layoutParams.height = b;
                layoutParams.width = b;
             }
             this.q.setBackground(a1.f(R.drawable.arg_RES_7f0823e5));
             oq = new q();
             oq.c(R.anim.arg_RES_7f010137);
             oq.b(R.anim.arg_RES_7f010136);
             this.p.setOnTouchListener(oq.a(this.q));
          }else {
             oq = new q();
             oq.c(R.anim.arg_RES_7f01012f);
             oq.b(R.anim.arg_RES_7f01012d);
             this.p.setOnTouchListener(oq.a(this.q));
          }
       }
       this.r.getViewTreeObserver().addOnGlobalLayoutListener(new i$a(this));
       d tc = this.c;
       if (tc != CameraPageType.TIE_TIE && tc != CameraPageType.WHATS_UP) {
          this.Y1(f.a(PanelShowEvent.class, new v(this)));
       }
       return;
    }
}
