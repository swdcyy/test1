package com.kuaishou.live.core.voiceparty.userlevel.avatarframe.VoicePartyCommonWebpageLauncher$b;
import com.yxcorp.gifshow.fragment.DialogContainerFragment$b;
import com.kuaishou.live.core.voiceparty.userlevel.avatarframe.VoicePartyCommonWebpageLauncher;
import java.lang.String;
import com.kuaishou.live.core.voiceparty.userlevel.avatarframe.VoicePartyCommonWebpageLauncher$WebPageContainerFragment;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.app.Activity;
import androidx.fragment.app.c;
import lp3.e;
import kq3.a;
import androidx.fragment.app.DialogFragment;
import com.kuaishou.live.webview.context.LiveWebViewParam;
import com.kuaishou.live.webview.a;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import kotlin.jvm.internal.a;

public final class VoicePartyCommonWebpageLauncher$b implements DialogContainerFragment$b	// class@001a78
{
    public final VoicePartyCommonWebpageLauncher a;
    public final String b;
    public final VoicePartyCommonWebpageLauncher$WebPageContainerFragment c;

    public void VoicePartyCommonWebpageLauncher$b(VoicePartyCommonWebpageLauncher p0,String p1,VoicePartyCommonWebpageLauncher$WebPageContainerFragment p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final Fragment a(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       VoicePartyCommonWebpageLauncher$b obj = PatchProxy.apply(null, this, VoicePartyCommonWebpageLauncher$b.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a;
       VoicePartyCommonWebpageLauncher$b tb = this.b;
       VoicePartyCommonWebpageLauncher$b tc = this.c;
       Objects.requireNonNull(obj);
       WebViewFragment webViewFragm = PatchProxy.applyTwoRefs(tb, tc, obj, VoicePartyCommonWebpageLauncher.class, "3");
       if (webViewFragm != patchProxyRe) {
       }else {
          a uoa = a.d(obj.a, null, obj.b);
          uoa.e(tc);
          uoa.b.setLayoutType("3");
          webViewFragm = a.c().b(tb, uoa);
          a.o(webViewFragm, "LiveWebViewController.ne¡­ liveWebViewContext\n    \)");
       }
       return webViewFragm;
    }
}
