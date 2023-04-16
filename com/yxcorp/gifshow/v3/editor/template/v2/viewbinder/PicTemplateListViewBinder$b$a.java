package com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateListViewBinder$b$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateListViewBinder$b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateRefreshListAction;
import xvc.b;
import ci0.a;

public final class PicTemplateListViewBinder$b$a implements View$OnClickListener	// class@001391
{
    public final PicTemplateListViewBinder$b b;

    public void PicTemplateListViewBinder$b$a(PicTemplateListViewBinder$b p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicTemplateListViewBinder$b$a.class, "1")) {
          return;
       }
       this.b.b.D(new PicTemplateRefreshListAction());
       return;
    }
}
