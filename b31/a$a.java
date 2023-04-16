package b31.a$a;
import androidx.recyclerview.widget.RecyclerView$r;
import b31.a;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;
import qvb.i;
import java.util.Collection;
import ekd.q;
import qvb.f;
import qvb.n0;
import wvb.e;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;

public class a$a extends RecyclerView$r	// class@00030d
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (p1 == 1) {
          this.c(p0);
       }
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, a$a.class, "2")) {
          return;
       }
       this.c(p0);
       return;
    }
    public void c(RecyclerView p0){
       boolean b;
       a q;
       a$a uoa = a$a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "4")) {
          return;
       }
       RecyclerView$LayoutManager layoutManage = p0.getLayoutManager();
       if (layoutManage.getChildCount() > 0) {
          a obj = PatchProxy.apply(null, this, uoa, "3");
          int i = 1;
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             obj = this.a.q;
             uoa = (obj != null && !q.f(obj.getItems()))? 1: null;
             a$a uoa1 = (uoa && this.a.q.hasMore())? 1: null;
             if (uoa && uoa1) {
                obj = this.a.q;
                if (obj instanceof f && !obj.isLoading()) {
                   b = 1;
                label_0063 :
                   a q1 = this.a.q;
                   uoa1 = ((v4 = q1 instanceof e) && q1.m() instanceof f)? 1: null;
                   q1 = (v4 && (uoa1 && !this.a.q.m().isLoading()))? 1: 0;
                   if (b || q1) {
                      b = true;
                   }else {
                      b = false;
                   }
                }
             }
             b = 0;
             goto label_0063 ;
          }
          if (b) {
             a$a ta = this.a;
             if (layoutManage.getChildAt((layoutManage.getChildCount() - i)).getLayoutParams().getViewAdapterPosition() > (layoutManage.getItemCount() - ta.s)) {
                q = ta.q;
                if (q != null) {
                   q.load();
                }
             }
          }
       }
    label_00c0 :
       return;
    }
}
