package okio.f;
import okio.m;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import okio.o;
import java.lang.StringBuilder;
import java.lang.Class;
import okio.b;

public abstract class f implements m	// class@0020f4
{
    public final m delegate;

    public void f(m p0){
       a.q(p0, "delegate");
       super();
       this.delegate = p0;
    }
    public final m -deprecated_delegate(){
       return this.delegate;
    }
    public void close(){
       this.delegate.close();
    }
    public final m delegate(){
       return this.delegate;
    }
    public void flush(){
       this.delegate.flush();
    }
    public o timeout(){
       return this.delegate.timeout();
    }
    public String toString(){
       return this.getClass().getSimpleName()+'('+this.delegate+')';
    }
    public void write(b p0,long p1){
       a.q(p0, "source");
       this.delegate.write(p0, p1);
    }
}
