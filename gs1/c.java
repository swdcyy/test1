package gs1.c;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.selfanchor.LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import o07.o;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class c implements PopupInterface$h	// class@002571
{
    public final LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding b;

    public void c(LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       o.e(this, p0);
    }
    public void H(c p0,int p1){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, c.class, "1")) {
          return;
       }
       a.p(p0, "popup");
       p0.h = null;
       return;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
