package com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.model.LiveMultiLinePuzzleModel$a;
import erd.g;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.model.LiveMultiLinePuzzleModel;
import java.lang.Object;
import zr1.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kuaishou.android.live.log.b;
import xr1.f;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.protobuf.livestream.nano.SCLivePuzzleStatistics;
import android.util.Base64;

public final class LiveMultiLinePuzzleModel$a implements g	// class@0015a9
{
    public final LiveMultiLinePuzzleModel b;

    public void LiveMultiLinePuzzleModel$a(LiveMultiLinePuzzleModel p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLinePuzzleModel$a.class, "1")) {
       }else {
          b.P(this.b.a, "query statistics success");
          p0 = p0.statisticsPbStr;
          Object obj = null;
          Object obj1 = PatchProxy.applyOneRefs(p0, obj, f.class, "2");
          if (obj1 != PatchProxyResult.class) {
             obj = obj1;
          }else if(p0 == null || !p0.length()){
             i = 1;
          }else {
             i = 0;
          }
          if (!i) {
             try{
                obj = SCLivePuzzleStatistics.parseFrom(Base64.decode(p0, 0));
             }catch(java.lang.Exception e0){
             }
          }
       }
       return;
    }
}
