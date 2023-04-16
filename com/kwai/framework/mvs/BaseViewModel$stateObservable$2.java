package com.kwai.framework.mvs.BaseViewModel$stateObservable$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.mvs.BaseViewModel;
import io.reactivex.subjects.PublishSubject;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import crd.a;
import qrd.p;
import com.kwai.framework.mvs.BaseViewModel$stateObservable$2$a;
import erd.g;
import crd.b;
import brd.t;

public final class BaseViewModel$stateObservable$2 extends Lambda implements a	// class@001785
{
    public final BaseViewModel this$0;

    public void BaseViewModel$stateObservable$2(BaseViewModel p0){
       this.this$0 = p0;
       super(0);
    }
    public final PublishSubject invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       PublishSubject obj = PatchProxy.apply(objArray, this, BaseViewModel$stateObservable$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PublishSubject.g();
       a.o(obj, "PublishSubject.create<S>\(\)");
       BaseViewModel$stateObservable$2 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       Object obj1 = PatchProxy.apply(objArray, tthis$0, BaseViewModel.class, "2");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = tthis$0.c.getValue();
       }
       obj1.c(obj.subscribe(new BaseViewModel$stateObservable$2$a(this)));
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
