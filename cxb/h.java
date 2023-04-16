package cxb.h;
import erd.o;
import java.lang.String;
import java.lang.Object;
import ywb.e;
import java.lang.StringBuilder;
import java.util.Arrays;
import q87.c;
import java.util.ArrayList;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.photo.download.utils.DownloadError;
import java.lang.Throwable;
import brd.t;
import cxb.n;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.video.c;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.qa;
import cxb.i;
import java.util.List;

public final class h implements o	// class@002093
{
    public final String b;
    public final float c;

    public void h(String p0,float p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       h tb = this.b;
       h tc = this.c;
       int i = 0;
       Object[] objArray = new Object[i];
       e.C().w("RxPhotoDownloader", "downloadMultiImagePhotoToVideo: get files="+Arrays.toString(p0), objArray);
       ArrayList uArrayList = new ArrayList(p0.length);
       int len = p0.length;
       while (true) {
          if (i < len) {
             object oobject = p0[i];
             if (TextUtils.x(oobject)) {
                p0 = t.error(new DownloadError(2));
                break ;
             }else {
                uArrayList.add(oobject);
                i = i + 1;
             }
          }else {
             p0 = null;
             if (PatchProxy.isSupport(n.class)) {
                Object obj = PatchProxy.applyFourRefs(uArrayList, null, tb, Float.valueOf(tc), null, n.class, "4");
                if (obj != PatchProxyResult.class) {
                   p0 = obj;
                   break ;
                }
             }
             p0 = qa.s(c.class, LoadPolicy.DIALOG).w(new i(uArrayList, p0, tb, tc));
             break ;
          }
       }
       return p0;
    }
}
