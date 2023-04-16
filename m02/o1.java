package m02.o1;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.core.basic.activity.LivePlayTestActivity;
import yy6.c;
import m02.m1;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import m02.n1;
import mm8.a;

public final class o1 implements b	// class@0030d3
{

    public void o1(){
       super();
    }
    public void a(a p0,Object p1){
       c uoc = c.class;
       m1 om1 = new m1(this, p1);
       try{
          p0.h(uoc, om1);
          p0.h(LivePlayTestActivity.class, new n1(this, p1));
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
