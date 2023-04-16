package com.kuaishou.live.core.voiceparty.userlevel.decoration.DecorationViewController$viewModel$2$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.userlevel.decoration.DecorationViewController$viewModel$2;
import java.lang.Object;
import sx2.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.LiveData;
import sx2.f;

public final class DecorationViewController$viewModel$2$1 extends Lambda implements a	// class@001a7f
{
    public final DecorationViewController$viewModel$2 this$0;

    public void DecorationViewController$viewModel$2$1(DecorationViewController$viewModel$2 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final j invoke(){
       Object obj = PatchProxy.apply(null, this, DecorationViewController$viewModel$2$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       DecorationViewController$viewModel$2$1 tthis$0 = this.this$0;
       return new j(tthis$0.$dataProvider, tthis$0.$decorationService);
    }
}
