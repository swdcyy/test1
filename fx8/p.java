package fx8.p;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicGuideFragment;
import fx8.n;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import fx8.o;
import java.lang.Class;
import mm8.a;

public final class p implements b	// class@002391
{

    public void p(){
       super();
    }
    public void a(a p0,Object p1){
       n on = new n(this, p1);
       String str = "share_page_setting_kswtich";
       try{
          p0.i(str, on);
          p0.h(ShareTopicGuideFragment.class, new o(this, p1));
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
