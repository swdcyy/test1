package com.yxcorp.gifshow.message_camera.effect.prettify.config.IMFilterOptionConfig$eventListener$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.message_camera.effect.prettify.config.IMFilterOptionConfig;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.message_camera.effect.prettify.config.IMFilterOptionConfig$eventListener$2$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class IMFilterOptionConfig$eventListener$2 extends Lambda implements a	// class@001db8
{
    public final BaseFragment $prettifyFragment;
    public final IMFilterOptionConfig this$0;

    public void IMFilterOptionConfig$eventListener$2(IMFilterOptionConfig p0,BaseFragment p1){
       this.this$0 = p0;
       this.$prettifyFragment = p1;
       super(0);
    }
    public final IMFilterOptionConfig$eventListener$2$a invoke(){
       Object obj = PatchProxy.apply(null, this, IMFilterOptionConfig$eventListener$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new IMFilterOptionConfig$eventListener$2$a(this);
    }
    public Object invoke(){
       return this.invoke();
    }
}
