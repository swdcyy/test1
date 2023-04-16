package m2a.c;
import erd.g;
import m2a.f;
import kf5.g;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.String;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import d6a.e;
import com.kwai.framework.model.feed.BaseFeed;
import exb.b;
import zic.p0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.yxcorp.utility.TextUtils;
import java.lang.Long;
import bz9.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class c implements g	// class@002f02
{
    public final f b;
    public final g c;

    public void c(f p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       c tb = this.b;
       c tc = this.c;
       boolean b = true;
       if (!tb.E()) {
          tc.a();
          i.g(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f100ecf), b, b);
       }else {
          b uob = null;
          p0.c(tb.C, tb.E.mEntity, new StatModel("PLAYER_PANEL_SHARE"), uob, tb.F.a());
          if (!PatchProxy.applyVoid(uob, tb, f.class, "3")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.type = 18;
             uElementPack.action2 = "DOWNLOAD_BTN_IN_LONG_PRESS_MASK";
             p0 = new JsonObject();
             p0.c0("source", "PLAYER_PANEL_SHARE");
             uElementPack.params = p0.toString();
             p0 = w1.f(tb.E.mEntity);
             p0.identity = TextUtils.k(tb.E.getPhotoId());
             p0.authorId = Long.valueOf(tb.E.getUserId()).longValue();
             p0.type = (c.a.a(tb.E))? 5: b;
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = p0;
             u1.M("", tb.D, 1, uElementPack, uContentPack, null);
          }
          tc.a();
       }
       return;
    }
}
