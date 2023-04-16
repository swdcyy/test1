package b11.j;
import android.widget.TextView;
import ok.x;
import android.app.Activity;
import java.lang.Object;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import b11.j$c;
import b11.j$d;
import b11.j$e;
import b11.j$a;
import com.google.common.collect.ImmutableSet$a;
import com.google.common.collect.ImmutableSet;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradeInfo;

public class j	// class@000304
{
    public final SparseArray a;
    public final WeakReference b;
    public final x c;
    public final x d;
    public b e;
    public final ImmutableSet f;

    public void j(TextView p0,x p1,x p2,Activity p3){
       super();
       SparseArray sparseArray = new SparseArray();
       this.a = sparseArray;
       this.b = new WeakReference(p0);
       this.c = p1;
       this.d = p2;
       sparseArray.put(1, new j$c(p3));
       sparseArray.put(2, new j$d());
       sparseArray.put(3, new j$e());
       sparseArray.put(4, new j$a());
       ImmutableSet$a uoa = new ImmutableSet$a();
       uoa.h("on_gift_select");
       uoa.h("after_handle_gift_select");
       uoa.h("on_batch_count_select");
       uoa.h("on_controller_init");
       uoa.h("on_presenter_bind");
       uoa.h("on_fetch_grade_info");
       this.f = uoa.k();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, j.class, "3")) {
          return;
       }
       j te = this.e;
       if (te != null) {
          te.dispose();
       }
       return;
    }
    public final int b(LiveWealthGradeInfo p0){
       if (p0.mIsGradeLightOff != null) {
          return 1;
       }
       if (p0.mCurrentGrade >= p0.mNextGrade) {
          return 4;
       }
       return 3;
    }
}
