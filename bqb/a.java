package bqb.a;
import qvb.f;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.n0;
import eqb.c;
import eqb.a;
import wkd.b;
import cjd.e;
import erd.o;
import qvb.n0$a;
import com.yxcorp.gifshow.music.radio.data.response.MusicRadioResponse;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import kp.y1;

public class a extends f	// class@00042a
{
    public String p;
    public String q;
    public String r;

    public void a(){
       super();
       this.p = "";
    }
    public t I1(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, a.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.K()) {
          this.p = "";
       }
       obj = PatchProxy.apply(objArray, objArray, c.class, "2");
       if (obj != patchProxyRe) {
       }else {
          obj = b.a(0x7cd52f32);
       }
       return obj.a(this.p, this.q, this.r).map(new e());
    }
    public void K1(n0$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       if (!q.f(p0.a().mPhotos)) {
          Iterator iterator = p0.a().mPhotos.iterator();
          while (iterator.hasNext()) {
             iterator.next().setIsBackgroundPlayPhoto(true);
          }
          if (p0.a().mLlsid != null) {
             y1.c(p0.a().mPhotos, p0.a().mLlsid);
          }
       }
       super.K1(p0);
       this.p = p0.a().mCursor;
       return;
    }
    public void h2(String p0){
       this.q = p0;
    }
    public void i2(String p0){
       this.r = p0;
    }
}
