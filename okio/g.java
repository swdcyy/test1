package okio.g;
import okio.n;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import okio.b;
import okio.o;
import java.lang.StringBuilder;
import java.lang.Class;

public abstract class g implements n	// class@001ff8
{
    public final n delegate;

    public void g(n p0){
       a.q(p0, "delegate");
       super();
       this.delegate = p0;
    }
    public final n -deprecated_delegate(){
       return this.delegate;
    }
    public void close(){
       this.delegate.close();
    }
    public final n delegate(){
       return this.delegate;
    }
    public long read(b p0,long p1){
       a.q(p0, "sink");
       return this.delegate.read(p0, p1);
    }
    public o timeout(){
       return this.delegate.timeout();
    }
    public String toString(){
       return this.getClass().getSimpleName()+'('+this.delegate+')';
    }
}
