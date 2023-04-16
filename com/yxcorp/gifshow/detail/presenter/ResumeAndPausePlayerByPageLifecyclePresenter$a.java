package com.yxcorp.gifshow.detail.presenter.ResumeAndPausePlayerByPageLifecyclePresenter$a;
import d6a.a;
import com.yxcorp.gifshow.detail.presenter.ResumeAndPausePlayerByPageLifecyclePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import e0a.j;
import ok.x;
import java.lang.Integer;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import o56.f;
import o56.d;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.util.rx.RxBus;
import ujc.e;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import y4a.w;
import erd.g;
import crd.b;

public class ResumeAndPausePlayerByPageLifecyclePresenter$a extends a	// class@0016c3
{
    public final ResumeAndPausePlayerByPageLifecyclePresenter b;

    public void ResumeAndPausePlayerByPageLifecyclePresenter$a(ResumeAndPausePlayerByPageLifecyclePresenter p0){
       this.b = p0;
       super();
    }
    public void F1(){
       this.b.t = false;
    }
    public void i2(){
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, ResumeAndPausePlayerByPageLifecyclePresenter$a.class, str)) {
          return;
       }
       ResumeAndPausePlayerByPageLifecyclePresenter$a tb = this.b;
       boolean b = true;
       tb.t = b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, ResumeAndPausePlayerByPageLifecyclePresenter.class, str) && (j.i.get().intValue() == b && (f.b(tb.getActivity()) && d.g))) {
          a.d().k(new PlayEvent(tb.p, PlayEvent$Status.PAUSE, 39));
          tb.X7(RxBus.f.g(e.class, RxBus$ThreadMode.MAIN).subscribe(new w(tb)));
       }
    label_0061 :
       return;
    }
}
