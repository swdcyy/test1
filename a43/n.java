package a43.n;
import java.lang.Object;
import com.kuaishou.live.feedback.LiveInternalNegativeFeedbackConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.app.Activity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import android.content.Context;
import com.kwai.feature.api.social.login.model.LoginParams;
import n3d.a;
import d61.g;
import android.net.Uri;
import android.net.Uri$Builder;
import com.google.gson.JsonObject;
import com.kuaishou.android.model.mix.CommonMeta;
import java.lang.Integer;
import java.lang.Number;
import com.google.gson.JsonElement;
import wkd.b;
import nf6.i;
import ekd.x0;
import android.content.Intent;

public class n	// class@000046
{

    public void n(){
       super();
    }
    public static LiveInternalNegativeFeedbackConfig a(){
       Object obj = PatchProxy.apply(null, null, n.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("feedBackEnableConfig", LiveInternalNegativeFeedbackConfig.class, null);
    }
    public static boolean b(){
       LiveInternalNegativeFeedbackConfig obj = PatchProxy.apply(null, null, n.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = n.a();
       boolean b = false;
       if (obj == null) {
          return b;
       }
       if (obj.mFeedBackEnabled == 1 && !TextUtils.isEmpty(obj.mFeedBackUrl)) {
          b = true;
       }
       return b;
    }
    public static void c(Activity p0,QPhoto p1){
       n on = n.class;
       Object obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, on, "3")) {
          return;
       }
       if (!QCurrentUser.ME.isLogined()) {
          d.a(-1712118428).x00(p0, 0, obj, obj);
       }else {
          LiveInternalNegativeFeedbackConfig liveInternal = n.a();
          if (n.b() && !g.h(p0)) {
             Uri$Builder uBuilder = Uri.parse(liveInternal.mFeedBackUrl).buildUpon();
             String str = PatchProxy.applyOneRefs(p1, obj, on, "4");
             if (str != PatchProxyResult.class) {
             }else {
                JsonObject jsonObject = new JsonObject();
                jsonObject.c0("uid", QCurrentUser.ME.getId());
                if (p1.getCommonMeta() != null) {
                   jsonObject.c0("llsid", p1.getCommonMeta().mListLoadSequenceID);
                }
                jsonObject.c0("itemId", p1.getPhotoId());
                jsonObject.a0("itemType", Integer.valueOf(2));
                jsonObject.c0("expTag", p1.getExpTag());
                jsonObject.a0("sourceType", Integer.valueOf(1));
                str = jsonObject.toString();
             }
             uBuilder.appendQueryParameter("feedBackInfo", str);
             Intent intent = b.a(0x66dce92a).a(p0, x0.f(uBuilder.build().toString()));
             if (intent != null) {
                p0.startActivity(intent);
             }
          }
       }
       return;
    }
}
