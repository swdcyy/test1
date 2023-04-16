package ex2.a;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.voiceparty.theater.tube.detail.VoicePartyTheaterTubeDetailFragment;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;

public final class a implements View$OnClickListener	// class@00280a
{
    public final VoicePartyTheaterTubeDetailFragment b;

    public void a(VoicePartyTheaterTubeDetailFragment p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, VoicePartyTheaterTubeDetailFragment.class, "8")) {
       }else if(tb.getFragmentManager() == null){
          tb.getFragmentManager().popBackStack();
       }
       return;
    }
}
