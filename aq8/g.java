package aq8.g;
import java.lang.Object;
import aq8.g$a;
import aq8.g$b;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import aq8.h;
import cq8.b;
import java.lang.System;
import java.util.Set;
import java.lang.StringBuilder;
import java.lang.Boolean;

public class g	// class@00030d
{
    public boolean a;
    public String[] b;
    public String[] c;
    public String[] d;

    public void g(){
       super();
       this.a = false;
       this.b = null;
       this.c = null;
       this.d = null;
    }
    public void g(g$a p0){
       super();
       this.a = false;
       this.b = null;
       this.c = null;
       this.d = null;
    }
    public static g e(){
       return g$b.a;
    }
    public synchronized Map a(){
       Object obj = PatchProxy.apply(null, this, g.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.i();
       return h.d;
    }
    public synchronized Map b(){
       Object obj = PatchProxy.apply(null, this, g.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.i();
       return h.e;
    }
    public synchronized String[] c(){
       Object obj = PatchProxy.apply(null, this, g.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d == null) {
          this.f();
       }
       return this.d;
    }
    public synchronized b d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.i();
       return h.c(p0);
    }
    public final void f(){
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "17")) {
          return;
       }
       _monitor_enter(this);
       String[] stringArray = PatchProxy.apply(objArray, this, og, "5");
       if (stringArray != PatchProxyResult.class) {
          _monitor_exit(this);
       }else {
          this.i();
          stringArray = h.a();
          _monitor_exit(this);
       }
       int len = stringArray.length;
       int len1 = this.b.length;
       int len2 = this.c.length;
       int i = len + len1;
       String[] stringArray1 = new String[(i + len2)];
       System.arraycopy(stringArray, 0, stringArray1, 0, len);
       System.arraycopy(this.b, 0, stringArray1, len, len1);
       System.arraycopy(this.c, 0, stringArray1, i, len2);
       this.d = stringArray1;
       return;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, g.class, "16")) {
          return;
       }
       int i = 0;
       String[] stringArray = new String[i];
       String[] stringArray1 = this.b().keySet().toArray(stringArray);
       int len = stringArray1.length;
       String[] stringArray2 = new String[len];
       if (len > 0) {
          for (; i < len; i = i + 1) {
             stringArray2[i] = stringArray1[i]+"_stub";
          }
       }
       this.c = stringArray2;
       return;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, g.class, "15")) {
          return;
       }
       int i = 0;
       String[] stringArray = new String[i];
       String[] stringArray1 = this.a().keySet().toArray(stringArray);
       int len = stringArray1.length;
       String[] stringArray2 = new String[len];
       if (len > 0) {
          for (; i < len; i = i + 1) {
             stringArray2[i] = stringArray1[i]+"_stub";
          }
       }
       this.b = stringArray2;
       return;
    }
    public synchronized final void i(){
       if (PatchProxy.applyVoid(null, this, g.class, "11")) {
          return;
       }
       if (this.a == null) {
          this.j(false);
       }
       return;
    }
    public synchronized void j(boolean p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "2")) {
          return;
       }
       h.d(p0);
       this.a = true;
       this.h();
       this.g();
       this.f();
       return;
    }
}
