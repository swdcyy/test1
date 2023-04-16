package com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$g;
import com.google.android.material.tabs.TabLayout$d;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment;
import java.lang.Object;
import com.google.android.material.tabs.TabLayout$f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import kotlin.jvm.internal.a;
import android.text.SpannableString;

public final class VoicePartyTheaterTubeListTabFragment$g implements TabLayout$d	// class@001a20
{
    public final VoicePartyTheaterTubeListTabFragment b;

    public void VoicePartyTheaterTubeListTabFragment$g(VoicePartyTheaterTubeListTabFragment p0){
       this.b = p0;
       super();
    }
    public void H7(TabLayout$f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTheaterTubeListTabFragment$g.class, "2")) {
          return;
       }
       if (p0 != null) {
          CharSequence uCharSequenc = p0.e();
          if (uCharSequenc != null) {
             a.o(uCharSequenc, "it");
             p0.o(this.b.th(uCharSequenc, 0));
          }
       }
       return;
    }
    public void sf(TabLayout$f p0){
    }
    public void ua(TabLayout$f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTheaterTubeListTabFragment$g.class, "1")) {
          return;
       }
       if (p0 != null) {
          CharSequence uCharSequenc = p0.e();
          if (uCharSequenc != null) {
             a.o(uCharSequenc, "it");
             p0.o(this.b.th(uCharSequenc, 1));
          }
       }
       return;
    }
}
