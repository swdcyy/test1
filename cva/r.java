package cva.r;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import cva.l;
import cva.m;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import cva.n;
import cva.o;
import cva.p;
import cva.q;
import java.lang.Class;
import mm8.a;

public final class r implements b	// class@0023e3
{

    public void r(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("AUTO_PLAY_DETAIL_CALLBACK", new m(this, p1));
       p0.i("AUTO_PLAY_VIDEO_STATE_RECORD_CALLBACK", new n(this, p1));
       p0.i("AUTO_PLAY_VIDEO_CONFIG", new o(this, p1));
       p op = new p(this, p1);
       String str = "AUTO_PLAY_VIDEO_MODULE";
       try{
          p0.i(str, op);
          p0.h(l.class, new q(this, p1));
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
