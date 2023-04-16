package gs2.k;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class k implements Runnable	// class@002b9b
{
    public static final k b;

    static {
       k.b = new k();
    }
    public void k(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       i.d(R.style.arg_RES_7f110668, a1.p(R.string.arg_RES_7f102e4c));
       b.P(LiveVoicePartyLogTag.KTV.appendTag("VoicePartyKtvAudienceOrderGuideController"), "order success");
       return;
    }
}
