package com.kuaishou.live.core.voiceparty.userlevel.avatarframe.VoicePartyCommonWebpageLauncher;
import com.kuaishou.live.core.voiceparty.userlevel.avatarframe.VoicePartyCommonWebpageLauncher$a;
import nsd.u;
import android.app.Activity;
import lp3.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import rp5.a;
import lp3.c;
import androidx.fragment.app.c;
import com.kuaishou.live.core.voiceparty.userlevel.avatarframe.VoicePartyCommonWebpageLauncher$WebPageContainerFragment;
import com.kuaishou.live.core.voiceparty.userlevel.avatarframe.VoicePartyCommonWebpageLauncher$b;
import com.yxcorp.gifshow.fragment.DialogContainerFragment$b;
import com.yxcorp.gifshow.fragment.DialogContainerFragment;
import com.yxcorp.utility.n;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.fragment.ContainerFragment;

public final class VoicePartyCommonWebpageLauncher	// class@001a79
{
    public final Activity a;
    public final e b;
    public static final VoicePartyCommonWebpageLauncher$a c;

    static {
       VoicePartyCommonWebpageLauncher.c = new VoicePartyCommonWebpageLauncher$a(null);
    }
    public void VoicePartyCommonWebpageLauncher(Activity p0,e p1){
       a.p(p0, "activity");
       a.p(p1, "liveServiceManager");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(String p0,String p1,int p2){
       if (PatchProxy.isSupport(VoicePartyCommonWebpageLauncher.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, VoicePartyCommonWebpageLauncher.class, "1")) {
          return;
       }
       a.p(p0, "title");
       a.p(p1, "url");
       c childFragmen = this.b.a(a.class).getChildFragmentManager();
       VoicePartyCommonWebpageLauncher$WebPageContainerFragment webPageConta = new VoicePartyCommonWebpageLauncher$WebPageContainerFragment();
       if (!PatchProxy.applyVoidOneRefs(p0, webPageConta, VoicePartyCommonWebpageLauncher$WebPageContainerFragment.class, "1")) {
          a.p(p0, "<set-?>");
          webPageConta.H = p0;
       }
       webPageConta.Lh(new VoicePartyCommonWebpageLauncher$b(this, p1, webPageConta));
       if (p2 <= 0) {
          p2 = n.j(this.a) / 2;
       }
       webPageConta.Kh(p2);
       webPageConta.nh(true);
       webPageConta.vh(false);
       webPageConta.Cb(childFragmen, "VoicePartyCommonWebPageLauncher");
       return;
    }
}
