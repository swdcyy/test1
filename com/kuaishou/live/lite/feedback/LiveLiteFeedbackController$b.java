package com.kuaishou.live.lite.feedback.LiveLiteFeedbackController$b;
import hka.a;
import com.kuaishou.live.lite.feedback.LiveLiteFeedbackController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ci3.b;

public final class LiveLiteFeedbackController$b implements a	// class@0008f4
{
    public final LiveLiteFeedbackController b;

    public void LiveLiteFeedbackController$b(LiveLiteFeedbackController p0){
       this.b = p0;
       super();
    }
    public final boolean onBackPressed(){
       LiveLiteFeedbackController obj = PatchProxy.apply(null, this, LiveLiteFeedbackController$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.j;
       if (obj == null || !obj.b()) {
          return false;
       }
       obj.a();
       return true;
    }
}
