package com.kuaishou.live.core.voiceparty.theater.tube.tab.VoicePartyTheaterTubeTabFragment$b;
import erd.g;
import com.kuaishou.live.core.voiceparty.theater.tube.tab.VoicePartyTheaterTubeTabFragment;
import android.view.View;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeChannelResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$a;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import android.os.Parcelable;
import org.parceler.b;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import mkc.b;
import mkc.c;

public final class VoicePartyTheaterTubeTabFragment$b implements g	// class@001a3a
{
    public final VoicePartyTheaterTubeTabFragment b;
    public final View c;

    public void VoicePartyTheaterTubeTabFragment$b(VoicePartyTheaterTubeTabFragment p0,View p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTheaterTubeTabFragment$b.class, str)) {
       }else {
          VoicePartyTheaterTubeListTabFragment$a h = VoicePartyTheaterTubeListTabFragment.H;
          VoicePartyTheaterTubeTabFragment j = this.b.j;
          if (j == null) {
             a.S("mTabConfig");
          }
          a.o(p0, "it");
          Objects.requireNonNull(h);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          VoicePartyTheaterTubeListTabFragment voicePartyTh = PatchProxy.applyTwoRefs(j, p0, h, VoicePartyTheaterTubeListTabFragment$a.class, str);
          if (voicePartyTh != patchProxyRe) {
          }else {
             a.p(j, "tabConf");
             a.p(p0, "rsp");
             voicePartyTh = new VoicePartyTheaterTubeListTabFragment();
             Bundle uBundle = PatchProxy.applyTwoRefs(j, p0, h, VoicePartyTheaterTubeListTabFragment$a.class, "2");
             if (uBundle != patchProxyRe) {
             }else {
                uBundle = new Bundle();
                SerializableHook.putSerializable(uBundle, VoicePartyTheaterTubeListTabFragment.F, j);
                uBundle.putParcelable(VoicePartyTheaterTubeListTabFragment.G, b.c(p0));
             }
             voicePartyTh.setArguments(uBundle);
          }
          voicePartyTh.bh(this.b.K0());
          p0 = this.b.l;
          a.o(p0, "mCallback");
          if (!PatchProxy.applyVoidOneRefs(p0, voicePartyTh, VoicePartyTheaterTubeListTabFragment.class, "10")) {
             a.p(p0, "callback");
             voicePartyTh.w = p0;
          }
          p0 = this.b.getChildFragmentManager().beginTransaction();
          p0.v(R.id.content_container, voicePartyTh);
          p0.m();
          b[] uobArray = new b[]{b.g};
          c.d(this.c, uobArray);
       }
       return;
    }
}
