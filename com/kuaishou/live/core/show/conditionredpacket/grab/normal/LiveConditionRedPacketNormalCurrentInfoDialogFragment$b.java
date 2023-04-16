package com.kuaishou.live.core.show.conditionredpacket.grab.normal.LiveConditionRedPacketNormalCurrentInfoDialogFragment$b;
import im8.g;
import k51.c;
import com.kuaishou.live.core.show.conditionredpacket.grab.normal.LiveConditionRedPacketNormalCurrentInfoDialogFragment$a;
import im8.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.conditionredpacket.grab.normal.h;
import java.util.Map;
import java.util.HashMap;

public class LiveConditionRedPacketNormalCurrentInfoDialogFragment$b extends c implements g	// class@000a97
{
    public LiveConditionRedPacketNormalCurrentInfoDialogFragment$a p;
    public static String sLivePresenterClassName = "LiveConditionRedPacketNormalCurrentInfoDialogFragment$LiveConditionRedPacketNormalCurrentInfoRootPresenter";

    public void LiveConditionRedPacketNormalCurrentInfoDialogFragment$b(LiveConditionRedPacketNormalCurrentInfoDialogFragment$a p0){
       super();
       this.p = p0;
       this.W7(p0);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveConditionRedPacketNormalCurrentInfoDialogFragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveConditionRedPacketNormalCurrentInfoDialogFragment$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveConditionRedPacketNormalCurrentInfoDialogFragment$b.class, new h());
       }else {
          obj.put(LiveConditionRedPacketNormalCurrentInfoDialogFragment$b.class, null);
       }
       return obj;
    }
}
