package com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.template.TextPanelTemplateHostViewBinderV3$b;
import android.view.View$OnClickListener;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.template.TextPanelTemplateHostViewBinderV3;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tod.a;
import androidx.lifecycle.MutableLiveData;
import rod.m;
import ood.d;
import ood.e;
import bod.a;
import rod.b;

public final class TextPanelTemplateHostViewBinderV3$b implements View$OnClickListener	// class@000c62
{
    public final TextPanelTemplateHostViewBinderV3 b;

    public void TextPanelTemplateHostViewBinderV3$b(TextPanelTemplateHostViewBinderV3 p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextPanelTemplateHostViewBinderV3$b.class, "1")) {
          return;
       }
       a.a.c(false);
       MutableLiveData mutableLiveD = this.b.d.t0();
       a uoa = e.a().j();
       String id = (uoa != null)? uoa.getId(): null;
       mutableLiveD.setValue(id);
       this.b.d.u0().setValue("DEFAULT_TEXT_TEMPLATE_ITEM_V3_ID");
       b uob = this.b.d.r0();
       if (uob != null) {
          uob.a(-1, e.a());
       }
       return;
    }
}
