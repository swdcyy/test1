package lq1.c$a;
import uz1.a;
import lq1.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.protobuf.livestream.nano.LiveMultiLineChatExtraInfo;
import f02.a;
import lh3.b;
import sz1.e;
import kotlin.jvm.internal.a;
import com.kuaishou.protobuf.livestream.nano.SCLiveMultiLineChatOpened;
import lq1.d;
import java.util.List;
import com.kuaishou.android.live.log.b;
import java.lang.StringBuilder;
import lq1.c$a$b;
import z1.a;
import oh3.a;
import com.kuaishou.live.common.multiinteract.biz.adapter.BizEndReason;
import lq1.c$a$a;

public final class c$a implements a	// class@002ff7
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void a(int p0,String p1){
       SCLiveMultiLineChatOpened sCLiveMultiL;
       List a;
       LiveMultiLineChatExtraInfo multiLineCha1;
       String str;
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "1")) {
          return;
       }
       if (p0 != 2) {
          return;
       }
       LiveMultiLineChatExtraInfo liveMultiLin = a.g(p1);
       p1 = null;
       if (liveMultiLin != null && liveMultiLin.multiLineChatOpened == null) {
          b uob = this.a.i.gc();
          a.o(uob, "multiInteractManager.liveInteractRtcManager");
          sCLiveMultiL = a.f(liveMultiLin, uob.getBizId());
          liveMultiLin.multiLineChatOpened = sCLiveMultiL;
          a = d.a;
          sCLiveMultiL = (sCLiveMultiL != null)? sCLiveMultiL.multiLineChatId: p1;
          b.S(a, "onBizStart, !!! server do not send scLiveOpenMsg!!! , try mock scLivenOpenMsg", "mockedOpenMsg", sCLiveMultiL);
       }
       uoa = this.a;
       LiveMultiLineChatExtraInfo multiLineCha = (liveMultiLin != null)? liveMultiLin.multiLineChatOpened: p1;
       if (uoa.Z(multiLineCha)) {
          b.r(d.a, "onBizStart, scLineOpened isIllegal");
          return;
       }else if(liveMultiLin != null){
          multiLineCha1 = liveMultiLin.multiLineChatOpened;
       }
       a.m(multiLineCha1);
       b.r(d.a, " receive line BizStart, lastVersion:"+this.a.c+", server "+"version:"+multiLineCha1.version+", currentLineChatId:"+this.a.b+", "+"serverLineChatId:"+multiLineCha1.multiLineChatId);
       this.a.c0();
       sCLiveMultiL = multiLineCha1.multiLineChatId;
       a.o(sCLiveMultiL, "scLineOpened.multiLineChatId");
       liveMultiLin.b = sCLiveMultiL;
       c$a ta = this.a;
       ta.d = multiLineCha1;
       ta.Q(c$a$b.a);
       this.a.b0(multiLineCha1, "onBizStart");
       return;
    }
    public void b(int p0,String p1,BizEndReason p2){
       if (PatchProxy.isSupport(c$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, c$a.class, "2")) {
          return;
       }
       a.p(p2, "bizEndReason");
       if (p0 != 2) {
          return;
       }
       this.a.Q(new c$a$a(p2));
       b.P(d.a, "onBizEnd - resetHoldingInfo");
       this.a.c0();
       return;
    }
}
