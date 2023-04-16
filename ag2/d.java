package ag2.d;
import a71.c;
import ag2.f;
import java.lang.Object;
import t02.a0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import bg2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import k2b.u1;

public final class d implements c	// class@0000ca
{
    public final f a;

    public void d(f p0){
       this.a = p0;
    }
    public final void onShow(){
       d ta = this.a;
       BaseFragment uBaseFragmen = ta.K.Z2.b();
       ClientContent$LiveStreamPackage liveStreamPa = ta.K.Z2.a();
       if (PatchProxy.applyVoidTwoRefs(uBaseFragmen, liveStreamPa, null, a.class, "3")) {
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "TEAM_ANSWER_BUTTON";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          if (liveStreamPa != null) {
             uContentPack.liveStreamPackage = liveStreamPa;
          }
          u1.C0("2985878", uBaseFragmen, 9, uElementPack, uContentPack);
       }
       return;
    }
}
