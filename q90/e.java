package q90.e;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedGroupPagerFragment;
import q90.a;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import q90.b;
import q90.c;
import q90.d;
import java.lang.Class;
import mm8.a;

public final class e implements b	// class@002986
{

    public void e(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("FRAGMENT", new a(this, p1));
       p0.i("HAS_GROUP_FEED", new b(this, p1));
       c uoc = new c(this, p1);
       String str = "KUAISHAN_LAUNCH_PARAM";
       try{
          p0.i(str, uoc);
          p0.h(KSFeedGroupPagerFragment.class, new d(this, p1));
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
