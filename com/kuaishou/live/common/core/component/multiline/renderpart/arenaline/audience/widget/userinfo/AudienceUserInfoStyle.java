package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.userinfo.AudienceUserInfoStyle;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.userinfo.AudienceUserInfoStyle$SHRINK$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.userinfo.AudienceUserInfoStyle$NORMAL$2;
import java.lang.Object;
import pq1.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AudienceUserInfoStyle	// class@001517
{
    public static final p a;
    public static final p b;
    public static final AudienceUserInfoStyle c;

    static {
       AudienceUserInfoStyle.c = new AudienceUserInfoStyle();
       AudienceUserInfoStyle.a = s.c(AudienceUserInfoStyle$SHRINK$2.INSTANCE);
       AudienceUserInfoStyle.b = s.c(AudienceUserInfoStyle$NORMAL$2.INSTANCE);
    }
    public void AudienceUserInfoStyle(){
       super();
    }
    public final c a(){
       Object obj = PatchProxy.apply(null, this, AudienceUserInfoStyle.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AudienceUserInfoStyle.b.getValue();
    }
}
