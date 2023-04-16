package com.yxcorp.gifshow.v3.editor.effectv2.vb.HighlightTextPanelViewBinder$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.v3.editor.effectv2.vb.HighlightTextPanelViewBinder;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.effectv2.action.HighlightTextPanelOpenAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;

public final class HighlightTextPanelViewBinder$a extends m	// class@000f60
{
    public final HighlightTextPanelViewBinder c;

    public void HighlightTextPanelViewBinder$a(HighlightTextPanelViewBinder p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HighlightTextPanelViewBinder$a.class, "1")) {
          return;
       }
       this.c.o.t0(new HighlightTextPanelOpenAction());
       return;
    }
}
