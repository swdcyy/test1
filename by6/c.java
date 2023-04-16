package by6.c;
import by6.f$c;
import by6.d;
import by6.f;
import by6.e$b;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dy6.c;
import java.lang.Integer;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Iterator;
import java.util.List;
import java.lang.StringBuilder;
import by6.b;
import dy6.a;
import com.kwai.library.network.detector.model.NetworkDetectConfig;
import java.lang.Number;
import java.util.Collection;

public class c implements f$c	// class@0004b0
{
    public final f a;
    public final e$b b;
    public final Map c;
    public final d d;

    public void c(d p0,f p1,e$b p2,Map p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void a(Map p0){
       boolean b;
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, str)) {
          return;
       }
       this.d.c.put(this.a.b(), Integer.valueOf(100));
       if (p0 != null && !p0.isEmpty()) {
          this.c.putAll(p0);
       }
       c td = this.d;
       Objects.requireNonNull(td);
       Object obj = PatchProxy.apply(null, td, d.class, str);
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          Iterator iterator = td.b.iterator();
          while (true) {
             if (iterator.hasNext()) {
                if (iterator.next().e == null) {
                   b = false;
                }
             }else {
                b = true;
             }
          }
       }
       b.a("NetworkDetector onNetworkGroupDetectCompleted detectCompleted:"+b);
       if (b) {
          this.b.a(new a(this.d.a, this.c));
       }
       return;
    }
    public void onProgress(int p0){
       int i;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       this.d.c.put(this.a.b(), Integer.valueOf(p0));
       c tb = this.b;
       uoc = this.d;
       Objects.requireNonNull(uoc);
       Object obj = PatchProxy.apply(null, uoc, d.class, "3");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          int i1 = 100;
          Iterator iterator = uoc.c.values().iterator();
          while (iterator.hasNext()) {
             Integer integer = iterator.next();
             if (integer.intValue() < i1) {
                i1 = integer.intValue();
             }
          }
          i = i1;
       }
       tb.onProgress(i);
       return;
    }
}
