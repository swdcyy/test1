package k71.s;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import com.kuaishou.live.core.show.webview.jsparams.LiveJsOpenLiveGiftPanelParams;
import java.lang.Object;
import o63.j$a;
import asd.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o63.m;
import o63.m$a;
import lp3.e;
import s51.c;
import lp3.c;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Map;
import va1.s0;
import android.app.Activity;
import o63.b;
import android.content.Context;

public final class s extends AbstractLiveJsCommand	// class@002cc6
{

    public void s(){
       super();
    }
    public Class a(){
       return LiveJsOpenLiveGiftPanelParams.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, s.class, "1");
       if (p2 != patchProxyRe) {
          return p2;
       }
       if (!p0 instanceof LiveJsOpenLiveGiftPanelParams) {
          return m.g.c("invalid params");
       }
       p2 = this.h().a(c.class);
       a.o(p2, "serviceManager.getServic¡­ManagerProxy::class.java\)");
       String str = PatchProxy.applyOneRefs(p0, this, s.class, "2");
       if (str != patchProxyRe) {
       }else {
          HashMap hashMap = new HashMap();
          if (!TextUtils.isEmpty(p0.mGiftTab)) {
             LiveJsOpenLiveGiftPanelParams mGiftTab = p0.mGiftTab;
             a.o(mGiftTab, "params.mGiftTab");
             hashMap.put("tab", mGiftTab);
          }
          hashMap.put("sourceType", String.valueOf(p0.mSource));
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
