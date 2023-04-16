package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.m$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.m$a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import android.graphics.drawable.Drawable;
import lnc.a1;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.framework.model.user.User;
import wb5.g;
import jp.a;
import wb5.h;
import java.lang.Boolean;
import com.kuaishou.android.model.mix.CoverMeta;
import com.kwai.framework.model.user.UserCoverMeta;
import s0d.f;
import wb5.b;
import s0d.a;
import jd.c;
import dd.d;
import s0d.e;
import com.kuaishou.android.model.feed.PhotoType;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.SubSolution;
import com.yxcorp.image.callercontext.UpBizFt;
import com.yxcorp.image.callercontext.ImageSource;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import ub.b;
import ac.a;
import com.facebook.drawee.view.DraweeView;
import com.facebook.drawee.controller.AbstractDraweeController;
import android.graphics.drawable.ColorDrawable;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.Math;
import java.lang.CharSequence;
import android.widget.TextView;
import android.widget.ImageView;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.l;
import erd.o;
import t45.d;
import brd.z;
import k6a.w;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import yl8.b;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.m$a$b;
import android.view.View$OnClickListener;
import lu7.f;
import rnc.i;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.m$a$c;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.m$a$d;
import android.view.View;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.e;
import k6a.v;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kwai.framework.model.user.UserExtraInfo;
import com.kwai.framework.model.user.RichTextMeta;
import com.kwai.user.base.RichTextMetaExt;
import com.yxcorp.utility.TextUtils;
import tkd.b;
import tkd.d;
import vu5.b;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import y8c.d;
import k6a.u;
import com.kwai.framework.model.user.QCurrentUser;
import brd.y;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.text.TextPaint;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class m$a extends PresenterV2	// class@00177e
{
    public KwaiImageView A;
    public TextView B;
    public ImageView C;
    public final ViewTreeObserver$OnGlobalLayoutListener D;
    public User p;
    public d q;
    public y r;
    public e s;
    public BaseFragment t;
    public KwaiImageView u;
    public TextView v;
    public TextView w;
    public View x;
    public ImageView y;
    public TextView z;

    public void m$a(){
       super();
       this.D = new m$a$a(this);
    }
    public void E8(){
       StringBuilder str;
       m$a tB;
       long l;
       long l1;
       CoverMeta uCoverMeta;
       e[] uoeArray;
       a$a uoa;
       d uod;
       AbstractDraweeController uAbstractDra;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, m$a.class, "3")) {
          return;
       }
       boolean b = false;
       this.P8(b);
       g.l(this.u, this.p, HeadImageSize.MIDDLE, a1.f(R.drawable.arg_RES_7f0819bd));
       m$a tp = this.p;
       if (tp != null && tp.mCoverMeta != null) {
          m$a tA = this.A;
          if (tA != null) {
             str = "9";
             if (!PatchProxy.applyVoidTwoRefsWithListener(tA, tp, this, m$a.class, str)) {
                if (tA != null && tp != null) {
                   User mCoverMeta = tp.mCoverMeta;
                   if (mCoverMeta != null) {
                      a c = a.c;
                      h oh = h.class;
                      if (PatchProxy.isSupport(oh)) {
                         Object[] objArray1 = new Object[]{tA,mCoverMeta,Boolean.FALSE,c,objArray,objArray};
                         if (!PatchProxy.applyVoid(objArray1, objArray, oh, "8")) {
                         }
                      }else {
                      }
                   }
                }
             label_00f4 :
                PatchProxy.onMethodExit(m$a.class, str);
             }
          }
          tB = this.B;
          if (tB != null) {
             UserCoverMeta mVideoCount = this.p.mCoverMeta.mVideoCount;
             if (mVideoCount > null) {
                if (PatchProxy.isSupport2(m$a.class, "4")) {
                   str = PatchProxy.applyOneRefsWithListener(Integer.valueOf(mVideoCount), this, m$a.class, "4");
                   if (str != PatchProxyResult.class) {
                   }else if(mVideoCount <= null){
                      PatchProxy.onMethodExit(m$a.class, "4");
                      str = "";
                   }else {
                      str = "";
                      l = 0x3ff0000000000000;
                      if ((double)(mVideoCount / 0x5f5e100) - l > 0) {
                         l1 = (long)Math.round(((float)mVideoCount / 10000000.00f));
                         str = str+(l1 / 10)+"."+(l1 % 10)+"вк";
                      }else if((double)(mVideoCount / 10000) - l > 0){
                         l1 = (long)Math.round(((float)mVideoCount / 1000.00f));
                         str = str+(l1 / 10)+"."+(l1 % 10)+"Эђ";
                      }else {
                         str = str+mVideoCount;
                      }
                      str = str;
                      PatchProxy.onMethodExit(m$a.class, "4");
                   }
                }else {
                   goto label_011a ;
                }
                tB.setText(str);
                this.B.setVisibility(b);
                tB = this.C;
                if (tB != null) {
                   tB.setVisibility(b);
                }
             }
          }
       }
    label_018e :
       this.S8(this.p);
       this.X7(this.p.observable().distinctUntilChanged(l.b).observeOn(d.a).subscribe(new w(this), Functions.d()));
       tB = this.p;
       if (tB != null) {
          tB.b();
       }
       tB = this.u;
       if (tB != null) {
          tB.setOnClickListener(new m$a$b(this));
       }
       tB = this.v;
       if (tB != null) {
          tB.setText(i.j(f.a(this.p)));
          this.v.setOnClickListener(new m$a$c(this));
       }
       tB = this.x;
       if (tB != null) {
          tB.setOnClickListener(new m$a$d(this));
       }
       tB = this.s;
       if (tB != null) {
          m$a tu = this.u;
          if (tu != null) {
             tB.a(tu);
          }
          tB = this.v;
          if (tB != null) {
             this.s.a(tB);
          }
          tB = this.A;
          if (tB != null) {
             this.s.a(tB);
          }
          this.s.a(this.m8());
       }
       tB = this.A;
       if (tB != null) {
          tB.setOnClickListener(new v(this));
       }
       PatchProxy.onMethodExit(m$a.class, "3");
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, m$a.class, "7")) {
          return;
       }
       m$a tw = this.w;
       if (tw != null) {
          tw.getViewTreeObserver().removeOnGlobalLayoutListener(this.D);
       }
       PatchProxy.onMethodExit(m$a.class, "7");
       return;
    }
    public void P8(boolean p0){
       if (PatchProxy.isSupport2(m$a.class, "6") && PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p0), this, m$a.class, "6")) {
          return;
       }
       m$a tp = this.p;
       User mMainRecoRea = tp.mMainRecoReason;
       if (mMainRecoRea == null) {
          User mExtraInfo = tp.mExtraInfo;
          if (mExtraInfo != null) {
             mMainRecoRea = mExtraInfo.mRecoTextInfo;
          }
       }
       String str = (p0)? RichTextMetaExt.e(mMainRecoRea): RichTextMetaExt.g(mMainRecoRea);
       if (!TextUtils.x(str)) {
          m$a tw = this.w;
          if (tw != null) {
             tw.setVisibility(0);
             this.w.setText(str);
             if (!p0) {
                this.w.getViewTreeObserver().addOnGlobalLayoutListener(this.D);
             }
          }else {
          label_004d :
             m$a tw1 = this.w;
             if (tw1 != null) {
                tw1.setVisibility(8);
             }
          }
       }else {
          goto label_004d ;
       }
       PatchProxy.onMethodExit(m$a.class, "6");
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoidWithListener(null, this, m$a.class, "10")) {
          return;
       }
       m$a tu = this.u;
       if (tu == null || this.p == null) {
          PatchProxy.onMethodExit(m$a.class, "10");
          return;
       }else {
          tu.setTag(R.id.tag_view_refere, Integer.valueOf(187));
          this.u.setTag(R.id.tag_pymk_portal_refer, Integer.valueOf(74));
          this.u.setTag(R.id.tag_pymk_follow_text_refer, this.p.mFollowActionReasonTextId);
          ProfileStartParam profileStart = ProfileStartParam.l(this.p);
          profileStart.r(this.u);
          d.a(-1718536792).Y7(this.getActivity(), profileStart);
          u.c(this.p, this.q.get(), "to_profile", true);
          PatchProxy.onMethodExit(m$a.class, "10");
          return;
       }
    }
    public final void S8(User p0){
       m$a tx;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, m$a.class, "8")) {
          return;
       }
       int i = 0;
       if (!QCurrentUser.ME.isLogined() || !p0.isFollowingOrFollowRequesting()) {
          m$a ty = this.y;
          if (ty != null) {
             ty.setSelected(p0.mVisitorBeFollowed);
             this.y.setVisibility(i);
          }
          ty = this.z;
          if (ty != null) {
             int i1 = (p0.mVisitorBeFollowed != null)? 0x7f10408e: 0x7f100f8f;
             ty.setText(i1);
             this.z.setEnabled(true);
          }
          tx = this.x;
          if (tx != null) {
             tx.setEnabled(true);
          }
       }else {
          tx = this.y;
          if (tx != null) {
             tx.setVisibility(8);
          }
          if (this.x != null) {
             this.z.setText(R.string.arg_RES_7f101034);
             this.z.setEnabled(i);
          }
          tx = this.x;
          if (tx != null) {
             tx.setEnabled(i);
          }
       }
       tx = this.r;
       if (tx != null) {
          tx.onNext(Boolean.TRUE);
       }
       PatchProxy.onMethodExit(m$a.class, "8");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, m$a.class, "2")) {
          return;
       }
       if (p0.getTag().intValue() == 2) {
          this.u = m1.f(p0, 0x7f0a4353);
          TextView textView = m1.f(p0, R.id.user_name);
          this.v = textView;
          textView.getPaint().setFakeBoldText(true);
          this.w = m1.f(p0, 0x7f0a4398);
          this.x = m1.f(p0, 0x7f0a0f4c);
          this.y = m1.f(p0, 0x7f0a0f6e);
          textView = m1.f(p0, R.id.follow_text);
          this.z = textView;
          textView.getPaint().setFakeBoldText(true);
          this.A = m1.f(p0, 0x7f0a4350);
          this.B = m1.f(p0, 0x7f0a4365);
          this.C = m1.f(p0, 0x7f0a4364);
       }
       PatchProxy.onMethodExit(m$a.class, "2");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, m$a.class, "1")) {
          return;
       }
       this.p = this.q8(User.class);
       this.q = this.r8("ADAPTER_POSITION_GETTER");
       this.r = this.r8("FOLLOW_STATUS_CHANGE");
       this.s = this.q8(e.class);
       this.t = this.q8(BaseFragment.class);
       PatchProxy.onMethodExit(m$a.class, "1");
       return;
    }
}
