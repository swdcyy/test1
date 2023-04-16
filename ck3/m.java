package ck3.m;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import ck3.b;
import ck3.d;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ck3.e;
import ck3.f;
import ck3.g;
import ck3.h;
import ck3.i;
import ck3.j;
import ck3.k;
import ck3.l;
import ck3.c;
import java.lang.Class;
import mm8.a;

public final class m implements b	// class@000583
{

    public void m(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("LIVE_PREVIEW_CONTEXT_LOGGER", new d(this, p1));
       p0.i("LIVE_PREVIEW_ENTER_LIVE_CLICK_FILTER", new e(this, p1));
       p0.i("LIVE_SIMPLE_NEGATIVE_FEEDBACK_PUBLISHER", new f(this, p1));
       p0.i("LIVE_ANCHOR_END", new g(this, p1));
       p0.i("LIVE_PLAY_STATE", new h(this, p1));
       p0.i("LIVE_FEATURE_CONFIG", new i(this, p1));
       p0.i("LIVE_PREVIEW_LOG_REPORTER", new j(this, p1));
       p0.i("LIVE_SIMPLE_PLAY_MODULE", new k(this, p1));
       l ol = new l(this, p1);
       String str = "LIVE_SIMPLE_REUSE_SESSION_ID";
       try{
          p0.i(str, ol);
          p0.h(b.class, new c(this, p1));
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
