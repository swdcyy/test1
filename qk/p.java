package qk.p;
import java.util.Collection;
import qk.t;
import java.lang.Object;
import java.util.Iterator;
import com.google.common.collect.Iterators;
import com.google.common.collect.e;
import ok.k;
import ok.n;
import qk.h0;
import java.lang.Iterable;
import java.lang.String;
import java.lang.StringBuilder;

public abstract class p extends t implements Collection	// class@002a11
{

    public void p(){
       super();
    }
    public boolean add(Object p0){
       return this.delegate().add(p0);
    }
    public boolean addAll(Collection p0){
       return this.delegate().addAll(p0);
    }
    public void clear(){
       this.delegate().clear();
    }
    public boolean contains(Object p0){
       return this.delegate().contains(p0);
    }
    public boolean containsAll(Collection p0){
       return this.delegate().containsAll(p0);
    }
    public Object delegate(){
       return this.delegate();
    }
    public abstract Collection delegate();
    public boolean isEmpty(){
       return this.delegate().isEmpty();
    }
    public Iterator iterator(){
       return this.delegate().iterator();
    }
    public boolean remove(Object p0){
       return this.delegate().remove(p0);
    }
    public boolean removeAll(Collection p0){
       return this.delegate().removeAll(p0);
    }
    public boolean retainAll(Collection p0){
       return this.delegate().retainAll(p0);
    }
    public int size(){
       return this.delegate().size();
    }
    public boolean standardAddAll(Collection p0){
       return Iterators.a(this, p0.iterator());
    }
    public void standardClear(){
       Iterators.d(this.iterator());
    }
    public boolean standardContains(Object p0){
       return Iterators.f(this.iterator(), p0);
    }
    public boolean standardContainsAll(Collection p0){
       return e.b(this, p0);
    }
    public boolean standardIsEmpty(){
       return (this.iterator().hasNext() ^ 0x01);
    }
    public boolean standardRemove(Object p0){
       Iterator iterator = this.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          if (k.a(iterator.next(), p0)) {
             break ;
          }
       }
       iterator.remove();
       return true;
    }
    public boolean standardRemoveAll(Collection p0){
       return Iterators.q(this.iterator(), p0);
    }
    public boolean standardRetainAll(Collection p0){
       Iterator iterator = this.iterator();
       n.j(p0);
       boolean b = false;
       while (iterator.hasNext()) {
          if (!p0.contains(iterator.next())) {
             iterator.remove();
             b = true;
          }
       }
       return b;
    }
    public Object[] standardToArray(){
       Object[] objArray = new Object[this.size()];
       return this.toArray(objArray);
    }
    public Object[] standardToArray(Object[] p0){
       int i = this.size();
       if (p0.length < i) {
          p0 = h0.d(p0, i);
       }
       Iterator iterator = this.iterator();
       int i1 = 0;
       while (iterator.hasNext()) {
          int i2 = i1 + 1;
          p0[i1] = iterator.next();
          i1 = i2;
       }
       if (p0.length > i) {
          p0[i] = null;
       }
       return p0;
    }
    public String standardToString(){
       StringBuilder str = e.d(this.size())+'[';
       Iterator iterator = this.iterator();
       String str1 = 1;
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (!str1) {
             str = str+", ";
          }
          str1 = null;
          if (obj == this) {
             str = str+"\(this Collection\)";
          }else {
             str = str+obj;
          }
       }
       return str+']';
    }
    public Object[] toArray(){
       return this.delegate().toArray();
    }
    public Object[] toArray(Object[] p0){
       return this.delegate().toArray(p0);
    }
}
