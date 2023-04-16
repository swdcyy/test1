package bp6.l1;
import java.util.concurrent.Callable;
import com.kwai.imsdk.internal.v;
import java.lang.String;
import java.lang.Object;
import com.kwai.imsdk.internal.client.i;
import com.kwai.chat.kwailink.data.PacketData;
import lh0.b$c;
import java.lang.Class;
import hp6.b;
import qo6.a;

public final class l1 implements Callable	// class@000535
{
    public final v b;
    public final String c;
    public final int d;
    public final byte[] e;
    public final int f;

    public void l1(v p0,String p1,int p2,byte[] p3,int p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final Object call(){
       return a.h(i.t(this.b.a).G(this.c, this.d, this.e, this.f), b$c.class);
    }
}
