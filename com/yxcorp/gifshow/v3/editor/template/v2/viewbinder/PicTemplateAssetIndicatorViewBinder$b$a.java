package com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateAssetIndicatorViewBinder$b$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateAssetIndicatorViewBinder$b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.ARecyclerAdapter$d;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$b;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateSwitchAssetAction;
import buc.j;
import nsd.u;
import xvc.b;
import ci0.a;

public final class PicTemplateAssetIndicatorViewBinder$b$a implements View$OnClickListener	// class@001388
{
    public final PicTemplateAssetIndicatorViewBinder$b b;

    public void PicTemplateAssetIndicatorViewBinder$b$a(PicTemplateAssetIndicatorViewBinder$b p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicTemplateAssetIndicatorViewBinder$b$a.class, "1")) {
          return;
       }
       PicTemplateState$b uob = this.b.b();
       if (uob != null) {
          this.b.c.D(new PicTemplateSwitchAssetAction(uob, false, 2, null));
       }
       return;
    }
}
