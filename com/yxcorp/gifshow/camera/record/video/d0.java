package com.yxcorp.gifshow.camera.record.video.d0;
import z1.a;
import com.yxcorp.gifshow.camera.record.video.StandardCameraFragment;
import com.yxcorp.gifshow.camera.record.video.StandardCameraFragment$a;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.RecordPModuleRegister$a;
import java.util.Objects;
import oh9.v2;
import com.yxcorp.gifshow.camera.record.video.StandardCameraFragment$a$a;

public final class d0 implements a	// class@000f7c
{
    public final StandardCameraFragment a;
    public final StandardCameraFragment$a b;

    public void d0(StandardCameraFragment p0,StandardCameraFragment$a p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void accept(Object p0){
       d0 ta = this.a;
       Objects.requireNonNull(ta);
       this.b.a(new v2(ta, p0));
    }
}
