package kotlin.coroutines.CombinedContext;
import kotlin.coroutines.CoroutineContext;
import java.io.Serializable;
import kotlin.coroutines.CoroutineContext$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import kotlin.coroutines.CoroutineContext$b;
import msd.p;
import java.util.Objects;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.CoroutineContext$DefaultImpls;
import java.lang.StringBuilder;
import kotlin.coroutines.CombinedContext$toString$1;
import kotlin.jvm.internal.Ref$IntRef;
import qrd.l1;
import kotlin.coroutines.CombinedContext$writeReplace$1;
import kotlin.coroutines.CombinedContext$Serialized;
import java.lang.IllegalStateException;

public final class CombinedContext implements CoroutineContext, Serializable	// class@001c75
{
    public final CoroutineContext$a element;
    public final CoroutineContext left;

    public void CombinedContext(CoroutineContext p0,CoroutineContext$a p1){
       a.p(p0, "left");
       a.p(p1, "element");
       super();
       this.left = p0;
       this.element = p1;
    }
    public boolean equals(Object p0){
       boolean b = (this == p0 || (p0 instanceof CombinedContext && (p0.h() == this.h() && p0.g(this))))? true: false;
       return b;
    }
    public final boolean f(CoroutineContext$a p0){
       return a.g(this.get(p0.getKey()), p0);
    }
    public Object fold(Object p0,p p1){
       a.p(p1, "operation");
       return p1.invoke(this.left.fold(p0, p1), this.element);
    }
    public final boolean g(CombinedContext p0){
       while (true) {
          if (!this.f(p0.element)) {
             return false;
          }
          p0 = p0.left;
          if (p0 instanceof CombinedContext) {
          }else {
             break ;
          }
       }
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
       return this.f(p0);
    }
    public CoroutineContext$a get(CoroutineContext$b p0){
       a.p(p0, "key");
       CombinedContext uCombinedCon = this;
       while (true) {
          CoroutineContext$a uoa = uCombinedCon.element.get(p0);
          if (uoa != null) {
             return uoa;
          }
          uCombinedCon = uCombinedCon.left;
          if (uCombinedCon instanceof CombinedContext) {
          }else {
             break ;
          }
       }
       return uCombinedCon.get(p0);
    }
    public final int h(){
       int i = 2;
       CombinedContext uCombinedCon = this;
       uCombinedCon = uCombinedCon.left;
       while (!uCombinedCon instanceof CombinedContext) {
          uCombinedCon = null;
          break ;
          i = i + 1;
       }
       if (uCombinedCon == null) {
          return i;
       }
    }
    public int hashCode(){
       return (this.left.hashCode() + this.element.hashCode());
    }
    public CoroutineContext minusKey(CoroutineContext$b p0){
       CombinedContext telement;
       a.p(p0, "key");
       if (this.element.get(p0) != null) {
          return this.left;
       }
       CoroutineContext uCoroutineCo = this.left.minusKey(p0);
       if (uCoroutineCo == this.left) {
          uCoroutineCo = this;
       }else if(uCoroutineCo == EmptyCoroutineContext.INSTANCE){
          telement = this.element;
       }else {
          telement = new CombinedContext(uCoroutineCo, this.element);
       }
       return uCoroutineCo;
    }
    public CoroutineContext plus(CoroutineContext p0){
       a.p(p0, "context");
       return CoroutineContext$DefaultImpls.a(this, p0);
    }
    public String toString(){
       return "["+this.fold("", CombinedContext$toString$1.INSTANCE)+"]";
    }
    public final Object writeReplace(){
       int i = this.h();
       CoroutineContext[] uCoroutineCo = new CoroutineContext[i];
       Ref$IntRef intRef = new Ref$IntRef();
       int i1 = 0;
       intRef.element = i1;
       this.fold(l1.a, new CombinedContext$writeReplace$1(uCoroutineCo, intRef));
       if (intRef.element == i) {
          i1 = 1;
       }
       if (i1) {
          return new CombinedContext$Serialized(uCoroutineCo);
       }else {
          throw new IllegalStateException("Check failed.".toString());
       }
    }
}
