package ag2.e;
import a71.c;
import ag2.f;
import java.lang.Object;
import t02.a0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import dg2.d;
import com.kuaishou.live.core.show.quiz.manager.j;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import bg2.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import k2b.u1;

public final class e implements c	// class@0000cb
{
    public final f a;

    public void e(f p0){
       this.a = p0;
    }
    public final void onShow(){
       e ta = this.a;
       BaseFragment uBaseFragmen = ta.K.Z2.b();
       int i = ta.L.e().a();
       ClientContent$LiveStreamPackage liveStreamPa = ta.K.Z2.a();
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(uBaseFragmen, Integer.valueOf(i), liveStreamPa, null, a.class, "1")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "RIGHT_CARD_BUTTON";
          i3 oi3 = i3.f();
          oi3.c("count", Integer.valueOf(i));
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          if (liveStreamPa != null) {
             uContentPack.liveStreamPackage = liveStreamPa;
          }
          u1.C0("2985875", uBaseFragmen, 9, uElementPack, uContentPack);
       }
       return;
    }
}
