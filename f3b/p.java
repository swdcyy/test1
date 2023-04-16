package f3b.p;
import f3b.p$a;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import f3b.p$b;
import java.util.Iterator;
import java.util.Collection;

public class p	// class@00288d
{
    public List a;
    public List b;
    public final List c;
    public p$a d;

    public void p(p$a p0){
       super();
       this.c = new ArrayList();
       this.d = p0;
    }
    public final int a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, p.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.c.size() - 1;
       while (true) {
          if (i < 0) {
             return -1;
          }
          if ((this.c.get(i).a).equals(p0)) {
             break ;
          }else {
             i = i - 1;
          }
       }
       return i;
    }
    public List b(){
       ArrayList obj = PatchProxy.apply(null, this, p.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          p$b b = iterator.next().b;
          if (b != null) {
             obj.addAll(b);
          }
       }
       return obj;
    }
    public List c(){
       ArrayList obj = PatchProxy.apply(null, this, p.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          p$b c = iterator.next().c;
          if (c != null) {
             obj.addAll(c);
          }
       }
       return obj;
    }
    public void d(List p0){
       this.a = p0;
    }
}
