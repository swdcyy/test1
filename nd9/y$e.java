package nd9.y$e;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import nd9.y;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import o07.o;

public final class y$e implements PopupInterface$h	// class@003161
{
    public final y b;

    public void y$e(y p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y$e.class, "1")) {
          return;
       }
       a.p(p0, "popup");
       y$e tb = this.b;
       SimpleMagicFace mId = tb.j.mId;
       y k = tb.k;
       if (k == null) {
          k = "";
       }
       y oy = k;
       BaseFragment uBaseFragmen = tb.l.f();
       if (!PatchProxy.applyVoidThreeRefs(mId, oy, uBaseFragmen, null, CameraLogger.class, "49")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "MAGIC_FACE_BUBBLE";
          JsonObject jsonObject = new JsonObject();
          jsonObject.c0("magic_face_id", mId);
          jsonObject.c0("music_id", oy);
          uElementPack.params = jsonObject.toString();
          u1.C0(null, uBaseFragmen, 10, uElementPack, null);
       }
       return;
    }
    public void H(c p0,int p1){
       o.b(this, p0, p1);
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
