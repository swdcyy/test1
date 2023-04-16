package com.kwai.video.westeros.helpers.GiftEffectDrawer;
import java.lang.Object;
import android.view.MotionEvent;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.kwai.video.westeros.models.Point2d$Builder;
import com.kwai.video.westeros.models.Point2d;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.lang.Number;
import org.wysaid.nativePort.CGENativeLibraryLoader;
import com.kwai.video.westeros.v2.faceless.FacelessSoLoader;
import com.kwai.video.westeros.helpers.WesterosSoLoader;
import com.kwai.video.westeros.v2.faceless.SoLoaderUtil;
import java.lang.System;
import java.lang.Boolean;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.helpers.GiftEffectDrawer$MagicGiftListener;
import com.kwai.video.westeros.models.EffectErrorCode;
import java.io.IOException;
import com.kwai.video.westeros.helpers.GiftEffectDrawer$MagicRequestListener;
import android.view.View;
import com.kwai.video.westeros.models.UiTouchEvent$Builder;
import com.kwai.video.westeros.models.UiTouchEvent;
import com.kwai.video.westeros.models.UiTouchEventType;
import java.lang.Iterable;
import com.google.protobuf.AbstractMessageLite;
import com.kwai.video.westeros.models.EffectResource;
import com.kuaishou.android.security.KSecurity;
import java.lang.Float;
import com.kwai.video.westeros.helpers.GiftEffectDrawer$TransPointsArg;
import com.kwai.video.westeros.models.TransFaceData$Builder;
import com.kwai.video.westeros.models.TransFaceData;
import com.kwai.video.westeros.models.TransFacePoint$Builder;
import com.kwai.video.westeros.models.TransFacePoint;

public class GiftEffectDrawer	// class@000e80
{
    public GiftEffectDrawer$MagicGiftListener magicGiftListener;
    public final long nativeDrawer;
    public GiftEffectDrawer$MagicRequestListener requestListener;
    public static final String SO_LOAD_ERROR_EVENT = "face_magic_so_load_error";
    public static final String TAG = "GiftEffectDrawer";
    public static boolean sIsInited;
    public static boolean sLoadLibraryOnSDCard;

    public void GiftEffectDrawer(int p0){
       super();
       GiftEffectDrawer.init();
       this.nativeDrawer = this.nativeCreateNativeEffectDrawer(p0);
    }
    public static void enableLibraryLoadingOnSDCard(boolean p0){
       GiftEffectDrawer.sLoadLibraryOnSDCard = p0;
    }
    public static List extractPoint(MotionEvent p0,int p1,int p2){
       ArrayList obj;
       if (PatchProxy.isSupport(GiftEffectDrawer.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, GiftEffectDrawer.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList();
       for (int i = 0; i < p0.getPointerCount(); i = i + 1) {
          float f = p0.getX(i) / (float)p1;
          float f1 = p0.getY(i) / (float)p2;
          obj.add(Point2d.newBuilder().setX(f).setY(f1).build());
       }
       return obj;
    }
    public static long generateTrackId(){
       Object obj = PatchProxy.apply(null, null, GiftEffectDrawer.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       GiftEffectDrawer.init();
       return GiftEffectDrawer.nativeGenerateTrackId();
    }
    public static void init(){
       if (PatchProxy.applyVoid(null, null, GiftEffectDrawer.class, "2")) {
          return;
       }
       if (!GiftEffectDrawer.sIsInited) {
          if (!GiftEffectDrawer.sLoadLibraryOnSDCard) {
             CGENativeLibraryLoader.load();
             FacelessSoLoader.loadNative();
             WesterosSoLoader.loadLibrary("faceless-plugin");
          }else {
             String str = "/sdcard/Android/data/com.smile.gifmaker/files/ytech_libs";
             CGENativeLibraryLoader.loadLibraryDeps();
             if (!SoLoaderUtil.loadSoFile("/data/data/com.smile.gifmaker/app_libs", str, "libCGE.so")) {
                System.loadLibrary("CGE");
             }
             CGENativeLibraryLoader.callNativeOnLoad();
             FacelessSoLoader.loadLibraryDeps();
             if (!SoLoaderUtil.loadSoFile("/data/data/com.smile.gifmaker/app_libs", str, "libgorgeous.so")) {
                WesterosSoLoader.loadLibrary("gorgeous");
             }
             if (!SoLoaderUtil.loadSoFile("/data/data/com.smile.gifmaker/app_libs", str, "libFaceMagic.so")) {
                WesterosSoLoader.loadLibrary("FaceMagic");
             }
             if (!SoLoaderUtil.loadSoFile("/data/data/com.smile.gifmaker/app_libs", str, "libfaceless-plugin.so")) {
                WesterosSoLoader.loadLibrary("faceless-plugin");
             }
          }
          GiftEffectDrawer.sIsInited = true;
       }
       return;
    }
    public static Boolean isLoadLibrary(){
       Object obj = PatchProxy.apply(null, null, GiftEffectDrawer.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Boolean.valueOf(GiftEffectDrawer.sIsInited);
    }
    public static native long nativeGenerateTrackId();
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, GiftEffectDrawer.class, "8")) {
          return;
       }
       this.nativeDestroyNativeEffectDrawer(this.nativeDrawer);
       return;
    }
    public native final long nativeCreateNativeEffectDrawer(int p0);
    public native final void nativeDestroyNativeEffectDrawer(long p0);
    public native final void nativeOnDrawWithFBO(long p0,int p1,int p2,int p3);
    public native final void nativeOnSizeChanged(long p0,int p1,int p2);
    public native final void nativeOnUIResponse(long p0,byte[] p1);
    public native final void nativeSetDebugKeyValue(long p0,String p1,String p2);
    public native final void nativeSetEffect(long p0,byte[] p1,int p2,long p3);
    public native final void nativeSetRequestJson(long p0,String p1);
    public native final void nativeSetStreamRectInRender(long p0,float p1,float p2,float p3,float p4);
    public native final void nativeSetTransFaceData(long p0,byte[] p1);
    public void onDrawWithFBO(int p0,int p1,int p2){
       if (PatchProxy.isSupport(GiftEffectDrawer.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, GiftEffectDrawer.class, "7")) {
          return;
       }
       this.nativeOnDrawWithFBO(this.nativeDrawer, p0, p1, p2);
       return;
    }
    public final void onEffectDescriptionFromNative(byte[] p0,boolean p1){
       GiftEffectDrawer giftEffectDr = GiftEffectDrawer.class;
       if (PatchProxy.isSupport(giftEffectDr) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, giftEffectDr, "20")) {
          return;
       }
       if (this.magicGiftListener != null && p0 != null) {
          try{
             EffectDescription uEffectDescr = EffectDescription.parseFrom(p0);
             if (p1) {
                this.magicGiftListener.onEffectDescriptionUpdatedOnCancel(uEffectDescr);
             }else if(uEffectDescr.getRenderCode() == EffectErrorCode.kSuccess){
                this.magicGiftListener.onEffectDescriptionUpdated(uEffectDescr);
             }else {
                this.magicGiftListener.onEffectDescriptionUpdatedOnError(uEffectDescr);
             }
          }catch(com.google.protobuf.InvalidProtocolBufferException e4){
             e4.printStackTrace();
          }
       }
    }
    public final void onLogCallback(String p0){
       PatchProxy.applyVoidOneRefs(p0, this, GiftEffectDrawer.class, "18");
    }
    public final void onReceiveRequest(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GiftEffectDrawer.class, "17")) {
          return;
       }
       GiftEffectDrawer trequestList = this.requestListener;
       if (trequestList != null) {
          trequestList.onReceiveRequest(p0);
       }
       return;
    }
    public void onSizeChanged(int p0,int p1){
       GiftEffectDrawer giftEffectDr = GiftEffectDrawer.class;
       if (PatchProxy.isSupport(giftEffectDr) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, giftEffectDr, "6")) {
          return;
       }
       this.nativeOnSizeChanged(this.nativeDrawer, p0, p1);
       return;
    }
    public boolean onTouch(View p0,MotionEvent p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, GiftEffectDrawer.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int action = p1.getAction();
       if (action) {
          if (action != 1) {
             if (action == 2) {
                this.onTouchMoved(GiftEffectDrawer.extractPoint(p1, p0.getWidth(), p0.getHeight()));
             }
          }else {
             this.onTouchEnded(GiftEffectDrawer.extractPoint(p1, p0.getWidth(), p0.getHeight()));
          }
       }else {
          this.onTouchBegan(GiftEffectDrawer.extractPoint(p1, p0.getWidth(), p0.getHeight()));
       }
       return true;
    }
    public void onTouchBegan(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GiftEffectDrawer.class, "9")) {
          return;
       }
       this.nativeOnUIResponse(this.nativeDrawer, UiTouchEvent.newBuilder().setType(UiTouchEventType.kResponseTouchBegin).addAllPoints(p0).build().toByteArray());
       return;
    }
    public void onTouchEnded(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GiftEffectDrawer.class, "11")) {
          return;
       }
       this.nativeOnUIResponse(this.nativeDrawer, UiTouchEvent.newBuilder().setType(UiTouchEventType.kResponseTouchEnd).addAllPoints(p0).build().toByteArray());
       return;
    }
    public void onTouchMoved(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GiftEffectDrawer.class, "10")) {
          return;
       }
       this.nativeOnUIResponse(this.nativeDrawer, UiTouchEvent.newBuilder().setType(UiTouchEventType.kResponseTouchMoved).addAllPoints(p0).build().toByteArray());
       return;
    }
    public void setDebugKeyValue(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GiftEffectDrawer.class, "3")) {
          return;
       }
       this.nativeSetDebugKeyValue(this.nativeDrawer, p0, p1);
       return;
    }
    public void setEffect(EffectResource p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GiftEffectDrawer.class, "4")) {
          return;
       }
       this.setEffect(p0, 0);
       return;
    }
    public void setEffect(EffectResource p0,int p1){
       GiftEffectDrawer giftEffectDr = GiftEffectDrawer.class;
       if (PatchProxy.isSupport(giftEffectDr) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, giftEffectDr, "5")) {
          return;
       }
       long kSBridgeFunc = KSecurity.getKSBridgeFuncAddr();
       GiftEffectDrawer tnativeDrawe = this.nativeDrawer;
       byte[] uobyteArray = (p0 != null)? p0.toByteArray(): 0;
       this.nativeSetEffect(tnativeDrawe, uobyteArray, p1, kSBridgeFunc);
       return;
    }
    public void setMagicGiftListener(GiftEffectDrawer$MagicGiftListener p0){
       this.magicGiftListener = p0;
    }
    public void setRequestJson(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GiftEffectDrawer.class, "19")) {
          return;
       }
       this.nativeSetRequestJson(this.nativeDrawer, p0);
       return;
    }
    public void setRequestListener(GiftEffectDrawer$MagicRequestListener p0){
       this.requestListener = p0;
    }
    public void setStreamRectInRender(float p0,float p1,float p2,float p3){
       if (PatchProxy.isSupport(GiftEffectDrawer.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3), this, GiftEffectDrawer.class, "13")) {
          return;
       }
       this.nativeSetStreamRectInRender(this.nativeDrawer, p0, p1, p2, p3);
       return;
    }
    public void setTransFaceData(boolean p0,GiftEffectDrawer$TransPointsArg[] p1){
       GiftEffectDrawer giftEffectDr = GiftEffectDrawer.class;
       if (PatchProxy.isSupport(giftEffectDr) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, giftEffectDr, "12")) {
          return;
       }
       TransFaceData$Builder uBuilder = TransFaceData.newBuilder();
       uBuilder.setIsMirror(p0);
       for (int i = 0; i < p1.length; i++) {
          uBuilder.addData(TransFacePoint.newBuilder().setIndex(p1[i].index).setX(p1[i].x).setY(p1[i].y).build());
       }
       this.nativeSetTransFaceData(this.nativeDrawer, uBuilder.build().toByteArray());
       return;
    }
}
