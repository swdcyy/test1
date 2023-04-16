package com.yxcorp.gifshow.share.operation.b$c;
import erd.g;
import java.lang.String;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.app.Application;
import o56.a;
import android.content.Context;
import yic.m;
import com.yxcorp.gifshow.share.operation.PosterDownloadServiceFactory$downloadPanelPoster$2$1;
import msd.a;
import tb7.b;
import com.yxcorp.gifshow.share.operation.PosterDownloadServiceFactory$downloadPanelPoster$2$2;

public final class b$c implements g	// class@001c05
{
    public final String b;

    public void b$c(String p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "1")) {
       }else {
          a.o(p0, "it");
          Application uApplication = a.b();
          a.o(uApplication, "AppEnv.getAppContext\(\)");
          if (m.b(p0, uApplication, this.b, 100)) {
             b.j(PosterDownloadServiceFactory$downloadPanelPoster$2$1.INSTANCE);
          }else {
             b.j(PosterDownloadServiceFactory$downloadPanelPoster$2$2.INSTANCE);
          }
       }
       return;
    }
}
