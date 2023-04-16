package cl9.i2$g;
import androidx.recyclerview.widget.RecyclerView$r;
import cl9.i2;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import java.lang.Boolean;
import com.yxcorp.gifshow.comment.CommentConfig;
import g9c.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.ViewGroup;

public class i2$g extends RecyclerView$r	// class@000634
{
    public final i2 a;

    public void i2$g(i2 p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       if (PatchProxy.isSupport(i2$g.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, i2$g.class, "1")) {
          return;
       }
       if (p1 == 1) {
          p0.v = false;
       }
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       boolean b;
       int i2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(i2$g.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, i2$g.class, "2")) {
          return;
       }
       if (this.a.R8()) {
          i2$g ta = this.a;
          Objects.requireNonNull(ta);
          Object[] objArray = null;
          Object obj = PatchProxy.apply(objArray, ta, i2.class, "11");
          int i = 0;
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(ta.x.mEnableLastViewedCheckHeader == null || !ta.p.ia().b1()){
             obj = ta.p.ia().b1() - 1;
             View view = ta.p.h0().getLayoutManager().findViewByPosition(obj);
             int i1 = ta.w.i0();
             i2 = ta.w.c();
             if (view == null && (i1 < obj || (obj >= i1 && (obj <= i2 && (view != null && (view.getBottom() - ta.p.h0().getPaddingTop()) > ta.x.mFloatButtonHidingSpace))))) {
                b = true;
             }
          }
       label_009b :
          b = false;
          if (!b) {
             ta = this.a;
             Objects.requireNonNull(ta);
             Object obj1 = PatchProxy.apply(objArray, ta, i2.class, "12");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }else {
                obj1 = ta.w.i0();
                obj = ta.w.findViewByPosition(obj1).getTop() - ta.p.h0().getPaddingTop();
                i2 t = ta.t;
                if (obj1 != t || (obj >= ta.s || obj1 > t)) {
                   i = 1;
                }
                b = i;
             }
             if (!b) {
             label_00e1 :
                this.a.S8();
             label_00e6 :
                return;
             }
          }
          this.a.P8();
          goto label_00e6 ;
       }else {
          goto label_00e1 ;
       }
    }
}
