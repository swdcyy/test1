package bp6.o1;
import java.util.concurrent.Callable;
import com.kwai.imsdk.internal.v;
import java.lang.String;
import java.lang.Object;
import xp6.b;
import java.util.List;
import dp6.a;
import java.util.Objects;
import java.lang.CharSequence;
import android.text.TextUtils;
import hp6.b;
import hh0.a$e;
import qo6.a;
import com.kwai.chat.sdk.signal.KwaiSignalDispatcher;
import com.kwai.chat.sdk.signal.f;
import com.google.protobuf.nano.MessageNano;
import com.kwai.chat.kwailink.data.PacketData;
import hh0.a$f;
import java.lang.Class;
import java.lang.StringBuilder;
import l85.b;
import java.util.ArrayList;
import com.kwai.imsdk.c;

public final class o1 implements Callable	// class@000540
{
    public final v b;
    public final boolean c;
    public final String d;
    public final boolean e;

    public void o1(v p0,boolean p1,String p2,boolean p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final Object call(){
       b uob;
       o1 tb = this.b;
       o1 td = this.d;
       o1 te = this.e;
       if (this.c != null) {
          b.a(tb.a).c.add(td);
          tb.O();
       }else {
          tb.N(td);
       }
       a uoa = a.i(tb.a);
       Objects.requireNonNull(uoa);
       if (TextUtils.isEmpty(td)) {
          uob = new b(1004);
          uob.e("channel id is empty");
       }else {
          a$e uoe = new a$e();
          uoe.a = td;
          uoe.b = te;
          uob = a.h(f.d(uoa.a).sendSync("Channel.Subscribe", MessageNano.toByteArray(uoe)), a$f.class);
       }
       if (!uob.c()) {
          b uob1 = b.a(tb.a);
          Objects.requireNonNull(uob1);
          if (!TextUtils.isEmpty(td)) {
             b.b("ChannelUtils", "appendChannelId : "+td);
             List list = b.a(uob1.b).b();
             List list1 = list;
             if (!list1.contains(td)) {
                list1.add(td);
                uob1.e(list);
             }
          }
          c.b().c();
       }
       return uob;
    }
}
