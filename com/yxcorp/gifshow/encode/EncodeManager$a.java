package com.yxcorp.gifshow.encode.EncodeManager$a;
import c26.d;
import com.yxcorp.gifshow.encode.EncodeManager;
import java.lang.Object;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo$Status;
import com.kwai.feature.post.api.feature.encode.model.PostEncodeInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dq.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Float;

public class EncodeManager$a implements d	// class@000d01
{
    public final EncodeManager a;

    public void EncodeManager$a(EncodeManager p0){
       this.a = p0;
       super();
    }
    public void a(EncodeInfo$Status p0,PostEncodeInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EncodeManager$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EncodeManager", "atlasEncode status: "+p0, objArray);
       this.a.z(p1);
       return;
    }
    public void b(float p0,PostEncodeInfo p1){
       EncodeManager$a uoa = EncodeManager$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, this, uoa, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EncodeManager", "onProgressChanged: progress: "+p0, objArray);
       this.a.y(p1);
       return;
    }
}
