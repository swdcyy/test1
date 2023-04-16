package b62.m0;
import b62.q0;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.k;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import b62.j0;
import u52.t;
import xp5.i;
import com.kuaishou.live.core.show.conditionredpacket.model.LiveConditionRedPacketLotteryResultResponse;
import com.kuaishou.live.common.core.component.redpacket.normal.model.GrabRedPacketResponse$RedPacketResultPageGiftSendButton;
import ht5.a;
import t02.a0;
import j62.a;
import com.yxcorp.gifshow.models.Gift;

public class m0 implements q0	// class@000349
{
    public final k a;

    public void m0(k p0){
       this.a = p0;
       super();
    }
    public ClientContent$LiveStreamPackage a(){
       Object obj = PatchProxy.apply(null, this, m0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.p.h.a();
    }
    public String c(){
       k q = this.a.Q;
       if (q != null) {
          LiveConditionRedPacketLotteryResultResponse mGiftSendBut = q.mGiftSendButtonInfo;
          if (mGiftSendBut != null) {
             return mGiftSendBut.mGiftToken;
          }
       }
       return "";
    }
    public a d(){
       t g = this.a.p.g;
       if (g != null) {
          return g.I1;
       }
       return null;
    }
    public int e(){
       return this.a.O.a;
    }
    public Gift f(){
       k q = this.a.Q;
       if (q != null) {
          LiveConditionRedPacketLotteryResultResponse mGiftSendBut = q.mGiftSendButtonInfo;
          if (mGiftSendBut != null) {
             return mGiftSendBut.mGift;
          }
       }
       return null;
    }
    public String g(){
       return this.a.O.b;
    }
}
