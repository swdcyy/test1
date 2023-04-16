package com.kuaishou.live.bridge.commands.migrated.LiveJsCmdNavigateToH5;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import com.kuaishou.live.bridge.commands.migrated.LiveJsCmdNavigateToH5$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.increasefans.j;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.bridge.commands.migrated.LiveJsCmdNavigateToH5$WebType;
import kotlin.jvm.internal.a;
import java.util.Map;
import lp3.e;
import android.app.Activity;
import o63.b;
import java.lang.Boolean;
import java.lang.Integer;
import androidx.fragment.app.c;
import kq3.a;
import c22.a;
import android.content.DialogInterface$OnDismissListener;
import com.kuaishou.live.webview.LiveYodaWebViewFragment;
import o63.e;
import nsd.u;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import android.content.Intent;
import android.os.Bundle;
import k71.m;
import uxc.b;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import k71.n;
import uxc.a;
import o63.m;
import o63.m$a;
import java.lang.StringBuilder;

public final class LiveJsCmdNavigateToH5 extends AbstractLiveJsCommand	// class@000e14
{

    public void LiveJsCmdNavigateToH5(){
       super();
    }
    public Class a(){
       return LiveJsCmdNavigateToH5$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       e uoe;
       Object[] objArray;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveJsCmdNavigateToH5.class, "1");
       if (p2 != patchProxyRe) {
          return p2;
       }
       if (p0 instanceof LiveJsCmdNavigateToH5$a) {
          j oj = j.class;
          Object obj = PatchProxy.applyOneRefs(p0, this, LiveJsCmdNavigateToH5.class, "2");
          if (obj != patchProxyRe) {
          }else {
             int i = 2;
             if (a.g(p0.type, LiveJsCmdNavigateToH5$WebType.INC_FANS.getType())) {
                p0 = p0.params;
                if (p0 != null) {
                   int i1 = 5;
                   int i2 = 6;
                   if (a.g("anchor", p0.get("type"))) {
                      p0 = b.a(this.h());
                      a.m(p0);
                      uoe = this.h();
                      if (PatchProxy.isSupport(oj)) {
                         objArray = new Object[i2];
                         objArray[0] = p0;
                         objArray[1] = null;
                         objArray[i] = uoe;
                         objArray[3] = null;
                         objArray[4] = Boolean.TRUE;
                         objArray[i1] = Integer.valueOf(1);
                         oj = PatchProxy.apply(objArray, null, oj, "5");
                         if (oj != patchProxyRe) {
                         }
                      }
                      p0 = j.a(a.c(p0, null, uoe), j.d(j.b(), 1, null), null, 1);
                   }else {
                      p0 = b.a(this.h());
                      a.m(p0);
                      uoe = this.h();
                      if (PatchProxy.isSupport(oj)) {
                         objArray = new Object[i2];
                         objArray[0] = p0;
                         objArray[1] = null;
                         objArray[i] = uoe;
                         objArray[3] = null;
                         objArray[4] = Boolean.TRUE;
                         objArray[i1] = Integer.valueOf(1);
                         oj = PatchProxy.apply(objArray, null, oj, "8");
                         if (oj != patchProxyRe) {
                         }
                      }
                      p0 = j.a(a.c(p0, null, uoe), j.d(j.c(), 1, j.e(uoe)), null, 1);
                   }
                   obj = p0;
                }else {
                   obj = null;
                }
             }else {
                p0 = p0.url;
                oj = PatchProxy.applyOneRefs(p0, this, LiveJsCmdNavigateToH5.class, "3");
                if (oj != patchProxyRe) {
                }else {
                   Activity uActivity = b.a(this.h());
                   LiveYodaWebViewFragment liveYodaWebV = new LiveYodaWebViewFragment(this.h(), null, i, null);
                   if (uActivity instanceof GifshowActivity) {
                      p0 = KwaiYodaWebViewActivity.G3(uActivity, p0).k(uActivity.getUrl()).e("KEY_THEME", "0").d("KEY_ACTIONBAR_BACKGROUND_COLOR", R.color.arg_RES_7f0620c7).d("ACTIONBAR_TITLE_COLOR", R.color.arg_RES_7f0600a6).a();
                      a.o(p0, "intent");
                      liveYodaWebV.setArguments(p0.getExtras());
                      liveYodaWebV.kh(new m(liveYodaWebV));
                      liveYodaWebV.gh(new n(liveYodaWebV));
                   }
                   obj = liveYodaWebV;
                }
             }
             obj = oj;
          }
          if (obj != null) {
             p0 = (p1.v0(obj, "LiveHourlyRankRuleFragment"))? m$a.g(m.g, null, false, 3, null): m.g.c("push fragment failed");
             return p0;
          }
       }
       return m.g.c(LiveJsCmdNavigateToH5.class.getName()+":params is error");
    }
}
