package com.kuaishou.live.preview.item.presenter.y;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.live.model.LiveStreamModel;
import com.kuaishou.android.live.model.LiveSimpleCoverReasonTag;
import android.view.ViewGroup;
import com.yxcorp.gifshow.widget.LiveCoverIconView$e;
import com.yxcorp.gifshow.widget.LiveCoverIconView;
import com.yxcorp.gifshow.widget.LiveCoverIconView$f;
import com.kuaishou.android.live.model.LiveSimpleCoverReasonTag$IconInfo;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.android.live.model.LiveSimpleCoverReasonTag$TextInfo;
import d61.k;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.widget.LiveCoverIconView$LayoutStyle;
import ekd.j;
import com.kwai.framework.model.user.User;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.kuaishou.live.preview.item.presenter.x;
import erd.o;
import t45.d;
import brd.z;
import dl3.j0;
import erd.g;
import crd.b;
import jl3.b;
import dl3.k0;
import io.reactivex.internal.functions.Functions;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import com.kuaishou.live.preview.item.presenter.y$a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.View;
import ekd.m1;

public class y extends PresenterV2	// class@000e48
{
    public LiveCoverIconView p;
    public LiveStreamModel q;
    public User r;
    public b s;
    public LiveAudienceParam t;
    public static final int u;
    public static final int v;

    static {
       y.u = a1.a(0x7f060182);
       y.v = a1.a(0x7f060649);
    }
    public void y(){
       super();
    }
    public void E8(){
       boolean b;
       LiveCoverIconView$e obj1;
       LiveSimpleCoverReasonTag obj2;
       y oy = y.class;
       Object[] objArray = null;
       String str = "3";
       if (PatchProxy.applyVoid(objArray, this, oy, str)) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       y obj = PatchProxy.apply(objArray, this, oy, "5");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          obj = this.q;
          if (obj != null) {
             LiveStreamModel mCoverReason = obj.mCoverReasonTag;
             if (mCoverReason != null) {
                int i = 8;
                if (("2").equals(mCoverReason.mTagPattern)) {
                   mCoverReason = this.q.mCoverReasonTag;
                   obj1 = PatchProxy.applyOneRefs(mCoverReason, this, oy, "6");
                   if (obj1 != patchProxyRe) {
                      b = obj1.booleanValue();
                   }else if(this.V8(mCoverReason)){
                      this.p.setVisibility(i);
                      obj1 = this.p.Y();
                      obj1.l(this.S8());
                      obj1.d(mCoverReason.mIconInfo.mIconUrls);
                      obj1.a();
                   }
                }else if(("1").equals(this.q.mCoverReasonTag.mTagPattern)){
                   mCoverReason = this.q.mCoverReasonTag;
                   obj2 = PatchProxy.applyOneRefs(mCoverReason, this, oy, "7");
                   if (obj2 != patchProxyRe) {
                      b = obj2.booleanValue();
                   }else if(this.W8(mCoverReason)){
                      this.p.setVisibility(0);
                      obj1 = this.p.Y();
                      obj1.p(mCoverReason.mTextInfo.mContent);
                      obj1.o(k.c(mCoverReason.mTextInfo.mTextColor, y.u));
                      obj1.c(this.R8(mCoverReason));
                      obj1.q(a1.e(6.00f));
                      obj1.a();
                   }
                }else if(str.equals(this.q.mCoverReasonTag.mTagPattern)){
                   mCoverReason = this.q.mCoverReasonTag;
                   LiveCoverIconView$e obj3 = PatchProxy.applyOneRefs(mCoverReason, this, oy, "8");
                   if (obj3 != patchProxyRe) {
                      b = obj3.booleanValue();
                   }else if(this.W8(mCoverReason) && this.V8(mCoverReason)){
                      this.p.setVisibility(i);
                      obj3 = this.p.Y();
                      obj3.p(mCoverReason.mTextInfo.mContent);
                      obj3.o(k.c(mCoverReason.mTextInfo.mTextColor, y.u));
                      obj3.c(this.R8(mCoverReason));
                      obj3.k(mCoverReason.mIconInfo.mIconUrls);
                      obj3.l(this.S8());
                      obj3.h(a1.e((float)mCoverReason.mIconInfo.mHeightDp));
                      obj3.i(0);
                      obj3.j(0);
                      obj3.q(a1.e(6.00f));
                      obj3.e(LiveCoverIconView$LayoutStyle.SECOND_LEVEL_ICON_LAYOUT);
                      obj2 = PatchProxy.applyOneRefs(mCoverReason, this, oy, "11");
                      if (obj2 != patchProxyRe) {
                         b = obj2.booleanValue();
                      }else {
                         obj2 = mCoverReason.mRightIconInfo;
                         b = (obj2 != null && !j.h(obj2.mIconUrls))? true: false;
                      }
                      if (b) {
                         obj3.m(mCoverReason.mRightIconInfo.mIconUrls);
                         b = a1.e((float)mCoverReason.mIconInfo.mHeightDp);
                         if (b > 0) {
                            obj3.j = b;
                         }
                         obj3.g = 0;
                         obj3.e(LiveCoverIconView$LayoutStyle.ICON_TEXT_ICON_LAYOUT);
                      }
                      obj3.a();
                   }
                }
                b = true;
             }
          }
       label_0188 :
          b = false;
       }
       if (!b) {
          oy = this.r;
          if (oy != null) {
             this.P8(oy);
             this.X7(this.r.observable().distinctUntilChanged(x.b).observeOn(d.a).subscribe(new j0(this)));
          }
       }
       this.X7(this.s.c().distinctUntilChanged().subscribe(new k0(this), Functions.e));
       return;
    }
    public final void P8(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "4")) {
          return;
       }
       int i = 4;
       if (p0 != null && p0.isFollowingOrFollowRequesting()) {
          LiveAudienceParam mLiveSourceT = this.t.mLiveSourceType;
          int i1 = 0;
          y oy = (i == mLiveSourceT || 278 == mLiveSourceT)? 1: null;
          if (!oy) {
             this.p.setVisibility(i1);
             LiveCoverIconView$e uoe = this.p.Y();
             uoe.p(a1.p(R.string.arg_RES_7f104c62));
             uoe.o(y.u);
             b uob = new b();
             uob.g(KwaiRadiusStyles.R4);
             uob.v(y.v);
             uoe.c(uob.a());
             uoe.a();
          label_005e :
             return;
          }
       }
    label_0059 :
       this.p.setVisibility(i);
       goto label_005e ;
    }
    public final Drawable R8(LiveSimpleCoverReasonTag p0){
       int v;
       int i2;
       b obj = PatchProxy.applyOneRefs(p0, this, y.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b();
       obj.g(KwaiRadiusStyles.R4);
       if (j.h(p0.mBackgroundColor)) {
          obj.v(y.v);
       }else {
          LiveSimpleCoverReasonTag mBackgroundC = p0.mBackgroundColor;
          int i = 0;
          int i1 = 1;
          if (mBackgroundC.length == i1) {
             obj.v(k.c(mBackgroundC[i], y.v));
          }else if(mBackgroundC.length == 2){
             v = y.v;
             i2 = k.c(mBackgroundC[i], v);
             obj.l(i2, k.c(p0.mBackgroundColor[i1], v));
             obj.j(p0.mBackgroundGradientAngle);
          }else {
             v = y.v;
             i2 = k.c(mBackgroundC[i], v);
             i = k.c(p0.mBackgroundColor[i1], v);
             obj.m(i2, i, k.c(p0.mBackgroundColor[2], v));
             obj.j(p0.mBackgroundGradientAngle);
          }
       }
       return obj.a();
    }
    public final LiveCoverIconView$f S8(){
       Object obj = PatchProxy.apply(null, this, y.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new y$a(this);
    }
    public final boolean V8(LiveSimpleCoverReasonTag p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, y.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       p0 = p0.mIconInfo;
       boolean b = (p0 != null && !j.h(p0.mIconUrls))? true: false;
       return b;
    }
    public final boolean W8(LiveSimpleCoverReasonTag p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, y.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       p0 = p0.mTextInfo;
       boolean b = (p0 != null && !TextUtils.x(p0.mContent))? true: false;
       return b;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a25a7);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, y.class, "2")) {
          return;
       }
       this.q = this.s8(LiveStreamModel.class);
       this.r = this.s8(User.class);
       this.s = this.r8("LIVE_PLAY_STATE");
       this.t = this.r8("LIVE_AUDIENCE_PARAM");
       return;
    }
}
