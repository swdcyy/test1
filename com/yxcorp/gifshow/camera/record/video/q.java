package com.yxcorp.gifshow.camera.record.video.q;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.video.RecordFragment;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.base.CameraBaseFragment;
import oh9.p0;
import com.yxcorp.gifshow.camerasdk.j$p;
import com.yxcorp.gifshow.camerasdk.j;

public final class q implements Runnable	// class@000f90
{
    public final RecordFragment b;

    public void q(RecordFragment p0){
       this.b = p0;
    }
    public final void run(){
       q tb = this.b;
       tb.q.f(new p0(tb));
    }
}
