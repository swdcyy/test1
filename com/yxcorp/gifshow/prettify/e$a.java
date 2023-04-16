package com.yxcorp.gifshow.prettify.e$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.prettify.e;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ra9.c;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import com.kwai.feature.post.funnel.PostCommonFunnel;

public class e$a extends m	// class@001141
{
    public final e c;

    public void e$a(e p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
          return;
       }
       e d = this.c.D;
       if (d != null && d.i() == RecordBubbleItem.RECO_BEAUTY_GUIDE_BUBBLE) {
          this.c.u2(0, 1);
       }else {
          this.c.t2();
       }
       PostCommonFunnel.b.b(p0, "camera_prettify_btn");
       return;
    }
}
