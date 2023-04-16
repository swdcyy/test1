package com.yxcorp.gifshow.map.map.presenter.MapMarkerPresenter;
import f6b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.nearby.common.map.MapExperimentUtils;
import com.yxcorp.gifshow.map.map.presenter.MapMarkerPresenter$mMapCardViewFactory$2;
import msd.a;
import qrd.p;
import qrd.s;
import g6b.c;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import g6b.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import yz6.f;
import yz6.i;
import k6b.a;
import java.util.concurrent.ConcurrentLinkedQueue;
import brd.t;
import com.yxcorp.gifshow.map.map.presenter.MapMarkerPresenter$a;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.map.map.presenter.MapMarkerPresenter$b;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.yxcorp.gifshow.map.map.presenter.MapMarkerPresenter$c;
import com.yxcorp.gifshow.map.map.markerStyle.BaseMarkerViewStyle;
import com.yxcorp.gifshow.entity.QPhoto;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import fi5.s;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kwai.components.nearbymodel.model.NearbyMapFeed;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$Moment;
import java.lang.Number;
import tl8.d;
import com.kwai.components.nearbymodel.model.NearbyCommonMeta;
import fi5.t;
import com.yxcorp.gifshow.map.map.model.MapCenterInfo;
import com.yxcorp.gifshow.map.data.model.MapLocationAddressResponse$LocationAddress;
import java.lang.StringBuilder;
import java.lang.Double;
import xh7.b;
import qh7.b;
import qh7.a;
import yz6.j;
import yz6.e;
import java.lang.Boolean;
import android.os.Bundle;
import yz6.l;
import java.util.Objects;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$Role;
import k6b.i;
import com.yxcorp.gifshow.map.MapLogger$CardStatus;
import com.yxcorp.gifshow.map.MapLogger$MapState;
import com.yxcorp.gifshow.map.MapLogger$ClickState;
import com.yxcorp.gifshow.map.MapLogger$CardState;
import com.yxcorp.gifshow.map.map.markerStyle.MarkerViewStyleRoleCard;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import k2b.e0;
import com.yxcorp.gifshow.map.MapLogger;
import android.view.View;
import ekd.m1;
import com.yxcorp.widget.selector.view.SelectShapeView;
import com.yxcorp.gifshow.map.map.PhotoMapFragment;
import y5b.a;
import xl8.b;

public final class MapMarkerPresenter extends PresenterV2 implements a	// class@001ca2
{
    public j A;
    public final p B;
    public f C;
    public f D;
    public BaseMarkerViewStyle E;
    public a F;
    public j G;
    public boolean H;
    public f p;
    public i q;
    public a r;
    public b s;
    public c t;
    public PhotoMapFragment u;
    public SelectShapeView v;
    public SelectShapeView w;
    public boolean x;
    public int y;
    public final boolean z;

    public void MapMarkerPresenter(){
       super();
       this.x = true;
       this.z = MapExperimentUtils.g.b();
       this.B = s.c(MapMarkerPresenter$mMapCardViewFactory$2.INSTANCE);
    }
    public static final c P8(MapMarkerPresenter p0){
       p0 = p0.t;
       if (p0 == null) {
          a.S("mMapPageState");
       }
       return p0;
    }
    public void E8(){
       c a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, MapMarkerPresenter.class, "4")) {
          return;
       }
       MapMarkerPresenter tt = this.t;
       if (tt == null) {
          a.S("mMapPageState");
       }
       a = tt.a;
       f map = (a != null)? a.getMap(): null;
       this.p = map;
       if (!PatchProxy.applyVoidOneRefs(this, null, a.class, "5")) {
          a.p(this, "listener");
          a.c.add(this);
       }
       tt = this.F;
       if (tt != null) {
          t ot = PatchProxy.apply(null, tt, uoa, "1");
          if (ot != patchProxyRe) {
          }else {
             ot = tt.f.hide();
             a.o(ot, "mCreateMarkerObservable.hide\(\)");
          }
          if (ot != null) {
             b uob = ot.subscribe(new MapMarkerPresenter$a(this), Functions.e);
             if (uob != null) {
                this.X7(uob);
             }
          }
       }
    label_0068 :
       tt = this.F;
       if (tt != null) {
          t ot1 = PatchProxy.apply(null, tt, uoa, "9");
          if (ot1 != patchProxyRe) {
          }else {
             ot1 = tt.g.hide();
             a.o(ot1, "mClearMarkerObservable.hide\(\)");
          }
          if (ot1 != null) {
             b uob1 = ot1.subscribe(new MapMarkerPresenter$b(this), Functions.e);
             if (uob1 != null) {
                this.X7(uob1);
             }
          }
       }
    label_0094 :
       MapMarkerPresenter tu = this.u;
       if (tu == null) {
          a.S("mFragment");
       }
       this.X7(tu.m().subscribe(new MapMarkerPresenter$c(this), Functions.e));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, MapMarkerPresenter.class, "16")) {
          return;
       }
       MapMarkerPresenter tE = this.E;
       if (tE != null) {
          tE.onUnbind();
       }
       if (!PatchProxy.applyVoidOneRefs(this, null, a.class, "6")) {
          a.p(this, "listener");
          a.c.remove(this);
       }
       this.H = true;
       return;
    }
    public final void R8(QPhoto p0){
       NearbyMapFeed$RoleInfo$Moment mMessage;
       MapMarkerPresenter t;
       MapLocationAddressResponse$LocationAddress mProvince;
       MapLocationAddressResponse$LocationAddress locationAddr;
       String str5;
       Double uDouble;
       Double uDouble1;
       String obj = this;
       String obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, MapMarkerPresenter.class, "15")) {
          return;
       }
       Context context = this.getContext();
       if (context != null) {
          String str = r1.U1(obj1.mEntity);
          int i = 1;
          int i1 = 0;
          s os = (str == null || !str.length())? 1: null;
          if (!os) {
             os = s.a;
             NearbyMapFeed nearbyMapFee = os.f(p0.getCommonMeta());
             if (nearbyMapFee != null) {
                nearbyMapFee = nearbyMapFee.mRoleInfo;
                if (nearbyMapFee != null) {
                   NearbyMapFeed$RoleInfo mMoment = nearbyMapFee.mMoment;
                   if (mMoment != null) {
                      mMessage = mMoment.mMessage;
                   label_0045 :
                      String liveStreamId = (p0.isLiveStream())? p0.getLiveStreamId(): p0.getPhotoId();
                      if (p0.isLiveStream()) {
                         i = 2;
                      }else if(p0.isVideoType()){
                         i = 0;
                      }
                      NearbyMapFeed nearbyMapFee1 = os.f(p0.getCommonMeta());
                      BaseFeed entity = p0.getEntity();
                      String obj2 = PatchProxy.applyOneRefs(entity, os, s.class, "17");
                      if (obj2 != PatchProxyResult.class) {
                         i1 = obj2.intValue();
                      }else if(entity != null){
                         CommonMeta uCommonMeta = entity.a(CommonMeta.class);
                         if (uCommonMeta != null) {
                            NearbyCommonMeta nearbyCommon = t.a(uCommonMeta);
                            if (nearbyCommon != null) {
                               i1 = nearbyCommon.momentCategory;
                            }
                         }
                      }
                      obj1 = os.d(obj1.mEntity);
                      if (obj1 == null) {
                         obj1 = "0";
                      }
                      t = obj.t;
                      String str1 = "mMapPageState";
                      if (t == null) {
                         a.S(str1);
                      }
                      MapCenterInfo mAddress = t.f.mAddress;
                      obj2 = "";
                      if (mAddress != null) {
                         mProvince = mAddress.mProvince;
                         if (mProvince != null) {
                         label_00b9 :
                            MapMarkerPresenter t1 = obj.t;
                            if (t1 == null) {
                               a.S(str1);
                            }
                            MapCenterInfo mAddress1 = t1.f.mAddress;
                            if (mAddress1 != null) {
                               MapLocationAddressResponse$LocationAddress mCity = mAddress1.mCity;
                               if (mCity != null) {
                                  locationAddr = mCity;
                               }
                            }
                            MapExperimentUtils g = MapExperimentUtils.g;
                            boolean b = g.e();
                            String str2 = "&momentCategory=";
                            String str3 = "&city_name=";
                            obj = "&longitude=";
                            Context uContext = context;
                            boolean b1 = b;
                            String str4 = locationAddr;
                            if (g.d()) {
                               str1 = "";
                               str5 = str3;
                               NearbyMapFeed mFeedLanding = (nearbyMapFee1 != null)? nearbyMapFee1.mFeedLandingLink: null;
                               str1 = str1+mFeedLanding+"&uid="+str+"&momentId="+obj1+"&feedId="+liveStreamId+"&mapPageFrom=1"+"&feedType="+i+"&moment="+mMessage+"&latitude=";
                               uDouble = (nearbyMapFee1 != null)? Double.valueOf(nearbyMapFee1.latitude): null;
                               str1 = str1+uDouble+obj;
                               uDouble1 = (nearbyMapFee1 != null)? Double.valueOf(nearbyMapFee1.longitude): null;
                               obj = str1+uDouble1+str2+i1+"&province_name="+mProvince+str5+str4;
                            }else {
                               str1 = str4;
                               int i2 = i1;
                               str5 = str2;
                               StringBuilder str6 = "kwai://kds/react/bottom_sheet?bundleId=SocialNearbyMap&componentName=GreetingDialog&height=1.0"+"&bgColor=%2300000000&maskOpacity=0&uid="+str+"&momentId="+obj1+"&mapPageFrom=1"+"&latitude=";
                               uDouble = (nearbyMapFee1 != null)? Double.valueOf(nearbyMapFee1.latitude): null;
                               str6 = str6+uDouble+obj;
                               uDouble1 = (nearbyMapFee1 != null)? Double.valueOf(nearbyMapFee1.longitude): null;
                               obj = str6+uDouble1+"&province_name"+'='+mProvince+str3+str1+"&minBundleVersion=70&moment="+mMessage+"&feedType"+'='+i+"&feedId="+liveStreamId+"&newMapFeature="+b1+str5+i2;
                            }
                            a.b(b.j(uContext, obj), null);
                         }
                      }
                      mProvince = obj2;
                      goto label_00b9 ;
                   }
                }
             }
             mMessage = null;
             goto label_0045 ;
          }
       }
       return;
    }
    public final void S8(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MapMarkerPresenter.class, "12")) {
          return;
       }
       if (p0 != null) {
          e uoe = p0.x();
          if (uoe != null) {
             p0.i();
             p0.f(uoe);
          }
       }
       return;
    }
    public boolean b0(j p0){
       MapLogger$CardStatus oFFLINE;
       MapMarkerPresenter mapMarkerPre = MapMarkerPresenter.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, mapMarkerPre, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null && !PatchProxy.applyVoidOneRefs(p0, this, mapMarkerPre, "14")) {
          Bundle extraInfo = p0.getExtraInfo();
          NearbyMapFeed$RoleInfo$Moment roleInfo$Mom = null;
          NearbyMapFeed$RoleInfo$Moment roleInfo$Mom1 = (extraInfo != null)? extraInfo.get("photo"): roleInfo$Mom;
          Objects.requireNonNull(roleInfo$Mom1, "null cannot be cast to non-null type com.yxcorp.gifshow.entity.QPhoto");
          Object obj1 = roleInfo$Mom1;
          mapMarkerPre = this.F;
          if (mapMarkerPre != null) {
             mapMarkerPre.h(p0);
          }
          this.S8(p0);
          this.R8(obj1);
          s a = s.a;
          NearbyMapFeed nearbyMapFee = a.g(obj1.mEntity);
          nearbyMapFee = (nearbyMapFee != null)? nearbyMapFee.mRoleInfo: roleInfo$Mom;
          NearbyMapFeed$RoleInfo mRole = (nearbyMapFee != null)? nearbyMapFee.mRole: roleInfo$Mom;
          NearbyMapFeed$RoleInfo mMoment = (nearbyMapFee != null)? nearbyMapFee.mMoment: roleInfo$Mom;
          String str = i.a(mRole, mMoment);
          nearbyMapFee = a.f(obj1.getCommonMeta());
          if (nearbyMapFee != null) {
             nearbyMapFee = nearbyMapFee.mAuthorHeaderTagType;
             if (nearbyMapFee != true) {
                oFFLINE = (nearbyMapFee != 2)? MapLogger$CardStatus.OFFLINE: MapLogger$CardStatus.ONLINE;
             }else {
                oFFLINE = MapLogger$CardStatus.LIVING;
             }
             if (oFFLINE != null) {
             label_0080 :
                MapLogger$MapState mAP = MapLogger$MapState.MAP;
                MapMarkerPresenter tu = this.u;
                if (tu == null) {
                   a.S("mFragment");
                }
                MapLogger$ClickState cLICK = MapLogger$ClickState.CLICK;
                MapLogger$CardState gUEST_STATE = MapLogger$CardState.GUEST_STATE;
                if (this.E instanceof MarkerViewStyleRoleCard) {
                   oFFLINE = MapLogger$CardStatus.VIRTUAL_IMAGE;
                }
                MapLogger$CardStatus uCardStatus = oFFLINE;
                NearbyMapFeed nearbyMapFee1 = a.f(obj1.getCommonMeta());
                if (nearbyMapFee1 != null) {
                   nearbyMapFee1 = nearbyMapFee1.mRoleInfo;
                   if (nearbyMapFee1 != null) {
                      NearbyMapFeed$RoleInfo mMoment1 = nearbyMapFee1.mMoment;
                      if (mMoment1 != null) {
                         roleInfo$Mom = mMoment1.mMessage;
                      }
                   }
                }
                MapLogger.h(mAP, tu, obj1, cLICK, str, gUEST_STATE, uCardStatus, (TextUtils.x(roleInfo$Mom) ^ 0x01));
             }
          }
          oFFLINE = MapLogger$CardStatus.OFFLINE;
          goto label_0080 ;
       }
       return true;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MapMarkerPresenter.class, "3")) {
          return;
       }
       a.p(p0, "rootView");
       View view = m1.f(p0, R.id.topGradientView);
       a.o(view, "ViewBindUtils.bindWidget¡­ew, R.id.topGradientView\)");
       this.v = view;
       p0 = m1.f(p0, R.id.bottomGradientView);
       a.o(p0, "ViewBindUtils.bindWidget¡­ R.id.bottomGradientView\)");
       this.w = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, MapMarkerPresenter.class, "2")) {
          return;
       }
       MapMarkerPresenter obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.u = obj;
       this.r = this.t8("PHOTO_MAP_FEED_PAGE_LIST");
       this.s = this.r8("PHOTO_MAP_DATA_REFRESH");
       obj = this.r8("PHOTO_MAP_MAP_PAGE_STATE");
       a.o(obj, "inject\(PhotoMapAccessId.MAP_PAGE_STATE\)");
       this.t = obj;
       this.F = this.r8("PHOTO_MAP_MAP_FEED_DATA_MANAGER");
       obj = this.t;
       if (obj == null) {
          a.S("mMapPageState");
       }
       this.q = obj.a;
       return;
    }
}
