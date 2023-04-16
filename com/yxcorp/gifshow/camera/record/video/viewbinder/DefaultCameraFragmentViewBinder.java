package com.yxcorp.gifshow.camera.record.video.viewbinder.DefaultCameraFragmentViewBinder;
import com.yxcorp.gifshow.camera.record.video.viewbinder.AbsCameraFragmentViewBinder;
import c35.c;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ekd.m1;
import com.yxcorp.gifshow.widget.record.BaseRecordButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.ViewStub;

public class DefaultCameraFragmentViewBinder extends AbsCameraFragmentViewBinder	// class@000f98
{

    public void DefaultCameraFragmentViewBinder(c p0){
       super(p0);
    }
    public void s(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultCameraFragmentViewBinder.class, "1")) {
          return;
       }
       a.p(p0, "view");
       this.e = m1.f(p0, 0x7f0a34a7);
       this.g = m1.f(p0, 0x7f0a34b8);
       this.h = m1.f(p0, 0x7f0a0086);
       this.i = m1.f(p0, 0x7f0a0518);
       this.j = m1.f(p0, 0x7f0a3eef);
       this.k = m1.f(p0, 0x7f0a0971);
       return;
    }
    public int y(){
       return 0x7f0d016f;
    }
}
