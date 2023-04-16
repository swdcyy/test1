package fr2.b;
import java.lang.Object;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.core.voiceparty.crossroompk.resource.VoicePartyCrossRoomPkSkinResource;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hc.b;
import java.lang.Integer;
import com.kuaishou.live.core.voiceparty.crossroompk.resource.a;
import fr2.d;
import java.util.Objects;
import ia1.b;
import com.kuaishou.live.common.core.basic.resource.c;

public class b	// class@0029a1
{

    public void b(){
       super();
    }
    public static void a(KwaiImageView p0,VoicePartyCrossRoomPkSkinResource p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "1")) {
          return;
       }
       b.b(p0, p1, 1, null);
       return;
    }
    public static void b(KwaiImageView p0,VoicePartyCrossRoomPkSkinResource p1,int p2,b p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, null, b.class, "2")) {
          return;
       }
       Objects.requireNonNull(d.b);
       c.d(p0, new a(p1, d.a, p3), p2, p3);
       return;
    }
}
