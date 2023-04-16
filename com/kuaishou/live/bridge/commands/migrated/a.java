package com.kuaishou.live.bridge.commands.migrated.a;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import com.kuaishou.live.bridge.commands.migrated.a$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o63.m;
import o63.m$a;
import com.kuaishou.live.core.show.webview.jsparams.LiveJsProvideCacheParams$Params;
import tm2.c;
import com.kuaishou.live.core.show.webview.jsresult.LiveJsProvideLocalCacheResult;
import java.util.List;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Collection;
import ekd.q;
import java.lang.Iterable;
import qk.m;
import tm2.b;
import ok.o;
import com.google.common.base.Optional;
import com.kuaishou.live.core.show.webview.cache.LiveWebViewLocalCacheEntry;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Map;

public final class a extends AbstractLiveJsCommand	// class@000e27
{

    public void a(){
       super();
    }
    public Class a(){
       return a$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "1");
       if (p1 != patchProxyRe) {
          return p1;
       }
       if (!p0 instanceof a$a) {
          return m.g.c("invalid params");
       }
       if (p0.a() == null) {
          return m.g.c("param is required");
       }
       p0 = p0.a();
       LiveWebViewLocalCacheEntry liveWebViewL = null;
       LiveJsProvideLocalCacheResult liveJsProvid = PatchProxy.applyOneRefs(p0, liveWebViewL, c.class, "4");
       if (liveJsProvid != patchProxyRe) {
       }else {
          p0 = p0.mCacheKey;
          List list = c.a();
          p0 = (!TextUtils.x(p0) && !q.f(list))? m.s(list).r(new b(p0)).orNull(): liveWebViewL;
          LiveLogTag lIVE_WEB_VIE = LiveLogTag.LIVE_WEB_VIEW;
          String str = (p0 == null)? "null": p0;
          b.c0(lIVE_WEB_VIE, "provideCache", "jsInjectCacheParams", str);
          if (p0 != null) {
             liveWebViewL = p0.mData;
          }
          liveJsProvid = new LiveJsProvideLocalCacheResult(liveWebViewL);
       }
       return m.g.f(liveJsProvid, true);
    }
}
