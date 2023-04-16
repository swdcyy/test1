package com.kuaishou.live.core.voiceparty.micseats.pendant.AboardAnimationViewController$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import it2.a;
import androidx.lifecycle.LiveData;
import it2.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AboardAnimationViewController$viewModel$2 extends Lambda implements a	// class@0015bf
{
    public final a $logic;
    public final LiveData $micSeatId;

    public void AboardAnimationViewController$viewModel$2(a p0,LiveData p1){
       this.$logic = p0;
       this.$micSeatId = p1;
       super(0);
    }
    public final c invoke(){
       Object obj = PatchProxy.apply(null, this, AboardAnimationViewController$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c(this.$logic, this.$micSeatId);
    }
    public Object invoke(){
       return this.invoke();
    }
}
