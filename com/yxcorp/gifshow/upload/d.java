package com.yxcorp.gifshow.upload.d;
import erd.o;
import com.yxcorp.gifshow.upload.RickonWholeUploadInfo;
import java.lang.Object;
import android.util.Pair;
import java.util.HashMap;
import java.util.Map;
import java.lang.String;
import com.yxcorp.gifshow.upload.UploadInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import qq.a;
import q87.c;
import brd.t;
import com.yxcorp.gifshow.upload.b2;
import dnc.e;
import erd.g;

public final class d implements o	// class@001e6a
{
    public final RickonWholeUploadInfo b;

    public void d(RickonWholeUploadInfo p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       d tb = this.b;
       p0 = new HashMap();
       RickonWholeUploadInfo mParams = tb.mParams;
       if (mParams != null) {
          p0.putAll(mParams);
       }
       p0.put("uploadToken", tb.mUploadToken);
       if (!(TextUtils.x(tb.getCaption()) ^ 0x01)) {
          Object[] objArray = new Object[0];
          a.D().w("CloudVideoUploader", "uploadVideo: no needSharePageParams", objArray);
          p0 = t.just(p0);
       }else {
          p0 = b2.c(tb).doOnNext(new e(p0));
       }
       return p0;
    }
}
