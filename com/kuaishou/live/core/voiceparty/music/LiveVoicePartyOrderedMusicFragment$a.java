package com.kuaishou.live.core.voiceparty.music.LiveVoicePartyOrderedMusicFragment$a;
import ut2.l$f;
import com.kuaishou.live.core.voiceparty.music.LiveVoicePartyOrderedMusicFragment;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartyOrderedMusic;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u07.t$a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.kuaishou.live.core.voiceparty.music.c;
import u07.u;
import u07.t;
import u07.j;
import com.kuaishou.live.core.voiceparty.music.d;
import tt2.a;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.clipmusic.b;
import com.kwai.library.widget.popup.common.c$b;
import com.kuaishou.live.core.voiceparty.music.g;
import com.kwai.library.widget.popup.common.c;

public class LiveVoicePartyOrderedMusicFragment$a implements l$f	// class@0017c7
{
    public final LiveVoicePartyOrderedMusicFragment a;

    public void LiveVoicePartyOrderedMusicFragment$a(LiveVoicePartyOrderedMusicFragment p0){
       this.a = p0;
       super();
    }
    public void a(LiveVoicePartyOrderedMusic p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyOrderedMusicFragment$a.class, "1")) {
          return;
       }
       t$a uoa = new t$a(this.a.getActivity());
       uoa.W0(R.string.arg_RES_7f102559);
       uoa.S0(R.string.arg_RES_7f1007e2);
       uoa.Q0(R.string.cancel);
       uoa.u0(new c(this, p0));
       j.d(uoa);
       return;
    }
    public void b(LiveVoicePartyOrderedMusic p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyOrderedMusicFragment$a.class, "3")) {
          return;
       }
       t$a uoa = new t$a(this.a.getActivity());
       uoa.W0(R.string.arg_RES_7f102540);
       uoa.S0(R.string.arg_RES_7f1007e2);
       uoa.Q0(R.string.cancel);
       uoa.u0(new d(this, p0));
       j.d(uoa);
       return;
    }
    public void c(LiveVoicePartyOrderedMusic p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyOrderedMusicFragment$a.class, "2")) {
          return;
       }
       if (this.a.Gh() != null) {
          this.a.Gh().d9();
       }
       LiveVoicePartyOrderedMusicFragment$a ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidOneRefs(p0, ta, LiveVoicePartyOrderedMusicFragment.class, "6") || (ta.getActivity() != null && !ta.getActivity().isFinishing())) {
          b uob = new b(new c$b(ta.getActivity()));
          ta.J = uob;
          uob.r = p0;
          uob.s = new g(ta, p0);
          uob.Z();
       }
    label_0059 :
       return;
    }
}
