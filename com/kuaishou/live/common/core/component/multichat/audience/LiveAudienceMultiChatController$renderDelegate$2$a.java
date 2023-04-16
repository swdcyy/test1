package com.kuaishou.live.common.core.component.multichat.audience.LiveAudienceMultiChatController$renderDelegate$2$a;
import zp1.l;
import com.kuaishou.live.common.core.component.multichat.audience.LiveAudienceMultiChatController$renderDelegate$2;
import java.lang.Object;
import java.util.List;
import zp1.k;
import java.lang.String;
import xp1.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.multichat.audience.LiveAudienceMultiChatController;
import com.kuaishou.live.common.core.component.multichat.audience.core.LiveAudienceMultiChatCoreModel;
import up1.b;
import brd.t;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import lp1.c;
import lp1.e;
import java.lang.Integer;

public final class LiveAudienceMultiChatController$renderDelegate$2$a implements l	// class@0014bb
{
    public final LiveAudienceMultiChatController$renderDelegate$2 a;

    public void LiveAudienceMultiChatController$renderDelegate$2$a(LiveAudienceMultiChatController$renderDelegate$2 p0){
       this.a = p0;
       super();
    }
    public void K(List p0){
       k.b(this, p0);
    }
    public void S(String p0,int p1){
       k.d(this, p0, p1);
    }
    public b a(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiChatController$renderDelegate$2$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveAudienceMultiChatController.V2(this.a.this$0).m();
    }
    public t b(String p0,boolean p1){
       LiveAudienceMultiChatController$renderDelegate$2$a orenderDeleg = LiveAudienceMultiChatController$renderDelegate$2$a.class;
       if (PatchProxy.isSupport(orenderDeleg)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, orenderDeleg, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "userId");
       return LiveAudienceMultiChatController.V2(this.a.this$0).w(p0, p1);
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiChatController$renderDelegate$2$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return LiveAudienceMultiChatController.V2(this.a.this$0).e();
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiChatController$renderDelegate$2$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.this$0.u.a().a;
    }
    public void v0(int p0){
       LiveAudienceMultiChatController$renderDelegate$2$a orenderDeleg = LiveAudienceMultiChatController$renderDelegate$2$a.class;
       if (PatchProxy.isSupport(orenderDeleg) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, orenderDeleg, "3")) {
          return;
       }
       LiveAudienceMultiChatController.V2(this.a.this$0).v0(p0);
       return;
    }
}
