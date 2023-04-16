package com.kuaishou.live.core.voiceparty.micseats.pendant.EmojiViewController$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.micseats.pendant.EmojiViewController;
import androidx.lifecycle.LiveData;
import it2.r;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ts2.f;
import tu2.c;

public final class EmojiViewController$viewModel$2 extends Lambda implements a	// class@0015f2
{
    public final LiveData $micSeatId;
    public final EmojiViewController this$0;

    public void EmojiViewController$viewModel$2(EmojiViewController p0,LiveData p1){
       this.this$0 = p0;
       this.$micSeatId = p1;
       super(0);
    }
    public final r invoke(){
       Object obj = PatchProxy.apply(null, this, EmojiViewController$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       EmojiViewController$viewModel$2 tthis$0 = this.this$0;
       return new r(tthis$0.k, tthis$0.l, this.$micSeatId);
    }
    public Object invoke(){
       return this.invoke();
    }
}
