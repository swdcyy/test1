package ap6.i2;
import java.util.concurrent.Callable;
import com.kwai.imsdk.group.b;
import java.lang.String;
import java.lang.Object;
import dp6.b;
import java.util.Objects;
import java.lang.CharSequence;
import android.text.TextUtils;
import hp6.b;
import lh0.a$i1;
import lh0.a$g1;
import qo6.a;
import com.kwai.chat.sdk.signal.KwaiSignalDispatcher;
import com.kwai.chat.sdk.signal.f;
import com.google.protobuf.nano.MessageNano;
import com.kwai.chat.kwailink.data.PacketData;
import java.lang.Exception;
import lh0.a$j1;
import java.lang.Class;

public final class i2 implements Callable	// class@00033d
{
    public final b b;
    public final String c;
    public final boolean d;

    public void i2(b p0,String p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object call(){
       PacketData packetData;
       i2 tc = this.c;
       i2 td = this.d;
       b uob = b.i(this.b.b);
       Objects.requireNonNull(uob);
       if (TextUtils.isEmpty(tc)) {
          uob = new b(1004);
          uob.e("group id is empty");
       }else {
          try{
             a$i1 oi1 = new a$i1();
             oi1.c = tc;
             a$g1 og1 = new a$g1();
             og1.a = td;
             oi1.a = 9;
             oi1.b = og1;
             packetData = f.d(uob.a).sendSync("Group.Setting", MessageNano.toByteArray(oi1));
          }catch(java.lang.Exception e1){
             packetData = packetData.g(e1);
          }
          uob = a.h(packetData, a$j1.class);
       }
       return uob;
    }
}
