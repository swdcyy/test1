package am1.c$a;
import androidx.recyclerview.widget.h$b;
import am1.c;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ul1.d;
import ch1.d;
import java.lang.Number;

public final class c$a extends h$b	// class@0000db
{
    public final List a;
    public final List b;
    public final c c;

    public void c$a(c p0,List p1,List p2){
       a.p(p1, "oldDataList");
       a.p(p2, "newDataList");
       this.c = p0;
       super();
       this.a = p1;
       this.b = p2;
    }
    public boolean a(int p0,int p1){
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return a.g(this.b.get(p1).b().a(), this.a.get(p0).b().a());
    }
    public boolean b(int p0,int p1){
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return a.g(this.b.get(p1), this.a.get(p0));
    }
    public int d(){
       Object obj = PatchProxy.apply(null, this, c$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.size();
    }
    public int e(){
       Object obj = PatchProxy.apply(null, this, c$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.size();
    }
}
