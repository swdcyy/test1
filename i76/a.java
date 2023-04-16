package i76.a;
import o97.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.reflect.Type;
import o97.b;
import io7.c;
import i76.a$a;
import io7.a;
import java.lang.Long;
import java.lang.Number;
import com.google.gson.JsonElement;
import io7.f;
import java.lang.Integer;
import java.lang.CharSequence;
import com.kwai.sdk.switchconfig.a;

public final class a implements a	// class@0017b2
{

    public void a(){
       super();
    }
    public boolean H5(String p0,String p1,boolean p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p1, "key");
       Boolean uBoolean = this.a(p0, p1, Boolean.TYPE, Boolean.valueOf(p2));
       if (uBoolean != null) {
          p2 = uBoolean.booleanValue();
       }
       return p2;
    }
    public void I5(String p0,String p1,Type p2,Object p3,b p4){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uoa, "7")) {
             return;
          }
       }
       a.p(p1, "key");
       a.p(p2, "typeOfT");
       a.p(p4, "listener");
       c uoc = this.b(p0);
       if (uoc != null) {
          uoc.p(p1, new a$a(p4, p1, p2, p3));
       }
       return;
    }
    public void J5(String p0,String p1,Type p2,Object p3,b p4){
       if (PatchProxy.isSupport(a.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, a.class, "9")) {
             return;
          }
       }
       a.p(p1, "key");
       a.p(p2, "typeOfT");
       a.p(p4, "listener");
       return;
    }
    public long K5(String p0,String p1,long p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Long.valueOf(p2), this, a.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       a.p(p1, "key");
       Long longx = this.a(p0, p1, Long.TYPE, Long.valueOf(p2));
       if (longx != null) {
          p2 = longx.longValue();
       }
       return p2;
    }
    public JsonElement L5(String p0,String p1,JsonElement p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "key");
       c uoc = this.b(p0);
       if (uoc != null) {
          f uof = uoc.f(p1);
          if (uof != null) {
             JsonElement jsonElement = uof.c();
             if (jsonElement != null) {
                p2 = jsonElement;
             }
          }
       }
       return p2;
    }
    public boolean M5(String p0,String p1,Type p2,Object p3,b p4){
       if (PatchProxy.isSupport(a.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          p0 = PatchProxy.apply(objArray, this, a.class, "8");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       a.p(p1, "key");
       a.p(p2, "typeOfT");
       a.p(p4, "listener");
       return 0;
    }
    public int N5(String p0,String p1,int p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, a.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a.p(p1, "key");
       Integer integer = this.a(p0, p1, Integer.TYPE, Integer.valueOf(p2));
       if (integer != null) {
          p2 = integer.intValue();
       }
       return p2;
    }
    public String O5(String p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "key");
       p0 = this.a(p0, p1, String.class, p2);
       if (p0 != null) {
          p2 = p0;
       }
       return p2;
    }
    public Object a(String p0,String p1,Type p2,Object p3){
       a obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "key");
       a.p(p2, "typeOfT");
       obj = (p0 == null || !p0.length())? 1: null;
       if (obj) {
          return a.t().getValue(p1, p2, p3);
       }else {
          c uoc = a.t().u(p0);
          if (uoc != null) {
             f uof = uoc.f(p1);
             if (uof != null) {
                uof = uof.d(p2, p3);
                if (uof != null) {
                   p3 = uof;
                }
             }
          }
          return p3;
       }
    }
    public final c b(String p0){
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (p0 == null || !p0.length())? 1: null;
       a uoa = (obj)? a.t(): a.t().u(p0);
       return uoa;
    }
}
