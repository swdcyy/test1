package cl9.i2$f;
import com.yxcorp.gifshow.comment.e$b;
import cl9.i2;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.QComment;
import ek9.c1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.ViewGroup;
import y8c.g;
import fk9.b;
import g9c.d;
import g9c.a;
import android.view.View;
import com.yxcorp.gifshow.comment.e$g;
import java.lang.Throwable;

public class i2$f implements e$b	// class@000633
{
    public final i2 b;

    public void i2$f(i2 p0){
       this.b = p0;
       super();
    }
    public void H5(QPhoto p0,QComment p1){
       c1.e(this, p0, p1);
    }
    public void N1(QPhoto p0,QComment p1){
       int i2;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i2$f.class, "1")) {
          return;
       }
       if (!this.b.R8()) {
          i2$f tb = this.b;
          Objects.requireNonNull(tb);
          Object obj = PatchProxy.apply(null, tb, i2.class, "13");
          boolean b = false;
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             float f = (float)tb.p.h0().getHeight() * 0x3fc00000;
             b uob = tb.p.g7();
             int i = tb.p.h0().getLayoutManager().i0() - tb.p.ia().b1();
             int i1 = 0;
             while (i >= 0) {
                QComment qComment = uob.N0(i);
                if (qComment != null) {
                   QComment mType = qComment.mType;
                   if (mType != 2 && (mType == 1 || mType == 5)) {
                      i2 = (qComment.mQMedia != null || qComment.mEmotionInfo != null)? i2.J * 2: i2.J;
                   }else {
                      i2 = i2.K;
                   }
                   i1 = i1 + i2;
                   if ((float)i1 - f > 0) {
                      b = true;
                      break ;
                   }
                }
                i = i - 1;
             }
          }
          if (b && !p1.isSub()) {
             LinearLayoutManager layoutManage = this.b.p.h0().getLayoutManager();
             this.b.t = layoutManage.i0();
             View view = layoutManage.findViewByPosition(this.b.t);
             if (view == null) {
                return;
             }else {
                this.b.s = view.getTop() - this.b.p.h0().getPaddingTop();
                tb = this.b;
                tb.t = tb.t + 1;
                tb.v = true;
                tb.G = p1;
             }
          }
       }
    label_00df :
       return;
    }
    public void P1(QPhoto p0,QComment p1,e$g p2){
       c1.c(this, p0, p1, p2);
    }
    public void c6(QPhoto p0,QComment p1,Throwable p2){
       c1.a(this, p0, p1, p2);
    }
    public void n7(QPhoto p0,QComment p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, i2$f.class, "2")) {
          return;
       }
       i2$f tb = this.b;
       if (tb.v != null || tb.R8()) {
          tb = this.b;
          tb.t = tb.t - 1;
       }
       return;
    }
    public void t1(QPhoto p0,QComment p1,Throwable p2){
       c1.d(this, p0, p1, p2);
    }
}
