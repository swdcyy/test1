package cnd.f;
import com.yxcorp.gifshow.widget.m;
import cnd.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleRetryAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;

public final class f extends m	// class@00034c
{
    public final b c;

    public void f(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       this.c.c.t0(new SubtitleRetryAction());
       return;
    }
}
