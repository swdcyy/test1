package com.kuaishou.live.core.basic.dynamicdeploy.LiveDynamicDeployPluginLoader$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.basic.dynamicdeploy.LiveDynamicDeployPluginLoader;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.a;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.live.core.presenter.LiveBizPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class LiveDynamicDeployPluginLoader$1 extends Lambda implements a	// class@000832
{
    public final LiveDynamicDeployPluginLoader this$0;

    public void LiveDynamicDeployPluginLoader$1(LiveDynamicDeployPluginLoader p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, LiveDynamicDeployPluginLoader$1.class, "1")) {
          return;
       }
       this.this$0.a.dispose();
       Iterator iterator = this.this$0.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().destroy();
       }
       return;
    }
}
