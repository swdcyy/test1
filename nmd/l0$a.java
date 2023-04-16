package nmd.l0$a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.c$a;
import nmd.l0;
import smd.d;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import w46.b;
import nmd.v;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.AddStickerAction;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import mmd.b;
import uvc.a;
import xld.a;
import cmd.b;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.player.UpdatePlayerTimeAction;
import com.yxcorp.gifshow.v3.framework.player.UpdateTo;

public final class l0$a implements c$a	// class@001e62
{
    public final l0 a;
    public final d b;

    public void l0$a(l0 p0,d p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void b(StickerDetailInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l0$a.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "StickerVideoPreviewViewBinder";
       a.D().w(str, "onAddSticker: "+p0, objArray);
       if (p0 == null) {
          Object[] objArray1 = new Object[i];
          a.D().t(str, "stickerDetailInfo is null", objArray1);
          return;
       }else {
          int i1 = 0x7f11066a;
          if (!p0.isTagSticker() && (p0.isInteractiveSticker() && this.a.c0())) {
             i.d(i1, a1.p(R.string.arg_RES_7f1016e1));
             return;
          }else if(p0.isTagSticker() && this.a.d0()){
             i.d(i1, a1.p(R.string.arg_RES_7f104beb));
             return;
          }else {
             l0$a tb = this.b;
             AddStickerAction uAddStickerA = new AddStickerAction(tb.o0().a().c(), this.b.o0().m(), p0, this.a.q0(), this.b.o0().w());
             tb.t0(v9);
             if (!this.b.o0().a().c() - this.b.o0().m()) {
                l0$a tb1 = this.b;
                tb1.t0(new UpdatePlayerTimeAction((tb1.o0().a().c() - 0x3f50624dd2f1a9fc), UpdateTo.BOTH));
             }
             return;
          }
       }
    }
}
