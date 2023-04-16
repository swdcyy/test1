package com.yxcorp.gifshow.relation.explore.presenter.y;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import hac.m1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.RecoUser;
import ija.t;
import java.util.List;
import ok.h;
import com.google.common.collect.Lists;
import com.yxcorp.gifshow.entity.QPhoto;
import t45.d;
import brd.z;
import brd.t;
import com.yxcorp.gifshow.relation.explore.presenter.x;
import erd.g;
import crd.b;
import px6.b;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKitView;
import nx6.a;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Integer;
import com.facebook.drawee.view.DraweeView;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.CoverMeta;
import kp.r1;
import jp.a;
import lnc.a1;
import ub.b;
import jd.c;
import wb5.g;
import fac.c;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.video.wayne.player.main.IPlayerListener;
import android.view.View;
import gi5.d;
import wx6.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import io.reactivex.subjects.PublishSubject;
import y8c.g;
import y8c.d;

public class y extends PresenterV2	// class@00186a
{
    public KwaiPlayerKitView p;
    public IWaynePlayer q;
    public boolean r;
    public BaseFragment s;
    public g t;
    public PublishSubject u;
    public RecoUser v;
    public QPhoto w;
    public c x;
    public d y;
    public final IMediaPlayer$OnPreparedListener z;

    public void y(){
       super();
       this.z = new m1(this);
    }
    public void E8(){
       int i;
       int i1;
       y oy = y.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oy, "3")) {
          return;
       }
       this.w = Lists.h(this.v.mFeedList, t.b).get(0);
       if (!PatchProxy.applyVoid(objArray, this, oy, "6")) {
          this.X7(this.u.observeOn(d.a).subscribe(new x(this)));
          if (this.w != null) {
             a uoa = this.p.getPlayerKitContext().e(a.class);
             if (uoa != null) {
                KwaiImageView cover = uoa.getCover();
                y tw = this.w;
                int color = tw.getColor();
                if (!PatchProxy.isSupport(oy) || !PatchProxy.applyVoidThreeRefs(cover, tw, Integer.valueOf(color), this, y.class, "10")) {
                   cover.setAspectRatio(tw.getDetailDisplayAspectRatio());
                   cover.setPlaceHolderImage(new ColorDrawable(color));
                   a$a uoa1 = a.d();
                   uoa1.b(":ks-features:ft-social:relation");
                   uoa1.d(ImageSource.DETAIL_COVER_IMAGE);
                   a uoa2 = uoa1.a();
                   if (r1.D0(tw.mEntity) != null) {
                      g.m(cover, tw.mEntity, a.b, null, null, uoa2, a1.a(R.color.arg_RES_7f061ed9));
                   }
                }
             }
             float f = ((float)this.w.getWidth() * 0x3f800000) / (float)this.w.getHeight();
             if (f - 0x3f400000 > 0) {
                i = this.x.c();
                i1 = (int)((float)i * f);
             }else {
                i = this.x.g();
                int i2 = i;
                i = (int)((float)i / f);
                i1 = i2;
             }
             ViewGroup$LayoutParams layoutParams = this.p.getLayoutParams();
             layoutParams.width = i1;
             layoutParams.height = i;
             this.p.setLayoutParams(layoutParams);
          }
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, y.class, "5")) {
          return;
       }
       y tp = this.p;
       if (tp != null) {
          tp.release();
          this.q = null;
          this.p = null;
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, y.class, "4")) {
          return;
       }
       this.P8();
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, y.class, "8")) {
          return;
       }
       this.r = false;
       y tq = this.q;
       if (tq != null) {
          tq.removeOnPreparedListener(this.z);
          this.q = null;
       }
       tq = this.p;
       if (tq != null) {
          tq.reset();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "2")) {
          return;
       }
       KwaiPlayerKitView kwaiPlayerKi = p0.findViewById(R.id.video_frame);
       this.p = kwaiPlayerKi;
       kwaiPlayerKi.c();
       this.p.setSessionKeyGenerator(new d());
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, y.class, "1")) {
          return;
       }
       this.v = this.q8(RecoUser.class);
       this.x = this.q8(c.class);
       this.s = this.r8("FRAGMENT");
       this.u = this.r8("PYMK_ACCESS_IDScard_play");
       this.t = this.r8("ADAPTER");
       this.y = this.r8("ADAPTER_POSITION_GETTER");
       return;
    }
}
