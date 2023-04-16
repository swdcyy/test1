package com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$mTabSelectedStatisticsListener$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment;
import java.lang.Object;
import com.google.android.material.tabs.TabLayout$f;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import java.lang.CharSequence;
import dx2.p;
import qu2.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import co2.f2;
import mw2.e;

public final class VoicePartyTheaterTubeListTabFragment$mTabSelectedStatisticsListener$1 extends Lambda implements l	// class@001a28
{
    public final VoicePartyTheaterTubeListTabFragment this$0;

    public void VoicePartyTheaterTubeListTabFragment$mTabSelectedStatisticsListener$1(VoicePartyTheaterTubeListTabFragment p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(TabLayout$f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTheaterTubeListTabFragment$mTabSelectedStatisticsListener$1.class, "1")) {
          return;
       }
       a.p(p0, "tab");
       ClientContent$TagPackage tagPackage = new ClientContent$TagPackage();
       tagPackage.identity = String.valueOf(p0.d());
       tagPackage.name = String.valueOf(p0.e());
       tagPackage.index = (long)(p0.c() + 1);
       p op = this.this$0.rh();
       a.o(op, "mContext");
       p op1 = this.this$0.rh();
       a.o(op1, "mContext");
       e.f(op.d().a(), op1.g(), tagPackage);
       return;
    }
}
