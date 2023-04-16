package a2c.s;
import exc.l$g;
import a2c.t;
import java.lang.String;
import java.lang.Object;
import exc.l$f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.LinkedHashMap;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.profile.kslog.KsLogError;
import java.lang.Enum;
import java.util.Map;
import com.yxcorp.gifshow.profile.kslog.KsLogInfoProductionTag;
import com.yxcorp.gifshow.profile.kslog.KsLogStatus;
import z5c.x2;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import java.lang.Throwable;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import java.util.List;
import v2c.e;
import v2c.g;
import java.lang.Double;
import usd.q;
import exc.l$h;
import java.util.Objects;
import java.util.HashSet;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$e;
import wkd.b;
import o3c.l;
import brd.t;
import a2c.n;
import a2c.o;
import erd.g;
import crd.b;

public final class s implements l$g	// class@000050
{
    public final t a;
    public final String b;

    public void s(t p0,String p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(int p0,l$f p1){
       s os = s.class;
       if (PatchProxy.isSupport(os) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, os, "2")) {
          return;
       }
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       String str = (p1 == null)? "bg_video_default": p1.a()+"_"+p1.getAction()+"_"+p1.getCode();
       linkedHashMa.put(KsLogError.ERROR_CODE.name(), str);
       x2.b(KsLogInfoProductionTag.BG_VIDEO_PUBLISH, KsLogStatus.FAIL, linkedHashMa);
       this.a.c.setStatus(2);
       os = this.a;
       t b = os.b;
       t c = os.c;
       String str1 = (p1 != null)? p1.toString(): null;
       b.k(c, p0, str1, null);
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "3")) {
          return;
       }
       a.p(p0, "action");
       g.e(KsLogProfileTag.BG_VIDEO.appendTag("ProfileBackgroundVideoPublishManager"), "upload status changed:"+p0);
       return;
    }
    public void c(double p0,double p1,double p2){
       if (PatchProxy.isSupport(s.class) && PatchProxy.applyVoidThreeRefs(Double.valueOf(p0), Double.valueOf(p1), Double.valueOf(p2), this, s.class, "4")) {
          return;
       }
       g.e(KsLogProfileTag.BG_VIDEO.appendTag("ProfileBackgroundVideoPublishManager"), "uploadProgress: "+p1+",encodeProgress: "+p0+", watermarkProgress: "+p2);
       if (p1 > 0) {
          p0 = 0x3ff0000000000000;
       }
       s ta = this.a;
       ta.b.n(ta.c, ((int)((double)0x41f00000 * p0) + (int)(q.s(p1, 0x3ff0000000000000) * (double)70)), 100);
       return;
    }
    public void d(l$h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "1")) {
          return;
       }
       a.p(p0, "response");
       x2.a(KsLogInfoProductionTag.BG_VIDEO_PUBLISH, KsLogStatus.SUCCESS);
       KsLogProfileTag bG_VIDEO = KsLogProfileTag.BG_VIDEO;
       String str = "ProfileBackgroundVideoPublishManager";
       bG_VIDEO.appendTag(str);
       g.e(bG_VIDEO, "upload succeed, response:\n "+p0);
       s ta = this.a;
       ta.b.n(ta.c, 100, 100);
       this.a.c.setZtPhotoId(String.valueOf(p0.a()));
       this.a.c.setClipStart(0);
       t c = this.a.c;
       c.setDuration(c.getClipDuration());
       this.a.c.setPath(this.b);
       this.a.c.setEnableAbLoop(false);
       s ta1 = this.a;
       t b = ta1.b;
       c = ta1.c;
       Objects.requireNonNull(b);
       ProfileBackgroundPublishManager profileBackg = ProfileBackgroundPublishManager.class;
       if (!PatchProxy.applyVoidOneRefs(c, b, profileBackg, "23")) {
          g.e(bG_VIDEO.appendTag(str), "onSuccess cache path: "+c.getPath());
          Iterator iterator = b.h().iterator();
          while (iterator.hasNext()) {
             iterator.next().b(c);
          }
          if (b.f() && !PatchProxy.applyVoid(null, b, profileBackg, "24")) {
             ProfileBackgroundPublishManager c1 = b.c;
             if (c1 != null) {
                g.e(KsLogProfileTag.BG_VIDEO.appendTag(str), "modifyVideoBg: "+c1.getZtPhotoId());
                b.a(0x37313f08).o(c1.getZtPhotoId()).subscribe(new n(b, c1), new o(b, c1));
             }
          }
       }
       return;
    }
}
