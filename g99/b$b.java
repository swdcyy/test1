package g99.b$b;
import android.view.View$OnClickListener;
import g99.b;
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
import fg6.a;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import java.net.URLEncoder;
import java.lang.StringBuilder;
import wkd.b;
import nf6.i;
import android.net.Uri;
import ekd.x0;
import android.content.Intent;

public final class b$b implements View$OnClickListener	// class@00243c
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       b p;
       String str2;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       b$b tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tb, uob, "10")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "INTERNAL_FEEDBACK_BUTTON";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          p = tb.q;
          if (p == null) {
             a.S("mPhoto");
          }
          uContentPack.photoPackage = w1.f(p.getEntity());
          u1.G("", 1, uElementPack, uContentPack);
       }
       QCurrentUser mE = QCurrentUser.ME;
       String str = "QCurrentUser.ME";
       a.o(mE, str);
       int i = 0;
       if (!mE.isLogined()) {
          d.a(-1712118428).x00(this.b.P8(), i, objArray, objArray);
       }else if(!TextUtils.x(this.b.p)){
          p = this.b.p;
       }else {
          str2 = "https://reco-tag.corp.kuaishou.com/?layoutType=4&&";
       }
       b$b tb1 = this.b;
       Objects.requireNonNull(tb1);
       String str1 = PatchProxy.apply(objArray, tb1, uob, "8");
       if (str1 != PatchProxyResult.class) {
       }else {
          JsonObject jsonObject = new JsonObject();
          QCurrentUser mE1 = QCurrentUser.ME;
          a.o(mE1, str);
          str = mE1.getId();
          jsonObject.c0("uid", str);
          b q = tb1.q;
          if (q == null) {
             a.S("mPhoto");
          }
          CommonMeta commonMeta = q.getCommonMeta();
          if (commonMeta != null) {
             objArray = commonMeta.mListLoadSequenceID;
          }
          jsonObject.c0("llsid", objArray);
          b q1 = tb1.q;
          if (q1 == null) {
             a.S("mPhoto");
          }
          jsonObject.c0("itemId", q1.getPhotoId());
          q1 = tb1.q;
          if (q1 == null) {
             a.S("mPhoto");
          }
          BaseFeed entity = q1.getEntity();
          a.o(entity, "mPhoto.entity");
          Object obj = PatchProxy.applyOneRefs(entity, tb1, uob, "9");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else {
             a.p(entity, "feed");
             if (r1.D3(entity)) {
                i = 1;
             }else if(r1.S2(entity)){
                i = 2;
             }else if(r1.f2(entity)){
                i = 3;
             }else if(r1.v3(entity)){
                i = 5;
             }
          }
          jsonObject.a0("itemType", Integer.valueOf(i));
          uob = tb1.q;
          if (uob == null) {
             a.S("mPhoto");
          }
          jsonObject.c0("expTag", uob.getExpTag());
          jsonObject.a0("sourceType", Integer.valueOf(1));
          str1 = a.a.p(jsonObject);
          a.o(str1, "Gsons.KWAI_GSON.toJson\(jsonObject\)");
       }
       str2 = p+" feedBackInfo = "+URLEncoder.encode(str1, "utf-8");
       if (!this.b.P8().isFinishing()) {
          Intent intent = b.a(0x66dce92a).a(this.b.P8(), x0.f(str2));
          if (intent != null) {
             this.b.P8().startActivity(intent);
          }
       }
       return;
    }
}
