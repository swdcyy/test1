package com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.template.TextPanelTemplateHostViewBinderV3$f;
import erd.g;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.template.TextPanelTemplateHostViewBinderV3;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ProgressBar;
import android.view.View;
import com.yxcorp.gifshow.util.PostUtils;

public final class TextPanelTemplateHostViewBinderV3$f implements g	// class@000c67
{
    public final TextPanelTemplateHostViewBinderV3 b;

    public void TextPanelTemplateHostViewBinderV3$f(TextPanelTemplateHostViewBinderV3 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextPanelTemplateHostViewBinderV3$f.class, "1")) {
       }else {
          this.b.f.setVisibility(8);
          this.b.h.setVisibility(8);
          this.b.g.setVisibility(0);
          PostUtils.D("TextPanelTemplateHostViewBinderV3", "loadTab fetch", p0);
       }
       return;
    }
}
