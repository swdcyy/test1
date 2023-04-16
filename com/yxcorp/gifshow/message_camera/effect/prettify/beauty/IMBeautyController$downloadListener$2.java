package com.yxcorp.gifshow.message_camera.effect.prettify.beauty.IMBeautyController$downloadListener$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.message_camera.effect.prettify.beauty.IMBeautyController;
import com.yxcorp.gifshow.util.resource.n$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.message_camera.effect.prettify.beauty.IMBeautyController$downloadListener$2$a;

public final class IMBeautyController$downloadListener$2 extends Lambda implements a	// class@001da9
{
    public final IMBeautyController this$0;

    public void IMBeautyController$downloadListener$2(IMBeautyController p0){
       this.this$0 = p0;
       super(0);
    }
    public final n$c invoke(){
       Object obj = PatchProxy.apply(null, this, IMBeautyController$downloadListener$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new IMBeautyController$downloadListener$2$a(this);
    }
    public Object invoke(){
       return this.invoke();
    }
}
