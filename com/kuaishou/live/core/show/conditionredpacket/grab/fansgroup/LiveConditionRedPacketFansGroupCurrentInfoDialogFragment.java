package com.kuaishou.live.core.show.conditionredpacket.grab.fansgroup.LiveConditionRedPacketFansGroupCurrentInfoDialogFragment;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.LiveConditionRedPacketBaseCurrentInfoDialogFragment;
import java.lang.String;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import c62.b;
import com.kuaishou.live.core.show.conditionredpacket.grab.fansgroup.a;

public class LiveConditionRedPacketFansGroupCurrentInfoDialogFragment extends LiveConditionRedPacketBaseCurrentInfoDialogFragment	// class@000a93
{
    public static final int u;

    public void LiveConditionRedPacketFansGroupCurrentInfoDialogFragment(String p0){
       super(p0);
    }
    public PresenterV2 mh(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, LiveConditionRedPacketFansGroupCurrentInfoDialogFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new b());
       obj.U7(new a());
       PatchProxy.onMethodExit(LiveConditionRedPacketFansGroupCurrentInfoDialogFragment.class, "2");
       return obj;
    }
}
