package com.kuaishou.live.core.show.conditionredpacket.grab.arrow.LiveConditionRedPacketArrowCurrentInfoDialogFragment;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.LiveConditionRedPacketBaseCurrentInfoDialogFragment;
import com.kuaishou.live.core.show.conditionredpacket.grab.arrow.LiveConditionRedPacketArrowCurrentInfoDialogFragment$a;
import nsd.u;
import java.lang.String;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import a62.c;
import a62.a;
import java.util.HashMap;

public final class LiveConditionRedPacketArrowCurrentInfoDialogFragment extends LiveConditionRedPacketBaseCurrentInfoDialogFragment	// class@000a78
{
    public HashMap u;
    public static final LiveConditionRedPacketArrowCurrentInfoDialogFragment$a v;

    static {
       LiveConditionRedPacketArrowCurrentInfoDialogFragment.v = new LiveConditionRedPacketArrowCurrentInfoDialogFragment$a(null);
    }
    public void LiveConditionRedPacketArrowCurrentInfoDialogFragment(String p0){
       super(p0);
    }
    public PresenterV2 mh(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, LiveConditionRedPacketArrowCurrentInfoDialogFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new c());
       obj.U7(new a());
       PatchProxy.onMethodExit(LiveConditionRedPacketArrowCurrentInfoDialogFragment.class, "1");
       return obj;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, LiveConditionRedPacketArrowCurrentInfoDialogFragment.class, "3")) {
       }else {
          LiveConditionRedPacketArrowCurrentInfoDialogFragment tu = this.u;
          if (tu != null) {
             tu.clear();
          }
       }
       return;
    }
}
