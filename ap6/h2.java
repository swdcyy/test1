package ap6.h2;
import java.util.concurrent.Callable;
import com.kwai.imsdk.group.b;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import dp6.b;
import java.util.Objects;
import lh0.a$e0;
import java.util.ArrayList;
import java.util.Iterator;
import rh0.a$c;
import java.lang.Long;
import com.kwai.chat.sdk.signal.f;
import com.kwai.chat.sdk.signal.IMClientAppInfo;
import com.kwai.chat.kwailink.data.ClientAppInfo;
import qo6.a;
import com.kwai.chat.sdk.signal.KwaiSignalDispatcher;
import com.google.protobuf.nano.MessageNano;
import com.kwai.chat.kwailink.data.PacketData;
import java.lang.Exception;
import lh0.a$f0;
import java.lang.Class;
import hp6.b;

public final class h2 implements Callable	// class@000338
{
    public final b b;
    public final String c;
    public final List d;
    public final boolean e;

    public void h2(b p0,String p1,List p2,boolean p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final Object call(){
       PacketData packetData;
       h2 tc = this.c;
       h2 td = this.d;
       h2 te = this.e;
       b uob = b.i(this.b.b);
       Objects.requireNonNull(uob);
       a$e0 uoe0 = new a$e0();
       try{
          uoe0.a = tc;
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = td.iterator();
          while (iterator.hasNext()) {
             a$c uoc = new a$c();
             uoc.b = Long.valueOf(iterator.next()).longValue();
             uoc.a = f.e().b().a();
             uArrayList.add(uoc);
          }
          a$c[] uocArray = new a$c[0];
          uoe0.b = uArrayList.toArray(uocArray);
          uoe0.c = te;
          packetData = f.d(uob.a).sendSync("Group.Kick", MessageNano.toByteArray(uoe0), 0x2710);
       }catch(java.lang.Exception e1){
          packetData = uob.g(e1);
       }
       return a.h(packetData, a$f0.class);
    }
}
