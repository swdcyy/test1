package ej2.w;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveActivityPopup;
import android.content.Context;
import t02.r1;
import t02.a0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import z12.x;

public class w	// class@00273e
{

    public void w(){
       super();
    }
    public static void a(LiveActivityPopup p0,Context p1,r1 p2,a0 p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, w.class, "1")) {
          return;
       }
       if (p0 == null) {
          b.Z(LiveLogTag.SCORE_RANK, "start router error : info is null");
          return;
       }else if(p0.linkType == 1){
          x.K(p0.link, p1, p2, p3);
       }
       return;
    }
}
