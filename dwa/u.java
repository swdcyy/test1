package dwa.u;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import dwa.k;
import dwa.l;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.entity.QPhoto;
import dwa.m;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessors;
import dwa.n;
import dwa.o;
import dwa.p;
import dwa.q;
import dwa.r;
import dwa.s;
import dwa.t;
import mm8.a;

public final class u implements b	// class@00259e
{

    public void u(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("AUTO_PLAY_DETAIL_CALLBACK", new l(this, p1));
       p0.h(QPhoto.class, new m(this, p1));
       if (p1.h != null) {
          Accessors.d().b(p1.h).a(p0, p1.h);
       }
       p0.i("AUTO_PLAY_VIDEO_STAT_RECORDER", new n(this, p1));
       p0.i("AUTO_PLAY_VIDEO_STAT_COLLECTOR", new o(this, p1));
       p0.i("AUTO_PLAY_VIDEO_STATE_RECORD_CALLBACK", new p(this, p1));
       p0.i("AUTO_PLAY_VIDEO_CONFIG", new q(this, p1));
       p0.i("AUTO_PLAY_VIDEO_MODULE", new r(this, p1));
       s os = new s(this, p1);
       String str = "AUTO_PLAY_VIDEO_STAT_REPORTER";
       try{
          p0.i(str, os);
          p0.h(k.class, new t(this, p1));
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
