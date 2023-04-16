package com.kwai.component.perflog.delegate.DefaultPerfLogTrackerDelegate;
import ed5.g;
import java.lang.String;
import androidx.fragment.app.c;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import dd5.i;
import androidx.fragment.app.c$b;
import androidx.lifecycle.Lifecycle;
import com.kwai.component.perflog.delegate.DefaultPerfLogTrackerDelegate$1;
import androidx.lifecycle.LifecycleObserver;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import kuaishou.perf.page.impl.b;
import com.smile.gifmaker.mvps.presenter.MainThreadScatterPresenterGroup;
import gd5.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Long;
import gd5.b;
import java.util.Map;
import ed5.f;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.component.uiconfig.browsestyle.model.BrowseStyle;
import uh5.e;
import com.yxcorp.gifshow.powermode.PowerModeHelper;
import java.util.Objects;

public final class DefaultPerfLogTrackerDelegate implements g	// class@000a05
{
    public final String a;
    public boolean b;

    public void DefaultPerfLogTrackerDelegate(String p0,boolean p1,c p2,LifecycleOwner p3){
       super();
       this.a = p0;
       if (p2 != null) {
          p2.registerFragmentLifecycleCallbacks(new i(p1, this), true);
       }
       p3.getLifecycle().addObserver(new DefaultPerfLogTrackerDelegate$1(this, p3));
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, DefaultPerfLogTrackerDelegate.class, "5")) {
          return;
       }
       Log.g("PerfLogTrackerDelegate", "end, mSceneName = "+this.a);
       if (!this.l()) {
          return;
       }
       b.d(this.a).c();
       this.b = false;
       return;
    }
    public void b(String p0,MainThreadScatterPresenterGroup p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DefaultPerfLogTrackerDelegate.class, "12")) {
          return;
       }
       Log.g("PerfLogTrackerDelegate", "addEndStagePresenter, mSceneName = "+this.a);
       if (!this.l()) {
          return;
       }
       p1.a(new a(p0, this));
       return;
    }
    public void c(String p0,long p1,long p2){
       if (PatchProxy.isSupport(DefaultPerfLogTrackerDelegate.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, DefaultPerfLogTrackerDelegate.class, "8")) {
          return;
       }
       Log.g("PerfLogTrackerDelegate", "recordStage, mSceneName = "+this.a+", name = "+p0);
       if (!this.l()) {
          return;
       }
       b.d(this.a).g(p0, p1, p2);
       return;
    }
    public void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultPerfLogTrackerDelegate.class, "7")) {
          return;
       }
       Log.g("PerfLogTrackerDelegate", "endStage, mSceneName = "+this.a+", name = "+p0);
       if (!this.l()) {
          return;
       }
       b.d(this.a).h(p0);
       return;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultPerfLogTrackerDelegate.class, "6")) {
          return;
       }
       Log.g("PerfLogTrackerDelegate", "startStage, mSceneName = "+this.a+", name = "+p0);
       if (!this.l()) {
          return;
       }
       b.d(this.a).f(p0);
       return;
    }
    public void f(String p0,MainThreadScatterPresenterGroup p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DefaultPerfLogTrackerDelegate.class, "11")) {
          return;
       }
       Log.g("PerfLogTrackerDelegate", "addStartStagePresenter, mSceneName = "+this.a);
       if (!this.l()) {
          return;
       }
       p1.a(new b(p0, this));
       return;
    }
    public void g(String p0,PresenterV2 p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, DefaultPerfLogTrackerDelegate.class, "9")) {
          return;
       }
       Log.g("PerfLogTrackerDelegate", "addStartStagePresenter, mSceneName = "+this.a);
       if (!this.l()) {
          PatchProxy.onMethodExit(DefaultPerfLogTrackerDelegate.class, "9");
          return;
       }else {
          p1.U7(new b(p0, this));
          PatchProxy.onMethodExit(DefaultPerfLogTrackerDelegate.class, "9");
          return;
       }
    }
    public void h(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultPerfLogTrackerDelegate.class, "4")) {
          return;
       }
       Log.g("PerfLogTrackerDelegate", "addExtraParam, mSceneName = "+this.a+", extraParams = "+p0);
       if (this.l() && !p0.isEmpty()) {
          b.d(this.a).b(p0);
       }
       return;
    }
    public void i(String p0,PresenterV2 p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, DefaultPerfLogTrackerDelegate.class, "10")) {
          return;
       }
       Log.g("PerfLogTrackerDelegate", "addEndStagePresenter, mSceneName = "+this.a);
       if (!this.l()) {
          PatchProxy.onMethodExit(DefaultPerfLogTrackerDelegate.class, "10");
          return;
       }else {
          p1.U7(new a(p0, this));
          PatchProxy.onMethodExit(DefaultPerfLogTrackerDelegate.class, "10");
          return;
       }
    }
    public void j(String p0,long p1){
       f.a(this, p0, p1);
    }
    public void k(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DefaultPerfLogTrackerDelegate.class, "3")) {
          return;
       }
       Log.g("PerfLogTrackerDelegate", "addExtraParam, mSceneName= "+this.a+", key = "+p0+",value = "+p1);
       if (this.l() && (!TextUtils.x(p0) && !TextUtils.x(p1))) {
          b.d(this.a).a(p0, p1);
       }
    label_004e :
       return;
    }
    public final boolean l(){
       Object obj = PatchProxy.apply(null, this, DefaultPerfLogTrackerDelegate.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Log.g("PerfLogTrackerDelegate", "enableLogTrack, mSceneName = "+this.a+", mIsStartScene = "+this.b);
       boolean b = (!TextUtils.x(this.a) && this.b != null)? true: false;
       return b;
    }
    public void start(){
       DefaultPerfLogTrackerDelegate uDefaultPerf = DefaultPerfLogTrackerDelegate.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uDefaultPerf, "1")) {
          return;
       }
       this.b = true;
       Log.g("PerfLogTrackerDelegate", "start, mSceneName = "+this.a);
       if (!this.l()) {
          return;
       }
       b.d(this.a).i();
       b.d(this.a).j(0x3f800000);
       b.d(this.a).k();
       if (!PatchProxy.applyVoid(objArray, this, uDefaultPerf, "2")) {
          this.k("userId", QCurrentUser.me().getId());
          this.k("browseType", String.valueOf(e.d().getParamType()));
          Objects.requireNonNull(PowerModeHelper.b());
          this.k("powerMode", "0");
       }
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DefaultPerfLogTrackerDelegate.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DefaultPerfLogTrackerDelegate{mSceneName=\'"+this.a+'''+", mIsStartScene="+this.b+'}';
    }
}
