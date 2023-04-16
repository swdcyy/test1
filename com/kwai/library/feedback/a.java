package com.kwai.library.feedback.a;
import android.view.View$OnClickListener;
import com.kwai.library.feedback.FeedbackDialogFragment$b$b;
import xv6.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.library.feedback.FeedbackDialogFragment$c;

public final class a implements View$OnClickListener	// class@000826
{
    public final FeedbackDialogFragment$b$b b;
    public final a c;
    public final int d;

    public void a(FeedbackDialogFragment$b$b p0,a p1,int p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a.class, "1")) {
          return;
       }
       FeedbackDialogFragment$b$b b = this.b.b;
       if (b != null) {
          a.o(p0, "it");
          b.a(p0, this.c, this.d);
       }
       PatchProxy.onMethodExit(a.class, "1");
       return;
    }
}
