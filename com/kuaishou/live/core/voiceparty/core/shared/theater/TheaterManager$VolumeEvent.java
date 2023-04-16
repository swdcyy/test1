package com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$VolumeEvent;
import ut7.e;
import nsd.u;
import java.lang.Object;

public final class TheaterManager$VolumeEvent implements e	// class@001467
{
    public final float a;
    public final float b;

    public void TheaterManager$VolumeEvent(){
       super(0, 0, 3, null);
    }
    public void TheaterManager$VolumeEvent(float p0,float p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = 0xbf800000;
       }
       if (p2 & 0x02) {
          p1 = 0xbf800000;
       }
       super();
       this.a = p0;
       this.b = p1;
       return;
    }
}
