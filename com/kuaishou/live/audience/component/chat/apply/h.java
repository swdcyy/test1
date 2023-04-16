package com.kuaishou.live.audience.component.chat.apply.h;
import com.kwai.live.gzone.widget.e;
import android.app.Activity;
import com.kwai.framework.model.user.UserInfo;
import java.lang.String;
import com.kuaishou.live.audience.component.chat.apply.h$a;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.airbnb.lottie.LottieAnimationView;
import android.view.View;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import px0.v;
import android.view.View$OnClickListener;
import px0.u;
import com.kuaishou.live.core.basic.widget.LiveKidLottieAnimationView;
import com.yxcorp.gifshow.widget.cdn.KwaiLottieAnimationView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.a1;
import android.widget.TextView;

public class h extends e	// class@000a70
{
    public LiveKidLottieAnimationView A;
    public SelectShapeTextView B;
    public final String C;
    public final UserInfo x;
    public final UserInfo y;
    public final h$a z;

    public void h(Activity p0,UserInfo p1,UserInfo p2,String p3,h$a p4){
       super(p0);
       this.x = p1;
       this.y = p2;
       this.z = p4;
       this.C = p3;
    }
    public void N(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "3")) {
          return;
       }
       super.N(p0);
       h tA = this.A;
       if (tA != null && tA.p()) {
          this.A.f();
       }
       return;
    }
    public int d0(){
       return 0x7f0d0a04;
    }
    public void doBindView(View p0){
       h oh = h.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oh, "1")) {
          return;
       }
       this.B = p0.findViewById(0x7f0a1b28);
       this.l0(this.C);
       HeadImageSize aDJUST_MIDDL = HeadImageSize.ADJUST_MIDDLE;
       g.d(m1.f(p0, R.id.live_chat_wait_popup_anchor_avatar), this.x, aDJUST_MIDDL);
       g.d(m1.f(p0, R.id.live_chat_wait_popup_audience_avatar), this.y, aDJUST_MIDDL);
       m1.a(p0, new v(this), R.id.live_chat_wait_popup_cancel_apply_button);
       m1.a(p0, new u(this), R.id.live_chat_wait_popup_edit_apply_reason_button_container);
       this.A = m1.f(p0, 0x7f0a1b2a);
       if (!PatchProxy.applyVoid(null, this, oh, "4")) {
          this.A.D(R.string.arg_RES_7f102603);
          this.A.s();
       }
       return;
    }
    public void l0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       this.B.setText(a1.p(R.string.arg_RES_7f1027af));
       return;
    }
}
