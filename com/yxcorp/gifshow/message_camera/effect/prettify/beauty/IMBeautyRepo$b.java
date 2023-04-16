package com.yxcorp.gifshow.message_camera.effect.prettify.beauty.IMBeautyRepo$b;
import java.lang.Runnable;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dc5.c;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import fg6.a;
import com.google.gson.Gson;
import u4d.a;
import java.lang.StringBuilder;

public final class IMBeautyRepo$b implements Runnable	// class@001dac
{
    public final List b;

    public void IMBeautyRepo$b(List p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, IMBeautyRepo$b.class, "1")) {
          return;
       }
       if (this.b.isEmpty()) {
          c.g("IMBeautyRepo", "saveConfigs configs is empty");
          return;
       }else {
          a.a(a.a.q(CollectionsKt___CollectionsKt.G5(this.b)));
          return;
       }
    }
}
