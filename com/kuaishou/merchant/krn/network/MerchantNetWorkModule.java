package com.kuaishou.merchant.krn.network.MerchantNetWorkModule;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.Promise;
import njd.a;
import java.lang.Object;
import java.lang.String;
import fg6.a;
import java.util.Map;
import java.lang.Class;
import com.google.gson.Gson;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.Arguments;
import java.lang.Throwable;
import brd.t;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import s04.b;
import s04.a;
import com.kuaishou.merchant.krn.network.RequestConfig;
import s04.c;
import s04.d;
import erd.g;
import crd.b;
import java.lang.Exception;

public class MerchantNetWorkModule extends KrnBridge	// class@00186a
{

    public void MerchantNetWorkModule(ReactApplicationContext p0){
       super(p0);
    }
    public static void lambda$request$0(Promise p0,a p1){
       String str = p1.a();
       WritableNativeMap writableNati = Arguments.makeNativeMap(a.a.h(str, Map.class));
       if (str != null) {
          p0.resolve(writableNati);
       }else {
          p0.reject("4", "response body is null");
       }
       return;
    }
    public static void lambda$request$1(Promise p0,Throwable p1){
       p0.reject("1", p1.getMessage());
    }
    public String getName(){
       return "MerchantNetWork";
    }
    public final t getObservable(String p0,String p1,Map p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, MerchantNetWorkModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(p1) && !TextUtils.isEmpty(p0)) {
          if (p0.equals("GET")) {
             return a.b().b(p1, p2);
          }else if(p0.equals("POST")){
             return a.b().a(p1, p2);
          }
       }
       return null;
    }
    public void request(String p0,Promise p1){
       String str = "1";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantNetWorkModule.class, str)) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          p1.reject(str, "request config can not be null");
       }
       try{
          RequestConfig requestConfi = a.a.h(p0, RequestConfig.class);
          if (requestConfi == null) {
             p1.reject("2", "request config can not be null");
             return;
          }else {
             t observable = this.getObservable(requestConfi.getMethod(), requestConfi.getUrl(), requestConfi.getParams());
             if (observable == null) {
                p1.reject("3", "request config is not support, check your request config");
                return;
             }else {
                observable.subscribe(new c(p1), new d(p1));
             }
          }
       }catch(java.lang.Exception e4){
          p1.reject("0", e4.getMessage());
       }
       return;
    }
}
