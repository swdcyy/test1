package cl3.f$b;
import android.view.View$OnLayoutChangeListener;
import cl3.f;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.live.preview.log.LivePreviewLogTag;
import pp.c;
import pp.d;
import android.app.Activity;
import com.yxcorp.utility.n;
import com.kwai.video.waynelive.LivePlayerController;
import com.yxcorp.gifshow.autoplay.live.g;
import cl3.n;
import com.kuaishou.live.common.core.basic.player.AdaptPlayViewReason;

public class f$b implements View$OnLayoutChangeListener	// class@000590
{
    public final f b;

    public void f$b(f p0){
       this.b = p0;
       super();
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport(f$b.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, this, f$b.class, "1")) {
             return;
          }
       }
       p3 = p3 - p1;
       p4 = p4 - p2;
       f$b tb = this.b;
       if (tb.r != p3 || tb.s != p4) {
          Object[] objArray1 = new Object[]{Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(this.b.r),Integer.valueOf(this.b.s)};
          tb.k.h(LivePreviewLogTag.LIVE_PREVIEW_PLAYER, String.format("rootViewLayoutChange nW:%d nH:%d oW:%d oH:%d", objArray1));
          tb = this.b;
          tb.r = p3;
          tb.s = p4;
          tb.p = n.k(tb.i);
          tb = this.b;
          tb.q = n.j(tb.i);
          tb = this.b;
          if (tb.o != null && (tb.t != null && tb.g.Q() != null)) {
             tb = this.b;
             f o = tb.o;
             tb.h(o.a, o.b, AdaptPlayViewReason.DEFAULT);
          }
       }
       return;
    }
}
