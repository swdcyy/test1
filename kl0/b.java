package kl0.b;
import lf3.g;
import com.kuaishou.lite.viewcontrollers.LiveLiteConversionTaskController;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveExtraMessages$SCLiveCommonStateSignal;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.livestream.message.nano.LiveExtraMessages$LiveCommonAbstractSignal;
import cm0.e;
import com.kuaishou.livestream.message.nano.LiveAdSocialMessages$LiveAdSocialConversionState;
import com.kuaishou.live.ad.social.r;
import com.kuaishou.lite.viewcontrollers.LiveLiteConversionTaskController$registerSignal$1$1;
import kl0.c;
import msd.l;
import com.kuaishou.livestream.message.nano.LiveAdSocialMessages$LiveAdSocialConversionTask;
import z1.a;
import km9.a;
import lf3.f;

public final class b implements g	// class@002d63
{
    public final LiveLiteConversionTaskController b;

    public void b(LiveLiteConversionTaskController p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          a.p(p0, "msg");
          LiveExtraMessages$SCLiveCommonStateSignal state = p0.state;
          if (state != null) {
             String str = "COMMERCE_LiveAdSocialConversionState";
             if (a.g(str, state.payloadType)) {
                p0 = e.b(str, p0.state);
                a.o(p0, "LiveAdCommerceSignalPars¡­    msg.state\n          \)");
                this.b.V2().i.um(p0.conversionTask, false, true, new c(new LiveLiteConversionTaskController$registerSignal$1$1(this.b)));
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
