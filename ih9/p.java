package ih9.p;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.camera.record.toolbox.PostToolBoxFragment;
import ih9.g;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ih9.h;
import ih9.i;
import ih9.j;
import ih9.k;
import ih9.l;
import ih9.m;
import ih9.n;
import ih9.o;
import ih9.f;
import java.lang.Class;
import mm8.a;

public final class p implements b	// class@002827
{

    public void p(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("FRAGMENT", new g(this, p1));
       p0.i("kuaishan_navigate_to_template", new h(this, p1));
       p0.i("kuaishan_page_param", new i(this, p1));
       p0.i("on_activity_result", new j(this, p1));
       p0.i("recordByMusicRequestDuartion", new k(this, p1));
       p0.i("refresh_completed_subject", new l(this, p1));
       p0.i("refresh_subject", new m(this, p1));
       p0.i("task_id", new n(this, p1));
       o oo = new o(this, p1);
       String str = "toolbox_title";
       try{
          p0.i(str, oo);
          p0.h(PostToolBoxFragment.class, new f(this, p1));
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
