package cx8.a;
import java.lang.Object;
import cx8.a$a;
import cx8.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import brd.t;
import jq.a;
import java.lang.StringBuilder;
import cx8.a$b;
import io.reactivex.g;

public final class a	// class@00200b
{
    public static int a;
    public static a$a b;
    public static final a c;

    static {
       a.c = new a();
    }
    public void a(){
       super();
    }
    public static final a$a a(a p0){
       return a.b;
    }
    public static final e b(){
       Object obj = PatchProxy.apply(null, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a(0x9d422b2);
       a.o(obj, "Singleton.get\(LocationAPIService::class.java\)");
       return obj;
    }
    public static final int c(){
       return a.a;
    }
    public static final t d(String p0,String p1,String p2,Integer p3,String p4){
       Object[] obj;
       a uoa = a.class;
       int i = 0;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          obj = PatchProxy.apply(objArray, null, uoa, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Object[i];
       a.c("LocationAPI", "locationRecommend\(\) ", obj);
       return a.b().a(p0, p1, p2, null, p3, p4);
    }
    public static final t e(String p0,String p1,String p2,Integer p3,String p4,String p5){
       a uoa = a.class;
       t ot = null;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          Object obj = PatchProxy.apply(objArray, ot, uoa, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray1 = new Object[0];
       a.c("LocationAPI", "locationRecommendNew\(\) called with: cursor = "+p0+','+" mediaLocation = "+p1+",  taskId = "+p2+", "+"gpsFlag = "+p3+", extParams = "+p4, objArray1);
       a$a b = a.b;
       if (b != null) {
          ot = b.d("", p0);
       }
       if (ot != null) {
          return ot;
       }else {
          a$a b1 = a.b;
          if (b1 != null) {
             b1.c();
          }
          a.b = new a$a("");
          t ot1 = t.create(new a$b(p1, p2, p5));
          a.o(ot1, "Observable.create { emit¡­stContext!!\n      \)\n    }");
          return ot1;
       }
    }
    public static final void f(int p0){
       a.a = p0;
    }
}
