package av2.c;
import java.lang.Runnable;
import com.kuaishou.live.core.voiceparty.playway.shared.widget.VoicePartyHatView;
import java.lang.Object;
import android.net.Uri;
import com.yxcorp.gifshow.image.KwaiImageView;

public final class c implements Runnable	// class@0002d1
{
    public final VoicePartyHatView b;

    public void c(VoicePartyHatView p0){
       this.b = p0;
    }
    public final void run(){
       c tb = this.b;
       if (tb.E != null) {
          tb.r0();
          tb.setImageURI(tb.E);
       }
       return;
    }
}
