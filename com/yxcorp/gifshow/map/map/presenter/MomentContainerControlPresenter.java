package com.yxcorp.gifshow.map.map.presenter.MomentContainerControlPresenter;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.map.map.presenter.MomentContainerControlPresenter$a;
import nsd.u;
import g6b.d;
import java.util.concurrent.atomic.AtomicInteger;
import com.yxcorp.gifshow.map.map.presenter.MomentContainerControlPresenter$d;
import com.yxcorp.gifshow.map.map.presenter.MomentContainerControlPresenter$b;
import com.yxcorp.gifshow.map.map.presenter.MomentContainerControlPresenter$krnCloseHandler$1;
import android.widget.LinearLayout;
import java.lang.String;
import kotlin.jvm.internal.a;
import g6b.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.event.a;
import oj0.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.kuaishou.krn.event.KrnLifeCycleEvent;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.map.map.presenter.MomentContainerControlPresenter$e;
import erd.g;
import crd.b;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout;
import k6b.j;
import com.yxcorp.widget.selector.view.RoundedRelativeLayout$c;
import com.yxcorp.widget.selector.view.RoundedRelativeLayout;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Objects;
import com.google.android.material.bottomsheet.MapBottomSheetBehavior;
import j6b.l0;
import com.google.android.material.bottomsheet.BottomSheetBehavior$c;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.map.map.presenter.MomentContainerControlPresenter$f;
import io.reactivex.internal.functions.Functions;
import j6b.m0;
import java.lang.Runnable;
import ekd.k1;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import java.lang.Boolean;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.kwai.kds.krn.api.page.KwaiRnFragment;
import com.yxcorp.gifshow.map.map.model.MapCenterInfo;
import com.yxcorp.gifshow.map.data.model.MapLocationAddressResponse$LocationAddress;
import g6b.b;
import java.util.Map;
import k6b.b;
import java.net.URLEncoder;
import com.yxcorp.gifshow.nearby.common.map.MapExperimentUtils;
import java.lang.StringBuilder;
import f07.b;
import java.lang.Double;
import ik0.a;
import android.net.Uri;
import xkd.b;
import android.net.Uri$Builder;
import zf6.k;
import com.kuaishou.krn.model.LaunchModel;
import at6.a;
import android.os.Bundle;
import android.os.Parcelable;
import android.content.Context;
import xh7.b;
import qh7.b;
import qh7.a;
import ekd.m1;
import com.yxcorp.widget.selector.view.SelectShapeFrameLayout;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.map.map.presenter.MomentContainerControlPresenter$c;
import android.view.View$OnClickListener;
import j6b.p0;
import java.util.HashMap;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import xl8.b;
import com.kuaishou.krn.event.KrnLifeCycleEvent$EventType;
import j6b.k0;
import java.lang.Enum;

public final class MomentContainerControlPresenter extends PresenterV2 implements g	// class@001cbe
{
    public AtomicInteger A;
    public final a B;
    public final a C;
    public final MomentContainerControlPresenter$krnCloseHandler$1 D;
    public final d p;
    public c q;
    public BaseFragment r;
    public b s;
    public SelectShapeFrameLayout t;
    public LinearLayout u;
    public RoundedRelativeLayout v;
    public MapBottomSheetBehavior w;
    public KwaiRnFragment x;
    public boolean y;
    public String z;
    public static final MomentContainerControlPresenter$a E;

    static {
       MomentContainerControlPresenter.E = new MomentContainerControlPresenter$a(null);
    }
    public void MomentContainerControlPresenter(){
       super();
       this.p = new d();
       this.z = "TOP_FUNC";
       this.A = new AtomicInteger(0);
       this.B = new MomentContainerControlPresenter$d(this);
       this.C = new MomentContainerControlPresenter$b(this);
       this.D = new MomentContainerControlPresenter$krnCloseHandler$1(this);
    }
    public static final LinearLayout P8(MomentContainerControlPresenter p0){
       p0 = p0.u;
       if (p0 == null) {
          a.S("bgView");
       }
       return p0;
    }
    public static final c R8(MomentContainerControlPresenter p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("mMapPageState");
       }
       return p0;
    }
    public void E8(){
       MomentContainerControlPresenter tp;
       MomentContainerControlPresenter momentContai = MomentContainerControlPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, momentContai, "4")) {
          return;
       }
       a.b().a("SocialNearbyMap_selectUser", this.B);
       this.X7(RxBus.f.f(KrnLifeCycleEvent.class).observeOn(d.a).subscribe(new MomentContainerControlPresenter$e(this)));
       if (!PatchProxy.applyVoid(objArray, this, momentContai, "9") && !this.W8()) {
          tp = this.v;
          if (tp == null) {
             a.S("mMomentFeedContainer");
          }
          tp.getLayoutParams().height = (int)j.a();
          tp.setRadiusDirection(RoundedRelativeLayout$c.c);
          tp = this.t;
          if (tp == null) {
             a.S("mBottomSheetContainer");
          }
          BottomSheetBehavior uBottomSheet = BottomSheetBehavior.from(tp);
          Objects.requireNonNull(uBottomSheet, "null cannot be cast to non-null type com.google.android.material.bottomsheet.MapBottomSheetBehavior<com.yxcorp.widget.selector.view.SelectShapeFrameLayout!>");
          this.w = uBottomSheet;
          uBottomSheet.e(true);
          uBottomSheet.setState(5);
          uBottomSheet.setBottomSheetCallback(new l0(this));
       }
       tp = this.p;
       Objects.requireNonNull(tp);
       t ot = PatchProxy.apply(objArray, tp, d.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = tp.a.hide();
          a.o(ot, "momentControl.hide\(\)");
       }
       this.X7(ot.subscribe(new MomentContainerControlPresenter$f(this), Functions.e));
       if (!PatchProxy.applyVoid(objArray, this, momentContai, "5")) {
          momentContai = this.q;
          if (momentContai == null) {
             a.S("mMapPageState");
          }
          if (momentContai.t != null) {
             if (this.W8()) {
                k1.r(new m0(this), 200);
             }else {
                this.z = "TOP_FUNC";
                this.S8(true);
                momentContai = this.w;
                if (momentContai != null) {
                   momentContai.setState(3);
                }
                momentContai = this.u;
                if (momentContai == null) {
                   a.S("bgView");
                }
                momentContai.setVisibility(0);
             }
          }
       }
       return;
    }
    public void F8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MomentContainerControlPresenter.class, "1")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity instanceof GifshowActivity) {
          objArray = activity;
       }
       if (objArray != null) {
          objArray.F2(this.C);
       }
       return;
    }
    public void H8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MomentContainerControlPresenter.class, "12")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity instanceof GifshowActivity) {
          objArray = activity;
       }
       if (objArray != null) {
          objArray.l3(this.C);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, MomentContainerControlPresenter.class, "10")) {
          return;
       }
       MomentContainerControlPresenter tw = this.w;
       if (tw != null) {
          tw.d();
       }
       a.b().c("SocialNearbyMap_selectUser", this.B);
       return;
    }
    public final void S8(boolean p0){
       boolean b;
       String str4;
       Object[] objArray1;
       MomentContainerControlPresenter momentContai = MomentContainerControlPresenter.class;
       if (PatchProxy.isSupport(momentContai) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, momentContai, "8")) {
          return;
       }
       MomentContainerControlPresenter tr = this.r;
       if (tr == null) {
          a.S("mFragment");
       }
       e uoe = tr.getChildFragmentManager().beginTransaction();
       a.o(uoe, "mFragment.childFragmentManager.beginTransaction\(\)");
       if (p0) {
          Object[] objArray = null;
          c obj = PatchProxy.apply(objArray, this, momentContai, "11");
          if (obj != PatchProxyResult.class) {
             objArray = obj;
          }else {
             momentContai = this.q;
             String str = "mMapPageState";
             if (momentContai == null) {
                a.S(str);
             }
             obj = momentContai.f;
             String str1 = "";
             if (obj != null) {
                MapCenterInfo mAddress = obj.mAddress;
                if (mAddress != null) {
                   MapLocationAddressResponse$LocationAddress mProvince = mAddress.mProvince;
                   if (mProvince != null) {
                   label_0056 :
                      MomentContainerControlPresenter tq = this.q;
                      if (tq == null) {
                         a.S(str);
                      }
                      c f = tq.f;
                      if (f != null) {
                         MapCenterInfo mAddress1 = f.mAddress;
                         if (mAddress1 != null) {
                            MapLocationAddressResponse$LocationAddress mCity = mAddress1.mCity;
                            if (mCity != null) {
                               str1 = mCity;
                            }
                         }
                      }
                      String str2 = URLEncoder.encode(b.a(b.b.b()), "utf-8");
                      b = MapExperimentUtils.g.e();
                      StringBuilder str3 = "kwai://krn?bundleId=SocialNearbyMap&componentName=NowList"+"&momentUserId=";
                      MomentContainerControlPresenter tq1 = this.q;
                      if (tq1 == null) {
                         a.S(str);
                      }
                      str3 = str3+tq1.q+"&momentUserType=";
                      tq1 = this.q;
                      if (tq1 == null) {
                         a.S(str);
                      }
                      str3 = str3+tq1.p+"&province_name="+mProvince+"&city_name="+str1+"&latitude=";
                      momentContai = this.q;
                      if (momentContai == null) {
                         a.S(str);
                      }
                      obj = momentContai.f;
                      if (obj != null) {
                         mAddress = obj.mCurrentCenterLatLng;
                         if (mAddress != null) {
                            Double uDouble = Double.valueOf(mAddress.a);
                         label_00d8 :
                            str3 = str3+uDouble+"&longitude=";
                            momentContai = this.q;
                            if (momentContai == null) {
                               a.S(str);
                            }
                            obj = momentContai.f;
                            if (obj != null) {
                               mAddress = obj.mCurrentCenterLatLng;
                               if (mAddress != null) {
                                  uDouble = Double.valueOf(mAddress.b);
                               label_00f7 :
                                  str3 = str3+uDouble+"&roamingCityId=";
                                  momentContai = this.q;
                                  if (momentContai == null) {
                                     a.S(str);
                                  }
                                  KwaiRnFragment kwaiRnFragme = new KwaiRnFragment();
                                  kwaiRnFragme.setCloseHandler(this.D);
                                  Uri uri = b.g(str3+momentContai.u+"&minBundleVersion=150"+"&from="+this.z+"&filterBoxes="+str2+"&newMapFeature="+b);
                                  if (uri != null) {
                                     Uri$Builder uBuilder = uri.buildUpon();
                                     uBuilder.appendQueryParameter("enableBackBtnHandler", "false");
                                     str4 = (k.d())? "#FF19191E": "#FFFFFFFF";
                                     uBuilder.appendQueryParameter("bgColor", str4);
                                     uBuilder.appendQueryParameter("containerSource", "Nearby");
                                     Uri uri1 = uBuilder.build();
                                     a.o(uri1, "uriBuilder.build\(\)");
                                     Bundle uBundle = new Bundle();
                                     uBundle.putParcelable("rn_launch_model", a.a(uri1));
                                     kwaiRnFragme.setArguments(uBundle);
                                     objArray = kwaiRnFragme;
                                  }
                               }
                            }
                            objArray1 = objArray;
                            goto label_00f7 ;
                         }
                      }
                      objArray1 = objArray;
                      goto label_00d8 ;
                   }
                }
             }
             str4 = str1;
             goto label_0056 ;
          }
          if (objArray != null) {
             this.x = objArray;
             uoe.f(R.id.map_moment_feed_container, objArray);
             uoe.n();
          }
       }else {
          MomentContainerControlPresenter tx = this.x;
          if (tx != null) {
             uoe.u(tx).n();
          }
       }
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, MomentContainerControlPresenter.class, "7")) {
          return;
       }
       MomentContainerControlPresenter tw = this.w;
       if (tw != null && tw.getState() == 3) {
          tw = this.w;
          if (tw != null) {
             tw.setState(5);
          }
          this.S8(false);
       }
       return;
    }
    public final boolean W8(){
       Object obj = PatchProxy.apply(null, this, MomentContainerControlPresenter.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MapExperimentUtils.g.f();
    }
    public final void X8(){
       MapLocationAddressResponse$LocationAddress mProvince;
       Object[] objArray;
       if (PatchProxy.applyVoid(null, this, MomentContainerControlPresenter.class, "6")) {
          return;
       }
       Context context = this.getContext();
       if (context != null) {
          MomentContainerControlPresenter tq = this.q;
          if (tq == null) {
             a.S("mMapPageState");
          }
          c f = tq.f;
          String str = "";
          if (f != null) {
             MapCenterInfo mAddress = f.mAddress;
             if (mAddress != null) {
                mProvince = mAddress.mProvince;
                if (mProvince != null) {
                label_002b :
                   MomentContainerControlPresenter tq1 = this.q;
                   if (tq1 == null) {
                      a.S("mMapPageState");
                   }
                   c f1 = tq1.f;
                   if (f1 != null) {
                      MapCenterInfo mAddress1 = f1.mAddress;
                      if (mAddress1 != null) {
                         MapLocationAddressResponse$LocationAddress mCity = mAddress1.mCity;
                         if (mCity != null) {
                            str = mCity;
                         }
                      }
                   }
                   StringBuilder str1 = "kwai://kds/react/bottom_sheet?bundleId=SocialNearbyMap&componentName=NewNowList&height=0.75h&bgColor=%2300000000&maskOpacity=0.3&dismissOnTouchMask=true"+"&latitude=";
                   MomentContainerControlPresenter tq2 = this.q;
                   if (tq2 == null) {
                      a.S("mMapPageState");
                   }
                   c f2 = tq2.f;
                   if (f2 != null) {
                      MapCenterInfo mCurrentCent = f2.mCurrentCenterLatLng;
                      if (mCurrentCent != null) {
                         Double uDouble = Double.valueOf(mCurrentCent.a);
                      label_0065 :
                         str1 = str1+uDouble+"&longitude=";
                         tq2 = this.q;
                         if (tq2 == null) {
                            a.S("mMapPageState");
                         }
                         f2 = tq2.f;
                         if (f2 != null) {
                            mCurrentCent = f2.mCurrentCenterLatLng;
                            if (mCurrentCent != null) {
                               uDouble = Double.valueOf(mCurrentCent.b);
                            label_0084 :
                               str1 = str1+uDouble+"&province_name="+mProvince+"&city_name="+str+"&chatroomUserId=";
                               tq = this.q;
                               if (tq == null) {
                                  a.S("mMapPageState");
                               }
                               str1 = str1+tq.r+"&extlistUserId=";
                               tq = this.q;
                               if (tq == null) {
                                  a.S("mMapPageState");
                               }
                               a.b(b.j(context, str1+tq.s+"&minBundleVersion=245&useBottomSheetV2=1"), null);
                            }
                         }
                         objArray = null;
                         goto label_0084 ;
                      }
                   }
                   objArray = null;
                   goto label_0065 ;
                }
             }
          }
          mProvince = str;
          goto label_002b ;
       }
       return;
    }
    public void doBindView(View p0){
       MomentContainerControlPresenter tt;
       if (PatchProxy.applyVoidOneRefs(p0, this, MomentContainerControlPresenter.class, "2")) {
          return;
       }
       View view = m1.f(p0, R.id.map_bottom_moment);
       a.o(view, "ViewBindUtils.bindWidget¡­, R.id.map_bottom_moment\)");
       this.t = view;
       view = m1.f(p0, R.id.map_moment_feed_container);
       a.o(view, "ViewBindUtils.bindWidget¡­ap_moment_feed_container\)");
       this.v = view;
       p0 = m1.f(p0, R.id.momentBgView);
       a.o(p0, "ViewBindUtils.bindWidget¡­tView, R.id.momentBgView\)");
       this.u = p0;
       if (!this.W8()) {
          tt = this.t;
          if (tt == null) {
             a.S("mBottomSheetContainer");
          }
          tt.setVisibility(0);
       }
       tt = this.u;
       if (tt == null) {
          a.S("bgView");
       }
       tt.setOnClickListener(new MomentContainerControlPresenter$c(this));
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MomentContainerControlPresenter.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new p0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, MomentContainerControlPresenter.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(MomentContainerControlPresenter.class, new p0());
       }else {
          obj.put(MomentContainerControlPresenter.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, MomentContainerControlPresenter.class, "3")) {
          return;
       }
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.r = obj;
       obj = this.r8("PHOTO_MAP_MAP_PAGE_STATE");
       a.o(obj, "inject\(PhotoMapAccessId.MAP_PAGE_STATE\)");
       this.q = obj;
       obj = this.r8("PHOTO_MAP_DATA_REFRESH");
       a.o(obj, "inject\(PhotoMapAccessId.DATA_REFRESH\)");
       this.s = obj;
       return;
    }
    public final void onReceivedKrnLifeCycleEvent(KrnLifeCycleEvent p0){
       int b;
       MomentContainerControlPresenter tw;
       MomentContainerControlPresenter momentContai = MomentContainerControlPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, momentContai, "13")) {
          return;
       }
       LaunchModel launchModel = null;
       KrnLifeCycleEvent$EventType uEventType = (p0 != null)? p0.a(): launchModel;
       if (p0 != null) {
          launchModel = p0.b();
       }
       if (uEventType != null && (launchModel != null && (launchModel.a() != null && launchModel.b() != null))) {
          Object obj = PatchProxy.applyOneRefs(launchModel, this, momentContai, "14");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(a.g(launchModel.a(), "SocialNearbyMap") && (a.g(launchModel.b(), "MomentDialog") || a.g(launchModel.b(), "GreetingDialog"))){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             KrnLifeCycleEvent$EventType uEventType1 = p0.a();
             if (uEventType1 != null) {
                int i = k0.a[uEventType1.ordinal()];
                b = 3;
                if (i != 1) {
                   if (i == 2 && (!this.A.decrementAndGet() && this.y != null)) {
                      this.y = false;
                      tw = this.w;
                      if (tw != null) {
                         tw.setState(b);
                      }
                   }
                }else {
                   this.A.incrementAndGet();
                   tw = this.w;
                   if (tw != null && (tw.getState() == b && !MapExperimentUtils.g.d())) {
                      this.y = true;
                      tw = this.w;
                      if (tw != null) {
                         tw.setState(5);
                      }
                   }
                }
             }
          }
       }
    label_00b5 :
       return;
    }
}
