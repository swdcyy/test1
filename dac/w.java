package dac.w;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendFragment;
import dac.u;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import dac.v;
import java.lang.Class;
import mm8.a;

public final class w implements b	// class@00214f
{

    public void w(){
       super();
    }
    public void a(a p0,Object p1){
       u ou = new u(this, p1);
       String str = "tabPageShow";
       try{
          p0.i(str, ou);
          p0.h(ExploreFriendFragment.class, new v(this, p1));
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
