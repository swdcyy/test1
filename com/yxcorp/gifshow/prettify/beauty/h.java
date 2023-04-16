package com.yxcorp.gifshow.prettify.beauty.h;
import java.lang.Object;
import java.util.List;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BeautySubFeaturesPackage;
import q0c.w1;
import com.yxcorp.gifshow.prettify.beauty.h$a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$CameraRecordFeaturesStatusPackage;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import com.yxcorp.gifshow.prettify.beauty.e;
import java.lang.Iterable;
import ok.o;
import qk.y;
import com.yxcorp.gifshow.prettify.beauty.f;
import qr4.k$b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BeautyStatusPackage;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import qr4.k$b$a;
import java.lang.Number;
import n1c.b;
import android.util.SparseArray;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyPart;
import java.util.Iterator;
import qr4.k$n;
import com.kuaishou.client.log.content.packages.nano.ClientContent$StyleStatusPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$AdjustSilderItemPackage;
import qr4.k$n$a;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import com.kuaishou.client.log.content.packages.nano.ClientContent$FilterDetailPackage;
import com.yxcorp.gifshow.video.api.prettify.filter.FilterVideoPlugin$FilterEntranceType;
import com.yxcorp.gifshow.prettify.v4.magic.filter.Filters;
import com.kwai.feature.post.api.componet.prettify.makeup.model.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BeautyMakeUpStatusPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BeautyMakeUpSubFeaturesPackage;
import com.kwai.feature.post.api.componet.prettify.makeup.model.a$a;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MagicFacePackage;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import java.lang.NumberFormatException;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.yxcorp.gifshow.model.MagicFaceIconTipMsg;
import qr4.k$c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BodyUsePackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BodySubFeaturesPackage;
import qr4.k$c$a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautyFilterItem;
import java.lang.Float;
import java.lang.Math;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import q2b.h$b;
import k2b.u1;
import lnc.i3;
import com.kwai.feature.post.api.componet.prettify.PrettyGuideInfo;
import java.lang.Long;
import xyb.a;
import q87.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$FeaturesElementStayLengthPackage;
import o0c.f;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ProductionEditOperationPackage;
import h16.g;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import org.json.JSONObject;
import java.lang.Throwable;
import w46.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;

public final class h	// class@00110a
{

    public void h(){
       super();
    }
    public static void a(List p0,BeautifyConfig p1,int p2,int p3){
       BeautifyConfig obj;
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), null, h.class, "3")) {
          return;
       }
       if (PatchProxy.isSupport(oh)) {
          obj = PatchProxy.applyThreeRefs(p1, Integer.valueOf(p2), Integer.valueOf(p3), null, h.class, "4");
          if (obj != PatchProxyResult.class) {
          }else {
          label_003d :
             obj = w1.a(p1.mId);
             if (obj == null) {
                obj = null;
             }else {
                ClientContent$BeautySubFeaturesPackage uBeautySubFe = new ClientContent$BeautySubFeaturesPackage();
                float f = h.f(p1, p2);
                uBeautySubFe.value = f;
                uBeautySubFe.isAdjusted = (!f - h.f(obj, p2))? false: true;
                uBeautySubFe.subFeatures = p3;
                obj = uBeautySubFe;
             }
          }
       }else {
          goto label_003d ;
       }
       if (obj != null) {
          p0.add(obj);
       }
       return;
    }
    public static ClientContent$CameraRecordFeaturesStatusPackage b(h$a p0){
       int b;
       ArrayList uArrayList1;
       h oh1;
       ArrayList uArrayList2;
       b obj2;
       int i2;
       BeautifyPart uBeautifyPar;
       ArrayList uArrayList4;
       int i5;
       FilterVideoPlugin$FilterEntranceType uFilterEntra;
       ArrayList obj3;
       ClientContent$MagicFacePackage magicFacePac;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h oh = h.class;
       Object obj = null;
       h$a obj1 = PatchProxy.applyOneRefs(p0, obj, oh, "9");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = p0.a();
       ClientContent$CameraRecordFeaturesStatusPackage uCameraRecor = new ClientContent$CameraRecordFeaturesStatusPackage();
       h$a f = obj1.f;
       ArrayList uArrayList = (!q.f(obj1.l))? new ArrayList(obj1.l): obj;
       if (!q.f(uArrayList)) {
          y.q(uArrayList, e.b);
          b = y.c(uArrayList, f.b);
       }else {
          b = false;
       }
       if (!b) {
          b = (f != null && f.mId > null)? true: false;
       }
    label_004c :
       uCameraRecor.beauty = b;
       if (obj1.c != null && !q.f(uArrayList)) {
          uArrayList1 = new ArrayList();
          b = 0;
          while (b < uArrayList.size()) {
             k$b uob = uArrayList.get(b);
             if (uob == null) {
                oh1 = oh;
                uArrayList2 = uArrayList;
             }else {
                ClientContent$BeautyStatusPackage uBeautyStatu = new ClientContent$BeautyStatusPackage();
                if (!TextUtils.x(uob.g)) {
                   uBeautyStatu.type = Integer.parseInt(uob.g);
                }
                int i = b + 1;
                uBeautyStatu.segmentIndex = String.valueOf(i);
                ArrayList uArrayList3 = new ArrayList();
                if (!PatchProxy.applyVoidTwoRefs(uArrayList3, uob, obj, oh, "5")) {
                   uob = uob.c;
                   int len = uob.length;
                   int i1 = 0;
                   while (i1 < len) {
                      object oobject = uob[i1];
                      if (oobject != null) {
                         ClientContent$BeautySubFeaturesPackage uBeautySubFe1 = new ClientContent$BeautySubFeaturesPackage();
                         uBeautySubFe1.isAdjusted = oobject.c;
                         uBeautySubFe1.value = oobject.d;
                         k$b$a a = oobject.a;
                         if (PatchProxy.isSupport(oh)) {
                            uArrayList2 = uArrayList;
                            obj2 = PatchProxy.applyOneRefs(Integer.valueOf(a), obj, oh, "26");
                            if (obj2 != patchProxyRe) {
                               i2 = obj2.intValue();
                               oh1 = oh;
                            label_00ff :
                               uBeautySubFe1.subFeatures = i2;
                               uArrayList3.add(uBeautySubFe1);
                            }
                         }else {
                            uArrayList2 = uArrayList;
                         }
                         obj2 = b.class;
                         if (PatchProxy.isSupport(obj2)) {
                            oh1 = oh;
                            uBeautifyPar = PatchProxy.applyOneRefs(Integer.valueOf(a), obj, obj2, "1");
                            if (uBeautifyPar != patchProxyRe) {
                            label_00fb :
                               i2 = uBeautifyPar.mSubFeature;
                               goto label_00ff ;
                            }
                         }else {
                            oh1 = oh;
                         }
                         uBeautifyPar = b.a.get(a);
                         goto label_00fb ;
                      }else {
                         oh1 = oh;
                         uArrayList2 = uArrayList;
                      }
                      i1 = i1 + 1;
                      uArrayList = uArrayList2;
                      oh = oh1;
                   }
                }
                oh1 = oh;
                uArrayList2 = uArrayList;
                ClientContent$BeautySubFeaturesPackage[] uBeautySubFe = new ClientContent$BeautySubFeaturesPackage[uArrayList3.size()];
                uBeautyStatu.beautySubFeaturesPackage = uBeautySubFe;
                uArrayList3.toArray(uBeautySubFe);
                uArrayList1.add(uBeautyStatu);
             }
             b = b + 1;
             uArrayList = uArrayList2;
             oh = oh1;
          }
          if (uArrayList1.size() > 0) {
             ClientContent$BeautyStatusPackage[] uBeautyStatu1 = new ClientContent$BeautyStatusPackage[uArrayList1.size()];
             uCameraRecor.beautyUsePackage = uArrayList1.toArray(uBeautyStatu1);
          }
       }else if(obj1.c == null && (obj1.f != null && (f != null && f.mId > null))){
          ClientContent$BeautyStatusPackage uBeautyStatu2 = new ClientContent$BeautyStatusPackage();
          uBeautyStatu2.type = f.mId;
          ArrayList uArrayList6 = new ArrayList();
          h.a(uArrayList6, f, 1, 1);
          b = 44;
          h.a(uArrayList6, f, b, 46);
          h.a(uArrayList6, f, 2, 3);
          h.a(uArrayList6, f, 3, 4);
          h.a(uArrayList6, f, 4, 5);
          h.a(uArrayList6, f, 12, 8);
          h.a(uArrayList6, f, 13, 9);
          h.a(uArrayList6, f, 11, 7);
          h.a(uArrayList6, f, 10, 6);
          h.a(uArrayList6, f, 18, 18);
          h.a(uArrayList6, f, 16, 20);
          h.a(uArrayList6, f, 17, 26);
          h.a(uArrayList6, f, 29, 30);
          h.a(uArrayList6, f, 30, 31);
          h.a(uArrayList6, f, 31, 15);
          h.a(uArrayList6, f, 32, 32);
          h.a(uArrayList6, f, 38, 16);
          h.a(uArrayList6, f, 33, 34);
          h.a(uArrayList6, f, 34, 35);
          int len1 = 36;
          h.a(uArrayList6, f, 35, len1);
          h.a(uArrayList6, f, len1, 37);
          h.a(uArrayList6, f, 37, 38);
          int i6 = 39;
          h.a(uArrayList6, f, 38, i6);
          h.a(uArrayList6, f, i6, 40);
          h.a(uArrayList6, f, 42, b);
          ClientContent$BeautySubFeaturesPackage[] uBeautySubFe2 = new ClientContent$BeautySubFeaturesPackage[uArrayList6.size()];
          uBeautyStatu2.beautySubFeaturesPackage = uBeautySubFe2;
          uArrayList6.toArray(uBeautySubFe2);
          ClientContent$BeautyStatusPackage[] uBeautyStatu3 = new ClientContent$BeautyStatusPackage[]{uBeautyStatu2};
          uCameraRecor.beautyUsePackage = uBeautyStatu3;
       label_01f5 :
          if (!q.f(obj1.k)) {
             uArrayList4 = new ArrayList();
             Iterator iterator = obj1.k.iterator();
             while (iterator.hasNext()) {
                k$n on = iterator.next();
                if (on == null) {
                   continue ;
                }else {
                   ClientContent$StyleStatusPackage styleStatusP = new ClientContent$StyleStatusPackage();
                   styleStatusP.styleId = on.b;
                   styleStatusP.name = on.c;
                   ArrayList uArrayList5 = new ArrayList();
                   on = on.d;
                   len1 = on.length;
                   for (int i4 = 0; i4 < len1; i4 = i4 + 1) {
                      object oobject1 = on[i4];
                      ClientContent$AdjustSilderItemPackage uAdjustSilde = new ClientContent$AdjustSilderItemPackage();
                      uAdjustSilde.item = oobject1.b;
                      uAdjustSilde.value = oobject1.c;
                      uAdjustSilde.isAdjusted = oobject1.a;
                      uArrayList5.add(uAdjustSilde);
                   }
                   ClientContent$AdjustSilderItemPackage[] uAdjustSilde1 = new ClientContent$AdjustSilderItemPackage[uArrayList5.size()];
                   styleStatusP.adjustSliderItemPackage = uArrayList5.toArray(uAdjustSilde1);
                   uArrayList4.add(styleStatusP);
                }
             }
             if (uArrayList4.size() > 0) {
                ClientContent$StyleStatusPackage[] styleStatusP1 = new ClientContent$StyleStatusPackage[uArrayList4.size()];
                uCameraRecor.styleStatusPackage = uArrayList4.toArray(styleStatusP1);
             }
          }
          if (obj1.g != null) {
             uArrayList4 = new ArrayList();
             i5 = 0;
             while (i5 < obj1.g.size()) {
                FilterConfig uFilterConfi = obj1.g.get(i5);
                if (uFilterConfi == null) {
                   uFilterEntra = 1;
                }else {
                   ClientContent$FilterDetailPackage uFilterDetai = new ClientContent$FilterDetailPackage();
                   uFilterDetai.id = String.valueOf(uFilterConfi.mFilterId);
                   uFilterDetai.name = uFilterConfi.getDisplayName();
                   uFilterDetai.index = uFilterConfi.getPosition();
                   i6 = i5 + 1;
                   uFilterDetai.segmentIndex = i6;
                   uFilterDetai.value = uFilterConfi.mIntensity;
                   Iterator iterator1 = new ArrayList(Filters.getAllFilterForType(FilterVideoPlugin$FilterEntranceType.VIDEO)).iterator();
                   while (true) {
                      if (iterator1.hasNext()) {
                         FilterConfig uFilterConfi1 = iterator1.next();
                         if (uFilterConfi1.mFilterId == uFilterConfi.mFilterId) {
                            i2 = h.h(uFilterConfi.mIntensity, uFilterConfi1.mIntensity) ^ 1;
                            uFilterDetai.isAdjusted = i2;
                         }else {
                            continue ;
                         }
                      }else {
                         uFilterEntra = 1;
                      }
                      uArrayList4.add(uFilterDetai);
                   }
                }
                i5 = i5 + 1;
             }
             if (uArrayList4.size() > 0) {
                ClientContent$FilterDetailPackage[] uFilterDetai1 = new ClientContent$FilterDetailPackage[uArrayList4.size()];
                uCameraRecor.filterUsePackage = uArrayList4.toArray(uFilterDetai1);
             }
          }
          if (obj1.h != null) {
             uArrayList4 = new ArrayList();
             i5 = 0;
             while (i5 < obj1.h.size()) {
                a uoa = obj1.h.get(i5);
                if (uoa != null) {
                   ClientContent$BeautyMakeUpStatusPackage uBeautyMakeU = new ClientContent$BeautyMakeUpStatusPackage();
                   uBeautyMakeU.primaryTypeNew = uoa.a;
                   uBeautyMakeU.primaryIndex = uoa.b;
                   ClientContent$BeautyMakeUpSubFeaturesPackage[] uBeautyMakeU1 = new ClientContent$BeautyMakeUpSubFeaturesPackage[uoa.c.size()];
                   uBeautyMakeU.beautyMakeUpSubFeaturesPackage = uBeautyMakeU1;
                   for (i6 = 0; i6 < uoa.c.size(); i6 = i6 + 1) {
                      a$a uoa1 = uoa.c.get(i6);
                      ClientContent$BeautyMakeUpSubFeaturesPackage uBeautyMakeU2 = new ClientContent$BeautyMakeUpSubFeaturesPackage();
                      uBeautyMakeU2.tabId = uoa.f;
                      uBeautyMakeU2.segmentIndex = String.valueOf(i5);
                      uBeautyMakeU2.secodaryTypeNew = uoa1.a;
                      uBeautyMakeU2.secodaryIndex = uoa1.b;
                      uBeautyMakeU2.thirdType = uoa1.c;
                      uBeautyMakeU2.thirdIndex = uoa1.d;
                      uBeautyMakeU2.value = String.valueOf(uoa1.e);
                      uBeautyMakeU.beautyMakeUpSubFeaturesPackage[i6] = uBeautyMakeU2;
                   }
                   uArrayList4.add(uBeautyMakeU);
                }
                i5 = i5 + 1;
             }
             if (uArrayList4.size() > 0) {
                ClientContent$BeautyMakeUpStatusPackage[] uBeautyMakeU3 = new ClientContent$BeautyMakeUpStatusPackage[uArrayList4.size()];
                uCameraRecor.beautyMakeUpStatusDetailPackage = uArrayList4.toArray(uBeautyMakeU3);
             }
          }
          if (obj1.i != null) {
             uArrayList1 = new ArrayList();
             i2 = 0;
             while (i2 < obj1.i.size()) {
                obj3 = obj1.i.get(i2);
                if (obj3 != null) {
                   try{
                      magicFacePac = new ClientContent$MagicFacePackage();
                      magicFacePac.groupId = Integer.parseInt(obj3.mGroupId);
                   }catch(java.lang.NumberFormatException e0){
                      e0.printStackTrace();
                   }
                   magicFacePac.id = obj3.mId;
                   h$a j = obj1.j;
                   String str = (j != null && i2 < j.size())? obj1.j.get(i2): obj;
                   magicFacePac.parentId = TextUtils.k(str);
                   magicFacePac.name = obj3.mName;
                   magicFacePac.index = obj3.mColumnIndex;
                   magicFacePac.segmentIndex = obj3.mRowIndex;
                   MagicEmoji$MagicFace mMagicFaceIc = obj3.mMagicFaceIconTipMsg;
                   if (mMagicFaceIc != null) {
                      magicFacePac.showCoverTag = obj3.mShouldShowMagicFaceTip;
                      magicFacePac.strategyId = String.valueOf(mMagicFaceIc.mStrategyId);
                   }
                   mMagicFaceIc = obj3.mRequestId;
                   if (mMagicFaceIc != null) {
                      magicFacePac.reqId = mMagicFaceIc;
                   }
                   uArrayList1.add(magicFacePac);
                }
                i2 = i2 + 1;
             }
             if (uArrayList1.size() > 0) {
                ClientContent$MagicFacePackage[] magicFacePac1 = new ClientContent$MagicFacePackage[uArrayList1.size()];
                uCameraRecor.magicFacePackage = uArrayList1.toArray(magicFacePac1);
             }
          }
          if (obj1.m != null) {
             uArrayList4 = new ArrayList();
             int i7 = 0;
             while (i7 < obj1.m.size()) {
                k$c uoc = obj1.m.get(i7);
                if (uoc != null) {
                   ClientContent$BodyUsePackage uBodyUsePack = new ClientContent$BodyUsePackage();
                   uBodyUsePack.useQuickBody = uoc.d;
                   obj3 = new ArrayList();
                   for (i6 = 0; i6 < uoc.c.length; i6 = i6 + 1) {
                      ClientContent$BodySubFeaturesPackage uBodySubFeat = new ClientContent$BodySubFeaturesPackage();
                      k$c c = uoc.c;
                      uBodySubFeat.item = c[i6].a;
                      float f1 = (float)c[i6].b / 100.00f;
                      uBodySubFeat.value = f1;
                      obj3.add(uBodySubFeat);
                   }
                   ClientContent$BodySubFeaturesPackage[] uBodySubFeat1 = new ClientContent$BodySubFeaturesPackage[obj3.size()];
                   uBodyUsePack.bodySubFeaturesPackage = obj3.toArray(uBodySubFeat1);
                   uArrayList4.add(uBodyUsePack);
                }
                i7 = i7 + 1;
             }
             if (uArrayList4.size() > 0) {
                ClientContent$BodyUsePackage[] uBodyUsePack1 = new ClientContent$BodyUsePackage[uArrayList4.size()];
                uCameraRecor.bodyUserPackage = uArrayList4.toArray(uBodyUsePack1);
             }
          }
       }
       int i3 = 0;
       goto label_01f5 ;
    }
    public static ClientContent$ContentPackage c(h$a p0){
       ClientContent$ContentPackage obj = PatchProxy.applyOneRefs(p0, null, h.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       obj.cameraRecordFeaturesStatusPackage = h.b(p0);
       return obj;
    }
    public static String d(BeautifyConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, h.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h.e(p0, false);
    }
    public static String e(BeautifyConfig p0,boolean p1){
       String obj;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, oh, "25");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = "preset_0";
       if (p0 != null) {
          BeautifyConfig mId = p0.mId;
          if (mId != -1) {
             if (p1 && (mId == 100 && p0.mUseQuickBeauty == null)) {
                return obj;
             }else {
                return "preset_"+p0.mId;
             }
          }
       }
       return obj;
    }
    public static float f(BeautifyConfig p0,int p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, oh, "16");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       BeautyFilterItem beautifyItem = p0.getBeautifyItemById(p1);
       if (beautifyItem == null) {
          return 0;
       }else {
          return h.g(p0, beautifyItem);
       }
    }
    public static float g(BeautifyConfig p0,BeautyFilterItem p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, h.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (p1.getUIFilterValue(p0) / 100.00f);
    }
    public static boolean h(float p0,float p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), null, oh, "27");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (Math.abs((p0 - p1)) - 0x3c23d70a < 0)? true: false;
       return b;
    }
    public static void i(e0 p0,BeautifyConfig p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, h.class, "41")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "BEUATIFY_RESTORE";
       if (p1 != null && p1.mId != -1) {
          JsonObject jsonObject = new JsonObject();
          jsonObject.a0("suit_id", Integer.valueOf(p1.mId));
          jsonObject.c0("suit_name", TextUtils.k(p1.mLoggerName));
          JsonArray jsonArray = new JsonArray();
          Iterator iterator = p1.mBeautyFilterItemList.iterator();
          while (iterator.hasNext()) {
             BeautyFilterItem uBeautyFilte = iterator.next();
             if (!p1.mUnSupportItemList.contains(Integer.valueOf(uBeautyFilte.mId))) {
                JsonObject jsonObject1 = new JsonObject();
                jsonObject1.a0("id", Integer.valueOf(uBeautyFilte.mId));
                jsonObject1.c0("name", TextUtils.k(uBeautyFilte.getLoggerName()));
                jsonObject1.a0("value", Float.valueOf(BeautyFilterItem.getFilterValue(p1, uBeautyFilte)));
                jsonArray.G(jsonObject1);
             }
          }
          jsonObject.G("items", jsonArray);
          uElementPack.params = jsonObject.toString();
       }
       h$b uob = h$b.e(7, "BEUATIFY_RESTORE");
       uob.k(uElementPack);
       u1.p0("", p0, uob);
       return;
    }
    public static void j(e0 p0,boolean p1,boolean p2,SparseArray p3){
       int b;
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), p3, null, h.class, "20")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "BEAUTY_SUIT";
       JsonObject jsonObject = new JsonObject();
       if (p1) {
          jsonObject.H("is_new_version", Boolean.valueOf(p2));
       }
       JsonArray jsonArray = new JsonArray();
       int i = 0;
       JsonObject obj = null;
       int i1 = 3;
       while (i < p3.size()) {
          BeautifyConfig uBeautifyCon = p3.get(i);
          if (uBeautifyCon != null) {
             BeautifyConfig mId = uBeautifyCon.mId;
             String str = 1000;
             if (mId == str || mId == 999) {
                b = (mId == str)? true: false;
                if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(b), p0, obj, h.class, "29")) {
                   ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
                   uElementPack1.action2 = "SWITCH_VERSION_BUTTON";
                   i3 oi3 = i3.f();
                   String str1 = (b)? "new": "old";
                   oi3.d("version_type", str1);
                   uElementPack1.params = oi3.e();
                   u1.C0("", p0, i1, uElementPack1, obj);
                }
             }else {
             label_0095 :
                obj = new JsonObject();
                obj.c0("suit_name", h.d(uBeautifyCon));
                b = i + 1;
                obj.a0("suit_index", Integer.valueOf(b));
                jsonArray.G(obj);
             }
          }else {
             goto label_0095 ;
          }
          i = i + 1;
       }
       jsonObject.G("show_items", jsonArray);
       uElementPack.params = jsonObject.toString();
       u1.C0("", p0, i1, uElementPack, obj);
       return;
    }
    public static void k(PrettyGuideInfo p0,boolean p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, oh, "28")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "PRODUCE_GUIDE_BUBBLE";
       JsonObject jsonObject = new JsonObject();
       jsonObject.a0("id", Integer.valueOf(p0.a()));
       jsonObject.c0("text", p0.c());
       jsonObject.a0("material_id", Long.valueOf(p0.b()));
       uElementPack.params = jsonObject.toString();
       if (p1) {
          u1.u(1, uElementPack, null);
       }else {
          u1.u0(7, uElementPack, null);
       }
       return;
    }
    public static void l(e0 p0,boolean p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, oh, "19")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "SWITCH_BEAUTY_VERSION_DIALOG";
       i3 oi3 = i3.f();
       String str = (p1)? "stay": "switch";
       oi3.d("button_content", str);
       uElementPack.params = oi3.e();
       u1.L("", p0, 1, uElementPack, null);
       return;
    }
    public static void m(long p0,e0 p1,int p2){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), p1, Integer.valueOf(p2), null, h.class, "40")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "AI_BEAUTY_LOADING";
       JsonObject jsonObject = new JsonObject();
       jsonObject.a0("time_loading_cost", Long.valueOf(p0));
       uElementPack.params = jsonObject.toString();
       h$b uob = h$b.e(p2, "AI_BEAUTY_LOADING");
       uob.k(uElementPack);
       u1.p0("", p1, uob);
       return;
    }
    public static void n(long p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), null, oh, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().A("BeautifyLogger", "onBeautifyEditFinish "+p0, objArray);
       ClientContent$FeaturesElementStayLengthPackage uFeaturesEle = new ClientContent$FeaturesElementStayLengthPackage();
       uFeaturesEle.name = "edit_beauty";
       uFeaturesEle.duration = p0;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.featuresElementStayLengthPackage = uFeaturesEle;
       h$b uob = h$b.d(7, 405);
       uob.h(uContentPack);
       u1.r0(uob);
       return;
    }
    public static void o(BeautifyConfig p0,f p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, h.class, "12")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().A("BeautifyLogger", "onBeautifyPresetSelect "+h.d(p0), objArray);
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action = 406;
       uElementPack.name = "go_back";
       uElementPack.type = 1;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       ClientContent$ProductionEditOperationPackage productionEd = new ClientContent$ProductionEditOperationPackage();
       uContentPack.productionEditOperationPackage = productionEd;
       productionEd.type = 4;
       if (p1 != null) {
          uContentPack = p1.a(uContentPack);
       }
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static void p(BeautifyConfig p0,BeautyFilterItem p1,f p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, h.class, "13")) {
          return;
       }
       h.q(p0, p1, false, p2);
       return;
    }
    public static void q(BeautifyConfig p0,BeautyFilterItem p1,boolean p2,f p3){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), p3, null, h.class, "14")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().A("BeautifyLogger", "onBeautifyItemClick "+h.d(p0)+" "+p1.getLoggerName(), objArray);
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action = 406;
       uElementPack.name = p1.getLoggerName();
       uElementPack.type = 1;
       i3 oi3 = i3.f();
       oi3.a("is_new_version", Boolean.valueOf(p2));
       g beautyPartGr = p1.getBeautyPartGroup();
       if (beautyPartGr != null) {
          oi3.d("part_name", beautyPartGr.mLoggerName);
          oi3.c("part_id", Integer.valueOf(beautyPartGr.mId));
       }
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       ClientContent$ProductionEditOperationPackage productionEd = new ClientContent$ProductionEditOperationPackage();
       uContentPack.productionEditOperationPackage = productionEd;
       productionEd.type = 4;
       productionEd.subType = h.e(p0, 1);
       p0.name = p1.getLoggerName();
       if (p3 != null) {
          uContentPack = p3.a(uContentPack);
       }
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static void r(BeautifyConfig p0,BeautifyConfig p1,BeautyFilterItem p2,e0 p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, h.class, "15")) {
          return;
       }
       float f = h.g(p1, p2);
       float f1 = h.g(p0, p2);
       Object[] objArray = new Object[0];
       a.D().A("BeautifyLogger", "onBeautifyItemSliderChanged "+h.e(p0, true)+" "+p2.getLoggerName()+" "+f1, objArray);
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "BEAUTY_SLIDER";
       JsonObject jsonObject = new JsonObject();
       g beautyPartGr = p2.getBeautyPartGroup();
       jsonObject.c0("suit_name", h.e(p0, true));
       String str = (beautyPartGr == null)? "": beautyPartGr.mLoggerName;
       jsonObject.c0("part_name", str);
       jsonObject.c0("material_name", p2.getLoggerName());
       float f2 = (!p2.getItemId())? Math.abs(f): f;
       jsonObject.a0("refer_value", Float.valueOf(f2));
       f2 = (!p2.getItemId())? Math.abs(f1): f1;
       jsonObject.a0("value", Float.valueOf(f2));
       if (!p2.getItemId()) {
          str = "ruddy";
          String str1 = (f < 0)? str: "blond";
          jsonObject.c0("bright_item_refer", str1);
          if (f1 >= 0) {
             str = "blond";
          }
          jsonObject.c0("bright_item", str);
       }
       uElementPack.params = jsonObject.toString();
       u1.M("", p3, 1, uElementPack, null, null);
       return;
    }
    public static void s(BeautifyConfig p0,boolean p1,f p2){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, null, h.class, "10")) {
          return;
       }
       h.t(p0, p1, false, p2);
       return;
    }
    public static void t(BeautifyConfig p0,boolean p1,boolean p2,f p3){
       JSONObject jSONObject;
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), p3, null, h.class, "11")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().A("BeautifyLogger", "onBeautifyPresetSelect "+h.d(p0), objArray);
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action = 406;
       uElementPack.name = h.d(p0);
       int i = 1;
       uElementPack.type = i;
       try{
          jSONObject = new JSONObject();
          jSONObject.put("is_new_version", p2);
          String str = "click_type";
          String str1 = (p1)? "edit": "check";
          jSONObject.put(str, str1);
       }catch(org.json.JSONException e10){
          Object[] objArray1 = new Object[0];
          a.D().u("BeautifyLogger", e10, objArray1);
       }
       uElementPack.params = jSONObject.toString();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       ClientContent$ProductionEditOperationPackage productionEd = new ClientContent$ProductionEditOperationPackage();
       uContentPack.productionEditOperationPackage = productionEd;
       productionEd.type = 4;
       if (p3 != null) {
          uContentPack = p3.a(uContentPack);
       }
       if (p1) {
          i = 2;
       }
       u1.u(i, uElementPack, uContentPack);
       return;
    }
    public static void u(h$a p0,ClientEvent$ElementPackage p1,e0 p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, h.class, "6")) {
          return;
       }
       int i = (p0.d != null)? 7: 8;
       int i1 = (p0.c != null)? 3: 1017;
       h$b uob = h$b.d(i, i1);
       uob.h(h.c(p0));
       if (p1 != null) {
          uob.k(p1);
       }else if(p0.c == null){
          p1 = new ClientEvent$ElementPackage();
          i3 oi3 = i3.f();
          oi3.a("is_quick_picture", Boolean.FALSE);
          p1.params = oi3.e();
          uob.k(p1);
       }
       if (p0.d == null && p0.c == null) {
          ClientEvent$ResultPackage resultPackag = PatchProxy.applyOneRefs(p0, null, h.class, "7");
          if (resultPackag != PatchProxyResult.class) {
          }else {
             resultPackag = new ClientEvent$ResultPackage();
             resultPackag.code = p0.b;
          }
          uob.q(resultPackag);
       }
       u1.p0("", p2, uob);
       return;
    }
}
