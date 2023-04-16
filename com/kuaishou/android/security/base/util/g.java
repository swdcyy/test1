package com.kuaishou.android.security.base.util.g;
import java.lang.String;
import java.lang.Object;
import okhttp3.FormBody;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import okhttp3.FormBody$Builder;
import okhttp3.Request;
import com.kuaishou.android.security.base.util.n;
import okhttp3.Request$Builder;
import okhttp3.RequestBody;
import com.middleware.security.MXSec;
import com.middleware.security.wrapper.IKSecurityBase;
import android.util.Base64;
import java.net.URLEncoder;
import com.kuaishou.android.security.bridge.main.b;
import com.kuaishou.android.security.internal.common.KSecurityContext;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.System;
import java.lang.StringBuilder;
import com.kuaishou.android.security.internal.common.h;
import android.content.Context;
import com.kuaishou.android.security.base.logsender.a;
import x38.a;
import java.lang.Throwable;
import com.kuaishou.android.security.base.log.d;
import okhttp3.OkHttpClient;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONObject;
import android.os.Bundle;
import java.util.Random;
import com.kuaishou.android.security.base.util.k;

public class g	// class@000f1e
{
    public String a;
    public String b;

    public void g(String p0){
       this.a = p0;
    }
    public void g(String p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public static FormBody a(String p0,byte[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return g.b(p0, p1).build();
    }
    public static Request a(String p0,String p1,byte[] p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Request$Builder().url(n.c(p0)).post(g.a(p1, p2)).build();
    }
    public static FormBody$Builder b(String p0,byte[] p1){
       String str = "";
       FormBody$Builder obj = PatchProxy.applyTwoRefs(p0, p1, null, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new FormBody$Builder();
       String str1 = "ztdfp";
       String str2 = "7e46b28a-8c93-4940-8238-4c60e64e3c81";
       String str3 = URLEncoder.encode(Base64.encodeToString(MXSec.get().getWrapper().atlasEncrypt(str1, str2, 0, p1), 0), "utf-8");
       String productName = b.i().h().getProductName();
       if (TextUtils.isEmpty(productName)) {
          productName = "unknow";
       }
       String str4 = String.valueOf(System.currentTimeMillis());
       FormBody$Builder uBuilder = obj.add("productName", productName).add("ts", str4).add(p0, str3).add("sign", MXSec.get().getWrapper().atlasSign(str1, str2, 0, productName+str4+"2"+str3));
       str3 = "sv";
       try{
          uBuilder.add(str3, "2");
          a uoa = a.a(b.i().j().c()).a();
          if (uoa != null) {
             str3 = uoa.b(0x11000d);
             try{
                productName = 0x11000e;
                uoa = uoa.b(productName);
             label_00bf :
                str = str3;
             }catch(java.lang.Exception e10){
             }
             d.a(e10);
             uoa = str;
             goto label_00bf ;
          }else {
             uoa = str;
          }
          obj.add("rdid", str);
          obj.add("didtag", uoa);
          return obj;
       }catch(java.lang.Exception e10){
          str3 = str;
          goto label_00bb ;
       }
    }
    public String a(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Response response = this.a().newCall(g.a(this.a, p0, p1.getBytes())).execute();
       if (response.code() != 200) {
          return "";
       }
       return response.body().string();
    }
    public String a(String p0,String p1,String p2){
       OkHttpClient obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, g.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a();
       FormBody$Builder uBuilder = new FormBody$Builder();
       String str = URLEncoder.encode(n.a(p1), "utf-8");
       p1 = new JSONArray(p1).optJSONObject(0).optString("6", "");
       if (TextUtils.isEmpty(p1)) {
          p1 = "unknow";
       }
       uBuilder.add("productName", p1).add(p0, str);
       if (!TextUtils.isEmpty(p2)) {
          uBuilder.add("ft", p2);
       }
       FormBody uFormBody = uBuilder.build();
       p1 = n.c(this.a);
       if (TextUtils.isEmpty(p1)) {
          return "";
       }else {
          Response response = obj.newCall(new Request$Builder().url(p1).post(uFormBody).build()).execute();
          if (!response.isSuccessful()) {
             return "";
          }else {
             response = response.body().string();
             d.d(p1+" "+response);
             return response;
          }
       }
    }
    public String a(String p0,String p1,String p2,Bundle p3){
       int this;
       g b;
       g og = this;
       String str = p1;
       String str1 = "7e46b28a-8c93-4940-8238-4c60e64e3c81";
       String str2 = "ztdfp";
       OkHttpClient obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, g.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a();
       FormBody$Builder uBuilder = new FormBody$Builder();
       this = 0;
       String str3 = URLEncoder.encode(Base64.encodeToString(MXSec.get().getWrapper().atlasEncrypt(str2, str1, this, p1.getBytes()), this), "utf-8");
       String productName = b.i().h().getProductName();
       if (TextUtils.isEmpty(productName)) {
          productName = "unknow";
       }
       String str4 = String.valueOf(System.currentTimeMillis());
       FormBody$Builder uBuilder1 = uBuilder.add("productName", productName).add("ts", str4);
       FormBody$Builder uBuilder2 = uBuilder1.add(p0, str3);
       FormBody$Builder uBuilder3 = uBuilder2.add("sign", MXSec.get().getWrapper().atlasSign(str2, str1, this, productName+str4+"2"+str3));
       uBuilder3.add("sv", "2");
       str3 = "ft";
       str1 = (!TextUtils.isEmpty(p2))? p2: "un";
       uBuilder.add(str3, str1);
       uBuilder.add("rdid", b.i().h().getRdid());
       uBuilder.add("didtag", b.i().h().getRdidtag());
       FormBody uFormBody = uBuilder.build();
       if (!new Random().nextInt(2)) {
          str1 = n.c(og.a);
          b = og.b;
       }else {
          str1 = n.c(og.b);
          b = og.a;
       }
       str3 = n.c(b);
       d.d("uploadContents URL "+str1);
       Response response = obj.newCall(new Request$Builder().url(str1).post(uFormBody).build()).execute();
       if (!response.isSuccessful()) {
          d.c(str1+" Failed!! "+response.code());
          if (str.contains("100102")) {
             this = 1;
          }else if(response.code() == 403){
             return "403";
          }
       }
       if (this) {
          d.d("resend for  "+str);
          response = obj.newCall(new Request$Builder().url(str3).post(uFormBody).build()).execute();
          if (!response.isSuccessful()) {
             d.c(str3+" Failed!! "+response.code());
             return "";
          }
       }
       return response.body().string();
    }
    public final OkHttpClient a(){
       Object obj = PatchProxy.apply(null, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return k.c().b();
    }
}
