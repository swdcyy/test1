package cnd.b$b;
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
import vmd.c;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import k2b.e0;

public final class b$b extends m	// class@000345
{
    public final b c;

    public void b$b(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       this.c.c.t0(new SubtitleRetryAction());
       Fragment uFragment = this.c.D();
       Objects.requireNonNull(uFragment, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
       c.a.d(uFragment);
       return;
    }
}
