package com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.f;
import e22.a;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import android.os.Bundle;
import p91.m;
import zg2.g;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.LiveFellowRedPacketPanelFragment$g;
import vg2.b;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.LiveFellowRedPacketPanelFragment;
import java.lang.Class;
import androidx.fragment.app.Fragment;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class f extends a	// class@000eae
{
    public m d;
    public g e;
    public LiveFellowRedPacketPanelFragment$g f;
    public b g;
    public boolean h;
    public boolean i;
    public int j;

    public void f(PagerSlidingTabStrip$d p0,Bundle p1,m p2,g p3,LiveFellowRedPacketPanelFragment$g p4,b p5,int p6){
       super(p0, LiveFellowRedPacketPanelFragment.class, p1);
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.j = p6;
       this.h = p3.p();
       this.i = this.e.a();
    }
    public void a(int p0,Fragment p1){
       if (!PatchProxy.isSupport(f.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, f.class, "1")) {
          p1.J = this.d;
          p1.N = this.h;
          p1.Q = this.i;
          p1.S = this.f;
          p1.T = this.e;
          p1.V = this.g;
          p1.O = this.j;
       }
       return;
    }
}
