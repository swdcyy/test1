package ap6.g2;
import java.util.concurrent.Callable;
import com.kwai.imsdk.group.b;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import dp6.b;
import java.util.Objects;
import hp6.b;
import lh0.a$q;
import java.util.ArrayList;
import java.util.Iterator;
import rh0.a$c;
import java.lang.Long;
import com.kwai.chat.sdk.signal.f;
import com.kwai.chat.sdk.signal.IMClientAppInfo;
import com.kwai.chat.kwailink.data.ClientAppInfo;
import java.lang.CharSequence;
import ca7.u;
import qo6.a;
import com.kwai.chat.sdk.signal.KwaiSignalDispatcher;
import com.google.protobuf.nano.MessageNano;
import com.kwai.chat.kwailink.data.PacketData;
import java.lang.Exception;
import lh0.a$r;
import java.lang.Class;

public final class g2 implements Callable	// class@000333
{
    public final b b;
    public final String c;
    public final List d;
    public final String e;
    public final boolean f;

    public void g2(b p0,String p1,List p2,String p3,boolean p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final Object call(){
       PacketData packetData;
       g2 tc = this.c;
       g2 td = this.d;
       g2 te = this.e;
       g2 tf = this.f;
       b uob = b.i(this.b.b);
       Objects.requireNonNull(uob);
       if (td == null) {
          uob = new b(1004);
          uob.e("user id is empty");
       }else {
          try{
             a$q oq = new a$q();
             oq.a = tc;
             oq.d = tf;
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = td.iterator();
             while (iterator.hasNext()) {
                a$c uoc = new a$c();
                uoc.b = Long.valueOf(iterator.next()).longValue();
                uoc.a = f.e().b().a();
                uArrayList.add(uoc);
             }
             a$c[] uocArray = new a$c[0];
             oq.b = uArrayList.toArray(uocArray);
             if (!u.c(te)) {
                oq.c = te;
             }
             packetData = f.d(uob.a).sendSync("Group.Invite", MessageNano.toByteArray(oq), 0x2710);
          }catch(java.lang.Exception e1){
             packetData = uob.g(e1);
          }
          uob = a.h(packetData, a$r.class);
       }
       return uob;
    }
}
