package wq.b;
import java.util.Collection;
import wq.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Iterator;
import java.lang.Number;

public abstract class b extends c implements Collection	// class@002775
{

    public void b(){
       super();
    }
    public boolean add(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.d().add(p0);
    }
    public boolean addAll(Collection p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.d().addAll(p0);
    }
    public Object b(){
       return this.d();
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, b.class, "11")) {
          return;
       }
       this.d().clear();
       return;
    }
    public boolean contains(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.d().contains(p0);
    }
    public boolean containsAll(Collection p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.d().containsAll(p0);
    }
    public abstract Collection d();
    public boolean isEmpty(){
       Object obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.d().isEmpty();
    }
    public Iterator iterator(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d().iterator();
    }
    public boolean remove(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.d().remove(p0);
    }
    public boolean removeAll(Collection p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.d().removeAll(p0);
    }
    public boolean retainAll(Collection p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.d().retainAll(p0);
    }
    public int size(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.d().size();
    }
    public Object[] toArray(){
       Object obj = PatchProxy.apply(null, this, b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d().toArray();
    }
    public Object[] toArray(Object[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d().toArray(p0);
    }
}
