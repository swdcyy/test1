package com.yxcorp.gifshow.init.module.VolumeControlSystemInitModule;
import com.kwai.framework.init.HomeCreateInitModule;
import android.app.Activity;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class VolumeControlSystemInitModule extends HomeCreateInitModule	// class@0019ab
{

    public void VolumeControlSystemInitModule(){
       super();
    }
    public int f0(){
       return 14;
    }
    public void l0(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, VolumeControlSystemInitModule.class, "1")) {
          return;
       }
       p0.setVolumeControlStream(3);
       PatchProxy.onMethodExit(VolumeControlSystemInitModule.class, "1");
       return;
    }
    public void n(){
    }
}
