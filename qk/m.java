package qk.m;
import java.lang.Iterable;
import java.lang.Object;
import com.google.common.base.Optional;
import ok.n;
import qk.n;
import qk.m$a;
import java.util.List;
import java.util.Arrays;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import com.google.common.collect.Ordering;
import ok.h;
import qk.y;
import ok.o;
import java.util.Iterator;
import java.util.Collection;
import com.google.common.collect.e;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Class;

public abstract class m implements Iterable	// class@002a0a
{
    public final Optional b;

    public void m(){
       super();
       this.b = Optional.absent();
    }
    public void m(Iterable p0){
       super();
       n.j(p0);
       if (this != p0) {
       }else {
          p0 = null;
       }
       this.b = Optional.fromNullable(p0);
       return;
    }
    public static m m(Iterable p0,Iterable p1){
       Iterable[] iterableArra = new Iterable[]{p0,p1};
       int i = 0;
       for (; i < 2; i = i + 1) {
          n.j(iterableArra[i]);
       }
       return new n(iterableArra);
    }
    public static m s(Iterable p0){
       if (p0 instanceof m) {
       }else {
          m$a uoa = new m$a(p0, p0);
       }
       return p0;
    }
    public static m t(Object[] p0){
       return m.s(Arrays.asList(p0));
    }
    public final ImmutableList B(){
       return ImmutableList.copyOf(this.u());
    }
    public final ImmutableSet D(){
       return ImmutableSet.copyOf(this.u());
    }
    public final ImmutableList E(Comparator p0){
       return Ordering.from(p0).immutableSortedCopy(this.u());
    }
    public final m F(h p0){
       return m.s(y.x(this.u(), p0));
    }
    public final boolean b(o p0){
       return y.b(this.u(), p0);
    }
    public final boolean d(o p0){
       return y.c(this.u(), p0);
    }
    public final boolean isEmpty(){
       return (this.u().iterator().hasNext() ^ 0x01);
    }
    public final m l(Object[] p0){
       return m.m(this.u(), Arrays.asList(p0));
    }
    public final Collection n(Collection p0){
       n.j(p0);
       Iterable iterable = this.u();
       if (iterable instanceof Collection) {
          p0.addAll(e.a(iterable));
       }else {
          Iterator iterator = iterable.iterator();
          while (iterator.hasNext()) {
             p0.add(iterator.next());
          }
       }
       return p0;
    }
    public final m p(o p0){
       return m.s(y.h(this.u(), p0));
    }
    public final Optional q(){
       Iterator iterator = this.u().iterator();
       Optional optional = (iterator.hasNext())? Optional.of(iterator.next()): Optional.absent();
       return optional;
    }
    public final Optional r(o p0){
       return y.y(this.u(), p0);
    }
    public final int size(){
       return y.r(this.u());
    }
    public String toString(){
       Iterator iterator = this.u().iterator();
       StringBuilder str = '[';
       String str1 = 1;
       while (iterator.hasNext()) {
          if (!str1) {
             str = str+", ";
          }
          str1 = null;
          str = str+iterator.next();
       }
       return str+']';
    }
    public final Iterable u(){
       return this.b.or(this);
    }
    public final m v(int p0){
       return m.s(y.p(this.u(), p0));
    }
    public final Object[] w(Class p0){
       return y.v(this.u(), p0);
    }
}
