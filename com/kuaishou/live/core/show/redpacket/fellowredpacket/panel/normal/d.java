package com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.d;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.LiveFellowRedPacketPanelFragment$f;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.LiveFellowRedPacketPanelFragment$e;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.a;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import n17.a;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.b;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.c;
import mm8.a;

public final class d implements b	// class@000eab
{

    public void d(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(LiveFellowRedPacketPanelFragment$e.class, new a(this, p1));
       a uoa = a.class;
       b uob = new b(this, p1);
       try{
          p0.h(uoa, uob);
          p0.h(LiveFellowRedPacketPanelFragment$f.class, new c(this, p1));
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public a b(Object p0){
       return a.a(this, p0);
    }
    public b init(){
       return a.b(this);
    }
}
