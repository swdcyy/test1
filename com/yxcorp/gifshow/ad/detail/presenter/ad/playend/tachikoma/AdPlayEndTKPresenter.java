package com.yxcorp.gifshow.ad.detail.presenter.ad.playend.tachikoma.AdPlayEndTKPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.tachikoma.AdPlayEndTKPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.ad.tachikoma.a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.HashMap;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.tachikoma.AdPlayEndTKPresenter$b;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import mxb.c;
import b09.e;
import q09.a;
import q09.b;
import yx.j0;
import x49.l;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo;
import x49.l$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateData;
import android.view.View;
import ekd.m1;
import android.view.ViewGroup;
import com.yxcorp.gifshow.ad.tachikoma.view.AdPlayEndTKBaseView;
import android.content.Context;
import android.util.AttributeSet;
import b09.c;
import b09.d;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.tachikoma.AdPlayEndTKPresenter$c;
import im8.f;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import b09.b;
import g59.u;
import erd.g;
import crd.b;
import java.util.List;
import com.yxcorp.gifshow.ad.tachikoma.bridge.core.TkBridgeGroup;
import a59.f;
import android.app.Activity;
import a59.j;
import a09.c;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.tachikoma.AdPlayEndTKPresenter$initBridgeContext$1;
import mxb.u;
import yy6.c;
import msd.l;
import a59.k;
import msd.r;
import java.lang.Integer;
import java.util.Map;
import msd.a;
import gr.c;
import com.kwai.framework.player.core.b;
import io.reactivex.subjects.PublishSubject;
import c09.f;
import com.yxcorp.gifshow.ad.report.monitor.DynamicMonitorFactory;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.tachikoma.AdPlayEndTKPresenter$onBind$2;
import com.kwai.framework.model.feed.BaseFeed;
import cm9.a;
import java.lang.Boolean;
import android.view.ViewParent;
import com.kwai.robust.PatchProxyResult;
import n49.s;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import n49.o;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public abstract class AdPlayEndTKPresenter extends PresenterV2	// class@0015f0
{
    public c A;
    public f B;
    public f C;
    public List D;
    public b E;
    public AdPlayEndTKBaseView F;
    public PhotoAdvertisement$TkTemplateInfo G;
    public PhotoAdvertisement$TkTemplateData H;
    public final a I;
    public a J;
    public f K;
    public f L;
    public AtomicBoolean M;
    public HashMap N;
    public a O;
    public final AdPlayEndTKPresenter$b P;
    public c p;
    public QPhoto q;
    public PhotoDetailParam r;
    public o s;
    public f t;
    public PublishSubject u;
    public PublishSubject v;
    public f w;
    public f x;
    public f y;
    public BaseFragment z;
    public static final AdPlayEndTKPresenter$a Q;

    static {
       AdPlayEndTKPresenter.Q = new AdPlayEndTKPresenter$a(null);
    }
    public void AdPlayEndTKPresenter(){
       super();
       this.I = new a();
       this.M = new AtomicBoolean(false);
       this.N = new HashMap(8);
       this.P = new AdPlayEndTKPresenter$b(this);
    }
    public static final QPhoto P8(AdPlayEndTKPresenter p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("mPhoto");
       }
       return p0;
    }
    public void E8(){
       String str1;
       l$a a;
       DynamicMonitorFactory c;
       AdPlayEndTKPresenter k;
       AdPlayEndTKPresenter g;
       PhotoAdvertisement$TkTemplateInfo tkTemplateIn = this;
       AdPlayEndTKPresenter uAdPlayEndTK = AdPlayEndTKPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tkTemplateIn, uAdPlayEndTK, "2")) {
          return;
       }
       AdPlayEndTKPresenter r = tkTemplateIn.r;
       String str = "mPhotoDetailParam";
       if (r == null) {
          a.S(str);
       }
       AdPlayEndTKPresenter uAdPlayEndTK1 = null;
       if (r.enableSlidePlay()) {
          r = tkTemplateIn.q;
          if (r == null) {
             a.S("mPhoto");
          }
          if (c.W(k.B(r))) {
             str1 = 1;
          label_0034 :
             String str2 = "TachikomaPlayEnd";
             if (str1) {
                if (!PatchProxy.applyVoid(objArray, tkTemplateIn, uAdPlayEndTK, "4")) {
                   r = tkTemplateIn.E;
                   if (r != null) {
                      r.c(new e(tkTemplateIn));
                   }
                }
             }else if(!this.S8()){
                Object[] objArray2 = new Object[uAdPlayEndTK1];
                j0.f(str2, "onBind\(\) can\'t continue ", objArray2);
                return;
             }
             r = tkTemplateIn.q;
             if (r == null) {
                a.S("mPhoto");
             }
             str1 = c.C(k.B(r));
             a = l.a;
             AdPlayEndTKPresenter q = tkTemplateIn.q;
             if (q == null) {
                a.S("mPhoto");
             }
             PhotoAdvertisement photoAdverti = k.B(q);
             a.m(photoAdverti);
             String str3 = "CommercialFeedExt.getPhotoAd\(mPhoto\)!!";
             a.o(photoAdverti, str3);
             tkTemplateIn.G = a.a(str1, photoAdverti);
             q = tkTemplateIn.q;
             if (q == null) {
                a.S("mPhoto");
             }
             photoAdverti = k.B(q);
             a.m(photoAdverti);
             a.o(photoAdverti, str3);
             tkTemplateIn.H = a.b(str1, photoAdverti);
             String str4 = 0x7f0a0167;
             if (!PatchProxy.applyVoid(objArray, tkTemplateIn, uAdPlayEndTK, "8")) {
                View view = m1.f(this.m8(), this.Z8());
                if (!view instanceof ViewGroup) {
                   view = objArray;
                }
                if (view != null) {
                   Context context = view.getContext();
                   a.o(context, "it.context");
                   AdPlayEndTKBaseView uAdPlayEndTK2 = v15;
                   AdPlayEndTKBaseView uAdPlayEndTK3 = v15;
                   uAdPlayEndTK2 = new AdPlayEndTKBaseView(context, null, 0, 6, 0);
                   tkTemplateIn.F = uAdPlayEndTK3;
                   AdPlayEndTKPresenter r2 = tkTemplateIn.r;
                   if (r2 == null) {
                      a.S(str);
                   }
                   if (!r2.isThanos() || (tkTemplateIn.J == null && !PatchProxy.applyVoid(objArray, tkTemplateIn, uAdPlayEndTK, "9"))) {
                      tkTemplateIn.J = new c(tkTemplateIn);
                   }
                label_00f9 :
                   r2 = tkTemplateIn.F;
                   if (r2 != null) {
                      r2.setOnClickListener(new d(tkTemplateIn));
                   }
                   ViewGroup$LayoutParams layoutParams = new ViewGroup$LayoutParams(-1, -1);
                   FrameLayout uFrameLayout = new FrameLayout(view.getContext());
                   uFrameLayout.setId(R.id.ad_tk_play_end_mask);
                   uFrameLayout.setBackgroundColor(a1.a(R.color.arg_RES_7f061c16));
                   g = tkTemplateIn.F;
                   if (g != null) {
                      g.addView(uFrameLayout, layoutParams);
                   }
                   uFrameLayout = new FrameLayout(view.getContext());
                   uFrameLayout.setId(str4);
                   g = tkTemplateIn.F;
                   if (g != null) {
                      g.addView(uFrameLayout, layoutParams);
                   }
                   view.addView(tkTemplateIn.F, layoutParams);
                   r = tkTemplateIn.F;
                   if (r != null) {
                      r.a();
                   }
                }
             }
          label_014a :
             r = tkTemplateIn.C;
             if (r == null) {
                a.S("mController");
             }
             r.set(new AdPlayEndTKPresenter$c(tkTemplateIn));
             if (!PatchProxy.applyVoid(objArray, tkTemplateIn, uAdPlayEndTK, "6")) {
                r = tkTemplateIn.z;
                if (r == null) {
                   a.S("mFragment");
                }
                tkTemplateIn.X7(r.m().subscribe(new b(tkTemplateIn), u.a));
             }
             r = tkTemplateIn.D;
             if (r == null) {
                a.S("mAttachListeners");
             }
             r.add(tkTemplateIn.P);
             if (!PatchProxy.applyVoid(objArray, tkTemplateIn, uAdPlayEndTK, "19")) {
                r = tkTemplateIn.L;
                if (r != null) {
                   r.g();
                }
                if (!PatchProxy.applyVoid(objArray, tkTemplateIn, uAdPlayEndTK, "21")) {
                   Activity activity = this.getActivity();
                   q = tkTemplateIn.q;
                   if (q == null) {
                      a.S("mPhoto");
                   }
                   g = tkTemplateIn.G;
                   AdPlayEndTKPresenter s = tkTemplateIn.s;
                   if (s == null) {
                      a.S("mPhotoAdActionBarClickProcessor");
                   }
                   AdPlayEndTKPresenter h = tkTemplateIn.H;
                   AdPlayEndTKPresenter r1 = tkTemplateIn.r;
                   if (r1 == null) {
                      a.S(str);
                   }
                   k = tkTemplateIn.A;
                   if (k == null) {
                      a.S("mStateLogger");
                   }
                   AtomicBoolean uAtomicBoole = null;
                   AdPlayEndTKPresenter m = tkTemplateIn.M;
                   uAdPlayEndTK1 = tkTemplateIn.t;
                   if (uAdPlayEndTK1 == null) {
                      a.S("mClickListener");
                   }
                   Object obj = uAdPlayEndTK1.get();
                   uAdPlayEndTK1 = tkTemplateIn.B;
                   if (uAdPlayEndTK1 == null) {
                      a.S("mAvatarClickHandler");
                   }
                   AdPlayEndTKPresenter$initBridgeContext$1 oinitBridgeC = uAdPlayEndTK1;
                   AdPlayEndTKPresenter$initBridgeContext$1 oinitBridgeC1 = new AdPlayEndTKPresenter$initBridgeContext$1(tkTemplateIn);
                   f uof = new f(activity, q, g, s, h, r1, k, null, null, new j(uAtomicBoole, m, obj, uAdPlayEndTK1.get(), 1, null), null, null, null, null, null, oinitBridgeC, tkTemplateIn.p, null, null, 0x67d80, null);
                   tkTemplateIn.K = r;
                }
                k = tkTemplateIn.K;
                a.m(k);
                tkTemplateIn.L = new f(k);
             }
             if (!PatchProxy.applyVoid(objArray, tkTemplateIn, uAdPlayEndTK, "18")) {
                uAdPlayEndTK = tkTemplateIn.I;
                r = tkTemplateIn.q;
                if (r == null) {
                   a.S("mPhoto");
                }
                uAdPlayEndTK.o(r);
                Object[] objArray1 = new Object[0];
                j0.f(str2, String.valueOf(tkTemplateIn.G), objArray1);
                uAdPlayEndTK = tkTemplateIn.I;
                r = tkTemplateIn.F;
                if (r != null) {
                   objArray = r.findViewById(R.id.ad_tk_play_end_container);
                }
                uAdPlayEndTK.a(objArray, tkTemplateIn.L, true);
             }
             c = DynamicMonitorFactory.c;
             uAdPlayEndTK = tkTemplateIn.q;
             if (uAdPlayEndTK == null) {
                a.S("mPhoto");
             }
             QPhoto mEntity = uAdPlayEndTK.mEntity;
             a.o(mEntity, "mPhoto.mEntity");
             uAdPlayEndTK = tkTemplateIn.z;
             if (uAdPlayEndTK == null) {
                a.S("mFragment");
             }
             tkTemplateIn.O = c.F("ad_detail_page", "ad_detail_page_tk_play_end", mEntity, uAdPlayEndTK.m(), new AdPlayEndTKPresenter$onBind$2(tkTemplateIn));
             return;
          }
       }
       str1 = null;
       goto label_0034 ;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, AdPlayEndTKPresenter.class, "10")) {
          return;
       }
       AdPlayEndTKPresenter tw = this.w;
       if (tw == null) {
          a.S("mIsPlayEndScreenPrepare");
       }
       tw.set(Boolean.FALSE);
       tw = this.F;
       if (tw != null) {
          ViewParent parent = tw.getParent();
          if (parent != null) {
             this.W8();
             if (!parent instanceof ViewGroup) {
                parent = null;
             }
             if (parent != null) {
                parent.removeView(this.F);
             }
          }
       }
       tw = this.C;
       if (tw == null) {
          a.S("mController");
       }
       tw.set(null);
       this.I.destroy();
       this.Y8();
       return;
    }
    public final boolean R8(){
       boolean b;
       AdPlayEndTKPresenter obj = PatchProxy.apply(null, this, AdPlayEndTKPresenter.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.X8()) {
          obj = this.y;
          if (obj == null) {
             a.S("mCanShowPlayEndRef");
          }
          Object obj1 = obj.get();
          a.o(obj1, "mCanShowPlayEndRef.get\(\)");
          if (obj1.booleanValue()) {
             b = true;
          label_0037 :
             return b;
          }
       }
       b = false;
       goto label_0037 ;
    }
    public final boolean S8(){
       boolean b1;
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AdPlayEndTKPresenter uAdPlayEndTK = AdPlayEndTKPresenter.class;
       Object[] objArray = null;
       AdPlayEndTKPresenter obj = PatchProxy.apply(objArray, this, uAdPlayEndTK, "5");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(objArray, this, uAdPlayEndTK, "7");
       String str = "mPhoto";
       boolean b = true;
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else {
          obj = this.q;
          if (obj == null) {
             a.S(str);
          }
          if (s.I(obj) && this.getActivity() != null) {
             b1 = true;
          }else {
             b1 = false;
          }
       }
       if (b1) {
          PhotoAdvertisement obj1 = PatchProxy.apply(objArray, this, uAdPlayEndTK, "17");
          if (obj1 != patchProxyRe) {
             b2 = obj1.booleanValue();
          }else {
             uAdPlayEndTK = this.q;
             if (uAdPlayEndTK == null) {
                a.S(str);
             }
             obj1 = k.B(uAdPlayEndTK);
             PhotoAdvertisement$TkTemplateData obj2 = PatchProxy.applyOneRefs(obj1, objArray, s.class, "33");
             if (obj2 != patchProxyRe) {
                b2 = obj2.booleanValue();
             }else if(obj1 == null || obj1.getAdData() == null){
                String str1 = c.C(obj1);
                if (!TextUtils.isEmpty(str1)) {
                   obj2 = l.b(str1, obj1);
                   PhotoAdvertisement$TkTemplateInfo tkTemplateIn = l.a(str1, obj1);
                   if (s.w() && (obj2 != null && s.C(tkTemplateIn))) {
                      b2 = true;
                   }
                }
             }
             b2 = false;
             if (!b2) {
                Object[] objArray1 = new Object[0];
                j0.f("TachikomaPlayEnd", "canPrepareTemplate\(\) isTachikomaPlayEndInfoValid false", objArray1);
                b2 = false;
             }else {
                b2 = true;
             }
          }
          if (b2) {
          label_00a9 :
             return b;
          }
       }
       b = false;
       goto label_00a9 ;
    }
    public final void V8(int p0){
       AdPlayEndTKPresenter uAdPlayEndTK = AdPlayEndTKPresenter.class;
       if (PatchProxy.isSupport(uAdPlayEndTK) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAdPlayEndTK, "23")) {
          return;
       }
       this.M.set(false);
       uAdPlayEndTK = this.t;
       if (uAdPlayEndTK == null) {
          a.S("mClickListener");
       }
       c uoc = uAdPlayEndTK.get();
       if (uoc != null) {
          uoc.a(p0);
       }
       return;
    }
    public final void W8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdPlayEndTKPresenter.class, "13")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       j0.f("TachikomaPlayEnd", "hidePlayEndView\(\)", objArray1);
       AdPlayEndTKPresenter tw = this.w;
       if (tw == null) {
          a.S("mIsPlayEndScreenPrepare");
       }
       Boolean fALSE = Boolean.FALSE;
       tw.set(fALSE);
       tw = this.F;
       if (tw != null) {
          tw.a();
       }
       tw = this.J;
       if (tw != null) {
          Context context = this.getContext();
          if (context instanceof GifshowActivity) {
             objArray = context;
          }
          if (objArray != null) {
             objArray.l3(tw);
          }
       }
       tw = this.x;
       if (tw == null) {
          a.S("mIsPlayEndScreenVisible");
       }
       tw.set(fALSE);
       tw = this.v;
       if (tw == null) {
          a.S("mAdPlayEndViewState");
       }
       tw.onNext(fALSE);
       tw = this.u;
       if (tw == null) {
          a.S("mPlayEndVisibilityPublish");
       }
       tw.onNext(Integer.valueOf(8));
       return;
    }
    public final boolean X8(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       AdPlayEndTKPresenter obj = PatchProxy.apply(objArray, this, AdPlayEndTKPresenter.class, "15");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.F;
       boolean b = false;
       if (obj != null) {
          Object obj1 = PatchProxy.apply(objArray, obj, AdPlayEndTKBaseView.class, "3");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(!obj.getVisibility()){
             b1 = true;
          }else {
             b1 = false;
          }
          if (b1 == true) {
             b = true;
          }
       }
       return b;
    }
    public final void Y8(){
       if (PatchProxy.applyVoid(null, this, AdPlayEndTKPresenter.class, "12")) {
          return;
       }
       AdPlayEndTKPresenter tO = this.O;
       if (tO != null) {
          tO.stop();
       }
       this.O = null;
       return;
    }
    public abstract int Z8();
    public void j8(){
       if (PatchProxy.applyVoid(null, this, AdPlayEndTKPresenter.class, "1")) {
          return;
       }
       f obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.q = obj;
       obj = this.q8(PhotoDetailParam.class);
       a.o(obj, "inject\(PhotoDetailParam::class.java\)");
       this.r = obj;
       obj = this.q8(o.class);
       a.o(obj, "inject\(PhotoAdActionBarClickProcessor::class.java\)");
       this.s = obj;
       obj = this.x8("PHOTO_PLAY_END_CLICK_LISTENER");
       a.o(obj, "injectRef\(AccessIds.PHOTO_PLAY_END_CLICK_LISTENER\)");
       this.t = obj;
       obj = this.x8("PHOTO_VIDEO_PLAY_END_PREPARE");
       a.o(obj, "injectRef\(AccessIds.PHOTO_VIDEO_PLAY_END_PREPARE\)");
       this.w = obj;
       obj = this.x8("PHOTO_VIDEO_PLAY_END_VIEW");
       a.o(obj, "injectRef\(AccessIds.PHOTO_VIDEO_PLAY_END_VIEW\)");
       this.x = obj;
       obj = this.x8("PHOTO_CAN_SHOW_PLAY_END");
       a.o(obj, "injectRef\(AccessIds.PHOTO_CAN_SHOW_PLAY_END\)");
       this.y = obj;
       Object obj1 = this.r8("PHOTO_VIDEO_PLAY_END_VISIBILITY_PUBLISH");
       a.o(obj1, "inject\(AccessIds.PHOTO_V¡­Y_END_VISIBILITY_PUBLISH\)");
       this.u = obj1;
       obj1 = this.r8("AD_PLAY_END_VIEW_STATE");
       a.o(obj1, "inject\(AccessIds.AD_PLAY_END_VIEW_STATE\)");
       this.v = obj1;
       obj1 = this.r8("DETAIL_FRAGMENT");
       a.o(obj1, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.z = obj1;
       obj1 = this.q8(c.class);
       a.o(obj1, "inject\(PhotoDetailStatLogger::class.java\)");
       this.A = obj1;
       obj = this.x8("DETAIL_AVATAR_CLICK_HANDLER");
       a.o(obj, "injectRef\(AccessIds.DETAIL_AVATAR_CLICK_HANDLER\)");
       this.B = obj;
       obj = this.x8("PHOTO_PLAY_END_CONTROLLER");
       a.o(obj, "injectRef\(AccessIds.PHOTO_PLAY_END_CONTROLLER\)");
       this.C = obj;
       obj1 = this.r8("DETAIL_ATTACH_LISTENERS");
       a.o(obj1, "inject\(AccessIds.DETAIL_ATTACH_LISTENERS\)");
       this.D = obj1;
       this.E = this.t8("REQUEST_REPLACE_DATA_SERVICE");
       this.p = this.q8(c.class);
       return;
    }
}
