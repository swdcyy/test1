package com.yxcorp.gifshow.photoad.download.h$b;
import erd.o;
import com.yxcorp.gifshow.photoad.download.h;
import java.lang.Object;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.IOException;
import java.lang.Integer;
import java.util.Map;
import yx.j0;
import com.yxcorp.download.DownloadManager;
import java.util.HashMap;
import java.lang.StringBuilder;

public class h$b implements o	// class@000f81
{
    public final h b;

    public void h$b(h p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       h obj = PatchProxy.applyOneRefs(p0, this, h$b.class, "1");
       if (obj != PatchProxyResult.class) {
          p0 = obj;
       }else {
          String str = "DownloadTaskManager";
          int i = 0;
          if (p0.mDownloadRequestFailedException instanceof IOException) {
             obj = this.b.k;
             if (obj != null && (obj.get(Integer.valueOf(p0.mId)) == null || this.b.k.get(Integer.valueOf(p0.mId)).intValue() < 3)) {
                DownloadManager.n().D(p0.mId);
                h$b tb = this.b;
                if (tb.k == null) {
                   tb.k = new HashMap();
                }
                if (this.b.k.get(Integer.valueOf(p0.mId)) != null) {
                   i = this.b.k.get(Integer.valueOf(p0.mId)).intValue();
                }
                this.b.k.put(Integer.valueOf(p0.mId), Integer.valueOf((i + 1)));
             }else {
                Object[] objArray = new Object[i];
                j0.a(str, "failAPKDownloadTaskInBackground try more than 3 times", objArray);
             }
          }else {
             Object[] objArray1 = new Object[i];
             j0.a(str, "failAPKDownloadTaskInBac exception:"+p0.mDownloadRequestFailedException, objArray1);
          }
       }
       return p0;
    }
}
