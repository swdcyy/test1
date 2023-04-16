package co2.k0;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.core.voiceparty.p;
import com.kuaishou.live.core.voiceparty.q;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import co2.j0;
import java.lang.Class;
import mm8.a;

public final class k0 implements b	// class@000596
{

    public void k0(){
       super();
    }
    public void a(a p0,Object p1){
       q oq = new q(this, p1);
       String str = "LIVE_VOICE_PARTY_PLAY_VIEW_SERVICE";
       try{
          p0.i(str, oq);
          p0.h(p.class, new j0(this, p1));
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
