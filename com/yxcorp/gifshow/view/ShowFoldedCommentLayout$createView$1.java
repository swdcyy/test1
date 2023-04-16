package com.yxcorp.gifshow.view.ShowFoldedCommentLayout$createView$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.view.ShowFoldedCommentLayout;
import java.lang.Object;
import android.widget.FrameLayout;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.View;
import com.kwai.written.view.IWrittenLayout;
import ox7.e;
import android.widget.FrameLayout$LayoutParams;
import ox7.e$a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.view.ShowFoldedCommentLayout$createView$1$1;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import android.view.View$OnClickListener;

public final class ShowFoldedCommentLayout$createView$1 extends Lambda implements l	// class@0016ab
{
    public final ShowFoldedCommentLayout this$0;

    public void ShowFoldedCommentLayout$createView$1(ShowFoldedCommentLayout p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(FrameLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShowFoldedCommentLayout$createView$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.setPadding(0, this.this$0.Q0(p0, 8.00f), 0, this.this$0.Q0(p0, 16.00f));
       ShowFoldedCommentLayout$createView$1 tthis$0 = this.this$0;
       l ol = null;
       FrameLayout$LayoutParams layoutParams = e$a.b(tthis$0, p0, ol, 1, ol);
       Objects.requireNonNull(tthis$0);
       FrameLayout$LayoutParams layoutParams1 = PatchProxy.applyOneRefs(layoutParams, tthis$0, IWrittenLayout.class, "31");
       if (layoutParams1 != PatchProxyResult.class) {
       }else {
          String str = "$this$centerHorizontal";
          a.p(layoutParams, str);
          Object obj = PatchProxy.applyTwoRefs(tthis$0, layoutParams, ol, e$a.class, "12");
          if (obj != PatchProxyResult.class) {
             layoutParams = obj;
          }else {
             a.p(layoutParams, str);
             layoutParams.gravity = 1;
          }
          layoutParams1 = layoutParams;
       }
       tthis$0.c = tthis$0.I0(tthis$0.E(p0, layoutParams1, new ShowFoldedCommentLayout$createView$1$1(this)));
       p0.setOnClickListener(this.this$0.d);
       return;
    }
}
