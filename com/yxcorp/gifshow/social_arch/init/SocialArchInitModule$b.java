package com.yxcorp.gifshow.social_arch.init.SocialArchInitModule$b;
import com.kwai.plugin.dva.work.c$c;
import java.lang.Object;
import java.lang.Exception;
import sj7.d;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.social_arch.init.a;
import java.lang.Runnable;
import com.kwai.framework.init.e;

public final class SocialArchInitModule$b implements c$c	// class@001d77
{

    public void SocialArchInitModule$b(){
       super();
    }
    public void onFailed(Exception p0){
    }
    public void onProgress(float p0){
    }
    public void onStart(){
       d.a(this);
    }
    public void onSucceed(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialArchInitModule$b.class, "1")) {
       }else {
          e.h(a.b, "RubasInitTask", true);
       }
       return;
    }
}
