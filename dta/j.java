package dta.j;
import lnc.l2;
import com.yxcorp.gifshow.homepage.kcube.presenter.a;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;

public final class j implements l2	// class@002538
{
    public final a a;

    public void j(a p0){
       this.a = p0;
    }
    public final void a(int p0){
       j ta = this.a;
       Objects.requireNonNull(ta);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), ta, uoa, "18")) {
          ViewGroup$LayoutParams layoutParams = ta.v.getLayoutParams();
          layoutParams.height = a1.d(0x7f070fdf) + p0;
          uoa = ta.v;
          uoa.setPadding(uoa.getPaddingLeft(), p0, ta.v.getPaddingRight(), ta.v.getPaddingBottom());
          ta.v.setLayoutParams(layoutParams);
       }
       return;
    }
}
