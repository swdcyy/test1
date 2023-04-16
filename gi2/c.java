package gi2.c;
import gi2.d;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import hi2.b;
import java.util.List;
import hi2.d;
import gi2.f;
import android.widget.TextView;
import com.kuaishou.live.core.show.redpacket.LiveRedPacketResourcePathConstant;
import l12.d;
import va1.f0;
import hi2.c;
import java.lang.Integer;
import java.lang.Number;
import java.util.Collection;
import ekd.q;
import com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme;
import dx1.b;
import nsd.u;
import p91.m;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import k2b.e0;
import u52.u;

public final class c	// class@002b26
{

    public static void a(d p0,KwaiImageView p1,KwaiImageView p2){
       a.p(p1, "bottomBackgroundImageView");
       a.p(p2, "atmosphereBottomImageView");
       LiveConditionRedPacketInfo liveConditio = p0.n6();
       if (liveConditio != null && liveConditio.z != null) {
          b uob = p0.W0(liveConditio);
          List list = null;
          List list1 = (uob != null)? uob.c(): list;
          p0.I4(p1, list1);
          if (uob != null) {
             list = uob.a();
          }
          p0.S4(p2, list);
       }
       return;
    }
    public static void b(d p0,KwaiImageView p1,TextView p2,LiveRedPacketResourcePathConstant p3){
       a.p(p3, "defaultRes");
       LiveConditionRedPacketInfo liveConditio = p0.n6();
       b uob = p0.W0(p0.n6());
       liveConditio = (liveConditio != null)? liveConditio.z: null;
       if (p1 != null) {
          f0.a(p1, p3);
       }
       if (uob != null) {
          c uoc = uob.e();
          if (uoc != null && liveConditio != null) {
             Integer integer = uoc.b();
             if (integer != null) {
                int i = integer.intValue();
                if (p2 != null) {
                   p2.setTextColor(i);
                }
             }
             if (p1 != null && !q.f(uoc.a())) {
                p0.y4(p1, uoc.a());
             }
          }
       }
    label_0048 :
       return;
    }
    public static b c(d p0,LiveConditionRedPacketInfo p1){
       if (p1 != null) {
          p1 = p1.A;
          if (p1 != null) {
             a.o(p1, "it");
             b uob = new b(p1);
             if (uob.g()) {
                return uob;
             }
          }
       }
       return null;
    }
    public static b d(d p0){
       LiveConditionRedPacketInfo liveConditio = p0.n6();
       if (liveConditio == null) {
          return null;
       }
       b uob = new b(liveConditio.c, liveConditio.b, 0, 4, null);
       return v7;
    }
    public static void e(d p0,LiveConditionRedPacketInfo p1,m p2,String p3){
       if (p1 != null && p2 != null) {
          u.i(p2.b(), p2.a(), p2.y(), p1.c, p1.b, LiveConditionRedPacketInfo.a(p1), p3);
       }
       return;
    }
}
