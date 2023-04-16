package cic.i;
import io.reactivex.g;
import cic.h$b;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.mix.VideoMeta;
import tl8.d;
import java.io.File;
import zp.c0;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.model.CDNUrl;
import kp.r1;
import mc6.j;
import j80.g;
import qkd.b;
import brd.g;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.p0;
import com.kwai.video.hodor.ExportMediaCacheTask;
import com.kwai.video.hodor.AbstractHodorTask;
import cic.i$a;
import com.kwai.video.hodor.ExportMediaCacheTask$ExportMediaCacheTaskCallback;

public final class i implements g	// class@0005b0
{
    public final h$b b;

    public void i(h$b p0){
       this.b = p0;
       super();
    }
    public final void subscribe(v p0){
       String url;
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       a.p(p0, "source");
       File uFile = c0.e(this.b.c.a(VideoMeta.class));
       if (uFile == null) {
          uFile = g.c(j.c(r1.H0(this.b.c), this.b.c.getId()));
       }
       if (b.S(uFile)) {
          p0.onNext(uFile);
          p0.onComplete();
       }else {
          String absolutePath = uFile.getAbsolutePath();
          VideoMeta mVideoUrl = this.b.c.a(VideoMeta.class).mVideoUrl;
          if (TextUtils.x(mVideoUrl)) {
             CDNUrl obj = this.b.c.a(VideoMeta.class);
             a.o(obj, "photo.get\(VideoMeta::class.java\)");
             obj = obj.getLocalUrl();
             a.o(obj, "photo.get\(VideoMeta::class.java\).localUrl");
             if (obj != null && !TextUtils.x(obj.getUrl())) {
                url = obj.getUrl();
                a.o(url, "localUrl.url");
                i = 1;
                int i1 = url.length() - i;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                   if (i2 <= i1) {
                      int i4 = (!i3)? i2: i1;
                      i4 = (a.t(url.charAt(i4), 32) <= 0)? 1: 0;
                      if (!i3) {
                         if (!i4) {
                            i3 = 1;
                         }else {
                            i2 = i2 + 1;
                         }
                      }else if(!i4){
                      label_00bd :
                         url = url.subSequence(i2, (i1 + i)).toString();
                      }else {
                         i1 = i1 - 1;
                      }
                   }else {
                      goto label_00bd ;
                   }
                }
             }
          }
          String str = j.c(r1.H0(this.b.c), this.b.c.getId());
          a.o(str, "KwaiProxyCacheKeyUtil.ge¡­oCdnUrl\(photo\), photo.id\)");
          ExportMediaCacheTask uExportMedia = ExportMediaCacheTask.newTaskWithHttpDns(url, p0.n(url), str, absolutePath);
          uExportMedia.setTaskQosClass(8);
          uExportMedia.setExportMediaCacheTaskCallback(new i$a(this, p0, absolutePath));
          uExportMedia.setBizType("feed_detail_export");
          uExportMedia.setBizFt(":ks-features:ft-feed:detail");
          uExportMedia.setUnifyCdnLog(false);
          uExportMedia.submit();
       }
       return;
    }
}
