package htd.f0$a;
import java.lang.Throwable;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.String;
import java.lang.StringBuilder;

public final class f0$a	// class@000fc6
{
    public final Throwable a;

    public void f0$a(Throwable p0){
       super();
       this.a = p0;
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof f0$a && a.g(this.a, p0.a))? true: false;
       return b;
    }
    public int hashCode(){
       f0$a ta = this.a;
       int i = (ta != null)? ta.hashCode(): 0;
       return i;
    }
    public String toString(){
       return "Closed\("+this.a+')';
    }
}
