package a37.m;
import java.lang.Runnable;
import com.kwai.link.extensions.PassThroughTransaction;
import java.lang.String;
import java.lang.Object;

public final class m implements Runnable	// class@000048
{
    public final PassThroughTransaction b;
    public final long c;
    public final String d;
    public final long e;
    public final byte[] f;
    public final String g;
    public final byte[] h;

    public void m(PassThroughTransaction p0,long p1,String p2,long p3,byte[] p4,String p5,byte[] p6){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
    }
    public final void run(){
       PassThroughTransaction.o(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}
