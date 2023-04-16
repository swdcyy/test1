package d6b.d$b;
import erd.g;
import d6b.d;
import java.lang.Object;
import com.yxcorp.gifshow.map.data.model.MapEntranceBubbleResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import d6b.c;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.kwai.library.widget.popup.bubble.a;
import rm8.b;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import com.yxcorp.gifshow.map.data.model.MapEntranceBubbleResponse$BubbleConfig;
import lnc.a1;
import java.lang.CharSequence;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.widget.popup.a;
import android.app.Activity;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import android.view.View;
import com.kwai.library.widget.popup.bubble.a$c;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import com.kwai.library.widget.popup.common.c$b;
import d6b.b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import d6b.a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import java.lang.Integer;
import brd.t;
import wkd.b;
import x5b.a;
import t45.d;
import brd.z;
import cjd.e;
import erd.o;
import d6b.i;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.nearby.common.model.PhotoMapPreLoadData$CenterLocationLatLng;
import jrb.d;
import k6b.d;
import java.lang.Number;
import b6b.q;
import java.lang.Float;
import java.lang.Boolean;
import com.yxcorp.utility.SystemUtil;
import xf6.i;
import vrb.a;
import com.kwai.nearby.startup.local.model.NearbyMapConfig;
import u5b.a;
import q87.c;
import tkd.b;
import tkd.d;
import vw5.d;
import com.kwai.feature.api.social.nearby.LocalDelegateType;
import tw5.d;
import com.kwai.feature.api.social.nearby.model.CityInfo;
import bsb.a;
import lrb.a;
import g6b.b;
import java.util.Map;
import k6b.b;
import com.yxcorp.gifshow.map.map.utils.MapUtils;
import f07.b;
import com.yxcorp.gifshow.nearby.common.map.MapExperimentUtils;
import k6b.c;
import io.reactivex.internal.functions.Functions;

public final class d$b implements g	// class@002457
{
    public final d b;

    public void d$b(d p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       MapEntranceBubbleResponse mFeedId;
       float f;
       b uob;
       int b3;
       a c;
       MapUtils a;
       d$b uob4;
       b uob7;
       t ot;
       MapEntranceBubbleResponse$BubbleConfig mTitle;
       d uod2;
       MapEntranceBubbleResponse$BubbleConfig mBubbleDispl;
       d$b obj = this;
       Float obj1 = p0;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(obj1, obj, d$b.class, str)) {
       }else {
          d$b b = obj.b;
          Objects.requireNonNull(b);
          c uoc = c.class;
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          d uod = d.class;
          if (!PatchProxy.applyVoidOneRefs(obj1, b, uod, "11")) {
             d w = b.w;
             String str1 = "mFragment";
             if (w == null) {
                a.S(str1);
             }
             if (w.K0()) {
                w = b.w;
                if (w == null) {
                   a.S(str1);
                }
                if (w.Vg().a()) {
                   boolean b1 = true;
                   b.D = b1;
                   d v = b.v;
                   String str2 = "bubbleHelper";
                   if (v == null) {
                      a.S(str2);
                   }
                   d t = b.t;
                   if (t == null) {
                      a.S("mPhotoMapEntranceView");
                   }
                   Objects.requireNonNull(v);
                   a uoa = PatchProxy.applyTwoRefs(t, obj1, v, uoc, str);
                   String str3 = "";
                   int b2 = false;
                   if (uoa != patchProxyRe) {
                   }else {
                      a.p(t, "anchorView");
                      boolean booleanx = b.a.getBoolean(b.d("user")+"entrance_bubble_shown_version2", b2);
                      mFeedId = (obj1 != null)? obj1.mBubbleConfig: null;
                      if (mFeedId != null) {
                         MapEntranceBubbleResponse mBubbleConfi1 = obj1.mBubbleConfig;
                         if (mBubbleConfi1 != null) {
                            mTitle = mBubbleConfi1.mTitle;
                            if (mTitle == null) {
                            }
                         }else {
                         }
                      }else if(!booleanx){
                         b.a(b1);
                         mTitle = a1.p(R.string.arg_RES_7f102fba);
                      }else {
                         mTitle = null;
                      }
                      if (!TextUtils.isEmpty(mTitle)) {
                         FragmentActivity activity = v.a.getActivity();
                         if (activity != null) {
                            a uoa1 = new a(activity);
                            uoa1.I0(0x28ab);
                            uoa1.K0(KwaiBubbleOption.f);
                            uoa1.o0(t);
                            uoa1.D0(BubbleInterface$Position.BOTTOM);
                            uoa1.C0(a1.e(-14.00f));
                            uoa1.q0(b1);
                            uoa1.P(b1);
                            uoa1.A(b1);
                            if (obj1 != null) {
                               mFeedId = obj1.mBubbleConfig;
                               if (mFeedId != null) {
                                  uod2 = v;
                                  mBubbleDispl = mFeedId.mBubbleDisplayTime;
                               label_00f8 :
                                  uoa1.T(mBubbleDispl);
                                  uoa1.L(b.b);
                                  uoa1.M(new a(uod2, t, obj1, mTitle));
                                  a.m(mTitle);
                                  uoa1.F0(mTitle);
                                  uoa1.e0().Z();
                                  uoa = uoa1.e0();
                               }
                            }
                            uod2 = v;
                            mBubbleDispl = 3000;
                            goto label_00f8 ;
                         }
                      }
                      uoa = null;
                   }
                   b.E = uoa;
                   str1 = 0x42d90323;
                   if (obj1 != null) {
                      MapEntranceBubbleResponse mBubbleConfi = obj1.mBubbleConfig;
                      if (mBubbleConfi != null) {
                         MapEntranceBubbleResponse$BubbleConfig mId = mBubbleConfi.mId;
                         if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(mId), b, uod, "12")) {
                            d v1 = b.v;
                            if (v1 == null) {
                               a.S(str2);
                            }
                            Objects.requireNonNull(v1);
                            if (PatchProxy.isSupport(uoc)) {
                               ot = PatchProxy.applyOneRefs(Integer.valueOf(mId), v1, uoc, "3");
                               if (ot != patchProxyRe) {
                               label_0180 :
                                  b.X7(ot.subscribe(i.b));
                               }
                            }
                            ot = b.a(str1).g(mId).observeOn(d.c).map(new e()).observeOn(d.a);
                            a.o(ot, "Singleton.get\(PhotoMapAp¡­veOn\(KwaiSchedulers.MAIN\)");
                            goto label_0180 ;
                         }
                      }
                   }
                   if (obj1 != null) {
                      b.B = obj1.mLinkUrl;
                      d.c(obj1.mCenterLocationLatLng);
                      d.e(obj1.mFeedId, obj1.mFeedType);
                      d uod1 = d.class;
                      if (!PatchProxy.applyVoidOneRefs(obj1, b, uod, "14")) {
                         uod = d.a;
                         MapEntranceBubbleResponse mCenterLocat = obj1.mCenterLocationLatLng;
                         t = b.s;
                         String str4 = "mLocalCurrentCity";
                         if (t == null) {
                            a.S(str4);
                         }
                         mFeedId = obj1.mFeedId;
                         MapEntranceBubbleResponse mFeedType = obj1.mFeedType;
                         Objects.requireNonNull(uod);
                         Object[] obj2 = PatchProxy.applyOneRefs(obj1, uod, uod1, "4");
                         b2 = 0;
                         if (obj2 != patchProxyRe) {
                            f = obj2.floatValue();
                         }else {
                            f = obj1.mMapLevel;
                            if (f - b2 <= 0) {
                               f = q.d.b();
                            }
                         }
                         obj1 = Float.valueOf(f);
                         b2 = 2;
                         if (PatchProxy.isSupport(uod1)) {
                            obj2 = new Object[]{mCenterLocat,t,mFeedId,mFeedType,obj1};
                            uob = PatchProxy.apply(obj2, uod, uod1, "2");
                            if (uob != patchProxyRe) {
                               obj = b;
                            label_038d :
                               obj.X7(uob);
                            }
                         }
                         a.p(t, str4);
                         Object obj3 = PatchProxy.apply(null, uod, uod1, str);
                         if (obj3 != patchProxyRe) {
                            b3 = obj3.booleanValue();
                         }else if(SystemUtil.K()){
                            b3 = i.g("KEY_NEARBY_MAP_PRE_LOAD_DATA");
                            if (b3 != 1) {
                               if (b3 == 2) {
                                  b3 = false;
                               }
                            }else {
                               b3 = true;
                            }
                         }
                         b3 = a.a.mEnablePreload;
                         c = a.c;
                         Object[] objArray = new Object[0];
                         String str5 = "MapPreLoadDataHelp";
                         c.w(str5, " isEnablePreLoadData = "+b3, objArray);
                         if (mCenterLocat != null) {
                            p0 = obj1;
                            Object[] objArray1 = new Object[0];
                            c.w(str5, " bubbleCenterLocation = "+mCenterLocat, objArray1);
                         }else {
                            p0 = obj1;
                         }
                         if (b3 != null) {
                            PhotoMapPreLoadData$CenterLocationLatLng uCenterLocat = null;
                            str = str3;
                            if (mCenterLocat == null || (!mCenterLocat.mLatitude - uCenterLocat && !mCenterLocat.mLongitude - uCenterLocat)) {
                               PhotoMapPreLoadData$CenterLocationLatLng uCenterLocat1 = PatchProxy.applyOneRefs(t, uod, uod1, "3");
                               if (uCenterLocat1 != patchProxyRe) {
                               }else {
                                  uCenterLocat1 = new PhotoMapPreLoadData$CenterLocationLatLng();
                                  CityInfo uCityInfo = d.a(0x574d23bb).sW(t.getType());
                                  if (a.i(uCityInfo)) {
                                     CityInfo uCityInfo1 = a.h();
                                     if (uCityInfo1 != null) {
                                        uCityInfo = uCityInfo1;
                                     }
                                  }
                                  if (uCityInfo != null) {
                                     uCenterLocat1.mLatitude = uCityInfo.mLatitude;
                                     uCenterLocat1.mLongitude = uCityInfo.mLongitude;
                                  }
                               }
                               mCenterLocat = uCenterLocat1;
                               Object[] objArray2 = new Object[0];
                               c.w(str5, " CurrentCityLatLng = "+mCenterLocat, objArray2);
                            }
                            Map map = b.b.b();
                            Float uFloat = b.b(map);
                            if (uFloat == null) {
                               uFloat = p0;
                            }
                            PhotoMapPreLoadData$CenterLocationLatLng mLatitude = (mCenterLocat != null)? mCenterLocat.mLatitude: uCenterLocat;
                            if (mCenterLocat != null) {
                               uCenterLocat = mCenterLocat.mLongitude;
                            }
                            a = MapUtils.a;
                            b uob1 = new b(mLatitude, uCenterLocat);
                            float f1 = (uFloat != null)? uFloat.floatValue(): 0;
                            uob1 = a.d(uob1, f1);
                            b uob2 = new b(mLatitude, uCenterLocat);
                            float f2 = (uFloat != null)? uFloat.floatValue(): 0;
                            b uob3 = a.f(uob2, f2);
                            q.d.e(0);
                            Object obj4 = b.a(0x42d90323);
                            uob2 = uob1.a;
                            p0 = str;
                            b b4 = uob1.b;
                            uob4 = b;
                            b uob5 = uob1;
                            b uob6 = uob3.a;
                            uob = uob3.b;
                            MapEntranceBubbleResponse mapEntranceB = (mFeedId != null)? mFeedId: p0;
                            MapEntranceBubbleResponse mapEntranceB1 = (mFeedType != null)? mFeedType: p0;
                            uob7 = obj4.f(mLatitude, uCenterLocat, uob2, b4, uob6, uob, mapEntranceB, mapEntranceB1, mLatitude, uCenterLocat, b.a(map), 1, MapExperimentUtils.g.e()).observeOn(d.c).map(new e()).observeOn(d.a).subscribe(new c(uob5, uob3), Functions.e);
                            a.o(uob7, "Singleton.get\(PhotoMapAp¡­Functions.ERROR_CONSUMER\)");
                         }else {
                            uob4 = b;
                            uob7 = t.empty().subscribe();
                            a.o(uob7, "Observable.empty<Any>\(\).subscribe\(\)");
                         }
                         uob = uob7;
                         obj = uob4;
                         goto label_038d ;
                      }
                   }
                }
             }
          }
       }
    label_0390 :
       return;
    }
}
