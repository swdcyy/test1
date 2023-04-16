package aegon.chrome.base.TraceEvent$b;
import android.os.MessageQueue$IdleHandler;
import aegon.chrome.base.TraceEvent;
import java.lang.String;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Class;
import java.lang.Long;
import java.lang.reflect.Method;
import java.lang.Integer;
import a0.n;
import java.lang.Boolean;
import aegon.chrome.base.EarlyTraceEvent;
import aegon.chrome.base.TraceEvent$f;
import aegon.chrome.base.f;
import K.S;
import android.os.Looper;
import aegon.chrome.base.ThreadUtils;
import android.util.Printer;
import aegon.chrome.base.TraceEvent$b$a;
import aegon.chrome.base.TraceEvent$a;
import android.content.Context;
import a0.f;
import java.lang.StringBuilder;
import java.util.ArrayList;
import aegon.chrome.base.TraceEvent$e;
import android.os.MessageQueue;

public class TraceEvent$b implements MessageQueue$IdleHandler	// class@000157
{
    public Class a;
    public Method b;
    public Method c;
    public Method d;
    public Method e;
    public Method f;
    public Class g;
    public Method h;
    public final AtomicBoolean i;
    public final AtomicBoolean j;
    public final AtomicBoolean k;
    public final long l;
    public boolean m;
    public boolean n;
    public static final boolean o;

    static {
    }
    public void TraceEvent$b(long p0){
       int i;
       String str = String.class;
       super();
       this.i = new AtomicBoolean();
       this.j = new AtomicBoolean();
       this.k = new AtomicBoolean();
       try{
          i = 1;
          Class uClass = Class.forName("android.os.Trace");
          this.a = uClass;
          Class[] uClassArray = new Class[i];
          Class tYPE = Long.TYPE;
          uClassArray[0] = tYPE;
          this.b = uClass.getMethod("isTagEnabled", uClassArray);
          Class[] uClassArray1 = new Class[2];
          uClassArray1[0] = tYPE;
          uClassArray1[i] = str;
          this.c = this.a.getMethod("traceBegin", uClassArray1);
          uClassArray1 = new Class[i];
          uClassArray1[0] = tYPE;
          this.d = this.a.getMethod("traceEnd", uClassArray1);
          Class[] uClassArray2 = new Class[3];
          uClassArray2[0] = tYPE;
          uClassArray2[i] = str;
          Class tYPE1 = Integer.TYPE;
          uClassArray2[2] = tYPE1;
          this.e = this.a.getMethod("asyncTraceBegin", uClassArray2);
          uClassArray1 = new Class[3];
          uClassArray1[0] = tYPE;
          uClassArray1[i] = str;
          uClassArray1[2] = tYPE1;
          this.f = this.a.getMethod("asyncTraceEnd", uClassArray1);
          uClass = Class.forName("android.os.SystemProperties");
          this.g = uClass;
          uClassArray = new Class[i];
          uClassArray[0] = str;
          this.h = uClass.getMethod("get", uClassArray);
       }catch(java.lang.Exception e0){
          Object[] objArray = new Object[i];
          objArray[0] = e0;
          n.h("ATrace", "Reflection error", objArray);
          this.b = null;
       }
       this.l = p0;
       this.b();
       return;
    }
    public final String a(String p0){
       try{
          Object[] objArray = new Object[]{p0};
          return this.h.invoke(this.g, objArray);
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public final boolean b(){
       int i;
       boolean b1;
       int i1;
       String str1;
       String[] stringArray;
       int len;
       int i2;
       object oobject;
       boolean b = this.k.get();
       TraceEvent$b tl = this.l;
       try{
          i = 1;
          Object[] objArray = new Object[i];
          objArray[0] = Long.valueOf(tl);
          b1 = this.b.invoke(this.a, objArray).booleanValue();
       }catch(java.lang.Exception e0){
          b1 = false;
       }
       if (e0 == b1) {
          return 0;
       }
       this.k.set(b1);
       Printer printer = null;
       if (!b1) {
          EarlyTraceEvent.b();
          f.l();
          S.MOgCa3d$();
          this.m = false;
          ThreadUtils.b().setMessageLogging(printer);
          return i;
       }else {
          TraceEvent$b$a uob$a = new TraceEvent$b$a(printer);
          String str = this.a("debug.atrace.app_number");
          if (str != null) {
             try{
                Integer d = Integer.decode(str);
             }catch(java.lang.NumberFormatException e0){
             }
          }
       }
    }
    public final void c(){
       if (this.n == null) {
          Looper.myQueue().addIdleHandler(this);
          this.n = true;
       }
       this.b();
       return;
    }
    public final boolean queueIdle(){
       this.b();
       return true;
    }
}
