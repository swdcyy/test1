package com.yxcorp.gifshow.photo.download.task.j;
import erd.o;
import com.yxcorp.gifshow.photo.download.task.f$b;
import java.io.File;
import java.lang.Object;
import com.yxcorp.gifshow.video.d;
import java.util.Objects;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import com.yxcorp.gifshow.photo.download.task.b;
import com.yxcorp.gifshow.photo.download.api.response.DownloadPhotoInfoResponse;
import wkd.b;
import j80.c;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.photo.download.task.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Bitmap;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.CoverMeta;
import kp.r1;
import ywb.e;
import q87.c;
import jp.a;
import jd.c;
import com.facebook.imagepipeline.request.ImageRequest;
import wb5.b;
import com.yxcorp.image.fresco.wrapper.c;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.BitmapUtil;
import nxc.b;
import android.app.Activity;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.video.api.watermark.BitmapAlignType;
import nxc.c;
import com.yxcorp.gifshow.photo.download.task.h;
import com.yxcorp.gifshow.photo.download.task.g;
import com.yxcorp.gifshow.video.d$b;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import brd.t;
import jxb.i;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.photo.download.task.i;
import ixb.k;
import ixb.j;
import erd.a;

public final class j implements o	// class@000f03
{
    public final f$b b;
    public final File c;
    public final float d;

    public void j(f$b p0,File p1,float p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       Object[] objArray1;
       j tb = this.b;
       j tc = this.c;
       j td = this.d;
       Objects.requireNonNull(tb);
       int i = 0;
       int i1 = a.t().a("downloadShowCancelButtonMinTimeInterval", i);
       boolean b = ((double)tb.c.f.mVideoSize - 0x416e000000000000 >= 0)? true: false;
       File uFile = new File(b.a(-1504323719).o(), tb.c.b.getPhotoId()+"cover.jpg");
       f$b c = tb.c;
       QPhoto mEntity = c.b.mEntity;
       Bitmap uBitmap = PatchProxy.applyOneRefs(mEntity, c, f.class, "11");
       if (uBitmap != PatchProxyResult.class) {
       }else {
          CoverMeta uCoverMeta = r1.D0(mEntity);
          String str = null;
          if (uCoverMeta == null) {
             objArray1 = new Object[i];
             e.C().t(f.k, "getPhotoCover: coverMeta is null", objArray1);
          }else if(uCoverMeta.mOverrideCoverSize != null){
             objArray1 = new Object[i];
             e.C().w(f.k, "getPhotoCover: mOverrideCoverSize is not null,return null", objArray1);
          }else {
             c uoc1 = c.w();
             a.d(b.f(uCoverMeta, a.b, str)[i], uoc1);
             uBitmap = uoc1.q().getBitmap();
          }
          uBitmap = str;
       }
       if (uBitmap != null) {
          BitmapUtil.Q(uBitmap, uFile.getAbsolutePath(), 98);
          Object[] objArray = new Object[i];
          e.C().w(f.k, "apply: save cover file", objArray);
       }
       f$b c1 = tb.c;
       b uob = new b(c1.c, c1.b.mEntity);
       uob.d(tc);
       uob.f(tb.c.j);
       uob.d = uFile;
       uob.a(true);
       uob.b(tb.c.b.getKwaiId());
       uob.e(tb.c.b.getUser());
       uob.g(BitmapAlignType.DYNAMIC_WATERMARK);
       c uoc = new c(tb.c.b.mEntity, null, i1, b, false);
       uob.c(tc);
       uob.n = h.b;
       uob.o = g.b;
       p0 = p0.Oa(uob);
       f$b c2 = tb.c;
       c2.e.mWaterMarkType = 1;
       z c3 = d.c;
       Objects.requireNonNull(p0);
       return i.i(c2.b).observeOn(c3).flatMap(new i(tb, p0, td)).map(new k(tb)).doOnDispose(new j(p0)).subscribeOn(c3);
    }
}
