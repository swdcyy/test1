package cm2.u;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import cm2.b$b;
import cm2.r;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import cm2.s;
import cm2.t;
import java.lang.Class;
import mm8.a;

public final class u implements b	// class@00056e
{

    public void u(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("LIVE_VOTE_QUESTION", new r(this, p1));
       s os = new s(this, p1);
       String str = "LIVE_VOTE_ITEM_CHANGE_EVENT";
       try{
          p0.i(str, os);
          p0.h(b$b.class, new t(this, p1));
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
