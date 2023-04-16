package a5.k;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import java.util.Arrays;

public final class k	// class@0000ea
{
    public final Object a;
    public final Throwable b;

    public void k(Object p0){
       super();
       this.a = p0;
       this.b = null;
    }
    public void k(Throwable p0){
       super();
       this.b = p0;
       this.a = null;
    }
    public Throwable a(){
       return this.b;
    }
    public Object b(){
       return this.a;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof k) {
          return false;
       }
       if (this.b() != null && this.b().equals(p0.b())) {
          return b;
       }
       if (this.a() != null && p0.a() != null) {
          return (this.a().toString()).equals(this.a().toString());
       }
       return false;
    }
    public int hashCode(){
       Object[] objArray = new Object[]{this.b(),this.a()};
       return Arrays.hashCode(objArray);
    }
}
