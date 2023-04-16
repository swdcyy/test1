package com.kuaishou.live.common.core.component.multiline.renderpart.basicline.databinding.LiveAudienceMultiLineBasicDataBinding;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.databinding.a;
import oq1.e;
import oq1.b;
import sq1.a;
import hr1.a;
import ir1.c;
import sz1.e;
import xp5.i;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.multiline.model.a;
import j83.d;
import msd.p;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import nr1.b;
import j83.b;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.widget.peeranchor.LiveMultiLinePeerWidgetViewController;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.databinding.LiveAudienceMultiLineBasicDataBinding$createSubVc$1;
import msd.a;

public final class LiveAudienceMultiLineBasicDataBinding extends a	// class@00154e
{
    public final e j;
    public final b k;
    public final a l;
    public final c m;
    public final e n;
    public final i o;

    public void LiveAudienceMultiLineBasicDataBinding(e p0,b p1,a p2,a p3,c p4,e p5,i p6){
       a.p(p1, "lineLogParamsProvider");
       a.p(p2, "roomDelegate");
       a.p(p3, "containerVcDelegate");
       a.p(p4, "viewModel");
       a.p(p5, "liveMultiInteractManager");
       a.p(p6, "liveLogPackageProvider");
       super(p0, p1, p6, p2, p3, p4);
       this.j = p0;
       this.k = p1;
       this.l = p2;
       this.m = p4;
       this.n = p5;
       this.o = p6;
    }
    public ViewController a(a p0,String p1,d p2,p p3){
       LiveAudienceMultiLineBasicDataBinding liveAudience = this;
       LiveMultiLinePeerWidgetViewController obj = p0;
       Object obj1 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, LiveAudienceMultiLineBasicDataBinding.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       a.p(obj, "participant");
       a.p(p2, "widgetBasicModel");
       a.p(p3, "updateViewPosition");
       if (a.g(String.valueOf(obj.h.userId), p1)) {
          b uob = new b(p2, p3, liveAudience.l, liveAudience.n, liveAudience.o);
       }else {
          obj = new LiveMultiLinePeerWidgetViewController(p2, p3, new LiveAudienceMultiLineBasicDataBinding$createSubVc$1(this), liveAudience.l, liveAudience.n, liveAudience.o);
       }
       return obj1;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiLineBasicDataBinding.class, "2")) {
          return;
       }
       a.p(p0, "userId");
       return;
    }
    public void f(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiLineBasicDataBinding.class, "3")) {
          return;
       }
       a.p(p0, "participant");
       return;
    }
}
