package com.yxcorp.gifshow.activity.share.presenter.c1;
import xw8.p0$a;
import xw8.p0$c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.location.PostLocationPermissionHolder;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lq.i;
import lq.e;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import android.view.View;
import com.kuaishou.android.model.mix.Location;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Publish;
import com.kuaishou.edit.draft.Location;
import f66.i;
import jq.a;
import q87.c;
import java.lang.Long;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Objects;
import java.lang.Number;
import qr4.i;
import qr4.m$k0;
import qr4.m$x;
import xw8.p0;
import java.util.Set;
import brd.t;
import bx8.k;
import zw8.f2;
import com.yxcorp.gifshow.activity.share.presenter.z0;
import erd.g;
import crd.b;
import com.kuaishou.android.post.PostArguments;
import com.kuaishou.android.post.BoolArg;
import java.lang.Boolean;
import com.kuaishou.android.post.PostPageArg;
import android.widget.ImageView;
import android.view.ViewGroup;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kuaishou.edit.draft.Workspace$Source;
import java.util.ArrayList;
import maa.a;
import java.util.List;
import java.util.Iterator;
import com.kuaishou.edit.draft.Asset;
import com.kuaishou.edit.draft.GeoLocation;
import com.kwai.framework.model.common.Distance;
import vaa.a;
import com.kuaishou.edit.draft.Kuaishan;
import com.kuaishou.edit.draft.KuaishanAsset;
import lnc.n7;
import lnc.n7$b;
import java.lang.System;
import com.kwai.framework.location.k;
import com.yxcorp.gifshow.activity.share.presenter.c1$c;
import android.app.Activity;
import j2b.s;
import kotlin.jvm.internal.a;
import q96.d;
import o96.u;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.LifecycleOwner;
import zw8.e2;
import com.yxcorp.gifshow.activity.share.presenter.w0;
import com.kuaishou.krn.event.a;
import oj0.a;
import java.lang.Double;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.yxcorp.gifshow.activity.share.presenter.c1$d;
import zw8.b2;
import com.yxcorp.gifshow.activity.share.presenter.c1$f;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import k17.b;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$n;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import vw8.a;
import k2b.u1;
import fg6.a;
import com.google.gson.Gson;
import ow8.c;
import com.kwai.framework.location.model.LocationCityInfo;
import com.kwai.poi.service.model.KLocation;
import cx8.a;
import cx8.b;
import io.reactivex.g;
import com.yxcorp.gifshow.activity.share.model.LocationResponse;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import gx8.c;
import lnc.j8;
import cx8.c;
import cx8.h;
import cx8.g;
import cjd.e;
import erd.o;
import h69.j;
import com.yxcorp.gifshow.activity.share.presenter.x0;
import zw8.c2;
import com.yxcorp.gifshow.activity.share.presenter.a1;
import zw8.d2;
import com.yxcorp.gifshow.activity.share.presenter.b1;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.activity.share.helper.PostLocationHelper;
import android.content.Intent;
import qrd.p;
import com.yxcorp.gifshow.activity.share.helper.KrnLocationHelper;
import tw8.c;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.activity.share.helper.KrnLocationHelper$b;
import android.text.TextUtils;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import tw8.b;
import org.json.JSONObject;
import org.json.JSONException;
import k2b.e0;
import g9c.a;
import i2b.a;
import fx8.b;
import com.yxcorp.gifshow.activity.share.presenter.c1$e;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kuaishou.edit.draft.Location$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Publish$b;
import com.kuaishou.android.post.LocationArg;
import ekd.m1;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import com.yxcorp.gifshow.activity.share.presenter.c1$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.activity.share.presenter.c1$b;
import com.yxcorp.gifshow.upload.UploadRequest$a;
import bba.b;
import com.kwai.feature.post.api.feature.publish.model.PublishPageSetting;
import ekd.j0;

public class c1 extends PresenterV2 implements p0$a, p0$c	// class@0013d0
{
    public PublishPageSetting A;
    public c B;
    public String C;
    public String D;
    public VideoContext E;
    public c1$d F;
    public c1$e G;
    public k H;
    public List I;
    public String J;
    public ArrayList K;
    public final PostLocationPermissionHolder L;
    public String M;
    public d N;
    public a p;
    public CustomRecyclerView q;
    public LinearLayout r;
    public TextView s;
    public ImageView t;
    public ImageView u;
    public View v;
    public GifshowActivity w;
    public p0 x;
    public QPhoto y;
    public b z;

    public void c1(){
       super();
       this.J = null;
       this.L = new PostLocationPermissionHolder(false);
       this.M = null;
       this.N = null;
    }
    public void E8(){
       int i;
       Object[] obj;
       int i3;
       Object[] objArray2;
       boolean b1;
       boolean b2;
       c1 obj3;
       String str = this;
       VideoContext videoContext = VideoContext.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c1 uoc1 = c1.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, str, uoc1, "3")) {
          return;
       }
       String str1 = i.m().k().o();
       Object[] objArray1 = PatchProxy.applyOneRefs(str1, str, uoc1, "12");
       if (objArray1 != patchProxyRe) {
       }else if(TextUtils.x(str1)){
          objArray1 = objArray;
       }else {
          objArray1 = "{activityChannel:"+str1+"}";
       }
       str.M = objArray1;
       i = 8;
       str.v.setVisibility(i);
       Location location = PatchProxy.apply(objArray, str, uoc1, "27");
       int i1 = 0;
       if (location != patchProxyRe) {
       }else {
          location = new Location();
          obj3 = str.z;
          if (obj3 != null) {
             Publish publish = obj3.v();
             if (publish != null) {
                Location location1 = publish.getLocation();
                obj = new Object[i1];
                a.b().s("share_draft_tag", "µÿ¿ÌŒª÷√: "+location1.getTitle()+", id: "+location1.getIdentifier(), obj);
                if (!TextUtils.x(location1.getIdentifier())) {
                   location.mId = Long.valueOf(location1.getIdentifier()).longValue();
                   location.mTitle = location1.getTitle();
                }
             }
          }
          location = objArray;
       }
       if (location == null) {
          c1 y = str.y;
          obj3 = PatchProxy.applyOneRefs(y, str, uoc1, "6");
          if (obj3 != patchProxyRe) {
             location = obj3;
          }else if(y != null){
             location = y.getLocation();
          }else {
             location = objArray;
          }
       }
       int i2 = -1;
       boolean b = true;
       if (location != null) {
          c1 e = str.E;
          if (e != null) {
             Objects.requireNonNull(e);
             obj = PatchProxy.apply(objArray, e, videoContext, "211");
             if (obj != patchProxyRe) {
                i3 = obj.intValue();
             }else {
                VideoContext.b();
                e.c0();
                i3 = e.F().b.x0.c;
             }
             location.mCheckType = i3;
             e = str.E;
             Objects.requireNonNull(e);
             m$x ox = PatchProxy.apply(objArray, e, videoContext, "212");
             if (ox != patchProxyRe) {
             }else {
                VideoContext.b();
                e.c0();
                ox = e.F().b.x0.f;
             }
             location.mExtParams = ox;
          }
          str.Z8(location, b, i2);
       }
       str.Z8(str.x.c(), b, i2);
       str.x.s.add(str);
       str.x.q.add(str);
       c1 h = str.H;
       if (h != null && location != null) {
          str.X7(h.b().subscribe(new f2(str), z0.b));
       }
       str1 = "ShareLocationPresenter";
       if (i.g().getDisableShareCaptionEdit().get(Boolean.FALSE).booleanValue()) {
          if (!PatchProxy.applyVoid(objArray, str, uoc1, "5")) {
             objArray2 = new Object[i1];
             a.b().w(str1, "disableLocationView: ", objArray2);
             str.t.setVisibility(i);
             View view = str.k8(R.id.ll_location_container);
             if (view != null) {
                view.setClickable(i1);
             }
             if (str.x.c() == null) {
                Object[] objArray3 = new Object[i1];
                a.b().w(str1, "disableLocationView: hide all", objArray3);
                str.q.setVisibility(i);
                if (view != null) {
                   view.setVisibility(i);
                }
             }
          }
       }else if(PatchProxy.applyVoid(objArray, str, uoc1, "14")){
          if (str.B == null) {
             objArray2 = new Object[i1];
             a.b().t(str1, "initMediaLocationList workspaceDraft is null", objArray2);
          }else {
             Object[] objArray4 = new Object[i1];
             a.b().w(str1, "initMediaLocationList workspaceDraft type="+str.B.a1()+" source="+str.B.T0()+" from="+str.B.b1(), objArray4);
             ArrayList uArrayList = new ArrayList();
             String str3 = null;
             if (str.B.a1() == Workspace$Type.KUAISHAN || str.B.T0() == Workspace$Source.KUAI_SHAN) {
                a uoa = str.B.F0();
                if (uoa == null) {
                   objArray2 = new Object[i1];
                   a.b().t(str1, "generateLocationJsonStr kuaishanDraft is null", objArray2);
                }else {
                   Kuaishan kuaishan = uoa.v();
                   if (kuaishan != null) {
                      Iterator iterator = kuaishan.getAssetsList().iterator();
                      while (iterator.hasNext()) {
                         KuaishanAsset kuaishanAsse = iterator.next();
                         if (!kuaishanAsse.getLocation().getLongitude() - 0xbff0000000000000 || !kuaishanAsse.getLocation().getLatitude() - 0xbff0000000000000) {
                            objArray1 = new Object[i1];
                            a.b().w(str1, "initMediaLocationList invalid ksAsset lon lat, skip", objArray1);
                         }else {
                            str3 = null;
                            if (!kuaishanAsse.getLocation().getLongitude() - str3 && !kuaishanAsse.getLocation().getLatitude() - str3) {
                               continue ;
                            }else {
                               uArrayList.add(str.P8(kuaishanAsse.getLocation().getLatitude(), kuaishanAsse.getLocation().getLongitude()));
                            }
                         }
                      }
                   }
                }
             }else {
                a uoa1 = str.B.o0();
                if (uoa1 == null) {
                   objArray2 = new Object[i1];
                   a.b().w(str1, "generateLocationJsonStr assetDraft is null", objArray2);
                }else {
                   Iterator iterator1 = uoa1.z().iterator();
                   while (iterator1.hasNext()) {
                      Asset uAsset = iterator1.next();
                      Object obj1 = PatchProxy.applyOneRefs(uAsset, str, uoc1, "15");
                      if (obj1 != patchProxyRe) {
                         b2 = obj1.booleanValue();
                      }else if(!uAsset.getLocation().getLongitude() - 0xbff0000000000000 || (uAsset.getLocation().getLatitude() - 0xbff0000000000000 && (uAsset.getLocation().getLongitude() - str3 || uAsset.getLocation().getLatitude() - str3))){
                         b2 = true;
                      }else {
                         b2 = false;
                      }
                      if (b2) {
                         uArrayList.add(str.P8(uAsset.getLocation().getLatitude(), uAsset.getLocation().getLongitude()));
                      }else if(i.h()){
                         Object obj2 = i.m().z("image_location_prefix_"+uAsset.getAlbumId());
                         if (obj2 instanceof Location && (!obj2.longitude - 0xbff0000000000000 || !obj2.latitude - 0xbff0000000000000)) {
                            obj = new Object[i1];
                            a.b().w(str1, "generateLocationJsonStr from session "+uAsset.getAlbumId(), obj);
                            uArrayList.add(str.P8(obj2.latitude, obj2.longitude));
                         }
                      }
                      str3 = null;
                   }
                }
             }
             str.K = uArrayList;
          }
       }
       if (!n7.a()) {
          n7$b uob = 600;
          n7$b f = n7.f;
          if (f != null) {
             uob = f.cacheExpiration;
          }
          if ((float)(System.currentTimeMillis() - n7.b) - ((float)uob * 1000.00f) <= 0) {
             b1 = n7.c;
          label_03c7 :
             objArray1 = new Object[i1];
             a.b().w(str1, "preRequestPoi: havePreRequestPoi: "+b1, objArray1);
             if (!b1) {
                String str2 = "default";
                if (k.d(str2)) {
                   str.N = new c1$c(str);
                   Activity activity = this.getActivity();
                   uoc1 = str.N;
                   if (!PatchProxy.applyVoidTwoRefs(activity, uoc1, objArray, s.class, "9")) {
                      a.p(uoc1, "locationStateListener");
                      if (activity != null) {
                         u.i(uoc1, str2);
                         u.n("default", true, true, null, "post_poi_picker", "post_poi_picker", "post_poi_picker");
                      }
                   }
                }
             }
             objArray2 = new Object[i1];
             a.b().w(str1, "requestLocationWhenEnterShareActivity: notHasLocalPermissionAndGPS", objArray2);
             this.R8();
          }
       }
       b1 = false;
       goto label_03c7 ;
    label_042a :
       if (this.getActivity() != null && this.getActivity() instanceof GifshowActivity) {
          str.L.a(this.getActivity());
          str.X7(str.L.b().subscribe(new e2(str)));
       }
       str.p = new w0(str);
       a.b().a("post_poi_selected", str.p);
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c1.class, "24")) {
          return;
       }
       this.I = objArray;
       this.L.c();
       a.b().c("post_poi_selected", this.p);
       u.q(this.N, "default");
       return;
    }
    public final Distance P8(double p0,double p1){
       Distance obj;
       c1 uoc1 = c1.class;
       if (PatchProxy.isSupport(uoc1)) {
          obj = PatchProxy.applyTwoRefs(Double.valueOf(p0), Double.valueOf(p1), this, uoc1, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Distance();
       obj.mLatitude = p0;
       obj.mLongtitude = p1;
       return obj;
    }
    public final void R8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c1.class, "9")) {
          return;
       }
       this.q.setItemAnimator(objArray);
       this.q.setLayoutManager(new LinearLayoutManager(this.getActivity(), 0, 0));
       c1$d uod = new c1$d(this, new b2(this));
       this.F = uod;
       this.q.setAdapter(uod);
       this.q.addItemDecoration(new b(0, a1.e(10.00f)));
       this.W8();
       return;
    }
    public void S8(){
       boolean b;
       c1 uoc1 = c1.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc1, "26")) {
          return;
       }
       u.q(this.N, "default");
       Object obj = PatchProxy.apply(objArray, this, uoc1, "4");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(this.getActivity() != null && (this.getActivity().isFinishing() || this.getActivity().isDestroyed())){
          b = true;
       }else {
          b = false;
       }
       if (!b) {
          this.R8();
       }
       return;
    }
    public final void V8(Location p0,int p1,boolean p2){
       if (PatchProxy.isSupport(c1.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, c1.class, "22")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       int i = (p2)? 2: 1;
       uElementPack.status = i;
       uElementPack.action = 841;
       uElementPack.type = 1;
       u1.u(1, uElementPack, a.f(p0, p1));
       return;
    }
    public final void W8(){
       KLocation kLocation;
       boolean b;
       t ot;
       Object[] objArray3;
       Object[] objArray4;
       String str4;
       Object[] objArray7;
       String str = this;
       c1 uoc1 = c1.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, str, uoc1, "10")) {
          return;
       }
       c1 k = str.K;
       uoc1 = PatchProxy.applyOneRefs(k, str, uoc1, "13");
       String str1 = "ShareLocationPresenter";
       int i = 0;
       if (uoc1 != patchProxyRe) {
       }else if(k == null || k.isEmpty()){
          objArray3 = new Object[i];
          a.b().A(str1, "generateLocationJsonStr mediaLocationList is null or empty", objArray3);
       }else if(!TextUtils.x(str.J)){
          objArray3 = new Object[i];
          a.b().s(str1, "generateLocationJsonStr reuse current media location str", objArray3);
          uoc1 = str.J;
       }else if(str.B == null){
          objArray3 = new Object[i];
          a.b().t(str1, "generateLocationJsonStr workspace draft is null", objArray3);
       }else {
          str4 = a.a.q(k);
          objArray4 = new Object[i];
          a.b().s(str1, "generateLocationJsonStr location json str: "+str4, objArray4);
          str.J = str4;
       }
       Object[] objArray1 = objArray;
    label_007f :
       Object[] objArray2 = new Object[i];
       a.b().w(str1, "requestPostPoiList : mediaStr = "+objArray1, objArray2);
       if (this.getActivity() != null) {
          s.d(this.getActivity(), objArray1);
       }
       String str2 = "LocationAPI";
       if (c.t()) {
          LocationCityInfo locationCity = u.e("default");
          Integer integer = 1;
          if (locationCity != null && !locationCity.isInvalid()) {
             kLocation = new KLocation(locationCity.mLatitude, locationCity.mLongitude);
             b = true;
          }else {
             kLocation = objArray;
             b = false;
          }
          if (!s.b() || kLocation == null) {
             ot = t.just(new LocationResponse());
          }else {
             a uoa = a.class;
             if (PatchProxy.isSupport(uoa)) {
                objArray4 = new Object[]{"localLife","publish",Boolean.valueOf(b),"","",kLocation,""};
                ot = PatchProxy.apply(objArray4, objArray, uoa, "8");
                if (ot != patchProxyRe) {
                }
             }
             a.p("localLife", "poiBiz");
             a.p("publish", "poiSubBiz");
             Object[] objArray5 = new Object[i];
             a.c(str2, "getPromotionPoiList", objArray5);
             b uob = new b("localLife", "publish", b, "", "", kLocation, "");
             ot = t.create(objArray5);
             a.o(ot, "Observable.create { emit°≠ pcursor, callback\)\n    }");
          }
       }else if(PostExperimentUtils.K()){
          uoc1 = str.C;
          c1 d = str.D;
          String str3 = i.m().k().o();
          c1 k1 = str.K;
          Object obj = PatchProxy.applyFourRefs(uoc1, d, str3, k1, null, a.class, "9");
          if (obj != patchProxyRe) {
             ot = obj;
          }else {
             ArrayList uArrayList = c.b(k1);
             str4 = j8.g(uoc1, d, str3);
             KLocation kLocation1 = j8.b();
             Object[] objArray6 = new Object[i];
             a.c(str2, "locationRecommendNew\(\) taskId = "+d+", + location = "+kLocation1+','+" extra = "+str4+",  mediaLocations = "+uArrayList, objArray6);
             ot = t.create(new c(kLocation1, uArrayList, str4));
             a.o(ot, "Observable.create { emit°≠xtParams, callBack\)\n    }");
          }
       }else if(s.b()){
          objArray7 = new Object[i];
          a.b().w(str1, "requestPostPoiList : havePermission", objArray7);
          ot = g.a().f(3000, objArray1, str.C, str.D, str.M).map(new e());
       }else {
          objArray7 = new Object[i];
          a.b().w(str1, "requestPostPoiList : notHavePermission", objArray7);
          ot = g.a().h(3000, objArray1, str.C, str.D, 1, str.M).map(new e());
       }
       if (j.j(str.B) && !TextUtils.x(str.J)) {
          objArray3 = new Object[i];
          a.b().w(str1, "requestPostPoiList: isAnnualAlbum, has MediaLocation", objArray3);
          t ot1 = (PostExperimentUtils.K())? a.e(null, "", str.D, s.a(), str.M, ""): a.d(objArray, "", str.D, s.a(), str.M).map(new e());
          str.X7(ot.flatMap(new x0(ot1)).subscribe(new c2(str), a1.b));
          return;
       }else {
          str.X7(ot.subscribe(new d2(str), b1.b));
          return;
       }
       objArray1 = uoc1;
       goto label_007f ;
    }
    public void X8(){
       boolean b1;
       a uoa;
       ClientEvent$ElementPackage uElementPack;
       JSONObject jSONObject;
       String str1;
       String str2;
       Object obj = this;
       if (PatchProxy.applyVoid(null, obj, c1.class, "18")) {
          return;
       }
       Bundle uBundle = new Bundle();
       if (!TextUtils.x(obj.J)) {
          SerializableHook.putSerializable(uBundle, "MEDIA_LOCATION_LIST", obj.K);
       }
       if (obj.x.c() != null) {
          SerializableHook.putSerializable(uBundle, "location", obj.x.c());
       }
       c1 y = obj.y;
       String str = "photo_location";
       if (y != null && y.getLocation() != null) {
          SerializableHook.putSerializable(uBundle, str, obj.y.getLocation());
       }
       y = obj.y;
       if (y != null && y.getPhotoId() != null) {
          uBundle.putString("photo_id", obj.y.getPhotoId());
       }
       boolean b = false;
       uBundle.putBoolean("show_none", b);
       uBundle.putString("page_title", obj.w.getString(R.string.user_location));
       uBundle.putString("photo_task_id", obj.D);
       y = obj.M;
       if (y != null) {
          uBundle.putString("location_ext_params", y);
       }
       c1 w = obj.w;
       PostLocationHelper postLocation = new PostLocationHelper();
       c1 w1 = obj.w;
       PostLocationHelper postLocation1 = PostLocationHelper.class;
       Intent intent = PatchProxy.applyTwoRefs(uBundle, w1, postLocation, postLocation1, "4");
       if (intent != PatchProxyResult.class) {
       }else {
          String str3 = "bundle";
          a.p(uBundle, str3);
          a.p(w1, "context");
          Boolean uBoolean = PatchProxy.apply(null, postLocation, postLocation1, "1");
          if (uBoolean == PatchProxyResult.class) {
             uBoolean = postLocation.a.getValue();
          }
          if (uBoolean.booleanValue()) {
             KrnLocationHelper krnLocationH = postLocation.d();
             Objects.requireNonNull(krnLocationH);
             Object obj1 = PatchProxy.applyOneRefs(uBundle, krnLocationH, KrnLocationHelper.class, "3");
             if (obj1 != PatchProxyResult.class) {
                b = obj1.booleanValue();
             }else {
                a.p(uBundle, str3);
                if (SerializableHook.getSerializable(uBundle, str) == null) {
                   Object obj2 = PatchProxy.apply(null, null, c.class, "1");
                   boolean b2 = (obj2 != PatchProxyResult.class)? obj2.booleanValue(): a.t().d("enablePublishPoiOffsite", b);
                   if (!b2) {
                      obj2 = PatchProxy.apply(null, krnLocationH, KrnLocationHelper.class, "4");
                      if (obj2 != PatchProxyResult.class) {
                         b1 = obj2.booleanValue();
                      }else if(!TextUtils.isEmpty(krnLocationH.d().downLoadUri) && !TextUtils.isEmpty(krnLocationH.d().a())){
                         b1 = true;
                      }else {
                         b1 = false;
                      }
                      if (b1) {
                         b = true;
                      }
                   }
                }
             }
             if (b) {
                try{
                   intent = postLocation.d().b(uBundle, w1);
                }catch(com.google.gson.JsonSyntaxException e0){
                   a.b().e("PostLocationHelper", "uri something wrong check kSwitch", e0);
                   intent = postLocation.e().b(uBundle, w1);
                }catch(java.lang.Exception e0){
                   PostUtils.D("PostLocationHelper", "krn get Intent failed", e0);
                }
             }
          }
       }
    }
    public final void Y8(List p0){
       c1 uoc1 = c1.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc1, "11")) {
          return;
       }
       this.I = p0;
       i oi = a.b();
       StringBuilder str = "updateLocationView: locationItems";
       String str1 = (this.I == null)? " null": " size "+this.I.size();
       Object[] objArray = new Object[0];
       oi.w("ShareLocationPresenter", str+str1, objArray);
       c1 tI = this.I;
       if (tI != null && tI.size() > 0) {
          Location location = new Location();
          location.mTitle = a1.p(0x7f104769);
          location.mId = -1;
          this.I.add(location);
          this.F.W0(this.I);
          Object[] objArray1 = null;
          if (!PatchProxy.applyVoid(objArray1, this, uoc1, "7")) {
             this.F.u1(a.i(this.q, R.layout.arg_RES_7f0d14ff));
          }
          if (!PatchProxy.applyVoid(objArray1, this, uoc1, "8")) {
             this.F.t1(a.i(this.q, R.layout.arg_RES_7f0d14ee));
          }
          uoc1 = this.G;
          if (uoc1 != null) {
             objArray1 = uoc1.a;
          }
          this.F.k0();
          this.Z8(objArray1, true, -1);
       }
       return;
    }
    public final void Z8(Location p0,boolean p1,int p2){
       Object[] objArray;
       Location location1;
       c1 uoc1 = c1.class;
       if (PatchProxy.isSupport(uoc1) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Integer.valueOf(p2), this, c1.class, "17")) {
          return;
       }
       int i = 0;
       c1 uoc11 = (p0 != null && p1)? 1: null;
       Location location = null;
       int i1 = 8;
       if (uoc11) {
          uoc11 = this.G;
          if (uoc11 == null) {
             this.G = new c1$e(this, p0, p2);
          }else {
             uoc11.a = p0;
             uoc11.b = p2;
          }
          if (TextUtils.x(p0.mTitle)) {
             this.r.setVisibility(i1);
             this.u.setVisibility(i);
          }else {
             this.r.setVisibility(i);
             this.u.setVisibility(i1);
          }
          this.q.setVisibility(i1);
          this.x.l(p0);
          this.s.setText(TextUtils.k(p0.mTitle));
       }else {
          this.u.setVisibility(i);
          this.r.setVisibility(i1);
          if (this.I != null) {
             this.q.setVisibility(i);
          }
          this.x.l(location);
          this.G = location;
       }
       if (p0 == null || TextUtils.x(p0.mTitle)) {
          this.x.l(location);
       }
       p0 = this.x.c();
       if (!PatchProxy.applyVoidOneRefs(p0, this, uoc1, "25")) {
          String str = "ShareLocationPresenter";
          if (this.z == null) {
             objArray = new Object[i];
             a.b().w(str, "updateLocation: publish draft is null", objArray);
          }else {
             Object[] objArray1 = new Object[i];
             a.b().w(str, "updateLocation updateDraft", objArray1);
             String str1 = "]";
             if (p0 == null || TextUtils.x(p0.getTitle())) {
                location1 = Location.newBuilder().build();
                if (this.z.v() != null && !location1.equals(this.z.v().getLocation())) {
                   Object[] objArray2 = new Object[i];
                   a.b().w(str, "updateLocation  clearLocation", objArray2);
                   this.z.c0();
                   Publish$b uob = this.z.k();
                   uob.copyOnWrite();
                   uob.instance.clearLocation();
                   this.z.f();
                   i.g().getPublishLocation().clear();
                }
             }else {
                Location$b uob1 = Location.newBuilder();
                uob1.b(p0.getTitle());
                uob1.a(String.valueOf(p0.getId()));
                location1 = uob1.build();
                if (this.z.v() == null || !location1.equals(this.z.v().getLocation())) {
                   Object[] objArray4 = new Object[i];
                   a.b().w(str, "updateLocation  setLocationToDraft city ["+p0.getCity()+"] title ["+p0.getTitle()+str1, objArray4);
                   this.z.c0();
                   this.z.k().h(location1);
                   this.z.f();
                }
             }
             uoc1 = this.E;
             if (uoc1 == null) {
                objArray = new Object[i];
                a.b().w(str, "updateLocation: videoContext is null", objArray);
             }else if(p0 != null){
                Object[] objArray3 = new Object[i];
                a.b().w(str, "updateLocation  setPoiInfotitle ["+p0.getTitle()+"] CheckType ["+p0.getCheckType()+str1, objArray3);
                this.E.D1(p0);
             }else if(PatchProxy.applyVoid(location, uoc1, VideoContext.class, "214")){
                VideoContext.b();
                i b = uoc1.a.b;
                if (b != null && b.x0 != null) {
                   b.x0 = location;
                }
             }
             this.E.E1(k.c("default"), (TextUtils.x(this.J) ^ 1));
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c1.class, "2")) {
          return;
       }
       this.v = m1.f(p0, 0x7f0a2958);
       this.u = m1.f(p0, 0x7f0a154f);
       this.q = m1.f(p0, 0x7f0a2956);
       this.r = m1.f(p0, 0x7f0a28c2);
       this.t = m1.f(p0, 0x7f0a154b);
       this.s = m1.f(p0, 0x7f0a41c3);
       m1.b(p0, new c1$a(this), R.id.iv_location_clear);
       m1.b(p0, new c1$b(this), R.id.ll_location_container);
       return;
    }
    public void e1(UploadRequest$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c1.class, "21")) {
          return;
       }
       if (this.x.c() != null) {
          p0.t(this.x.c().getId());
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c1.class, "1")) {
          return;
       }
       this.w = this.r8("SHARE_ACTIVITY");
       this.x = this.r8("SHARE_PAGE_PRESENTER_MODEL");
       this.y = this.t8("SHARE_QPHOTO");
       this.z = this.t8("PUBLISH");
       this.A = this.r8("share_page_setting_kswtich");
       this.B = this.t8("WORKSPACE");
       this.C = this.t8("EDIT_SESSION_ID");
       this.D = this.r8("PHOTO_TASK_ID");
       this.E = this.t8("SHARE_VIDEO_CONTEXT");
       this.H = this.t8("RE_EDIT_REPO");
       return;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(c1.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, c1.class, "20")) {
          return;
       }
       if (p0 == 102 && p1 == -1) {
          Location location = null;
          if (p2 != null) {
             String str = "location";
             if (j0.g(p2, str)) {
                location = j0.e(p2, str);
             }else if(p2 == null){
                location = new Location();
                location.mTitle = "";
             }
          }else {
             goto label_0036 ;
          }
          Object[] objArray = new Object[0];
          a.b().w("ShareLocationPresenter", "onActivityResult: updateTvLocation", objArray);
          this.Z8(location, true, -1);
          this.G = new c1$e(this, this.x.c(), -1);
       }
       return;
    }
}
