package com.yxcorp.gifshow.camera.record.viewbinder.DefaultCameraActivityViewBinder;
import com.yxcorp.gifshow.camera.record.viewbinder.AbsCameraActivityViewBinder;
import c35.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ag6.a;

public class DefaultCameraActivityViewBinder extends AbsCameraActivityViewBinder	// class@000fa0
{

    public void DefaultCameraActivityViewBinder(c p0){
       super(p0);
    }
    public int p(){
       return 0x7f0d016b;
    }
    public View u(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, DefaultCameraActivityViewBinder.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.c(p0, R.layout.camera_container_activity_v2, p1, false);
       a.o(view, "inflater.inflate\(R.layou¡­ity_v2, container, false\)");
       return view;
    }
}
