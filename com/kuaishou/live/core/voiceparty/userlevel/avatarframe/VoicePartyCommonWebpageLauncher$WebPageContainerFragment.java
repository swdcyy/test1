package com.kuaishou.live.core.voiceparty.userlevel.avatarframe.VoicePartyCommonWebpageLauncher$WebPageContainerFragment;
import com.yxcorp.gifshow.fragment.DialogContainerFragment;
import androidx.fragment.app.KwaiDialogFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import android.view.View;
import android.os.Bundle;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import java.lang.CharSequence;

public final class VoicePartyCommonWebpageLauncher$WebPageContainerFragment extends DialogContainerFragment	// class@001a76
{
    public String H;
    public HashMap I;

    public void VoicePartyCommonWebpageLauncher$WebPageContainerFragment(){
       super();
       this.H = "";
       this.Mh(0.30f);
    }
    public int getLayoutResId(){
       return 0x7f0d16a5;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, VoicePartyCommonWebpageLauncher$WebPageContainerFragment.class, "4")) {
       }else {
          VoicePartyCommonWebpageLauncher$WebPageContainerFragment tI = this.I;
          if (tI != null) {
             tI.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyCommonWebpageLauncher$WebPageContainerFragment.class, "2")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       TextView textView = p0.findViewById(R.id.title_view);
       a.o(textView, "titleView");
       textView.setText(this.H);
       return;
    }
}
