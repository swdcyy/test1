package ik1.t;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.common.core.component.gift.gift.i;
import ik1.r;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ik1.s;
import java.lang.Class;
import mm8.a;

public final class t implements b	// class@002939
{

    public void t(){
       super();
    }
    public void a(a p0,Object p1){
       r or = new r(this, p1);
       String str = "LIVE_GIFT_SERVICE";
       try{
          p0.i(str, or);
          p0.h(i.class, new s(this, p1));
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
