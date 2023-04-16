package com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.LiveAudienceMultiLineGiftBattleDataBinding;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.databinding.a;
import oq1.e;
import oq1.b;
import sq1.a;
import hr1.a;
import ir1.c;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.model.LiveMultiLineGiftBattleModel;
import xp5.g;
import sz1.e;
import xp5.i;
import jk1.f;
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
import vr1.a;
import tr1.b;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.LiveAudienceMultiLineGiftBattleDataBinding$createSubVc$1;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.LiveAudienceMultiLineGiftBattleDataBinding$createSubVc$2;
import j83.b;
import tr1.a;
import msd.a;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.widget.peeranchor.LiveMultiLineGiftBattlePeerWidgetViewController;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.LiveAudienceMultiLineGiftBattleDataBinding$createSubVc$3;
import java.util.Map;

public final class LiveAudienceMultiLineGiftBattleDataBinding extends a	// class@00156a
{
    public final HashMap j;
    public final e k;
    public final b l;
    public final a m;
    public final a n;
    public final c o;
    public final LiveMultiLineGiftBattleModel p;
    public final g q;
    public final e r;
    public final i s;
    public final f t;

    public void LiveAudienceMultiLineGiftBattleDataBinding(e p0,b p1,a p2,a p3,c p4,LiveMultiLineGiftBattleModel p5,g p6,e p7,i p8,f p9){
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
       a.p(obj1, "roomDelegate");
       a.p(obj2, "containerVcDelegate");
       a.p(obj3, "basicLineViewModel");
       a.p(obj4, "giftBattleModel");
       a.p(obj5, "liveInfoManager");
       a.p(obj6, "liveMultiInteractManager");
       a.p(obj7, "liveLogPackageProvider");
       a.p(p9, "liveAudienceGiftBoxService");
       super(p0, p1, p8, p2, p3, p4);
       i.k = p0;
       i.l = obj;
       i.m = obj1;
       i.n = obj2;
       i.o = obj3;
       i.p = obj4;
       i.q = obj5;
       i.r = obj6;
       i.s = obj7;
       i.t = p9;
       i.j = new HashMap();
    }
    public ViewController a(a p0,String p1,d p2,p p3){
       LiveMultiLineGiftBattlePeerWidgetViewController liveMultiLin;
       LiveAudienceMultiLineGiftBattleDataBinding liveAudience = this;
       a obj = p0;
       String obj1 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, LiveAudienceMultiLineGiftBattleDataBinding.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       a.p(obj, "participant");
       a.p(p2, "widgetBasicModel");
       a.p(p3, "updateViewPosition");
       obj1 = String.valueOf(obj.h.userId);
       obj = (a.g(obj1, p1))? new a(p2, liveAudience.h(obj1), p3, liveAudience.t, liveAudience.q, liveAudience.m, liveAudience.r, liveAudience.s, liveAudience.p, new LiveAudienceMultiLineGiftBattleDataBinding$createSubVc$1(liveAudience), new LiveAudienceMultiLineGiftBattleDataBinding$createSubVc$2(liveAudience)): new LiveMultiLineGiftBattlePeerWidgetViewController(p2, liveAudience.h(obj1), p3, new LiveAudienceMultiLineGiftBattleDataBinding$createSubVc$3(liveAudience), liveAudience.m, liveAudience.r, liveAudience.s);
       return v3;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiLineGiftBattleDataBinding.class, "3")) {
          return;
       }
       a.p(p0, "userId");
       this.j.remove(p0);
       return;
    }
    public void f(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiLineGiftBattleDataBinding.class, "4")) {
          return;
       }
       a.p(p0, "participant");
       return;
    }
    public final b h(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceMultiLineGiftBattleDataBinding.class, "6");
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
}
