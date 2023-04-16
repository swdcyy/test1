package cud.d;
import okio.m;
import java.lang.Object;
import okio.o;
import okio.b;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class d implements m	// class@000c86
{

    public void d(){
       super();
    }
    public void close(){
    }
    public void flush(){
    }
    public o timeout(){
       return o.NONE;
    }
    public void write(b p0,long p1){
       a.q(p0, "source");
       p0.skip(p1);
    }
}
