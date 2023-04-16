package io.reactivex.exceptions.CompositeException$c;
import io.reactivex.exceptions.CompositeException$a;
import java.io.PrintWriter;
import java.lang.Object;

public final class CompositeException$c extends CompositeException$a	// class@00119e
{
    public final PrintWriter a;

    public void CompositeException$c(PrintWriter p0){
       super();
       this.a = p0;
    }
    public void a(Object p0){
       this.a.println(p0);
    }
}
