package com.kwai.resource.kds.a;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import android.net.Uri;
import java.lang.Boolean;
import java.lang.CharSequence;
import java.io.File;
import android.content.Context;
import android.text.TextUtils;
import java.util.Map;
import java.lang.Exception;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import android.content.res.Resources;
import com.kwai.resource.kds.KidIconResIdConfig;
import com.kwai.resource.kds.KidIconColorConfig;
import android.util.Pair;
import zyc.f;
import com.google.gson.Gson;

public class a	// class@0013d0
{
    public String a;
    public boolean b;
    public final Map c;
    public static a d;

    public void a(){
       super();
       this.a = "1";
       this.b = false;
       this.c = new ConcurrentHashMap();
    }
    public static a d(){
       a uoa = a.class;
       Object obj = PatchProxy.apply(null, null, uoa, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.d == null) {
          _monitor_enter(uoa);
          if (a.d == null) {
             a.d = new a();
          }
          _monitor_exit(uoa);
       }
       return a.d;
    }
    public final String a(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "https://s2-11289.kwimgs.com/kos/nlav11289/"+this.a+"/"+p0+p1+".png";
    }
    public final boolean b(Uri p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       String scheme = p0.getScheme();
       if (("file").equalsIgnoreCase(scheme)) {
          return new File((p0.toString()).replace("file://", "")).exists();
       }
       if (("https").equalsIgnoreCase(scheme) || ("http").equalsIgnoreCase(scheme)) {
          return true;
       }
       return b;
    }
    public String c(Context p0,String p1){
       String str;
       JsonObject jsonObject;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, uoa, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (p1 == null || "".equals(p1.trim())) {
          return "";
       }
       try{
          str = this.g(p1);
          if (!TextUtils.isEmpty(str)) {
             return str;
          }else if(PatchProxy.applyVoidOneRefs(p1, this, uoa, "12")){
             this.c.remove(p1);
          }
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       try{
          str = this.e(p0, p1);
          if (!TextUtils.isEmpty(str)) {
             this.c.put(p1, str);
             return str;
          }
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       if (this.b != null) {
          try{
             String str1 = this.f(p0, p1);
             if (!TextUtils.isEmpty(str1)) {
                this.c.put(p1, str1);
                return str1;
             }
          }catch(java.lang.Exception e6){
             e6.printStackTrace();
          }
       }
    }
    public final String e(Context p0,String p1){
       Pair pair;
       String str;
       Pair first;
       String str1;
       JsonObject obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonObject();
       int i = 0;
       if (p0.getResources() != null) {
          try{
             i = p0.getResources().getIdentifier(p1, "drawable", p0.getPackageName());
          }catch(java.lang.Exception e2){
             e2.printStackTrace();
          }
       }
    }
    public final String f(Context p0,String p1){
       PatchProxyResult patchProxyRe1;
       String str;
       CharSequence uCharSequenc;
       Object obj = this;
       String obj1 = p0;
       Object obj2 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       String obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, uoa, "6");
       if (obj3 != patchProxyRe) {
          return obj3;
       }
       obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, uoa, "7");
       int i = 1;
       int i1 = 2;
       if (obj3 != patchProxyRe) {
          patchProxyRe1 = patchProxyRe;
       }else {
          JsonObject jsonObject1 = new JsonObject();
          patchProxyRe1 = patchProxyRe;
          str = f.e(obj1, "icon", obj2, i);
          String str2 = f.e(obj1, "icon", obj2, i1);
          if (str == null || (!(str.trim()).length() || (str2 != null && (str2.trim()).length()))) {
             Uri uri1 = Uri.fromFile(new File(str));
             Uri uri2 = Uri.fromFile(new File(str2));
             if (obj.b(uri1) && obj.b(uri2)) {
                jsonObject1.c0("file", "0");
                jsonObject1.c0("light", "");
                jsonObject1.c0("dark", "");
                jsonObject1.c0("normalUrl", uri1.toString());
                jsonObject1.c0("darkUrl", uri2.toString());
                uCharSequenc = jsonObject1.toString();
             }
          }
       label_0096 :
          uCharSequenc = null;
       }
       if (!TextUtils.isEmpty(obj3)) {
          return obj3;
       }else {
          str = PatchProxy.applyTwoRefs(obj1, obj2, obj, uoa, "8");
          if (str != patchProxyRe1) {
          }else {
             JsonObject jsonObject = new JsonObject();
             String str1 = f.j(obj1, "icon", obj2, 1);
             obj1 = f.j(obj1, "icon", obj2, 2);
             if (str1 == null || (!str1.length() || (obj1 != null && obj1.length()))) {
                Uri uri = Uri.parse(obj1);
                if (obj.b(Uri.parse(str1)) && obj.b(uri)) {
                   jsonObject.c0("file", "0");
                   jsonObject.c0("light", "");
                   jsonObject.c0("dark", "");
                   jsonObject.c0("normalUrl", str1);
                   jsonObject.c0("darkUrl", obj1);
                   str = jsonObject.toString();
                }
             }
          label_00f3 :
             str = null;
          }
          if (!TextUtils.isEmpty(str)) {
             return str;
          }else {
             return null;
          }
       }
    }
    public final String g(String p0){
       JsonObject obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = this.c.get(p0);
       if (TextUtils.isEmpty(p0)) {
          return null;
       }
       obj = new Gson().h(p0, JsonObject.class);
       String str = "normalUrl";
       str = (obj.s0(str))? obj.e0(str).w(): null;
       String str1 = "darkUrl";
       String str2 = (obj.s0(str1))? obj.e0(str1).w(): null;
       if (str == null || (!(str.trim()).length() || (str2 != null && (str2.trim()).length()))) {
          Uri uri = Uri.parse(str2);
          if (this.b(Uri.parse(str)) && this.b(uri)) {
             return p0;
          }
       }
    label_007e :
       return null;
    }
}
