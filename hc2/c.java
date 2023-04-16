package hc2.c;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.core.show.luckystar.v2.currentinfo.LiveLuckyStarCurrentInfoFragmentV2;
import hc2.a;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import hc2.b;
import java.lang.Class;
import mm8.a;

public final class c implements b	// class@002d58
{

    public void c(){
       super();
    }
    public void a(a p0,Object p1){
       a uoa = new a(this, p1);
       String str = "popupSource";
       try{
          p0.i(str, uoa);
          p0.h(LiveLuckyStarCurrentInfoFragmentV2.class, new b(this, p1));
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
