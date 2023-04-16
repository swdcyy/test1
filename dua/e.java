package dua.e;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.homepage.presenter.splash.c;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import eua.b;
import tra.b;
import q87.c;
import wkd.b;
import tjc.c;
import wf0.j0;

public class e extends AnimatorListenerAdapter	// class@002564
{
    public final int a;
    public final c b;

    public void e(c p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, e.class, "2")) {
          return;
       }
       super.onAnimationCancel(p0);
       this.b.S8().setVisibility(8);
       PatchProxy.onMethodExit(e.class, "2");
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, e.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       int i = 0;
       Object[] objArray = new Object[i];
       b.C().A("SplashPresenter", "startExitAnimation onAnimationEnd", objArray);
       this.b.S8().setVisibility(8);
       int i1 = -1608526086;
       if (this.a != b.a(i1).getState()) {
          Object[] objArray1 = new Object[i];
          b.C().A("SplashPresenter", "state has changed do nothing", objArray1);
          PatchProxy.onMethodExit(e.class, "1");
          return;
       }else {
          b.a(0x440481e4).a();
          b.a(i1).a0();
          PatchProxy.onMethodExit(e.class, "1");
          return;
       }
    }
}
