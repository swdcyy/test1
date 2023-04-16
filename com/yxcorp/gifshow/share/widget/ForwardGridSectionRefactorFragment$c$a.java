package com.yxcorp.gifshow.share.widget.ForwardGridSectionRefactorFragment$c$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionRefactorFragment$c;
import mhc.p1;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionRefactorFragment;
import y8c.r;
import com.kwai.feature.api.social.message.imshare.model.SharePosInfo;
import nl8.p;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.Integer;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.KwaiDialogFragment;
import msd.p;
import qrd.l1;

public final class ForwardGridSectionRefactorFragment$c$a implements View$OnClickListener	// class@001cd8
{
    public final ForwardGridSectionRefactorFragment$c b;
    public final p1 c;

    public void ForwardGridSectionRefactorFragment$c$a(ForwardGridSectionRefactorFragment$c p0,p1 p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardGridSectionRefactorFragment$c$a.class, "1")) {
          return;
       }
       ForwardGridSectionRefactorFragment$c$a tb = this.b;
       ForwardGridSectionRefactorFragment j = tb.m.J;
       if (j != null) {
          j.mPosition = tb.F();
          tb = this.b;
          View view = tb.y();
          a.o(view, "getView\(\)");
          Objects.requireNonNull(tb);
          tb = PatchProxy.applyOneRefs(view, tb, ForwardGridSectionRefactorFragment$c.class, "2");
          if (tb != PatchProxyResult.class) {
             i = tb.intValue();
          }else {
             ViewParent parent = view.getParent();
             LinearLayoutManager linearLayout = null;
             if (!parent instanceof RecyclerView) {
                parent = linearLayout;
             }
             RecyclerView$LayoutManager layoutManage = (parent != null)? parent.getLayoutManager(): linearLayout;
             if (layoutManage instanceof LinearLayoutManager) {
                linearLayout = layoutManage;
             }
             i = -1;
             if (linearLayout != null) {
                int i1 = linearLayout.h();
                if (i1 == i) {
                   i = linearLayout.i0();
                }else {
                   i = i1;
                }
             }
          }
          j.mListFirstVisiblePosition = i;
       }
       tb = this.b;
       ForwardGridSectionRefactorFragment$c m = tb.m;
       ForwardGridSectionRefactorFragment$c$a tc = this.c;
       i = tb.F();
       Objects.requireNonNull(m);
       if (!PatchProxy.isSupport(ForwardGridSectionRefactorFragment.class) || (!PatchProxy.applyVoidTwoRefs(tc, Integer.valueOf(i), m, ForwardGridSectionRefactorFragment.class, "13") && !m.isDetached())) {
          m.dismissAllowingStateLoss();
          j = m.D;
          if (j != null) {
             j.invoke(tc, Integer.valueOf(i));
          }
       }
       return;
    }
}
