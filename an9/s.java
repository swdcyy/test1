package an9.s;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import an9.m;
import an9.n;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import an9.o;
import an9.p;
import an9.q;
import an9.r;
import java.lang.Class;
import mm8.a;

public final class s implements b	// class@000114
{

    public void s(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("AUTO_PLAY_DETAIL_CALLBACK", new n(this, p1));
       p0.i("AUTO_PLAY_VIDEO_STATE_RECORD_CALLBACK", new o(this, p1));
       p0.i("AUTO_PLAY_VIDEO_CONFIG", new p(this, p1));
       q oq = new q(this, p1);
       String str = "AUTO_PLAY_VIDEO_MODULE";
       try{
          p0.i(str, oq);
          p0.h(m.class, new r(this, p1));
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
