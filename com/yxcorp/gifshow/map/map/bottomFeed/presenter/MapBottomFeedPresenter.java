package com.yxcorp.gifshow.map.map.bottomFeed.presenter.MapBottomFeedPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.map.map.bottomFeed.presenter.MapBottomFeedPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.map.map.bottomFeed.presenter.MapBottomFeedPresenter$d;
import com.yxcorp.gifshow.map.map.bottomFeed.presenter.MapBottomFeedPresenter$f;
import com.yxcorp.gifshow.map.map.bottomFeed.presenter.MapBottomFeedPresenter$e;
import com.yxcorp.gifshow.map.map.bottomFeed.presenter.MapBottomFeedPresenter$pageListObserver$1;
import com.yxcorp.gifshow.map.map.bottomFeed.presenter.MapBottomFeedPresenter$b;
import android.widget.LinearLayout;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import qvb.q;
import qvb.a;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout;
import k6b.j;
import com.yxcorp.widget.selector.view.RoundedRelativeLayout$c;
import com.yxcorp.widget.selector.view.RoundedRelativeLayout;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Objects;
import com.google.android.material.bottomsheet.MapBottomSheetBehavior;
import c6b.b;
import com.google.android.material.bottomsheet.BottomSheetBehavior$c;
import com.kwai.kds.krn.api.page.KwaiRnFragment;
import g6b.c;
import com.yxcorp.gifshow.map.map.model.MapCenterInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.nearby.common.citymap.NearbyCityNameMapManager;
import lnc.a1;
import com.yxcorp.gifshow.map.data.model.MapLocationAddressResponse$LocationAddress;
import com.yxcorp.gifshow.nearby.common.map.MapExperimentUtils;
import java.lang.StringBuilder;
import f07.b;
import java.lang.Double;
import zj0.x;
import ps6.e;
import android.net.Uri;
import xkd.b;
import android.net.Uri$Builder;
import zf6.k;
import com.kuaishou.krn.model.LaunchModel;
import at6.a;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import brd.t;
import xl8.b;
import com.yxcorp.gifshow.map.map.bottomFeed.presenter.MapBottomFeedPresenter$g;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import com.kuaishou.krn.event.a;
import oj0.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.kuaishou.krn.event.KrnLifeCycleEvent;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.map.map.bottomFeed.presenter.MapBottomFeedPresenter$h;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import com.yxcorp.gifshow.map.map.bottomFeed.model.RnFeedParamsModel;
import g6b.b;
import java.util.Map;
import k6b.b;
import js6.a;
import android.content.Context;
import u5b.a;
import q87.c;
import ekd.m1;
import com.yxcorp.widget.selector.view.SelectShapeFrameLayout;
import com.yxcorp.widget.selector.view.SelectShapeView;
import bld.b;
import android.graphics.Color;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.yxcorp.gifshow.map.map.bottomFeed.presenter.MapBottomFeedPresenter$c;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import y5b.a;
import com.kuaishou.krn.event.KrnLifeCycleEvent$EventType;
import java.lang.Boolean;
import c6b.a;
import java.lang.Enum;

public final class MapBottomFeedPresenter extends PresenterV2	// class@001c8f
{
    public boolean A;
    public boolean B;
    public final a C;
    public MapBottomFeedPresenter$f D;
    public MapBottomFeedPresenter$e E;
    public final MapBottomFeedPresenter$pageListObserver$1 F;
    public final a G;
    public c p;
    public BaseFragment q;
    public a r;
    public SelectShapeFrameLayout s;
    public SelectShapeView t;
    public LinearLayout u;
    public RoundedRelativeLayout v;
    public MapBottomSheetBehavior w;
    public RnFeedParamsModel x;
    public boolean y;
    public boolean z;
    public static final MapBottomFeedPresenter$a H;

    static {
       MapBottomFeedPresenter.H = new MapBottomFeedPresenter$a(null);
    }
    public void MapBottomFeedPresenter(){
       super();
       this.C = new MapBottomFeedPresenter$d(this);
       this.D = new MapBottomFeedPresenter$f(this);
       this.E = new MapBottomFeedPresenter$e();
       this.F = new MapBottomFeedPresenter$pageListObserver$1(this);
       this.G = new MapBottomFeedPresenter$b(this);
    }
    public static final LinearLayout P8(MapBottomFeedPresenter p0){
       p0 = p0.u;
       if (p0 == null) {
          a.S("bgView");
       }
       return p0;
    }
    public void E8(){
       c f;
       MapCenterInfo mDefaultTitl;
       MapLocationAddressResponse$LocationAddress mProvince;
       MapLocationAddressResponse$LocationAddress locationAddr;
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MapBottomFeedPresenter mapBottomFee = MapBottomFeedPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, mapBottomFee, "5")) {
          return;
       }
       MapBottomFeedPresenter ts = this.s;
       String str = "mBottomSheetContainer";
       if (ts == null) {
          a.S(str);
       }
       ts.setVisibility(0);
       if (!PatchProxy.applyVoid(objArray, this, mapBottomFee, "7")) {
          ts = this.r;
          if (ts != null) {
             ts.h(this.F);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, mapBottomFee, "9")) {
          ts = this.v;
          if (ts == null) {
             a.S("mFeedContainer");
          }
          ts.getLayoutParams().height = (int)((double)j.c() * 0x3fe851eb851eb852);
          ts.setRadiusDirection(RoundedRelativeLayout$c.c);
          ts = this.s;
          if (ts == null) {
             a.S(str);
          }
          BottomSheetBehavior uBottomSheet = BottomSheetBehavior.from(ts);
          Objects.requireNonNull(uBottomSheet, "null cannot be cast to non-null type com.google.android.material.bottomsheet.MapBottomSheetBehavior<com.yxcorp.widget.selector.view.SelectShapeFrameLayout!>");
          this.w = uBottomSheet;
          uBottomSheet.setBottomSheetCallback(new b(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, mapBottomFee, "8")) {
          KwaiRnFragment kwaiRnFragme = PatchProxy.apply(objArray, this, mapBottomFee, "11");
          if (kwaiRnFragme != patchProxyRe) {
          }else {
             ts = this.p;
             if (ts != null) {
                c f1 = ts.f;
                if (f1 != null) {
                   mDefaultTitl = f1.mDefaultTitle;
                label_0095 :
                   String str1 = PatchProxy.applyOneRefs(mDefaultTitl, this, mapBottomFee, "13");
                   if (str1 != patchProxyRe) {
                   }else if(TextUtils.x(mDefaultTitl) || a.g("NULL", mDefaultTitl)){
                      str1 = a1.p(R.string.arg_RES_7f103c33);
                      a.o(str1, "CommonUtil.string\(R.string.photo_map_select_city\)");
                   }else {
                      a.m(mDefaultTitl);
                      str1 = NearbyCityNameMapManager.c.b(mDefaultTitl);
                   }
                   ts = this.p;
                   str = "";
                   if (ts != null) {
                      c f2 = ts.f;
                      if (f2 != null) {
                         MapCenterInfo mAddress = f2.mAddress;
                         if (mAddress != null) {
                            mProvince = mAddress.mProvince;
                            if (mProvince != null) {
                            label_00d9 :
                               if (ts != null) {
                                  f1 = ts.f;
                                  if (f1 != null) {
                                     mDefaultTitl = f1.mAddress;
                                     if (mDefaultTitl != null) {
                                        MapLocationAddressResponse$LocationAddress mCity = mDefaultTitl.mCity;
                                        if (mCity != null) {
                                           locationAddr = mCity;
                                        }
                                     }
                                  }
                               }
                               MapExperimentUtils g = MapExperimentUtils.g;
                               boolean b = g.e();
                               boolean b1 = g.a();
                               StringBuilder str2 = "kwai://krn?bundleId=SocialNearbyMap&componentName=MapFeedList&themeStyle=1"+"&province_name="+mProvince+"&city_name="+locationAddr+"&displayCity="+str1+"&newMapFeature="+b+"&latitude=";
                               mapBottomFee = this.p;
                               if (mapBottomFee != null) {
                                  f = mapBottomFee.f;
                                  if (f != null) {
                                     MapCenterInfo mCurrentCent = f.mCurrentCenterLatLng;
                                     if (mCurrentCent != null) {
                                        Double uDouble = Double.valueOf(mCurrentCent.a);
                                     label_0135 :
                                        str2 = str2+uDouble+"&longitude=";
                                        mapBottomFee = this.p;
                                        if (mapBottomFee != null) {
                                           f = mapBottomFee.f;
                                           if (f != null) {
                                              mCurrentCent = f.mCurrentCenterLatLng;
                                              if (mCurrentCent != null) {
                                                 uDouble = Double.valueOf(mCurrentCent.b);
                                              label_0151 :
                                                 str2 = str2+uDouble+"&roamingCityId=";
                                                 mapBottomFee = this.p;
                                                 f = (mapBottomFee != null)? mapBottomFee.u: objArray;
                                                 kwaiRnFragme = new KwaiRnFragment();
                                                 kwaiRnFragme.Gg(this.D);
                                                 kwaiRnFragme.ah(this.E);
                                                 Uri uri = b.g(str2+f+"&autoShowMapFeed="+b1);
                                                 if (uri != null) {
                                                    Uri$Builder uBuilder = uri.buildUpon();
                                                    uBuilder.appendQueryParameter("enableBackBtnHandler", "false");
                                                    str = (k.d())? "#FF19191E": "#FFFFFFFF";
                                                    uBuilder.appendQueryParameter("bgColor", str);
                                                    uBuilder.appendQueryParameter("containerSource", "Nearby");
                                                    uri = uBuilder.build();
                                                    a.o(uri, "uriBuilder.build\(\)");
                                                    Bundle uBundle = new Bundle();
                                                    uBundle.putParcelable("rn_launch_model", a.a(uri));
                                                    kwaiRnFragme.setArguments(uBundle);
                                                 }else {
                                                    kwaiRnFragme = objArray;
                                                 }
                                              }
                                           }
                                        }
                                        objArray1 = objArray;
                                        goto label_0151 ;
                                     }
                                  }
                               }
                               objArray1 = objArray;
                               goto label_0135 ;
                            }
                         }
                      }
                   }
                   mProvince = str;
                   goto label_00d9 ;
                }
             }
             mDefaultTitl = objArray;
             goto label_0095 ;
          }
          if (kwaiRnFragme != null) {
             mapBottomFee = this.q;
             if (mapBottomFee == null) {
                a.S("mFragment");
             }
             e uoe = mapBottomFee.getChildFragmentManager().beginTransaction();
             uoe.v(R.id.map_chat_feed_container, kwaiRnFragme);
             uoe.n();
          }
          if (MapExperimentUtils.g.a()) {
             mapBottomFee = this.p;
             if (mapBottomFee != null) {
                f = mapBottomFee.f;
                if (f != null && f.isFromNearEnter() == true) {
                   mapBottomFee = this.w;
                   if (mapBottomFee != null) {
                      mapBottomFee.setState(3);
                   }
                }
             }
          }
       }
    label_01fe :
       mapBottomFee = this.p;
       if (mapBottomFee != null) {
          t ot = PatchProxy.apply(objArray, mapBottomFee, c.class, "6");
          if (ot != patchProxyRe) {
          }else {
             ot = mapBottomFee.y.c();
          }
          if (ot != null) {
             b uob = ot.subscribe(new MapBottomFeedPresenter$g(this), Functions.e);
             if (uob != null) {
                this.X7(uob);
             }
          }
       }
    label_0227 :
       a.b().a("MAP_OPEN_FEED_PANEL", this.C);
       a.b().a("MAP_OPEN_GREET_DIALOG", this.C);
       this.X7(RxBus.f.f(KrnLifeCycleEvent.class).observeOn(d.a).subscribe(new MapBottomFeedPresenter$h(this)));
       return;
    }
    public void F8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MapBottomFeedPresenter.class, "2")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity instanceof GifshowActivity) {
          objArray = activity;
       }
       if (objArray != null) {
          objArray.F2(this.G);
       }
       return;
    }
    public void H8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MapBottomFeedPresenter.class, "12")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity instanceof GifshowActivity) {
          objArray = activity;
       }
       if (objArray != null) {
          objArray.l3(this.G);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, MapBottomFeedPresenter.class, "10")) {
          return;
       }
       MapBottomFeedPresenter tr = this.r;
       if (tr != null) {
          tr.f(this.F);
       }
       tr = this.w;
       if (tr != null) {
          tr.d();
       }
       a.b().c("MAP_OPEN_FEED_PANEL", this.C);
       a.b().c("MAP_OPEN_GREET_DIALOG", this.C);
       return;
    }
    public final void R8(String p0,String p1){
       String str2;
       String str3;
       String str4;
       String str5;
       c u;
       String str7;
       String str8;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MapBottomFeedPresenter.class, "1")) {
          return;
       }
       MapBottomFeedPresenter tp = this.p;
       String str = "0";
       if (tp != null) {
          c b = tp.b;
          if (b != null) {
             String str1 = String.valueOf(b.a);
             if (str1 != null) {
                str2 = str1;
             label_0022 :
                tp = this.p;
                if (tp != null) {
                   b = tp.b;
                   if (b != null) {
                      str1 = String.valueOf(b.b);
                      if (str1 != null) {
                         str3 = str1;
                      label_0035 :
                         tp = this.p;
                         if (tp != null) {
                            b = tp.e;
                            if (b != null) {
                               str1 = String.valueOf(b.a);
                               if (str1 != null) {
                                  str4 = str1;
                               label_0048 :
                                  tp = this.p;
                                  if (tp != null) {
                                     b = tp.e;
                                     if (b != null) {
                                        str1 = String.valueOf(b.b);
                                        if (str1 != null) {
                                           str5 = str1;
                                        label_005b :
                                           String str6 = b.a(b.b.b());
                                           tp = this.p;
                                           if (tp != null) {
                                              u = tp.u;
                                              if (u != null) {
                                              label_0070 :
                                                 c uoc = u;
                                                 if (tp != null) {
                                                    b = tp.f;
                                                    if (b != null) {
                                                       MapCenterInfo mCurrentCent = b.mCurrentCenterLatLng;
                                                       if (mCurrentCent != null) {
                                                          str1 = String.valueOf(mCurrentCent.a);
                                                          if (str1 != null) {
                                                             str7 = str1;
                                                          label_0086 :
                                                             tp = this.p;
                                                             if (tp != null) {
                                                                b = tp.f;
                                                                if (b != null) {
                                                                   mCurrentCent = b.mCurrentCenterLatLng;
                                                                   if (mCurrentCent != null) {
                                                                      str1 = String.valueOf(mCurrentCent.b);
                                                                      if (str1 != null) {
                                                                         str8 = str1;
                                                                      label_009d :
                                                                         RnFeedParamsModel rnFeedParams = new RnFeedParamsModel(str2, str3, str4, str5, str6, p0, p1, uoc, str7, str8);
                                                                         this.x = v0;
                                                                         if (this.y == null) {
                                                                            this.z = true;
                                                                         }else {
                                                                            a.b.pt(this.getContext(), "REFRESH_FEED_DATA", v0);
                                                                            Object[] objArray = new Object[0];
                                                                            a.c.w("MapBottomFeedRefreshEvent", "dataToRnDetailList="+String.valueOf(this.x), objArray);
                                                                         }
                                                                         return;
                                                                      }
                                                                   }
                                                                }
                                                             }
                                                             str8 = str;
                                                             goto label_009d ;
                                                          }
                                                       }
                                                    }
                                                 }
                                                 str7 = str;
                                                 goto label_0086 ;
                                              }
                                           }
                                           u = "";
                                           goto label_0070 ;
                                        }
                                     }
                                  }
                                  str5 = str;
                                  goto label_005b ;
                               }
                            }
                         }
                         str4 = str;
                         goto label_0048 ;
                      }
                   }
                }
                str3 = str;
                goto label_0035 ;
             }
          }
       }
       str2 = str;
       goto label_0022 ;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MapBottomFeedPresenter.class, "3")) {
          return;
       }
       View view = m1.f(p0, R.id.map_bottom_sheet);
       a.o(view, "ViewBindUtils.bindWidget¡­w, R.id.map_bottom_sheet\)");
       this.s = view;
       view = m1.f(p0, R.id.map_chat_feed_container);
       a.o(view, "ViewBindUtils.bindWidget¡­.map_chat_feed_container\)");
       this.v = view;
       view = m1.f(p0, R.id.bgView);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.bgView\)");
       this.u = view;
       p0 = m1.f(p0, R.id.drag_view);
       a.o(p0, "ViewBindUtils.bindWidget\(rootView, R.id.drag_view\)");
       this.t = p0;
       if (p0 == null) {
          a.S("mDragView");
       }
       b uob = new b();
       String str = (k.d())? "#3D3D42": "#EFEFEF";
       uob.v(Color.parseColor(str));
       uob.g(KwaiRadiusStyles.FULL);
       p0.setBackground(uob.a());
       MapBottomFeedPresenter tu = this.u;
       if (tu == null) {
          a.S("bgView");
       }
       tu.setOnTouchListener(new MapBottomFeedPresenter$c(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, MapBottomFeedPresenter.class, "4")) {
          return;
       }
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.q = obj;
       this.p = this.r8("PHOTO_MAP_MAP_PAGE_STATE");
       this.r = this.t8("PHOTO_MAP_FEED_PAGE_LIST");
       return;
    }
    public final void onReceivedKrnLifeCycleEvent(KrnLifeCycleEvent p0){
       int b;
       MapBottomFeedPresenter tw;
       MapBottomFeedPresenter mapBottomFee = MapBottomFeedPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, mapBottomFee, "14")) {
          return;
       }
       LaunchModel launchModel = null;
       KrnLifeCycleEvent$EventType uEventType = (p0 != null)? p0.a(): launchModel;
       if (p0 != null) {
          launchModel = p0.b();
       }
       if (uEventType != null && (launchModel != null && (launchModel.a() != null && launchModel.b() != null))) {
          Object obj = PatchProxy.applyOneRefs(launchModel, this, mapBottomFee, "15");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(a.g(launchModel.a(), "SocialNearbyMap") && a.g(launchModel.b(), "GreetingDialog")){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             KrnLifeCycleEvent$EventType uEventType1 = p0.a();
             if (uEventType1 != null) {
                int i = a.a[uEventType1.ordinal()];
                b = 3;
                if (i != 1) {
                   if (i == 2 && this.B != null) {
                      this.B = false;
                      tw = this.w;
                      if (tw != null) {
                         tw.setState(b);
                      }
                   }
                }else if(this.A != null){
                   tw = this.w;
                   if (tw != null && tw.getState() == b) {
                      this.B = true;
                      tw = this.w;
                      if (tw != null) {
                         tw.setState(4);
                      }
                      this.A = false;
                   }
                }
             }
          }
       }
    label_009a :
       return;
    }
}
