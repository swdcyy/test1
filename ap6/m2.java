package ap6.m2;
import java.util.concurrent.Callable;
import com.kwai.imsdk.group.b;
import java.lang.String;
import java.lang.Object;
import dp6.b;
import java.util.Objects;
import java.lang.CharSequence;
import ca7.u;
import hp6.b;
import lh0.a$i1;
import lh0.a$f1;
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
import lh0.a$j1;
import java.lang.Class;

public final class m2 implements Callable	// class@000351
{
    public final b b;
    public final boolean c;
    public final String d;
    public final String e;
    public final long f;

    public void m2(b p0,boolean p1,String p2,String p3,long p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final Object call(){
       PacketData packetData;
       m2 tc = this.c;
       m2 td = this.d;
       m2 te = this.e;
       m2 tf = this.f;
       b uob = b.i(this.b.b);
       Objects.requireNonNull(uob);
       int i = 1004;
       if (u.c(te)) {
          uob = new b(i);
          uob.e("group id is empty");
       }else if(u.c(td)){
          uob = new b(i);
          uob.e("userId id is empty");
       }else {
          try{
             a$i1 oi1 = new a$i1();
             if (!u.c(te)) {
                oi1.c = te;
                a$f1 uof1 = new a$f1();
                uof1.a = tc;
                if (!u.c(td)) {
                   a$c uoc = new a$c();
                   uoc.b = Long.valueOf(td).longValue();
                   uoc.a = f.e().b().a();
                   uof1.b = uoc;
                   uof1.c = (int)tf;
                   oi1.a = 11;
                   oi1.b = uof1;
                   packetData = f.d(uob.a).sendSync("Group.Setting", MessageNano.toByteArray(oi1));
                }else {
                   throw new Exception("userId is empty");
                }
             }else {
                throw new Exception("groupId is empty");
             }
          }catch(java.lang.Exception e1){
             packetData = uob.g(e1);
          }
          uob = a.h(packetData, a$j1.class);
       }
       return uob;
    }
}
