package ltd.o0;
import kotlin.coroutines.CoroutineContext;
import java.lang.Object;

public final class o0	// class@001cdc
{
    public Object[] a;
    public int b;
    public final CoroutineContext c;

    public void o0(CoroutineContext p0,int p1){
       super();
       this.c = p0;
       Object[] objArray = new Object[p1];
       this.a = objArray;
    }
    public final void a(Object p0){
       o0 tb = this.b;
       this.b = tb + 1;
       this.a[tb] = p0;
    }
    public final CoroutineContext b(){
       return this.c;
    }
    public final void c(){
       this.b = 0;
    }
    public final Object d(){
       o0 tb = this.b;
       this.b = tb + 1;
       return this.a[tb];
    }
}
