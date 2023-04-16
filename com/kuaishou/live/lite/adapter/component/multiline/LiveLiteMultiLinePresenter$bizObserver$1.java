package com.kuaishou.live.lite.adapter.component.multiline.LiveLiteMultiLinePresenter$bizObserver$1;
import uz1.a;
import com.kuaishou.live.lite.adapter.component.multiline.LiveLiteMultiLinePresenter;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import vb3.n;
import com.kuaishou.live.lite.layoutmanager.LayoutViewType;
import com.kuaishou.live.lite.adapter.component.multiline.LiveLiteMultiLineViewController;
import kotlin.jvm.internal.a;
import sa3.b;
import xp5.g;
import com.kuaishou.live.lite.adapter.component.multiline.LiveLiteMultiLinePresenter$bizObserver$1$onBizStart$1;
import sz1.e;
import msd.a;
import vb3.p;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.common.multiinteract.biz.adapter.BizEndReason;
import vb3.m;
import com.kuaishou.live.lite.layoutmanager.StageType;

public final class LiveLiteMultiLinePresenter$bizObserver$1 implements a	// class@001e09
{
    public final LiveLiteMultiLinePresenter a;

    public void LiveLiteMultiLinePresenter$bizObserver$1(LiveLiteMultiLinePresenter p0){
       this.a = p0;
       super();
    }
    public void a(int p0,String p1){
       LiveLiteMultiLinePresenter$bizObserver$1 uobizObserve = LiveLiteMultiLinePresenter$bizObserver$1.class;
       if (PatchProxy.isSupport(uobizObserve) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uobizObserve, "2")) {
          return;
       }
       if (p0 != 2) {
          return;
       }
       b.Z(LiveLiteLogTag.LITE_MULTI_LINE, "enter multiline biz");
       n on = LiveLiteMultiLinePresenter.e9(this.a);
       LayoutViewType multiLine = LayoutViewType.MultiLine;
       LiveLiteMultiLinePresenter v = this.a.v;
       if (v == null) {
          a.S("interactManager");
       }
       b uob = LiveLiteMultiLinePresenter.c9(this.a);
       LiveLiteMultiLinePresenter x = this.a.x;
       if (x == null) {
          a.S("liveInfoManager");
       }
       on.c(multiLine, new LiveLiteMultiLineViewController(v, uob, x.d(), new LiveLiteMultiLinePresenter$bizObserver$1$onBizStart$1(this)));
       return;
    }
    public void b(int p0,String p1,BizEndReason p2){
       if (PatchProxy.isSupport(LiveLiteMultiLinePresenter$bizObserver$1.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, LiveLiteMultiLinePresenter$bizObserver$1.class, "3")) {
          return;
       }
       a.p(p2, "bizEndReason");
       if (p0 != 2) {
          return;
       }
       b.Z(LiveLiteLogTag.LITE_MULTI_LINE, "exit multiline biz");
       LiveLiteMultiLinePresenter.e9(this.a).c(LayoutViewType.MultiLine, null);
       LiveLiteMultiLinePresenter.d9(this.a).c(StageType.MultiLine);
       LiveLiteMultiLinePresenter.c9(this.a).in(p0);
       return;
    }
}
