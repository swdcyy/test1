package cl5.e$c;
import androidx.recyclerview.widget.RecyclerView$n;
import cl5.e;
import java.util.Collection;
import ekd.q;
import java.lang.Object;
import java.util.List;
import ql8.a;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ol8.a;
import lnc.a1;
import yk5.f;
import com.kwai.emotionsdk.util.ActivityContext;
import android.app.Activity;
import uk5.r;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.content.res.Resources;
import cw9.c;
import com.yxcorp.utility.n;

public class e$c extends RecyclerView$n	// class@0006f0
{
    public int a;
    public boolean b;
    public final e c;

    public void e$c(e p0){
       this.c = p0;
       super();
       int i = 0;
       if (!q.f(p0.x) && (p0.x.get(i) != null && p0.x.get(i).c == 1000)) {
          i = true;
       }
    label_0025 :
       this.b = i;
       this.f();
       return;
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       Object uActivity1;
       int uActivity1;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, e$c.class, "1")) {
          return;
       }
       int childAdapter = p2.getChildAdapterPosition(p1);
       int i = -1;
       if (childAdapter == i) {
          return;
       }
       int i1 = 0x7f070295;
       if (this.c.u.f0(childAdapter) == 1000) {
          p0.left = a1.d(i1);
          p0.top = a1.d(i1);
          p0.bottom = a1.d(i1);
          return;
       }else if(this.b == null && childAdapter < this.c.y){
          p0.top = a1.d(i1);
       }
       p0.bottom = (this.c.p.d() == 3 || this.c.p.d() == 5)? a1.d(0x7f07025d): a1.d(i1);
       e$c tc = this.c;
       e y = tc.y;
       int i2 = this.c.w.size() % y;
       if (i2) {
          y = i2;
       }
       if ((tc.u.getItemCount() - childAdapter) <= y) {
          p0.bottom = a1.d(i1);
       }
       e y1 = this.c.y;
       childAdapter = (childAdapter - this.b) % y1;
       int i3 = (this.a / y1) * childAdapter;
       i2 = 0x7f0703b9;
       i1 = a1.d(i2);
       int i4 = a1.d(R.dimen.arg_RES_7f0703bc);
       Activity uActivity = ActivityContext.d().c();
       e s = this.c.s;
       r or = r.class;
       if (PatchProxy.isSupport(or)) {
          uActivity1 = PatchProxy.applyTwoRefs(uActivity, Integer.valueOf(s), null, or, "3");
          if (uActivity1 != PatchProxyResult.class) {
             i = uActivity1.intValue();
          label_00f3 :
             p0.left = (i1 + ((i4 + i) * childAdapter)) - i3;
             return;
          }
       }
       uActivity1 = r.a(s);
       i = ((s - (c.b(a1.m(), i2) * 2)) - (c.b(a1.m(), 0x7f0703bc) * uActivity1)) / (uActivity1 + i);
       goto label_00f3 ;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, e$c.class, "2")) {
          return;
       }
       e s = this.c.s;
       if (s <= null) {
          s = n.m(ActivityContext.d().c());
       }
       this.a = s;
       return;
    }
}
