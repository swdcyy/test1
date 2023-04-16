package bp6.d1;
import java.util.concurrent.Callable;
import com.kwai.imsdk.internal.v;
import java.lang.Object;
import java.lang.String;
import com.kwai.imsdk.internal.client.i;
import java.util.Objects;
import android.content.Context;
import a75.a;
import j75.h;
import java.lang.Integer;
import android.util.Pair;
import rh0.c$e0;
import com.kwai.chat.kwailink.data.PacketData;
import com.google.protobuf.nano.MessageNano;
import qo6.a;
import com.kwai.chat.sdk.signal.KwaiSignalDispatcher;
import com.kwai.chat.sdk.signal.f;
import rp6.g;
import cp6.n;

public final class d1 implements Callable	// class@00050b
{
    public final v b;
    public final int c;

    public void d1(v p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object call(){
       int i;
       Pair pair;
       d1 tc = this.c;
       i oi = i.t(this.b.a);
       Objects.requireNonNull(oi);
       i = -1;
       Integer integer = Integer.valueOf(i);
       if (!h.a(a.a())) {
          pair = new Pair(integer, "NO NETWORK");
       }else if(tc < null && tc != i){
          pair = new Pair(Integer.valueOf(-113), "category 需要大于等于0 或等于Category.ALL");
       }else {
          c$e0 uoe0 = new c$e0();
          uoe0.a = tc;
          PacketData packetData = new PacketData();
          packetData.t("Message.ReadAll");
          packetData.w(MessageNano.toByteArray(uoe0));
          String str = packetData.a();
          PacketData packetData1 = f.d(oi.a).sendSync(str, packetData.b());
          if (packetData1 != null) {
             if (!packetData1.c()) {
                g og = g.d(oi.a);
                _monitor_enter(og);
                n.i(og.b).u(tc);
                _monitor_exit(og);
             }
             pair = new Pair(Integer.valueOf(packetData1.c()), packetData1.e());
          }else {
             pair = new Pair(integer, "");
          }
       }
       return pair;
    }
}
