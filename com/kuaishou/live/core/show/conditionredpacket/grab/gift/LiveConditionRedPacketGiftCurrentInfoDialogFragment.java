package com.kuaishou.live.core.show.conditionredpacket.grab.gift.LiveConditionRedPacketGiftCurrentInfoDialogFragment;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.LiveConditionRedPacketBaseCurrentInfoDialogFragment;
import java.lang.String;
import u52.t;
import j62.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d62.b;
import d62.a;

public class LiveConditionRedPacketGiftCurrentInfoDialogFragment extends LiveConditionRedPacketBaseCurrentInfoDialogFragment	// class@000a95
{

    public void LiveConditionRedPacketGiftCurrentInfoDialogFragment(String p0){
       super(p0);
    }
    public static LiveConditionRedPacketGiftCurrentInfoDialogFragment nh(t p0,a p1,String p2){
       LiveConditionRedPacketGiftCurrentInfoDialogFragment obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, LiveConditionRedPacketGiftCurrentInfoDialogFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveConditionRedPacketGiftCurrentInfoDialogFragment(p2);
       obj.m = p0;
       obj.n = p1;
       return obj;
    }
    public PresenterV2 mh(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, LiveConditionRedPacketGiftCurrentInfoDialogFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new b());
       obj.U7(new a());
       PatchProxy.onMethodExit(LiveConditionRedPacketGiftCurrentInfoDialogFragment.class, "2");
       return obj;
    }
}
