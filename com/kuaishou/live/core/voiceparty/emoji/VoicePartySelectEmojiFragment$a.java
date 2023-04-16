package com.kuaishou.live.core.voiceparty.emoji.VoicePartySelectEmojiFragment$a;
import xz6.b;
import com.kuaishou.live.core.voiceparty.emoji.VoicePartySelectEmojiFragment;
import xz6.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import xz6.d;
import com.kuaishou.live.core.voiceparty.emoji.model.VoicePartyEmojiListResponse$VoicePartyEmoji;
import com.kuaishou.live.core.voiceparty.emoji.VoicePartySelectEmojiFragment$b;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.view.View;
import brd.t;
import bn.a;
import java.util.concurrent.TimeUnit;
import com.kuaishou.live.core.voiceparty.emoji.a;
import erd.g;
import com.kuaishou.live.core.voiceparty.d0;
import crd.b;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import i2b.a;

public class VoicePartySelectEmojiFragment$a extends b	// class@0014d5
{
    public final VoicePartySelectEmojiFragment f;

    public void VoicePartySelectEmojiFragment$a(VoicePartySelectEmojiFragment p0){
       this.f = p0;
       super();
    }
    public void g(int p0,e p1){
       if (PatchProxy.isSupport(VoicePartySelectEmojiFragment$a.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, VoicePartySelectEmojiFragment$a.class, "2")) {
          return;
       }
       VoicePartyEmojiListResponse$VoicePartyEmoji item = this.getItem(p0);
       if (p1 instanceof VoicePartySelectEmojiFragment$b) {
          p1.f.P(item.mEmojiRes);
          a.b(p1.b).throttleFirst(350, TimeUnit.MILLISECONDS).subscribe(new a(this, item), d0.s("VoicePartySelectEmojiFragment", "onBindViewHolder"));
       }
       return;
    }
    public e h(int p0,ViewGroup p1){
       if (PatchProxy.isSupport(VoicePartySelectEmojiFragment$a.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, VoicePartySelectEmojiFragment$a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new VoicePartySelectEmojiFragment$b(a.c(p1.getContext(), 0x7f0d0e75, null));
    }
}
