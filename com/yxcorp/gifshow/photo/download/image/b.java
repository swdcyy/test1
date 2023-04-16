package com.yxcorp.gifshow.photo.download.image.b;
import io.reactivex.g;
import com.yxcorp.gifshow.photo.download.image.c;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import com.yxcorp.gifshow.entity.QPhoto;
import dxb.o;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import java.lang.StringBuilder;
import java.io.File;
import com.yxcorp.gifshow.photo.download.api.response.DownloadPhotoInfoResponse;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.gifshow.photo.download.task.s;
import dxb.x;
import dxb.p;
import exb.b;
import ixb.y;

public final class b implements g	// class@000ed4
{
    public final c b;
    public final StatModel c;
    public final int d;

    public void b(c p0,StatModel p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void subscribe(v p0){
       b tb = this.b;
       b tc = this.c;
       b td = this.d;
       Objects.requireNonNull(tb);
       QPhoto qPhoto = new QPhoto(tb.a.a);
       tc.mDownloadIndex = String.valueOf(tb.f(td));
       File uFile = c.e(qPhoto, tb.f(td)+"");
       tc.mLocalFile = uFile;
       ImageRequest[] imageRequest = s.l(qPhoto, tb.f(td));
       QPhoto qPhoto1 = qPhoto;
       ImageRequest[] imageRequest1 = imageRequest;
       s.h(qPhoto1, (tb.a.d.mNotNeedWaterMark ^ 0x01), imageRequest1, uFile, tc, new x(tb, p0), new p(tb));
    }
}
