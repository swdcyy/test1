package com.kuaishou.live.common.core.component.gift.j;
import erd.g;
import com.kuaishou.live.common.core.component.gift.LiveGiftSelectDialogFragment;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mkc.b;
import android.view.View;
import mkc.c;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import ug1.n0;
import android.view.View$OnClickListener;

public final class j implements g	// class@00131d
{
    public final LiveGiftSelectDialogFragment b;

    public void j(LiveGiftSelectDialogFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, LiveGiftSelectDialogFragment.class, "14")) {
       }else {
          b[] uobArray = new b[]{b.e};
          c.d(tb.I, uobArray);
          KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
          uoa.b();
          uoa.p(new n0(tb));
          c.e(tb.I, b.g, uoa);
       }
       return;
    }
}
