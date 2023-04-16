package dnd.a$a;
import androidx.fragment.app.c$b;
import dnd.a;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.previewer.EditorBasePreviewFragment;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import wvc.a;
import tvc.e;
import zmd.a;
import uvc.a;
import xld.a;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import dnd.a$a$a;
import java.lang.Runnable;
import ekd.k1;

public final class a$a extends c$b	// class@000ce1
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void i(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a.class, "1")) {
          return;
       }
       a.p(p0, "fm");
       a.p(p1, "f");
       if (p1 instanceof EditorBasePreviewFragment && (this.a.G().o0().a().e() && !this.a.E().isPlaying())) {
          k1.r(new a$a$a(this), 50);
       }
    label_0045 :
       return;
    }
}
