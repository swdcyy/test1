package com.yxcorp.gifshow.photo.download.task.l;
import io.reactivex.g;
import com.yxcorp.gifshow.photo.download.model.config.NebulaDownloadRedPacketConfig;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.v;
import java.io.File;
import com.yxcorp.gifshow.photo.download.task.DownloadRedPacketHelper;
import java.util.Objects;
import com.yxcorp.gifshow.photo.download.task.DownloadRedPacketHelper$a;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import brd.g;
import qkd.b;
import com.yxcorp.gifshow.photo.download.task.l$b;
import eb7.a;
import android.app.Application;
import o56.a;
import wkd.b;
import c0d.a;
import android.content.Context;
import com.yxcorp.gifshow.photo.download.task.l$a;
import com.kwai.middleware.resourcemanager.download.config.DownloadConfig;
import gb7.c;
import com.kwai.middleware.resourcemanager.download.BaseResourceDownloadHelper;

public final class l implements g	// class@000f09
{
    public final NebulaDownloadRedPacketConfig b;

    public void l(NebulaDownloadRedPacketConfig p0){
       this.b = p0;
       super();
    }
    public final void subscribe(v p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, str)) {
          return;
       }
       a.p(p0, "templateEmitter");
       String str1 = v.h(this.b.mTemplate);
       DownloadRedPacketHelper$a i = DownloadRedPacketHelper.i;
       Objects.requireNonNull(i);
       File uFile = PatchProxy.apply(null, i, DownloadRedPacketHelper$a.class, str);
       if (uFile == PatchProxyResult.class) {
          uFile = DownloadRedPacketHelper.h.getValue();
       }
       File uFile1 = new File(uFile, str1);
       uFile = new File(uFile1, str1);
       if (uFile.exists()) {
          p0.onNext(uFile1);
          p0.onComplete();
       }else if(uFile1.exists()){
          b.q(uFile1);
       }
       Application uApplication = a.b();
       a.o(uApplication, "AppEnv.getAppContext\(\)");
       a uoa = new a(uApplication, b.a(0x1a7467ca));
       uoa.d(new l$b(this, uFile1), new l$a(p0, uFile, uFile1));
       return;
    }
}
