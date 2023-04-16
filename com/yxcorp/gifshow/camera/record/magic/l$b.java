package com.yxcorp.gifshow.camera.record.magic.l$b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.camera.record.magic.l;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import m4b.c;
import com.kwai.feature.post.funnel.PostCommonFunnel;

public class l$b extends m	// class@000e46
{
    public final l c;

    public void l$b(l p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$b.class, "1")) {
          return;
       }
       this.c.p.L();
       PostCommonFunnel.b.b(p0, "camera_magic_btn");
       return;
    }
}
