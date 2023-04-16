package zed.a;
import y8c.f$b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.plugin.search.play.SearchPlayCardChecker;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u99.b;
import u99.f;
import w99.f;
import y99.b;
import java.util.ArrayList;
import com.kwai.robust.PatchProxyResult;
import zed.p;
import java.util.Map;

public class a extends f$b	// class@002ae1
{
    public b h;
    public f i;
    public f j;
    public b k;
    public QPhoto l;
    public TemplateBaseFeed m;
    public SearchPlayCardChecker n;
    public List o;
    public g p;
    public b q;
    public f r;
    public f s;
    public int t;

    public void a(f$b p0,QPhoto p1,SearchPlayCardChecker p2){
       super(p0);
       this.t = -1;
       this.l = p1;
       if (PatchProxy.applyVoidOneRefs(p2, this, a.class, "1")) {
       }else {
          this.n = p2;
          this.h = new b();
          this.i = new f();
          this.j = new f();
          this.k = new b();
          this.o = new ArrayList(20);
          this.q = new b();
          this.r = new f();
          this.s = new f();
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new p();
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
          obj.put(a.class, new p());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
}
