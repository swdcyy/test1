package com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTubeContainerFragment;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment;
import androidx.fragment.app.KwaiDialogFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;

public final class VoicePartyTubeContainerFragment extends LiveDialogContainerFragment	// class@0019fb
{
    public HashMap A;

    public void VoicePartyTubeContainerFragment(){
       super();
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, VoicePartyTubeContainerFragment.class, "2")) {
       }else {
          VoicePartyTubeContainerFragment tA = this.A;
          if (tA != null) {
             tA.clear();
          }
       }
       return;
    }
}
