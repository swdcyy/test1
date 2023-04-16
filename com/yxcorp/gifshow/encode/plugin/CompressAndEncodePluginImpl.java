package com.yxcorp.gifshow.encode.plugin.CompressAndEncodePluginImpl;
import b26.a;
import com.yxcorp.gifshow.encode.plugin.CompressAndEncodePluginImpl$b;
import nsd.u;
import java.lang.Object;
import android.app.Application;
import o56.a;
import com.yxcorp.gifshow.encode.plugin.CompressAndEncodePluginImpl$a;
import android.content.Context;
import com.kwai.ksvideorendersdk.EditorSDKSoLoader$Handler;
import com.kwai.video.minecraft.model.nano.Minecraft$ResourcePathConfig;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import android.app.Activity;
import java.lang.String;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasParams$ImageCompressConfig;
import com.yxcorp.gifshow.media.model.MessageEncodeConfig;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import i0d.f;
import b26.b$a;
import java.io.File;
import qkd.b;
import qca.c;
import io.reactivex.g;
import t45.d;
import brd.z;
import qca.b;
import java.lang.Integer;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.yxcorp.gifshow.encode.plugin.CompressAndEncodePluginImpl$d;
import com.yxcorp.gifshow.encode.plugin.CompressAndEncodePluginImpl$SchoolCompressAndEncodeException;
import com.yxcorp.gifshow.encode.plugin.CompressAndEncodePluginImpl$c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.media.util.c;
import java.lang.StringBuilder;
import wkd.b;
import j80.c;
import java.io.FileOutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.OutputStream;
import java.io.IOException;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import com.yxcorp.gifshow.media.model.BaseEncodeConfig;
import java.lang.Exception;
import b26.c;
import tkd.b;
import tkd.d;
import java.lang.Runnable;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import com.yxcorp.gifshow.encode.plugin.CompressAndEncodePluginImpl$e;
import java.util.concurrent.TimeUnit;
import com.yxcorp.gifshow.encode.plugin.CompressAndEncodePluginImpl$f;
import erd.a;

public class CompressAndEncodePluginImpl implements a	// class@000d44
{
    public static final CompressAndEncodePluginImpl$b b;

    static {
       CompressAndEncodePluginImpl.b = new CompressAndEncodePluginImpl$b(null);
    }
    public void CompressAndEncodePluginImpl(){
       super();
       EditorSdk2Utils.initJni(a.b(), CompressAndEncodePluginImpl$a.a, null);
    }
    public t Q7(Activity p0,String p1,JsSelectMixMediasParams$ImageCompressConfig p2,MessageEncodeConfig p3){
       boolean b1;
       t ot;
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, CompressAndEncodePluginImpl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "activity");
       a.p(p1, "sourceFilePath");
       a.p(p2, "imageCompressConfig");
       a.p(p3, "videoEncodeConfig");
       boolean b = true;
       p2.mSupportGif = b;
       String[] obj1 = PatchProxy.applyTwoRefs(p1, p2, this, CompressAndEncodePluginImpl.class, "4");
       if (obj1 != PatchProxyResult.class) {
          b1 = obj1.booleanValue();
       }else if(p2.mSupportGif != null){
          obj1 = new String[]{"gif"};
          if (f.a(p1, obj1)) {
             b1 = false;
          }
       }
       b1 = true;
       if (!b1) {
          ot = PatchProxy.applyOneRefs(p1, this, CompressAndEncodePluginImpl.class, "5");
          if (ot != PatchProxyResult.class) {
          }else {
             ot = t.just(new b$a(new File(p1), 0x3f800000, b));
             a.o(ot, "Observable.just\(Compress¡­urceFilePath\), 1f, true\)\)");
          }
          return ot;
       }else if(b.M(p1) || b.O(p1)){
          t ot1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, CompressAndEncodePluginImpl.class, "7");
          if (ot1 != PatchProxyResult.class) {
          }else {
             ot1 = t.create(new b(p0, p1, p2)).subscribeOn(d.c).subscribeOn(d.a);
             a.o(ot1, "Observable.create<Compre¡­beOn\(KwaiSchedulers.MAIN\)");
          }
          return ot1;
       }else {
          ot = PatchProxy.applyTwoRefs(p1, p3, this, CompressAndEncodePluginImpl.class, "6");
          if (ot != PatchProxyResult.class) {
          }else {
             ot = t.create(new c(this, p1, p3)).subscribeOn(d.c).subscribeOn(d.a);
             a.o(ot, "Observable.create<Compre¡­beOn\(KwaiSchedulers.MAIN\)");
          }
          return ot;
       }
    }
    public t Qp(Activity p0,String p1,JsSelectMixMediasParams$ImageCompressConfig p2,Integer p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, CompressAndEncodePluginImpl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "activity");
       a.p(p1, "filePath");
       a.p(p2, "compressConfig");
       Ref$ObjectRef objectRef = new Ref$ObjectRef();
       objectRef.element = p3;
       if (p3 == null && (b.M(p1) || b.O(p1))) {
          objectRef.element = Integer.valueOf(0);
       }
       CompressAndEncodePluginImpl$d uod = new CompressAndEncodePluginImpl$d(this, objectRef, p1, p2, p0);
       t ot = t.create(Integer.valueOf(0)).subscribeOn(d.c).subscribeOn(d.a);
       a.o(ot, "Observable.create<JsSele¡­beOn\(KwaiSchedulers.MAIN\)");
       return ot;
    }
    public boolean isAvailable(){
       return true;
    }
    public final CompressAndEncodePluginImpl$SchoolCompressAndEncodeException m70(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CompressAndEncodePluginImpl.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new CompressAndEncodePluginImpl$SchoolCompressAndEncodeException(p0);
    }
    public final CompressAndEncodePluginImpl$c n70(String p0,int p1){
       File obj;
       CompressAndEncodePluginImpl uCompressAnd = CompressAndEncodePluginImpl.class;
       if (PatchProxy.isSupport(uCompressAnd)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uCompressAnd, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!TextUtils.x(p0)) {
          Bitmap uBitmap = c.k(new File(p0), p1);
          a.o(uBitmap, "MediaUtility.getThumbBit¡­ideoFilePath\), sizeLimit\)");
          p0 = p0.hashCode()+".jpg";
          try{
             obj = new File(b.a(-1504323719).o(), p0);
             FileOutputStream uFileOutputS = new FileOutputStream(obj);
             uBitmap.compress(Bitmap$CompressFormat.JPEG, 100, uFileOutputS);
             uFileOutputS.flush();
             uFileOutputS.close();
             uBitmap.recycle();
             return new CompressAndEncodePluginImpl$c(obj, uBitmap.getWidth(), uBitmap.getHeight());
          }catch(java.io.IOException e4){
             throw this.m70(e4.getLocalizedMessage());
          }
       }else {
          throw this.m70("File not exist");
       }
    }
    public final EditorSdk2$ExportOptions o70(MessageEncodeConfig p0){
       EditorSdk2$ExportOptions obj = PatchProxy.applyOneRefs(p0, this, CompressAndEncodePluginImpl.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = EditorSdk2Utils.createDefaultExportOptions();
          a.o(obj, "EditorSdk2Utils.createDefaultExportOptions\(\)");
          obj.setWidth(p0.k());
          obj.setHeight(p0.i());
          obj.setX264Preset(p0.m());
          obj.setX264Params(p0.l());
          obj.setVideoBitrate((long)p0.n());
          obj.setVideoGopSize(p0.o());
          obj.setAudioProfile(p0.c());
          return obj;
       }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e4){
          throw this.m70(e4.getMessage());
       }
    }
    public final c p70(){
       b obj = PatchProxy.apply(null, this, CompressAndEncodePluginImpl.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.a(0x2e6e89ac);
       a.o(obj, "PluginManager.get\(EncodePlugin::class.java\)");
       return obj;
    }
    public final void q70(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CompressAndEncodePluginImpl.class, "11")) {
          return;
       }
       d.c.d(p0);
       return;
    }
    public t rc(int p0,String p1){
       AtomicReference obj;
       CompressAndEncodePluginImpl uCompressAnd = CompressAndEncodePluginImpl.class;
       if (PatchProxy.isSupport(uCompressAnd)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uCompressAnd, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "finalFilePath");
       obj = new AtomicReference();
       t ot = t.create(new CompressAndEncodePluginImpl$e(this, p0, p1, obj)).timeout(180, TimeUnit.SECONDS).doFinally(new CompressAndEncodePluginImpl$f(this, obj));
       a.o(ot, "Observable.create<Compre¡­.get\(\)\)\n        }\n      }");
       return ot;
    }
}
