package com.yxcorp.gifshow.camera.record.video.a0;
import z1.a;
import com.yxcorp.gifshow.camera.record.video.StandardCameraFragment;
import com.yxcorp.gifshow.camera.record.video.StandardCameraFragment$a;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.RecordPModuleRegister$a;
import java.util.Objects;
import oh9.s2;
import com.yxcorp.gifshow.camera.record.video.StandardCameraFragment$a$a;

public final class a0 implements a	// class@000f76
{
    public final StandardCameraFragment a;
    public final StandardCameraFragment$a b;

    public void a0(StandardCameraFragment p0,StandardCameraFragment$a p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void accept(Object p0){
       a0 ta = this.a;
       Objects.requireNonNull(ta);
       this.b.a(new s2(ta, p0));
    }
}
