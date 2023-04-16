package eo1.a;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.leftinfobar.LiveLeftInfoBarArea;
import bq5.b;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class a implements Runnable	// class@0021d3
{
    public final LiveLeftInfoBarArea b;
    public final b c;
    public final View d;
    public final Animator e;

    public void a(LiveLeftInfoBarArea p0,b p1,View p2,Animator p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       int i = this.d.getHeight() + a1.e(((float)this.c.b() * 0x3f800000));
       if (i) {
          int i1 = this.b.i + i;
          b.d0(LiveCommonLogTag.LEFT_INFO_BAR, "onBubbleAdd", "bubbleHeight", Integer.valueOf(i), "endBottomMargin", Integer.valueOf(i1));
          this.b.n(this.e, i1);
       }
       return;
    }
}
