package ac2.e;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.core.show.luckystar.currentinfo.LiveLuckyStarCurrentInfoFragment;
import java.lang.Runnable;
import ac2.b;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ac2.c;
import java.lang.String;
import ac2.d;
import mm8.a;

public final class e implements b	// class@0000af
{

    public void e(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(Runnable.class, new b(this, p1));
       c uoc = new c(this, p1);
       String str = "popupSource";
       try{
          p0.i(str, uoc);
          p0.h(LiveLuckyStarCurrentInfoFragment.class, new d(this, p1));
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
