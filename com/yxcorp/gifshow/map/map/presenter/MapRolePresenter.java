package com.yxcorp.gifshow.map.map.presenter.MapRolePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.map.map.presenter.MapRolePresenter$a;
import nsd.u;
import lnc.a1;
import com.yxcorp.gifshow.map.MapLogger$MapState;
import com.yxcorp.gifshow.map.map.presenter.MapRolePresenter$mKrnListener$1;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import g6b.c;
import yz6.f;
import yz6.i;
import com.kuaishou.krn.event.a;
import oj0.a;
import g6b.e;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import com.yxcorp.gifshow.map.map.presenter.MapRolePresenter$e;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import xl8.b;
import com.yxcorp.gifshow.map.map.presenter.MapRolePresenter$f;
import com.yxcorp.gifshow.map.map.presenter.MapRolePresenter$g;
import com.yxcorp.gifshow.map.map.presenter.MapRolePresenter$h;
import wkd.b;
import x5b.a;
import t45.d;
import brd.z;
import cjd.e;
import erd.o;
import j6b.e0;
import j6b.f0;
import lnc.b9;
import h6b.a;
import com.airbnb.lottie.LottieAnimationView;
import com.yxcorp.utility.n;
import f07.b;
import java.lang.Integer;
import tkd.b;
import tkd.d;
import g07.a;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import yz6.a;
import yz6.e;
import android.os.Bundle;
import com.kwai.library.widget.map.IMarkerOptions;
import com.kwai.library.widget.map.IMarkerOptions$IMarkerAnimateType;
import yz6.m;
import yz6.l;
import yz6.j;
import g6b.a;
import com.yxcorp.gifshow.map.map.presenter.MapRolePresenter$b;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;
import com.yxcorp.gifshow.nearby.common.map.MapExperimentUtils;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.map.data.model.MapRoleInfoResponse;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$Role;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import ac.a;
import com.facebook.drawee.view.DraweeView;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import s0d.e;
import s0d.f;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.framework.model.user.User;
import com.facebook.imagepipeline.request.ImageRequest$CacheChoice;
import s0d.a;
import com.facebook.drawee.controller.AbstractDraweeController;
import java.util.concurrent.TimeUnit;
import io.reactivex.android.schedulers.a;
import com.yxcorp.gifshow.map.map.presenter.MapRolePresenter$d;
import android.content.Context;
import com.yxcorp.gifshow.map.map.model.MapCenterInfo;
import com.yxcorp.gifshow.map.data.model.MapLocationAddressResponse$LocationAddress;
import java.lang.StringBuilder;
import java.lang.Double;
import xh7.b;
import qh7.b;
import qh7.a;
import fg6.a;
import com.google.gson.Gson;
import w4.e;
import com.yxcorp.gifshow.map.map.presenter.MapRolePresenter$i;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.map.MapLogger$CardStatus;
import java.lang.Boolean;
import com.yxcorp.gifshow.map.MapLogger$ClickState;
import com.yxcorp.gifshow.map.MapLogger$CardState;
import k2b.e0;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.map.MapLogger;
import androidx.constraintlayout.widget.ConstraintLayout;
import ekd.m1;
import com.yxcorp.gifshow.util.w0;
import com.yxcorp.gifshow.map.map.presenter.MapRolePresenter$c;
import java.util.Objects;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import k6b.j;
import qrd.l1;
import android.graphics.drawable.Drawable;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.yxcorp.gifshow.map.map.presenter.MapRolePresenter$j;
import com.yxcorp.gifshow.map.map.presenter.MapRolePresenter$k;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$Moment;
import k6b.i;
import com.yxcorp.gifshow.map.map.presenter.MapRolePresenter$l;
import com.yxcorp.gifshow.map.map.PhotoMapFragment;
import g6b.d;
import com.kwai.framework.location.k;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class MapRolePresenter extends PresenterV2	// class@001cb5
{
    public ImageView A;
    public KwaiImageView B;
    public View C;
    public KwaiImageView D;
    public ViewGroup E;
    public View F;
    public PhotoMapFragment G;
    public LottieAnimationView H;
    public LottieAnimationView I;
    public ViewGroup J;
    public c K;
    public MapRoleInfoResponse L;
    public e M;
    public boolean N;
    public boolean O;
    public final int P;
    public final int Q;
    public e R;
    public b S;
    public i T;
    public f U;
    public d U0;
    public b V;
    public boolean V0;
    public b W;
    public boolean W0;
    public a X;
    public boolean X0;
    public boolean Y;
    public boolean Y0;
    public ImageView Z;
    public b Z0;
    public boolean a1;
    public Integer b1;
    public MapLogger$MapState c1;
    public final int d1;
    public final int e1;
    public final int f1;
    public final int g1;
    public String h1;
    public final a i1;
    public ConstraintLayout p;
    public ViewGroup q;
    public ViewGroup r;
    public ConstraintLayout s;
    public TextView t;
    public TextView u;
    public ImageView v;
    public KwaiImageView w;
    public KwaiImageView x;
    public ImageView y;
    public View z;
    public static final MapRolePresenter$a j1;

    static {
       MapRolePresenter.j1 = new MapRolePresenter$a(null);
    }
    public void MapRolePresenter(){
       super();
       this.P = a1.e(44.00f);
       this.Q = a1.e(44.00f);
       this.c1 = MapLogger$MapState.MAP;
       this.d1 = a1.e(40.00f);
       this.e1 = a1.e(44.00f);
       this.f1 = a1.e(48.00f);
       this.g1 = a1.e(60.00f);
       this.h1 = "";
       this.i1 = new MapRolePresenter$mKrnListener$1(this);
    }
    public static final KwaiImageView P8(MapRolePresenter p0){
       p0 = p0.D;
       if (p0 == null) {
          a.S("mRoleCoverImageView");
       }
       return p0;
    }
    public static final View R8(MapRolePresenter p0){
       p0 = p0.C;
       if (p0 == null) {
          a.S("mRoleLocationIcon");
       }
       return p0;
    }
    public void E8(){
       f map;
       b uob;
       MapRolePresenter mapRolePrese = MapRolePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, mapRolePrese, "3")) {
          return;
       }
       MapRolePresenter tK = this.K;
       if (tK != null) {
          c a = tK.a;
          if (a != null) {
             map = a.getMap();
          label_001a :
             this.U = map;
             a.b().a("SocialNearbyMap_currentRoleInfo", this.i1);
             tK = this.M;
             if (tK != null) {
                t ot = PatchProxy.apply(objArray, tK, e.class, "1");
                if (ot != PatchProxyResult.class) {
                }else {
                   ot = tK.a.hide();
                   a.o(ot, "mMyRoleActionObservable.hide\(\)");
                }
                if (ot != null) {
                   uob = ot.subscribe(new MapRolePresenter$e(this), Functions.e);
                   if (uob != null) {
                      this.X7(uob);
                   }
                }
             }
          label_0057 :
             tK = this.V;
             if (tK == null) {
                a.S("mMapLocationUpdate");
             }
             this.X7(tK.b().subscribe(new MapRolePresenter$f(this)));
             tK = this.W;
             if (tK == null) {
                a.S("mMapLocationButtonClick");
             }
             this.X7(tK.b().subscribe(new MapRolePresenter$g(this)));
             tK = this.K;
             if (tK != null) {
                t ot1 = tK.a();
                if (ot1 != null) {
                   uob = ot1.subscribe(new MapRolePresenter$h(this), Functions.e);
                   if (uob != null) {
                      this.X7(uob);
                   }
                }
             }
             if (!PatchProxy.applyVoid(objArray, this, mapRolePrese, "5")) {
                this.X7(b.a(0x42d90323).b().observeOn(d.c).map(new e()).observeOn(d.a).subscribe(new e0(this), new f0(this)));
             }
             return;
          }
       }
       map = objArray;
       goto label_001a ;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, MapRolePresenter.class, "25")) {
          return;
       }
       this.S8();
       this.V8();
       b9.a(this.S);
       a.b().c("SocialNearbyMap_currentRoleInfo", this.i1);
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, MapRolePresenter.class, "18")) {
          return;
       }
       a.a.a(this.I);
       View[] viewArray = new View[]{this.I};
       n.Z(4, viewArray);
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, MapRolePresenter.class, "17")) {
          return;
       }
       a.a.a(this.H);
       MapRolePresenter tH = this.H;
       if (tH != null) {
          tH.setProgress(0);
       }
       return;
    }
    public final void W8(b p0,View p1,int p2){
       MapRolePresenter ty;
       ViewGroup$LayoutParams layoutParams;
       MapRolePresenter td1;
       MapRolePresenter mapRolePrese = MapRolePresenter.class;
       if (PatchProxy.isSupport(mapRolePrese) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, MapRolePresenter.class, "6")) {
          return;
       }
       if (p1 != null) {
          int i = 0;
          p1.measure(i, i);
          this.b1 = Integer.valueOf(p2);
          e uoe = d.a(-115370941).n10(p1, p0, i);
          a.o(uoe, "PluginManager.get\(KMapPl¡­foWindow\(view, latLng, 0\)");
          Bundle uBundle = new Bundle();
          uBundle.putBoolean("isRole", true);
          IMarkerOptions iMarkerOptio = d.a(-115370941).Ft().i(p0).n(IMarkerOptions$IMarkerAnimateType.grow).r(uoe).v(d.a(-115370941).S4(Bitmap.createBitmap(p1.getMeasuredWidth(), p1.getMeasuredHeight(), Bitmap$Config.ALPHA_8))).w(uBundle);
          a.o(iMarkerOptio, "PluginManager.get\(KMapPl¡­\n      .extraInfo\(bundle\)");
          MapRolePresenter tU = this.U;
          MapRoleInfoResponse mapRoleInfoR = null;
          l ol = (tU != null)? tU.q(iMarkerOptio): mapRoleInfoR;
          if (ol != null) {
             tU = this.X;
             if (tU != null) {
                tU.b = ol;
             }
             uoe = ol.x();
             if (uoe != null) {
                uoe = uoe.getView();
                if (uoe != null) {
                   uoe.setOnClickListener(new MapRolePresenter$b(this, ol));
                   this.r = uoe.findViewById(0x7f0a4425);
                   this.u = uoe.findViewById(0x7f0a059c);
                   this.v = uoe.findViewById(0x7f0a14e5);
                   this.y = uoe.findViewById(0x7f0a06f5);
                   this.w = uoe.findViewById(0x7f0a09e2);
                   this.x = uoe.findViewById(0x7f0a3692);
                   this.z = uoe.findViewById(0x7f0a06f7);
                   if (MapExperimentUtils.g.e()) {
                      ty = this.y;
                      if (ty != null) {
                         layoutParams = ty.getLayoutParams();
                         if (layoutParams != null) {
                            layoutParams.width = this.e1;
                            layoutParams.height = this.f1;
                         }
                      }
                      ty = this.w;
                      if (ty != null) {
                         layoutParams = ty.getLayoutParams();
                         if (layoutParams != null) {
                            td1 = this.d1;
                            layoutParams.width = td1;
                            layoutParams.height = td1;
                         }
                      }
                      ty = this.z;
                      if (ty != null) {
                         ty.requestLayout();
                      }
                   }
                   ty = this.b1;
                   td1 = 2;
                   if (ty != null && ty.intValue() == td1) {
                      View[] viewArray1 = new View[true];
                      viewArray1[i] = this.z;
                      n.Z(8, viewArray1);
                      viewArray1 = new View[true];
                      viewArray1[i] = uoe.findViewById(0x7f0a2fe6);
                      n.Z(i, viewArray1);
                      tU = this.L;
                      if (tU != null) {
                         mapRolePrese = this.x;
                         if (mapRolePrese != null) {
                            MapRoleInfoResponse mRole = tU.mRole;
                            if (mRole != null) {
                               mapRoleInfoR = mRole.mImage;
                            }
                            mapRolePrese.L(mapRoleInfoR);
                         }
                      }
                   }else {
                      View[] viewArray = new View[true];
                      viewArray[i] = this.z;
                      n.Z(i, viewArray);
                      viewArray = new View[true];
                      viewArray[i] = uoe.findViewById(0x7f0a2fe6);
                      n.Z(8, viewArray);
                      tU = this.w;
                      MapRolePresenter tL = this.L;
                      if (tL != null) {
                         mapRoleInfoR = tL.mUser;
                      }
                      if (!PatchProxy.applyVoidTwoRefs(tU, mapRoleInfoR, this, mapRolePrese, "27") && (tU != null && mapRoleInfoR != null)) {
                         d uod = Fresco.newDraweeControllerBuilder();
                         uod.y(tU.getController());
                         e uoe1 = PatchProxy.applyOneRefs(mapRoleInfoR, this, mapRolePrese, "26");
                         if (uoe1 != PatchProxyResult.class) {
                         }else {
                            uoe1 = f.x().r(mapRoleInfoR.getAvatars()).t(mapRoleInfoR.getAvatar()).f(ImageRequest$CacheChoice.SMALL).o(this.P, this.Q).v();
                         }
                         uod.w(uoe1);
                         AbstractDraweeController uAbstractDra = uod.e();
                         a.o(uAbstractDra, "Fresco.newDraweeControll¡­est\(user\)\)\n      .build\(\)");
                         tU.setController(uAbstractDra);
                      }
                   }
                   ol.f(ol.x());
                }
             }
          }
       }
    label_01de :
       return;
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, MapRolePresenter.class, "24")) {
          return;
       }
       MapRolePresenter tq = this.q;
       if (tq == null) {
          a.S("mBubbleView");
       }
       if (tq.getVisibility()) {
          tq = this.r;
          if (tq == null || tq.getVisibility()) {
          label_0040 :
             return;
          }
       }
       this.S = t.timer(5, TimeUnit.SECONDS).observeOn(a.c()).subscribe(new MapRolePresenter$d(this));
       goto label_0040 ;
    }
    public final void Y8(){
       if (PatchProxy.applyVoid(null, this, MapRolePresenter.class, "20")) {
          return;
       }
       View[] viewArray = new View[]{this.r};
       n.Z(8, viewArray);
       View[] viewArray1 = new View[1];
       MapRolePresenter tq = this.q;
       if (tq == null) {
          a.S("mBubbleView");
       }
       viewArray1[0] = tq;
       n.Z(8, viewArray1);
       return;
    }
    public final void Z8(){
       MapLocationAddressResponse$LocationAddress mProvince;
       Object[] objArray;
       if (PatchProxy.applyVoid(null, this, MapRolePresenter.class, "22")) {
          return;
       }
       Context context = this.getContext();
       if (context != null) {
          MapRolePresenter tK = this.K;
          String str = "";
          if (tK != null) {
             c f = tK.f;
             if (f != null) {
                MapCenterInfo mAddress = f.mAddress;
                if (mAddress != null) {
                   mProvince = mAddress.mProvince;
                   if (mProvince != null) {
                   label_0026 :
                      if (tK != null) {
                         c f1 = tK.f;
                         if (f1 != null) {
                            MapCenterInfo mAddress1 = f1.mAddress;
                            if (mAddress1 != null) {
                               MapLocationAddressResponse$LocationAddress mCity = mAddress1.mCity;
                               if (mCity != null) {
                                  str = mCity;
                               }
                            }
                         }
                      }
                      StringBuilder str1 = "kwai://kds/react/bottom_sheet?bundleId=SocialNearbyMap&componentName=MomentDialog&height=1.0&bgColor=%2300000000&maskOpacity=0"+"&roleInfo="+this.h1+"&latitude=";
                      MapRolePresenter tK1 = this.K;
                      if (tK1 != null) {
                         c f2 = tK1.f;
                         if (f2 != null) {
                            MapCenterInfo mCurrentCent = f2.mCurrentCenterLatLng;
                            if (mCurrentCent != null) {
                               Double uDouble = Double.valueOf(mCurrentCent.a);
                            label_0062 :
                               str1 = str1+uDouble+"&longitude=";
                               tK1 = this.K;
                               if (tK1 != null) {
                                  f2 = tK1.f;
                                  if (f2 != null) {
                                     mCurrentCent = f2.mCurrentCenterLatLng;
                                     if (mCurrentCent != null) {
                                        uDouble = Double.valueOf(mCurrentCent.b);
                                     label_007e :
                                        a.b(b.j(context, str1+uDouble+"&province_name="+mProvince+"&city_name="+str), null);
                                     }
                                  }
                               }
                               objArray = null;
                               goto label_007e ;
                            }
                         }
                      }
                      objArray = null;
                      goto label_0062 ;
                   }
                }
             }
          }
          mProvince = str;
          goto label_0026 ;
       }
       return;
    }
    public final void a9(MapRoleInfoResponse p0){
       b uob;
       if (PatchProxy.applyVoidOneRefs(p0, this, MapRolePresenter.class, "21")) {
          return;
       }
       Context context = this.getContext();
       if (context != null) {
          String str = a.a.q(p0);
          a.o(str, "Gsons.KWAI_GSON.toJson\(roleInfo\)");
          StringBuilder str1 = "kwai://krn?bundleId=SocialNearbyMap&componentName=RoleSetting&themeStyle=1"+"&roleInfo="+str;
          str1 = str1+"&latitude=";
          MapRolePresenter tK = this.K;
          if (tK != null) {
             c f = tK.f;
             if (f != null) {
                MapCenterInfo mCurrentCent = f.mCurrentCenterLatLng;
                if (mCurrentCent != null) {
                   Double uDouble = Double.valueOf(mCurrentCent.a);
                label_0048 :
                   str1 = str1+uDouble+"&longitude=";
                   tK = this.K;
                   if (tK != null) {
                      f = tK.f;
                      if (f != null) {
                         mCurrentCent = f.mCurrentCenterLatLng;
                         if (mCurrentCent != null) {
                            uDouble = Double.valueOf(mCurrentCent.b);
                         label_0064 :
                            a.b(b.j(context, str1+uDouble+"&localMapCurrentState=true"), null);
                         }
                      }
                   }
                   uob = null;
                   goto label_0064 ;
                }
             }
          }
          uob = null;
          goto label_0048 ;
       }
       return;
    }
    public final void b9(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MapRolePresenter.class, "15")) {
          return;
       }
       a.a.d(p0, this.H, new MapRolePresenter$i(this));
       MapRolePresenter tD = this.D;
       if (tD == null) {
          a.S("mRoleCoverImageView");
       }
       tD.setAlpha(0);
       return;
    }
    public final void c9(){
       if (PatchProxy.applyVoid(null, this, MapRolePresenter.class, "7")) {
          return;
       }
       this.b1 = Integer.valueOf(0);
       MapRolePresenter tX = this.X;
       if (tX != null) {
          tX.f();
       }
       return;
    }
    public final void d9(MapLogger$MapState p0,String p1,MapLogger$CardStatus p2,boolean p3){
       if (PatchProxy.isSupport(MapRolePresenter.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, MapRolePresenter.class, "29")) {
          return;
       }
       if (this.O == null) {
          MapRolePresenter tG = this.G;
          if (tG == null) {
             a.S("mFragment");
          }
          MapLogger.h(p0, tG, null, MapLogger$ClickState.CLICK, p1, MapLogger$CardState.MAIN_STATE, p2, p3);
          this.O = true;
       }
       return;
    }
    public void doBindView(View p0){
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, MapRolePresenter.class, "2")) {
          return;
       }
       a.p(p0, "view");
       this.F = p0;
       this.J = p0.findViewById(0x7f0a3693);
       view = p0.findViewById(R.id.enable_role);
       a.o(view, "view.findViewById\(R.id.enable_role\)");
       this.p = view;
       view = p0.findViewById(R.id.no_enable_role);
       a.o(view, "view.findViewById\(R.id.no_enable_role\)");
       this.s = view;
       view = p0.findViewById(R.id.view_bubble);
       a.o(view, "view.findViewById\(R.id.view_bubble\)");
       this.q = view;
       view = p0.findViewById(R.id.bubble_title);
       a.o(view, "view.findViewById\(R.id.bubble_title\)");
       this.t = view;
       view = p0.findViewById(R.id.cover_image);
       a.o(view, "view.findViewById\(R.id.cover_image\)");
       this.B = view;
       view = View.inflate(this.getContext(), R.layout.arg_RES_7f0d0899, null);
       a.o(view, "View.inflate\(context, R.¡­layout_role_layout, null\)");
       this.C = view;
       view = p0.findViewById(R.id.role_cover_image);
       a.o(view, "view.findViewById\(R.id.role_cover_image\)");
       this.D = view;
       view = p0.findViewById(R.id.cl_role);
       a.o(view, "view.findViewById\(R.id.cl_role\)");
       this.E = view;
       p0 = p0.findViewById(R.id.iv_add_role);
       a.o(p0, "view.findViewById\(R.id.iv_add_role\)");
       this.A = p0;
       p0 = m1.f(this.m8(), R.id.btn_moment);
       a.o(p0, "ViewBindUtils.bindWidget¡­ootView, R.id.btn_moment\)");
       this.Z = p0;
       String str = "mMomentBtn";
       if (p0 == null) {
          a.S(str);
       }
       w0.a(p0, 0x3f000000);
       MapRolePresenter tZ = this.Z;
       if (tZ == null) {
          a.S(str);
       }
       tZ.setVisibility(0);
       tZ = this.Z;
       if (tZ == null) {
          a.S(str);
       }
       tZ.setOnClickListener(new MapRolePresenter$c(this));
       if (MapExperimentUtils.g.e()) {
          tZ = this.Z;
          if (tZ == null) {
             a.S(str);
          }
          MapRolePresenter tZ1 = this.Z;
          if (tZ1 == null) {
             a.S(str);
          }
          ViewGroup$LayoutParams layoutParams = tZ1.getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
          MapRolePresenter tg1 = this.g1;
          layoutParams.height = tg1;
          layoutParams.width = tg1;
          layoutParams.topMargin = j.b();
          tZ.setLayoutParams(layoutParams);
          tZ = this.Z;
          if (tZ == null) {
             a.S(str);
          }
          tZ.setImageDrawable(a1.f(R.drawable.arg_RES_7f081644));
       }
       return;
    }
    public final void e9(MapRoleInfoResponse p0,boolean p1){
       String obj1;
       View[] viewArray;
       MapRolePresenter p;
       MapLogger$MapState mAP_MY_HUMAN;
       boolean b = this;
       MapRolePresenter obj = p0;
       boolean b1 = p1;
       MapRolePresenter mapRolePrese = MapRolePresenter.class;
       if (PatchProxy.isSupport(mapRolePrese) && PatchProxy.applyVoidTwoRefs(obj, Boolean.valueOf(p1), b, mapRolePrese, "10")) {
          return;
       }
       MapRolePresenter l = b.L;
       if (l != null) {
          l.mMoment = obj.mMoment;
       }
       if (l != null) {
          int i = 3;
          if (b.Y == null) {
             b.Y = true;
             obj = b.G;
             if (obj == null) {
                a.S("mFragment");
             }
             obj1 = null;
             if (!PatchProxy.applyVoidOneRefs(obj, obj1, MapLogger.class, "28")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "NOW_CARD";
                u1.C0("3962506", obj, i, uElementPack, obj1);
             }
          }
          String str = a.a.q(l);
          a.o(str, "Gsons.KWAI_GSON.toJson\(roleInfo\)");
          b.h1 = str;
          obj = b.q;
          if (obj == null) {
             a.S("mBubbleView");
          }
          m1.a(obj, new MapRolePresenter$j(l, b, b1), R.id.view_bubble);
          String str1 = "mRoleLocationIcon";
          obj1 = "mEnableRoleView";
          if (l.mRole != null) {
             if (b.a1 == null) {
                obj = b.K;
                if (obj != null) {
                   c f = obj.f;
                   if (f != null && f.isFromNearEnter() == true) {
                   label_00e7 :
                      b.h9(l);
                      b.W0 = false;
                      b.X0 = false;
                      this.c9();
                   }
                }
                if (b.Z0 != null) {
                   viewArray = new View[i];
                   p = b.p;
                   if (p == null) {
                      a.S(obj1);
                   }
                   viewArray[0] = p;
                   p = b.s;
                   if (p == null) {
                      a.S("mNoEnableRoleView");
                   }
                   viewArray[1] = p;
                   viewArray[2] = b.J;
                   n.Z(8, viewArray);
                   obj = b.Z0;
                   a.m(obj);
                   p = b.C;
                   if (p == null) {
                      a.S(str1);
                   }
                   b.W8(obj, p, 2);
                   b.W0 = true;
                   b.X0 = false;
                }else {
                   viewArray = new View[i];
                   p = b.p;
                   if (p == null) {
                      a.S(obj1);
                   }
                   viewArray[0] = p;
                   p = b.s;
                   if (p == null) {
                      a.S("mNoEnableRoleView");
                   }
                   viewArray[1] = p;
                   viewArray[2] = b.J;
                   n.Z(8, viewArray);
                   b.W0 = false;
                   b.X0 = true;
                   this.c9();
                }
             }else {
                goto label_00e7 ;
             }
             mAP_MY_HUMAN = MapLogger$MapState.MAP_MY_HUMANOID;
          }else {
             viewArray = new View[i];
             p = b.p;
             if (p == null) {
                a.S(obj1);
             }
             viewArray[0] = p;
             p = b.s;
             if (p == null) {
                a.S("mNoEnableRoleView");
             }
             viewArray[1] = p;
             viewArray[2] = b.J;
             n.Z(8, viewArray);
             obj = b.Z0;
             if (obj != null) {
                a.m(obj);
                p = b.C;
                if (p == null) {
                   a.S(str1);
                }
                b.W8(obj, p, true);
                b.W0 = true;
                b.X0 = false;
             }else {
                b.X0 = true;
             }
             obj = b.s;
             if (obj == null) {
                a.S("mNoEnableRoleView");
             }
             m1.a(obj, new MapRolePresenter$k(l, b, b1), R.id.no_enable_role);
             mAP_MY_HUMAN = MapLogger$MapState.MAP_MY_HUMANOID_UNSET;
          }
          b.c1 = mAP_MY_HUMAN;
          MapRoleInfoResponse mMoment = l.mMoment;
          if (mMoment != null && b1) {
             b.j9(mMoment.mMessage);
          }
          String str2 = i.a(l.mRole, l.mMoment);
          MapRolePresenter c1 = b.c1;
          MapLogger$CardStatus vIRTUAL_IMAG = (l.mRole != null)? MapLogger$CardStatus.VIRTUAL_IMAGE: MapLogger$CardStatus.ONLINE;
          MapLogger$CardStatus uCardStatus = vIRTUAL_IMAG;
          boolean b2 = (l.mMoment != null && b1)? true: false;
          if (PatchProxy.isSupport(mapRolePrese) && (!PatchProxy.applyVoidFourRefs(c1, str2, uCardStatus, Boolean.valueOf(b2), this, MapRolePresenter.class, "28") && b.N == null)) {
             MapRolePresenter g = b.G;
             if (g == null) {
                a.S("mFragment");
             }
             MapLogger.i(c1, g, null, str2, MapLogger$CardState.MAIN_STATE, uCardStatus, b2);
             b.N = true;
          }
          this.X8();
       }
       return;
    }
    public final void h9(MapRoleInfoResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MapRolePresenter.class, "23")) {
          return;
       }
       int i = 1;
       View[] viewArray = new View[i];
       viewArray[0] = this.J;
       n.Z(0, viewArray);
       viewArray = new View[i];
       MapRolePresenter tp = this.p;
       if (tp == null) {
          a.S("mEnableRoleView");
       }
       viewArray[0] = tp;
       n.Z(0, viewArray);
       int i1 = 8;
       View[] viewArray1 = new View[i];
       MapRolePresenter ts = this.s;
       if (ts == null) {
          a.S("mNoEnableRoleView");
       }
       viewArray1[0] = ts;
       n.Z(i1, viewArray1);
       View[] viewArray2 = new View[i];
       MapRolePresenter tD = this.D;
       String str = "mRoleCoverImageView";
       if (tD == null) {
          a.S(str);
       }
       viewArray2[0] = tD;
       n.Z(0, viewArray2);
       MapRolePresenter tD1 = this.D;
       if (tD1 == null) {
          a.S(str);
       }
       MapRoleInfoResponse mRole = p0.mRole;
       NearbyMapFeed$RoleInfo$Role mImage = (mRole != null)? mRole.mImage: null;
       tD1.L(mImage);
       String str1 = "mRootView";
       if (this.H == null) {
          tD1 = this.F;
          if (tD1 == null) {
             a.S(str1);
          }
          this.H = tD1.findViewById(0x7f0a3694);
       }
       if (this.I == null) {
          tD1 = this.F;
          if (tD1 == null) {
             a.S(str1);
          }
          this.I = tD1.findViewById(0x7f0a1235);
       }
       tD1 = this.E;
       if (tD1 == null) {
          a.S("mRoleView");
       }
       m1.a(tD1, new MapRolePresenter$l(this, p0), R.id.cl_role);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, MapRolePresenter.class, "1")) {
          return;
       }
       c obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.G = obj;
       this.M = this.r8("PHOTO_MAP_MY_ROLE_ANIMATION_MANAGER");
       obj = this.r8("PHOTO_MAP_MAP_PAGE_STATE");
       this.K = obj;
       this.T = obj.a;
       Object obj1 = this.r8("PHOTO_MAP_MAP_LOCATION_UPDATE");
       a.o(obj1, "inject\(PhotoMapAccessId.MAP_LOCATION_UPDATE\)");
       this.V = obj1;
       obj1 = this.r8("PHOTO_MAP_MAP_LOCATION_BUTTON_CLICK");
       a.o(obj1, "inject\(PhotoMapAccessId.MAP_LOCATION_BUTTON_CLICK\)");
       this.W = obj1;
       this.X = this.r8("PHOTO_MAP_MAP_FEED_DATA_MANAGER");
       this.U0 = this.t8("PHOTO_MAP_MAP_MOMENT_CONTROL");
       return;
    }
    public final void j9(String p0){
       View[] viewArray;
       MapRolePresenter mapRolePrese = MapRolePresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, mapRolePrese, "11")) {
          return;
       }
       if (!k.d("default") || (!MapExperimentUtils.g.e() && !TextUtils.x(p0))) {
          if (this.X0 == null) {
             this.Y0 = false;
             a.m(p0);
             if (!PatchProxy.applyVoidOneRefs(p0, this, mapRolePrese, "19")) {
                int i = 2;
                if (this.W0 != null) {
                   mapRolePrese = this.u;
                   if (mapRolePrese != null) {
                      mapRolePrese.setText(p0);
                   }
                   viewArray = new View[]{this.r};
                   n.Z(false, viewArray);
                   viewArray = new View[i];
                   mapRolePrese = this.q;
                   if (mapRolePrese == null) {
                      a.S("mBubbleView");
                   }
                   viewArray[0] = mapRolePrese;
                   viewArray[1] = this.v;
                   n.Z(8, viewArray);
                }else {
                   mapRolePrese = this.t;
                   if (mapRolePrese == null) {
                      a.S("mBubbleTitle");
                   }
                   mapRolePrese.setText(p0);
                   viewArray = new View[i];
                   viewArray[0] = this.r;
                   mapRolePrese = this.A;
                   if (mapRolePrese == null) {
                      a.S("mAddRoleView");
                   }
                   viewArray[1] = mapRolePrese;
                   n.Z(8, viewArray);
                   viewArray = new View[1];
                   mapRolePrese = this.q;
                   if (mapRolePrese == null) {
                      a.S("mBubbleView");
                   }
                   viewArray[0] = mapRolePrese;
                   n.Z(false, viewArray);
                }
             }
          }else {
             this.Y0 = true;
          }
       }
       return;
    }
}
