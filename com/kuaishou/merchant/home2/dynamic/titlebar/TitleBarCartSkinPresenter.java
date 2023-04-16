package com.kuaishou.merchant.home2.dynamic.titlebar.TitleBarCartSkinPresenter;
import androidx.lifecycle.LifecycleObserver;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import yr3.b;
import gy3.d;
import erd.g;
import crd.b;
import com.kuaishou.merchant.home2.dynamic.titlebar.model.CartAtmosphere;
import hy3.c;
import java.util.Objects;
import hy3.b;
import com.kuaishou.merchant.home2.dynamic.titlebar.model.CartBubbleAtmosphere;
import android.widget.TextView;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class TitleBarCartSkinPresenter extends PresenterV2 implements LifecycleObserver	// class@00176f
{
    public BaseFragment p;
    public View q;
    public KwaiImageView r;
    public TextView s;

    public void TitleBarCartSkinPresenter(){
       super();
    }
    public void E8(){
       TitleBarCartSkinPresenter titleBarCart = TitleBarCartSkinPresenter.class;
       if (PatchProxy.applyVoid(null, this, titleBarCart, "3")) {
          return;
       }
       TitleBarCartSkinPresenter tp = this.p;
       if (tp == null) {
          a.S("mFragment");
       }
       if (!PatchProxy.applyVoidOneRefs(tp, this, titleBarCart, "5") && tp instanceof b) {
          this.X7(tp.Lf(new d(this)));
       }
       return;
    }
    public final void P8(CartAtmosphere p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TitleBarCartSkinPresenter.class, "4")) {
          return;
       }
       c c = c.c;
       Objects.requireNonNull(c);
       if (!PatchProxy.applyVoidOneRefs(p0, c, c.class, "1")) {
          c.a = new b(p0.pureNumber);
          c.b = new b(p0.text);
       }
       TitleBarCartSkinPresenter ts = this.s;
       if (ts == null) {
          a.S("mTipView");
       }
       if (ts.getVisibility()) {
          return;
       }else {
          ts = this.s;
          if (ts == null) {
             a.S("mTipView");
          }
          c.a(ts);
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TitleBarCartSkinPresenter.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a394c);
       this.r = m1.f(p0, 0x7f0a394b);
       this.s = m1.f(p0, 0x7f0a3f04);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, TitleBarCartSkinPresenter.class, "1")) {
          return;
       }
       this.p = this.r8("FEED_FRAGMENT");
       return;
    }
}
