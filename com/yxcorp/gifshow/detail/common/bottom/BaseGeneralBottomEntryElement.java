package com.yxcorp.gifshow.detail.common.bottom.BaseGeneralBottomEntryElement;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import rp7.a;
import jh5.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.regex.Pattern;
import com.yxcorp.gifshow.detail.common.bottom.BaseGeneralBottomEntryElement$mActivityLifecycleObserver$1;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import qp7.a;
import v6a.m0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import az6.a;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.yxcorp.gifshow.entity.QPhoto;
import k2b.u1;
import r1a.e;
import jf5.j;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.component.photo.detail.slide.model.GeneralBottomBarWeakInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import tkd.b;
import tkd.d;
import ju5.g;
import rq7.a;
import wp7.u;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kwai.component.photo.detail.slide.model.GeneralBottomBarInfo;
import java.lang.StringBuilder;
import com.google.gson.JsonObject;
import java.lang.Integer;
import java.lang.Number;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import com.google.gson.JsonElement;
import java.lang.System;
import java.lang.Long;
import qp7.c;
import wp7.t;
import com.kwai.component.photo.detail.core.util.ActivityLifeCircleBundle;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.yxcorp.gifshow.log.model.CommonParams;
import com.google.common.collect.ImmutableMap$b;
import com.google.common.collect.ImmutableMap;
import zk.g;
import k2b.k2;
import com.kuaishou.android.model.feed.PhotoType;
import kp.r1;
import com.kuaishou.android.model.mix.CommonMeta;
import qrd.l1;

public abstract class BaseGeneralBottomEntryElement extends DispatchBaseElement	// class@001398
{
    public Pattern A;
    public long B;
    public ActivityLifeCircleBundle C;
    public final DefaultLifecycleObserver D;
    public QPhoto t;
    public Activity u;
    public m0 v;
    public BaseFragment w;
    public a x;
    public int y;
    public e z;

    public void BaseGeneralBottomEntryElement(a p0,a p1){
       a.p(p0, "bizType");
       super(p0, p1);
       this.A = Pattern.compile("kwai://trending\(/.*\)?");
       this.D = new BaseGeneralBottomEntryElement$mActivityLifecycleObserver$1(this);
    }
    public static ClientEvent$ElementPackage q0(BaseGeneralBottomEntryElement p0,String p1,Boolean p2,int p3,Object p4){
       p2 = (p3 & 0x02)? Boolean.FALSE: null;
       return p0.p0(p1, p2);
    }
    public void P(a p0){
       a a;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, BaseGeneralBottomEntryElement.class, "9")) {
       }else {
          a.p(p0, "context");
          PhotoDetailParam mPhoto = p0.c.mPhoto;
          a.o(mPhoto, "context.mPhotoDetailParam.mPhoto");
          this.t = mPhoto;
          this.y = p0.c.mPhotoIndex;
          a = p0.a;
          a.o(a, "context.mActivity");
          this.u = a;
          String str = "4";
          if (!PatchProxy.applyVoidOneRefsWithListener(p0, this, BaseGeneralBottomEntryElement.class, str)) {
             a.p(p0, "<set-?>");
             this.v = p0;
             PatchProxy.onMethodExit(BaseGeneralBottomEntryElement.class, str);
          }
          a = p0.b;
          a.o(a, "context.mFragment");
          this.w = a;
          String str1 = "3";
          BaseGeneralBottomEntryElement uBaseGeneral = PatchProxy.applyWithListener(null, this, BaseGeneralBottomEntryElement.class, str1);
          if (uBaseGeneral != PatchProxyResult.class) {
          }else {
             uBaseGeneral = this.v;
             if (uBaseGeneral == null) {
                a.S("mSlidePageCallerContext");
             }
             PatchProxy.onMethodExit(BaseGeneralBottomEntryElement.class, str1);
          }
          this.z = uBaseGeneral.q;
          m0 j = p0.j;
          a.o(j, "context.mPlayModule");
          this.x = j;
          m0 w = p0.W;
          a.o(w, "context.mActivityLifeCircleBundle");
          this.C = w;
          PatchProxy.onMethodExit(BaseGeneralBottomEntryElement.class, "9");
       }
       return;
    }
    public void S(){
       BaseGeneralBottomEntryElement tt;
       j a;
       BaseGeneralBottomEntryElement uBaseGeneral = BaseGeneralBottomEntryElement.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uBaseGeneral, "17")) {
          return;
       }
       String str = "mPhoto";
       if (!PatchProxy.applyVoid(objArray, this, uBaseGeneral, "19")) {
          ShowMetaData showMetaData = new ShowMetaData();
          tt = this.w;
          if (tt == null) {
             a.S("mFragment");
          }
          showMetaData = showMetaData.setLogPage(tt).setType(3).setAreaPackage(this.n0()).setElementPackage(BaseGeneralBottomEntryElement.q0(this, "FEATURED_RECO_ENTRANCE_BUTTON", objArray, 2, objArray)).setContentPackage(this.o0());
          tt = this.t;
          if (tt == null) {
             a.S(str);
          }
          u1.B0(showMetaData.setFeedLogCtx(tt.getFeedLogCtx()));
       }
       BaseGeneralBottomEntryElement tz = this.z;
       if (tz != null) {
          tt = this.t;
          if (tt == null) {
             a.S(str);
          }
          tz.a(tt);
       }
       if (!PatchProxy.applyVoid(objArray, this, uBaseGeneral, "10")) {
          a = j.a;
          BaseGeneralBottomEntryElement tt1 = this.t;
          if (tt1 == null) {
             a.S(str);
          }
          GeneralBottomBarWeakInfo generalBotto = a.b(tt1.getEntity());
          if (generalBotto != null && !TextUtils.x(generalBotto.mActionUrl)) {
             int i = 0x6ea0c3d0;
             if (d.a(i).rM(generalBotto.mActionUrl)) {
                d.a(i).g9(generalBotto.mActionUrl, "BaseGeneralBottomEntryElement");
             }
          }
       }
    label_00ab :
       return;
    }
    public a f0(a p0){
       u ou = PatchProxy.applyOneRefs(p0, this, BaseGeneralBottomEntryElement.class, "26");
       if (ou != PatchProxyResult.class) {
       }else {
          ou = new u(p0);
       }
       return ou;
    }
    public final ClientEvent$AreaPackage n0(){
       ClientEvent$AreaPackage obj = PatchProxy.apply(null, this, BaseGeneralBottomEntryElement.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientEvent$AreaPackage();
       obj.name = "PHOTO_PLAY_FUNC";
       return obj;
    }
    public final ClientContent$ContentPackage o0(){
       ClientContent$ContentPackage obj = PatchProxy.apply(null, this, BaseGeneralBottomEntryElement.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       BaseGeneralBottomEntryElement tt = this.t;
       if (tt == null) {
          a.S("mPhoto");
       }
       obj.photoPackage = w1.f(tt.getEntity());
       return obj;
    }
    public final ClientEvent$ElementPackage p0(String p0,Boolean p1){
       j obj = PatchProxy.applyTwoRefs(p0, p1, this, BaseGeneralBottomEntryElement.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = j.a;
       BaseGeneralBottomEntryElement tt = this.t;
       String str = "mPhoto";
       if (tt == null) {
          a.S(str);
       }
       GeneralBottomBarInfo generalBotto = obj.a(tt.getEntity());
       BaseGeneralBottomEntryElement tt1 = this.t;
       if (tt1 == null) {
          a.S(str);
       }
       GeneralBottomBarWeakInfo generalBotto1 = obj.b(tt1.getEntity());
       if (generalBotto == null || generalBotto1 == null) {
          return null;
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          String str1 = generalBotto1.mTitle;
          if (generalBotto1.mShowSeparator != null && !TextUtils.x(generalBotto1.mUnTruncatedTitle)) {
             str1 = str1+"|"+generalBotto1.mUnTruncatedTitle;
          }
          uElementPack.action2 = p0;
          JsonObject jsonObject = new JsonObject();
          jsonObject.a0("biz_type", Integer.valueOf(generalBotto.mBottomBizType));
          jsonObject.c0("title_text", str1);
          jsonObject.c0("linkurl", generalBotto1.mActionUrl);
          jsonObject.c0("bottombar_id", generalBotto1.mBottomBarItemId);
          if (this.u0() != null) {
             jsonObject.c0("expose_reason", this.u0());
          }
          if (generalBotto.mEventTrackData != null) {
             JsonObject jsonObject1 = new JsonObject();
             generalBotto = generalBotto.mEventTrackData;
             a.o(generalBotto, "generalBottomBarInfo.mEventTrackData");
             Iterator iterator = generalBotto.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                String key = uEntry.getKey();
                str1 = uEntry.getValue();
                if (TextUtils.x(key)) {
                   continue ;
                }
                jsonObject1.c0(key, str1);
             }
             if (!TextUtils.x(jsonObject1.toString())) {
                jsonObject.G("extra_params", jsonObject1);
             }
          }
          if (a.g(p1, Boolean.TRUE) && this.B - null > 0) {
             jsonObject.a0("stay_time", Long.valueOf((System.currentTimeMillis() - this.B)));
             jsonObject.c0("action_name", "FEATURED_RECO_ENTRANCE_BUTTON");
          }
          uElementPack.params = jsonObject.toString();
          return uElementPack;
       }
    }
    public c r(){
       t ot = PatchProxy.apply(null, this, BaseGeneralBottomEntryElement.class, "27");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = new t();
       }
       return ot;
    }
    public final ActivityLifeCircleBundle r0(){
       BaseGeneralBottomEntryElement obj = PatchProxy.apply(null, this, BaseGeneralBottomEntryElement.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.C;
       if (obj == null) {
          a.S("mActivityLifeCircleBundle");
       }
       return obj;
    }
    public final DefaultLifecycleObserver s0(){
       return this.D;
    }
    public final QPhoto t0(){
       BaseGeneralBottomEntryElement obj = PatchProxy.apply(null, this, BaseGeneralBottomEntryElement.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.t;
       if (obj == null) {
          a.S("mPhoto");
       }
       return obj;
    }
    public abstract String u0();
    public final void v0(){
       BaseGeneralBottomEntryElement uBaseGeneral1;
       String str1;
       JsonObject jsonObject;
       String str2;
       Object obj = this;
       BaseGeneralBottomEntryElement uBaseGeneral = BaseGeneralBottomEntryElement.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, uBaseGeneral, "18")) {
          return;
       }
       String str = "FEATURED_RECO_ENTRANCE_BUTTON";
       ClickMetaData uClickMetaDa = new ClickMetaData().setType(1).setAreaPackage(this.n0()).setElementPackage(BaseGeneralBottomEntryElement.q0(obj, str, objArray, 2, objArray)).setContentPackage(this.o0());
       j a = j.a;
       BaseGeneralBottomEntryElement t = obj.t;
       if (t == null) {
          a.S("mPhoto");
       }
       GeneralBottomBarWeakInfo generalBotto = a.b(t.getEntity());
       CommonParams uCommonParam = PatchProxy.applyOneRefs(generalBotto, obj, uBaseGeneral, "24");
       if (uCommonParam != PatchProxyResult.class) {
       }else {
          CommonParams uCommonParam1 = new CommonParams();
          ImmutableMap$b uob = ImmutableMap.builder().c("element_action", new g(str)).c("page_name", new g(u1.j().d));
          t = obj.t;
          if (t == null) {
             a.S("mPhoto");
          }
          BaseFeed entity = t.getEntity();
          a.o(entity, "mPhoto.entity");
          t = obj.t;
          if (t == null) {
             a.S("mPhoto");
          }
          String photoId = t.getPhotoId();
          BaseGeneralBottomEntryElement y = obj.y;
          if (PatchProxy.isSupport(uBaseGeneral)) {
             uBaseGeneral1 = y;
             str1 = photoId;
             jsonObject = PatchProxy.applyThreeRefs(entity, photoId, Integer.valueOf(y), this, BaseGeneralBottomEntryElement.class, "25");
             if (jsonObject != PatchProxyResult.class) {
             label_0125 :
                GeneralBottomBarWeakInfo mBottomBarIt = (generalBotto != null)? generalBotto.mBottomBarItemId: null;
                jsonObject.c0("bottombar_id", mBottomBarIt);
                uCommonParam1.mEntryTag = uob.c("params", jsonObject).a();
                uCommonParam = uCommonParam1;
             }
          }else {
             uBaseGeneral1 = y;
             str1 = photoId;
          }
          a.p(entity, "feed");
          GeneralBottomBarInfo generalBotto1 = a.a(entity);
          JsonObject jsonObject1 = new JsonObject();
          jsonObject1.a0("photo_type", Integer.valueOf(r1.S1(entity).toInt()));
          jsonObject1.c0("photo_identity", TextUtils.I(entity.getId()));
          jsonObject1.c0("photo_exp_tag", r1.M0(entity));
          jsonObject1.a0("photo_index", Integer.valueOf(uBaseGeneral1));
          jsonObject1.c0("photo_llsid", r1.w0(entity).mListLoadSequenceID);
          jsonObject1.c0("photo_s_author_id", r1.U1(entity));
          if (generalBotto1 != null) {
             str2 = String.valueOf(generalBotto1.mBottomBizType);
             if (str2 != null) {
             label_011a :
                jsonObject1.c0("photo_biz_type", str2);
                jsonObject1.c0("original_photo_id", str1);
                jsonObject = jsonObject1;
                goto label_0125 ;
             }
          }
          str2 = "";
          goto label_011a ;
       }
       ClickMetaData uClickMetaDa1 = uClickMetaDa.setCommonParams(uCommonParam);
       t = obj.t;
       if (t == null) {
          a.S("mPhoto");
       }
       u1.B(uClickMetaDa1.setFeedLogCtx(t.getFeedLogCtx()));
       return;
    }
    public abstract boolean w0();
}
