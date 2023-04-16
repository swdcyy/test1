package kw8.l;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.activity.share.ShareActivity;
import kw8.e;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import kw8.f;
import kw8.g;
import kw8.h;
import kw8.i;
import kw8.j;
import kw8.k;
import java.lang.Class;
import mm8.a;

public final class l implements b	// class@002c32
{

    public void l(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("SHARE_ACTIVITY", new e(this, p1));
       p0.i("LISTENERS_MAP", new f(this, p1));
       p0.i("SHARED_PREFERENCE", new g(this, p1));
       p0.i("share_page_setting_kswtich", new h(this, p1));
       p0.i("publish_page_share_option", new i(this, p1));
       j oj = new j(this, p1);
       String str = "USE_VIDEO_VIEW";
       try{
          p0.i(str, oj);
          p0.h(ShareActivity.class, new k(this, p1));
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
