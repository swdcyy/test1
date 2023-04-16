package com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelDialogFragment$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelDialogFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import msd.l;
import huc.o1;

public final class TextPanelDialogFragment$a implements View$OnClickListener	// class@0014b6
{
    public final TextPanelDialogFragment b;

    public void TextPanelDialogFragment$a(TextPanelDialogFragment p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextPanelDialogFragment$a.class, "1")) {
          return;
       }
       TextElementViewModel.b1(this.b.Ah(), 3, null, 2, null);
       o1.a.a(true);
       return;
    }
}
