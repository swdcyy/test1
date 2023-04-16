package com.kuaishou.live.common.core.basic.livepresenter.LiveVCHostPresenter$controllerManager$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.basic.livepresenter.LiveVCHostPresenter;
import com.kuaishou.live.viewcontroller.ViewControllerManagerImpl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.a;
import com.kuaishou.live.viewcontroller.lifecycle.LifecyclesExt;
import android.content.Context;
import com.kuaishou.live.viewcontroller.ViewHost;
import android.view.View;
import com.kuaishou.live.viewcontroller.ViewHost$Companion;

public final class LiveVCHostPresenter$controllerManager$2 extends Lambda implements a	// class@000eaf
{
    public final LiveVCHostPresenter this$0;

    public void LiveVCHostPresenter$controllerManager$2(LiveVCHostPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final ViewControllerManagerImpl invoke(){
       LifecycleOwner lifecycleOwn1;
       Activity obj = PatchProxy.apply(null, this, LiveVCHostPresenter$controllerManager$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.getActivity();
       if (this.this$0.V8() != null) {
          LiveVCHostPresenter$controllerManager$2 tthis$0 = this.this$0;
          LifecycleOwner lifecycleOwn = tthis$0.V8();
          a.m(lifecycleOwn);
          lifecycleOwn1 = LifecyclesExt.a(tthis$0, lifecycleOwn);
       }else if(obj instanceof LifecycleOwner){
          lifecycleOwn1 = LifecyclesExt.a(this.this$0, obj);
       }else {
          lifecycleOwn1 = this.this$0;
       }
       a.m(obj);
       Context context = this.this$0.getContext();
       a.m(context);
       a.o(context, "context!!");
       View view = this.this$0.m8();
       a.o(view, "rootView");
       return new ViewControllerManagerImpl(lifecycleOwn1, obj, context, ViewHost.a.b(view));
    }
    public Object invoke(){
       return this.invoke();
    }
}
