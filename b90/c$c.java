package b90.c$c;
import lq.l;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import android.app.Activity;
import com.kwai.feature.post.api.mediascene.MediaSceneConfig;
import com.kwai.feature.post.api.mediascene.MediaSceneLaunchParams;
import java.lang.Object;
import lq.l$a;
import lq.j;
import lq.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import b90.c$c$a;
import java.lang.Runnable;
import ekd.k1;
import java.util.Collection;

public final class c$c implements l	// class@000aee
{
    public final ProgressFragment a;
    public final Activity b;
    public final MediaSceneConfig c;
    public final MediaSceneLaunchParams d;

    public void c$c(ProgressFragment p0,Activity p1,MediaSceneConfig p2,MediaSceneLaunchParams p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void a(l$a p0){
       j.a(this, p0);
    }
    public void b(i p0,boolean p1){
       c$c uoc = c$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoc, "1")) {
          return;
       }
       k1.r(new c$c$a(this), 0);
       return;
    }
    public void c(){
       j.b(this);
    }
    public void d(i p0){
       j.d(this, p0);
    }
    public void e(i p0,Collection p1){
       j.e(this, p0, p1);
    }
}
