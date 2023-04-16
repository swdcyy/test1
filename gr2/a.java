package gr2.a;
import java.lang.Runnable;
import com.kuaishou.live.core.voiceparty.crossroompk.result.LiveVoicePartyCrossRoomTeamPkResultsDialogFragment;
import java.lang.Object;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;

public final class a implements Runnable	// class@002b8a
{
    public final LiveVoicePartyCrossRoomTeamPkResultsDialogFragment b;

    public void a(LiveVoicePartyCrossRoomTeamPkResultsDialogFragment p0){
       this.b = p0;
    }
    public final void run(){
       this.b.dismissAllowingStateLoss();
    }
}
