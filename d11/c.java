package d11.c;
import erd.g;
import d11.e;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.String;
import z12.e;
import t02.a0;
import com.kwai.video.waynelive.LivePlayerController;

public final class c implements g	// class@001ef2
{
    public final e b;

    public void c(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       String[] stringArray = new String[0];
       e.c("LiveAudienceHeadsetPresenter", "head set plug monitor: "+p0, stringArray);
       if (p0.booleanValue()) {
          tb.q.E.mute();
       }else {
          tb.q.E.unMute();
       }
       return;
    }
}
