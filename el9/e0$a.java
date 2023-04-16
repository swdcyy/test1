package el9.e0$a;
import xk9.g;
import el9.e0;
import java.lang.Object;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.View;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$r;
import im8.f;
import xk9.b;
import java.lang.Float;

public class e0$a implements g	// class@0021e1
{
    public Integer a;
    public Float b;
    public Integer c;
    public final e0 d;

    public void e0$a(e0 p0){
       this.d = p0;
       super();
    }
    public void b(int p0,QComment p1){
       int i;
       e0$a uoa = e0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "1")) {
          return;
       }
       View view = this.d.R8(p1);
       View view1 = this.d.S8(view);
       e0$a td = this.d;
       Objects.requireNonNull(td);
       Object obj = PatchProxy.applyOneRefs(view, td, e0.class, "8");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else if(view == null){
          i = 0;
       }else {
          view = view.findViewById(R.id.layout_emotion_image);
          i = (view != null && !view.getVisibility())? e0.D: e0.C;
       }
       this.d.q.h0().stopScroll();
       td = this.d;
       if (td.w == -1) {
          td.w = td.q.h0().getPaddingBottom();
       }
       this.d.P8(true);
       int i1 = 2;
       int[] ointArray = new int[i1];
       p0 = p0 - i;
       if (view1 != null) {
          view1.getLocationOnScreen(ointArray);
          i = (p0 - ointArray[1]) - view1.getHeight();
       }else {
          e0$a tc = this.c;
          if (tc != null) {
             i = p0 - tc.intValue();
          }else {
          label_00f9 :
             return;
          }
       }
       float f = (float)i;
       uoa = this.d;
       if (uoa.x != null) {
          uoa.q.h0().removeOnScrollListener(this.d.A);
       }
       if (this.d.s.get() != null) {
          this.d.s.get().a(f);
       }else {
          this.d.q.h0().startNestedScroll(i1, true);
          this.d.q.h0().smoothScrollBy(false, (int)(- f));
       }
       this.c = Integer.valueOf(p0);
       if (this.b == null || this.a == null) {
          this.b = Float.valueOf((- f));
          this.a = Integer.valueOf(ointArray[1]);
       }
       p0.v = false;
       goto label_00f9 ;
    }
    public void f(QComment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0$a.class, "2")) {
          return;
       }
       e0$a td = this.d;
       if (td.v != null) {
          this.a = null;
          this.b = null;
          this.c = null;
          return;
       }else {
          int i = 2;
          int[] ointArray = new int[i];
          View view = this.d.S8(td.R8(p0));
          if (view != null) {
             view.getLocationOnScreen(ointArray);
          }
          td = this.a;
          if (td != null) {
             e0$a tb = this.b;
             if (tb != null) {
                float f = (view == null)? tb.floatValue(): (float)(td.intValue() - ointArray[1]);
                td = this.d;
                if (td.x != null) {
                   td.q.h0().addOnScrollListener(this.d.A);
                }
                if (this.d.s.get() != null) {
                   this.d.s.get().a(f);
                }else if(this.a != null){
                   this.d.q.h0().startNestedScroll(i, 1);
                   this.d.q.h0().smoothScrollBy(0, (int)(- f));
                }
                this.a = null;
                this.b = null;
                this.c = null;
             }
          }
          return;
       }
    }
}
