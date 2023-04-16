package ob6.g;
import ob6.f;
import ob6.g$a;
import nsd.u;
import qb6.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;
import yk.b;
import java.nio.ByteBuffer;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import qb6.c;
import ta6.c;
import q87.c;
import yb6.d;
import java.lang.Number;
import com.kwai.framework.network.keyconfig.ApiFeature;
import qb6.a;
import java.lang.Integer;
import ssd.e;
import ssd.e$a;
import com.kwai.framework.network.keyconfig.BaseConfig;

public final class g implements f	// class@001feb
{
    public b a;
    public static final String b;
    public static final g$a c;

    static {
       g.c = new g$a(null);
       g.b = "HighPriorityConfigManager";
    }
    public void g(b p0){
       a.p(p0, "highPriorityConfig");
       super();
       this.a = p0;
    }
    public boolean b(){
       int b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, g.class, "11");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       try{
          if (this.e()) {
             g ta = this.a;
             Objects.requireNonNull(ta);
             Object obj1 = PatchProxy.apply(objArray, ta, b.class, "13");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else {
                b1 = ta.b(14);
                b1 = (b1 && ta.b.get((b1 + ta.a)))? true: false;
             }
             if (b1) {
                b = true;
             }
          }
          return b;
       }catch(java.lang.Exception e0){
          ExceptionHandler.handleCaughtException(e0);
          return b;
       }
    }
    public boolean e(){
       int i;
       Object[] objArray1;
       long l;
       Object obj1;
       long l1;
       long l2;
       Object obj2;
       long l3;
       int i1;
       int i2;
       c uoc = c.class;
       g og = g.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, og, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       c uoc1 = PatchProxy.apply(objArray, this, og, "3");
       if (uoc1 != patchProxyRe) {
       }else {
          try{
             uoc1 = this.a.g();
          }catch(java.lang.Exception e1){
             ExceptionHandler.handleCaughtException(e1);
             uoc1 = objArray;
          }
       }
    }
    public long f(ApiFeature p0){
       long l1;
       int i;
       int i1;
       int i2;
       String str1;
       long l2;
       Object obj = this;
       e$a obj1 = p0;
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "7";
       g obj2 = PatchProxy.applyOneRefs(obj1, obj, g.class, str);
       if (obj2 != patchProxyRe) {
          return obj2.longValue();
       }
       a.p(obj1, "feature");
       long l = 0;
       if (!this.e()) {
          return l;
       }
       try{
          obj2 = obj.a;
          Objects.requireNonNull(obj2);
          Object obj3 = PatchProxy.apply(null, obj2, b.class, "19");
          if (obj3 != patchProxyRe) {
             i = obj3.intValue();
          }else {
             i1 = obj2.b(22);
             i = (i1)? obj2.f(i1): 0;
          }
          i1 = 0;
          while (true) {
             if (i1 < i) {
                a uoa1 = obj.a.h(i1);
                Objects.requireNonNull(uoa1);
                Object obj4 = PatchProxy.apply(null, uoa1, uoa, "6");
                if (obj4 != patchProxyRe) {
                   i2 = obj4.intValue();
                }else {
                   i2 = uoa1.b(4);
                   i2 = (i2)? uoa1.f(i2): 0;
                }
                int i3 = 0;
                while (true) {
                   if (i3 < i2) {
                      ApiFeature mName = obj1.mName;
                      if (PatchProxy.isSupport(uoa)) {
                         str1 = PatchProxy.applyOneRefs(Integer.valueOf(i3), uoa1, uoa, "5");
                         if (str1 != patchProxyRe) {
                         }else {
                         label_008e :
                            int i6 = uoa1.b(4);
                            if (i6) {
                               int i7 = i3 * 4;
                               i6 = uoa1.d(i6) + i7;
                               str1 = uoa1.c(i6);
                            }else {
                               str1 = null;
                            }
                         }
                      }else {
                         goto label_008e ;
                      }
                      if (a.g(mName, str1)) {
                         obj1 = PatchProxy.apply(null, uoa1, uoa, str);
                         if (obj1 != patchProxyRe) {
                            l2 = obj1.longValue();
                         }else {
                            int i5 = uoa1.b(6);
                            l2 = (i5)? uoa1.b.getLong((i5 + uoa1.a)): 0;
                         }
                         obj1 = e.b;
                         Object obj5 = PatchProxy.apply(null, uoa1, uoa, "8");
                         if (obj5 != patchProxyRe) {
                            l1 = obj5.longValue();
                            break ;
                         }else {
                            int i4 = uoa1.b(8);
                            l1 = (i4)? uoa1.b.getLong((i4 + uoa1.a)): 0;
                         }
                         break ;
                      }else {
                         i3 = i3 + 1;
                         str1 = null;
                      }
                   }else {
                      i1 = i1 + 1;
                      str1 = null;
                   }
                }
                return (l2 + obj1.o((l1 + 1)));
             }else {
                l1 = l;
             }
          }
       }catch(java.lang.Exception e0){
          ExceptionHandler.handleCaughtException(e0);
          l1 = 0;
       }
       return l1;
    }
    public boolean g(){
       int b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, g.class, "10");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       try{
          if (this.e()) {
             g ta = this.a;
             Objects.requireNonNull(ta);
             Object obj1 = PatchProxy.apply(objArray, ta, b.class, "12");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else {
                b1 = ta.b(12);
                b1 = (b1 && ta.b.get((b1 + ta.a)))? true: false;
             }
             if (b1) {
                b = true;
             }
          }
          return b;
       }catch(java.lang.Exception e0){
          ExceptionHandler.handleCaughtException(e0);
          return b;
       }
    }
    public int h(){
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, g.class, "2");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       int i = 1000;
       try{
          g ta = this.a;
          Objects.requireNonNull(ta);
          Object obj1 = PatchProxy.apply(objArray, ta, b.class, "5");
          if (obj1 != patchProxyRe) {
             i1 = obj1.intValue();
          }else {
             i1 = ta.b(4);
             if (i1) {
                i = ta.b.getInt((i1 + ta.a));
             }
             i1 = i;
          }
          return i1;
       }catch(java.lang.Exception e0){
          ExceptionHandler.handleCaughtException(e0);
          return i;
       }
    }
    public String i(){
       String str = "";
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str1 = "9";
       g obj = PatchProxy.apply(objArray, this, g.class, str1);
       if (obj != patchProxyRe) {
          return obj;
       }
       try{
          if (this.e()) {
             obj = this.a;
             Objects.requireNonNull(obj);
             Object[] objArray1 = PatchProxy.apply(objArray, obj, b.class, str1);
             if (objArray1 != patchProxyRe) {
             }else {
                int i = obj.b(10);
                if (i) {
                   objArray = obj.c((i + obj.a));
                }
                objArray1 = objArray;
             }
             a.o(objArray1, "highPriorityConfig.serviceUnavailableHint\(\)");
             str = objArray1;
          }
          return str;
       }catch(java.lang.Exception e1){
          ExceptionHandler.handleCaughtException(e1);
          return str;
       }
    }
    public boolean j(){
       int b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, g.class, "5");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       try{
          if (this.e()) {
             g ta = this.a;
             Objects.requireNonNull(ta);
             Object obj1 = PatchProxy.apply(objArray, ta, b.class, "14");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else {
                b1 = ta.b(16);
                b1 = (b1 && ta.b.get((b1 + ta.a)))? true: false;
             }
             if (b1) {
                b = true;
             }
          }
          return b;
       }catch(java.lang.Exception e0){
          ExceptionHandler.handleCaughtException(e0);
          return b;
       }
    }
    public void k(BaseConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "12")) {
          return;
       }
       a.p(p0, "baseConfig");
       this.a = g.c.a(p0);
       return;
    }
    public c l(){
       Object obj = PatchProxy.apply(null, this, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return this.a.g();
       }catch(java.lang.Exception e0){
          ExceptionHandler.handleCaughtException(e0);
          return v1;
       }
    }
    public boolean m(){
       int b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, g.class, "6");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       try{
          if (this.e()) {
             g ta = this.a;
             Objects.requireNonNull(ta);
             Object obj1 = PatchProxy.apply(objArray, ta, b.class, "16");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else {
                b1 = ta.b(20);
                b1 = (b1 && ta.b.get((b1 + ta.a)))? true: false;
             }
             if (b1) {
                b = true;
             }
          }
          return b;
       }catch(java.lang.Exception e0){
          ExceptionHandler.handleCaughtException(e0);
          return b;
       }
    }
    public int n(){
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "8";
       Object obj = PatchProxy.apply(objArray, this, g.class, str);
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       int i = 0;
       try{
          if (this.e()) {
             g ta = this.a;
             Objects.requireNonNull(ta);
             Object obj1 = PatchProxy.apply(objArray, ta, b.class, str);
             if (obj1 != patchProxyRe) {
                i1 = obj1.intValue();
             }else {
                i1 = ta.b(8);
                i1 = (i1)? ta.b.getInt((i1 + ta.a)): 500;
             }
             i = i1;
          }
          return i;
       }catch(java.lang.Exception e0){
          ExceptionHandler.handleCaughtException(e0);
          return i;
       }
    }
    public boolean o(){
       int b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, g.class, "4");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       try{
          if (this.e()) {
             g ta = this.a;
             Objects.requireNonNull(ta);
             Object obj1 = PatchProxy.apply(objArray, ta, b.class, "15");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else {
                b1 = ta.b(18);
                b1 = (b1 && ta.b.get((b1 + ta.a)))? true: false;
             }
             if (b1) {
                b = true;
             }
          }
          return b;
       }catch(java.lang.Exception e0){
          ExceptionHandler.handleCaughtException(e0);
          return b;
       }
    }
}
