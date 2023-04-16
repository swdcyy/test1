package ap6.n1;
import java.util.concurrent.Callable;
import com.kwai.imsdk.group.b;
import java.lang.String;
import java.lang.Object;
import dp6.b;
import java.util.Objects;
import java.lang.CharSequence;
import ca7.u;
import hp6.b;
import lh0.a$k;
import qo6.a;
import com.kwai.chat.sdk.signal.KwaiSignalDispatcher;
import com.kwai.chat.sdk.signal.f;
import com.google.protobuf.nano.MessageNano;
import com.kwai.chat.kwailink.data.PacketData;
import java.lang.Exception;
import lh0.a$l;
import java.lang.Class;

public final class n1 implements Callable	// class@000355
{
    public final b b;
    public final long c;
    public final String d;
    public final int e;

    public void n1(b p0,long p1,String p2,int p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final Object call(){
       PacketData packetData;
       n1 tc = this.c;
       n1 td = this.d;
       n1 te = this.e;
       b uob = b.i(this.b.b);
       Objects.requireNonNull(uob);
       if (u.c(td)) {
          uob = new b(1004);
          uob.e("group id is empty");
       }else if(te != 1 && te != 2){
          uob = new b(1004);
          uob.e("inviteStatus is invalid");
       }else {
          try{
             a$k ok = new a$k();
             ok.a = tc;
             ok.b = td;
             ok.c = te;
             packetData = f.d(uob.a).sendSync("Group.InviteAccept", MessageNano.toByteArray(ok));
          }catch(java.lang.Exception e1){
             packetData = packetData.g(e1);
          }
          uob = a.h(packetData, a$l.class);
       }
       return uob;
    }
}
