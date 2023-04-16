package com.yxcorp.gifshow.message_camera.effect.prettify.beauty.IMBeautyController$c;
import erd.g;
import com.yxcorp.gifshow.message_camera.effect.prettify.beauty.IMBeautyController;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dc5.c;
import java.lang.StringBuilder;

public final class IMBeautyController$c implements g	// class@001da6
{
    public final IMBeautyController b;
    public final BeautifyConfig c;

    public void IMBeautyController$c(IMBeautyController p0,BeautifyConfig p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMBeautyController$c.class, "1")) {
       }else {
          String str = "IMBeautyController";
          if (!p0.booleanValue()) {
             c.g(str, "restoreLastBeautifyConfig not ready");
          }else {
             c.g(str, "restoreLastBeautifyConfig setBeautify "+this.c);
             p0 = this.c;
             if (p0 != null) {
                this.b.c(p0);
             }
          }
       }
       return;
    }
}
