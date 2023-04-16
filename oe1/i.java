package oe1.i;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.common.core.component.comments.combo.b;
import oe1.g;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import oe1.h;
import java.lang.Class;
import mm8.a;

public final class i implements b	// class@0034d2
{

    public void i(){
       super();
    }
    public void a(a p0,Object p1){
       g og = new g(this, p1);
       String str = "LIVE_COMBO_COMMENT_SERVICE";
       try{
          p0.i(str, og);
          p0.h(b.class, new h(this, p1));
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
