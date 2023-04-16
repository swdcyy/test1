package g19.h0;
import java.lang.Runnable;
import com.yxcorp.gifshow.ad.detail.presenter.side.k$b;
import java.lang.Object;
import java.util.Objects;
import com.yxcorp.gifshow.ad.detail.presenter.side.k;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import k2b.u1;

public final class h0 implements Runnable	// class@0023ba
{
    public final k$b b;

    public void h0(k$b p0){
       this.b = p0;
    }
    public final void run(){
       k$b a = this.b.a;
       Objects.requireNonNull(a);
       if (PatchProxy.applyVoid(null, a, k.class, "7")) {
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "CLICK_VOTE";
          JsonObject jsonObject = new JsonObject();
          jsonObject.c0("loc", "SLIDE_WINDOW_HEAD");
          uElementPack.params = jsonObject.toString();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(a.r.mEntity);
          u1.C0("", a.t, 6, uElementPack, uContentPack);
       }
       return;
    }
}
