package dx0.d;
import java.lang.Runnable;
import dx0.f;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvStreamMessage;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveActiveSpeakersMessage;
import java.lang.String;

public final class d implements Runnable	// class@002052
{
    public final f b;
    public final LiveFlvStream$LiveFlvStreamMessage c;

    public void d(f p0,LiveFlvStream$LiveFlvStreamMessage p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       d tb = this.b;
       Objects.requireNonNull(tb);
       tb.d9(this.c.speakersInfo.activeSpeakers);
    }
}
