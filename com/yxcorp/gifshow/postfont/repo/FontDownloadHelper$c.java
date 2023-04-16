package com.yxcorp.gifshow.postfont.repo.FontDownloadHelper$c;
import io.reactivex.g;
import com.yxcorp.gifshow.postfont.repo.FontDownloadHelper;
import d0c.a;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import eb7.a;
import com.yxcorp.gifshow.postfont.repo.FontDownloadHelper$b;
import e0c.b;
import com.kwai.middleware.resourcemanager.download.config.DownloadConfig;
import gb7.c;
import com.kwai.middleware.resourcemanager.download.BaseResourceDownloadHelper;

public final class FontDownloadHelper$c implements g	// class@00109d
{
    public final FontDownloadHelper b;
    public final a c;

    public void FontDownloadHelper$c(FontDownloadHelper p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FontDownloadHelper$c.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       FontDownloadHelper$c tb = this.b;
       FontDownloadHelper$c tc = this.c;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidTwoRefs(tc, p0, tb, FontDownloadHelper.class, "7")) {
          Log.b("FontBIZ", "innerDownload: "+tc.c());
          tb.d().d(new FontDownloadHelper$b(tb, tc), new b(tb, tc, p0));
       }
       return;
    }
}
