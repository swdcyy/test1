package com.yxcorp.gifshow.detail.presenter.ResumeAndPausePlayerByPageLifecyclePresenter$2;
import com.yxcorp.gifshow.osbug.FixedLifecycleObserver;
import com.yxcorp.gifshow.detail.presenter.ResumeAndPausePlayerByPageLifecyclePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import sf5.d;
import sf5.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import xs3.f;
import qy4.b;
import xw5.a;
import f4a.r;
import wkd.b;
import gi0.a;
import ju5.g;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import nl9.u;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import com.yxcorp.gifshow.entity.QPhoto;
import androidx.lifecycle.LifecycleOwner;

public class ResumeAndPausePlayerByPageLifecyclePresenter$2 extends FixedLifecycleObserver	// class@0016c2
{
    public boolean f;
    public final ResumeAndPausePlayerByPageLifecyclePresenter g;

    public void ResumeAndPausePlayerByPageLifecyclePresenter$2(ResumeAndPausePlayerByPageLifecyclePresenter p0){
       this.g = p0;
       super();
       this.f = false;
    }
    public void a(){
       boolean b2;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ResumeAndPausePlayerByPageLifecyclePresenter$2.class, "1")) {
          return;
       }
       boolean b = false;
       this.f = b;
       ResumeAndPausePlayerByPageLifecyclePresenter$2 tg = this.g;
       if (tg.t != null) {
          boolean b1 = true;
          if (tg.r.requireActivity().isFinishing()) {
             if (!this.g.q.getDetailPlayConfig().isContinuePlayWhileExit()) {
             label_0103 :
                b = true;
             }
          }else {
             d d = d.d;
             d.a(this.g.y);
             ResumeAndPausePlayerByPageLifecyclePresenter$2 tg1 = this.g;
             Objects.requireNonNull(tg1);
             g obj = PatchProxy.apply(objArray, tg1, ResumeAndPausePlayerByPageLifecyclePresenter.class, "2");
             if (obj != PatchProxyResult.class) {
                b2 = obj.booleanValue();
             }else if(tg1.P8() || (d.g(tg1.v) || (d.a(0x56c46a3d).OT() || (d.a(-1301622019).A3() || d.a(0x2ac28c95).A3())))){
                if (r.a().b()) {
                   r.a().c(b);
                }else {
                   b2 = 0x1959122;
                   if (b.a(b2).n3()) {
                      b.a(b2).o3(b);
                   }else {
                      obj = d.a(0x6ea0c3d0);
                      b2 = (obj != null && obj.needHoldHostPlayer())? true: false;
                      Log.g("HalfAdapt", "needHoldPlayer "+b2);
                      if (!b2 && !d.a(-1694791652).n3()) {
                         b2 = true;
                      }
                   }
                }
             }
          label_005a :
             b2 = false;
             if (b2) {
                goto label_0103 ;
             }
          }
          if (b) {
             this.f = b1;
             a.d().k(new PlayEvent(this.g.p, PlayEvent$Status.PAUSE, 5));
          }
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, ResumeAndPausePlayerByPageLifecyclePresenter$2.class, "2")) {
          return;
       }
       ResumeAndPausePlayerByPageLifecyclePresenter$2 tg = this.g;
       if (tg.t != null) {
          d.d.f(tg.y);
          a.d().k(new PlayEvent(this.g.p, PlayEvent$Status.RESUME, 5));
       }
       return;
    }
    public void onStart(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ResumeAndPausePlayerByPageLifecyclePresenter$2.class, "3")) {
          return;
       }
       super.onStart(p0);
       ResumeAndPausePlayerByPageLifecyclePresenter$2 tg = this.g;
       if (tg.t != null && this.f == null) {
          d.d.a(tg.y);
          a.d().k(new PlayEvent(this.g.p, PlayEvent$Status.RESUME, 34));
       }
       return;
    }
    public void onStop(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ResumeAndPausePlayerByPageLifecyclePresenter$2.class, "4")) {
          return;
       }
       super.onStop(p0);
       ResumeAndPausePlayerByPageLifecyclePresenter$2 tg = this.g;
       if (tg.t != null) {
          PlayEvent playEvent = null;
          if (!tg.r.requireActivity().isFinishing()) {
             d.d.f(this.g.y);
             if (!this.g.P8() && this.f == null) {
                playEvent = 1;
             }
          }
          if (playEvent) {
             a.d().k(new PlayEvent(this.g.p, PlayEvent$Status.PAUSE, 34));
          }
       }
       return;
    }
}
