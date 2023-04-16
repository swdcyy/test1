package ch4.b;
import xf4.b;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import v04.a;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import java.util.Objects;
import android.widget.FrameLayout$LayoutParams;
import nh4.b;
import ch4.a;
import lnc.a1;
import com.yxcorp.utility.TextUtils;
import ei4.k;
import ekd.m1;

public final class b extends b	// class@000566
{
    public View x;

    public void b(Fragment p0){
       super(p0);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       super.E8();
       b tx = this.x;
       String str = "mDividerView";
       if (tx == null) {
          a.S(str);
       }
       ViewGroup$LayoutParams layoutParams = tx.getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
       layoutParams.height = this.W8(this.u.d.mDividerHeight);
       layoutParams.leftMargin = this.W8(this.u.d.mMarginLeft);
       layoutParams.topMargin = this.W8(this.u.d.mMarginTop);
       layoutParams.rightMargin = this.W8(this.u.d.mMarginRight);
       layoutParams.bottomMargin = this.W8(this.u.d.mMarginBottom);
       b tx1 = this.x;
       if (tx1 == null) {
          a.S(str);
       }
       tx1.setLayoutParams(layoutParams);
       tx = this.x;
       if (tx == null) {
          a.S(str);
       }
       tx.setBackgroundColor(TextUtils.J(this.u.d.mDividerColor, a1.a(R.color.arg_RES_7f061dd7)));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       super.doBindView(p0);
       this.x = m1.f(p0, 0x7f0a0bf5);
       return;
    }
}
