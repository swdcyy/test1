package h8a.a;
import com.yxcorp.gifshow.detail.slideplay.presenter.d;
import android.util.SparseIntArray;
import h8a.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.Integer;
import xx9.a;
import wd5.a;
import android.view.View;
import ekd.m1;
import androidx.recyclerview.widget.SlideVerticalAtlasPlayer;

public class a extends d	// class@0025df
{
    public SlideVerticalAtlasPlayer B;
    public final SparseIntArray C;
    public int D;
    public int E;
    public final RecyclerView$r F;

    public void a(){
       super();
       this.C = new SparseIntArray();
       this.D = 0;
       this.E = 0;
       this.F = new a$a(this);
    }
    public SparseIntArray R8(){
       return this.C;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       super.S8();
       this.B.addOnScrollListener(this.F);
       return;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       this.Z8(this.B);
       return;
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       super.W8();
       this.B.removeOnScrollListener(this.F);
       return;
    }
    public void Z8(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       RecyclerView$LayoutManager layoutManage = p0.getLayoutManager();
       if (layoutManage instanceof LinearLayoutManager) {
          int i = layoutManage.i0();
          int i1 = layoutManage.c();
          a tD = this.D;
          if (i < tD) {
             this.a9(i, (tD - 1));
          }else {
             tD = this.E;
             if (i1 > tD) {
                this.a9((tD + 1), i1);
             }
          }
          this.D = i;
          this.E = i1;
       }
       return;
    }
    public final void a9(int p0,int p1){
       int i;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, a.class, "2")) {
          return;
       }
       while (p0 <= p1) {
          if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, a.class, "3")) {
             if (this.y.c()) {
                i = this.C.get(p0) + 1;
                this.C.put(p0, i);
             }else {
                i = this.s.get(p0) + 1;
                this.s.put(p0, i);
                this.z.d(p0);
             }
          }
          p0++;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       this.B = m1.f(p0, 0x7f0a09e1);
       return;
    }
}
