package ltd.i;
import ftd.k0;
import kotlin.coroutines.CoroutineContext;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class i implements k0	// class@001ccd
{
    public final CoroutineContext b;

    public void i(CoroutineContext p0){
       super();
       this.b = p0;
    }
    public CoroutineContext getCoroutineContext(){
       return this.b;
    }
    public String toString(){
       return "CoroutineScope\(coroutineContext="+this.getCoroutineContext()+')';
    }
}
