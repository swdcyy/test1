package ap6.f3;
import java.util.concurrent.Callable;
import com.kwai.imsdk.group.g;
import java.lang.String;
import com.kwai.imsdk.internal.db.GroupLocation;
import java.lang.Object;
import dp6.b;
import java.util.Objects;
import java.lang.CharSequence;
import ca7.u;
import com.kwai.chat.kwailink.data.PacketData;
import lh0.a$i1;
import lh0.a$a1;
import java.util.ArrayList;
import java.lang.Integer;
import lh0.a$r1;
import xp6.i;
import qo6.a;
import com.kwai.chat.sdk.signal.KwaiSignalDispatcher;
import com.kwai.chat.sdk.signal.f;
import com.google.protobuf.nano.MessageNano;
import java.lang.Exception;
import lh0.a$j1;
import java.lang.Class;
import hp6.b;

public final class f3 implements Callable	// class@00032f
{
    public final g b;
    public final String c;
    public final String d;
    public final String e;
    public final GroupLocation f;
    public final String g;
    public final String h;

    public void f3(g p0,String p1,String p2,String p3,GroupLocation p4,String p5,String p6){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
    }
    public final Object call(){
       PacketData packetData;
       int i;
       f3 tc = this.c;
       f3 td = this.d;
       f3 te = this.e;
       f3 tf = this.f;
       f3 tg = this.g;
       f3 th = this.h;
       b uob = b.i(this.b.c);
       try{
          Objects.requireNonNull(uob);
          if (u.c(tc)) {
             packetData = new PacketData();
             packetData.x(1004);
             packetData.z("group id is empty");
          }else {
             a$i1 oi1 = new a$i1();
             oi1.c = tc;
             a$a1 uoa1 = new a$a1();
             ArrayList uArrayList = new ArrayList();
             if (td != null) {
                uArrayList.add(Integer.valueOf(1));
                uoa1.b = td;
             }
             if (te != null) {
                uArrayList.add(Integer.valueOf(2));
                uoa1.c = te;
             }
             if (tf != null) {
                uArrayList.add(Integer.valueOf(3));
                uoa1.d = i.b(tf);
             }
             if (tg != null) {
                uArrayList.add(Integer.valueOf(4));
                uoa1.e = tg;
             }
             if (th != null) {
                uArrayList.add(Integer.valueOf(5));
                uoa1.f = th;
             }
             int[] ointArray = new int[uArrayList.size()];
             uoa1.a = ointArray;
             for (i = 0; i < uArrayList.size(); i = i + 1) {
                uoa1.a[i] = uArrayList.get(i).intValue();
             }
             oi1.a = 10;
             oi1.b = uoa1;
             packetData = f.d(uob.a).sendSync("Group.Setting", MessageNano.toByteArray(oi1), 0x2710);
          }
       }catch(java.lang.Exception e1){
          packetData = uob.g(e1);
       }
       return a.h(packetData, a$j1.class);
    }
}
