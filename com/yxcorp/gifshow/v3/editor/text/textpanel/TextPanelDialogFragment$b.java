package com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelDialogFragment$b;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelDialogFragment;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.View;
import android.widget.ImageView;

public final class TextPanelDialogFragment$b implements Animator$AnimatorListener	// class@0014b7
{
    public final TextPanelDialogFragment a;

    public void TextPanelDialogFragment$b(TextPanelDialogFragment p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextPanelDialogFragment$b.class, "3")) {
          return;
       }
       this.a.wh(true);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextPanelDialogFragment$b.class, "2")) {
          return;
       }
       this.a.wh(true);
       if (this.a.Ch()) {
          TextPanelDialogFragment u = this.a.u;
          if (u == null) {
             a.S("emptyView");
          }
          u.setVisibility(8);
          u = this.a.s;
          if (u == null) {
             a.S("foldBtn");
          }
          u.setVisibility(8);
       }
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextPanelDialogFragment$b.class, "1")) {
          return;
       }
       this.a.wh(false);
       return;
    }
}
