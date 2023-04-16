package com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateListViewBinder$c$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateListViewBinder$c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.ARecyclerAdapter$d;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$e;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateSwitchTemplateAction;
import xvc.b;
import ci0.a;

public final class PicTemplateListViewBinder$c$a implements View$OnClickListener	// class@001393
{
    public final PicTemplateListViewBinder$c b;

    public void PicTemplateListViewBinder$c$a(PicTemplateListViewBinder$c p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicTemplateListViewBinder$c$a.class, "1")) {
          return;
       }
       PicTemplateState$e uoe = this.b.b();
       if (uoe != null) {
          this.b.g.D(new PicTemplateSwitchTemplateAction(uoe));
       }
       return;
    }
}
