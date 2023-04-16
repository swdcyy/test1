package com.yxcorp.gifshow.encode.c0;
import erd.o;
import com.yxcorp.gifshow.postwork.PostWorkInfo;
import java.lang.Object;
import java.lang.Boolean;
import com.yxcorp.gifshow.encode.s0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import gq.a;
import q87.c;
import com.yxcorp.gifshow.upload.UploadInfo;
import java.io.File;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicInteger;
import com.kwai.feature.post.api.feature.upload.model.UploadResult;
import com.yxcorp.gifshow.encode.z;
import erd.g;
import com.yxcorp.gifshow.encode.d0;
import pca.p0;
import pca.o0;

public final class c0 implements o	// class@000d11
{
    public final PostWorkInfo b;

    public void c0(PostWorkInfo p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       c0 tb = this.b;
       AtomicInteger obj = null;
       p0 = PatchProxy.applyOneRefs(tb, obj, s0.class, "17");
       if (p0 != PatchProxyResult.class) {
       }else {
          int i = 0;
          Object[] objArray = new Object[i];
          a.D().w("EncodingUtils", "doSaveToAlbum", objArray);
          if (tb.uploadToThirdPartyServer()) {
             p0 = s0.E(tb.getUploadInfo().getFilePath(), obj, tb.getSessionId(), i, obj);
          }else if(!tb.hasPhotoId()){
             Object[] objArray1 = new Object[i];
             a.D().A("EncodingUtils", "doSaveToAlbum error: prepareOutputFileFromPostWork,post work info is exception", objArray1);
             p0 = t.error(new IllegalArgumentException("prepareOutputFileFromPostWork,post work info is exception"));
          }else {
             p0 = new AtomicLong();
             obj = new AtomicInteger();
             p0 = s0.q(tb.getUploadInfo().getUploadResult().getPhotoId()).doOnNext(z.b).flatMap(new d0(tb, p0, obj)).doOnNext(new p0(tb, p0, obj)).doOnError(new o0(tb, p0, obj));
          }
       }
       return p0;
    }
}
