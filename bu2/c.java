package bu2.c;
import com.kuaishou.live.core.voiceparty.teampk.jointeam.VoicePartyAudienceTeamPkJoinBattleDialogFragment$a;
import bu2.l;
import com.kuaishou.live.core.voiceparty.online.userlist.VoicePartyOnlineUser;
import y8c.g;
import java.lang.Object;
import bw2.a;
import com.kwai.framework.model.user.UserInfo;
import bu2.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import brd.t;
import brd.x;
import a51.c;
import bu2.d;
import z1.a;
import sfc.a;
import erd.g;
import crd.b;

public final class c implements VoicePartyAudienceTeamPkJoinBattleDialogFragment$a	// class@000456
{
    public final l a;
    public final VoicePartyOnlineUser b;
    public final g c;
    public final int d;

    public void c(l p0,VoicePartyOnlineUser p1,g p2,int p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final void a(int p0,VoicePartyOnlineUser p1){
       c ta = this.a;
       c tb = this.b;
       c tc = this.c;
       c td = this.d;
       l d = ta.D;
       int i = 1;
       int i1 = 2;
       if (p0 == i) {
       }else {
          i = 2;
       }
       d.b(i, i1);
       if (p1 != null) {
          UserInfo mId = p1.mApplyUserInfo.mId;
          b uob = new b(tb, tc, td, p1, p0);
          if (!PatchProxy.isSupport(l.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), mId, v8, ta, l.class, "6")) {
             t ot = ta.Z8(mId, p0);
             if (ot != null) {
                ot.compose(ta.P8()).subscribe(new d(v8), new a());
             }
          }
       }
       return;
    }
}
