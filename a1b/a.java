package a1b.a;
import java.util.List;
import a1b.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Collection;
import java.util.function.Consumer;
import java.lang.Number;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import java.util.Comparator;
import java.util.Spliterator;

public class a implements List	// class@000011
{
    public final b b;

    public void a(b p0){
       super();
       this.b = p0;
    }
    public void add(int p0,Object p1){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, a.class, "20")) {
          return;
       }
       this.b.a().add(p0, p1);
       return;
    }
    public boolean add(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.a().add(p0);
    }
    public boolean addAll(int p0,Collection p1){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, a.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.b.a().addAll(p0, p1);
    }
    public boolean addAll(Collection p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.a().addAll(p0);
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, a.class, "17")) {
          return;
       }
       this.b.a().clear();
       return;
    }
    public boolean contains(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.a().contains(p0);
    }
    public boolean containsAll(Collection p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.a().containsAll(p0);
    }
    public void forEach(Consumer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       this.b.a().forEach(p0);
       return;
    }
    public Object get(int p0){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, a.class, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.b.a().get(p0);
    }
    public int indexOf(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.a().indexOf(p0);
    }
    public boolean isEmpty(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.a().isEmpty();
    }
    public Iterator iterator(){
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.a().iterator();
    }
    public int lastIndexOf(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.a().lastIndexOf(p0);
    }
    public ListIterator listIterator(){
       Object obj = PatchProxy.apply(null, this, a.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.a().listIterator();
    }
    public ListIterator listIterator(int p0){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, a.class, "25");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.b.a().listIterator(p0);
    }
    public Object remove(int p0){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, a.class, "21");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.b.a().remove(p0);
    }
    public boolean remove(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.a().remove(p0);
    }
    public boolean removeAll(Collection p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.a().removeAll(p0);
    }
    public void replaceAll(UnaryOperator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "15")) {
          return;
       }
       this.b.a().replaceAll(p0);
       return;
    }
    public boolean retainAll(Collection p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.a().retainAll(p0);
    }
    public Object set(int p0,Object p1){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, a.class, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.b.a().set(p0, p1);
    }
    public int size(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.a().size();
    }
    public void sort(Comparator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "16")) {
          return;
       }
       this.b.a().sort(p0);
       return;
    }
    public Spliterator spliterator(){
       Object obj = PatchProxy.apply(null, this, a.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.a().spliterator();
    }
    public List subList(int p0,int p1){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, a.class, "26");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.b.a().subList(p0, p1);
    }
    public Object[] toArray(){
       Object obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.a().toArray();
    }
    public Object[] toArray(Object[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.a().toArray(p0);
    }
}
