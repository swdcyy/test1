package k71.w;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import k71.w$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o63.m;
import o63.m$a;
import com.kuaishou.live.core.show.webview.jsparams.LiveJsShowGuestGiftPanelParams$Params;
import lp3.e;
import s51.c;
import lp3.c;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.framework.model.user.UserInfo;
import fg6.a;
import com.google.gson.Gson;
import java.util.Map;
import va1.s0;
import android.app.Activity;
import o63.b;
import android.content.Context;

public final class w extends AbstractLiveJsCommand	// class@002ccd
{

    public void w(){
       super();
    }
    public Class a(){
       return w$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       LiveJsShowGuestGiftPanelParams$Params mScene;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, w.class, "1");
       if (p2 != patchProxyRe) {
          return p2;
       }
       if (!p0 instanceof w$a) {
          return m.g.c("invalid params");
       }
       if (p0.a() == null) {
          return m.g.c("param is required");
       }
       p2 = this.h().a(c.class);
       a.o(p2, "serviceManager.getServic¡­ManagerProxy::class.java\)");
       p0 = p0.a();
       String str = PatchProxy.applyOneRefs(p0, this, w.class, "2");
       if (str != patchProxyRe) {
       }else {
          HashMap hashMap = new HashMap();
          if (!TextUtils.isEmpty(p0.mScene)) {
             mScene = p0.mScene;
             a.o(mScene, "params.mScene");
             hashMap.put("scene", mScene);
          }
          hashMap.put("sourceType", String.valueOf(p0.mSource));
          mScene = p0.mGuestUserInfo;
          if (mScene != null) {
             UserInfo mId = mScene.mId;
             if (mId != null) {
                hashMap.put("userid", mId);
             }
             mId = mScene.mName;
             if (mId != null) {
                hashMap.put("username", mId);
             }
             mId = mScene.mHeadUrl;
             if (mId != null) {
                hashMap.put("userheadurl", mId);
             }
             UserInfo mHeadUrls = mScene.mHeadUrls;
             if (mHeadUrls != null) {
                str = a.a.q(mHeadUrls);
                a.o(str, "Gsons.KWAI_GSON.toJson\(headUrls\)");
                hashMap.put("headurls", str);
             }
          }
          p0 = p0.mExtraMessage;
          if (p0 != null && (p0.isEmpty() ^ 0x01)) {
             p0 = a.a.q(p0);
             a.o(p0, "Gsons.KWAI_GSON.toJson\(it\)");
             hashMap.put("bizmap", p0);
          }
          str = s0.d("kwailive://giftpanel", hashMap);
          a.o(str, "UrlUtil.appendQueryParameters\(host, queryParams\)");
       }
       if (!p2.P0(str)) {
          return m.g.c("not supported");
       }else if(p2.r4(str, b.a(this.h()))){
          p1.L();
          p0 = m$a.g(m.g, null, false, 3, null);
       }else {
          p0 = m.g.c("startRouter failed");
       }
       return p0;
    }
}
