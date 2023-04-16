package bl3.a;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$a;
import bl3.i;
import java.lang.Object;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$LiveAutoPlayerState;
import java.util.Objects;
import com.yxcorp.gifshow.autoplay.live.g;
import com.yxcorp.gifshow.autoplay.live.LiveStopReason;

public final class a implements LiveAutoPlay$a	// class@0003e5
{
    public final i a;

    public void a(i p0){
       this.a = p0;
    }
    public final void a(LiveAutoPlay$LiveAutoPlayerState p0){
       a ta = this.a;
       Objects.requireNonNull(ta);
       if (p0 == LiveAutoPlay$LiveAutoPlayerState.PLAYING && (!ta.X8() && ta.E.isPlaying())) {
          ta.E.g0(LiveStopReason.SLIDE_AWAY);
       }
    label_001e :
       return;
    }
}
