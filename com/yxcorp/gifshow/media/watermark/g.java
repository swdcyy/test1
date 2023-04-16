package com.yxcorp.gifshow.media.watermark.g;
import java.lang.Object;
import java.io.File;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.Log;
import mca.a;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import h69.d;
import java.lang.Math;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import com.kwai.video.minecraft.model.nano.Minecraft$PropertyKeyFrame;
import com.kwai.video.minecraft.model.nano.Minecraft$AssetTransform;
import com.kwai.video.editorsdk2.EditorSdk2InternalErrorException;
import java.lang.Throwable;
import com.kwai.framework.model.user.User;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import h69.e;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import qa6.a;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Double;
import java.lang.Exception;
import java.io.IOException;
import lnc.i1;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import s16.a;

public class g	// class@001d39
{

    public void g(){
       super();
    }
    public static EditorSdk2V2$VideoEditorProject a(File p0,File p1){
       EditorSdk2V2$VideoEditorProject videoEditorP;
       String[] obj = PatchProxy.applyTwoRefs(p0, p1, null, g.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && p0.exists()) {
          Log.g("WatermarkUtils", "saveVideo: has cover");
          obj = new String[]{p0.getAbsolutePath(),p1.getAbsolutePath()};
          videoEditorP = a.a(obj);
          videoEditorP.trackAssets(0).setClippedRange(EditorSdk2UtilsV2.createTimeRange(0, 0x3fe0000000000000));
       }else {
          videoEditorP = a.b(p1.getAbsolutePath());
       }
       return videoEditorP;
    }
    public static EditorSdk2V2$AnimatedSubAsset[] b(EditorSdk2V2$VideoEditorProject p0,String p1,String p2,boolean p3){
       EditorSdk2V2$VideoEditorProject obj;
       double d9;
       double d10;
       double d11;
       EditorSdk2V2$AnimatedSubAsset[] uAnimatedSub1;
       if (PatchProxy.isSupport(g.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), null, g.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = (!EditorSdk2UtilsV2.videoProjectPrivateDataLoaded(p0))? EditorSdk2UtilsV2.loadProject(p0): p0;
       int i = -223655702;
       try{
          double d = (double)d.a(i).H6(obj);
          double d1 = (double)d.a(i).Yy(obj);
          double computedDura = EditorSdk2UtilsV2.getComputedDuration(obj);
          double d2 = Math.min(d1, d) * 0x3fa47ae147ae147b;
          double d3 = Math.min(d1, d) * 0x3fa3cc1e098ead66;
          double d4 = Math.min(d1, d) * 0x3f9228afdf3b645a;
          double d5 = Math.min(d1, d) * 0x3f995e2e402bb0d0;
          double d6 = 50.00f;
          double d7 = 0x3ff0000000000000;
          int i1 = 0;
          int i2 = (p3)? d6: (d7 - ((d5 + i1) / d)) * 100.00f;
          EditorSdk2V2$AnimatedSubAsset uAnimatedSub = EditorSdk2UtilsV2.openAnimatedSubAsset(p2);
          EditorSdk2UtilsV2.getAnimatedSubAssetWidth(uAnimatedSub);
          double d8 = (double)EditorSdk2UtilsV2.getAnimatedSubAssetHeight(uAnimatedSub);
          if (p3) {
             d9 = d8;
             d10 = d2;
             d2 = 0;
             d11 = i2;
             d8 = g.d(d8, d, d1);
          }else {
             d9 = d8;
             d11 = i2;
             d10 = d2;
             d2 = 0;
             d8 = d2;
          }
          uAnimatedSub.setDisplayRange(EditorSdk2Utils.createTimeRange(d2, 5.50f));
          Minecraft$PropertyKeyFrame propertyKeyF = new Minecraft$PropertyKeyFrame();
          propertyKeyF.setDuration(0x3fd999999999999a);
          propertyKeyF.setAssetTransform(EditorSdk2Utils.createIdentityTransform());
          propertyKeyF.assetTransform().setPositionX(d11);
          Minecraft$AssetTransform uAssetTransf = propertyKeyF.assetTransform();
          d2 = (p3)? d8: (d7 - (((d9 / 2.00f) + d4) / d1)) * 100.00f;
          uAssetTransf.setPositionY(d2);
          uAssetTransf = propertyKeyF.assetTransform();
          d2 = (p3)? 0: 100.00f;
          uAssetTransf.setOpacity(d2);
          Minecraft$PropertyKeyFrame propertyKeyF1 = new Minecraft$PropertyKeyFrame();
          propertyKeyF1.setDuration(4.70f);
          propertyKeyF1.setAssetTransform(propertyKeyF.assetTransform().clone());
          propertyKeyF1.assetTransform().setOpacity(0);
          Minecraft$PropertyKeyFrame propertyKeyF2 = new Minecraft$PropertyKeyFrame();
          propertyKeyF2.setDuration(0x3fd999999999999a);
          propertyKeyF2.setAssetTransform(propertyKeyF1.assetTransform().clone());
          Minecraft$PropertyKeyFrame propertyKeyF3 = new Minecraft$PropertyKeyFrame();
          propertyKeyF3.setAssetTransform(propertyKeyF.assetTransform().clone());
          Minecraft$PropertyKeyFrame[] propertyKeyF4 = new Minecraft$PropertyKeyFrame[]{propertyKeyF,propertyKeyF1,propertyKeyF2,propertyKeyF3};
          int i3 = 1;
          uAnimatedSub.setKeyFrames(propertyKeyF4);
          if (computedDura - 0x4016010624dd2f1b < 0) {
             uAnimatedSub1 = new EditorSdk2V2$AnimatedSubAsset[i3];
             uAnimatedSub1[0] = uAnimatedSub;
             return uAnimatedSub1;
          }else {
             EditorSdk2V2$AnimatedSubAsset uAnimatedSub2 = EditorSdk2UtilsV2.openAnimatedSubAsset(p1);
             d5 = (double)EditorSdk2UtilsV2.getAnimatedSubAssetWidth(uAnimatedSub2);
             d2 = (double)EditorSdk2UtilsV2.getAnimatedSubAssetHeight(uAnimatedSub2);
             computedDura = computedDura - 5.50f;
             uAnimatedSub2 = uAnimatedSub2;
             uAnimatedSub2.setDisplayRange(EditorSdk2Utils.createTimeRange(5.50f, computedDura));
             propertyKeyF = new Minecraft$PropertyKeyFrame();
             double d12 = computedDura;
             propertyKeyF.setDuration(0x3fd999999999999a);
             propertyKeyF.setAssetTransform(EditorSdk2Utils.createIdentityTransform());
             if (p3) {
                propertyKeyF.assetTransform().setPositionX(50.00f);
                propertyKeyF.assetTransform().setPositionY(d8);
             }else {
                propertyKeyF.assetTransform().setPositionX(((((d5 / 2.00f) + d3) * 100.00f) / d));
                propertyKeyF.assetTransform().setPositionY(((((d2 / 2.00f) + d10) / d1) * 100.00f));
             }
             Minecraft$AssetTransform uAssetTransf1 = propertyKeyF.assetTransform();
             double d13 = (p3)? 0: 100.00f;
             uAssetTransf1.setOpacity(d13);
             Minecraft$PropertyKeyFrame propertyKeyF5 = new Minecraft$PropertyKeyFrame();
             propertyKeyF5.setDuration((d12 - 0x3fe999999999999a));
             propertyKeyF5.setAssetTransform(propertyKeyF.assetTransform().clone());
             propertyKeyF5.assetTransform().setOpacity(0);
             Minecraft$PropertyKeyFrame propertyKeyF6 = new Minecraft$PropertyKeyFrame();
             propertyKeyF6.setDuration(0x3fd999999999999a);
             propertyKeyF6.setAssetTransform(propertyKeyF5.assetTransform().clone());
             Minecraft$PropertyKeyFrame propertyKeyF7 = new Minecraft$PropertyKeyFrame();
             propertyKeyF7.setAssetTransform(propertyKeyF.assetTransform().clone());
             Minecraft$PropertyKeyFrame[] propertyKeyF8 = new Minecraft$PropertyKeyFrame[]{propertyKeyF,propertyKeyF5,propertyKeyF6,propertyKeyF7};
             uAnimatedSub2.setKeyFrames(propertyKeyF8);
             uAnimatedSub1 = new EditorSdk2V2$AnimatedSubAsset[]{uAnimatedSub,uAnimatedSub2};
             return uAnimatedSub1;
          }
       }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e0){
          throw new EditorSdk2InternalErrorException("Failed to parse protobuf object", e0);
       }
    }
    public static EditorSdk2$ExportOptions c(File p0,EditorSdk2V2$VideoEditorProject p1,User p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(0x1dd3f09e).g00(p0, p1, p2, null);
    }
    public static double d(double p0,double p1,double p2){
       p1 = ((p1 / p2) - 0x3fde50d79435e50d < 0)? 0x3ff199999999999a: 0x3fe8000000000000;
       return (((p2 - (p0 * p1)) / p2) * 100.00f);
    }
    public static String e(User p0){
       User mKwaiId;
       String obj = PatchProxy.applyOneRefs(p0, null, g.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return "";
       }
       obj = (a.b(p0))? QCurrentUser.ME.getKwaiId(): p0.mKwaiId;
       p0 = p0.mId;
       if (!TextUtils.x(obj)) {
          return obj;
       }else {
          return p0;
       }
    }
    public static EditorSdk2V2$AnimatedSubAsset f(String p0,double p1){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Double.valueOf(p1), null, og, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          EditorSdk2V2$AnimatedSubAsset uAnimatedSub = EditorSdk2UtilsV2.openAnimatedSubAsset(p0);
          uAnimatedSub.setDisplayRange(EditorSdk2Utils.createTimeRange(0, p1));
          uAnimatedSub.setClippedRange(EditorSdk2UtilsV2.createTimeRange(0, p1));
          uAnimatedSub.setRenderType(0);
          uAnimatedSub.setAlphaInfo(0);
          return uAnimatedSub;
       }catch(java.io.IOException e4){
          e4.printStackTrace();
       }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e4){
          e4.printStackTrace();
       }
       return v2;
    }
    public static Minecraft$PropertyKeyFrame g(double p0,double p1,double p2){
       Minecraft$PropertyKeyFrame obj;
       if (PatchProxy.isSupport(g.class)) {
          obj = PatchProxy.applyThreeRefs(Double.valueOf(p0), Double.valueOf(p1), Double.valueOf(p2), null, g.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Minecraft$PropertyKeyFrame();
       obj.setDuration(p0);
       Minecraft$AssetTransform uAssetTransf = PatchProxy.apply(null, null, g.class, "9");
       if (uAssetTransf != PatchProxyResult.class) {
       }else {
          try{
             uAssetTransf = EditorSdk2Utils.createIdentityTransform();
          }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e9){
             i1.c(e9);
             uAssetTransf = new Minecraft$AssetTransform();
             uAssetTransf.setAnchorX(50.00f);
             uAssetTransf.setAnchorY(50.00f);
             uAssetTransf.setPositionX(50.00f);
             uAssetTransf.setPositionY(50.00f);
             uAssetTransf.setScaleX(100.00f);
             uAssetTransf.setScaleY(100.00f);
             uAssetTransf.setRotate(0);
             uAssetTransf.setOpacity(0);
          }
       }
    }
    public static void h(EditorSdk2V2$VideoEditorProject p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, g.class, "4")) {
          return;
       }
       try{
          if (!EditorSdk2UtilsV2.videoProjectPrivateDataLoaded(p0)) {
             p0 = EditorSdk2UtilsV2.loadProject(p0);
          }
          double computedDura = EditorSdk2UtilsV2.getComputedDuration(p0);
          EditorSdk2V2$AnimatedSubAsset uAnimatedSub = g.f(p1, computedDura);
          if (uAnimatedSub == null) {
             return;
          }else {
             Minecraft$PropertyKeyFrame[] propertyKeyF = new Minecraft$PropertyKeyFrame[]{g.g(computedDura, 50.00f, g.d((double)EditorSdk2UtilsV2.getAnimatedSubAssetHeight(uAnimatedSub), (double)d.a(-223655702).H6(p0), (double)d.a(-223655702).Yy(p0)))};
             uAnimatedSub.setKeyFrames(propertyKeyF);
             p0.setAnimatedSubAssets(a.a(p0.animatedSubAssets().toNormalArray(), uAnimatedSub));
          }
       }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e14){
          e14.printStackTrace();
       }
       return;
    }
}
