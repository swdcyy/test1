package f72.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import f72.c;
import erd.g;
import f72.e;
import erd.r;
import f72.d;
import crd.b;
import f72.b;
import zca.h;
import f72.a;
import eoc.f;
import com.kuaishou.live.core.show.liveexplore.LiveExploreFragment;
import io.reactivex.subjects.PublishSubject;
import java.lang.System;

public class f extends PresenterV2	// class@0028ca
{
    public PublishSubject p;
    public LiveExploreFragment q;
    public boolean r;
    public boolean s;
    public long t;
    public static String sLivePresenterClassName = "LiveDoubleListAutoRefreshPresenter";

    public void f(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       this.t = -1;
       this.X7(this.q.Vg().g().doOnNext(new c(this)).filter(new e(this)).subscribe(new d(this)));
       this.X7(this.p.subscribe(new b(this)));
       this.X7(f.a(h.class, new a(this)));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.q = this.r8("FRAGMENT");
       this.p = this.r8("FRAGMENT_CLICK_SUBJECT");
       return;
    }
    public void onHomeSwitchEvent(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "3")) {
          return;
       }
       if (!this.t - -1) {
          this.t = System.currentTimeMillis();
       }
       return;
    }
}
