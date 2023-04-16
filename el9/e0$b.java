package el9.e0$b;
import com.yxcorp.gifshow.comment.e$b;
import el9.e0;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.QComment;
import ek9.c1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.util.List;
import y8c.g;
import fk9.b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kuaishou.android.model.mix.QSubComment;
import com.yxcorp.gifshow.comment.utils.d;
import g9c.d;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.View;
import java.lang.Math;
import java.lang.Integer;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import android.view.ViewGroup;
import el9.e0$d;
import android.content.Context;
import im8.f;
import xk9.b;
import androidx.recyclerview.widget.RecyclerView$x;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.gifshow.comment.e$g;
import java.lang.Throwable;

public class e0$b implements e$b	// class@0021e2
{
    public final e0 b;

    public void e0$b(e0 p0){
       this.b = p0;
       super();
    }
    public void H5(QPhoto p0,QComment p1){
       c1.e(this, p0, p1);
    }
    public void N1(QPhoto p0,QComment p1){
       int i2;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e0$b.class, "1")) {
          return;
       }
       if (p1.mReplyComment != null) {
          e0$b tb = this.b;
          int b = true;
          tb.v = b;
          boolean b1 = false;
          tb.P8(b1);
          tb = this.b;
          Objects.requireNonNull(tb);
          e0 uoe0 = e0.class;
          if (!PatchProxy.applyVoidOneRefs(p1, tb, uoe0, "3")) {
             QComment mReplyCommen = p1.mReplyComment;
             QComment mParent = mReplyCommen.mParent;
             if (mParent != null) {
                mReplyCommen = mParent;
             }
             int i = tb.q.q().getItems().indexOf(mReplyCommen);
             if (tb.q.g7() instanceof b) {
                int i1 = tb.q.q().getItems().indexOf(p1);
                tb.q.g7().v1(p1);
                if (i1 >= 0) {
                   tb.q.g7().l0(i1);
                }
             }
             if (i >= 0) {
                i = (i + (d.f(mReplyCommen.mSubComment) + b)) + tb.q.ia().b1();
                RecyclerView recyclerView = tb.q.h0();
                LinearLayoutManager layoutManage = recyclerView.getLayoutManager();
                View view = layoutManage.findViewByPosition(i);
                String str = "4";
                if (view == null) {
                   i2 = i - layoutManage.c();
                   if (Math.abs(i2) > 10) {
                      if (i2 > 0) {
                         i2 = i - 10;
                         if (i2 < 0) {
                            i2 = 0;
                         }
                      }else {
                         i2 = i + 10;
                      }
                      d uod = d.class;
                      if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidTwoRefs(recyclerView, Integer.valueOf(i2), null, uod, "28")) {
                         if (recyclerView instanceof CustomRecyclerView) {
                            RecyclerView recyclerView1 = recyclerView;
                            if (!PatchProxy.isSupport(CustomRecyclerView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i2), recyclerView1, CustomRecyclerView.class, str)) {
                               recyclerView1.A(i2, ((recyclerView1.getHeight() * 2) / 3), b1);
                            }
                         }else {
                            recyclerView.scrollToPosition(i2);
                         }
                      }
                      layoutManage.scrollToPosition(i2);
                   }
                   e0$d uod1 = new e0$d(recyclerView.getContext(), tb.s.get());
                   uod1.p(i);
                   layoutManage.startSmoothScroll(uod1);
                }else {
                   RecyclerView$LayoutManager obj = PatchProxy.applyOneRefs(view, tb, uoe0, str);
                   if (obj != PatchProxyResult.class) {
                      b = obj.intValue();
                   }else {
                      obj = tb.q.h0().getLayoutManager();
                      if (obj == null || !obj.canScrollVertically()) {
                         b = 0;
                      }else {
                         RecyclerView$LayoutParams layoutParams = view.getLayoutParams();
                         i = obj.getDecoratedTop(view) - layoutParams.topMargin;
                         i2 = obj.getPaddingTop();
                         b = ((i2 + (((obj.getHeight() - obj.getPaddingBottom()) - i2) / 2)) - i) - (((obj.getDecoratedBottom(view) + layoutParams.bottomMargin) - i) / 2);
                      }
                   }
                   recyclerView.smoothScrollBy(b1, (- b));
                   if (tb.s.get() != null) {
                      tb.s.get().a((float)b);
                   }
                }
             }
          }
       }
       return;
    }
    public void P1(QPhoto p0,QComment p1,e$g p2){
       c1.c(this, p0, p1, p2);
    }
    public void c6(QPhoto p0,QComment p1,Throwable p2){
       c1.a(this, p0, p1, p2);
    }
    public void n7(QPhoto p0,QComment p1,Throwable p2){
       c1.f(this, p0, p1, p2);
    }
    public void t1(QPhoto p0,QComment p1,Throwable p2){
       c1.d(this, p0, p1, p2);
    }
}
