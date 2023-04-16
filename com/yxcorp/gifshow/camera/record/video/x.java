package com.yxcorp.gifshow.camera.record.video.x;
import z1.a;
import com.yxcorp.gifshow.camera.record.video.StandardCameraFragment;
import com.yxcorp.gifshow.camera.record.video.StandardCameraFragment$a;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.RecordPModuleRegister$a;
import java.util.Objects;
import oh9.p2;
import com.yxcorp.gifshow.camera.record.video.StandardCameraFragment$a$a;

public final class x implements a	// class@000f9c
{
    public final StandardCameraFragment a;
    public final StandardCameraFragment$a b;

    public void x(StandardCameraFragment p0,StandardCameraFragment$a p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void accept(Object p0){
       x ta = this.a;
       Objects.requireNonNull(ta);
       this.b.a(new p2(ta, p0));
    }
}
