package ox0.u;
import java.lang.Runnable;
import ox0.x;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvStreamMessage;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveActiveSpeakersMessage;
import java.lang.String;

public final class u implements Runnable	// class@0035d0
{
    public final x b;
    public final LiveFlvStream$LiveFlvStreamMessage c;

    public void u(x p0,LiveFlvStream$LiveFlvStreamMessage p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       u tb = this.b;
       Objects.requireNonNull(tb);
       tb.D7(this.c.speakersInfo.activeSpeakers);
    }
}
