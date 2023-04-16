package bx8.m;
import erd.c;
import bx8.k;
import java.lang.Object;
import java.lang.String;
import njd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.io.File;
import qkd.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.VideoMeta;
import tl8.d;
import zp.c0;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import wkd.b;
import j80.c;
import lnc.d4;
import com.yxcorp.gifshow.util.PostUtils;

public final class m implements c	// class@000482
{
    public final k a;

    public void m(k p0){
       this.a = p0;
       super();
    }
    public Object a(Object p0,Object p1){
       File obj = PatchProxy.applyTwoRefs(p0, p1, this, m.class, "1");
       if (obj != PatchProxyResult.class) {
          p1 = obj;
       }else {
          a.p(p0, "path");
          a.p(p1, "response");
          if (b.N(new File(p0))) {
             obj = c0.e(this.a.a().getEntity().a(VideoMeta.class));
             int i = 0;
             Object[] objArray = new Object[i];
             a.b().w("ShareReEditRepo", "path "+p0, objArray);
             i oi = a.b();
             StringBuilder str = "cacheFilePath: ";
             String str1 = null;
             String absolutePath = (obj != null)? obj.getAbsolutePath(): str1;
             Object[] objArray1 = new Object[i];
             oi.w("ShareReEditRepo", str+absolutePath, objArray1);
             if (obj != null) {
                str1 = obj.getAbsolutePath();
             }
             if (a.g(p0, str1) ^ 0x01) {
                if (b.S(obj)) {
                   Object[] objArray2 = new Object[i];
                   a.b().w("ShareReEditRepo", "delete old cache file", objArray2);
                   b.l0(obj);
                }
                obj = new File(b.a(-1504323719).c(".video_cache"), d4.a(this.a.a().getPhotoId()));
                Object[] objArray3 = new Object[i];
                a.b().w("ShareReEditRepo", "New cacheFilePath: "+obj.getAbsolutePath(), objArray3);
                PostUtils.c(new File(p0), obj);
                b.l0(new File(p0));
             }
          }
       }
       return p1;
    }
}
