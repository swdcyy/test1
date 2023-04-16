package com.yxcorp.gifshow.encode.l0;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.photo.download.api.response.DownloadPhotoInfoResponse;
import java.lang.Integer;
import gq.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;

public final class l0 implements o	// class@000d2e
{
    public static final l0 b;

    static {
       l0.b = new l0();
    }
    public void l0(){
       super();
    }
    public final Object apply(Object p0){
       if (p0.mPhotoDownloadDeny != null) {
          p0 = Integer.valueOf(2);
       }else {
          int i = p0.mNotNeedWaterMark ^ 0x01;
          Object[] objArray = new Object[0];
          a.D().w("EncodingUtils", "watermark Experiment is open, service status :"+i, objArray);
          i = Integer.valueOf(i);
       }
       return p0;
    }
}
