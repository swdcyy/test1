package com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelDialogFragment$d;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelDialogFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import faa.a;
import q87.c;
import android.view.ViewTreeObserver;

public final class TextPanelDialogFragment$d implements ViewTreeObserver$OnGlobalLayoutListener	// class@0014b9
{
    public final TextPanelDialogFragment b;

    public void TextPanelDialogFragment$d(TextPanelDialogFragment p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, TextPanelDialogFragment$d.class, "1")) {
          return;
       }
       if (TextPanelDialogFragment.sh(this.b).getWidth() && TextPanelDialogFragment.sh(this.b).getHeight()) {
          Object[] objArray = new Object[0];
          a.D().w("TextPanelDialogFragment", "showTextRecoBubbleIfNeeded onGlobalLayout", objArray);
          TextPanelDialogFragment.sh(this.b).getViewTreeObserver().removeOnGlobalLayoutListener(this);
          this.b.Fh();
       }
       return;
    }
}
