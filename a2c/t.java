package a2c.t;
import erd.g;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import java.lang.Object;
import exc.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lnc.i3;
import java.lang.Float;
import java.lang.Number;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Integer;
import kp.r1;
import android.app.Application;
import o56.a;
import java.util.Objects;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$c;
import com.kwai.robust.PatchProxyResult;
import java.io.File;
import android.content.Context;
import java.lang.StringBuilder;
import java.lang.System;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import java.util.List;
import v2c.e;
import java.lang.Throwable;
import v2c.g;
import ekd.k1;
import fjd.b;
import jb6.d;
import com.yxcorp.retrofit.idc.models.Host;
import kotlin.collections.CollectionsKt__CollectionsKt;
import a2c.r;
import a2c.s;
import exc.l$e;
import exc.l$g;
import exc.l$d;
import com.yxcorp.gifshow.profile.kslog.KsLogInfoProductionTag;
import com.yxcorp.gifshow.profile.kslog.KsLogStatus;
import z5c.x2;

public final class t implements g	// class@000051
{
    public final ProfileBackgroundPublishManager b;
    public final ProfileBgVideoInfo c;

    public void t(ProfileBackgroundPublishManager p0,ProfileBgVideoInfo p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       String str3;
       String str5;
       ProfileBackgroundPublishManager g;
       Object obj = this;
       Object obj1 = p0;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(obj1, obj, t.class, str)) {
       }else {
          a.p(obj1, "publishPlugin");
          obj.b.e();
          i3 oi3 = i3.f();
          oi3.c("showAreaCenterYRadio", Float.valueOf(obj.c.getShowAreaCenterYRadio()));
          BaseFeed feed = obj.c.getFeed();
          String str1 = "";
          if (feed != null) {
             oi3.d("photoId", feed.getId());
             oi3.c("mediaType", Integer.valueOf(3));
             String str2 = r1.U1(feed);
             if (str2 == null) {
                str2 = str1;
             }
             oi3.d("authorId", str2);
          }
          try{
             str3 = oi3.e();
             ProfileBackgroundPublishManager$c j = ProfileBackgroundPublishManager.j;
             Application uApplication = a.b();
             a.o(uApplication, "AppEnv.getAppContext\(\)");
             Objects.requireNonNull(j);
             String str4 = PatchProxy.applyOneRefs(uApplication, j, ProfileBackgroundPublishManager$c.class, str);
             if (str4 != PatchProxyResult.class) {
             }else {
                a.p(uApplication, "context");
                File uFile = new File(uApplication.getExternalCacheDir(), "snap_"+System.currentTimeMillis()+'_'+"profileBgVideo.mp4");
                if (uFile.exists()) {
                   uFile.delete();
                }
                uFile.createNewFile();
                str4 = uFile.getAbsolutePath();
                a.o(str4, "exportFile.absolutePath");
             }
             str5 = str4;
          }catch(java.lang.Exception e0){
             g.d(KsLogProfileTag.BG_VIDEO.appendTag("ProfileBackgroundVideoPublishManager"), "create export file failed: "+"exportFile.absolutePath".getAbsolutePath(), e0);
             str5 = str1;
          }
          double d = (double)1000;
          double d1 = (double)obj.c.getClipStart() / d;
          double d2 = (double)obj.c.getClipDuration() / d;
          a.o(str3, "bizCustomParam");
          String[] stringArray = new String[]{"https://"+d.a().c("zhongtai")};
          double d3 = d2;
          obj.b.g = obj1.JR(obj.c.getPath(), "video", d1, d3, "USER_BACKGROUND_"+k1.i(), str5, 12, false, str3, "USER_BACKGROUND", CollectionsKt__CollectionsKt.P(stringArray), new r(), new s(obj, str5));
          g = obj.b.g;
          if (g != null) {
             x2.a(KsLogInfoProductionTag.BG_VIDEO_PUBLISH, KsLogStatus.START);
             g.onStart();
             obj.b.o(obj.c);
          }
       }
       return;
    }
}
