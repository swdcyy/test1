package com.yxcorp.gifshow.message_camera.effect.IMEffectManager$beautyController$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.message_camera.effect.IMEffectManager;
import com.yxcorp.gifshow.message_camera.effect.prettify.beauty.IMBeautyController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import n0c.a;
import r0c.h;

public final class IMEffectManager$beautyController$2 extends Lambda implements a	// class@001d83
{
    public final IMEffectManager this$0;

    public void IMEffectManager$beautyController$2(IMEffectManager p0){
       this.this$0 = p0;
       super(0);
    }
    public final IMBeautyController invoke(){
       Object obj = PatchProxy.apply(null, this, IMEffectManager$beautyController$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new IMBeautyController(this.this$0.c().b());
    }
    public Object invoke(){
       return this.invoke();
    }
}
