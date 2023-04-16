package com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.template.TextPanelTemplateHostViewBinderV3$c;
import android.view.View$OnClickListener;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.template.TextPanelTemplateHostViewBinderV3;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class TextPanelTemplateHostViewBinderV3$c implements View$OnClickListener	// class@000c63
{
    public final TextPanelTemplateHostViewBinderV3 b;

    public void TextPanelTemplateHostViewBinderV3$c(TextPanelTemplateHostViewBinderV3 p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextPanelTemplateHostViewBinderV3$c.class, "1")) {
          return;
       }
       this.b.g.setVisibility(8);
       this.b.I();
       return;
    }
}
