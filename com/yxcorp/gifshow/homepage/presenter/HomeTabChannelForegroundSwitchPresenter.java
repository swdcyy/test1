package com.yxcorp.gifshow.homepage.presenter.HomeTabChannelForegroundSwitchPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.homepage.presenter.HomeTabChannelForegroundSwitchPresenter$handler$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import org.greenrobot.eventbus.a;
import android.os.Handler;
import kotlin.jvm.internal.a;
import java.lang.Runnable;
import com.kwai.robust.PatchProxyResult;
import m56.f;
import com.yxcorp.gifshow.homepage.presenter.HomeTabChannelForegroundSwitchPresenter$a;
import com.yxcorp.gifshow.homepage.experiment.HomeExperimentManager;
import java.lang.Number;
import m56.g;

public abstract class HomeTabChannelForegroundSwitchPresenter extends PresenterV2	// class@001793
{
    public final p p;
    public Runnable q;

    public void HomeTabChannelForegroundSwitchPresenter(){
       super();
       this.p = s.c(HomeTabChannelForegroundSwitchPresenter$handler$2.INSTANCE);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, HomeTabChannelForegroundSwitchPresenter.class, "2")) {
          return;
       }
       a.d().p(this);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, HomeTabChannelForegroundSwitchPresenter.class, "5")) {
          return;
       }
       a.d().t(this);
       if (this.q != null) {
          HomeTabChannelForegroundSwitchPresenter tq = this.q;
          a.m(tq);
          this.P8().removeCallbacks(tq);
       }
       return;
    }
    public final Handler P8(){
       Object obj = PatchProxy.apply(null, this, HomeTabChannelForegroundSwitchPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.getValue();
    }
    public abstract void R8();
    public void onBackground(f p0){
       String str = "4";
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeTabChannelForegroundSwitchPresenter.class, str)) {
          return;
       }
       a.p(p0, "event");
       if (this.q == null) {
          this.q = new HomeTabChannelForegroundSwitchPresenter$a(this);
       }
       Handler handler = this.P8();
       HomeTabChannelForegroundSwitchPresenter tq = this.q;
       a.m(tq);
       Number number = PatchProxy.apply(null, null, HomeExperimentManager.class, str);
       if (number == PatchProxyResult.class) {
          number = HomeExperimentManager.d.getValue();
       }
       handler.postDelayed(tq, number.longValue());
       return;
    }
    public void onForeground(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeTabChannelForegroundSwitchPresenter.class, "3")) {
          return;
       }
       a.p(p0, "event");
       if (this.q != null) {
          HomeTabChannelForegroundSwitchPresenter tq = this.q;
          a.m(tq);
          this.P8().removeCallbacks(tq);
       }
       return;
    }
}
