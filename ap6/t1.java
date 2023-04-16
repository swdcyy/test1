package ap6.t1;
import java.util.concurrent.Callable;
import com.kwai.imsdk.group.b;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import dp6.b;
import java.util.Objects;
import java.lang.CharSequence;
import ca7.u;
import java.util.Collection;
import com.kwai.imsdk.internal.util.b;
import com.kwai.chat.kwailink.data.PacketData;
import lh0.a$s1;
import rh0.a$c;
import java.lang.Long;
import com.kwai.chat.sdk.signal.f;
import com.kwai.chat.sdk.signal.IMClientAppInfo;
import com.kwai.chat.kwailink.data.ClientAppInfo;
import qo6.a;
import com.kwai.chat.sdk.signal.KwaiSignalDispatcher;
import com.google.protobuf.nano.MessageNano;
import java.lang.Exception;
import lh0.a$t1;
import java.lang.Class;
import hp6.b;

public final class t1 implements Callable	// class@000373
{
    public final b b;
    public final String c;
    public final int d;
    public final List e;

    public void t1(b p0,String p1,int p2,List p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final Object call(){
       PacketData packetData;
       t1 tc = this.c;
       t1 td = this.d;
       t1 te = this.e;
       b uob = b.i(this.b.b);
       try{
          Objects.requireNonNull(uob);
          if (u.c(tc) || b.c(te)) {
             PacketData packetData1 = new PacketData();
             packetData1.x(1004);
             if (u.c(tc)) {
                packetData1.z("group id is empty");
             }
             if (b.c(te)) {
                packetData1.z("manager user id is empty");
             }
          }
          a$s1 os1 = new a$s1();
          os1.b = td;
          a$c[] uocArray = new a$c[te.size()];
          for (int i = 0; i < te.size(); i = i + 1) {
             a$c uoc = new a$c();
             uoc.b = Long.valueOf(te.get(i)).longValue();
             uoc.a = f.e().b().a();
             uocArray[i] = uoc;
          }
          os1.a = uocArray;
          os1.c = tc;
          packetData = f.d(uob.a).sendSync("Group.ManagerSetting", MessageNano.toByteArray(os1));
       }catch(java.lang.Exception e1){
          packetData = uob.g(e1);
       }
       return a.h(packetData, a$t1.class);
    }
}
