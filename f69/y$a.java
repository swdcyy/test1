package f69.y$a;
import qvb.q;
import f69.y;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import qvb.a;
import java.util.Objects;
import android.widget.Button;
import com.kwai.framework.model.user.QCurrentUser;
import f69.b0;
import android.view.View$OnClickListener;

public class y$a implements q	// class@0022c9
{
    public final y b;

    public void y$a(y p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       y$a uoa = y$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (p0 && !this.b.q.isEmpty()) {
          y$a tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, y.class, "4")) {
             int i = 0;
             tb.r.setVisibility(i);
             boolean b = true;
             if (QCurrentUser.ME.getFollowListVisibilityOption() != b) {
                tb.r.setEnabled(i);
                tb.r.setText(R.string.arg_RES_7f1046e4);
             }else {
                tb.r.setEnabled(b);
                tb.r.setText(R.string.turn_on);
                tb.r.setVisibility(i);
                tb.r.setOnClickListener(new b0(tb));
             }
          }
       }
       return;
    }
}
