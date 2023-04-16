package qe.g;
import okhttp3.ResponseBody;
import qe.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import okhttp3.MediaType;
import okio.d;
import okio.n;
import com.facebook.react.modules.network.h;
import okio.l;

public class g extends ResponseBody	// class@0029cb
{
    public final ResponseBody b;
    public final f c;
    public d d;
    public long e;

    public void g(ResponseBody p0,f p1){
       super();
       this.b = p0;
       this.c = p1;
       this.e = 0;
    }
    public long contentLength(){
       Object obj = PatchProxy.apply(null, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.b.contentLength();
    }
    public MediaType contentType(){
       Object obj = PatchProxy.apply(null, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.contentType();
    }
    public d source(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d obj = PatchProxy.apply(null, this, g.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.d == null) {
          obj = this.b.source();
          h oh = PatchProxy.applyOneRefs(obj, this, g.class, "4");
          if (oh != patchProxyRe) {
          }else {
             oh = new h(this, obj);
          }
          this.d = l.d(oh);
       }
       return this.d;
    }
}
