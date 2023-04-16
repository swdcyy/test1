package com.kuaishou.live.common.core.component.gift.base.model.Model$observer$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.concurrent.ConcurrentHashMap;

public final class Model$observer$1 implements DefaultLifecycleObserver	// class@00114a
{
    public final Model b;
    public final Model$a c;

    public void Model$observer$1(Model p0,Model$a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Model$observer$1.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       this.b.c.remove(this.c);
       return;
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       a.d(this, p0);
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
