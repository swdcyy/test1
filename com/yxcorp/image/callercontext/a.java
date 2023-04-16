package com.yxcorp.image.callercontext.a;
import e0d.h;
import e0d.d;
import com.yxcorp.image.callercontext.a$a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.image.callercontext.ImageSource;
import com.yxcorp.image.fresco.wrapper.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Thread;
import java.lang.StackTraceElement;
import java.lang.StringBuilder;
import com.yxcorp.image.common.log.Log;
import org.json.JSONObject;
import java.lang.Enum;
import org.json.JSONException;

public class a	// class@001a04
{
    public final ImageSource a;
    public String b;
    public SubSolution c;
    public String d;
    public UpBizFt e;
    public String f;
    public String g;
    public String h;
    public Object i;
    public static final String j = "a";
    public static final ArrayList k;

    static {
       ArrayList uArrayList;
       d a = h.a;
       a = (a != null)? a.I: null;
       a.k = a;
    }
    public void a(a$a p0){
       super();
       this.a = p0.c;
       this.b = p0.d;
       this.c = p0.e;
       this.d = p0.f;
       this.e = p0.g;
       this.f = p0.h;
       this.g = p0.i;
       this.h = p0.a;
       this.i = p0.b;
    }
    public static boolean c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null || (!p0.isEmpty() && (!p0.equals("dalvik.system.VMStack") && (!p0.equals("java.lang.Thread") && (p0.startsWith(ImageSource.PACKAGE_NAME) || p0.startsWith(a.f)))))) {
          return true;
       }
       ArrayList k = a.k;
       if (k != null && !k.isEmpty()) {
          Iterator iterator = k.iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             if (!str.isEmpty() && p0.startsWith(str)) {
                return true;
             }
          }
       }
       return false;
    }
    public static a$a d(){
       d a;
       a$a obj = PatchProxy.apply(null, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a$a();
       a = h.a;
       int i = 0;
       Thread thread = (a != null && a.H != null)? 1: null;
       if (thread) {
          try{
             StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
             int len = stackTrace.length;
             while (i < len) {
                object oobject = stackTrace[i];
                if (a.c(oobject.getClassName())) {
                   i = i + 1;
                }else {
                   obj.a = oobject.getClassName()+":"+oobject.getMethodName()+"\("+oobject.getLineNumber()+"\)";
                   break ;
                }
             }
          }catch(java.lang.Exception e0){
             Log.a(a.j, "get caller class name failed.");
          }
       }
    }
    public String a(){
       JSONObject obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new JSONObject();
          a tc = this.c;
          if (tc != null) {
             obj.put("sub_solution", tc.name());
          }
          tc = this.d;
          if (tc != null) {
             obj.put("bundle_id", tc);
          }
          tc = this.e;
          if (tc != null) {
             obj.put("up_biz_ft", tc.name());
          }
          if (!obj.length()) {
             return null;
          }else {
             return obj.toString();
          }
       }catch(org.json.JSONException e0){
          e0.printStackTrace();
          return null;
       }
    }
    public String b(){
       return this.h;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KwaiImageCallerContext{mImageSource="+this.a+", mBizFt=\'"+this.b+'''+", mSubSolution=\'"+this.c+'''+", mBundleId=\'"+this.d+'''+", mUpBizFt=\'"+this.e+'''+", mBizType=\'"+this.f+'''+", mPhotoId=\'"+this.g+'''+'}';
    }
}
