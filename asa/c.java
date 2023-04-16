package asa.c;
import asa.g;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ekd.m1;

public final class c extends g	// class@0002e6
{
    public View t;

    public void c(){
       super();
    }
    public void V8(int p0,View p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoc, "2")) {
          return;
       }
       a.p(p1, "view");
       c tt = this.t;
       String str = "mAdjustTopView";
       if (tt == null) {
          a.S(str);
       }
       tt.setMinimumHeight(p0);
       tt = this.t;
       if (tt == null) {
          a.S(str);
       }
       c tt1 = this.t;
       if (tt1 == null) {
          a.S(str);
       }
       int paddingLeft = tt1.getPaddingLeft();
       c tt2 = this.t;
       if (tt2 == null) {
          a.S(str);
       }
       int paddingRight = tt2.getPaddingRight();
       c tt3 = this.t;
       if (tt3 == null) {
          a.S(str);
       }
       tt.setPadding(paddingLeft, p0, paddingRight, tt3.getPaddingBottom());
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       super.doBindView(p0);
       p0 = m1.f(p0, R.id.block_top_adjust_view);
       a.o(p0, "ViewBindUtils.bindWidget¡­id.block_top_adjust_view\)");
       this.t = p0;
       return;
    }
}
