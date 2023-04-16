package ex2.b;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.voiceparty.theater.tube.detail.VoicePartyTheaterTubeDetailFragment;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.theater.tube.detail.VoicePartyTheaterTubeDetailFragment$d;

public final class b implements View$OnClickListener	// class@00280b
{
    public final VoicePartyTheaterTubeDetailFragment b;

    public void b(VoicePartyTheaterTubeDetailFragment p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, VoicePartyTheaterTubeDetailFragment.class, "9")) {
       }else {
          tb.J.b();
       }
       return;
    }
}
