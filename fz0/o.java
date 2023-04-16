package fz0.o;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import fz0.k;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.bottombar.LiveAudienceGiftBottomBarEntryService;
import fz0.l;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import mk1.a0;
import fz0.m;
import fz0.n;
import mm8.a;

public final class o implements b	// class@0023eb
{

    public void o(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(LiveAudienceGiftBottomBarEntryService.class, new l(this, p1));
       a0 uoa0 = a0.class;
       m om = new m(this, p1);
       try{
          p0.h(uoa0, om);
          p0.h(k.class, new n(this, p1));
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
