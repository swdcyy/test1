package com.yxcorp.gifshow.view.ShowFoldedCommentLayout$createView$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.view.ShowFoldedCommentLayout$createView$1;
import java.lang.Object;
import android.widget.TextView;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.text.TextPaint;
import nx9.c;
import android.content.Context;
import hl9.t;
import android.graphics.drawable.Drawable;
import zf6.j;
import android.view.View;
import com.kwai.written.view.IWrittenLayout;

public final class ShowFoldedCommentLayout$createView$1$1 extends Lambda implements l	// class@0016aa
{
    public final ShowFoldedCommentLayout$createView$1 this$0;

    public void ShowFoldedCommentLayout$createView$1$1(ShowFoldedCommentLayout$createView$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(TextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShowFoldedCommentLayout$createView$1$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       TextPaint paint = p0.getPaint();
       a.o(paint, "paint");
       paint.setFakeBoldText((c.c() ^ 1));
       int i = (c.c() || c.d())? t.R8(p0.getContext(), R.color.arg_RES_7f06081d, 0x7f0601fb): t.R8(p0.getContext(), R.color.arg_RES_7f0607d6, 0x7f0601b9);
       Drawable uDrawable = j.n(p0.getContext(), R.drawable.arg_RES_7f08054f, i);
       if (uDrawable != null) {
          uDrawable.setBounds(0, 0, this.this$0.this$0.Q0(p0, 14.00f), this.this$0.this$0.Q0(p0, 14.00f));
       }else {
          uDrawable = null;
       }
       p0.setCompoundDrawablePadding(this.this$0.this$0.Q0(p0, 2.00f));
       p0.setCompoundDrawables(null, null, uDrawable, null);
       p0.setTextColor(this.this$0.this$0.h(p0, i));
       p0.setTextSize(1, 13.00f);
       return;
    }
}
