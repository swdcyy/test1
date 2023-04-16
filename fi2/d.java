package fi2.d;
import java.lang.Object;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.util.List;
import dx1.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import ro3.g$c;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.Collection;
import java.util.Objects;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import ro3.g$d;
import ro3.g;
import com.kwai.robust.PatchProxyResult;
import java.lang.System;
import fi2.d$a;
import java.lang.Boolean;
import java.lang.Long;
import ekd.q;
import zo3.d;
import dx1.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import zsd.u;
import java.lang.StringBuilder;
import android.graphics.Color;

public final class d	// class@002966
{
    public static final String a = "RedPackSkin";
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void a(KwaiImageView p0,List p1,int p2,b p3){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, d.class, "6")) {
          return;
       }
       a.p(p0, "imageView");
       if (p1 != null) {
          CDNUrl[] uCDNUrlArray = new CDNUrl[0];
          Object[] objArray = p1.toArray(uCDNUrlArray);
          Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
          g$c uoc = new g$c(objArray, p2);
          a$a uoa = a.d();
          uoa.b(":ks-features:ft-live:live-libraries:live-widget");
          uoa.d(ImageSource.LIVE_RED_PACKET_SKIN);
          uoc.f(uoa.a());
          uoc.g(d.b.b(p1, p3));
          g.a(p0, uoc);
       }
       return;
    }
    public final g$d b(List p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d$a(p0, p1, System.currentTimeMillis());
    }
    public final void c(boolean p0,List p1,b p2,long p3){
       Object[] objArray;
       String this;
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), p1, p2, Long.valueOf(p3), this, d.class, "8")) {
          return;
       }
       if (p2 != null && !q.f(p1)) {
          if (p1 != null) {
             CDNUrl[] uCDNUrlArray = new CDNUrl[0];
             objArray = p1.toArray(uCDNUrlArray);
             Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
          }else {
             objArray = null;
          }
          this = d.f(objArray);
          a.o(this, "RedPacketSkinUtil.getFir\x20\x02\(cdnUrls?.toTypedArray\(\)\)\x00");
          c.a.a(p2, p0, p3, this);
       }
       return;
    }
    public final Integer d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "color");
       if (TextUtils.isEmpty(p0)) {
          return v1;
       }
       if (!u.q2(p0, "#", false, 2, null)) {
          p0 = '#'+p0;
       }
       try{
          return Integer.valueOf(Color.parseColor(p0));
       }catch(java.lang.Exception e0){
       }
    }
}
