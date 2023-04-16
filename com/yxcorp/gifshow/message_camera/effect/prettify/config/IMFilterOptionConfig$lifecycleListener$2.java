package com.yxcorp.gifshow.message_camera.effect.prettify.config.IMFilterOptionConfig$lifecycleListener$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.message_camera.effect.prettify.config.IMFilterOptionConfig$lifecycleListener$2$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class IMFilterOptionConfig$lifecycleListener$2 extends Lambda implements a	// class@001dba
{
    public final BaseFragment $prettifyFragment;

    public void IMFilterOptionConfig$lifecycleListener$2(BaseFragment p0){
       this.$prettifyFragment = p0;
       super(0);
    }
    public final IMFilterOptionConfig$lifecycleListener$2$a invoke(){
       Object obj = PatchProxy.apply(null, this, IMFilterOptionConfig$lifecycleListener$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new IMFilterOptionConfig$lifecycleListener$2$a(this);
    }
    public Object invoke(){
       return this.invoke();
    }
}
