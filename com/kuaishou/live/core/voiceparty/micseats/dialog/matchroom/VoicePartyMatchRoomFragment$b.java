package com.kuaishou.live.core.voiceparty.micseats.dialog.matchroom.VoicePartyMatchRoomFragment$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.dialog.matchroom.VoicePartyMatchRoomFragment;
import android.view.ViewTreeObserver;

public final class VoicePartyMatchRoomFragment$b implements ViewTreeObserver$OnGlobalLayoutListener	// class@0015a9
{
    public final View b;

    public void VoicePartyMatchRoomFragment$b(View p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, VoicePartyMatchRoomFragment$b.class, "1")) {
          return;
       }
       View view = this.b.findViewById(R.id.voice_party_match_room_dialog_main_content);
       View view1 = this.b.findViewById(R.id.voice_party_match_room_dialog_match_btn);
       VoicePartyMatchRoomFragment$b tb = this.b;
       a.o(tb, "view");
       a.o(view1, "matchButton");
       a.o(view, "mainContentView");
       view.setTranslationY(((float)(tb.getHeight() - view1.getBottom()) - VoicePartyMatchRoomFragment.K));
       VoicePartyMatchRoomFragment$b tb1 = this.b;
       a.o(tb1, "view");
       tb1.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       return;
    }
}
