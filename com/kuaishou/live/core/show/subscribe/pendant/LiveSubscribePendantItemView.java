package com.kuaishou.live.core.show.subscribe.pendant.LiveSubscribePendantItemView;
import ml8.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import java.lang.Object;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import yk2.w;
import java.lang.Runnable;
import ekd.k1;
import android.view.View;
import ekd.m1;
import com.kuaishou.live.core.show.subscribe.pendant.LiveSubScribePendantCarouselTextView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.yxcorp.gifshow.image.KwaiImageView;
import yk2.v;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import java.lang.Boolean;
import android.view.ViewGroup;
import java.lang.CharSequence;
import lnc.a1;
import yk2.n;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.subscribe.model.LiveSubscribeSwitchConfig$LiveSubscribeStickerConfig;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import com.kuaishou.live.core.show.subscribe.model.LiveSubscribeSwitchConfig;
import java.lang.reflect.Type;

public class LiveSubscribePendantItemView extends ConstraintLayout implements d	// class@00114b
{
    public TextView B;
    public View C;
    public LinearLayoutCompat D;
    public LiveSubScribePendantCarouselTextView E;
    public KwaiImageView F;
    public KwaiImageView G;
    public LiveSubscribePendantView$b H;
    public LiveSubscribePendantItemView$a I;
    public final Object J;

    public void LiveSubscribePendantItemView(Context p0){
       super(p0);
       this.J = new Object();
    }
    public void LiveSubscribePendantItemView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.J = new Object();
    }
    public void LiveSubscribePendantItemView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.J = new Object();
    }
    public final void L(long p0,long p1){
       if (PatchProxy.isSupport(LiveSubscribePendantItemView.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, LiveSubscribePendantItemView.class, "4")) {
          return;
       }
       k1.s(new w(this, p1), this.J, p0);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribePendantItemView.class, "1")) {
          return;
       }
       this.E = m1.f(p0, 0x7f0a263b);
       this.B = m1.f(p0, 0x7f0a263e);
       this.C = m1.f(p0, 0x7f0a2638);
       this.D = m1.f(p0, 0x7f0a2643);
       this.F = m1.f(p0, 0x7f0a2639);
       this.G = m1.f(p0, 0x7f0a2618);
       this.D.setOrientation(1);
       m1.f(p0, R.id.live_subscribe_pendant_close_view).setOnClickListener(new v(this));
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveSubscribePendantItemView.class, "2")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       return;
    }
    public void setSubscribeBtnIcon(CDNUrl[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribePendantItemView.class, "9")) {
          return;
       }
       int i = 0x7f081489;
       this.G.setPlaceHolderImage(i);
       if (p0 != null && p0.length > 0) {
          a$a uoa = a.d();
          uoa.b(":ks-features:ft-live:live");
          uoa.d(ImageSource.ICON);
          this.G.X(p0, uoa.a());
       }else {
          this.F.y(i, 0, 0);
       }
       return;
    }
    public void setSubscribeButtonStatus(boolean p0){
       if (PatchProxy.isSupport(LiveSubscribePendantItemView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveSubscribePendantItemView.class, "7")) {
          return;
       }
       if (p0) {
          this.D.setVisibility(0);
          this.C.setVisibility(8);
       }else {
          this.D.setVisibility(8);
          this.C.setVisibility(0);
       }
       return;
    }
    public void setSubscribeNumber(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribePendantItemView.class, "6")) {
          return;
       }
       this.B.setText(p0);
       return;
    }
    public void setSubscribePendantText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribePendantItemView.class, "3")) {
          return;
       }
       k1.n(this.J);
       this.E.setText(p0);
       this.E.setTextColor(a1.a(R.color.arg_RES_7f060874));
       Object[] objArray = null;
       p0 = PatchProxy.apply(objArray, objArray, n.class, "1");
       if (p0 != PatchProxyResult.class) {
          objArray = p0;
       }else {
          LiveSubscribeSwitchConfig value = a.t().u("SOURCE_LIVE").getValue("liveReservationConfig", LiveSubscribeSwitchConfig.class, objArray);
          if (value != null) {
             objArray = value.mStickerConfig;
          }
       }
       if (objArray == null) {
          return;
       }else {
          this.L(objArray.mFirstRollTextMs, objArray.mRollTextIntervalMs);
          return;
       }
    }
}
