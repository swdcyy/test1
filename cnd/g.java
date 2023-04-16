package cnd.g;
import com.yxcorp.gifshow.widget.m;
import cnd.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitlePanelFragment;
import vmd.c;
import k2b.e0;

public final class g extends m	// class@00034d
{
    public final b c;

    public void g(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       Fragment uFragment = this.c.D();
       Objects.requireNonNull(uFragment, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitlePanelFragment");
       uFragment.yh();
       Fragment uFragment1 = this.c.D();
       Objects.requireNonNull(uFragment1, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
       c.a.a(uFragment1);
       return;
    }
}
