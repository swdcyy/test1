package com.yxcorp.gifshow.camera.record.video.e0;
import z1.a;
import com.yxcorp.gifshow.camera.record.video.StandardCameraFragment;
import com.yxcorp.gifshow.camera.record.video.StandardCameraFragment$a;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.RecordPModuleRegister$a;
import java.util.Objects;
import oh9.w2;
import com.yxcorp.gifshow.camera.record.video.StandardCameraFragment$a$a;

public final class e0 implements a	// class@000f7e
{
    public final StandardCameraFragment a;
    public final StandardCameraFragment$a b;

    public void e0(StandardCameraFragment p0,StandardCameraFragment$a p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void accept(Object p0){
       e0 ta = this.a;
       Objects.requireNonNull(ta);
       this.b.a(new w2(ta, p0));
    }
}
