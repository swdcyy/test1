package a2c.p;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.File;
import kotlin.jvm.internal.a;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager;
import android.app.Application;
import o56.a;
import java.util.Objects;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$c;
import android.content.Context;
import java.lang.StringBuilder;
import java.lang.System;

public final class p implements o	// class@00004d
{
    public static final p b;

    static {
       p.b = new p();
    }
    public void p(){
       super();
    }
    public Object apply(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       File uFile = PatchProxy.applyOneRefs(p0, this, p.class, "1");
       if (uFile != patchProxyRe) {
       }else {
          a.p(p0, "it");
          p0 = BitmapUtil.n(p0.getPath(), 1, (p0.getClipStart() * (long)1000));
          ProfileBackgroundPublishManager$c j = ProfileBackgroundPublishManager.j;
          Application uApplication = a.b();
          a.o(uApplication, "AppEnv.getAppContext\(\)");
          Objects.requireNonNull(j);
          String str = PatchProxy.applyOneRefs(uApplication, j, ProfileBackgroundPublishManager$c.class, "2");
          if (str != patchProxyRe) {
          }else {
             a.p(uApplication, "context");
             File uFile1 = new File(uApplication.getExternalCacheDir(), "snap_"+System.currentTimeMillis()+'_'+"profileBgImage.png");
             if (uFile1.exists()) {
                uFile1.delete();
             }
             str = uFile1.getAbsolutePath();
             a.o(str, "exportFile.absolutePath");
          }
          uFile = BitmapUtil.M(p0, str, 100);
       }
       return uFile;
    }
}
