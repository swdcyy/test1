package io.reactivex.exceptions.CompositeException$b;
import io.reactivex.exceptions.CompositeException$a;
import java.io.PrintStream;
import java.lang.Object;

public final class CompositeException$b extends CompositeException$a	// class@00119d
{
    public final PrintStream a;

    public void CompositeException$b(PrintStream p0){
       super();
       this.a = p0;
    }
    public void a(Object p0){
       this.a.println(p0);
    }
}
