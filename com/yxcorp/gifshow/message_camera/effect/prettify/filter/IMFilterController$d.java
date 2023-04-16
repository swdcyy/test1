package com.yxcorp.gifshow.message_camera.effect.prettify.filter.IMFilterController$d;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import dc5.c;

public final class IMFilterController$d implements g	// class@001dc6
{
    public static final IMFilterController$d b;

    static {
       IMFilterController$d.b = new IMFilterController$d();
    }
    public void IMFilterController$d(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMFilterController$d.class, "1")) {
       }else {
          c.c("IMFilterController", "updateFilterConfigAndRestore error "+p0);
       }
       return;
    }
}
