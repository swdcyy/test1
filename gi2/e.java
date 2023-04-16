package gi2.e;
import gi2.f;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import fi2.d;
import dx1.b;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import android.widget.ImageView;
import ro3.g$c;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import ro3.g$d;
import ro3.g;
import zo3.d;
import android.view.View;
import qo3.a;
import ro3.e;
import d61.c0;
import com.kuaishou.live.core.show.redpacket.LiveRedPacketResourcePathConstant;
import lnc.e0;

public final class e	// class@002b28
{

    public static void a(f p0,KwaiImageView p1,List p2){
       String str = "imageView";
       a.p(p1, str);
       d b = d.b;
       b redPacketSim = p0.getRedPacketSimpleExtra();
       Objects.requireNonNull(b);
       if (PatchProxy.applyVoidThreeRefs(p1, p2, redPacketSim, b, d.class, "5")) {
       }else {
          a.p(p1, str);
          int i = 8;
          if (q.f(p2)) {
             p1.setVisibility(i);
          }else {
             a.m(p2);
             CDNUrl[] uCDNUrlArray = new CDNUrl[0];
             Object[] objArray = p2.toArray(uCDNUrlArray);
             Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
             g$c uoc = new g$c(objArray);
             a$a uoa = a.d();
             uoa.b(":ks-features:ft-live:live-libraries:live-widget");
             uoa.d(ImageSource.LIVE_RED_PACKET_SKIN);
             uoc.f(uoa.a());
             uoc.g(b.b(p2, redPacketSim));
             if (!PatchProxy.applyVoidTwoRefs(p1, uoc, null, g.class, "1")) {
                if (!d.b(uoc.a())) {
                   a.c(p1, i);
                }else {
                   a.c(p1, 0);
                   g.b(p1, uoc.a(), new e(p1, uoc), uoc.b());
                }
             }
          }
       }
       return;
    }
    public static void b(f p0,KwaiImageView p1,List p2){
       String str = "imageView";
       a.p(p1, str);
       d b = d.b;
       b redPacketSim = p0.getRedPacketSimpleExtra();
       Objects.requireNonNull(b);
       if (PatchProxy.applyVoidThreeRefs(p1, p2, redPacketSim, b, d.class, "7")) {
       }else {
          a.p(p1, str);
          b.a(p1, p2, -1, redPacketSim);
       }
       return;
    }
    public static void c(f p0,KwaiImageView p1,List p2,int p3){
       a.p(p1, "imageView");
       d.b.a(p1, p2, p3, p0.getRedPacketSimpleExtra());
    }
    public static void d(f p0,KwaiImageView p1,List p2){
       Object[] objArray;
       String str = "imageView";
       a.p(p1, str);
       d b = d.b;
       b redPacketSim = p0.getRedPacketSimpleExtra();
       Objects.requireNonNull(b);
       if (PatchProxy.applyVoidThreeRefs(p1, p2, redPacketSim, b, d.class, "3")) {
       }else {
          a.p(p1, str);
          if (p2 != null) {
             CDNUrl[] uCDNUrlArray = new CDNUrl[0];
             objArray = p2.toArray(uCDNUrlArray);
             Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
          }else {
             objArray = e0.h(c0.a.b(LiveRedPacketResourcePathConstant.LIVE_RED_PACKET_BOTTOM_COVER.getResourcePath()));
          }
          g$c uoc = new g$c(objArray);
          a$a uoa = a.d();
          uoa.b(":ks-features:ft-live:live-libraries:live-widget");
          uoa.d(ImageSource.LIVE_RED_PACKET_SKIN);
          uoc.f(uoa.a());
          uoc.g(b.b(p2, redPacketSim));
          g.a(p1, uoc);
       }
       return;
    }
    public static void e(f p0,KwaiImageView p1,List p2){
       Object[] objArray;
       String str = "imageView";
       a.p(p1, str);
       d b = d.b;
       b redPacketSim = p0.getRedPacketSimpleExtra();
       Objects.requireNonNull(b);
       if (PatchProxy.applyVoidThreeRefs(p1, p2, redPacketSim, b, d.class, "2")) {
       }else {
          a.p(p1, str);
          if (p2 != null) {
             CDNUrl[] uCDNUrlArray = new CDNUrl[0];
             objArray = p2.toArray(uCDNUrlArray);
             Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
          }else {
             objArray = e0.h(c0.a.b(LiveRedPacketResourcePathConstant.LIVE_RED_PACKET_TOP_COVER.getResourcePath()));
          }
          g$c uoc = new g$c(objArray);
          a$a uoa = a.d();
          uoa.b(":ks-features:ft-live:live-libraries:live-widget");
          uoa.d(ImageSource.LIVE_RED_PACKET_SKIN);
          uoc.f(uoa.a());
          uoc.g(b.b(p2, redPacketSim));
          g.a(p1, uoc);
       }
       return;
    }
}
