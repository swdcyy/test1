package com.kuaishou.live.redpacket.core.ui.view.a;
import com.kuaishou.live.redpacket.core.ui.view.RedPacketBasePageView$a;
import com.kuaishou.live.redpacket.core.ui.view.RedPacketBasePageView;
import com.kuaishou.live.redpacket.core.ui.vm.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel$c$a;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel$c$b;

public class a implements RedPacketBasePageView$a	// class@000ef1
{
    public final a a;
    public final RedPacketBasePageView b;

    public void a(RedPacketBasePageView p0,a p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void D(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.a.x0(new RedPacketBaseViewModel$c$a(false));
       return;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.a.x0(new RedPacketBaseViewModel$c$b(false));
       return;
    }
}
