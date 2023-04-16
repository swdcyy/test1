package k71.t;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import k71.t$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o63.m;
import o63.m$a;
import com.kuaishou.live.core.show.webview.jsparams.LiveJsOpenLiveProfileCardParams$Params;
import lp3.e;
import s51.c;
import lp3.c;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import com.kuaishou.live.core.show.webview.jsparams.LiveJsOpenLiveProfileCardParams$Params$ExtraInfo;
import fg6.a;
import com.google.gson.Gson;
import java.util.Map;
import va1.s0;
import android.app.Activity;
import o63.b;
import android.content.Context;

public final class t extends AbstractLiveJsCommand	// class@002cc8
{

    public void t(){
       super();
    }
    public Class a(){
       return t$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       String str1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, t.class, "1");
       if (p1 != patchProxyRe) {
          return p1;
       }
       if (!p0 instanceof t$a) {
          return m.g.c("invalid params");
       }
       if (p0.a() == null) {
          return m.g.c("param is required");
       }
       c uoc = this.h().a(c.class);
       a.o(uoc, "serviceManager.getServic¡­ManagerProxy::class.java\)");
       p0 = p0.a();
       String str = PatchProxy.applyOneRefs(p0, this, t.class, "2");
       if (str != patchProxyRe) {
       }else {
          HashMap hashMap = new HashMap();
          LiveJsOpenLiveProfileCardParams$Params mTargetUserI = p0.mTargetUserId;
          if (mTargetUserI != null) {
             hashMap.put("id", mTargetUserI);
          }
          hashMap.put("dimenable", String.valueOf(p0.mIsDimEnabled));
          p0 = p0.mExtraInfo;
          if (p0 != null) {
             LiveJsOpenLiveProfileCardParams$Params$ExtraInfo mName = p0.mName;
             if (mName != null) {
                hashMap.put("username", mName);
             }
             hashMap.put("originsource", String.valueOf(p0.mProfileOriginSource));
             hashMap.put("followsource", String.valueOf(p0.mFollowSource));
             mName = p0.mRoleInfos;
             if (mName != null) {
                str1 = a.a.q(mName);
                a.o(str1, "Gsons.KWAI_GSON.toJson\(roleInfos\)");
                hashMap.put("roleinfos", str1);
             }
             mName = p0.mHeadUrls;
             if (mName != null) {
                str1 = a.a.q(mName);
                a.o(str1, "Gsons.KWAI_GSON.toJson\(headUrls\)");
                hashMap.put("headurls", str1);
             }
             p0 = p0.mLiveFollowExtParams;
             if (p0 != null) {
                p0 = a.a.q(p0);
                a.o(p0, "Gsons.KWAI_GSON.toJson\(liveFollowExtParamsMap\)");
                hashMap.put("liveFollowExtParams", p0);
             }
          }
          hashMap.put("overlay", "true");
          str = s0.d("kwailive://profile", hashMap);
          a.o(str, "UrlUtil.appendQueryParameters\(host, queryParams\)");
       }
       if (!uoc.P0(str)) {
          return m.g.c("not supported");
       }else if(uoc.r4(str, b.a(this.h()))){
          p0 = m$a.g(m.g, null, false, 3, null);
       }else {
          p0 = m.g.c("startRouter failed");
       }
       return p0;
    }
}
