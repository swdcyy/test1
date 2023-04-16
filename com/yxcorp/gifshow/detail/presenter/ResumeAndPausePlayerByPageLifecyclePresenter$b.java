package com.yxcorp.gifshow.detail.presenter.ResumeAndPausePlayerByPageLifecyclePresenter$b;
import sf5.a;
import com.yxcorp.gifshow.detail.presenter.ResumeAndPausePlayerByPageLifecyclePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import sf5.d;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import com.yxcorp.gifshow.entity.QPhoto;

public class ResumeAndPausePlayerByPageLifecyclePresenter$b implements a	// class@0016c4
{
    public final ResumeAndPausePlayerByPageLifecyclePresenter a;

    public void ResumeAndPausePlayerByPageLifecyclePresenter$b(ResumeAndPausePlayerByPageLifecyclePresenter p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, ResumeAndPausePlayerByPageLifecyclePresenter$b.class, "1")) {
          return;
       }
       if (this.a.r.isResumed()) {
          return;
       }
       a uoa = a.d();
       ResumeAndPausePlayerByPageLifecyclePresenter p = this.a.p;
       PlayEvent$Status rESUME = (d.d.g(this.a.v))? PlayEvent$Status.RESUME: PlayEvent$Status.PAUSE;
       uoa.k(new PlayEvent(p, rESUME, 5));
       return;
    }
}
