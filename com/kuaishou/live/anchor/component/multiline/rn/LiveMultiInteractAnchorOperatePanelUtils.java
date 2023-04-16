package com.kuaishou.live.anchor.component.multiline.rn.LiveMultiInteractAnchorOperatePanelUtils;
import java.lang.Object;
import o63.a;
import com.kuaishou.live.anchor.component.multiline.rn.LiveMultiInteractAnchorOperatePanelUtils$KrnUserInfo;
import java.util.Map;
import o63.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import p63.a;
import p63.a$a;
import p63.a$b;
import fg6.a;
import com.google.gson.Gson;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import oa1.a;
import nsd.u;
import oa1.b;
import com.kuaishou.live.jsbridge.LiveKrnPageKey;
import msd.l;

public final class LiveMultiInteractAnchorOperatePanelUtils	// class@000a30
{
    public static final LiveMultiInteractAnchorOperatePanelUtils a;

    static {
       LiveMultiInteractAnchorOperatePanelUtils.a = new LiveMultiInteractAnchorOperatePanelUtils();
    }
    public void LiveMultiInteractAnchorOperatePanelUtils(){
       super();
    }
    public final d a(a p0,LiveMultiInteractAnchorOperatePanelUtils$KrnUserInfo p1,int p2,Map p3){
       a$a obj1;
       String this;
       Object obj = p1;
       if (PatchProxy.isSupport(LiveMultiInteractAnchorOperatePanelUtils.class)) {
          obj1 = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), p3, this, LiveMultiInteractAnchorOperatePanelUtils.class, "1");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       a.p(p0, "jsBridgeService");
       a.p(obj, "userInfo");
       obj1 = a.b.a().a("userInfo", a.a.q(obj)).a("interactBiz", String.valueOf(p2));
       if (p3 != null) {
          Iterator iterator = p3.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             this = uEntry.getKey();
             obj1.a(this, uEntry.getValue());
          }
       }
       this.b(0x3f1e353f);
       this.g(0x3f800000);
       this.f(true);
       this.c(true);
       this.d(0);
       return b.d(b.a, p0, LiveKrnPageKey.LiveMultiInteractSettingPanel, obj1.b(), super(0, 0, 0, 0, 0, 0, null, false, 0, 511, null), null, 16, null);
    }
}
