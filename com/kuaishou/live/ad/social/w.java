package com.kuaishou.live.ad.social.w;
import com.kuaishou.live.bottombar.component.widget.d;
import com.kuaishou.live.ad.social.y;
import android.content.Context;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import zl0.m1;
import android.view.View$OnClickListener;
import z61.b;
import com.kuaishou.live.ad.social.v;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import android.graphics.drawable.Drawable;
import lnc.a1;

public class w extends d	// class@000a27
{
    public y k;

    public void w(){
       super();
       this.k = new y();
    }
    public View C(Context p0,ViewGroup p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, w.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       View view = a.d(p0, R.layout.arg_RES_7f0d0ad1, p1, false);
       view.setOnClickListener(new m1(this));
       return view;
    }
    public void D(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "2")) {
          return;
       }
       this.k.a(p0);
       return;
    }
    public void F(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "4")) {
          return;
       }
       if (p0 instanceof v) {
          if (p0.mIsVisible.booleanValue() && !this.k.b()) {
             this.k.d();
          }else {
             this.k.e();
          }
       }
       return;
    }
    public void q(int p0){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ow, "3")) {
          return;
       }
       ow = this.k;
       Objects.requireNonNull(ow);
       y oy = y.class;
       if (!PatchProxy.isSupport(oy) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), ow, oy, "3")) {
          ow.a.setBackground(a1.f(p0));
       }
       return;
    }
}
