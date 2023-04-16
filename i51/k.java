package i51.k;
import lf3.g;
import i51.o;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCFeedPush;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mf3.a;
import hf3.a;
import com.kuaishou.live.longconnection.connector.l$c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;
import i51.p;
import java.lang.Long;
import i51.g;
import k2b.u1;
import lf3.f;

public final class k implements g	// class@00282c
{
    public final o b;

    public void k(o p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       k tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, o.class, "4")) {
       }else {
          a uoa = tb.a.A0();
          a d = uoa.d;
          if (tb.d != null && d != null) {
             o b = tb.b;
             String str = d.a();
             String str1 = String.valueOf(d.b());
             String str2 = d.c();
             Object[] obj = PatchProxy.apply(null, uoa, a.class, "3");
             long l = (obj != PatchProxyResult.class)? obj.longValue(): Math.max((uoa.b - uoa.a), 0);
             p op = p.class;
             if (PatchProxy.isSupport(op)) {
                obj = new Object[]{b,str,str1,str2,Long.valueOf(l)};
                if (PatchProxy.applyVoid(obj, null, op, "8")) {
                label_0086 :
                   tb.d = false;
                }
             }
             u1.R("LIVE_RECEIVE_FEED", p.a(b, null, str, str1, str2, l, 7, 17), 3);
             goto label_0086 ;
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
