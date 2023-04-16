package com.yxcorp.gifshow.edit.previewer.utils.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import h80.c;
import h80.k;
import h80.m;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import java.util.ArrayList;
import wba.b;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.util.List;
import hba.a;
import eba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.edit.previewer.utils.c;
import java.util.Comparator;
import java.util.Collections;
import com.kuaishou.edit.draft.Workspace$Type;
import wba.n;
import ekd.q$b;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Number;
import com.kuaishou.edit.draft.Text;
import com.kuaishou.edit.draft.StickerResult;
import com.kuaishou.edit.draft.Sticker;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import android.util.Pair;
import java.lang.Float;
import rba.c;
import java.util.Iterator;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.StickerResult$b;
import com.kuaishou.edit.draft.FeatureId;
import com.kuaishou.edit.draft.Sticker$Type;
import com.yxcorp.gifshow.edit.previewer.utils.b;
import com.yxcorp.gifshow.edit.previewer.loaderv2.cache.BizCache;
import rba.b;
import sba.p;
import sba.n;
import sba.p$b;
import java.lang.Math;
import sba.n$b;
import lnc.s6;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import java.lang.Integer;
import com.kuaishou.edit.draft.AssetSegment;
import com.kwai.video.minecraft.model.nano.Minecraft$AssetTransform;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import com.kuaishou.edit.draft.CropOptions;
import com.kuaishou.edit.draft.Transform;
import java.util.HashMap;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import sba.h;
import java.io.File;
import qkd.b;
import sba.o;
import java.lang.Long;
import haa.f;
import java.lang.StringBuilder;
import q87.c;
import com.kuaishou.edit.draft.Sticker$ParameterCase;
import com.kuaishou.edit.draft.DynamicStickerParam;
import com.kuaishou.edit.draft.TimeRange;
import wba.z;
import wba.h0;
import java.lang.Double;
import com.kwai.video.minecraft.model.nano.Minecraft$AnimatedImageSlice;
import com.kuaishou.edit.draft.Frame;
import com.kwai.video.minecraft.model.nano.Minecraft$InputFileOptions;
import com.kwai.video.minecraft.model.nano.Minecraft$RationalV2;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import w46.b;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;

public class d	// class@001b72
{

    public void d(){
       super();
    }
    public static boolean a(){
       Object obj = PatchProxy.apply(null, null, d.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (k.a() == null) {
          return false;
       }
       return k.a().b().a();
    }
    public static EditorSdk2V2$AnimatedSubAsset[] b(EditorSdk2V2$AnimatedSubAsset[] p0,boolean p1){
       ArrayList obj;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, uod, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList();
       int len = p0.length;
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          if (!b.q(oobject.opaque()) && (!b.u(oobject.opaque()) || !p1)) {
             obj.add(oobject);
          }
          i = i + 1;
       }
       p0 = new EditorSdk2V2$AnimatedSubAsset[0];
       return obj.toArray(p0);
    }
    public static List c(c p0,String p1,boolean p2,boolean p3){
       a obj;
       if (PatchProxy.isSupport(d.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), Boolean.valueOf(p3), null, d.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = p0.W0();
       a uoa = p0.U0();
       ArrayList uArrayList = new ArrayList();
       if (!p3 && (obj != null && !q.f(obj.z()))) {
          uArrayList.addAll(obj.z());
       }
    label_0044 :
       if (!p2 && (uoa != null && !q.f(uoa.z()))) {
          uArrayList.addAll(uoa.z());
       }
    label_0059 :
       if (!q.f(uArrayList)) {
          Collections.sort(uArrayList, c.b);
          if (p0.a1() == Workspace$Type.SINGLE_PICTURE) {
             return uArrayList;
          }else {
             q.c(uArrayList, new n(p1));
          }
       }
       return uArrayList;
    }
    public static int d(GeneratedMessageLite p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 instanceof Text) {
          return p0.getResult().getZIndex();
       }
       if (p0 instanceof Sticker) {
          return p0.getResult().getZIndex();
       }
       return -1;
    }
    public static EditorSdk2V2$AnimatedSubAsset[] e(EditorSdk2V2$AnimatedSubAsset[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int len = p0.length;
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          if (oobject.displayRange() != null) {
             oobject.displayRange().setStart(0);
          }
          if (oobject.clippedRange() != null) {
             oobject.setClippedRange(EditorSdk2UtilsV2.createTimeRange(0, oobject.clippedRange().duration()));
          }
          i = i + 1;
       }
       return p0;
    }
    public static Pair f(c p0,boolean p1,boolean p2,boolean p3,float p4){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),Boolean.valueOf(p2),Boolean.valueOf(p3),Float.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, null, uod, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return d.g(null, p0, p1, p2, p3, p4);
    }
    public static Pair g(c p0,c p1,boolean p2,boolean p3,boolean p4,float p5){
       ArrayList obj1;
       Iterator iterator;
       a uoa2;
       ArrayList uArrayList1;
       EditorSdk2V2$AnimatedSubAsset uAnimatedSub;
       ArrayList uArrayList2;
       int i4;
       d uod = d.class;
       Object obj = null;
       int i = 0;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Boolean.valueOf(p3),Boolean.valueOf(p4),Float.valueOf(p5)};
          obj1 = PatchProxy.apply(objArray, obj, uod, "2");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       obj1 = new ArrayList();
       a uoa = p1.W0();
       a uoa1 = p1.U0();
       ArrayList uArrayList = new ArrayList();
       int i1 = 0x2710;
       if (uoa != null && (!q.f(uoa.z()) && !p4)) {
          iterator = uoa.z().iterator();
          while (iterator.hasNext()) {
             Text text = iterator.next();
             if (text.hasCompTextIndoModel()) {
                continue ;
             }else {
                int zIndex = text.getResult().getZIndex();
                if (zIndex < i1) {
                   StickerResult$b uob = text.getResult().toBuilder();
                   zIndex = zIndex + 10000;
                   uob.w(zIndex);
                   uob.build();
                }
                if (!("RECREATION").equals(text.getFeatureId().getExternal()) && !text.hasCompTextIndoModel()) {
                   uArrayList.add(text);
                }
             }
          }
       }
       if (uoa1 != null && (!q.f(uoa1.z()) && !p3)) {
          iterator = uoa1.z().iterator();
          while (iterator.hasNext()) {
             Sticker sticker = iterator.next();
             if (sticker != null && sticker.getStickerType() != Sticker$Type.LOCAL_DYNAMIC_IMAGE_STICKER) {
                uArrayList.add(sticker);
             }
          }
       }
       if (!q.f(uArrayList)) {
          Collections.sort(uArrayList, b.b);
          c uoc = (p0 == null)? new c(): p0;
          b uob1 = uoc.c(BizCache.TextAnimateSubAsset);
          b uob2 = uoc.c(BizCache.StickerAnimateSubAsset);
          Iterator iterator1 = uArrayList.iterator();
          int i2 = 0x2710;
          while (iterator1.hasNext()) {
             p$b obj2 = iterator1.next();
             int i3 = d.d(obj2);
             if (obj2 instanceof Text) {
                p$b uob3 = v9;
                obj2 = v9;
                uoa2 = uoa;
                p$b uob4 = obj2;
                uArrayList1 = obj1;
                uob3 = new p$b(uoc, uoa, obj2, i3, p2, p5, p1);
                uAnimatedSub = uob1.e(uob4);
                i2 = Math.max(i2, i3);
             }else {
                uArrayList1 = obj1;
                uoa2 = uoa;
                i4 = i3;
                int i5 = i2;
                if (obj2 instanceof Sticker) {
                   Object obj3 = obj2;
                   Object obj4 = obj2;
                   n$b uob5 = new n$b(uoc, uoa1, obj3, i4, p2, p5, p1);
                   uAnimatedSub = uob2.e(uoa);
                   if (s6.i()) {
                      if (!obj3.hasTagStickerParam() && !DraftUtils.F(obj4)) {
                         i = Math.max(i, i4);
                      }
                   }else if(!obj3.hasTagStickerParam()){
                      i = Math.max(i, i4);
                   }
                   i2 = i5;
                }else {
                   i2 = i5;
                   uAnimatedSub = null;
                }
             }
             if (uAnimatedSub != null) {
                uArrayList2 = uArrayList1;
                uArrayList2.add(uAnimatedSub.clone());
             }else {
                uArrayList2 = uArrayList1;
             }
             obj1 = uArrayList2;
             uoa = uoa2;
             i4 = 0;
          }
          uArrayList2 = obj1;
          i1 = i2;
       }else {
          uArrayList2 = obj1;
       }
       return new Pair(new Pair(Integer.valueOf(i), Integer.valueOf(i1)), uArrayList2);
    }
    public static List h(c p0,AssetSegment p1,boolean p2){
       if (PatchProxy.isSupport(d.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, d.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return d.i(p0, p1, false, false, p2);
    }
    public static List i(c p0,AssetSegment p1,boolean p2,boolean p3,boolean p4){
       ArrayList obj;
       a uoa2;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Boolean.valueOf(p3),Boolean.valueOf(p4)};
          obj = PatchProxy.apply(objArray, null, uod, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList();
       a uoa = p0.W0();
       a uoa1 = p0.U0();
       List list = d.c(p0, p1.getIdentifier(), p2, p3);
       if (!q.f(list)) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             Object obj1 = iterator.next();
             if (obj1 instanceof Text) {
                uoa2 = uoa;
             }else if(obj1 instanceof Sticker){
                uoa2 = uoa1;
             }else {
                uoa2 = null;
             }
             EditorSdk2V2$AnimatedSubAsset uAnimatedSub = d.n(uoa2, obj1, d.d(obj1), p4, 0x3f800000, p0);
             if (uAnimatedSub != null) {
                obj.add(uAnimatedSub);
             }
          }
       }
       return obj;
    }
    public static List j(c p0,AssetSegment p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.i(p0, p1, true, false, false);
    }
    public static List k(c p0,AssetSegment p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.i(p0, p1, false, true, false);
    }
    public static EditorSdk2V2$AnimatedSubAsset[] l(c p0,AssetSegment p1,boolean p2){
       if (PatchProxy.isSupport(d.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, d.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       List list = d.h(p0, p1, p2);
       EditorSdk2V2$AnimatedSubAsset[] uAnimatedSub = new EditorSdk2V2$AnimatedSubAsset[list.size()];
       return list.toArray(uAnimatedSub);
    }
    public static void m(AssetSegment p0,Minecraft$AssetTransform p1,Size p2,Size p3){
       double d;
       int height;
       Minecraft$AssetTransform uAssetTransf = p1;
       Size size = p3;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, d.class, "11")) {
          return;
       }
       CropOptions cropOptions = p0.getCropOptions();
       Transform transform = cropOptions.getTransform();
       d = transform.getPositionX() * 100.00f;
       double d1 = transform.getPositionY() * 100.00f;
       Size b = (!cropOptions.getWidth())? size.b: cropOptions.getWidth();
       double d2 = (double)b;
       b = (!cropOptions.getHeight())? size.c: cropOptions.getHeight();
       double d3 = d1;
       d2 = ((d2 * 0x3ff0000000000000) / (double)size.b) * 100.00f;
       double d4 = (((double)b * 0x3ff0000000000000) / (double)size.c) * 100.00f;
       double d5 = p1.positionX();
       double d6 = p1.positionY();
       if (!(cropOptions.getTransform().getRotate() % 360.00f)) {
          uAssetTransf.setPositionX((((d5 * d2) / 100.00f) + d));
          uAssetTransf.setPositionY((((d6 * d4) / 100.00f) + d3));
       }else if(!(cropOptions.getTransform().getRotate() % 360.00f) - 0x4056800000000000){
          uAssetTransf.setPositionX((((((d6 * d2) / 100.00f) + ((100.00f - d) - d2)) - 100.00f) * 0xbff0000000000000));
          uAssetTransf.setPositionY((((d5 * d4) / 100.00f) + d3));
       }else if(!(cropOptions.getTransform().getRotate() % 360.00f) - 0x4070e00000000000){
          uAssetTransf.setPositionX((((d6 * d2) / 100.00f) + d));
          uAssetTransf.setPositionY((((((d5 * d4) / 100.00f) + ((100.00f - d3) - d4)) - 100.00f) * 0xbff0000000000000));
       }else if(!(cropOptions.getTransform().getRotate() % 360.00f) - 0x4066800000000000){
          uAssetTransf.setPositionX((((((d5 * d2) / 100.00f) + ((100.00f - d) - d2)) - 100.00f) * 0xbff0000000000000));
          uAssetTransf.setPositionY((((((d6 * d4) / 100.00f) + ((100.00f - d3) - d4)) - 100.00f) * 0xbff0000000000000));
       }
       return;
    }
    public static EditorSdk2V2$AnimatedSubAsset n(c p0,GeneratedMessageLite p1,int p2,boolean p3,float p4,c p5){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Boolean.valueOf(p3),Float.valueOf(p4),p5};
          Object obj = PatchProxy.apply(objArray, null, uod, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return d.o(null, p0, p1, p2, p3, p4, p5);
    }
    public static EditorSdk2V2$AnimatedSubAsset o(c p0,c p1,GeneratedMessageLite p2,int p3,boolean p4,float p5,c p6){
       HashMap obj1;
       StickerResult result;
       File uFile;
       DynamicStickerParam obj2;
       String str1;
       boolean b;
       long l;
       double d;
       Object[] objArray2;
       float f;
       boolean b1;
       EditorSdk2V2$AnimatedSubAsset uAnimatedSub;
       File uFile2;
       long l1;
       String str6;
       object oobject = p1;
       object oobject1 = p2;
       object oobject2 = p6;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       int i = 6;
       int i1 = 5;
       int i2 = 4;
       int i3 = 2;
       int i4 = 7;
       int i5 = 3;
       Object obj = null;
       int i6 = 1;
       int i7 = 0;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[i4];
          objArray[i7] = p0;
          objArray[i6] = oobject;
          objArray[i3] = oobject1;
          objArray[i5] = Integer.valueOf(p3);
          objArray[i2] = Boolean.valueOf(p4);
          objArray[i1] = Float.valueOf(p5);
          objArray[i] = oobject2;
          obj1 = PatchProxy.apply(objArray, obj, uod, "14");
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       c uoc = (p0 == null)? new c(): p0;
       obj1 = new HashMap();
       String str = "DraftToAnimatedSubAssetUtil";
       if (oobject instanceof a && oobject1 instanceof Text) {
          result = oobject1.getResult();
          uFile = (!TextUtils.x(result.getPreviewImageFile()))? uoc.c(BizCache.EffectiveFile).g(new Pair(result.getPreviewImageFile(), oobject)): obj;
          if (uFile == null) {
             uFile = uoc.c(BizCache.EffectiveFile).g(new Pair(result.getOutputImageFile(), oobject));
             obj2 = 1;
          }else {
             obj2 = null;
          }
          str1 = "text-";
          b = obj2;
          obj2 = obj;
          l = 0;
       }else if(oobject instanceof a && oobject1 instanceof Sticker){
          object oobject3 = oobject1;
          StickerResult result1 = oobject3.getResult();
          FeatureId featureId = oobject3.getFeatureId();
          File uFile1 = obj1.get(featureId);
          if (b.S(uFile1)) {
             uFile2 = uFile1;
          }else {
             uFile2 = uoc.c(BizCache.StickerEffectiveFile).g(new Pair(result1.getPreviewImageFile(), oobject));
             i6 = (!(featureId.getExternal()).contains("-"))? 1: 0;
          }
          if (i6) {
             try{
                l1 = Long.valueOf(featureId.getExternal()).longValue();
             label_0118 :
                if (oobject3.getParameterCase() == Sticker$ParameterCase.VOTE_STICKER_PARAM) {
                   if (oobject3.getStickerType() == Sticker$Type.VOTE_STICKER_THREE) {
                   label_0136 :
                      str6 = "interact_sticker_new-";
                   }else {
                      str6 = "interact_sticker-";
                   }
                }else if(oobject3.getParameterCase() == Sticker$ParameterCase.RELAY_STICKER_PARAM){
                   goto label_0136 ;
                }else if(oobject3.getParameterCase() == Sticker$ParameterCase.TAG_STICKER_PARAM){
                   str6 = "tag_sticker-";
                }else {
                   str6 = "sticker-";
                }
                obj1.put(featureId, uFile2);
                result = result1;
                str1 = str6;
                b = false;
                obj2 = oobject3.getDynamicStickerParam();
                uFile = uFile2;
                l = l1;
             }catch(java.lang.NumberFormatException e0){
                Object[] objArray3 = new Object[i7];
                f.D().A(str, "textStickerDraftToSubAsset featureId:"+featureId, objArray3);
             }
             l1 = 0;
             goto label_0118 ;
          }else {
             goto label_0116 ;
          }
       }else {
          result = obj;
          uFile = result;
          obj2 = uFile;
          str1 = obj2;
          l = 0;
          b = false;
       }
       if (oobject != null && (oobject1 != null && (result == null || !b.S(uFile)))) {
          f uof = f.D();
          StringBuilder str2 = "textStickerDraftToSubAsset: invalid sticker file: ";
          String str3 = (uFile == null)? "null": uFile.getAbsolutePath();
          Object[] objArray1 = new Object[i7];
          uof.t(str, str2+str3, objArray1);
          if (!oobject1 instanceof Sticker || (!oobject1.hasTagStickerParam() && !DraftUtils.F(p2))) {
             i1.c(new RuntimeException("textStickerDraftToSubAsset draft load failed stickerFile:"+uFile));
          }
          return null;
       }else {
          double start = result.getRange().getStart();
          double duration = result.getRange().getDuration();
          d = (z.u(p6.a1()))? (double)z.h(result.getAssetIdentifierList(), oobject2): start;
          if (!d - 0xbff0000000000000 && p6.a1() != Workspace$Type.SINGLE_PICTURE) {
             objArray2 = new Object[i7];
             f.D().w(str, "textStickerDraftToSubAsset: no AssetSegment with stickerResult IdentifierList"+result.getAssetIdentifierList()+"in"+p6.a1()+"workspaceDraft", objArray2);
             return null;
          }else if(oobject1 instanceof Sticker && DraftUtils.Q(oobject1.getStickerType())){
             f = p5;
             b1 = true;
          }else {
             f = p5;
             b1 = false;
          }
          h0 oh0 = b.e(result, f, b1);
          if (z.u(p6.a1()) && d.a()) {
             oh0.l((- (float)z.y(p6).get((int)result.getRange().getStart()).getCropOptions().getTransform().getRotate()));
          }
          String absolutePath = uFile.getAbsolutePath();
          boolean b2 = (obj2 != null && (obj2 != DynamicStickerParam.getDefaultInstance() && obj2.getAnimatedSubAssetFileType() == 3))? true: false;
          if (b2) {
             absolutePath = new File(uFile, result.getOutputImageFile()).getAbsolutePath();
          }
          String str4 = absolutePath;
          int zIndex = result.getZIndex();
          if (p4 && !b2) {
             String str5 = b.i(str1, Integer.valueOf(p3));
             b uob = b.class;
             if (PatchProxy.isSupport(uob)) {
                objArray2 = new Object[9];
                objArray2[i7] = uoc;
                objArray2[1] = oh0;
                objArray2[2] = null;
                objArray2[3] = str4;
                objArray2[4] = Integer.valueOf(zIndex);
                objArray2[5] = Double.valueOf(d);
                objArray2[6] = Double.valueOf(duration);
                objArray2[7] = str5;
                objArray2[8] = Boolean.valueOf(b);
                uAnimatedSub = PatchProxy.apply(objArray2, null, uob, "17");
                if (uAnimatedSub != patchProxyRe) {
                }
             }
             uAnimatedSub = b.f(uoc, oh0, null, str4, zIndex, d, duration, str5, true, true, b);
          }else {
             uAnimatedSub = b.h(oh0, null, str4, zIndex, d, duration, b.i(str1, Integer.valueOf(p3)), b);
          }
          if (obj2 == null || (obj2 != DynamicStickerParam.getDefaultInstance() && !PatchProxy.applyVoidThreeRefs(obj2, uAnimatedSub, result, null, d.class, "15"))) {
             uAnimatedSub.setFileType(obj2.getAnimatedSubAssetFileType());
             Minecraft$AnimatedImageSlice[] uAnimatedIma = new Minecraft$AnimatedImageSlice[obj2.getFramesCount()];
             uAnimatedSub.setImageSlices(uAnimatedIma);
             for (; i7 < uAnimatedSub.imageSlicesSize(); i7 = i7 + 1) {
                Minecraft$AnimatedImageSlice uAnimatedIma1 = new Minecraft$AnimatedImageSlice();
                Frame frames = obj2.getFrames(i7);
                uAnimatedIma1.setX(frames.getX());
                uAnimatedIma1.setY(frames.getY());
                uAnimatedIma1.setWidth(frames.getWidth());
                uAnimatedIma1.setHeight(frames.getHeight());
                uAnimatedSub.imageSlicesSetItem(i7, uAnimatedIma1);
             }
             uAnimatedSub.setFileDecodeOptions(new Minecraft$InputFileOptions());
             uAnimatedSub.fileDecodeOptions().setFrameRate(EditorSdk2Utils.createRationalV2((int)obj2.getFrameRate(), 1));
             uAnimatedSub.setDisableRecyclePlay(obj2.getDisableRecyclePlay());
             if (uAnimatedSub.fileType() == -53244423498265342000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000.00f) {
                if (uAnimatedSub.clippedRange() == null) {
                   uAnimatedSub.setClippedRange(EditorSdk2UtilsV2.createTimeRange(result.getClippedRange().getStart(), result.getClippedRange().getDuration()));
                }
                uAnimatedSub.fileDecodeOptions().setFrameRate(EditorSdk2Utils.createRationalV2((int)(obj2.getFrameRate() * result.getClippedRange().getDuration()), (int)result.getClippedRange().getDuration()));
             }
          }
          if (l) {
             uAnimatedSub.setDataId(l);
          }
          return uAnimatedSub;
       }
    }
}
