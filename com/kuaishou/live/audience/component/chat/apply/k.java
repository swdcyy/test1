package com.kuaishou.live.audience.component.chat.apply.k;
import com.kwai.live.gzone.widget.e;
import android.app.Activity;
import com.kwai.framework.model.user.UserInfo;
import android.view.View$OnClickListener;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.airbnb.lottie.LottieAnimationView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;
import va1.b0;
import android.view.View;
import com.kuaishou.live.audience.component.chat.apply.j;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import px0.y;
import android.widget.TextView;
import d61.c0;

public class k extends e	// class@000a74
{
    public TextView A;
    public TextView B;
    public LottieAnimationView C;
    public final UserInfo x;
    public final UserInfo y;
    public final View$OnClickListener z;
    public static final int D;

    public void k(Activity p0,UserInfo p1,UserInfo p2,View$OnClickListener p3){
       super(p0);
       this.x = p1;
       this.y = p2;
       this.z = p3;
    }
    public void N(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "6")) {
          return;
       }
       super.N(p0);
       k tC = this.C;
       if (tC != null && tC.p()) {
          this.C.f();
       }
       return;
    }
    public int c0(){
       Object obj = PatchProxy.apply(null, this, k.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.e(300.00f);
    }
    public int d0(){
       Object obj = PatchProxy.apply(null, this, k.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (b0.a())? 0x7f0d0aa8: 0x7f0d0aa9;
       return i;
    }
    public void doBindView(View p0){
       k ok = k.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ok, "1")) {
          return;
       }
       p0.setOnClickListener(j.b);
       HeadImageSize aDJUST_MIDDL = HeadImageSize.ADJUST_MIDDLE;
       g.d(m1.f(p0, R.id.live_chat_anchor_avatar), this.x, aDJUST_MIDDL);
       g.d(m1.f(p0, R.id.live_chat_audience_avatar), this.y, aDJUST_MIDDL);
       m1.a(p0, new y(this), R.id.live_chat_cancel_apply_button);
       this.A = m1.f(p0, 0x7f0a1b07);
       this.B = m1.f(p0, 0x7f0a1b06);
       this.C = m1.f(p0, 0x7f0a1b1d);
       if (!PatchProxy.applyVoid(null, this, ok, "7")) {
          this.C.setAnimationFromUrl(c0.a.b("/udata/pkg/kwai-client-image/live_chat/live_chat_apply_wait.json"));
          this.C.s();
       }
       return;
    }
    public int e0(){
       Object obj = PatchProxy.apply(null, this, k.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.e(256.00f);
    }
}
