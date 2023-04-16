package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatEmojiController$onCreate$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatEmojiController;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.EmojiViewController;
import ts2.f;
import tu2.c;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import zu2.e;
import co2.f2;
import qu2.a;

public final class MicSeatEmojiController$onCreate$1 extends Lambda implements l	// class@00167a
{
    public final MicSeatEmojiController this$0;

    public void MicSeatEmojiController$onCreate$1(MicSeatEmojiController p0){
       this.this$0 = p0;
       super(1);
    }
    public final ViewController invoke(LiveData p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MicSeatEmojiController$onCreate$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       MicSeatEmojiController$onCreate$1 tthis$0 = this.this$0;
       EmojiViewController uEmojiViewCo = new EmojiViewController(tthis$0.k, tthis$0.p, tthis$0.n, p0, tthis$0.o, tthis$0.q, tthis$0.r);
       return obj;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
