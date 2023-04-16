package af5.a$b;
import p1a.a;
import af5.a;
import java.lang.Object;
import p1a.a$a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import java.lang.CharSequence;
import java.lang.Long;
import im8.f;
import java.lang.Boolean;
import je5.b;
import k2b.u1;
import tl8.g;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import k2b.l0;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.e0;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.yxcorp.gifshow.log.model.CommonParams;
import org.json.JSONObject;
import com.kwai.framework.model.user.QCurrentUser;
import org.json.JSONException;
import java.util.Collection;
import ekd.q;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchUserPackage;
import java.util.List;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.kwai.framework.model.user.User;
import java.util.Map;
import java.lang.StringBuilder;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import af5.c;
import java.lang.Runnable;
import af5.b;

public class a$b implements a	// class@00008e
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public GifshowActivity a(a$a p0){
       ClientEvent$ElementPackage obj = PatchProxy.applyOneRefsWithListener(p0, this, a$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientEvent$ElementPackage();
       int i = 1;
       obj.type = i;
       obj.action = p0.b;
       obj.status = p0.g;
       obj.name = TextUtils.k(p0.c);
       obj.action2 = TextUtils.k(p0.e);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(this.a.r.mEntity);
       uContentPack = p0.d(uContentPack);
       obj.index = p0.d;
       obj.params = (TextUtils.x(p0.p))? TextUtils.k(this.a.w): TextUtils.k(p0.p);
       a$a b = p0.b;
       if (b != 306) {
          if (b != 810) {
             if (b == 0x75d7 && !TextUtils.x(p0.m)) {
                uContentPack.photoPackage.authorId = Long.valueOf(p0.m).longValue();
             }
          }else {
             obj.index = i;
          }
       }else {
          b = p0.a;
          if (i == b) {
             obj.index = i;
          }else {
             int i1 = 2;
             if (i1 == b) {
                obj.index = i1;
             }
          }
          uContentPack.photoPackage.fullScreenDisplay = this.a.q.get().booleanValue();
       }
       b = p0.l;
       if (b != null) {
          uContentPack.liveStreamPackage = b;
       }
       if (("PROGRESS_BUTTON").equalsIgnoreCase(obj.action2)) {
          String expTag = this.a.r.getExpTag();
          if (!PatchProxy.applyVoidOneRefs(expTag, null, b.class, "2")) {
             u1.O0("exp_tag", expTag);
          }
       }
       b = p0.k;
       if (b != null) {
          uContentPack.photoSeekBarDragPackage = b;
       }
       b = p0.n;
       if (b != null) {
          b.apply(uContentPack);
       }
       if (!TextUtils.x(p0.q)) {
          uContentPack.ksOrderInfoPackage = l0.a(p0.q);
       }
       p0.r(i);
       u1.B(new ClickMetaData().setLogPage(this.a.s).setType(p0.a).setDirection(0).setElementPackage(obj).setContentPackage(uContentPack).setIsRealTime(0).setFeedLogCtx(this.a.r.getFeedLogCtx()).setCommonParams(p0.e()));
       PatchProxy.onMethodExit(a$b.class, "1");
       return null;
    }
    public void b(a$a p0){
       a$b ta;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "2")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.name = p0.c;
       uElementPack.action2 = TextUtils.k(p0.e);
       uElementPack.type = 2;
       int i = 0;
       uElementPack.status = i;
       uElementPack.action = p0.b;
       uElementPack.index = p0.d;
       uElementPack.value = p0.f;
       String str = TextUtils.k(p0.p);
       try{
          uElementPack.params = str;
          JSONObject jSONObject = (TextUtils.x(str))? new JSONObject(): new JSONObject(uElementPack.params);
          String str3 = "is_login";
          String str4 = (QCurrentUser.me().isLogined())? "TRUE": "FALSE";
          jSONObject.put(str3, str4);
          jSONObject.put("login_uid", QCurrentUser.me().getId());
          uElementPack.params = jSONObject.toString();
       }catch(org.json.JSONException e2){
          e2.printStackTrace();
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(this.a.r.mEntity);
       a$a n = p0.n;
       if (n != null) {
          n.apply(uContentPack);
       }
       if (!q.f(p0.i)) {
          ClientContent$BatchUserPackage uBatchUserPa = new ClientContent$BatchUserPackage();
          ClientContent$UserPackage[] userPackageA = new ClientContent$UserPackage[p0.i.size()];
          a$a j = p0.j;
          while (i < p0.i.size()) {
             User user = p0.i.get(i);
             if (user != null) {
                ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
                userPackage.identity = user.mId;
                String str1 = "{\"is_live\":\"NO\"}";
                if (j != null && j.containsKey(user.getId())) {
                   Boolean uBoolean = j.get(user.getId());
                   if (uBoolean != null) {
                      String str2 = (uBoolean.booleanValue())? "YES": "NO";
                      userPackage.params = "{\"is_live\":\""+str2+"\"}";
                   }else {
                      userPackage.params = str1;
                   }
                }else {
                   userPackage.params = str1;
                }
                userPackageA[i] = userPackage;
             }
             i = i + 1;
          }
          uBatchUserPa.userPackage = userPackageA;
          uContentPack.batchUserPackage = uBatchUserPa;
       }
       a$a l = p0.l;
       if (l != null) {
          uContentPack.liveStreamPackage = l;
       }
       if (!TextUtils.x(p0.q)) {
          uContentPack.ksOrderInfoPackage = l0.a(p0.q);
       }
       ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
       showEvent.contentPackage = p0.d(uContentPack);
       showEvent.elementPackage = uElementPack;
       if (p0.t != null) {
          ta = this.a;
          if (ta.v != null) {
             ta.m8().post(new c(this, showEvent));
          }else {
             ta.R8(showEvent);
          }
          return;
       }else {
          ta = this.a;
          if (ta.v != null) {
             ta.m8().post(new b(this, uElementPack, uContentPack));
          }else {
             ta.P8(uElementPack, uContentPack);
          }
          return;
       }
    }
}
