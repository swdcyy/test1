package dw2.j$a;
import lf3.g;
import dw2.j;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCTheaterEpisodeSwitchToast;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import op2.e;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager;
import dw2.i$e;
import dw2.i;
import lf3.f;

public final class j$a implements g	// class@0025bc
{
    public final j b;

    public void j$a(j p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$a.class, "1")) {
       }else {
          SCTheaterEpisodeSwitchToast currentPlayi = p0.currentPlayingOrderId;
          a.o(currentPlayi, "it.currentPlayingOrderId");
          j$a uoa = (currentPlayi.length() > 0)? 1: null;
          if (uoa && a.g(this.b.f.e().k0(), p0.theaterId)) {
             SCTheaterEpisodeSwitchToast toastMessage = p0.toastMessage;
             a.o(toastMessage, "it.toastMessage");
             this.b.w0(new i$e(toastMessage));
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
