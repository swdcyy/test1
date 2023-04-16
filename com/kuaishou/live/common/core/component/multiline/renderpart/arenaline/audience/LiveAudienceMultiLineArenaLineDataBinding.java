package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.LiveAudienceMultiLineArenaLineDataBinding;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.databinding.a;
import xp5.g;
import dr1.f;
import oq1.e;
import oq1.b;
import xp5.i;
import sq1.a;
import hr1.a;
import ir1.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.LiveAudienceMultiLineArenaLineDataBinding$arenaWidgetDelegate$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.common.core.component.multiline.model.a;
import j83.d;
import msd.p;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tq1.b;
import pq1.b;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.actor.LiveAudienceMultiLineArenaLineActorWidgetController;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.LiveAudienceMultiLineArenaLineDataBinding$arenaWidgetDelegate$2$a;
import j83.b;
import er1.c;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.other.LiveAudienceMultiLineArenaLineOtherWidgetController;
import java.lang.Boolean;

public final class LiveAudienceMultiLineArenaLineDataBinding extends a	// class@001507
{
    public final p j;
    public final g k;
    public final f l;
    public final b m;
    public final i n;
    public final a o;

    public void LiveAudienceMultiLineArenaLineDataBinding(g p0,f p1,e p2,b p3,i p4,a p5,a p6,c p7){
       a.p(p0, "liveInfoManager");
       a.p(p1, "arenaLineModel");
       a.p(p3, "lineLogParamsProvider");
       a.p(p4, "liveLogPackageProvider");
       a.p(p5, "roomDelegate");
       a.p(p6, "containerVcDelegate");
       a.p(p7, "viewModel");
       super(p2, p3, p4, p5, p6, p7);
       this.k = p0;
       this.l = p1;
       this.m = p3;
       this.n = p4;
       this.o = p5;
       this.j = s.c(new LiveAudienceMultiLineArenaLineDataBinding$arenaWidgetDelegate$2(this));
    }
    public ViewController a(a p0,String p1,d p2,p p3){
       LiveAudienceMultiLineArenaLineDataBinding liveAudience = this;
       Object obj = p0;
       LiveAudienceMultiLineArenaLineOtherWidgetController obj1 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, LiveAudienceMultiLineArenaLineDataBinding.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       a.p(obj, "participant");
       a.p(p2, "widgetBasicModel");
       a.p(p3, "updateViewPosition");
       if (b.a.g(obj)) {
          LiveAudienceMultiLineArenaLineActorWidgetController liveAudience1 = new LiveAudienceMultiLineArenaLineActorWidgetController(liveAudience.k, p0, p2, liveAudience.l, p3, this.h(), liveAudience.n, liveAudience.m);
       }else {
          obj1 = new LiveAudienceMultiLineArenaLineOtherWidgetController(liveAudience.k, p0, p2, liveAudience.l, p3, this.h());
       }
       return obj1;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiLineArenaLineDataBinding.class, "4")) {
          return;
       }
       a.p(p0, "userId");
       return;
    }
    public void f(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiLineArenaLineDataBinding.class, "3")) {
          return;
       }
       a.p(p0, "participant");
       return;
    }
    public boolean g(ViewController p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveAudienceMultiLineArenaLineDataBinding.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "subVc");
       a.p(p1, "cellInfo");
       boolean b = true;
       if (p0 instanceof LiveAudienceMultiLineArenaLineActorWidgetController) {
          b = b.a.g(p1);
       }else if(!p0 instanceof LiveAudienceMultiLineArenaLineOtherWidgetController || !b.a.g(p1)){
          b = false;
       }
       return b;
    }
    public final LiveAudienceMultiLineArenaLineDataBinding$arenaWidgetDelegate$2$a h(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiLineArenaLineDataBinding.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
}
