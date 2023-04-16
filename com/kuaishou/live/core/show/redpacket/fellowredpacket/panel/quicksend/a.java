package com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.quicksend.a;
import qvb.q;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.quicksend.LiveQuickSendFellowRedPacketPanelFragment$c;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.quicksend.LiveQuickSendFellowRedPacketPanelFragment;
import androidx.fragment.app.KwaiDialogFragment;
import z12.x;
import qvb.p;

public class a implements q	// class@000eb9
{
    public final LiveQuickSendFellowRedPacketPanelFragment$c b;

    public void a(LiveQuickSendFellowRedPacketPanelFragment$c p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, a.class, "2")) {
          return;
       }
       x.E(this.b.x.J);
       return;
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, a.class, "1")) {
          return;
       }
       x.E(this.b.x.J);
       return;
    }
}
