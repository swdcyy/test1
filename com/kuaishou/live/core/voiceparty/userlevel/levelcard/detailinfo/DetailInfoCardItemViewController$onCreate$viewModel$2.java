package com.kuaishou.live.core.voiceparty.userlevel.levelcard.detailinfo.DetailInfoCardItemViewController$onCreate$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.userlevel.levelcard.detailinfo.DetailInfoCardItemViewController;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.userlevel.levelcard.detailinfo.DetailInfoCardItemViewController$onCreate$viewModel$2$1;
import com.kuaishou.live.core.voiceparty.userlevel.levelcard.detailinfo.DetailInfoCardItemViewController$onCreate$viewModel$2$a;

public final class DetailInfoCardItemViewController$onCreate$viewModel$2 extends Lambda implements a	// class@001aaa
{
    public final DetailInfoCardItemViewController this$0;

    public void DetailInfoCardItemViewController$onCreate$viewModel$2(DetailInfoCardItemViewController p0){
       this.this$0 = p0;
       super(0);
    }
    public final ViewModelProvider$Factory invoke(){
       Object obj = PatchProxy.apply(null, this, DetailInfoCardItemViewController$onCreate$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new DetailInfoCardItemViewController$onCreate$viewModel$2$a(new DetailInfoCardItemViewController$onCreate$viewModel$2$1(this));
    }
    public Object invoke(){
       return this.invoke();
    }
}
