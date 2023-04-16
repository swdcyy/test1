package com.kuaishou.live.core.voiceparty.userlevel.levelcard.VoicePartyMicseatLevelSelfViewController$initView$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.userlevel.levelcard.VoicePartyMicseatLevelSelfViewController$initView$viewModel$2$1;
import com.kuaishou.live.core.voiceparty.userlevel.levelcard.VoicePartyMicseatLevelSelfViewController$initView$viewModel$2$a;

public final class VoicePartyMicseatLevelSelfViewController$initView$viewModel$2 extends Lambda implements a	// class@001aa3
{
    public static final VoicePartyMicseatLevelSelfViewController$initView$viewModel$2 INSTANCE;

    static {
       VoicePartyMicseatLevelSelfViewController$initView$viewModel$2.INSTANCE = new VoicePartyMicseatLevelSelfViewController$initView$viewModel$2();
    }
    public void VoicePartyMicseatLevelSelfViewController$initView$viewModel$2(){
       super(0);
    }
    public final ViewModelProvider$Factory invoke(){
       Object obj = PatchProxy.apply(null, this, VoicePartyMicseatLevelSelfViewController$initView$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new VoicePartyMicseatLevelSelfViewController$initView$viewModel$2$a(VoicePartyMicseatLevelSelfViewController$initView$viewModel$2$1.INSTANCE);
    }
    public Object invoke(){
       return this.invoke();
    }
}
