package com.kuaishou.live.core.voiceparty.userlevel.decoration.DecorationViewController$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import androidx.lifecycle.LiveData;
import sx2.f;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.userlevel.decoration.DecorationViewController$viewModel$2$1;
import com.kuaishou.live.core.voiceparty.userlevel.decoration.DecorationViewController$viewModel$2$a;

public final class DecorationViewController$viewModel$2 extends Lambda implements a	// class@001a81
{
    public final LiveData $dataProvider;
    public final f $decorationService;

    public void DecorationViewController$viewModel$2(LiveData p0,f p1){
       this.$dataProvider = p0;
       this.$decorationService = p1;
       super(0);
    }
    public final ViewModelProvider$Factory invoke(){
       Object obj = PatchProxy.apply(null, this, DecorationViewController$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new DecorationViewController$viewModel$2$a(new DecorationViewController$viewModel$2$1(this));
    }
    public Object invoke(){
       return this.invoke();
    }
}
