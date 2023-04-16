package com.yxcorp.gifshow.view.ShowFoldedCommentLayout;
import com.kwai.written.view.IWrittenLayout;
import com.yxcorp.gifshow.view.ShowFoldedCommentLayout$a;
import nsd.u;
import android.content.Context;
import android.view.View$OnClickListener;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.gifshow.view.ShowFoldedCommentLayout$createView$1;
import android.view.ViewGroup$LayoutParams;
import msd.l;
import android.widget.FrameLayout;
import android.widget.TextView;

public final class ShowFoldedCommentLayout extends IWrittenLayout	// class@0016ac
{
    public TextView c;
    public final View$OnClickListener d;
    public static final ShowFoldedCommentLayout$a e;

    static {
       ShowFoldedCommentLayout.e = new ShowFoldedCommentLayout$a(null);
    }
    public void ShowFoldedCommentLayout(Context p0,View$OnClickListener p1){
       a.p(p0, "context");
       a.p(p1, "mOnClickListener");
       super(p0);
       this.d = p1;
    }
    public View k1(){
       Object obj = PatchProxy.apply(null, this, ShowFoldedCommentLayout.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.P(this.T(new ViewGroup$MarginLayoutParams(-1, -2), new ShowFoldedCommentLayout$createView$1(this)));
    }
    public final TextView n1(){
       ShowFoldedCommentLayout obj = PatchProxy.apply(null, this, ShowFoldedCommentLayout.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj == null) {
          a.S("textView");
       }
       return obj;
    }
}
