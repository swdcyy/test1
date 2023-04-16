package com.yxcorp.gifshow.message_camera.effect.prettify.beauty.IMBeautyController$b;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.message_camera.effect.prettify.beauty.IMBeautyController;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import q0c.c;

public final class IMBeautyController$b implements Callable	// class@001da4
{
    public final IMBeautyController b;
    public final BeautifyConfig c;

    public void IMBeautyController$b(IMBeautyController p0,BeautifyConfig p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object call(){
       Boolean uBoolean = PatchProxy.apply(null, this, IMBeautyController$b.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          c.b(this.c);
          uBoolean = Boolean.valueOf(this.b.j());
       }
       return uBoolean;
    }
}
