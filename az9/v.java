package az9.v;
import erd.g;
import az9.i0;
import java.lang.Object;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import e17.i;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import java.lang.String;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.feed.BaseFeed;
import zic.p0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kp.r1;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import ekd.j;
import az9.a;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.yxcorp.utility.TextUtils;
import java.lang.Long;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class v implements g	// class@00033c
{
    public final i0 b;

    public void v(i0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       int i;
       boolean b1;
       v tb = this.b;
       String str = "COVER";
       if (!tb.u.isAllowPhotoDownload()) {
          i.a(R.style.arg_RES_7f11066a, 0x7f100ecf);
       }else {
          p0.a(tb.v, tb.u.mEntity, new StatModel(str));
          tb.o0();
       }
       p0 = PatchProxyResult.class;
       i0 oi0 = i0.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, tb, oi0, "28");
       i = 1;
       boolean b = false;
       if (obj != p0) {
          b = obj.booleanValue();
       }else {
          Object obj1 = PatchProxy.apply(objArray, tb, oi0, "29");
          if (obj1 != p0) {
             b1 = obj1.booleanValue();
          }else {
             p0 = tb.u.mEntity;
             b1 = (p0 == null)? false: r1.v3(p0);
          }
          if (b1 || (!j.h(r1.n0(tb.u.mEntity)) && r1.n0(tb.u.mEntity).length > 0)) {
             b = true;
          }
       }
       p0 = tb.u;
       i0 x = tb.x;
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(b), p0, x, null, a.class, "13")) {
          a.p(p0, "photo");
          a.p(x, "fragment");
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.type = 18;
          uElementPack.action2 = "DOWNLOAD_BTN_IN_LONG_PRESS_MASK";
          JsonObject jsonObject = new JsonObject();
          jsonObject.c0("source", str);
          uElementPack.params = jsonObject.toString();
          ClientContent$PhotoPackage photoPackage = w1.f(p0.mEntity);
          photoPackage.identity = TextUtils.k(p0.getPhotoId());
          p0 = Long.valueOf(p0.getUserId());
          a.o(p0, "java.lang.Long.valueOf\(photo.getUserId\(\)\)");
          photoPackage.authorId = p0.longValue();
          if (b) {
             i = 5;
          }
          photoPackage.type = i;
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = photoPackage;
          u1.M("", x, 1, uElementPack, uContentPack, null);
       }
       return;
    }
}
