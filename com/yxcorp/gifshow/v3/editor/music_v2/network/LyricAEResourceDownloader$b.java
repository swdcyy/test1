package com.yxcorp.gifshow.v3.editor.music_v2.network.LyricAEResourceDownloader$b;
import io.reactivex.g;
import com.yxcorp.gifshow.v3.editor.music_v2.network.LyricAEResourceDownloader;
import src.g;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import eb7.a;
import com.yxcorp.gifshow.v3.editor.music_v2.network.LyricAEResourceDownloader$a;
import trc.h;
import com.kwai.middleware.resourcemanager.download.config.DownloadConfig;
import gb7.c;
import com.kwai.middleware.resourcemanager.download.BaseResourceDownloadHelper;

public final class LyricAEResourceDownloader$b implements g	// class@00109e
{
    public final LyricAEResourceDownloader b;
    public final g c;

    public void LyricAEResourceDownloader$b(LyricAEResourceDownloader p0,g p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, LyricAEResourceDownloader$b.class, str)) {
          return;
       }
       a.p(p0, "emitter");
       LyricAEResourceDownloader$b tb = this.b;
       LyricAEResourceDownloader$b tc = this.c;
       Objects.requireNonNull(tb);
       LyricAEResourceDownloader lyricAEResou = LyricAEResourceDownloader.class;
       if (!PatchProxy.applyVoidTwoRefs(tc, p0, tb, lyricAEResou, "3")) {
          a uoa = PatchProxy.apply(null, tb, lyricAEResou, str);
          if (uoa == PatchProxyResult.class) {
             uoa = tb.a.getValue();
          }
          uoa.d(new LyricAEResourceDownloader$a(tb, tc), new h(p0));
       }
       return;
    }
}
