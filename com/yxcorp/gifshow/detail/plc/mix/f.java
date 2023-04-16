package com.yxcorp.gifshow.detail.plc.mix.f;
import android.app.Activity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.plc.mix.f$b;
import k2b.e0;
import h4a.a;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import java.lang.Object;
import j4a.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import lnc.i3;
import java.lang.Integer;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;
import java.lang.Number;
import com.yxcorp.gifshow.detail.plc.adapter.WeakStyleDataAdapter;
import f4a.i;
import j4a.c;
import android.content.Context;
import com.yxcorp.utility.TextUtils;
import java.lang.Long;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StyleInfo;
import java.lang.Double;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage;
import com.yxcorp.gifshow.detail.plc.mix.e;
import lnc.c3$b;
import lnc.c3;
import com.yxcorp.gifshow.detail.plc.mix.c;
import com.yxcorp.gifshow.detail.plc.mix.d;
import com.yxcorp.gifshow.detail.plc.mix.b;
import com.yxcorp.gifshow.detail.plc.mix.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$EventTrackData;
import com.yxcorp.gifshow.detail.plc.adapter.StrongStyleDataAdapter;
import com.yxcorp.gifshow.detail.plc.adapter.CommentStyleDataAdapter;
import com.yxcorp.gifshow.detail.plc.adapter.CoverStyleDataAdapter;
import com.yxcorp.gifshow.detail.plc.adapter.LongVideoStyleDataAdapter;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import k2b.l0;
import com.yxcorp.gifshow.log.model.CommonParams;
import je5.b;
import com.google.common.collect.ImmutableMap;
import com.google.gson.JsonObject;
import fg6.a;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import k2b.k2;
import k2b.u1;
import com.google.common.collect.ImmutableMap$b;
import zk.g;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import q2b.h$b;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$PageType;
import com.kwai.sdk.switchconfig.a;
import h4a.j;
import java.lang.reflect.Type;
import el.a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$WeakStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StrongStyleInfo;
import h4a.l;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import k4a.a;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import com.yxcorp.gifshow.detail.plc.helper.PlcStyleChangeType;
import com.yxcorp.gifshow.detail.plc.mix.f$a;
import java.lang.Enum;

public class f	// class@00168d
{
    public Activity a;
    public QPhoto b;
    public PlcEntryStyleInfo c;
    public e0 d;
    public String e;
    public int f;
    public long g;
    public b h;
    public a i;
    public final f$b j;
    public PhotoDetailLogger k;

    public void f(Activity p0,QPhoto p1,f$b p2,e0 p3,a p4,PhotoDetailLogger p5){
       super();
       this.f = 0;
       this.a = p0;
       this.b = p1;
       this.d = p3;
       this.i = p4;
       if (p4 != null) {
          this.h = p4.IR(p1, this.e());
       }
       this.j = p2;
       this.k = p5;
       return;
    }
    public static f d(Activity p0,QPhoto p1,f$b p2,e0 p3,a p4,PhotoDetailLogger p5){
       Object obj;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          obj = PatchProxy.apply(objArray, null, uof, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       f uof1 = new f(p0, p1, p2, p3, p4, p5);
       return obj;
    }
    public final i3 a(int p0){
       PlcEntryStyleInfo obj;
       String str1;
       int i1;
       String str2;
       PlcEntryStyleInfo plcEntryStyl;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uof, "16");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = this.i();
       i3 oi3 = i3.f();
       oi3.d("bussiness_type", String.valueOf(this.e()));
       String str = "";
       if (PatchProxy.isSupport(uof)) {
          str1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uof, "18");
          if (str1 != patchProxyRe) {
          }else {
          label_0045 :
             PlcEntryDataAdapter plcEntryData1 = this.h(p0, this.i());
             str1 = (plcEntryData1 != null)? plcEntryData1.getBizCustomEntryTag(): str;
          }
       }else {
          goto label_0045 ;
       }
       oi3.d("business_custom_key", str1);
       Object[] objArray = null;
       String obj1 = PatchProxy.apply(objArray, this, uof, "25");
       int i = 0;
       if (obj1 != patchProxyRe) {
          i1 = obj1.intValue();
       }else {
          plcEntryStyl = this.i();
          plcEntryStyl = (plcEntryStyl != null)? plcEntryStyl.mCategoryType: 0;
       }
       oi3.d("category_type", String.valueOf(i1));
       obj1 = PatchProxy.apply(objArray, this, uof, "29");
       if (obj1 != patchProxyRe) {
       }else {
          plcEntryStyl = this.i();
          if (plcEntryStyl != null) {
             WeakStyleDataAdapter weakStyleDat = new WeakStyleDataAdapter(this.b, plcEntryStyl);
             if (weakStyleDat.getActionType() == 2) {
                obj1 = PatchProxy.applyOneRefs(weakStyleDat, this, uof, "32");
                if (obj1 != patchProxyRe) {
                }else {
                   i oi = PatchProxy.applyOneRefs(weakStyleDat, this, uof, "33");
                   if (oi != patchProxyRe) {
                   }else {
                      oi = c.a(weakStyleDat);
                   }
                   if (oi.f(this.a, weakStyleDat.getPackageName())) {
                      obj1 = "INSTALL_FINISH";
                   }else if(oi.c(weakStyleDat.getDownloadUrl()) || oi.d(weakStyleDat.getDownloadUrl())){
                      obj1 = "DOWNLOAD_FINISH";
                   }else {
                      oi.g(weakStyleDat.getDownloadUrl());
                      obj1 = "DOWNLOAD";
                   }
                }
             }
          }
          obj1 = str;
       }
       oi3.d("show_style_status", obj1);
       if (PatchProxy.isSupport(uof)) {
          obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uof, "30");
          if (obj1 != patchProxyRe) {
          }else {
          label_0103 :
             plcEntryStyl = this.i();
             obj1 = (plcEntryStyl != null && this.h(p0, plcEntryStyl).getActionType() == 2)? "download": "h5";
          }
       }else {
          goto label_0103 ;
       }
       oi3.d("click_type", obj1);
       oi3.d("sign", String.valueOf(this.g));
       i1 = 5;
       if (p0 != 1) {
          if (p0 != 3) {
             if (p0 != 4) {
                if (p0 != i1) {
                   str2 = (p0 != 6)? "STRONG": "COMMENT";
                }else {
                label_0143 :
                   str2 = "WEAK";
                }
             }else {
                str2 = "COVER";
             }
          }else {
             str2 = "SPECIAL";
          }
       }else {
          goto label_0143 ;
       }
       oi3.d("show_type", str2);
       str2 = PatchProxy.apply(objArray, this, uof, "21");
       if (str2 != patchProxyRe) {
       }else {
          PlcEntryStyleInfo plcEntryStyl1 = this.i();
          str2 = (plcEntryStyl1 == null)? str: plcEntryStyl1.photoPage;
          str2 = TextUtils.k(str2);
       }
       oi3.d("photo_page", str2);
       oi3.c("player_timepoint", Long.valueOf(this.j.b()));
       i1 = (p0 != i1)? 1: 0;
       oi3.c("vertical_index", Integer.valueOf(i1));
       PlcEntryDataAdapter obj2 = PatchProxy.apply(objArray, this, uof, "20");
       if (obj2 != patchProxyRe) {
          i1 = obj2.intValue();
       }else {
          plcEntryStyl = this.i();
          i1 = (plcEntryStyl == null)? 0: plcEntryStyl.showPageType;
       }
       oi3.d("show_page_type", String.valueOf(i1));
       if (PatchProxy.isSupport(uof)) {
          obj2 = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uof, "27");
          if (obj2 != patchProxyRe) {
             i1 = obj2.intValue();
          }else {
          label_01c0 :
             obj2 = this.h(p0, this.i());
             i1 = (obj2 == null)? 0: obj2.getStyleType();
          }
       }else {
          goto label_01c0 ;
       }
       if (i1 > 0) {
          oi3.c("card_type", Integer.valueOf(i1));
       }
       if (obj != null && obj.mStyleInfo != null) {
          if (PatchProxy.isSupport(uof)) {
             obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uof, "19");
             if (obj1 != patchProxyRe) {
             label_0206 :
                oi3.d("btn_content", obj1);
                if (p0 == 2) {
                   if (PatchProxy.isSupport(uof)) {
                      Object obj3 = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uof, "17");
                      if (obj3 != patchProxyRe) {
                         i = obj3.intValue();
                      }else {
                      label_0226 :
                         PlcEntryDataAdapter plcEntryData = this.h(p0, this.i());
                         if (plcEntryData != null) {
                            objArray = plcEntryData.getAtmosphereBarImage();
                         }
                         if (!q.f(objArray)) {
                            i = 1;
                         }
                      }
                   }else {
                      goto label_0226 ;
                   }
                   oi3.c("is_atmosphere_bar", Integer.valueOf(i));
                   oi3.c("strong_duration", Long.valueOf(obj.mStyleInfo.mWeakToStrongVideoMillis));
                   oi3.c("strong_surplus_duration", Long.valueOf(obj.mStyleInfo.weakToStrongVideoCountdownMillis));
                   oi3.c("strong_progress", Double.valueOf(obj.mStyleInfo.mWeakToStrongVideoPercent));
                   oi3.d("strong_show_type", this.e);
                   f tf = this.f;
                   if (tf != null) {
                      oi3.c("backup_card_type", Integer.valueOf(tf));
                   }
                }
             }
          }
          obj2 = this.h(p0, this.i());
          if (obj2 != null) {
             str = obj2.getTitle();
          }
          obj1 = str;
          goto label_0206 ;
       }
    label_0280 :
       return oi3;
    }
    public final ClientContent$ContentPackage b(int p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uof, "22");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.c(p0, null);
    }
    public final ClientContent$ContentPackage c(int p0,PlcEntryStyleInfo$TagPackage p1){
       ClientContent$ContentPackage obj;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uof, "23");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.j.c(this.b);
       PlcEntryStyleInfo plcEntryStyl = this.i();
       if (plcEntryStyl != null) {
          plcEntryStyl = plcEntryStyl.mStyleInfo;
          if (plcEntryStyl != null) {
             int i = 0;
             switch (p0){
                 case 1:
                 case 5:
                   i = c3.a(plcEntryStyl.mWeakStyleTemplateInfo, a.a);
                   break;
                 case 2:
                   i = c3.a(plcEntryStyl.mStrongStyleTemplateInfo, b.a);
                   break;
                 case 3:
                   i = c3.a(plcEntryStyl.mLongVideoStyleTemplateInfo, d.a);
                   break;
                 case 4:
                   i = c3.a(plcEntryStyl.mCoverStyleTemplateInfo, c.a);
                   break;
                 case 6:
                   i = c3.a(plcEntryStyl.mCommentStyleInfo, e.a);
                   break;
                 default:
             }
             if (p1 == null) {
                p1 = i;
             }
             if (p1 != null) {
                ClientContent$TagPackage tagPackage = new ClientContent$TagPackage();
                obj.tagPackage = tagPackage;
                tagPackage.identity = TextUtils.I(p1.mIdentity);
                tagPackage.name = TextUtils.I(p1.mName);
                ClientContent$ContentPackage tagPackage1 = obj.tagPackage;
                tagPackage1.type = p1.mType;
                tagPackage1.secondaryType = TextUtils.I(p1.mSecondaryType);
                tagPackage1.params = TextUtils.I(p1.mParams);
             }
          }
       }
       return obj;
    }
    public final int e(){
       int i;
       PlcEntryStyleInfo obj = PatchProxy.apply(null, this, f.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.i();
       obj = (obj != null)? obj.mBizType: 0;
       return obj;
    }
    public final String f(){
       PlcEntryStyleInfo$EventTrackData mKsOrderId;
       PlcEntryStyleInfo obj = PatchProxy.apply(null, this, f.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.i();
       if (obj != null) {
          obj = obj.mEventTrackData;
          if (obj != null) {
             mKsOrderId = obj.mKsOrderId;
          label_001f :
             return mKsOrderId;
          }
       }
       mKsOrderId = "";
       goto label_001f ;
    }
    public b g(){
       return this.h;
    }
    public final PlcEntryDataAdapter h(int p0,PlcEntryStyleInfo p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uof, "31");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 == null) {
          return null;
       }else if(p0 != 1){
          if (p0 != 3) {
             if (p0 != 4) {
                if (p0 != 5) {
                   if (p0 != 6) {
                      return new StrongStyleDataAdapter(this.b, p1);
                   }else {
                      return new CommentStyleDataAdapter(this.b, p1);
                   }
                }
             }else {
                return new CoverStyleDataAdapter(this.b, p1);
             }
          }else {
             return new LongVideoStyleDataAdapter(this.b, p1);
          }
       }
       return new WeakStyleDataAdapter(this.b, p1);
    }
    public final PlcEntryStyleInfo i(){
       f obj = PatchProxy.apply(null, this, f.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj == null) {
          PlcEntryStyleInfo plcEntryStyl = this.b.getPlcEntryStyleInfo();
       }
       return obj;
    }
    public final void j(int p0,int p1,PlcEntryStyleInfo$TagPackage p2,int p3,boolean p4){
       String str;
       String str1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),p2,Integer.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uof, "11")) {
             return;
          }
       }
       if (!this.k()) {
          return;
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "DIVERSION_INLET";
          if (PatchProxy.isSupport(uof)) {
             str = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p3), Boolean.valueOf(p4), this, f.class, "15");
             if (str != patchProxyRe) {
             label_007f :
                uElementPack.params = str;
                ClientContent$ContentPackage uContentPack = this.c(p0, p2);
                uContentPack.ksOrderInfoPackage = l0.a(this.f());
                f th = this.h;
                if (th != null) {
                   th.a(uContentPack, uElementPack, p1);
                }
                CommonParams uCommonParam = new CommonParams();
                ImmutableMap immutableMap = PatchProxy.applyTwoRefs(uElementPack, uContentPack, null, b.class, "8");
                if (immutableMap != patchProxyRe) {
                }else {
                   JsonObject jsonObject = new JsonObject();
                   Gson a = a.a;
                   jsonObject.G("element_package", a.x(uElementPack));
                   jsonObject.G("content_package", a.x(uContentPack));
                   k2 ok2 = u1.j();
                   ImmutableMap$b uob = ImmutableMap.builder();
                   uob.c("element_action", new g(uElementPack.action2));
                   ok2 = (ok2 != null)? ok2.d: "";
                   uob.c("page_name", new g(ok2));
                   uob.c("params", jsonObject);
                   immutableMap = uob.a();
                }
                uCommonParam.mEntryTag = immutableMap;
                u1.B(new ClickMetaData().setLogPage(this.d).setType(1).setElementPackage(uElementPack).setContentPackage(uContentPack).setCommonParams(uCommonParam).setFeedLogCtx(this.b.getFeedLogCtx()));
                return;
             }
          }
          i3 oi3 = this.a(p0);
          oi3.c("click_index", Integer.valueOf(p3));
          oi3.c("trigger_click_type", Integer.valueOf(p4));
          str = oi3.toString();
          goto label_007f ;
       }
    }
    public final boolean k(){
       PlcEntryStyleInfo obj = PatchProxy.apply(null, this, f.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.i();
       boolean b = (obj != null && (obj.mStyleInfo != null && obj.mBizType > null))? true: false;
       return b;
    }
    public void l(int p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uof, "13")) {
          return;
       }
       if (!this.k()) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "BUSINESS_INSTALL_COMPLETED";
       uElementPack.params = this.a(p0).toString();
       h$b uob = h$b.e(7, "BUSINESS_INSTALL_COMPLETED");
       uob.k(uElementPack);
       uob.h(this.b(p0));
       u1.p0("", this.d, uob);
       return;
    }
    public void m(int p0,int p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uof, "8")) {
          return;
       }
       this.j(p0, p1, null, 0, true);
       return;
    }
    public void n(int p0,int p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uof, "7")) {
          return;
       }
       this.j(p0, p1, null, 0, false);
       return;
    }
    public void o(int p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uof, "12")) {
          return;
       }
       if (!this.k()) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "DIVERSION_INLET_CLOSE";
       uElementPack.params = this.a(p0).toString();
       ClientContent$ContentPackage uContentPack = this.b(p0);
       uContentPack.ksOrderInfoPackage = l0.a(this.f());
       u1.B(new ClickMetaData().setLogPage(this.d).setType(3).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(this.b.getFeedLogCtx()));
       return;
    }
    public void p(int p0,int p1,int p2){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, f.class, "10")) {
          return;
       }
       this.j(p0, p1, null, p2, false);
       return;
    }
    public void q(int p0,int p1){
       l a;
       f tc;
       PlcEntryStyleInfo$TagPackage mParams;
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uof, "4")) {
          return;
       }
       if (!this.k()) {
          return;
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, uof, "5")) {
          PlcEntryStyleInfo$PageType pageType1 = this.j.a();
          PlcEntryStyleInfo plcEntryStyl = this.i();
          String str = null;
          int i = (plcEntryStyl == null)? 0: plcEntryStyl.mBizType;
          tc = (pageType1 != PlcEntryStyleInfo$PageType.COUPLE && (pageType1 == PlcEntryStyleInfo$PageType.SINGLE || pageType1 == PlcEntryStyleInfo$PageType.LONG_VIDEO_DETAIL))? 1: null;
          if (plcEntryStyl != null && (this.k != null && tc)) {
             str = 1;
          }
       label_0056 :
          if (str) {
             this.k.putBizParam("is_plc", "1");
             this.k.putBizParam("bussiness_type", String.valueOf(i));
             if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidTwoRefs(plcEntryStyl, Integer.valueOf(i), this, uof, "6")) {
                List value = a.t().getValue("PlcPoiVseSupportBizSet", new j(this).getType(), objArray);
                if (this.k != null && (plcEntryStyl != null && (plcEntryStyl.mStyleInfo != null && (value != null && value.contains(Integer.valueOf(i)))))) {
                   PlcEntryStyleInfo mStyleInfo = plcEntryStyl.mStyleInfo;
                   PlcEntryStyleInfo$StyleInfo mWeakStyleTe = mStyleInfo.mWeakStyleTemplateInfo;
                   PlcEntryStyleInfo$StyleInfo mStrongStyle = mStyleInfo.mStrongStyleTemplateInfo;
                   String str1 = "";
                   if (mWeakStyleTe != null) {
                      PlcEntryStyleInfo$WeakStyleInfo mTagPackage = mWeakStyleTe.mTagPackage;
                      if (mTagPackage != null) {
                         str1 = mTagPackage.mIdentity;
                         mParams = mTagPackage.mParams;
                      }else if(mStrongStyle != null){
                         PlcEntryStyleInfo$StrongStyleInfo mTagPackage1 = mStrongStyle.mTagPackage;
                         if (mTagPackage1 != null) {
                            str1 = mTagPackage1.mIdentity;
                            mParams = mTagPackage1.mParams;
                         }
                      }
                      mParams = str1;
                   }else {
                      goto label_00bd ;
                   }
                   this.k.putBizParam("locallife_plc_biz", String.valueOf(i));
                   this.k.putBizParam("locallife_plc_id", TextUtils.I(str1));
                   this.k.putBizParam("locallife_plc_exp", TextUtils.I(mParams));
                }
             }
          }
       }
    label_00ea :
       a = l.a;
       tc = this.c;
       PlcEntryStyleInfo$PageType pageType = this.j.a();
       f tb = this.b;
       Objects.requireNonNull(a);
       if (!PatchProxy.isSupport(l.class) || !PatchProxy.applyVoidFourRefs(tc, pageType, Integer.valueOf(p0), tb, a, l.class, "1")) {
          a.p(pageType, "pageType");
          if (tc != null) {
             a uoa = new a(0, tc, pageType, p0, tb);
             RxBus.f.b(a);
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "DIVERSION_INLET";
       uElementPack.params = this.a(p0).toString();
       ClientContent$ContentPackage uContentPack = this.b(p0);
       uContentPack.ksOrderInfoPackage = l0.a(this.f());
       f th = this.h;
       if (th != null) {
          th.b(uContentPack, uElementPack, p1);
       }
       u1.B0(new ShowMetaData().setLogPage(this.d).setType(3).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(this.b.getFeedLogCtx()));
       return;
    }
    public void r(int p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uof, "14")) {
          return;
       }
       if (!this.k()) {
          return;
       }
       h$b uob = h$b.e(10, "DOWNLOAD_SUCCESS");
       ClientContent$ContentPackage uContentPack = this.b(p0);
       uContentPack.ksOrderInfoPackage = l0.a(this.f());
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "DOWNLOAD_SUCCESS";
       uElementPack.params = this.a(p0).toString();
       uob.k(uElementPack);
       uob.h(uContentPack);
       u1.p0("", this.d, uob);
       return;
    }
    public void s(int p0,PlcEntryStyleInfo$TagPackage p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uof, "9")) {
          return;
       }
       this.j(2, p0, p1, 0, false);
       return;
    }
    public void t(PlcEntryStyleInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       this.c = p0;
       f ti = this.i;
       if (ti != null) {
          this.h = ti.IR(this.b, this.e());
       }
       return;
    }
    public void u(long p0){
       this.g = p0;
    }
    public void v(int p0){
       this.f = p0;
    }
    public void w(PlcStyleChangeType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "3")) {
          return;
       }
       int i = f$a.a[p0.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i == 3) {
                this.e = "PROGRESS";
             }
          }else {
             this.e = "SURPLUS_DURATION";
          }
       }else {
          this.e = "DURATION";
       }
       return;
    }
}
