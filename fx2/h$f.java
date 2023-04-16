package fx2.h$f;
import android.view.View$OnClickListener;
import fx2.h;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeFeedWithEpisodes;
import com.yxcorp.gifshow.tube.TubeInfo;
import java.lang.CharSequence;
import dx2.a;
import com.kwai.framework.model.user.User;
import com.kuaishou.live.core.voiceparty.theater.tube.list.a$a;

public final class h$f implements View$OnClickListener	// class@002a08
{
    public final h b;

    public void h$f(h p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       TubeInfo mUser;
       if (PatchProxy.applyVoidOneRefs(p0, this, h$f.class, "1")) {
          return;
       }
       h$f tb = this.b;
       h z = tb.z;
       h q = tb.q;
       if (q != null) {
          VoicePartyTheaterTubeFeedWithEpisodes mTube = q.mTube;
          if (mTube != null) {
             mUser = mTube.mUser;
          label_001c :
             z.e(mUser, h.c9(tb, null, 1, null));
             return;
          }
       }
       mUser = null;
       goto label_001c ;
    }
}
