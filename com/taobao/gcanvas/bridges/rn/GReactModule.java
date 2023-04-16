package com.taobao.gcanvas.bridges.rn.GReactModule;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import com.taobao.gcanvas.bridges.rn.GReactModule$HostLifeState;
import java.lang.Object;
import com.taobao.gcanvas.bridges.rn.GReactModule$c;
import uq8.a;
import vc.h;
import pb.b;
import yq8.a;
import com.facebook.react.bridge.ReactContext;
import java.lang.String;
import com.taobao.gcanvas.bridges.rn.GReactModule$b;
import java.util.ArrayList;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.Callback;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.taobao.gcanvas.bridges.rn.GReactTextureView;
import com.taobao.gcanvas.bridges.rn.GReactModule$a;
import com.taobao.gcanvas.surface.GTextureView;
import java.util.Objects;
import android.graphics.Bitmap;
import com.taobao.gcanvas.GCanvasJNI;
import xq8.b;
import wq8.b;
import xq8.c;
import yq8.a$a;
import android.content.Context;
import tq8.a$a;
import tq8.a;
import yq8.a$c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Throwable;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Boolean;
import org.json.JSONObject;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import org.json.JSONArray;
import com.taobao.gcanvas.bridges.rn.GReactModule$d;
import com.taobao.gcanvas.surface.GTextureViewCallback;
import com.taobao.gcanvas.bridges.rn.GReactModule$e;
import android.app.Activity;
import android.view.WindowManager;
import android.view.Display;
import android.graphics.Point;
import android.util.DisplayMetrics;
import com.taobao.gcanvas.bridges.spec.module.IGBridgeModule$ContextType;
import yq8.b;
import android.graphics.Bitmap$Config;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import java.util.Arrays;
import android.util.Base64;
import java.lang.StringBuilder;
import android.view.TextureView;
import android.graphics.Bitmap$CompressFormat;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public class GReactModule extends ReactContextBaseJavaModule implements LifecycleEventListener	// class@000df9
{
    public HashMap mCacheCmdList;
    public GReactModule$c mImpl;
    public AtomicReference mLifeRef;
    public HashMap mViews;
    public static final String TAG = "GReactModule";

    public void GReactModule(ReactApplicationContext p0){
       super(p0);
       this.mViews = new HashMap();
       this.mCacheCmdList = new HashMap();
       this.mLifeRef = new AtomicReference(GReactModule$HostLifeState.Idle);
       GReactModule$c uoc = new GReactModule$c(this);
       this.mImpl = uoc;
       uoc.c = new a(null, null);
       this.getReactApplicationContext().addLifecycleEventListener(this);
    }
    public final void addCacheCommand(String p0,GReactModule$b p1){
       ArrayList uArrayList = this.mCacheCmdList.get(p0);
       if (uArrayList == null) {
          uArrayList = new ArrayList();
          this.mCacheCmdList.put(p0, uArrayList);
       }
       uArrayList.add(p1);
       return;
    }
    public void bindImageTexture(ReadableArray p0,String p1,Callback p2){
       if (p0 == null || (!TextUtils.isEmpty(p1) && p0.size() == 2)) {
          GReactTextureView gReactTextur = this.mViews.get(p1);
          if (gReactTextur == null) {
             this.addCacheCommand(p1, new GReactModule$a(this, p0, p1, p2));
             return;
          }else {
             p1 = p0.getString(0);
             int intx = p0.getInt(1);
             GReactModule tmImpl = this.mImpl;
             String canvasKey = gReactTextur.getCanvasKey();
             Objects.requireNonNull(tmImpl);
             if (!TextUtils.isEmpty(p1)) {
                try{
                   if (p1.startsWith("data:image")) {
                      Bitmap uBitmap = tmImpl.m(p1.substring((p1.indexOf("base64,") + 7)));
                      if (uBitmap != null) {
                         GCanvasJNI.bindTexture(canvasKey, uBitmap, intx, 3553, 0, 6408, 6408, 5121);
                      }
                   }else {
                      c uoc = tmImpl.l().b();
                      a$a uoa = new a$a(tmImpl, canvasKey, intx, p2, uoc, p1);
                      tmImpl.c.a(tmImpl.k(), p1, v9);
                      a$c a = v9.a;
                      _monitor_enter(a);
                      while (!v9.b.get()) {
                         v9.a.wait();
                      }
                      _monitor_exit(a);
                      tmImpl.n(p2, uoc);
                   }
                }catch(java.lang.InterruptedException e0){
                }
             }
          }
       }
    }
    public void disable(String p0){
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       if (this.mViews.get(p0) == null) {
          return;
       }
       GReactTextureView gReactTextur = this.mImpl.f.mViews.get(p0);
       if (gReactTextur != null) {
          gReactTextur.onHostDestroy();
       }
       return;
    }
    public String enable(ReadableMap p0){
       if (p0 == null) {
          return Boolean.FALSE.toString();
       }
       if (!p0.hasKey("componentId")) {
          return Boolean.FALSE.toString();
       }
       if (this.mViews.containsKey(p0.getString("componentId"))) {
          return Boolean.TRUE.toString();
       }
       try{
          JSONObject jSONObject = new JSONObject();
          jSONObject.putOpt("componentId", p0.getString("componentId"));
          return this.mImpl.d(jSONObject);
       }catch(org.json.JSONException e0){
          return Boolean.FALSE.toString();
       }
    }
    public WritableMap extendCallNative(ReadableMap p0){
       WritableMap writableMap = Arguments.createMap();
       writableMap.putString("result", this.mImpl.g(p0.getString("contextId"), p0.getString("args"), p0.getInt("type")));
       return writableMap;
    }
    public void getDeviceInfo(String p0,Callback p1){
       if (!TextUtils.isEmpty(p0)) {
          HashMap hashMap = new HashMap();
          try{
             JSONObject jSONObject = new JSONObject();
             jSONObject.put("platform", "Android");
             hashMap.put("data", e0.toString());
             Object[] objArray = new Object[]{hashMap};
             p1.invoke(objArray);
          }catch(org.json.JSONException e0){
          }
       }
    }
    public String getName(){
       return "GCanvasModule";
    }
    public void onHostDestroy(){
       this.mLifeRef.set(GReactModule$HostLifeState.Destroyed);
       this.getReactApplicationContext().removeLifecycleEventListener(this);
       Iterator iterator = this.mViews.entrySet().iterator();
       while (iterator.hasNext()) {
          iterator.next().getValue().onHostDestroy();
       }
       this.mViews.clear();
       this.mCacheCmdList.clear();
       return;
    }
    public void onHostPause(){
       this.mLifeRef.set(GReactModule$HostLifeState.Paused);
    }
    public void onHostResume(){
       this.mLifeRef.set(GReactModule$HostLifeState.Running);
    }
    public void preLoadImage(ReadableArray p0,Callback p1){
       if (p0 != null && p0.size() == 2) {
          JSONArray jSONArray = new JSONArray();
          jSONArray.put(p0.getString(0));
          jSONArray.put(p0.getInt(1));
          this.mImpl.i(jSONArray, p1);
       }
    label_003c :
       return;
    }
    public void render(String p0,String p1,int p2){
       if (!TextUtils.isEmpty(p0) && !TextUtils.isEmpty(p1)) {
          if (this.mViews.get(p0) == null) {
             this.addCacheCommand(p0, new GReactModule$d(this, p0, p1, p2));
             return;
          }else {
             GReactTextureView gReactTextur = this.mImpl.f.mViews.get(p0);
             if (gReactTextur != null) {
                GCanvasJNI.render(gReactTextur.getCanvasKey(), p1, p2);
             }
          }
       }
       return;
    }
    public void resetGlViewport(String p0){
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       if (this.mViews.get(p0) == null) {
          return;
       }
       GReactTextureView gReactTextur = this.mImpl.f.mViews.get(p0);
       if (gReactTextur != null) {
          gReactTextur.b.a();
       }
       return;
    }
    public void setAlpha(String p0,float p1){
    }
    public void setContextType(int p0,String p1){
       if (TextUtils.isEmpty(p1)) {
          return;
       }
       if (this.mViews.get(p1) == null) {
          this.addCacheCommand(p1, new GReactModule$e(this, p1, p0));
          return;
       }else {
          Activity currentActiv = this.getCurrentActivity();
          if (currentActiv == null) {
             return;
          }
          Display defaultDispl = currentActiv.getWindowManager().getDefaultDisplay();
          Point point = new Point();
          defaultDispl.getSize(point);
          DisplayMetrics uDisplayMetr = new DisplayMetrics();
          defaultDispl.getMetrics(uDisplayMetr);
          point.toString();
          this.mImpl.e(p1, (double)uDisplayMetr.density);
          object oobject = IGBridgeModule$ContextType.values()[p0];
          GReactTextureView gReactTextur = this.mImpl.f.mViews.get(p1);
          if (gReactTextur != null) {
             GCanvasJNI.setContextType(gReactTextur.getCanvasKey(), oobject.value());
          }
          return;
       }
    }
    public void setDevicePixelRatio(String p0,double p1){
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       if (this.mViews.get(p0) == null) {
          return;
       }
       this.mImpl.e(p0, p1);
       return;
    }
    public void setLogLevel(int p0){
       String str;
       Objects.requireNonNull(this.mImpl);
       if (p0) {
          try{
             if (p0 != 1) {
                if (p0 != 2) {
                   if (p0 != 3) {
                   label_001a :
                      str = "debug";
                   }else {
                      str = "error";
                   }
                }else {
                   str = "warn";
                }
             }else {
                str = "info";
             }
          }catch(java.lang.NumberFormatException e0){
          }
       }else {
          goto label_001a ;
       }
    }
    public void texImage2D(String p0,int p1,int p2,int p3,int p4,int p5,String p6){
       b uob = this.mImpl.c(p6);
       if (uob == null) {
          return;
       }
       uob = uob.a;
       p4 = uob.getWidth();
       int height = uob.getHeight();
       Bitmap$Config config = uob.getConfig();
       if (p4 > 0 && (height <= 0 || (config != Bitmap$Config.RGB_565 && (config != Bitmap$Config.ARGB_8888 && config != Bitmap$Config.ARGB_4444)))) {
          Objects.toString(config);
          return;
       }else {
          int i = 6408;
          int i1 = 6407;
          if (config == Bitmap$Config.RGB_565) {
             i = 6407;
          }else if(config == Bitmap$Config.ARGB_8888 || config == Bitmap$Config.ARGB_4444){
             i1 = 6408;
          }else {
             Objects.toString(config);
             return;
          }
          ByteBuffer uByteBuffer = ByteBuffer.allocate(uob.getAllocationByteCount());
          uob.copyPixelsToBuffer(uByteBuffer);
          byte[] uobyteArray = uByteBuffer.array();
          for (int i2 = 0; i2 < uobyteArray.length; i2 = i2 + 1) {
             int i3 = uobyteArray[i2] & 0x00ff;
             uobyteArray[i2] = (byte)i3;
          }
          this.mImpl.g(p0, "102,9,"+p1+","+p2+","+i+","+p4+","+height+","+0+","+i1+","+p5+","+1+","+Base64.encodeToString(((((Arrays.toString(uobyteArray)).replace("[", "")).replace("]", "")).replace(" ", "")).getBytes(), 2), 0x60000000);
          return;
       }
    }
    public void texSubImage2D(String p0,int p1,int p2,int p3,int p4,int p5,int p6,String p7){
       b uob = this.mImpl.c(p7);
       if (uob == null) {
          return;
       }
       uob = uob.a;
       int width = uob.getWidth();
       int height = uob.getHeight();
       Bitmap$Config config = uob.getConfig();
       if (width > 0 && (height <= 0 || (config != Bitmap$Config.RGB_565 && config != Bitmap$Config.ARGB_8888))) {
          Objects.toString(config);
          return;
       }else {
          ByteBuffer uByteBuffer = ByteBuffer.allocate(uob.getAllocationByteCount());
          uob.copyPixelsToBuffer(uByteBuffer);
          byte[] uobyteArray = uByteBuffer.array();
          for (int i = 0; i < uobyteArray.length; i = i + 1) {
             int i1 = uobyteArray[i] & 0x00ff;
             uobyteArray[i] = (byte)i1;
          }
          this.mImpl.g(p0, "105,9,"+p1+","+p2+","+p3+','+p4+","+width+","+height+","+p5+","+p6+","+1+","+Base64.encodeToString(((((Arrays.toString(uobyteArray)).replace("[", "")).replace("]", "")).replace(" ", "")).getBytes(), 2), 0x60000000);
          return;
       }
    }
    public String toDataURL(String p0,String p1,float p2){
       String str = "";
       if (TextUtils.isEmpty(p0)) {
          return str;
       }
       GReactTextureView gReactTextur = this.mViews.get(p0);
       if (gReactTextur == null) {
          return str;
       }
       Bitmap bitmap = gReactTextur.getBitmap();
       Bitmap$CompressFormat pNG = Bitmap$CompressFormat.PNG;
       if (p1.equals("image/jpeg")) {
          pNG = Bitmap$CompressFormat.JPEG;
          p1 = "data:image/jpeg;base64,";
       }else {
          p1 = "data:image/png;base64,";
       }
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       bitmap.compress(pNG, (int)(p2 * 100.00f), uByteArrayOu);
       return p1+Base64.encodeToString(uByteArrayOu.toByteArray(), 2);
    }
}
