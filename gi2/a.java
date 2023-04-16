package gi2.a;
import gi2.b;
import dx1.b;
import java.lang.Object;
import vg2.a;
import com.kuaishou.livestream.message.nano.LiveRedPackMessage$AudienceRedPack;
import java.lang.String;
import nsd.u;
import com.kwai.feature.api.live.service.show.redpacket.redpacket.model.RedPacket;
import java.util.Objects;
import android.view.View;
import kotlin.jvm.internal.a;
import android.view.ViewPropertyAnimator;
import gi2.a$a;
import android.animation.Animator$AnimatorListener;
import xp5.i;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import tw1.d;

public final class a	// class@002b24
{

    public static b a(b p0){
       a obj = p0.v1();
       if (obj instanceof a) {
          obj = obj.a;
          LiveRedPackMessage$AudienceRedPack redPackId = (obj != null)? obj.redPackId: "";
          LiveRedPackMessage$AudienceRedPack uAudienceRed = redPackId;
          LiveRedPackMessage$AudienceRedPack uAudienceRed1 = (obj != null)? obj.type: 0;
          b uob = new b(uAudienceRed, uAudienceRed1, 0, 4, null);
          return v1;
       }else if(obj instanceof RedPacket){
          Objects.requireNonNull(b.d);
          int i = (obj.isUseNewStyle())? 2: 1;
          return new b(obj.mId, obj.mRedPackType, i);
       }else {
          return null;
       }
    }
    public static void b(b p0,View p1){
       a.p(p1, "topAtmosphereImageView");
       p1.animate().alpha(0).setDuration(300).setListener(new a$a(p1)).start();
    }
    public static void c(b p0,i p1,String p2,int p3,String p4,String p5){
       a.p(p2, "redPacketId");
       if (p1 != null) {
          d.j(p1.getPage(), p1.a(), p1.b4(), p2, p3, p4, p5);
       }
       return;
    }
}
