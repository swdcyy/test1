package c42.a$a;
import androidx.recyclerview.widget.RecyclerView$r;
import c42.a;
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
import qvb.a;
import java.util.Collection;
import ekd.q;
import qvb.n0;
import com.yxcorp.gifshow.model.response.LiveChainPhotoFeedResponse;
import qvb.f;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;

public class a$a extends RecyclerView$r	// class@0004ad
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
       a$a uoa = a$a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "4")) {
          return;
       }
       RecyclerView$LayoutManager layoutManage = p0.getLayoutManager();
       if (layoutManage.getChildCount() > 0) {
          a obj = PatchProxy.apply(null, this, uoa, "3");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             obj = this.a.p;
             uoa = (obj != null && !q.f(obj.getItems()))? 1: null;
             a$a uoa1 = (uoa && this.a.p.L0().hasMore())? 1: null;
             if (uoa && uoa1) {
                obj = this.a.p;
                if (obj instanceof f && !obj.isLoading()) {
                   b = 1;
                label_0066 :
                   int i = this.a.p.isLoading() ^ 1;
                   if (b || i) {
                      b = true;
                   }else {
                      b = false;
                   }
                }
             }
             b = 0;
             goto label_0066 ;
          }
          if (b && layoutManage.getChildAt((layoutManage.getChildCount() - 1)).getLayoutParams().getViewAdapterPosition() >= (layoutManage.getItemCount() - 1)) {
             a p = this.a.p;
             if (p != null) {
                p.load();
             }
          }
       }
    label_009c :
       return;
    }
}
