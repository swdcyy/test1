package zuc.a;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import d0c.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel;
import java.lang.Boolean;
import android.graphics.drawable.Drawable;
import vz6.a;
import lnc.a1;
import a2.i0;

public abstract class a extends RecyclerView$ViewHolder	// class@0046f3
{
    public boolean a;

    public void a(View p0){
       a.p(p0, "itemView");
       super(p0);
    }
    public abstract View a();
    public void b(int p0,d p1){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, a.class, "1")) {
          return;
       }
       a.p(p1, "item");
       return;
    }
    public void c(int p0,d p1,List p2,FontViewModel p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, this, a.class, "3")) {
          return;
       }
       a.p(p1, "item");
       a.p(p2, "payloads");
       a.p(p3, "fontVM");
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, a.class, "2")) {
          a.p(p1, "item");
          a.p(p2, "payloads");
          this.b(p0, p1);
       }
       return;
    }
    public final void d(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "4")) {
          return;
       }
       if (this.a == p0) {
          return;
       }
       this.a = p0;
       Drawable uDrawable = null;
       if (p0) {
          this.a().setBackground(uDrawable);
          a uoa1 = new a(1, a1.e(16.00f), -1, 0xff000000, 20, a1.e(6.00f), 0, a1.e(4.00f));
          i0.v0(this.e(), this.a());
       }else {
          this.e().setBackground(uDrawable);
          this.a().setBackgroundResource(R.drawable.arg_RES_7f080c7a);
       }
       return;
    }
    public abstract View e();
}
