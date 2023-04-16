package djc.a1;
import androidx.recyclerview.widget.RecyclerView$n;
import com.yxcorp.gifshow.share.widget.ImmerseSharePanelFragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.yxcorp.utility.n;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.view.ViewGroup;
import java.lang.Float;
import android.content.Context;
import usd.f;
import usd.p;
import java.lang.Comparable;
import usd.q;
import java.lang.Number;
import au6.e;
import java.lang.Throwable;
import java.lang.Integer;

public final class a1 extends RecyclerView$n	// class@0021d0
{
    public final int a;
    public int b;
    public float c;
    public int d;
    public float e;
    public final ImmerseSharePanelFragment f;
    public final int g;

    public void a1(ImmerseSharePanelFragment p0,int p1){
       a.p(p0, "fragment");
       super();
       this.f = p0;
       this.g = p1;
       FragmentActivity activity = p0.getActivity();
       activity = (activity != null)? n.k(activity): 0;
       this.a = activity;
       float dimension = p0.getResources().getDimension(R.dimen.arg_RES_7f070462);
       this.c = dimension;
       this.d = (int)dimension;
       this.e = 0xbf800000;
       return;
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       int i;
       int itemCount;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, a1.class, "1")) {
          return;
       }
       a.p(p0, "outRect");
       a.p(p1, "view");
       a.p(p2, "parent");
       a.p(p3, "state");
       try{
          i = 0;
          this.f(p1, this.g, p2);
          RecyclerView$Adapter adapter = p2.getAdapter();
          if (adapter != null) {
             itemCount = adapter.getItemCount();
          label_0036 :
             itemCount--;
             if ((((float)itemCount * this.c) + (float)this.d) - (float)(this.a - p2.getPaddingLeft()) > 0 && (this.e - 0xbf800000 && this.b != null)) {
                if (this.f.getActivity() != null) {
                   p0.set((int)(q.G(Float.valueOf(((float)((this.a - this.b) - p2.getPaddingLeft()) / this.e)), p.d(0, (float)n.c(p2.getContext(), 16.00f))).floatValue() / (float)2), i, (int)(q.G(Float.valueOf(((float)((this.a - this.b) - p2.getPaddingLeft()) / this.e)), p.d(0, (float)n.c(p2.getContext(), 16.00f))).floatValue() / (float)2), i);
                }else {
                   p0.set(i, i, i, i);
                }
             }else {
                p0.set(i, i, i, i);
             }
          }else {
             itemCount = 0;
             goto label_0036 ;
          }
       }catch(java.lang.Exception e9){
          e.b(e.a, null, "getItemOffsets error", e9, 1, null);
          p0.set(i, i, i, i);
       }
       return;
    }
    public final void f(View p0,int p1,RecyclerView p2){
       if (PatchProxy.isSupport(a1.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, a1.class, "2")) {
          return;
       }
       if (this.b == null && !p2.getChildAdapterPosition(p0)) {
          if (p1 != 1) {
             p0.measure(0, 0);
             this.d = p0.getMeasuredWidth();
          }
          float f = (float)((this.a - p2.getPaddingLeft()) - this.d) / this.c;
          float f1 = 0x3f800000;
          if ((double)(f % f1) - 0x3fe0000000000000 < 0) {
             f = (float)(int)f - f1;
          }
          f = (float)(int)f + 0x3f000000;
          this.e = (float)1 + f;
          this.b = (int)((q.m(f, f1) * this.c) + (float)this.d);
       }
       return;
    }
}
