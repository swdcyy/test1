package com.kuaishou.live.core.show.conditionredpacket.grab.base.LiveConditionRedPacketRollUserDialogFragment;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.LiveConditionRedPacketBaseResultDialogFragment;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.LiveConditionRedPacketRollUserDialogFragment$a;
import android.view.View;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;
import com.kwai.robust.PatchProxyResult;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.l;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.j;
import u52.t;
import j62.a;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import i62.t$c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import androidx.lifecycle.LiveData;
import java.lang.Integer;
import k2b.e0;
import u52.u;
import h62.e;
import com.kuaishou.live.core.show.conditionredpacket.logger.RedPacketType;
import h62.a;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketStage;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketPopupPageType;
import java.lang.StringBuilder;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketAction;
import java.lang.Enum;
import h62.d;

public class LiveConditionRedPacketRollUserDialogFragment extends LiveConditionRedPacketBaseResultDialogFragment	// class@000a7f
{
    public LiveConditionRedPacketRollUserDialogFragment$a x;
    public static final int y;

    public void LiveConditionRedPacketRollUserDialogFragment(){
       super();
       this.x = new LiveConditionRedPacketRollUserDialogFragment$a(this);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveConditionRedPacketRollUserDialogFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       String str = "3";
       PresenterV2 presenterV2 = PatchProxy.applyWithListener(null, this, LiveConditionRedPacketRollUserDialogFragment.class, str);
       if (presenterV2 != PatchProxyResult.class) {
       }else {
          presenterV2 = new PresenterV2();
          presenterV2.U7(new l());
          presenterV2.U7(new j());
          PatchProxy.onMethodExit(LiveConditionRedPacketRollUserDialogFragment.class, str);
       }
       presenterV2.f(p0);
       Object[] objArray = new Object[]{this.s,this.t,this.x};
       presenterV2.i(objArray);
       this.u = presenterV2;
       LiveConditionRedPacketBaseResultDialogFragment tt = this.t;
       LiveConditionRedPacketInfo liveConditio = this.s.c.l(tt.a, tt.b);
       BaseFragment uBaseFragmen = this.s.a.b();
       ClientContent$LiveStreamPackage liveStreamPa = this.s.a.a();
       ClientContent$LiveVoicePartyPackageV2 liveVoicePar = this.s.a.y();
       tt = this.t;
       a b = tt.b;
       a a = tt.a;
       long l = (liveConditio == null)? 0: liveConditio.j / 0xea60;
       int i = (liveConditio == null)? 0: liveConditio.v.getValue().intValue();
       u.j(uBaseFragmen, liveStreamPa, liveVoicePar, b, a, l, i, 1, 0, LiveConditionRedPacketInfo.a(liveConditio));
       tt = this.t;
       LiveConditionRedPacketBaseResultDialogFragment tt1 = this.t;
       LiveRedPacketPopupPageType rOLLING_USER = LiveRedPacketPopupPageType.ROLLING_USER_PANEL;
       tt = this.t;
       d.b(e.e(this.s, tt.b, tt.a), tt1.b, RedPacketType.RED_PACKET_TYPE_CONDITION, a.a(tt1.a), LiveRedPacketStage.RED_PACKET_GRABING, rOLLING_USER, e.a(this.s, tt.b, tt.a, LiveRedPacketAction.RED_PACK_POPUP.name()+rOLLING_USER));
       return;
    }
}
