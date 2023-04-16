package bp6.q;
import java.util.concurrent.Callable;
import com.kwai.imsdk.internal.o;
import com.kwai.imsdk.msg.KwaiMsg;
import java.lang.Object;
import java.lang.String;
import com.kwai.imsdk.internal.client.i;
import com.kwai.chat.kwailink.data.PacketData;
import com.kwai.middleware.azeroth.network.EmptyResponse;

public final class q implements Callable	// class@000547
{
    public final o b;
    public final KwaiMsg c;

    public void q(o p0,KwaiMsg p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object call(){
       q tc = this.c;
       i.t(this.b.g).H(tc, tc.getTargetType(), 0x3a98);
       return new EmptyResponse();
    }
}
