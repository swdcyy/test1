package gfd.a;
import zed.a;
import y8c.f$b;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.yxcorp.plugin.search.play.SearchPlayCardChecker;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.model.CDNUrl;
import p5a.b;
import aa9.d;
import v5a.g;
import u99.f;
import mcd.a;
import java.lang.String;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateBaseFeed;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import gfd.h;
import java.util.Map;

public class a extends a	// class@000f07
{
    public d u;
    public final d v;
    public b w;
    public p x;
    public boolean y;

    public void a(f$b p0,SearchItem p1,SearchPlayCardChecker p2){
       super(p0, p1.mPhoto, null);
       SearchPlayCardChecker searchPlayCa = (b.b(p1.mPhoto) == null)? null: new d(p1.mPhoto, new g(), this.i, true);
       this.u = searchPlayCa;
       this.v = new a(p1.mPhoto, "", null);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(a.class, new h());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
}
