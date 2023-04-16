package com.yxcorp.gifshow.camera.record.video.i;
import qi9.r1;
import com.yxcorp.gifshow.camera.record.video.k;
import java.lang.Object;
import java.util.Objects;
import oh9.b0;
import java.lang.Runnable;
import ekd.k1;

public final class i implements r1	// class@000f88
{
    public final k a;

    public void i(k p0){
       this.a = p0;
    }
    public final void onBacklightDetectorResult(boolean p0){
       i ta = this.a;
       Objects.requireNonNull(ta);
       k1.o(new b0(ta, p0));
    }
}
