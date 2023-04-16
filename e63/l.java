package e63.l;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import e63.g;
import com.kuaishou.live.gzone.v2.profile.LiveGzoneProfileParams;
import e63.h;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import e63.i;
import java.lang.String;
import e63.j;
import e63.k;
import mm8.a;

public final class l implements b	// class@00265f
{

    public void l(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(LiveGzoneProfileParams.class, new h(this, p1));
       p0.i("LIVE_PROFILE_REFRESH_SUBJECT", new i(this, p1));
       j oj = new j(this, p1);
       String str = "LIVE_PROFILE_REFRESHING_STATE_CHANGED_SUBJECT";
       try{
          p0.i(str, oj);
          p0.h(g.class, new k(this, p1));
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
