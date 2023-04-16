package etb.j0;
import y8c.g;
import etb.i0;
import y8c.f$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import java.lang.Integer;
import g9c.a;
import android.view.ViewGroup;
import y8c.f;
import android.view.View;
import i2b.a;
import etb.l0;
import ml8.c;

public class j0 extends g	// class@0027fc
{
    public final i0 w;

    public void j0(i0 p0){
       this.w = p0;
       super();
    }
    public f$b d1(f$b p0){
       j0 obj = PatchProxy.applyOneRefs(p0, this, j0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.w;
       p0.f = obj.u;
       p0.g.put("KEY_NOTICE_BOX_NAME", obj.r);
       p0.g.put("NOTICE_BOX_ITEM_DATA", this.w.t);
       p0.g.put("NOTICE_BOX_ITEM_DATA_POSITION", Integer.valueOf(this.w.p));
       p0.g.put("NOTICE_BOX_CARD_PHOTO_COUNT", Integer.valueOf(this.w.I.getItemCount()));
       return p0;
    }
    public f h1(ViewGroup p0,int p1){
       j0 oj0 = j0.class;
       if (PatchProxy.isSupport(oj0)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oj0, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.i(p0, 0x7f0d10bb), new l0());
    }
}
