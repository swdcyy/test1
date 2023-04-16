package com.yxcorp.gifshow.im_rtc.wrapper.AryaInitManager$a;
import com.kwai.plugin.dva.work.c$c;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.im_rtc.wrapper.AryaInitManager;
import java.lang.StringBuilder;
import sj7.d;

public final class AryaInitManager$a implements c$c	// class@00193d
{

    public void AryaInitManager$a(){
       super();
    }
    public void onFailed(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaInitManager$a.class, "2")) {
          return;
       }
       AryaInitManager.b.d("failed to preload arya, caused by: "+p0);
       return;
    }
    public void onProgress(float p0){
    }
    public void onStart(){
       d.a(this);
    }
    public void onSucceed(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaInitManager$a.class, "1")) {
       }else {
          AryaInitManager.b.d("preload arya success: "+p0);
       }
       return;
    }
}
