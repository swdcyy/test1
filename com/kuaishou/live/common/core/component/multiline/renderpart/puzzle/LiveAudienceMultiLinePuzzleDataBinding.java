package com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.LiveAudienceMultiLinePuzzleDataBinding;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.databinding.a;
import oq1.e;
import oq1.b;
import hr1.a;
import ir1.c;
import sz1.e;
import xp5.i;
import sq1.a;
import ls1.d;
import gs1.a;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import com.kuaishou.live.common.core.component.multiline.model.a;
import j83.d;
import msd.p;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import gs1.g;
import es1.b;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.LiveAudienceMultiLinePuzzleDataBinding$createSubVc$1;
import j83.b;
import es1.a;
import msd.l;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.peeranchor.LiveAudienceMultiLinePuzzlePeerWidgetViewController;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.LiveAudienceMultiLinePuzzleDataBinding$createSubVc$2;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.LiveAudienceMultiLinePuzzleDataBinding$createSubVc$3;
import java.util.Map;
import com.facebook.common.internal.ImmutableMap;
import oq1.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.e0;
import oq1.d;

public final class LiveAudienceMultiLinePuzzleDataBinding extends a	// class@001594
{
    public final HashMap j;
    public final b k;
    public final a l;
    public final c m;
    public final e n;
    public final i o;
    public final a p;
    public final d q;
    public final a r;
    public final a s;

    public void LiveAudienceMultiLinePuzzleDataBinding(e p0,b p1,a p2,c p3,e p4,i p5,a p6,d p7,a p8,a p9){
       int i = this;
       Object obj = p1;
       Object obj1 = p2;
       Object obj2 = p3;
       Object obj3 = p4;
       Object obj4 = p5;
       Object obj5 = p6;
       Object obj6 = p7;
       Object obj7 = p8;
       a.p(obj, "lineLogParamsProvider");
       a.p(obj1, "containerVcDelegate");
       a.p(obj2, "basicViewModel");
       a.p(obj3, "liveMultiInteractManager");
       a.p(obj4, "liveLogPackageProvider");
       a.p(obj5, "roomDelegate");
       a.p(obj6, "multiLineResourceManager");
       a.p(obj7, "puzzleSelfWidgetModel");
       a.p(p9, "getMultiLineChatId");
       super(p0, p1, p5, p6, p2, p3);
       i.k = obj;
       i.l = obj1;
       i.m = obj2;
       i.n = obj3;
       i.o = obj4;
       i.p = obj5;
       i.q = obj6;
       i.r = obj7;
       i.s = p9;
       i.j = new HashMap();
    }
    public ViewController a(a p0,String p1,d p2,p p3){
       LiveAudienceMultiLinePuzzlePeerWidgetViewController liveAudience1;
       LiveAudienceMultiLinePuzzleDataBinding liveAudience = this;
       g obj = p0;
       String obj1 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, LiveAudienceMultiLinePuzzleDataBinding.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       a.p(obj, "participant");
       a.p(p2, "widgetBasicModel");
       a.p(p3, "updateViewPosition");
       obj1 = String.valueOf(obj.h.userId);
       obj = (a.g(obj1, p1))? new g(p2, liveAudience.h(obj1), p3, liveAudience.p, liveAudience.n, liveAudience.o, liveAudience.q, liveAudience.r, liveAudience.s, new LiveAudienceMultiLinePuzzleDataBinding$createSubVc$1(liveAudience)): new LiveAudienceMultiLinePuzzlePeerWidgetViewController(p2, liveAudience.h(obj1), p3, new LiveAudienceMultiLinePuzzleDataBinding$createSubVc$2(liveAudience), liveAudience.p, liveAudience.n, liveAudience.o, liveAudience.q, super(liveAudience));
       return v3;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiLinePuzzleDataBinding.class, "6")) {
          return;
       }
       a.p(p0, "userId");
       this.j.remove(p0);
       return;
    }
    public void f(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiLinePuzzleDataBinding.class, "5")) {
          return;
       }
       a.p(p0, "participant");
       return;
    }
    public final b h(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceMultiLinePuzzleDataBinding.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.j.containsKey(p0)) {
          this.j.put(p0, new b());
       }
       p0 = this.j.get(p0);
       a.m(p0);
       return p0;
    }
    public final void i(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiLinePuzzleDataBinding.class, "3")) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.o.a();
       a.o(liveStreamPa, "liveLogPackageProvider.liveStreamPackage");
       e0 page = this.o.getPage();
       a.o(page, "liveLogPackageProvider.page");
       d.b(c.a(this.k, ImmutableMap.of("count", p0)), liveStreamPa, page);
       return;
    }
}
