package com.kuaishou.live.audience.gzone.v2.pendant.LiveGzoneActivityPendantView$a;
import ub.a;
import com.kuaishou.live.audience.gzone.v2.pendant.LiveGzoneActivityPendantView;
import com.kuaishou.live.common.gzone.pendant.LiveGzonePendant;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import pp.a;
import q87.c;

public class LiveGzoneActivityPendantView$a extends a	// class@000c30
{
    public final LiveGzonePendant b;
    public final LiveGzoneActivityPendantView c;

    public void LiveGzoneActivityPendantView$a(LiveGzoneActivityPendantView p0,LiveGzonePendant p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGzoneActivityPendantView$a.class, "1")) {
       }else {
          LiveGzoneActivityPendantView$a tc = this.c;
          tc.d = this.b;
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, tc, LiveGzoneActivityPendantView.class, "5")) {
             int i = 0;
             if (!PatchProxy.applyVoid(objArray, tc, LiveGzoneActivityPendantView.class, "6") && tc.getVisibility()) {
                tc.setVisibility(i);
             }
             p1 = new Object[i];
             a.C().s("LiveHalfScreenPendantVi", "PendantImageLoaded", p1);
          }
       }
       return;
    }
}
