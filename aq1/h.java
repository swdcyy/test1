package aq1.h;
import aq1.a;
import java.lang.String;
import yp1.b;
import zp1.i;
import zp1.l;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import mrd.a;
import oe3.h;
import android.view.ViewGroup;
import android.view.View;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;

public final class h extends a	// class@000287
{
    public final String U;
    public final b V;
    public final i W;
    public final l X;

    public void h(String p0,b p1,i p2,l p3){
       a.p(p0, "cellUserId");
       a.p(p1, "renderModel");
       a.p(p2, "chatCellBaseDelegate");
       a.p(p3, "chatCellRendDelegate");
       super(p0, p1, p2, p3);
       this.U = p0;
       this.V = p1;
       this.W = p2;
       this.X = p3;
    }
    public Integer G3(){
       Object obj = PatchProxy.apply(null, this, h.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Integer.valueOf(5);
    }
    public void J3(){
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, h.class, str)) {
          return;
       }
       Map map = this.V.a();
       if (map != null) {
          a uoa = map.get(this.U);
          if (uoa != null) {
             a uoa1 = PatchProxy.apply(objArray, this, a.class, str);
             if (uoa1 != PatchProxyResult.class) {
             }else {
                uoa1 = this.P;
                if (uoa1 == null) {
                   a.S("audioLayout");
                }
             }
             uoa.onNext(new h(BitmapUtil.j(uoa1)));
          }
       }
       return;
    }
    public boolean y3(){
       return true;
    }
}
