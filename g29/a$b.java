package g29.a$b;
import erd.g;
import g29.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import k2b.u1;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import android.app.Activity;
import android.content.Context;
import com.kwai.feature.api.social.login.model.LoginParams;
import n3d.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import com.kuaishou.android.model.mix.CommonMeta;
import java.lang.Number;
import kp.r1;
import java.lang.Integer;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import java.lang.Long;
import java.lang.Enum;
import com.google.gson.JsonElement;
import fg6.a;
import com.google.gson.Gson;
import java.net.URLEncoder;
import java.lang.StringBuilder;
import wkd.b;
import nf6.i;
import android.net.Uri;
import ekd.x0;
import android.content.Intent;

public final class a$b implements g	// class@0023ea
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       Object[] objArray1;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          Object[] objArray = null;
          int i = 1;
          if (!PatchProxy.applyVoid(objArray, p0, uoa, "8")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "INTERNAL_FEEDBACK_BUTTON";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             a u1 = p0.u;
             if (u1 == null) {
                a.S("mPhoto");
             }
             uContentPack.photoPackage = w1.f(u1.getEntity());
             p0 = p0.w;
             if (p0 == null) {
                a.S("mFragment");
             }
             u1.L("", p0, i, uElementPack, uContentPack);
          }
          p0 = QCurrentUser.ME;
          String str = "QCurrentUser.ME";
          a.o(p0, str);
          if (!p0.isLogined()) {
             d.a(-1712118428).x00(a.n0(this.b), 0, objArray, objArray);
          }else if(!TextUtils.x(this.b.t)){
             p0 = this.b.t;
          }else {
             p0 = "https://reco-tag.corp.kuaishou.com/?layoutType=4&&";
          }
          a$b tb = this.b;
          Objects.requireNonNull(tb);
          String str1 = PatchProxy.apply(objArray, tb, uoa, "2");
          if (str1 != PatchProxyResult.class) {
          }else {
             JsonObject jsonObject = new JsonObject();
             QCurrentUser mE = QCurrentUser.ME;
             a.o(mE, str);
             str = mE.getId();
             jsonObject.c0("uid", str);
             a u = tb.u;
             if (u == null) {
                a.S("mPhoto");
             }
             CommonMeta commonMeta = u.getCommonMeta();
             commonMeta = (commonMeta != null)? commonMeta.mListLoadSequenceID: objArray;
             jsonObject.c0("llsid", commonMeta);
             u = tb.u;
             if (u == null) {
                a.S("mPhoto");
             }
             jsonObject.c0("itemId", u.getPhotoId());
             u = tb.u;
             if (u == null) {
                a.S("mPhoto");
             }
             BaseFeed entity = u.getEntity();
             a.o(entity, "mPhoto.entity");
             JsonObject obj = PatchProxy.applyOneRefs(entity, tb, uoa, "3");
             if (obj != PatchProxyResult.class) {
                i = obj.intValue();
             }else if(r1.D3(entity)){
                if (r1.S2(entity)) {
                   i = 2;
                }else if(r1.f2(entity)){
                   i = 3;
                }else if(r1.v3(entity)){
                   i = 5;
                }else {
                   i = 0;
                }
             }
             jsonObject.a0("itemType", Integer.valueOf(i));
             uoa = tb.u;
             if (uoa == null) {
                a.S("mPhoto");
             }
             jsonObject.c0("expTag", uoa.getExpTag());
             jsonObject.a0("sourceType", Integer.valueOf(2));
             obj = new JsonObject();
             u = tb.u;
             if (u == null) {
                a.S("mPhoto");
             }
             PhotoAdvertisement photoAdverti = k.B(u);
             Long longx = (photoAdverti != null)? Long.valueOf(photoAdverti.mCreativeId): objArray;
             obj.a0("creativeId", longx);
             u = tb.u;
             if (u == null) {
                a.S("mPhoto");
             }
             photoAdverti = k.B(u);
             if (photoAdverti != null) {
                photoAdverti = photoAdverti.mAdGroup;
                if (photoAdverti != null) {
                   objArray = Integer.valueOf(photoAdverti.ordinal());
                }
             }
             obj.a0("adType", objArray);
             jsonObject.G("ad", obj);
             str1 = a.a.p(jsonObject);
             a.o(str1, "Gsons.KWAI_GSON.toJson\(jsonObject\)");
          }
          p0 = p0+" feedBackInfo = "+URLEncoder.encode(str1, "utf-8");
          if (!a.n0(this.b).isFinishing()) {
             p0 = b.a(0x66dce92a).a(a.n0(this.b), x0.f(p0));
             if (p0 != null) {
                a.n0(this.b).startActivity(p0);
             }
          }
       }
       return;
    }
}
