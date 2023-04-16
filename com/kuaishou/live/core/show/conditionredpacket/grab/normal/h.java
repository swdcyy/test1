package com.kuaishou.live.core.show.conditionredpacket.grab.normal.h;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.core.show.conditionredpacket.grab.normal.LiveConditionRedPacketNormalCurrentInfoDialogFragment$b;
import com.kuaishou.live.core.show.conditionredpacket.grab.normal.LiveConditionRedPacketNormalCurrentInfoDialogFragment$a;
import com.kuaishou.live.core.show.conditionredpacket.grab.normal.f;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.live.core.show.conditionredpacket.grab.normal.g;
import mm8.a;

public final class h implements b	// class@000aa0
{

    public void h(){
       super();
    }
    public void a(a p0,Object p1){
       LiveConditionRedPacketNormalCurrentInfoDialogFragment$a uoa = LiveConditionRedPacketNormalCurrentInfoDialogFragment$a.class;
       f uof = new f(this, p1);
       try{
          p0.h(uoa, uof);
          p0.h(LiveConditionRedPacketNormalCurrentInfoDialogFragment$b.class, new g(this, p1));
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
