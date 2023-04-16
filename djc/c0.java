package djc.c0;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import androidx.fragment.app.Fragment;
import djc.c0$a;
import android.view.View$OnTouchListener;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import crd.b;
import androidx.recyclerview.widget.RecyclerView$q;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Long;
import java.lang.Boolean;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import brd.t;
import djc.c0$b;
import io.reactivex.internal.functions.Functions;
import erd.g;

public final class c0	// class@0021d7
{
    public b a;
    public RecyclerView[] b;
    public RecyclerView$q c;
    public final long d;
    public final boolean e;
    public final BottomSheetFragment f;

    public void c0(long p0,boolean p1,BottomSheetFragment p2){
       a.p(p2, "fragment");
       super();
       this.d = p0;
       this.e = p1;
       this.f = p2;
       View view = p2.getView();
       if (view != null) {
          view.setOnTouchListener(new c0$a(this));
          this.c(p0);
       }
       return;
    }
    public final void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c0.class, "1")) {
          return;
       }
       c0 ta = this.a;
       if (ta != null) {
          ta.dispose();
       }
       this.a = objArray;
       View view = this.f.getView();
       if (view != null) {
          view.setOnTouchListener(objArray);
       }
       ta = this.c;
       if (ta != null) {
          c0 tb = this.b;
          if (tb != null) {
             int len = tb.length;
             for (int i = 0; i < len; i = i + 1) {
                tb[i].removeOnItemTouchListener(ta);
             }
          }
       }
       return;
    }
    public final void b(long p0,boolean p1){
       c0 uoc0 = c0.class;
       if (PatchProxy.isSupport(uoc0) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Boolean.valueOf(p1), this, uoc0, "3")) {
          return;
       }
       uoc0 = this.a;
       if (uoc0 != null) {
          uoc0.dispose();
       }
       if (p1) {
          this.c(p0);
       }else {
          this.a();
       }
       return;
    }
    public final void c(long p0){
       c0 uoc0 = c0.class;
       if (PatchProxy.isSupport(uoc0) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoc0, "2")) {
          return;
       }
       this.a = t.timer(p0, TimeUnit.MILLISECONDS, d.c).observeOn(d.a).subscribe(new c0$b(this), Functions.e);
       return;
    }
}
