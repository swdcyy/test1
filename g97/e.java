package g97.e;
import h97.d;
import g97.e$a;
import nsd.u;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.String;
import java.lang.reflect.Type;
import java.lang.CharSequence;
import kotlin.jvm.internal.Ref$ObjectRef;
import ca7.f;
import com.google.gson.Gson;
import c97.d;
import kotlin.jvm.internal.a;
import g97.e$e;
import java.lang.Runnable;
import f97.a;
import java.lang.RuntimeException;
import java.lang.Throwable;
import h97.j;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import com.kwai.middleware.azeroth.Azeroth2;
import g97.e$d;
import rb7.c;
import l97.c;
import java.lang.Class;
import brd.t;
import g97.e$b;
import g97.e$c;
import erd.g;
import crd.b;

public final class e implements d	// class@0016c8
{
    public final Map a;
    public AtomicBoolean b;
    public static final e$a c;

    static {
       e.c = new e$a(null);
    }
    public void e(){
       super();
       this.a = new LinkedHashMap();
       this.b = new AtomicBoolean(false);
    }
    public Object a(String p0,Type p1){
       String str = this.c(p0);
       Gson gson = (!str.length())? 1: null;
       Object obj = null;
       if (gson) {
          return obj;
       }else {
          Ref$ObjectRef objectRef = new Ref$ObjectRef();
          try{
             objectRef.element = obj;
             obj = f.b.i(str, p1);
          }catch(java.lang.Exception e0){
             d uod = d.a();
             a.h(uod, "Azeroth.get\(\)");
             if (!uod.i()) {
                objectRef.element = e0;
             }else {
                throw new RuntimeException(e0);
             }
          }
          Object obj1 = obj;
          e$e uoe = new e$e(obj1, p0, str, objectRef, p1);
          a.a(v7);
          return obj1;
       }
    }
    public synchronized void b(String p0,j p1){
       e uoe = (p0 == null || !p0.length())? 1: null;
       if (uoe) {
          return;
       }else if(p1 == null){
          return;
       }else {
          List list = this.a.get(p0);
          if (list == null) {
             list = new ArrayList();
          }else if(list.contains(p1)){
             return;
          }
          list.add(p1);
          this.a.put(p0, list);
          return;
       }
    }
    public String c(String p0){
       String str = (p0 == null || !p0.length())? 1: null;
       str = (str)? "": Azeroth2.B.o(p0);
       a.a(new e$d(str, p0));
       return str;
    }
    public final void d(){
       if (!this.b.compareAndSet(false, true)) {
          return;
       }
       c.c.b(c.class).subscribe(new e$b(this), e$c.b);
       return;
    }
}
