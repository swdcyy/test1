package com.kwai.library.feedback.FeedbackDialogFragment$d;
import android.content.DialogInterface$OnKeyListener;
import com.kwai.library.feedback.FeedbackDialogFragment;
import java.lang.Object;
import android.content.DialogInterface;
import android.view.KeyEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import vv6.g;

public final class FeedbackDialogFragment$d implements DialogInterface$OnKeyListener	// class@000824
{
    public final FeedbackDialogFragment b;

    public void FeedbackDialogFragment$d(FeedbackDialogFragment p0){
       this.b = p0;
       super();
    }
    public final boolean onKey(DialogInterface p0,int p1,KeyEvent p2){
       if (PatchProxy.isSupport(FeedbackDialogFragment$d.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, FeedbackDialogFragment$d.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       if (p1 == 4) {
          FeedbackDialogFragment s = this.b.s;
          if (s != null) {
             s.a(2);
          }
       }
       return false;
    }
}
