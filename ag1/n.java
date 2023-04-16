package ag1.n;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.common.core.component.effect.renderer.c;
import com.kuaishou.live.common.core.component.effect.renderer.LiveEffectBridge;
import ag1.j;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ag1.e;
import ag1.k;
import ag1.l;
import java.lang.String;
import ag1.m;
import mm8.a;

public final class n implements b	// class@000090
{

    public void n(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(LiveEffectBridge.class, new j(this, p1));
       p0.h(e.class, new k(this, p1));
       l ol = new l(this, p1);
       String str = "LIVE_RENDER_CONTEXT_SUPPILER";
       try{
          p0.i(str, ol);
          p0.h(c.class, new m(this, p1));
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
