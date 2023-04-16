package com.yxcorp.gifshow.camera.record.video.j;
import qi9.s1;
import com.yxcorp.gifshow.camera.record.video.k;
import java.lang.Object;
import java.util.Objects;
import oh9.a0;
import java.lang.Runnable;
import ekd.k1;

public final class j implements s1	// class@000f89
{
    public final k a;

    public void j(k p0){
       this.a = p0;
    }
    public final void onLowLightDetectorResult(boolean p0){
       j ta = this.a;
       Objects.requireNonNull(ta);
       k1.o(new a0(ta, p0));
    }
}
