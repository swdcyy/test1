package com.yxcorp.gifshow.camera.record.music.f$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.camera.record.music.f;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.post.funnel.PostCommonFunnel;

public class f$a extends m	// class@000e73
{
    public final f c;

    public void f$a(f p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "1")) {
          return;
       }
       this.c.h2();
       PostCommonFunnel.b.b(p0, "camera_music_btn");
       return;
    }
}
