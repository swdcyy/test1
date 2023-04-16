package ek0.d;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import ek0.b;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.c;
import kj0.l;
import com.kuaishou.krn.exception.KrnException;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;

public class d	// class@00217c
{
    public static b a;

    public void d(){
       super();
    }
    public static void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, d.class, "7")) {
          return;
       }
       d.c(p0, null);
       return;
    }
    public static void b(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, d.class, "9")) {
          return;
       }
       d.d().e(d.h(p0), p1, p2);
       return;
    }
    public static void c(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, d.class, "8")) {
          return;
       }
       d.b(null, p0, p1);
       return;
    }
    public static b d(){
       b obj = PatchProxy.apply(null, null, d.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (d.a == null) {
          d.a = c.b().g().M();
       }
       obj = d.a;
       if (obj != null) {
          return obj;
       }else {
          throw new KrnException("KrnLogcat cannot be null! KrnInitParams#createLogcat cannot return null!");
       }
    }
    public static void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, d.class, "1")) {
          return;
       }
       d.g(p0, null);
       return;
    }
    public static void f(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, d.class, "3")) {
          return;
       }
       d.d().i(d.h(p0), p1, p2);
       return;
    }
    public static void g(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, d.class, "2")) {
          return;
       }
       d.f(null, p0, p1);
       return;
    }
    public static String h(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return "ReactNative";
       }
       return "ReactNative#"+p0;
    }
    public static void i(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, d.class, "4")) {
          return;
       }
       d.k(p0, null);
       return;
    }
    public static void j(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, d.class, "6")) {
          return;
       }
       d.d().w(d.h(p0), p1, p2);
       return;
    }
    public static void k(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, d.class, "5")) {
          return;
       }
       d.j(null, p0, p1);
       return;
    }
}
