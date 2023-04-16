package com.yxcorp.gifshow.postentrance.presenter.KsBottomBarCameraPresenterV2;
import ezb.e;
import com.yxcorp.gifshow.postentrance.presenter.KsBottomBarCameraPresenterV2$a;
import nsd.u;
import pr6.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.framework.abtest.f;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import dn6.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import o56.c;
import o56.a;
import android.content.Intent;
import android.net.Uri;
import ekd.x0;
import java.util.Map;
import yzb.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import yzb.g;
import yzb.f;
import com.yxcorp.gifshow.postentrance.util.CameraEntranceUtils;
import java.lang.Integer;
import java.util.Objects;
import java.lang.Boolean;
import qrd.p;
import wa5.e;
import ok.x;
import a0c.g;
import q87.c;
import yzb.e;
import izb.a;
import com.yxcorp.gifshow.postentrance.presenter.KsBottomBarCameraPresenterV2$2;
import msd.l;
import yqb.a;
import com.yxcorp.gifshow.postentrance.presenter.KsBottomBarCameraPresenterV2$onBind$1;
import yzb.c;
import erd.g;
import crd.b;
import eoc.f;
import com.yxcorp.gifshow.util.rx.RxBus;
import sb5.a;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import com.yxcorp.gifshow.postentrance.presenter.KsBottomBarCameraPresenterV2$d;
import com.yxcorp.gifshow.postentrance.CameraViewSwitcher;
import com.yxcorp.gifshow.postentrance.presenter.KsBottomBarCameraPresenterV2$c;
import ezb.f;
import android.view.View;
import com.yxcorp.gifshow.postentrance.presenter.KsBottomBarCameraPresenterV2$b;
import android.view.View$OnClickListener;
import ezb.a;
import java.util.List;
import java.util.Iterator;
import an6.f;
import ezb.l;
import com.kwai.gifshow.post.api.feature.camera.model.CameraIconInfo;
import po5.c;
import pr6.b;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kuaishou.android.model.mix.PostShowInfo;
import vzb.a;
import kotlin.Pair;
import qrd.r0;
import trd.s0;
import k2b.e0;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.log.model.CommonParams;
import dkc.b;
import ezb.g;
import an6.e;
import zm6.a;
import com.kwai.feature.post.api.startup.e;
import qm6.b$a;
import android.content.Context;
import android.net.Uri$Builder;
import dn6.c;
import lnc.y6;
import brd.a0;
import lnc.t;
import ezb.h;
import o46.c;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import com.yxcorp.gifshow.util.LoadPolicy;
import lnc.c4;
import ezb.i;
import ezb.j;
import com.yxcorp.gifshow.homepage.BottomActionBarSkinHelper;
import gsa.i;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import hn5.b0;
import lnc.a1;
import qsd.d;
import android.widget.ImageView$ScaleType;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;
import com.yxcorp.gifshow.image.KwaiImageView;
import ekd.m1;

public final class KsBottomBarCameraPresenterV2 extends e	// class@001056
{
    public boolean A;
    public final d B;
    public View v;
    public KwaiImageView w;
    public KwaiImageView x;
    public View y;
    public f z;
    public static final KsBottomBarCameraPresenterV2$a C;

    static {
       KsBottomBarCameraPresenterV2.C = new KsBottomBarCameraPresenterV2$a(null);
    }
    public void KsBottomBarCameraPresenterV2(d p0){
       boolean b;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a.p(p0, "fragment");
       super();
       this.B = p0;
       if (!f.a("ShieldBubble")) {
          ActivityContext uActivityCon = ActivityContext.g();
          a.o(uActivityCon, "ActivityContext.getInstance\(\)");
          Activity uActivity = uActivityCon.e();
          Object obj = null;
          if (uActivity != null && !PatchProxy.applyVoidOneRefs(uActivity, obj, b.class, "1")) {
             a.p(uActivity, "activity");
             c uoc = a.a();
             a.o(uoc, "AppEnv.get\(\)");
             if (uoc.c()) {
                Intent intent = uActivity.getIntent();
                if (intent != null && intent.getData() != null) {
                   String str = "bubbleType";
                   String str1 = x0.a(intent.getData(), str);
                   if (str1 != null) {
                      b.a.put(str, str1);
                   }
                   str = "bubbleId";
                   str1 = x0.a(intent.getData(), str);
                   if (str1 != null) {
                      b.a.put(str, str1);
                   }
                   str1 = "showDuration";
                   String str2 = x0.a(intent.getData(), str1);
                   if (str2 != null) {
                      b.a.put(str1, str2);
                   }
                }
             }
          }
          this.U7(new d(p0));
          this.U7(new g(p0));
          this.U7(new f(p0));
          CameraEntranceUtils h = CameraEntranceUtils.h;
          int i = 1;
          if (!CameraEntranceUtils.c(h, obj, i, obj)) {
             Objects.requireNonNull(h);
             CameraEntranceUtils uCameraEntra = CameraEntranceUtils.class;
             Object obj1 = PatchProxy.apply(obj, h, uCameraEntra, "7");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }else {
                Boolean uBoolean = PatchProxy.apply(obj, h, uCameraEntra, "4");
                if (uBoolean == patchProxyRe) {
                   uBoolean = CameraEntranceUtils.d.getValue();
                }
                b = uBoolean.booleanValue();
             }
             if (!b) {
                Object[] obj2 = PatchProxy.apply(obj, obj, e.class, "2");
                if (obj2 != patchProxyRe) {
                   b1 = obj2.booleanValue();
                }else if(!e.a.get().booleanValue() && !e.c.get().booleanValue()){
                   i = null;
                }
                b1 = i;
                if (!b1) {
                label_0107 :
                   obj2 = new Object[0];
                   g.C().w("NasaCameraPresenterV2", "camera bubble is blocked by abtest", obj2);
                }
             }else {
                goto label_0107 ;
             }
          }
          this.U7(new e(p0, R.id.shoot_container, 2));
       }
       CameraEntranceUtils h1 = CameraEntranceUtils.h;
       if (h1.e() || h1.b(Integer.valueOf(34))) {
          this.U7(new a(p0, new KsBottomBarCameraPresenterV2$2(this)));
       }
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, KsBottomBarCameraPresenterV2.class, "13")) {
          return;
       }
       super.E8();
       this.X7(f.a(a.class, new c(new KsBottomBarCameraPresenterV2$onBind$1(this))));
       this.X7(RxBus.f.g(a.class, RxBus$ThreadMode.MAIN).subscribe(new KsBottomBarCameraPresenterV2$d(this)));
       return;
    }
    public CameraViewSwitcher V8(){
       CameraViewSwitcher obj = PatchProxy.apply(null, this, KsBottomBarCameraPresenterV2.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       g.C().w("NasaCameraPresenterV2", "initCameraViewSwitcher", objArray);
       this.z = new KsBottomBarCameraPresenterV2$c(this, 0);
       KsBottomBarCameraPresenterV2 tz = this.z;
       if (tz == null) {
          a.S("defaultCameraEntrance");
       }
       KsBottomBarCameraPresenterV2 tv = this.v;
       if (tv == null) {
          a.S("cameraView");
       }
       obj = new CameraViewSwitcher(tz, tv);
       obj.i(new KsBottomBarCameraPresenterV2$b(this));
       return obj;
    }
    public final void Y8(Activity p0,View p1){
       Object[] objArray1;
       CameraIconInfo uCameraIconI2;
       String str1;
       Object[] objArray4;
       a uoa1;
       int i2;
       e obj3;
       String str2;
       a uoa2;
       CameraIconInfo uCameraIconI3;
       f uof1;
       g b;
       b c;
       CameraIconInfo uCameraIconI4;
       b obj5;
       object oobject;
       Object obj = this;
       Object obj1 = p0;
       SlidePlayViewModel obj2 = p1;
       KsBottomBarCameraPresenterV2 ksBottomBarC = KsBottomBarCameraPresenterV2.class;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, ksBottomBarC, "16")) {
          return;
       }
       Object[] objArray = new Object[0];
       if (obj1 == null) {
          objArray1 = new Object[0];
          return;
       }else if(PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, ksBottomBarC, "17")){
          Object[] objArray2 = new Object[0];
          Object[] objArray3 = null;
          a uoa = PatchProxy.apply(objArray3, obj, a.class, "1");
          if (uoa != PatchProxyResult.class) {
          }else {
             uoa = obj.p;
             if (uoa == null) {
                a.S("clickDelegateList");
             }
          }
          Iterator iterator = uoa.iterator();
          do {
             if (iterator.hasNext()) {
             }else {
                f uof = this.S8().e();
                l ol = uof.b();
                CameraIconInfo uCameraIconI = (ol != null)? ol.a(): objArray3;
                uof.h(obj2);
                b y = c.y;
                a.o(y, "HomeFragmentFuncIds.CURRENT_SLIDE_PLAY_VIEW_MODEL");
                obj2 = obj.B.d(y);
                if (ol != null) {
                   PostShowInfo postShowInfo = ol.c();
                   if (postShowInfo != null) {
                      postShowInfo = postShowInfo.mJumpUrl;
                   label_00a6 :
                      boolean i = 1;
                      int i1 = (postShowInfo == null || !postShowInfo.length())? 1: 0;
                      if (i1) {
                         uCameraIconI2 = objArray3;
                      }
                      i1 = i1 ^ i;
                      if (ol != null) {
                         CameraIconInfo uCameraIconI1 = ol.a();
                         if (uCameraIconI1 != null) {
                            uCameraIconI1 = uCameraIconI1.mScheme;
                         label_00c4 :
                            String str = (uCameraIconI1 == null || !uCameraIconI1.length())? 1: null;
                            if (!str) {
                               uCameraIconI2 = uCameraIconI1;
                               str1 = 1;
                            }
                            if (ol != null) {
                               ol = ol.f;
                               if (ol != null) {
                                  uoa = ol.c;
                               label_00de :
                                  objArray4 = (uoa == null || !uoa.length())? 1: null;
                                  if (!objArray4) {
                                     uoa1 = uoa;
                                     i2 = 1;
                                  }else {
                                     uoa1 = uCameraIconI2;
                                     i2 = str1;
                                  }
                                  Map map = s0.k(r0.a("icon_type", this.W8()));
                                  str = "HomeFragmentFuncIds.LOG_PAGE";
                                  if (obj2 != null) {
                                     objArray2 = new Object[0];
                                     g.C().w("NasaCameraPresenterV2", "slidePlayViewModel, is not null", objArray2);
                                     y = c.C;
                                     a.o(y, str);
                                     obj3 = obj.B.d(y);
                                     QPhoto currentPhoto = obj2.getCurrentPhoto();
                                     BaseFeed uBaseFeed = (currentPhoto != null)? currentPhoto.getEntity(): objArray3;
                                     str2 = str;
                                     uoa2 = uoa1;
                                     uCameraIconI3 = uCameraIconI;
                                     uof1 = uof;
                                     a.R8(this, uCameraIconI, obj3, uoa1, uBaseFeed, b.g(obj2.getCurrentPhoto(), (obj2.a0() + i)), map, null, 64, 0);
                                  }else {
                                     str2 = str;
                                     uoa2 = uoa1;
                                     uCameraIconI3 = uCameraIconI;
                                     uof1 = uof;
                                     objArray1 = new Object[0];
                                     g.C().w("NasaCameraPresenterV2", "slidePlayViewModel, is null", objArray1);
                                     obj5 = c.C;
                                     a.o(obj5, str2);
                                     a.R8(this, uCameraIconI3, obj.B.d(obj5), uoa2, null, null, map, false, 64, null);
                                  }
                                  if (i2) {
                                     objArray1 = new Object[0];
                                     g.b.c(obj1, uoa2, null, null);
                                     break ;
                                  }else {
                                     objArray1 = new Object[0];
                                     b = g.b;
                                     ol = uof1.b();
                                     obj3 = (ol != null)? ol.b(): null;
                                     if (obj.A != null) {
                                        c = c.C;
                                        a.o(c, str2);
                                        g obj4 = obj.B.e(c);
                                        a.o(obj4, "fragment.callNonNull\(HomeFragmentFuncIds.LOG_PAGE\)");
                                        if (obj4.getPage() == 0x7602) {
                                           i = true;
                                        label_01d9 :
                                           Objects.requireNonNull(b);
                                           obj4 = g.class;
                                           int i3 = 4;
                                           if (PatchProxy.isSupport(obj4)) {
                                              objArray = new Object[]{obj1,uCameraIconI4,obj3,null,Integer.valueOf(i3),Boolean.valueOf(i)};
                                              uCameraIconI4 = uCameraIconI3;
                                              obj5 = PatchProxy.apply(objArray, b, obj4, "2");
                                              if (obj5 != PatchProxyResult.class) {
                                                 obj5.booleanValue();
                                                 break ;
                                              }
                                           }else {
                                              uCameraIconI4 = uCameraIconI3;
                                              boolean b2 = true;
                                           }
                                           a.c(obj1, "clicked");
                                           if (!b.a(obj1, 1)) {
                                              objArray1 = new Object[0];
                                              g.C().w("CameraLauncher", "checkCanEnterCameraActivity, false", objArray1);
                                              break ;
                                           }else if(e.a){
                                              a.c(obj1, "goBackupPage");
                                              b.b(obj1);
                                              break ;
                                           }else {
                                              b$a b1 = new b$a(obj1, 0).l(i3).m(1).c0(1).b0(1);
                                              b1.u1 = uCameraIconI4;
                                              b1 = b1.t(1).u(1);
                                              if (uCameraIconI4 != null) {
                                                 b1.k(uCameraIconI4.mRelativeActivityId);
                                              }
                                              if (obj3 != null) {
                                                 a.o(b1, "builder");
                                                 b1.B(x0.f("kwai://post").buildUpon().appendQueryParameter("activity", c.a.b(obj3.a(), obj3.b(), obj3.c())).build());
                                              }
                                              y6.e.i().Q(h.b);
                                              c.c();
                                              y6.t(RecordPostPlugin.class, LoadPolicy.DIALOG, new c4(1, (e.b ^ 1))).R(new i(obj1, i, b1), new j(obj1));
                                              break ;
                                           }
                                        }
                                     }
                                     i = false;
                                     goto label_01d9 ;
                                  }
                               }
                            }
                            objArray1 = objArray3;
                            goto label_00de ;
                         }
                      }
                      objArray4 = objArray3;
                      goto label_00c4 ;
                   }
                }
                uCameraIconI2 = objArray3;
                goto label_00a6 ;
             }
          } while (iterator.next().onClick(obj2));
       }
       return;
    }
    public final void Z8(){
       KsBottomBarCameraPresenterV2 tx;
       b0 a;
       KsBottomBarCameraPresenterV2 tw;
       b0 a1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KsBottomBarCameraPresenterV2.class, "12")) {
          return;
       }
       boolean b = true;
       if (BottomActionBarSkinHelper.b.a()) {
          this.X8(b);
       }else {
          float f = 0x41f80000;
          if (i.a()) {
             this.X8(b);
             tx = this.x;
             if (tx == null) {
                a.S("cameraBlackButton");
             }
             ViewGroup$LayoutParams layoutParams = tx.getLayoutParams();
             a = b0.a;
             float f1 = 35.00f;
             layoutParams.width = d.H0((a.a() * (float)a1.e(f1)));
             layoutParams.height = d.H0((a.a() * (float)a1.e(f)));
             KsBottomBarCameraPresenterV2 tx1 = this.x;
             if (tx1 == null) {
                a.S("cameraBlackButton");
             }
             tx1.setLayoutParams(layoutParams);
             tx = this.w;
             if (tx == null) {
                a.S("cameraWhiteButton");
             }
             layoutParams = tx.getLayoutParams();
             layoutParams.width = d.H0((a.a() * (float)a1.e(f1)));
             layoutParams.height = d.H0((a.a() * (float)a1.e(f)));
             tw = this.w;
             if (tw == null) {
                a.S("cameraWhiteButton");
             }
             tw.setLayoutParams(layoutParams);
             tx = this.x;
             if (tx == null) {
                a.S("cameraBlackButton");
             }
             tx.setScaleType(ImageView$ScaleType.CENTER_INSIDE);
             tx = this.w;
             if (tx == null) {
                a.S("cameraWhiteButton");
             }
             tx.setScaleType(ImageView$ScaleType.CENTER_INSIDE);
             tx = this.x;
             if (tx == null) {
                a.S("cameraBlackButton");
             }
             a hierarchy = tx.getHierarchy();
             if (hierarchy != null) {
                Objects.requireNonNull(CameraEntranceUtils.h);
                hierarchy.E(R.drawable.arg_RES_7f080ae6, t$b.h);
             }
             tx = this.w;
             if (tx == null) {
                a.S("cameraWhiteButton");
             }
             hierarchy = tx.getHierarchy();
             if (hierarchy != null) {
                Objects.requireNonNull(CameraEntranceUtils.h);
                hierarchy.E(R.drawable.arg_RES_7f080ae7, t$b.h);
             }
             tx = this.x;
             if (tx == null) {
                a.S("cameraBlackButton");
             }
             i.j(tx, i.e(), objArray);
             tx = this.w;
             if (tx == null) {
                a.S("cameraWhiteButton");
             }
             i.j(tx, i.e(), objArray);
          }else {
             this.X8(false);
             a1 = b0.a;
             if (a1.a() - 0x3f800000) {
                KsBottomBarCameraPresenterV2 tx2 = this.x;
                if (tx2 == null) {
                   a.S("cameraBlackButton");
                }
                ViewGroup$LayoutParams layoutParams1 = tx2.getLayoutParams();
                layoutParams1.width = d.H0((a1.a() * (float)a1.e(f)));
                layoutParams1.height = d.H0((a1.a() * (float)a1.e(f)));
                tw = this.x;
                if (tw == null) {
                   a.S("cameraBlackButton");
                }
                tw.setLayoutParams(layoutParams1);
                tx2 = this.w;
                if (tx2 == null) {
                   a.S("cameraWhiteButton");
                }
                layoutParams1 = tx2.getLayoutParams();
                layoutParams1.width = d.H0((a1.a() * (float)a1.e(f)));
                layoutParams1.height = d.H0((a1.a() * (float)a1.e(f)));
                tx = this.w;
                if (tx == null) {
                   a.S("cameraWhiteButton");
                }
                tx.setLayoutParams(layoutParams1);
             }
             tx = this.x;
             if (tx == null) {
                a.S("cameraBlackButton");
             }
             CameraEntranceUtils h = CameraEntranceUtils.h;
             Objects.requireNonNull(h);
             tx.setImageResource(R.drawable.arg_RES_7f080ae6);
             tx = this.w;
             if (tx == null) {
                a.S("cameraWhiteButton");
             }
             Objects.requireNonNull(h);
             tx.setImageResource(R.drawable.arg_RES_7f080ae7);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsBottomBarCameraPresenterV2.class, "11")) {
          return;
       }
       a.p(p0, "view");
       super.doBindView(p0);
       Object[] objArray = new Object[0];
       g.C().w("NasaCameraPresenterV2", "doBindView", objArray);
       p0 = m1.f(p0, R.id.shoot_container);
       a.o(p0, "ViewBindUtils.bindWidget¡­ew, R.id.shoot_container\)");
       this.v = p0;
       String str = "cameraView";
       if (p0 == null) {
          a.S(str);
       }
       p0 = m1.f(p0, R.id.btn_shoot_white);
       a.o(p0, "ViewBindUtils.bindWidget¡­ew, R.id.btn_shoot_white\)");
       this.w = p0;
       KsBottomBarCameraPresenterV2 tv = this.v;
       if (tv == null) {
          a.S(str);
       }
       tv = m1.f(tv, R.id.btn_shoot_black);
       a.o(tv, "ViewBindUtils.bindWidget¡­ew, R.id.btn_shoot_black\)");
       this.x = tv;
       tv = this.v;
       if (tv == null) {
          a.S(str);
       }
       tv = m1.f(tv, R.id.default_btn_shoot_container);
       a.o(tv, "ViewBindUtils.bindWidget¡­ault_btn_shoot_container\)");
       this.y = tv;
       this.Z8();
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsBottomBarCameraPresenterV2.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(KsBottomBarCameraPresenterV2.class, null);
       return objectsByTag;
    }
}
