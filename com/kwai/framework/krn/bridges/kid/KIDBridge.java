package com.kwai.framework.krn.bridges.kid.KIDBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.concurrent.ConcurrentHashMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.Promise;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kx6.a;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import yf.j;
import java.lang.Integer;
import java.lang.Throwable;
import ek0.d;
import android.view.View$OnClickListener;
import android.app.Activity;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import java.util.ArrayList;
import com.facebook.react.bridge.ReadableMap;
import kx7.c;
import kx7.b;
import kx7.d;
import com.yxcorp.utility.n;
import android.graphics.Rect;
import tkd.b;
import tkd.d;
import ix7.c0;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.List;
import android.view.View;
import org.json.JSONObject;
import com.kwai.framework.krn.bridges.kid.WidgetTokenTypeEnum;
import f27.a;
import lnc.a1;
import java.util.Objects;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Exception;
import sl7.b;
import com.kwai.robust.PatchProxyResult;
import android.util.Pair;
import org.json.JSONException;
import kx6.b;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import com.facebook.react.bridge.WritableMap;
import com.kwai.resource.kds.a;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Arguments;
import com.kwai.framework.krn.bridges.kid.KIDBridge$a;
import java.lang.reflect.Type;
import el.a;
import com.kwai.framework.krn.bridges.kid.KIDBridge$b;
import com.google.gson.Gson;
import java.util.HashMap;
import com.facebook.react.bridge.WritableNativeMap;
import h86.b;
import java.lang.Runnable;
import com.facebook.react.bridge.UiThreadUtil;
import com.kwai.library.widget.emptyview.KwaiEmptyStateInit;
import h86.a;

public class KIDBridge extends KrnBridge	// class@0015b4
{
    public final ConcurrentHashMap mStyleConfigMap;
    public static boolean sCustomFontAdded;

    public void KIDBridge(ReactApplicationContext p0){
       super(p0);
       this.mStyleConfigMap = new ConcurrentHashMap();
    }
    public static void a(KIDBridge p0,ReadableArray p1,Promise p2){
       p0.lambda$showMediaBrowserWithMedias$1(p1, p2);
    }
    public static void addKidCustomFont(Context p0){
       a uoa;
       if (PatchProxy.applyVoidOneRefs(p0, null, KIDBridge.class, "2")) {
          return;
       }
       if (a.b == null) {
          uoa = a.class;
          _monitor_enter(uoa);
          if (a.b == null) {
             a.b = new a();
          }
          _monitor_exit(uoa);
       }
       uoa = a.b.a;
       if (uoa == null) {
          return;
       }else {
          Iterator iterator = uoa.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             j.c().a(p0, key, uEntry.getValue().intValue());
          }
          KIDBridge.sCustomFontAdded = true;
          return;
       }
    }
    public static void b(KIDBridge p0,View$OnClickListener p1){
       p0.lambda$showNetworkSolutionAlert$0(p1);
    }
    private void lambda$showMediaBrowserWithMedias$1(ReadableArray p0,Promise p1){
       Activity currentActiv = this.getCurrentActivity();
       if (currentActiv == null || p0 == null) {
          p1.reject("1", "activity == null || params == null");
          return;
       }else {
          ArrayList uArrayList = new ArrayList();
          int i = 0;
          b uob = 2;
          while (i < p0.size()) {
             ReadableMap map = p0.getMap(i);
             if (map != null) {
                c uoc = new c();
                String str = map.getString("url");
                uoc.d(map.getInt("type"));
                c b = uoc.b;
                if (b == 1) {
                   uob = new b();
                   uob.b(str);
                   uoc.a = uob;
                }else if(b == uob){
                   d uod = new d();
                   uod.d(str);
                   uoc.a = uod;
                }
                uArrayList.add(uoc);
             }
             i = i + 1;
          }
          d.a(0x5ca58684).va(currentActiv, new Rect((n.k(currentActiv) / uob), (n.j(currentActiv) / uob), (n.k(currentActiv) / uob), (n.j(currentActiv) / uob)), uArrayList);
          p1.resolve("1");
          return;
       }
    }
    private void lambda$showNetworkSolutionAlert$0(View$OnClickListener p0){
       Activity currentActiv = this.getCurrentActivity();
       if (currentActiv == null) {
          return;
       }
       p0.onClick(new View(currentActiv));
       return;
    }
    public final void convertStyleToken2Value(JSONObject p0){
       b uob;
       if (PatchProxy.applyVoidOneRefs(p0, this, KIDBridge.class, "10")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       String str = "KIDType";
       if (p0.has(str)) {
          String str1 = "KIDToken";
          if (p0.has(str1)) {
             str = p0.optString(str);
             str1 = p0.optString(str1);
             if ((WidgetTokenTypeEnum.Type_widget.getValue()).equals(str)) {
                a uoa = a.a();
                Objects.requireNonNull(uoa);
                JSONObject jSONObject = new JSONObject();
                str = uoa.b(a1.c(), str1);
                if (!TextUtils.isEmpty(str)) {
                   try{
                      JSONObject jSONObject1 = new JSONObject(str).optJSONObject("widgetStyleData");
                      if (jSONObject1 != null && jSONObject1.optJSONObject("styleConfig") != null) {
                         jSONObject = jSONObject1.optJSONObject("styleConfig");
                      }
                   }catch(java.lang.Exception e0){
                      e0.printStackTrace();
                   }
                }
             }else if((WidgetTokenTypeEnum.Type_color.getValue()).equals(str)){
                uob = b.b();
                Objects.requireNonNull(uob);
                Pair pair = PatchProxy.applyOneRefs(str1, uob, b.class, "3");
                if (pair != PatchProxyResult.class) {
                }else {
                   pair = new Pair("", "");
                   str = uob.a(str1);
                   if (!TextUtils.isEmpty(str)) {
                      if (str.startsWith("#")) {
                         pair = new Pair(str, str);
                      }else {
                         try{
                            JSONObject jSONObject2 = new JSONObject(str);
                            str = jSONObject2.optString("dark");
                            pair = new Pair(jSONObject2.optString("light"), str);
                         }catch(org.json.JSONException e0){
                            e0.printStackTrace();
                         }
                      }
                   }
                }
             }else if((WidgetTokenTypeEnum.Type_font.getValue()).equals(str)){
                uob = b.a();
                Objects.requireNonNull(uob);
                JSONObject jSONObject3 = new JSONObject();
                if (!TextUtils.isEmpty(str1)) {
                   str = uob.b.optString(str1);
                   try{
                      jSONObject3 = new JSONObject(str);
                   }catch(org.json.JSONException e0){
                      e0.printStackTrace();
                   }
                }
             }
          }else {
          label_0124 :
             Iterator iterator = p0.keys();
             while (iterator.hasNext()) {
                Object obj = p0.opt(iterator.next());
                if (obj instanceof JSONObject) {
                   this.convertStyleToken2Value(obj);
                }
             }
          }
       }else {
          goto label_0124 ;
       }
       return;
    }
    public String getColorConfig(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KIDBridge.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.b().a(p0);
    }
    public String getComponentStyleConfig(String p0){
       String obj = PatchProxy.applyOneRefs(p0, this, KIDBridge.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = "";
       if (TextUtils.x(p0)) {
          d.a("getComponentStyleConfig error。参数key为空："+p0);
          return str;
       }else if(this.mStyleConfigMap.contains(p0) && !TextUtils.x(this.mStyleConfigMap.get(p0))){
          return this.mStyleConfigMap.get(p0);
       }else {
          obj = a.a().b(this.getReactApplicationContext(), p0);
          if (TextUtils.x(obj)) {
             d.a("getComponentStyleConfig error。返回值为空："+obj);
             return str;
          }else {
             JSONObject jSONObject = new JSONObject(obj);
             this.convertStyleToken2Value(jSONObject);
             obj = jSONObject.toString();
             this.mStyleConfigMap.put(p0, obj);
             return obj;
          }
       }
    }
    public WritableMap getFontConfigs(){
       Object obj = PatchProxy.apply(null, this, KIDBridge.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.parseFonts(b.a().b.toString());
    }
    public String getIconColorConfig(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KIDBridge.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.d().c(this.getReactApplicationContext(), p0);
    }
    public String getName(){
       return "KIDBridge";
    }
    public void initialize(){
       if (PatchProxy.applyVoid(null, this, KIDBridge.class, "1")) {
          return;
       }
       super.initialize();
       if (!KIDBridge.sCustomFontAdded) {
          KIDBridge.addKidCustomFont(this.getReactApplicationContext());
       }
       return;
    }
    public final WritableMap parseFonts(String p0){
       WritableMap obj = PatchProxy.applyOneRefs(p0, this, KIDBridge.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Arguments.createMap();
       Type type = new KIDBridge$a(this).getType();
       Iterator iterator = this.mGson.i(p0, new KIDBridge$b(this).getType()).entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          obj.putMap(uEntry.getKey(), Arguments.makeNativeMap(this.mGson.i(uEntry.getValue(), type)));
       }
       return obj;
    }
    public void showMediaBrowserWithMedias(ReadableArray p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KIDBridge.class, "9")) {
          return;
       }
       UiThreadUtil.runOnUiThread(new b(this, p0, p1));
       return;
    }
    public void showNetworkSolutionAlert(){
       if (PatchProxy.applyVoid(null, this, KIDBridge.class, "8")) {
          return;
       }
       View$OnClickListener networkResol = KwaiEmptyStateInit.INSTANCE.getNetworkResolveClickListener();
       if (networkResol == null) {
          return;
       }
       UiThreadUtil.runOnUiThread(new a(this, networkResol));
       return;
    }
}
