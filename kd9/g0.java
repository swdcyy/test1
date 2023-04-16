package kd9.g0;
import com.yxcorp.gifshow.camera.record.frame.f$b;
import com.yxcorp.gifshow.camera.record.frame.l;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.frame.FrameModeInfo;
import com.yxcorp.gifshow.camera.record.frame.c$e;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kwai.library.widget.popup.common.c;

public final class g0 implements f$b	// class@002c51
{
    public final l a;

    public void g0(l p0){
       this.a = p0;
    }
    public final void a(FrameModeInfo p0){
       g0 ta = this.a;
       if (ta.z.v1()) {
       }else {
          FrameModeInfo mFrameLogMod = p0.mFrameLogMode;
          if (!PatchProxy.applyVoidOneRefs(mFrameLogMod, null, CameraLogger.class, "10")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "CLICK_FRAME_STYLE";
             JsonObject jsonObject = new JsonObject();
             jsonObject.c0("frame_name", mFrameLogMod);
             uElementPack.params = jsonObject.toString();
             u1.u(1, uElementPack, null);
          }
          ta.z.x1(p0.mFrameMode);
          l t = ta.t;
          if (t != null && t.K()) {
             ta.t.q(4);
          }
       }
       return;
    }
}
