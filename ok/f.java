package ok.f;
import ok.h;
import java.lang.Object;
import java.lang.Iterable;
import ok.n;
import ok.f$a;

public abstract class f implements h	// class@0027ea
{
    public f b;
    public final boolean handleNullAutomatically;

    public void f(){
       super(true);
    }
    public void f(boolean p0){
       super();
       this.handleNullAutomatically = p0;
    }
    public final Object apply(Object p0){
       return this.convert(p0);
    }
    public final Object convert(Object p0){
       return this.correctedDoForward(p0);
    }
    public Iterable convertAll(Iterable p0){
       n.k(p0, "fromIterable");
       return new f$a(this, p0);
    }
    public Object correctedDoBackward(Object p0){
       if (this.handleNullAutomatically == null) {
          return this.doBackward(p0);
       }
       if (p0 == null) {
          p0 = null;
       }else {
          p0 = this.doBackward(p0);
          n.j(p0);
       }
       return p0;
    }
    public Object correctedDoForward(Object p0){
       if (this.handleNullAutomatically == null) {
          return this.doForward(p0);
       }
       if (p0 == null) {
          p0 = null;
       }else {
          p0 = this.doForward(p0);
          n.j(p0);
       }
       return p0;
    }
    public abstract Object doBackward(Object p0);
    public abstract Object doForward(Object p0);
    public boolean equals(Object p0){
       return super.equals(p0);
    }
}
