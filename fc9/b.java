package fc9.b;
import h3.a;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.SparseArray;
import android.view.ViewGroup;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import i2b.a;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.Boolean;

public final class b extends a	// class@0022f9
{
    public final SparseArray d;
    public final List e;

    public void b(List p0){
       a.p(p0, "icons");
       super();
       this.e = p0;
       this.d = new SparseArray();
    }
    public void h(ViewGroup p0,int p1,Object p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, b.class, "4")) {
          return;
       }
       a.p(p0, "container");
       a.p(p2, "object");
       KwaiImageView kwaiImageVie = this.d.get((p1 % this.e.size()));
       if (kwaiImageVie != null) {
          p0.removeView(kwaiImageVie);
       }
       return;
    }
    public int j(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.e.isEmpty())? 0: Integer.MAX_VALUE;
       return i;
    }
    public Object o(ViewGroup p0,int p1){
       KwaiImageView obj;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "container");
       obj = this.d.get((p1 % this.e.size()));
       if (obj != null) {
          p0.addView(obj);
       }else {
          obj = a.i(p0, R.layout.arg_RES_7f0d0168);
          b te = this.e;
          obj.U(te.get((p1 % te.size())));
          this.d.put((p1 % this.e.size()), obj);
          obj.setPlaceHolderImage(R.drawable.arg_RES_7f0816cf);
          p0.addView(obj);
       }
       a.o(obj, "view");
       return obj;
    }
    public boolean p(View p0,Object p1){
       boolean b;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "view");
       a.p(p1, "object");
       b = (p0 == p1)? true: false;
       return b;
    }
}
