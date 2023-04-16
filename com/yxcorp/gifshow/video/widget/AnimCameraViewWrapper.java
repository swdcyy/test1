package com.yxcorp.gifshow.video.widget.AnimCameraViewWrapper;
import com.yxcorp.gifshow.video.widget.CameraViewWrapper;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import gxc.b;
import android.widget.FrameLayout;

public final class AnimCameraViewWrapper extends CameraViewWrapper	// class@00169e
{
    public HashMap f;

    public void AnimCameraViewWrapper(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void AnimCameraViewWrapper(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void AnimCameraViewWrapper(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public void AnimCameraViewWrapper(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public View b(){
       Object obj = PatchProxy.apply(null, this, AnimCameraViewWrapper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Context context = this.getContext();
       a.o(context, "context");
       return this.getCameraVideoPlugin().yi(context);
    }
}
