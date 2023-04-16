package a00.a;
import cx4.b;
import java.lang.Object;
import com.kuaishou.tachikoma.api.exception.TKException;
import com.kuaishou.tk.api.TKErrorDetail;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.tk.api.TKNativeErrorDetail;
import java.lang.RuntimeException;
import java.util.List;
import com.kuaishou.tachikoma.api.exception.TKJSException;
import com.kuaishou.tk.api.TKJsErrorDetail;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import tx4.w;
import rx4.q;
import java.lang.Long;
import rx4.o;
import o56.c;
import o56.a;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public class a implements b	// class@000007
{

    public void a(){
       super();
    }
    public static TKErrorDetail b(TKException p0){
       TKNativeErrorDetail obj = PatchProxy.applyOneRefs(p0, null, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new TKNativeErrorDetail();
       obj.message = p0.getMessage();
       obj.stack = p0.getStackTraceList();
       TKErrorDetail tKErrorDetai = new TKErrorDetail();
       tKErrorDetai.nativeErrorDetail = obj;
       tKErrorDetai.title = p0.getClass().getName();
       return tKErrorDetai;
    }
    public static TKErrorDetail c(TKJSException p0){
       TKJsErrorDetail obj = PatchProxy.applyOneRefs(p0, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new TKJsErrorDetail();
       obj.message = p0.getJsMessage();
       obj.stack = p0.getJsStackTrace();
       TKNativeErrorDetail tKNativeErro = new TKNativeErrorDetail();
       tKNativeErro.message = p0.getMessage();
       tKNativeErro.stack = p0.getStackTraceList();
       TKErrorDetail tKErrorDetai = new TKErrorDetail();
       tKErrorDetai.jsErrorDetail = obj;
       tKErrorDetai.nativeErrorDetail = tKNativeErro;
       tKErrorDetai.title = (!TextUtils.x(obj.message))? obj.message: p0.getClass().getName();
       return tKErrorDetai;
    }
    public static String d(Throwable p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = Log.f(p0);
       if (!TextUtils.x(str)) {
          str = ((str.trim()).replaceAll("\t", "")).replaceAll("\n", "#");
       }
       return str;
    }
    public static void e(Throwable p0,w p1,String p2){
       int i = p0;
       w ow = p1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "1")) {
          return;
       }
       try{
          if (ow) {
             q oq = new q(p2, a.d(p0), "", ow.b, ow.g, ow.h, ow.c, String.valueOf(ow.d), Long.valueOf(ow.f));
          label_005a :
             if (i instanceof TKJSException) {
                v0.errorDetail = a.c(i);
             }else if(i instanceof TKException){
                v0.errorDetail = a.b(i);
             }
             o.c(v0);
             if (a.a().c()) {
                a.f("TachikomaException4", v0.toString());
             }
          }else {
             q oq1 = new q(p2, a.d(p0), "", "", null, null, "", "", Long.valueOf(-1));
             goto label_005a ;
          }
       }catch(java.lang.Exception e0){
          ExceptionHandler.handleCaughtException(p0);
       }
       return;
    }
    public static void f(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "5")) {
          return;
       }
       if (p1.length() > 4000) {
          int i = 0;
          while (i < p1.length()) {
             int i1 = i + 4000;
             if (i1 < p1.length()) {
                Log.d(p0, p1.substring(i, i1));
             }else {
                Log.d(p0, p1.substring(i, p1.length()));
             }
             i = i1;
          }
       }else {
          Log.d(p0, p1);
       }
       return;
    }
    public void a(Throwable p0,w p1,String p2){
       int i = p0;
       w ow = p1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "2")) {
          return;
       }
       try{
          if (ow) {
             q oq = new q(p2, a.d(p0), "", ow.b, ow.g, ow.h, ow.c, String.valueOf(ow.d), Long.valueOf(ow.f));
          label_005b :
             if (i instanceof TKJSException) {
                v0.errorDetail = a.c(i);
             }else if(i instanceof TKException){
                v0.errorDetail = a.b(i);
             }
             if (i instanceof TKJSException) {
                o.a(v0);
             }else {
                o.b(v0);
             }
             if (a.a().c()) {
                a.f("TachikomaException4", v0.toString());
             }
          }else {
             q oq1 = new q(p2, a.d(p0), "", "", null, null, "", "", Long.valueOf(-1));
             goto label_005b ;
          }
       }catch(java.lang.Exception e0){
          ExceptionHandler.handleCaughtException(p0);
       }
       return;
    }
}
