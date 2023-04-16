package iq8.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.tkruntime.v8.V8JSONProxy;
import com.tkruntime.v8.V8ObjectProxy;
import java.lang.Boolean;

public final class a	// class@00270a
{

    public void a(){
       super();
    }
    public static Object a(Object[] p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == null) {
          return null;
       }else if(p1 >= p0.length){
          return null;
       }else {
          object oobject = p0[p1];
          if (oobject instanceof V8JSONProxy) {
             oobject = oobject.getNativeObject();
          }
          return oobject;
       }
    }
    public static Object b(Object[] p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uoa, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == null) {
          return Boolean.FALSE;
       }else if(p1 >= p0.length){
          return Boolean.FALSE;
       }else {
          return p0[p1];
       }
    }
    public static Object c(Object[] p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == null) {
          return Integer.valueOf(0);
       }else if(p1 >= p0.length){
          return Integer.valueOf(0);
       }else {
          return p0[p1];
       }
    }
}
