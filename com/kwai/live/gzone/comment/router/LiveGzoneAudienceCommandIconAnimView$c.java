package com.kwai.live.gzone.comment.router.LiveGzoneAudienceCommandIconAnimView$c;
import android.animation.TypeEvaluator;
import com.kwai.live.gzone.comment.router.LiveGzoneAudienceCommandIconAnimView;
import java.lang.Object;
import android.graphics.PointF;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;

public class LiveGzoneAudienceCommandIconAnimView$c implements TypeEvaluator	// class@000ca2
{
    public final LiveGzoneAudienceCommandIconAnimView a;

    public void LiveGzoneAudienceCommandIconAnimView$c(LiveGzoneAudienceCommandIconAnimView p0){
       this.a = p0;
       super();
    }
    public Object evaluate(float p0,Object p1,Object p2){
       PointF pointF;
       if (PatchProxy.isSupport(LiveGzoneAudienceCommandIconAnimView$c.class)) {
          pointF = PatchProxy.applyThreeRefs(Float.valueOf(p0), p1, p2, this, LiveGzoneAudienceCommandIconAnimView$c.class, "1");
          if (pointF != PatchProxyResult.class) {
          label_0035 :
             return pointF;
          }
       }
       pointF = new PointF();
       pointF.x = p1.x;
       p1 = p1.y;
       pointF.y = p1 + (p0 * (p2.y - p1));
       goto label_0035 ;
    }
}
