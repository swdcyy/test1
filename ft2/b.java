package ft2.b;
import ekd.x;
import com.kuaishou.live.core.voiceparty.micseats.invitation.AudienceBeingInvitedBottomPanel;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kuaishou.live.core.voiceparty.micseats.invitation.VoicePartyAudienceInvitationDialog$b;
import ekd.b;
import java.util.concurrent.TimeUnit;
import java.lang.StringBuilder;

public final class b extends x	// class@0029c4
{
    public final AudienceBeingInvitedBottomPanel a;
    public final String b;

    public void b(AudienceBeingInvitedBottomPanel p0,String p1,long p2){
       this.a = p0;
       this.b = p1;
       super(p2);
    }
    public void a(long p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uob, "1")) {
          return;
       }
       uob = this.a;
       if ((uob.D - p0) < 0) {
          uob.wh().setText(this.b);
          this.a.F.a();
          this.stop();
       }
       this.a.wh().setText(this.b+" \("+(TimeUnit.MILLISECONDS.toSeconds((this.a.D - p0)) + 1)+"s\)");
       return;
    }
}
