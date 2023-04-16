package com.yxcorp.gifshow.message_camera.effect.prettify.config.IMMakeupOptionConfig$lifecycleListener$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.message_camera.effect.prettify.config.IMMakeupOptionConfig;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.message_camera.effect.prettify.config.IMMakeupOptionConfig$lifecycleListener$2$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class IMMakeupOptionConfig$lifecycleListener$2 extends Lambda implements a	// class@001dc0
{
    public final BaseFragment $prettifyFragment;
    public final IMMakeupOptionConfig this$0;

    public void IMMakeupOptionConfig$lifecycleListener$2(IMMakeupOptionConfig p0,BaseFragment p1){
       this.this$0 = p0;
       this.$prettifyFragment = p1;
       super(0);
    }
    public final IMMakeupOptionConfig$lifecycleListener$2$a invoke(){
       Object obj = PatchProxy.apply(null, this, IMMakeupOptionConfig$lifecycleListener$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new IMMakeupOptionConfig$lifecycleListener$2$a(this);
    }
    public Object invoke(){
       return this.invoke();
    }
}
