package com.kwai.live.gzone.follow.fullscreen.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import g57.d;
import com.kwai.live.gzone.follow.fullscreen.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import fq5.b;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import android.widget.TextView;
import android.view.View$OnLayoutChangeListener;
import android.view.View;
import g57.n;
import g57.b;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import g57.c;
import android.animation.AnimatorSet;
import java.lang.Runnable;
import ekd.k1;
import jga.f$a;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.StringBuilder;
import jga.f;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.live.gzone.follow.fullscreen.a;
import android.view.View$OnClickListener;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;

public class b extends PresenterV2	// class@000cfa
{
    public Runnable A;
    public View$OnLayoutChangeListener B;
    public View p;
    public KwaiImageView q;
    public TextView r;
    public View s;
    public View t;
    public b u;
    public LiveStreamFeedWrapper v;
    public n w;
    public float x;
    public boolean y;
    public AnimatorSet z;

    public void b(){
       super();
       this.A = new d(this);
       this.B = new b$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       g.b(this.q, this.u.I(), HeadImageSize.SMALL);
       this.r.setText(R.string.arg_RES_7f102425);
       this.p.addOnLayoutChangeListener(this.B);
       g e = Functions.e;
       this.X7(this.w.b.subscribe(new b(this), e));
       this.X7(this.u.I().observable().subscribe(new c(this), e));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "7")) {
          return;
       }
       b tz = this.z;
       if (tz != null) {
          tz.cancel();
       }
       this.R8();
       this.p.removeOnLayoutChangeListener(this.B);
       k1.m(this.A);
       this.y = false;
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       f$a uoa = new f$a(this.u.I(), this.getActivity().Q2());
       uoa.o(this.getActivity().getUrl()+"#follow");
       uoa.q(false);
       uoa.j(54);
       FollowHelper.b(uoa.b());
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, b.class, "8")) {
          return;
       }
       this.p.setTranslationX(0);
       this.p.setVisibility(8);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a1ef7);
       this.s = m1.f(p0, 0x7f0a1ef5);
       this.t = m1.f(p0, 0x7f0a1ef2);
       this.q = m1.f(p0, 0x7f0a1ef3);
       this.p = m1.f(p0, 0x7f0a1ef4);
       m1.a(p0, new a(this), R.id.live_gzone_follow_fullscreen_button_background);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.u = this.r8("LIVE_BASIC_CONTEXT");
       this.v = this.r8("LIVE_PHOTO");
       this.w = this.q8(n.class);
       return;
    }
}
