package com.kuaishou.live.core.voiceparty.micseats.dialog.e;
import com.kuaishou.live.core.voiceparty.emoji.VoicePartySelectEmojiFragment$c;
import com.kuaishou.live.core.voiceparty.micseats.dialog.LiveVoicePartyActionPanelFragment$b;
import com.kuaishou.live.core.voiceparty.emoji.model.VoicePartyEmojiListResponse$VoicePartyEmoji;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.emoji.play.VoicePartyEmojiPlayInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.micseats.dialog.LiveVoicePartyActionPanelFragment;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import com.kuaishou.live.core.voiceparty.micseats.dialog.LiveVoicePartyActionPanelFragment$d;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.live.core.voiceparty.d0;
import java.lang.Long;
import java.lang.Integer;
import com.kwai.library.widget.viewpager.GridViewPager;
import yx2.d;
import co2.f2;
import qu2.a;
import lnc.i3;
import java.lang.Number;
import ys2.g;
import java.lang.Runnable;
import ekd.k1;

public class e implements VoicePartySelectEmojiFragment$c	// class@0015a1
{
    public final VoicePartyEmojiListResponse$VoicePartyEmoji a;
    public final int b;
    public final LiveVoicePartyActionPanelFragment$b c;

    public void e(LiveVoicePartyActionPanelFragment$b p0,VoicePartyEmojiListResponse$VoicePartyEmoji p1,int p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(VoicePartyEmojiPlayInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       e tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(p0, tc, LiveVoicePartyActionPanelFragment$b.class, "4")) {
          p0.mTargetUID = tc.j(tc.f.E);
          p0.needPlayNow = true;
       }
       LiveVoicePartyActionPanelFragment m = this.c.f.M;
       if (m != null) {
          m.a(p0);
       }
       d0.c(this.c.f);
       LiveVoicePartyActionPanelFragment$b f = this.c.f;
       VoicePartyEmojiListResponse$VoicePartyEmoji mId = this.a.mId;
       e tb = this.b;
       Objects.requireNonNull(f);
       if (!PatchProxy.isSupport(LiveVoicePartyActionPanelFragment.class) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(mId), Integer.valueOf(tb), f, LiveVoicePartyActionPanelFragment.class, "21")) {
          int pageSize = f.v.getPageSize();
          i3 oi3 = i3.f();
          oi3.c("emoji_id", Long.valueOf(mId));
          oi3.c("tab_index", Integer.valueOf(((tb / pageSize) + 1)));
          oi3.c("index", Integer.valueOf((tb % pageSize)));
          new d("VOICE_PARTY_FACE_CLICK", f.B, f.C).a(oi3.e()).f();
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       k1.o(new g(this));
       return;
    }
}
