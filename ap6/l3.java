package ap6.l3;
import java.util.concurrent.Callable;
import com.kwai.imsdk.group.g;
import java.util.List;
import java.lang.String;
import java.lang.Object;
import dp6.b;
import java.util.Objects;
import java.util.ArrayList;
import bq6.y2;
import java.util.HashSet;
import java.util.Collection;
import lh0.a$c;
import java.util.Iterator;
import java.lang.CharSequence;
import ca7.u;
import rh0.a$c;
import java.lang.Long;
import com.kwai.chat.sdk.signal.f;
import com.kwai.chat.sdk.signal.IMClientAppInfo;
import com.kwai.chat.kwailink.data.ClientAppInfo;
import java.lang.Throwable;
import l85.b;
import com.kwai.imsdk.internal.util.b;
import qo6.a;
import com.kwai.chat.sdk.signal.KwaiSignalDispatcher;
import com.google.protobuf.nano.MessageNano;
import com.kwai.chat.kwailink.data.PacketData;
import java.lang.Exception;
import lh0.a$d;
import java.lang.Class;
import hp6.b;

public final class l3 implements Callable	// class@00034d
{
    public final g b;
    public final List c;
    public final String d;

    public void l3(g p0,List p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object call(){
       PacketData packetData;
       l3 tc = this.c;
       l3 td = this.d;
       b uob = b.i(this.b.c);
       Objects.requireNonNull(uob);
       ArrayList uArrayList = new ArrayList();
       if (tc != null) {
          HashSet hashSet = new HashSet(tc);
          hashSet.remove(y2.c());
          uArrayList = new ArrayList(hashSet);
       }
       try{
          a$c uoc = new a$c();
          ArrayList uArrayList1 = new ArrayList();
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             if (u.c(str)) {
                continue ;
             }
             a$c uoc1 = new a$c();
             uoc1.b = Long.parseLong(str);
             uoc1.a = f.e().b().a();
             uArrayList1.add(uoc1);
          }
          a$c[] uocArray = new a$c[b.g(uArrayList1)];
          uoc.a = uArrayList1.toArray(uocArray);
          if (!u.c(td)) {
             uoc.h = td;
          }
          packetData = f.d(uob.a).sendSync("Group.Create", MessageNano.toByteArray(uoc), 0x2710);
       }catch(java.lang.Exception e1){
          packetData = uob.g(e1);
       }
       return a.h(packetData, a$d.class);
    }
}
