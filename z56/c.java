package z56.c;
import gb6.c;
import gb6.a;
import gb6.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gb6.d;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kwai.framework.network.diffinfo.DiffInfoSwitch;
import java.lang.Long;
import java.lang.Number;
import com.google.gson.JsonObject;
import com.yxcorp.utility.Log;
import java.lang.System;
import java.lang.StringBuilder;
import java.lang.RuntimeException;

public abstract class c extends c	// class@004584
{

    public void c(){
       super();
    }
    public a a(){
       b b;
       long l1;
       b uob = b.class;
       Object obj = PatchProxy.apply(null, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b = b.b;
       d uod = this.j();
       String str = "";
       Objects.requireNonNull(b);
       String str1 = PatchProxy.applyTwoRefs(uod, str, b, uob, "1");
       if (str1 != PatchProxyResult.class) {
       }else {
          a.p(uod, "store");
          a.p(str, "def");
          if (DiffInfoSwitch.c.b()) {
             str = uod.b(str);
          }
          str1 = str;
       }
       uod = this.j();
       long l = 0;
       Objects.requireNonNull(b);
       if (PatchProxy.isSupport(uob)) {
          Object obj1 = PatchProxy.applyTwoRefs(uod, Long.valueOf(l), b, uob, "3");
          if (obj1 != PatchProxyResult.class) {
             l1 = obj1.longValue();
          label_0073 :
             return new a(str1, l1);
          }
       }
       a.p(uod, "store");
       if (DiffInfoSwitch.c.b()) {
          l = uod.g(l);
       }
       l1 = l;
       goto label_0073 ;
    }
    public Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          p0 = obj;
       }else {
          a.p(p0, "data");
          if (!DiffInfoSwitch.c.b()) {
             Log.g(this.c(), "DiffInfoSwitch.isOpen=false");
          }else {
             p0 = super.apply(p0);
             Log.b(this.c(), "apply spent "+(System.currentTimeMillis() - System.currentTimeMillis())+" ms");
          }
       }
       return p0;
    }
    public JsonObject b(){
       Object obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j().a();
    }
    public JsonObject e(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          p0 = obj;
       }else {
          a.p(p0, "input");
       }
       return p0;
    }
    public boolean f(){
       return true;
    }
    public Object g(Object p0,JsonObject p1){
       c uoc = c.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, uoc, "4");
       if (obj != PatchProxyResult.class) {
          p1 = obj;
       }else {
          a.p(p0, "input");
          if (p1 != null) {
             if (!PatchProxy.applyVoidOneRefs(p1, this, uoc, "6")) {
                a.p(p1, "result");
                p0 = b.b;
                JsonObject jsonObject = p0.b(p1);
                long l = p0.c(p1, 0);
                p0 = this.j();
                if (p0.f(p1) && (!p0.e(jsonObject) || !p0.c(l))) {
                   this.i();
                }
             }
          }else {
             this.i();
             Log.g(this.c(), "apply failed, result = null");
             throw new RuntimeException(this.c()+" apply failed, result = null");
          }
       }
       return p1;
    }
    public int h(){
       return 0;
    }
    public void i(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "7")) {
          return;
       }
       d uod = this.j();
       uod.f(objArray);
       uod.e(objArray);
       uod.c(0);
       return;
    }
    public abstract d j();
}
