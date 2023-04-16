package com.yxcorp.gifshow.upload.f1;
import erd.g;
import com.yxcorp.gifshow.upload.g1;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.upload.SegmentUploader;
import java.lang.Float;
import java.util.List;

public class f1 implements g	// class@001e79
{
    public final g1 b;

    public void f1(g1 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f1.class, "1")) {
       }else {
          this.b.d.k.add(Float.valueOf(0));
       }
       return;
    }
}
