package com.kuaishou.live.core.voiceparty.emoji.a;
import erd.g;
import com.kuaishou.live.core.voiceparty.emoji.VoicePartySelectEmojiFragment$a;
import com.kuaishou.live.core.voiceparty.emoji.model.VoicePartyEmojiListResponse$VoicePartyEmoji;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.emoji.VoicePartySelectEmojiFragment;
import ur2.i;
import com.kuaishou.live.core.voiceparty.emoji.VoicePartySelectEmojiFragment$c;
import java.lang.Integer;
import java.lang.String;
import ur2.a;

public final class a implements g	// class@0014d9
{
    public final VoicePartySelectEmojiFragment$a b;
    public final VoicePartyEmojiListResponse$VoicePartyEmoji c;

    public void a(VoicePartySelectEmojiFragment$a p0,VoicePartyEmojiListResponse$VoicePartyEmoji p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       p0 = this.b;
       p0.f.z.c(this.c.mId, new i(p0), null, null, null);
    }
}
