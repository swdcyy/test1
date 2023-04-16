package abc.e;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.yxcorp.gifshow.relation.intimate.dialog.e;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.widget.FrameLayout;
import android.content.Context;
import i2b.a;
import android.view.ViewParent;
import android.graphics.drawable.Drawable;
import abc.h;
import com.yxcorp.gifshow.widget.m;
import ekd.m1;
import com.yxcorp.gifshow.relation.intimate.IntimateRouterActivity;
import androidx.constraintlayout.widget.Guideline;
import lnc.i5;
import lnc.a1;
import o07.n;

public final class e implements PopupInterface$f	// class@0000cd
{
    public final e b;

    public void e(e p0){
       this.b = p0;
    }
    public final View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       e tb = this.b;
       Objects.requireNonNull(tb);
       FrameLayout uFrameLayout = PatchProxy.applyThreeRefs(p0, p1, p2, tb, e.class, "3");
       if (uFrameLayout != PatchProxyResult.class) {
       }else {
          uFrameLayout = new FrameLayout(p2.getContext());
          View view = a.g(p1, tb.f(), p2, false);
          tb.b = view;
          if (view.getParent() == null) {
             uFrameLayout.addView(tb.b);
          }
          p2.setBackground(null);
          if (p0.w() != null) {
             uFrameLayout.setBackground(p0.w());
          }
          e b = tb.b;
          if (!PatchProxy.applyVoidOneRefs(b, tb, e.class, "18")) {
             m1.b(b, new h(tb), R.id.close_btn);
          }
          tb.p(tb.b);
          b = tb.b;
          if (!PatchProxy.applyVoidOneRefs(b, tb, e.class, "17") && tb.g instanceof IntimateRouterActivity) {
             Guideline guideline = b.findViewById(R.id.bottom_guide_line);
             if (guideline != null) {
                guideline.setGuidelineEnd((a1.d(R.dimen.arg_RES_7f070467) + i5.b(tb.g)));
             }
          }
       }
    label_0095 :
       return uFrameLayout;
    }
    public void b(c p0){
       n.a(this, p0);
    }
}
