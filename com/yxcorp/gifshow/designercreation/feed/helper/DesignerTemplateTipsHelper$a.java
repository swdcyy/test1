package com.yxcorp.gifshow.designercreation.feed.helper.DesignerTemplateTipsHelper$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.designercreation.feed.helper.DesignerTemplateTipsHelper;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.fragment.e;
import com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationTemplateFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public final class DesignerTemplateTipsHelper$a implements View$OnClickListener	// class@0012dc
{
    public final DesignerTemplateTipsHelper b;

    public void DesignerTemplateTipsHelper$a(DesignerTemplateTipsHelper p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DesignerTemplateTipsHelper$a.class, "1")) {
          return;
       }
       e d = this.b.d;
       if (d != null) {
          d.a();
       }
       return;
    }
}
