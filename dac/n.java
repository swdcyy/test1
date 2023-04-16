package dac.n;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendContactFragment;
import g7c.a;
import dac.k;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import dac.l;
import java.lang.String;
import dac.m;
import mm8.a;

public final class n implements b	// class@002146
{

    public void n(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(a.class, new k(this, p1));
       l ol = new l(this, p1);
       String str = "tabPageShow";
       try{
          p0.i(str, ol);
          p0.h(ExploreFriendContactFragment.class, new m(this, p1));
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
