package dca.p;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.editor.aicutv2.ui.VideoTemplateViewBinder;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateClearCancelAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;

public final class p implements View$OnClickListener	// class@001efe
{
    public final VideoTemplateViewBinder b;

    public void p(VideoTemplateViewBinder p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, p.class, "1")) {
          return;
       }
       this.b.l.t0(new VideoTemplateClearCancelAction());
       PatchProxy.onMethodExit(p.class, "1");
       return;
    }
}
