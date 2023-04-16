package com.kuaishou.merchant.home2.feed.autoplay.TKLiveAutoPlayView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import xm4.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.view.ViewGroup;
import xm4.a$a;
import i2b.a;
import kotlin.jvm.internal.a;
import com.kuaishou.merchant.home2.dynamic.feed.autoplay.MerchantAutoPlayCardPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import com.yxcorp.gifshow.entity.QPhoto;
import ly3.a;
import com.tkruntime.v8.JsValueRef;

public final class TKLiveAutoPlayView extends FrameLayout	// class@001787
{
    public final MerchantAutoPlayCardPresenter b;
    public HashMap c;

    public void TKLiveAutoPlayView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void TKLiveAutoPlayView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void TKLiveAutoPlayView(Context p0,AttributeSet p1,int p2){
       MerchantAutoPlayCardPresenter merchantAuto;
       a$a a;
       super(p0, p1, p2);
       int i = 0x7f0d0f3e;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyFourRefs(this, Integer.valueOf(i), Boolean.TRUE, Integer.valueOf(0), null, a.class, "5") != PatchProxyResult.class) {
       }else {
          a = a.a;
          merchantAuto = null;
          View a1 = (a != null)? a.a(this.getContext(), this, R.layout.arg_RES_7f0d0f3e, true, 0): merchantAuto;
          if (a1 instanceof View) {
             View view = a1;
          }
          if (merchantAuto == null) {
             a.o(a.l(this, i, true, 0), "KwaiLayoutInflater.infla¡­tachToRoot, dayNightMode\)");
          }
       }
       merchantAuto = new MerchantAutoPlayCardPresenter();
       this.b = merchantAuto;
       merchantAuto.f(this);
       this.setId(R.id.tk_live_play_view);
       return;
    }
    public void TKLiveAutoPlayView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TKLiveAutoPlayView.class, "4")) {
          return;
       }
       TKLiveAutoPlayView tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, MerchantAutoPlayCardPresenter.class, "21")) {
          a uoa = a.a(tb.v, tb.x);
          if (uoa != null) {
             MerchantAutoPlayCardPresenter w = tb.w;
             int i = (w != null)? w.intValue(): -1;
             uoa.b(true, i);
          }
       }
       return;
    }
    public final void setLiveAutoPlayCallback(JsValueRef p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKLiveAutoPlayView.class, "5")) {
          return;
       }
       this.b.H = p0;
       return;
    }
}
