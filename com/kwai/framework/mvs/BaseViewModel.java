package com.kwai.framework.mvs.BaseViewModel;
import androidx.lifecycle.ViewModel;
import sa6.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.framework.mvs.BaseViewModel$stateLiveData$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.framework.mvs.BaseViewModel$compositeDisposable$2;
import com.kwai.framework.mvs.BaseViewModel$stateObservable$2;
import com.kwai.framework.mvs.BaseViewModel$stateClass$2;
import sa6.a;
import androidx.lifecycle.MutableLiveData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.LiveData;

public abstract class BaseViewModel extends ViewModel	// class@001786
{
    public final p b;
    public final p c;
    public b d;
    public b e;
    public final p f;
    public final p g;
    public final b h;

    public void BaseViewModel(b p0){
       a.p(p0, "initState");
       super();
       this.h = p0;
       this.b = s.c(new BaseViewModel$stateLiveData$2(this));
       this.c = s.c(BaseViewModel$compositeDisposable$2.INSTANCE);
       this.d = p0;
       this.e = p0;
       this.f = s.c(new BaseViewModel$stateObservable$2(this));
       this.g = s.c(new BaseViewModel$stateClass$2(this));
    }
    public abstract b o0(a p0,b p1);
    public final b p0(){
       return this.e;
    }
    public final b q0(){
       return this.d;
    }
    public final MutableLiveData r0(){
       Object obj = PatchProxy.apply(null, this, BaseViewModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final void s0(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseViewModel.class, "8")) {
          return;
       }
       a.p(p0, "newState");
       b value = this.r0().getValue();
       if (value == null) {
          value = this.h;
       }
       this.d = value;
       this.e = p0;
       this.r0().setValue(p0);
       return;
    }
}
