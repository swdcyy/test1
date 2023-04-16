package ap6.c2;
import java.util.concurrent.Callable;
import com.kwai.imsdk.group.b;
import java.lang.String;
import java.lang.Object;
import dp6.b;
import java.util.Objects;
import java.lang.CharSequence;
import android.text.TextUtils;
import lh0.a$i1;
import lh0.a$z0;
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
import hp6.b;

public final class c2 implements Callable	// class@00031f
{
    public final b b;
    public final String c;
    public final String d;

    public void c2(b p0,String p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object call(){
       PacketData packetData;
       c2 tc = this.c;
       c2 td = this.d;
       b uob = b.i(this.b.b);
       Objects.requireNonNull(uob);
       if (TextUtils.isEmpty(tc) || TextUtils.isEmpty(td)) {
          uob = new b(1004);
          uob.e("group id or targetUid is empty");
       }else {
          try{
             a$i1 oi1 = new a$i1();
             oi1.c = tc;
             a$z0 oz0 = new a$z0();
             a$c uoc = new a$c();
             uoc.b = Long.valueOf(td).longValue();
             uoc.a = f.e().b().a();
             oz0.a = uoc;
             oi1.a = 7;
             oi1.b = oz0;
             packetData = f.d(uob.a).sendSync("Group.Setting", MessageNano.toByteArray(oi1));
          }catch(java.lang.Exception e1){
             packetData = packetData.g(e1);
          }
          uob = a.h(packetData, a$j1.class);
       }
       return uob;
    }
}
