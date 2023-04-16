package com.yxcorp.gifshow.camera.record.video.c0;
import z1.a;
import com.yxcorp.gifshow.camera.record.video.StandardCameraFragment;
import com.yxcorp.gifshow.camera.record.video.StandardCameraFragment$a;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.RecordPModuleRegister$a;
import java.util.Objects;
import oh9.u2;
import com.yxcorp.gifshow.camera.record.video.StandardCameraFragment$a$a;

public final class c0 implements a	// class@000f7a
{
    public final StandardCameraFragment a;
    public final StandardCameraFragment$a b;

    public void c0(StandardCameraFragment p0,StandardCameraFragment$a p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void accept(Object p0){
       c0 ta = this.a;
       Objects.requireNonNull(ta);
       this.b.a(new u2(ta, p0));
    }
}
