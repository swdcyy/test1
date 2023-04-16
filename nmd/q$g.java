package nmd.q$g;
import android.content.DialogInterface$OnDismissListener;
import nmd.q;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import smd.d;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.relay.RelayStickerFriendsDialogAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;

public final class q$g implements DialogInterface$OnDismissListener	// class@001e70
{
    public final q b;

    public void q$g(q p0){
       this.b = p0;
       super();
    }
    public final void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q$g.class, "1")) {
          return;
       }
       q$g tb = this.b;
       if (tb.x == null) {
          tb.l0();
       }
       this.b.h0().t0(new RelayStickerFriendsDialogAction(false));
       return;
    }
}
