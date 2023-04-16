package com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackDialogFragment$a;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.a$a;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackDialogFragment;
import java.lang.Object;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.model.LiveSurpriseRedPackGrabResult;
import t02.a0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import ii2.e;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$RedPackPackage;
import k2b.u1;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import d61.g;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import com.kwai.feature.api.social.login.model.LoginParams;
import ki2.c;
import android.content.Context;
import n3d.a;
import com.kwai.robust.PatchProxyResult;

public class LiveSurpriseRedPackDialogFragment$a implements a$a	// class@000fa1
{
    public final LiveSurpriseRedPackDialogFragment a;

    public void LiveSurpriseRedPackDialogFragment$a(LiveSurpriseRedPackDialogFragment p0){
       this.a = p0;
       super();
    }
    public LiveSurpriseRedPackGrabResult a(){
       return this.a.C;
    }
    public a0 e(){
       return this.a.z;
    }
    public void f(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveSurpriseRedPackDialogFragment$a.class, "2")) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.a.wh();
       if (liveStreamPa != null) {
          LiveSurpriseRedPackDialogFragment a = this.a.A;
          if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, a, objArray, e.class, "5")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "RED_PACK_PRIZE_OPERATION_BUTTON";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             ClientContent$RedPackPackage redPackPacka = new ClientContent$RedPackPackage();
             redPackPacka.redPackId = a;
             redPackPacka.redPackType = 11;
             uContentPack.redPackage = redPackPacka;
             u1.u(1, uElementPack, uContentPack);
          }
       }
       this.a.dismissAllowingStateLoss();
       return;
    }
    public void g(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveSurpriseRedPackDialogFragment$a.class, "1")) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.a.wh();
       if (liveStreamPa != null) {
          LiveSurpriseRedPackDialogFragment a = this.a.A;
          if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, a, objArray, e.class, "2")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "OPEN_RED_PACK";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             ClientContent$RedPackPackage redPackPacka = new ClientContent$RedPackPackage();
             redPackPacka.redPackId = a;
             redPackPacka.redPackType = 11;
             uContentPack.redPackage = redPackPacka;
             u1.u(1, uElementPack, uContentPack);
          }
       }
       LiveSurpriseRedPackDialogFragment$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, LiveSurpriseRedPackDialogFragment.class, "6")) {
          FragmentActivity activity = ta.getActivity();
          if (!g.h(activity)) {
             if (!QCurrentUser.me().isLogined()) {
                d.a(-1712118428).x00(activity, 0, new LoginParams$a().a(), new c(ta));
             }else {
                ta.xh();
             }
          }
       }
       return;
    }
    public Activity h(){
       Object obj = PatchProxy.apply(null, this, LiveSurpriseRedPackDialogFragment$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getActivity();
    }
}
