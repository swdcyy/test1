package as7.b;
import java.util.ArrayList;
import com.kwai.component.taskdispatcher.slide.SlideDispatchHelper;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import as7.a;
import java.lang.StringBuilder;
import java.lang.System;
import q87.c;
import java.lang.Long;
import hh5.c;
import java.util.List;
import java.util.Collection;
import as7.b$a;
import java.lang.Runnable;
import t45.c;

public final class b	// class@000362
{
    public static final List a;
    public static final boolean b;
    public static final b c;

    static {
       b.c = new b();
       b.a = new ArrayList();
       b.b = SlideDispatchHelper.e();
    }
    public void b(){
       super();
    }
    public static final void c(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "1")) {
          return;
       }
       a.p(p0, "tag");
       a.p(p1, "monitorPoint");
       a.p(p2, "stage");
       b.d(p0, p1, "", p2);
       return;
    }
    public static final void d(String p0,String p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, b.class, "2")) {
          return;
       }
       a.p(p0, "tag");
       a.p(p1, "monitorPoint");
       a.p(p2, "moduleName");
       a.p(p3, "stage");
       Object[] objArray = new Object[0];
       a.C().w("SlidePlayLogger", p0+':'+p1+':'+p2+':'+p3+':'+System.currentTimeMillis(), objArray);
       return;
    }
    public final void a(String p0,String p1,long p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Long.valueOf(p2), this, b.class, "3")) {
          return;
       }
       a.p(p0, "stage");
       a.p(p1, "name");
       if (b.b) {
          b.a.add(new c(p1, p2, p0));
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       if (b.b) {
          List a = b.a;
          if (a.isEmpty()) {
             return;
          }else {
             ArrayList uArrayList = new ArrayList();
             uArrayList.addAll(a);
             c.a(new b$a(uArrayList));
             a.clear();
          }
       }
       return;
    }
}
