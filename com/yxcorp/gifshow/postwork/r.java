package com.yxcorp.gifshow.postwork.r;
import erd.o;
import java.lang.Object;
import java.util.Map$Entry;
import com.yxcorp.gifshow.postwork.PostWorkInfo;
import java.lang.String;
import com.yxcorp.gifshow.upload.UploadInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import wkd.b;
import dlb.f;
import brd.t;
import f0c.l0;
import f0c.k0;
import kotlin.Pair;
import java.lang.Boolean;

public final class r implements o	// class@0010d5
{
    public static final r b;

    static {
       r.b = new r();
    }
    public void r(){
       super();
    }
    public final Object apply(Object p0){
       PostWorkInfo mUploadInfo = p0.getValue().mUploadInfo;
       if (mUploadInfo != null) {
          String str = null;
          int i = 0;
          if (!TextUtils.isEmpty(mUploadInfo.getPipelineKey())) {
             str = mUploadInfo.getPipelineKey();
             i = 1;
          }else if(!TextUtils.isEmpty(mUploadInfo.getPartKey())){
             str = mUploadInfo.getPartKey();
             i = 2;
          }
          p0 = b.a(-589189441).b("", str, i, mUploadInfo.getSessionId()).map(new l0(p0)).onErrorReturn(new k0(p0));
       }else {
          p0 = t.just(new Pair(Boolean.TRUE, p0));
       }
       return p0;
    }
}
