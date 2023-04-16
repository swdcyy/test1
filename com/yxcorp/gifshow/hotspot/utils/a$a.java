package com.yxcorp.gifshow.hotspot.utils.a$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.hotspot.utils.a;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.s;
import android.view.View;
import com.yxcorp.gifshow.hotspot.utils.a$c;

public class a$a extends RecyclerView$r	// class@0018ef
{
    public int a;
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       uoa = this.b;
       boolean b = false;
       boolean b1 = (p1 == 2)? true: false;
       uoa.f = b1;
       if (!p1 && b1) {
          uoa.f = b;
          if (uoa.g == null) {
             return;
          }else {
             RecyclerView$LayoutManager layoutManage = p0.getLayoutManager();
             s os = (layoutManage.canScrollVertically())? this.b.r(layoutManage): this.b.q(layoutManage);
             if (os == null) {
                return;
             }else {
                View view = this.b.t(layoutManage, os);
                if (view != null && os.g(view) == os.n()) {
                   int childAdapter = p0.getChildAdapterPosition(view);
                   if (childAdapter < 0 || (childAdapter < layoutManage.getItemCount() && this.a != childAdapter)) {
                      this.a = childAdapter;
                      this.b.g.onSnap(childAdapter);
                   }
                }
             }
          }
       }
    label_0073 :
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, a$a.class, "2")) {
          return;
       }
       a$a tb = this.b;
       boolean b = (p1 < 0)? true: false;
       tb.l = b;
       return;
    }
}
