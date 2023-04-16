package cic.h;
import mhc.a2;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import android.graphics.Bitmap;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.video.d;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.qa;
import cic.h$a;
import erd.o;
import cic.h$b;

public final class h implements a2	// class@0005ae
{

    public void h(){
       super();
    }
    public t a(BaseFeed p0,Bitmap p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(h.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), Boolean.valueOf(p3), this, h.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "photo");
       if (p1 == null) {
          return null;
       }else {
          return qa.s(d.class, LoadPolicy.SILENT).w(new h$a(p1, p0, p2));
       }
    }
    public t b(BaseFeed p0,String p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(h.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), Boolean.valueOf(p3), this, h.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "photo");
       a.p(p1, "coverPath");
       h$b uob = new h$b(this, p0, p2, p3, p1);
       return qa.s(d.class, LoadPolicy.SILENT_IMMEDIATE).w(v7);
    }
}
