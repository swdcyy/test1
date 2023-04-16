package nd9.y$c;
import android.view.View$OnClickListener;
import nd9.y;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import ee9.c;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.magic.data.repo.response.MagicEmojiEntrance;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class y$c implements View$OnClickListener	// class@00315f
{
    public final y b;

    public void y$c(y p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y$c.class, "1")) {
          return;
       }
       y$c tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tb, y.class, "3")) {
          tb.l.m(new c(tb.j, 0, true, objArray));
          SimpleMagicFace mId = tb.j.mId;
          y k = tb.k;
          if (k == null) {
             k = "";
          }
          y oy = k;
          BaseFragment uBaseFragmen = tb.l.f();
          if (!PatchProxy.applyVoidThreeRefs(mId, oy, uBaseFragmen, null, CameraLogger.class, "50")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "MAGIC_FACE_BUBBLE_BUTTON";
             JsonObject jsonObject = new JsonObject();
             jsonObject.c0("magic_face_id", mId);
             jsonObject.c0("music_id", oy);
             uElementPack.params = jsonObject.toString();
             u1.M("", uBaseFragmen, 1, uElementPack, null, null);
          }
          tb.a();
       }
       return;
    }
}
