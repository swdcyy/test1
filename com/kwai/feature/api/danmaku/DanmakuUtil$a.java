package com.kwai.feature.api.danmaku.DanmakuUtil$a;
import ub.a;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.ImageView;

public final class DanmakuUtil$a extends a	// class@000e6f
{
    public final ViewGroup$LayoutParams b;
    public final int c;
    public final KwaiImageView d;

    public void DanmakuUtil$a(ViewGroup$LayoutParams p0,int p1,KwaiImageView p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DanmakuUtil$a.class, "1")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "throwable");
       DanmakuUtil$a tb = this.b;
       tb.width = this.c;
       this.d.setLayoutParams(tb);
       return;
    }
}
