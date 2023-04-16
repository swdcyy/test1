package com.kuaishou.live.bridge.commands.migrated.LiveJsCmdOpenNonImmersiveH5;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import com.kuaishou.live.bridge.commands.migrated.LiveJsCmdOpenNonImmersiveH5$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.m;
import o63.m$a;
import com.kuaishou.live.bridge.commands.migrated.LiveJsCmdOpenNonImmersiveH5$Params;
import rp5.a;
import lp3.c;
import android.app.Activity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import lp3.e;
import kq3.a;
import com.kuaishou.live.webview.context.LiveWebViewParam;
import com.kuaishou.live.webview.a;
import androidx.fragment.app.KwaiDialogFragment;

public final class LiveJsCmdOpenNonImmersiveH5 extends AbstractLiveJsCommand	// class@000e1e
{

    public void LiveJsCmdOpenNonImmersiveH5(){
       super();
    }
    public Class a(){
       return LiveJsCmdOpenNonImmersiveH5$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveJsCmdOpenNonImmersiveH5.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!p0 instanceof LiveJsCmdOpenNonImmersiveH5$a) {
          return m.g.c("invalid params");
       }
       if (p0.a() == null) {
          return m.g.c("param is required");
       }
       if (p0.a().a() == null) {
          return m.g.c("targetUrl is required");
       }
       a uoa = this.g(a.class);
       Activity uActivity = uoa.c();
       if (uActivity == null) {
          return m.g.c("no current activity");
       }
       BaseFragment uBaseFragmen = uoa.t();
       c childFragmen = (uBaseFragmen != null)? uBaseFragmen.getChildFragmentManager(): null;
       uoa = a.d(uActivity, childFragmen, this.h());
       uoa.g("js-bridge-non-immersive-h5");
       uoa.f("live-js-bridge-non-immersive-h5");
       uoa.b.setPortraitHeightRatio(p0.a().screenHeightRatio).setPortraitHeightPixel(p0.a().height).setLayoutType("0").setInOutAnimation(R.style.arg_RES_7f1103e0);
       a.c().h(p0.a().a(), uoa);
       return m$a.g(m.g, null, false, 3, null);
    }
}
