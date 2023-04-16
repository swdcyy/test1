package cz0.a;
import cz0.b;
import bz0.e;
import java.lang.String;
import t02.a0;
import lp3.e;
import p91.m;
import km1.b;
import java.util.List;
import com.kuaishou.android.live.log.b;
import om1.a;
import java.lang.Class;
import lp3.c;
import com.kuaishou.live.common.core.component.trace.gift.bean.LiveSendGiftTraceInfo;
import mm1.c;
import mm1.e;
import mm1.g;

public final class a	// class@001ec1
{

    public static void a(b p0,e p1,String p2,String p3,int p4){
       a0 z2 = p1.b.Z2;
       e uoe = (z2 != null)? z2.t5(): null;
       if (uoe == null) {
          b.P(b.a, "[ILiveHttpSendGiftChainNodeInterceptor][logTraceInfo]liveServiceManager is null");
          return;
       }else if(uoe.b()){
          b.P(b.a, "[ILiveHttpSendGiftChainNodeInterceptor][logTraceInfo]service manager cleared");
          return;
       }else {
          a uoa = uoe.a(a.class);
          LiveSendGiftTraceInfo liveSendGift = p1.c();
          if (liveSendGift == null) {
             b.P(b.a, "[ILiveHttpSendGiftChainNodeInterceptor][logTraceInfo]context is null");
             return;
          }else {
             uoa.yk(liveSendGift).d(p2).f("SENDING_GIFT").g(p4).e(p3).a();
             return;
          }
       }
    }
    public static b b(b p0,int p1){
       return null;
    }
}
