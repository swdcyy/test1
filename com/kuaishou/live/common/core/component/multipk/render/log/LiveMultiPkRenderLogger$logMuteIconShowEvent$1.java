package com.kuaishou.live.common.core.component.multipk.render.log.LiveMultiPkRenderLogger$logMuteIconShowEvent$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Boolean;
import java.lang.Object;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;

public final class LiveMultiPkRenderLogger$logMuteIconShowEvent$1 extends Lambda implements p	// class@001674
{
    public final Boolean $isMuteBeforeClick;

    public void LiveMultiPkRenderLogger$logMuteIconShowEvent$1(Boolean p0){
       this.$isMuteBeforeClick = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1);
       return l1.a;
    }
    public final void invoke(ClientEvent$ElementPackage p0,ClientContent$ContentPackage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMultiPkRenderLogger$logMuteIconShowEvent$1.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "content");
       ClientContent$ContentPackage userPackage = p1.userPackage;
       if (userPackage != null) {
          String str = (a.g(this.$isMuteBeforeClick, Boolean.TRUE))? "OPEN": "CLOSE";
          userPackage.avatarStatus = str;
       }
       return;
    }
}
