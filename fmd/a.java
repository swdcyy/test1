package fmd.a;
import smd.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import qmd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import mmd.b;
import java.util.List;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.relay.RelayStickerInvitedFriendsUpdateAction;
import xvc.b;

public final class a	// class@000e4c
{
    public b a;
    public a b;
    public final d c;
    public final boolean d;

    public void a(d p0,boolean p1){
       a.p(p0, "mViewModel");
       super();
       this.c = p0;
       this.d = p1;
    }
    public final boolean a(){
       return this.d;
    }
    public final a b(){
       return this.b;
    }
    public final boolean c(){
       Object obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.d != null || this.c.o0().w())? true: false;
       return b;
    }
    public final void d(List p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, a.class, "4")) {
          return;
       }
       a.p(p0, "userInfoList");
       this.c.t0(new RelayStickerInvitedFriendsUpdateAction(p0, p1, p2, this.c()));
       return;
    }
}
