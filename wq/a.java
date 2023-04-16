package wq.a;
import wq.d;
import java.util.ArrayDeque;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import wq.b;
import java.util.Queue;
import java.util.Collection;
import java.lang.UnsupportedOperationException;

public class a extends d	// class@002774
{
    public final Queue b;
    public final int c;

    public void a(int p0){
       super();
       if (p0 < 0) {
          throw new IllegalArgumentException("maxSize \(%s\) must >= 0."+p0);
       }
       this.b = new ArrayDeque(p0);
       this.c = p0;
       return;
    }
    public static a m(int p0){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new a(p0);
    }
    public boolean add(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          throw new IllegalArgumentException();
       }
       if (this.c == null) {
          return true;
       }
       if (this.size() == this.c) {
          this.b.remove();
       }
       this.b.add(p0);
       return true;
    }
    public boolean addAll(Collection p0){
       p0 = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       throw new UnsupportedOperationException();
    }
    public Object b(){
       return this.l();
    }
    public boolean contains(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          return this.l().contains(p0);
       }
       throw new IllegalArgumentException();
    }
    public Collection d(){
       return this.l();
    }
    public Queue l(){
       return this.b;
    }
    public boolean offer(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.add(p0);
    }
    public boolean remove(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          return this.l().remove(p0);
       }
       throw new IllegalArgumentException();
    }
}
