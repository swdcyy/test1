package com.yxcorp.gifshow.message_camera.effect.prettify.beauty.IMBeautyRepo$c;
import java.lang.Runnable;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u4d.a;
import fg6.a;
import com.google.gson.Gson;
import java.lang.StringBuilder;
import dc5.c;

public final class IMBeautyRepo$c implements Runnable	// class@001dad
{
    public final BeautifyConfig b;

    public void IMBeautyRepo$c(BeautifyConfig p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, IMBeautyRepo$c.class, "1")) {
          return;
       }
       IMBeautyRepo$c tb = this.b;
       if (tb == null) {
          a.b("");
       }else {
          a.b(a.a.q(tb));
       }
       return;
    }
}
