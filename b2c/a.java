package b2c.a;
import b2c.a$a;
import nsd.u;
import java.lang.String;
import java.lang.Class;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxy;
import com.yxcorp.download.DownloadTask$DownloadRequest;
import com.kuaishou.webkit.URLUtil;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.QCurrentUser;
import o56.a;
import com.yxcorp.download.DownloadTask$DownloadBizExtra;
import com.yxcorp.download.b;
import b2c.b;
import com.yxcorp.utility.TextUtils;

public final class a	// class@000396
{
    public final DownloadTask$DownloadRequest a;
    public final b b;
    public int c;
    public boolean d;
    public a$b e;
    public final ProfileBgVideoInfo f;
    public static final String g;
    public static final a$a h;

    static {
       a.h = new a$a(null);
       a.g = a.class.getSimpleName();
    }
    public void a(ProfileBgVideoInfo p0){
       a.p(p0, "mVideoInfo");
       super();
       this.f = p0;
       this.c = -1;
       Object[] objArray = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (objArray != PatchProxyResult.class) {
       }else {
          String str = this.a(p0);
          if (!URLUtil.isNetworkUrl(str)) {
             objArray = null;
          }else {
             objArray = new DownloadTask$DownloadRequest(str);
             objArray.setDownloadTaskType(DownloadTask$DownloadTaskType.ENQUEUE);
             objArray.setNeedCDNReport(true);
             a$a h = a.h;
             objArray.setDestinationDir(h.a());
             objArray.setIsNotForceReDownload(true);
             objArray.setNotificationVisibility(0);
             str = PatchProxy.apply(null, h, a$a.class, "2");
             if (str != PatchProxyResult.class) {
             }else {
                QCurrentUser qCurrentUser = QCurrentUser.me();
                a.o(qCurrentUser, "QCurrentUser.me\(\)");
                str = "userId="+qCurrentUser.getId()+";"+"did="+a.a;
                a.o(str, "cookies.toString\(\)");
             }
             objArray.addRequestHeader("Cookie", str);
             objArray.setBizInfo(":ks-features:ft-social:profile", "social_profile_background_video", null);
          }
       }
       this.a = objArray;
       b uob = PatchProxy.apply(null, this, a.class, "7");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = new b(this);
       }
       this.b = uob;
       return;
    }
    public final String a(ProfileBgVideoInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TextUtils.k(p0.getPath());
    }
}
