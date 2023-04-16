package com.kwai.live.gzone.emotion.l$a;
import com.yxcorp.gifshow.widget.m;
import com.kwai.live.gzone.emotion.l;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.emotionsdk.bean.EmotionInfo;
import com.kwai.live.gzone.emotion.k$b;

public class l$a extends m	// class@000ce8
{
    public final l c;

    public void l$a(l p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$a.class, "1")) {
          return;
       }
       l$a tc = this.c;
       l r = tc.r;
       if (r != null) {
          r.a(p0, tc.p);
       }
       l$a tc1 = this.c;
       tc1.P8(tc1.p);
       return;
    }
}
