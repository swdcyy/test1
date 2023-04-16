package com.kuaishou.merchant.home2.home.titlebar.TitleBarBackgroundPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.home2.home.titlebar.TitleBarBackgroundPresenter$a;
import com.kuaishou.merchant.home2.home.titlebar.TitleBarBackgroundPresenter$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import b04.d;
import com.kuaishou.merchant.home2.skin.f;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.merchant.home2.home.titlebar.TitleBarBackgroundPresenter$onBind$1;
import lz3.a;
import msd.l;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import java.util.Objects;
import com.kuaishou.merchant.home2.basic.model.HomePage;
import jz3.a;
import android.content.Context;
import android.widget.ImageView;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$NavigationStyle;
import com.kuaishou.merchant.feed.widget.MerchantKwaiImageView;
import android.graphics.drawable.Drawable;
import android.view.View;
import ekd.m1;
import androidx.fragment.app.FragmentActivity;

public class TitleBarBackgroundPresenter extends PresenterV2	// class@0017dd
{
    public MerchantKwaiImageView p;
    public View q;
    public final Observer r;
    public d s;
    public f t;
    public MerchantHomeSkin$NavigationStyle u;
    public final Observer v;
    public HomePage w;

    public void TitleBarBackgroundPresenter(){
       super();
       this.r = new TitleBarBackgroundPresenter$a(this);
       this.v = new TitleBarBackgroundPresenter$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, TitleBarBackgroundPresenter.class, "2")) {
          return;
       }
       TitleBarBackgroundPresenter ts = this.s;
       String str = "mHomePageViewModel";
       if (ts == null) {
          a.S(str);
       }
       ts.F0(this.P8(), this.r);
       ts = this.t;
       if (ts != null) {
          f c = ts.c;
          if (c != null) {
             c.observe(this.P8(), this.v);
          }
       }
       ts = this.s;
       if (ts == null) {
          a.S(str);
       }
       ts.w0().observe(this.P8(), new a(new TitleBarBackgroundPresenter$onBind$1(this)));
       return;
    }
    public final GifshowActivity P8(){
       Activity obj = PatchProxy.apply(null, this, TitleBarBackgroundPresenter.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getActivity();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       return obj;
    }
    public final void R8(HomePage p0){
       a a;
       TitleBarBackgroundPresenter titleBarBack = TitleBarBackgroundPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, titleBarBack, "5")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.w = p0;
       TitleBarBackgroundPresenter tp = this.p;
       if (tp == null) {
          a.S("mTitleBgView");
       }
       a uoa = new a(tp.getContext(), p0, this.u);
       if (!PatchProxy.applyVoidOneRefs(uoa, this, titleBarBack, "7")) {
          a = uoa.a;
          if (a != null) {
             titleBarBack = this.p;
             if (titleBarBack == null) {
                a.S("mTitleBgView");
             }
             titleBarBack.L(a);
          }
          TitleBarBackgroundPresenter tq = this.q;
          if (tq == null) {
             a.S("mPullDownTitleBgView");
          }
          tq.setBackground(uoa.b);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TitleBarBackgroundPresenter.class, "3")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3fd8);
       this.q = m1.f(p0, 0x7f0a332a);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, TitleBarBackgroundPresenter.class, "1")) {
          return;
       }
       this.s = d.J0(this.P8());
       this.t = f.p0(this.P8());
       return;
    }
}
