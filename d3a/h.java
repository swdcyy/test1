package d3a.h;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import java.lang.String;
import com.kwai.framework.model.channel.HotChannel;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.google.gson.JsonObject;
import com.yxcorp.gifshow.util.o;
import ohc.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import d3a.h$a;

public class h	// class@001e6d
{
    public QPhoto a;
    public String b;
    public PhotoDetailParam c;
    public HotChannel d;
    public NormalDetailBizParam e;
    public String f;
    public String g;
    public WeakReference h;
    public WeakReference i;
    public final JsonObject j;
    public List k;

    public void h(PhotoDetailParam p0,NormalDetailBizParam p1,String p2,HotChannel p3){
       super();
       this.b = "";
       this.c = p0;
       if (p2 != null) {
          this.b = p2;
       }
       this.e = p1;
       p0 = p0.mPhoto;
       this.a = p0;
       this.d = p3;
       this.j = o.i(p0);
       return;
    }
    public final g a(g p0,PhotoDetailParam p1,boolean p2){
       if (PatchProxy.isSupport(h.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, h.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new h$a(this, p0, p2, p1);
    }
}
