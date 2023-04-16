package com.kuaishou.live.longconnection.horserace.c$a;
import erd.g;
import com.kuaishou.live.longconnection.horserace.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kuaishou.live.longconnection.connector.l;
import com.kuaishou.live.longconnection.connector.l$c;
import com.kuaishou.live.longconnection.connector.b;
import mf3.b;

public class c$a implements g	// class@000c89
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          b.a("HorseRunner", "HorseRunner raceReturn, mHasStop:"+this.b.d+", liveStreamId: "+this.b.c.f()+", mHorse: "+this.b.a+", ServerUriInfo: "+this.b.b.g(), objArray);
       }
       return;
    }
}
