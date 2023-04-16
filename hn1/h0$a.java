package hn1.h0$a;
import androidx.recyclerview.widget.RecyclerView$r;
import hn1.h0;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Objects;
import in1.a;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.View;
import hn1.f0;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public final class h0$a extends RecyclerView$r	// class@002733
{
    public final h0 a;

    public void h0$a(h0 p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       h0$a uoa = h0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       h0$a ta = this.a;
       Objects.requireNonNull(ta);
       h0 oh0 = h0.class;
       if (!PatchProxy.isSupport(oh0) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p1), ta, oh0, "5")) {
          if (p1) {
             if (p1 == 1) {
                ta.a = ta.f;
                a uoa1 = ta.a(ta.b);
                if (uoa1 != null) {
                   uoa1.stopPlay();
                }
             }
          }else if(ta.a != null){
             Object[] objArray = null;
             Object[] objArray1 = PatchProxy.apply(objArray, ta, oh0, "7");
             if (objArray1 != PatchProxyResult.class) {
             }else {
                RecyclerView$LayoutManager layoutManage = ta.e.getLayoutManager();
                if (layoutManage != null) {
                   a.o(layoutManage, "it");
                   View view = ta.d.h(layoutManage);
                   if (view != null) {
                      RecyclerView$ViewHolder childViewHol = ta.e.getChildViewHolder(view);
                      if (childViewHol != null) {
                         objArray = Integer.valueOf(childViewHol.getAbsoluteAdapterPosition());
                      }
                   }
                }
                objArray1 = objArray;
             }
             ta.b = objArray1;
             ta.b();
          }
          ta.a = false;
       }
       return;
    }
}
