package com.yxcorp.gifshow.message_camera.effect.IMEffectManager$filterController$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.message_camera.effect.IMEffectManager;
import com.yxcorp.gifshow.message_camera.effect.prettify.filter.IMFilterController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import n0c.a;
import com.yxcorp.gifshow.prettify.filter.data.FilterStateManager;

public final class IMEffectManager$filterController$2 extends Lambda implements a	// class@001d85
{
    public final IMEffectManager this$0;

    public void IMEffectManager$filterController$2(IMEffectManager p0){
       this.this$0 = p0;
       super(0);
    }
    public final IMFilterController invoke(){
       Object obj = PatchProxy.apply(null, this, IMEffectManager$filterController$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new IMFilterController(this.this$0.c().c());
    }
    public Object invoke(){
       return this.invoke();
    }
}
