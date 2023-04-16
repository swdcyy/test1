package az0.g;
import java.lang.Runnable;
import com.kuaishou.live.audience.component.gift.gift.b;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvStreamMessage;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFaceTransDataMessage;
import ag1.e;

public final class g implements Runnable	// class@0002d5
{
    public final b b;
    public final LiveFlvStream$LiveFlvStreamMessage c;

    public void g(b p0,LiveFlvStream$LiveFlvStreamMessage p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       g tb = this.b;
       Objects.requireNonNull(tb);
       LiveFlvStream$LiveFlvStreamMessage liveFlvStrea = this.c.facePointInfo;
       if (PatchProxy.applyVoidOneRefs(liveFlvStrea, tb, b.class, "9")) {
       }else {
          tb.X.c(liveFlvStrea, liveFlvStrea.isMirror);
       }
       return;
    }
}
