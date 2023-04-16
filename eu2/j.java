package eu2.j;
import java.lang.Runnable;
import com.kuaishou.live.core.voiceparty.pendant.VoicePartyTopicPendantView;
import java.lang.Object;
import android.widget.TextView;

public final class j implements Runnable	// class@0027f7
{
    public final VoicePartyTopicPendantView b;

    public void j(VoicePartyTopicPendantView p0){
       this.b = p0;
    }
    public final void run(){
       this.b.e.requestLayout();
    }
}
