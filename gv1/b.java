package gv1.b;
import androidx.recyclerview.widget.h$b;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ls5.a;
import gv1.e;
import java.lang.Number;

public final class b extends h$b	// class@00258b
{
    public final List a;
    public final List b;

    public void b(List p0,List p1){
       a.p(p0, "oldList");
       a.p(p1, "newList");
       super();
       this.a = p0;
       this.b = p1;
    }
    public boolean a(int p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return a.g(this.a.get(p0), this.b.get(p1));
    }
    public boolean b(int p0,int p1){
       boolean b;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a uoa = this.a.get(p0);
       a uoa1 = this.b.get(p1);
       b = (uoa == uoa1 || (uoa instanceof e && uoa1 instanceof e))? true: false;
       return b;
    }
    public int d(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.size();
    }
    public int e(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.size();
    }
}
