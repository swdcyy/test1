package gy0.s;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.audience.component.comments.send.e;
import n81.c;
import gy0.o;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import gy0.p;
import java.lang.String;
import gy0.q;
import gy0.r;
import mm8.a;

public final class s implements b	// class@0025b6
{

    public void s(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(c.class, new o(this, p1));
       p0.i("LIVE_AUDIENCE_SEND_COMMENTS_SERVICE", new p(this, p1));
       q oq = new q(this, p1);
       String str = "LIVE_AUDIENCE_COMMENT_PLACEHOLDER_SERVICE";
       try{
          p0.i(str, oq);
          p0.h(e.class, new r(this, p1));
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
