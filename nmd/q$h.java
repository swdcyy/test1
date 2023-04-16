package nmd.q$h;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.friends.SelectFriendsDialog$a;
import nmd.q;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import fmd.a;
import qmd.a;
import qmd.f;
import java.util.Objects;
import faa.a;
import java.lang.StringBuilder;
import q87.c;

public final class q$h implements SelectFriendsDialog$a	// class@001e71
{
    public final q a;

    public void q$h(q p0){
       this.a = p0;
       super();
    }
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q$h.class, "1")) {
          return;
       }
       a.p(p0, "friends");
       a uoa = this.a.g0();
       if (uoa != null) {
          uoa = uoa.b();
          if (uoa != null) {
             uoa.b(p0);
          }
       }
       q x = this.a.x;
       if (x instanceof f) {
          Objects.requireNonNull(x, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.sticker_v2.ui.relay.RelayInputPopupWindow");
          x.c(p0);
       }
       Object[] objArray = new Object[0];
       a.D().w("StickerKeyboardPanelViewBinder", "onSelected: "+p0.size(), objArray);
       return;
    }
}
