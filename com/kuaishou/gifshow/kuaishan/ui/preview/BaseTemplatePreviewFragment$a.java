package com.kuaishou.gifshow.kuaishan.ui.preview.BaseTemplatePreviewFragment$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kuaishou.gifshow.kuaishan.ui.preview.BaseTemplatePreviewFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.yxcorp.utility.n;
import u80.e;
import q87.c;
import com.kuaishou.gifshow.kuaishan.ui.preview.KSPostPreviewActivity;
import r90.t;
import com.kwai.feature.post.api.util.g;
import kotlin.jvm.internal.a;
import kotlin.Pair;
import java.lang.Number;
import lnc.a1;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import java.lang.StringBuilder;
import com.kuaishou.gifshow.kuaishan.ui.preview.c;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;

public class BaseTemplatePreviewFragment$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@001ad7
{
    public final BaseTemplatePreviewFragment b;

    public void BaseTemplatePreviewFragment$a(BaseTemplatePreviewFragment p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       BaseTemplatePreviewFragment n;
       Object[] objArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BaseTemplatePreviewFragment$a.class, "1")) {
          return;
       }
       BaseTemplatePreviewFragment$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, BaseTemplatePreviewFragment.class, "19")) {
          FragmentActivity activity = tb.getActivity();
          String str = "BaseTemplatePreviewFragment";
          int i = 0;
          if (activity == null || activity.isFinishing()) {
             objArray1 = new Object[i];
             e.D().w(str, "initViewLayout: activity is not ok "+activity, objArray1);
          }else {
             int i1 = n.j(activity);
             BaseTemplatePreviewFragment uBaseTemplat = (i1 != tb.y)? 1: null;
             if (uBaseTemplat || tb.x == null) {
                Object[] objArray2 = new Object[i];
                e.D().w(str, "initViewLayout: ", objArray2);
                tb.y = i1;
                if (tb.getActivity() instanceof KSPostPreviewActivity) {
                   tb.B = tb.getActivity().O;
                }
                if (tb.B == null) {
                   tb.B = new t(activity);
                }
                int i2 = g.g(tb.getActivity());
                BaseTemplatePreviewFragment b = tb.B;
                BaseTemplatePreviewFragment n1 = tb.n;
                uBaseTemplat = tb.q;
                Objects.requireNonNull(b);
                if (!PatchProxy.applyVoidTwoRefs(n1, uBaseTemplat, b, t.class, "2")) {
                   a.p(n1, "previewPager");
                   a.p(uBaseTemplat, "bottomOptBtn");
                   Pair pair = b.b();
                   int i3 = pair.getFirst().intValue();
                   int i4 = pair.getSecond().intValue();
                   float f = (float)i4 / (float)i3;
                   if (f - b.b <= 0) {
                      uBaseTemplat.setBackgroundColor(a1.a(R.color.arg_RES_7f062057));
                      ViewGroup$LayoutParams layoutParams = uBaseTemplat.getLayoutParams();
                      Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                      layoutParams.bottomMargin = a1.d(0x7f070295);
                      uBaseTemplat.setLayoutParams(layoutParams);
                      b.h = a1.d(0x7f07034b);
                   }
                   int i5 = (f - b.b <= 0)? 0: b.g;
                   objArray1 = new Object[i];
                   e.D().w(b.a, "adaptPreviewPager\(\) displayRatio="+f+", actualBottomMargin="+b.h+", pager bottom margin="+i5, objArray1);
                   b.i = f;
                   ViewGroup$LayoutParams layoutParams1 = n1.getLayoutParams();
                   layoutParams1.width = i3;
                   layoutParams1.height = i4 - i5;
                   n1.setLayoutParams(layoutParams1);
                }
                if (tb.x == null) {
                   g.x(tb.m, i2, -1, true);
                   tb.w.j = tb.B;
                   tb.eh();
                }else {
                   tb.w.q();
                }
                tb.x = true;
             }
          }
       }
       n = this.b.n;
       if (n != null && n.getViewTreeObserver().isAlive()) {
          this.b.n.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       }
       return;
    }
}
