package ee1.o0;
import z1.a;
import java.nio.ByteBuffer;
import java.lang.Object;
import xv4.i;

public final class o0 implements a	// class@002116
{
    public final ByteBuffer a;
    public final int b;
    public final int c;
    public final long d;

    public void o0(ByteBuffer p0,int p1,int p2,long p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final void accept(Object p0){
       p0.onAudioMixPcmData(this.a, this.b, this.c, this.d);
    }
}
