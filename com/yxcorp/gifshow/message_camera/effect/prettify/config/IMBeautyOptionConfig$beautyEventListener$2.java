package com.yxcorp.gifshow.message_camera.effect.prettify.config.IMBeautyOptionConfig$beautyEventListener$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.message_camera.effect.prettify.config.IMBeautyOptionConfig;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.message_camera.effect.prettify.config.IMBeautyOptionConfig$beautyEventListener$2$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class IMBeautyOptionConfig$beautyEventListener$2 extends Lambda implements a	// class@001db2
{
    public final BaseFragment $prettifyFragment;
    public final IMBeautyOptionConfig this$0;

    public void IMBeautyOptionConfig$beautyEventListener$2(IMBeautyOptionConfig p0,BaseFragment p1){
       this.this$0 = p0;
       this.$prettifyFragment = p1;
       super(0);
    }
    public final IMBeautyOptionConfig$beautyEventListener$2$a invoke(){
       Object obj = PatchProxy.apply(null, this, IMBeautyOptionConfig$beautyEventListener$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new IMBeautyOptionConfig$beautyEventListener$2$a(this);
    }
    public Object invoke(){
       return this.invoke();
    }
}
