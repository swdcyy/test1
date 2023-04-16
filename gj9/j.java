package gj9.j;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.channel.stagger.HotChannelFragment;
import gj9.e;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import gj9.f;
import gj9.g;
import gj9.h;
import gj9.i;
import java.lang.Class;
import mm8.a;

public final class j implements b	// class@0024b8
{

    public void j(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("HOME_AUTO_SCROLL_TO_TOP_TYPE", new e(this, p1));
       p0.i("HOT_CHANNEL_CURRENT_TAG", new f(this, p1));
       p0.i("PAGE_CARD_STYLE", new g(this, p1));
       h oh = new h(this, p1);
       String str = "REAL_ACTION_BIZ_TYPE";
       try{
          p0.i(str, oh);
          p0.h(HotChannelFragment.class, new i(this, p1));
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
