package bsa.a;
import asa.g;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;

public final class a extends g	// class@000450
{
    public View t;
    public View u;

    public void a(){
       super();
    }
    public void V8(int p0,View p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "2")) {
          return;
       }
       a.p(p1, "view");
       a tu = this.u;
       String str = "blockTabLayout";
       if (tu == null) {
          a.S(str);
       }
       ViewGroup$LayoutParams layoutParams = tu.getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
       if (layoutParams.topMargin != p0) {
          layoutParams.topMargin = p0;
          a tu1 = this.u;
          if (tu1 == null) {
             a.S(str);
          }
          tu1.setLayoutParams(layoutParams);
          tu = this.t;
          if (tu == null) {
             a.S("homeTabBg");
          }
          tu.height = p0;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       super.doBindView(p0);
       View view = p0.findViewById(R.id.home_tab_bg);
       a.o(view, "rootView.findViewById\(R.id.home_tab_bg\)");
       this.t = view;
       p0 = p0.findViewById(R.id.block_tab_layout);
       a.o(p0, "rootView.findViewById\(R.id.block_tab_layout\)");
       this.u = p0;
       return;
    }
}
