package dx2.f;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment$c;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterAudiencePanelController;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTubeContainerFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import dx2.p;
import qu2.a;
import co2.f2;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterPanelFragment;
import android.os.Bundle;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterAudiencePanelController$a;
import dx2.h;
import kotlin.jvm.internal.a;

public final class f implements LiveDialogContainerFragment$c	// class@0025d0
{
    public final VoicePartyTheaterAudiencePanelController a;
    public final VoicePartyTubeContainerFragment b;

    public void f(VoicePartyTheaterAudiencePanelController p0,VoicePartyTubeContainerFragment p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(){
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, f.class, str)) {
          return;
       }
       f ta = this.a;
       p.c(this.b).h(ta.o, ta.p);
       e uoe = this.b.getChildFragmentManager().beginTransaction();
       f ta1 = this.a;
       Objects.requireNonNull(ta1);
       String obj = PatchProxy.apply(objArray, ta1, VoicePartyTheaterAudiencePanelController.class, "7");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = "playListTab";
          Bundle obj1 = PatchProxy.applyOneRefs(obj, objArray, VoicePartyTheaterPanelFragment.class, str);
          if (obj1 != PatchProxyResult.class) {
             obj = obj1;
          }else {
             obj1 = new Bundle();
             obj1.putString(VoicePartyTheaterPanelFragment.E, obj);
             VoicePartyTheaterPanelFragment voicePartyTh = new VoicePartyTheaterPanelFragment();
             voicePartyTh.setArguments(obj1);
             obj = voicePartyTh;
          }
          obj.Th(new VoicePartyTheaterAudiencePanelController$a(ta1));
          a.o(obj, "VoicePartyTheaterPanelFr¡­terPanelCallback\(\)\)\n    }");
       }
       uoe.f(R.id.live_bottom_dialog_container_root, obj);
       uoe.m();
       return;
    }
}
