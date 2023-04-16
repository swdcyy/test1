package lx1.e;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.sceneactivitywidget.container.a;
import java.lang.Object;
import android.view.View;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import ox1.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.widget.LinearLayout;
import com.kuaishou.live.common.core.component.sceneactivitywidget.container.SceneActivityWidgetBannerView;
import java.util.List;

public final class e implements View$OnClickListener	// class@003070
{
    public final a b;

    public void e(a p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       e tb = this.b;
       String str = (tb.h != null)? "FOLD": "OPEN";
       ClientContent$LiveStreamPackage liveStreamPa = tb.d();
       if (!PatchProxy.applyVoidTwoRefs(str, liveStreamPa, null, a.class, "3")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "LIVE_INTERACT_PENDANT_FOLD_BUTTON";
          JsonObject jsonObject = new JsonObject();
          jsonObject.c0("btn_type", str);
          uElementPack.params = jsonObject.toString();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.G("", 1, uElementPack, uContentPack);
       }
       if (tb.h != null) {
          if (!PatchProxy.applyVoid(null, tb, a.class, "7")) {
             if (!tb.c.getVisibility()) {
                tb.c.setVisibility(8);
             }
             tb.h = false;
             tb.d.setVisibility(false);
             tb.c.a();
             tb.g();
             tb.f(50, (tb.i.size() * 50));
          }
       }else {
          tb.e();
       }
       return;
    }
}
