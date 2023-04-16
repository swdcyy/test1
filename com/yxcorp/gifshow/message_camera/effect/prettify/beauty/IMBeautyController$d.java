package com.yxcorp.gifshow.message_camera.effect.prettify.beauty.IMBeautyController$d;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import dc5.c;

public final class IMBeautyController$d implements g	// class@001da7
{
    public static final IMBeautyController$d b;

    static {
       IMBeautyController$d.b = new IMBeautyController$d();
    }
    public void IMBeautyController$d(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMBeautyController$d.class, "1")) {
       }else {
          c.c("IMBeautyController", "restoreLastBeautifyConfig error "+p0);
       }
       return;
    }
}
