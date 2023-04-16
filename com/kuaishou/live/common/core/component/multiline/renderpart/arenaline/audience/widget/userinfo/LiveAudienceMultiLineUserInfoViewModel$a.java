package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.userinfo.LiveAudienceMultiLineUserInfoViewModel$a;
import z0.a;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.userinfo.AudienceUserInfoStyle;
import java.util.Objects;
import qrd.p;
import pq1.c;

public final class LiveAudienceMultiLineUserInfoViewModel$a implements a	// class@001518
{

    public void LiveAudienceMultiLineUserInfoViewModel$a(){
       super();
    }
    public final Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceMultiLineUserInfoViewModel$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.intValue() != 1) {
          p0 = AudienceUserInfoStyle.c;
          Objects.requireNonNull(p0);
          p0 = PatchProxy.apply(null, p0, AudienceUserInfoStyle.class, "1");
          if (p0 == PatchProxyResult.class) {
             p0 = AudienceUserInfoStyle.a.getValue();
          }
       }else {
          p0 = AudienceUserInfoStyle.c.a();
       }
       return p0;
    }
}
