package or1.d;
import yh3.a;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.model.LiveMultiLineGiftBattleModel;
import sq1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import java.util.HashMap;
import java.lang.Integer;
import or1.d$a;
import com.kuaishou.protobuf.livestream.nano.LiveScoreLineChatTeam;
import java.lang.Number;
import oh3.a;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.protobuf.livestream.nano.LiveScoreLineChatState;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import androidx.lifecycle.LiveData;
import pq1.a;
import com.kuaishou.protobuf.livestream.nano.LiveScoreLineChatTeamMember;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import ya1.n0;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class d extends a	// class@003562
{
    public final MutableLiveData a;
    public final MutableLiveData b;
    public final MutableLiveData c;
    public final d$a d;
    public final LiveMultiLineGiftBattleModel e;
    public final a f;

    public void d(LiveMultiLineGiftBattleModel p0,a p1){
       a.p(p0, "giftBattleModel");
       a.p(p1, "roomDelegate");
       super();
       this.e = p0;
       this.f = p1;
       this.a = new MutableLiveData();
       this.b = new MutableLiveData(new HashMap());
       Integer integer = p0.W();
       int i = (integer != null)? integer.intValue(): 0;
       this.c = new MutableLiveData(Integer.valueOf(i));
       d$a uoa = new d$a(this);
       this.d = uoa;
       LiveScoreLineChatTeam[] liveScoreLin = p0.Z();
       if (liveScoreLin != null) {
          Integer integer1 = p0.T();
          if (integer1 != null) {
             this.u0(liveScoreLin, integer1.intValue());
          }
       }
       p0.O(uoa);
       Integer integer2 = p0.W();
       liveScoreLin = 1;
       if (integer2 != null && integer2.intValue() == liveScoreLin) {
          Objects.requireNonNull(p0);
          Object[] objArray = null;
          Boolean uBoolean = PatchProxy.apply(objArray, p0, LiveMultiLineGiftBattleModel.class, "4");
          if (uBoolean != PatchProxyResult.class) {
          }else {
             LiveMultiLineGiftBattleModel d = p0.d;
             uBoolean = (d != null)? Boolean.valueOf(d.enableShowAttachGiftEntrance): objArray;
          }
          if (a.g(uBoolean, Boolean.TRUE)) {
             integer2 = p0.T();
             if (integer2 != null) {
                int i1 = integer2.intValue();
                p0 = p0.d;
                if (p0 != null) {
                   objArray = p0.giftToken;
                }
                if (objArray != null) {
                   p1.f(i1, objArray);
                }
             }
          }
       }
    label_00a2 :
       return;
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       super.onCleared();
       this.e.R(this.d);
       this.f.e();
       return;
    }
    public final void u0(LiveScoreLineChatTeam[] p0,int p1){
       int i2;
       int i3;
       String str;
       d uod = this;
       LiveScoreLineChatTeam obj = p0;
       d uod1 = d.class;
       if (PatchProxy.isSupport(uod1) && PatchProxy.applyVoidTwoRefs(obj, Integer.valueOf(p1), uod, uod1, "2")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       HashMap hashMap = new HashMap();
       int len = obj.length;
       int i = 0;
       for (int i1 = 0; i1 < len; len = i2) {
          object oobject = obj[i1];
          LiveScoreLineChatTeam teamMember = oobject.teamMember;
          a.o(teamMember, "team.teamMember");
          d uod2 = 1;
          teamMember = (!teamMember.length)? 1: null;
          if (!teamMember) {
             teamMember = oobject.teamMember;
             if (teamMember.length > uod2) {
             label_00b4 :
                i2 = len;
                i3 = i1;
                b.B(LiveLogTag.Live_LINE_GIFT_BATTLE, "don\'t support team mode");
             }else {
                object oobject1 = teamMember[i];
                if (oobject1 != null) {
                   Integer value = uod.c.getValue();
                   LiveScoreLineChatTeamMember liveScoreLin = 2;
                   int i4 = (value != null && value.intValue() == liveScoreLin)? oobject.currentRank: -1;
                   liveScoreLin = oobject1.player;
                   if (liveScoreLin != null) {
                      str = String.valueOf(liveScoreLin.userId);
                      if (str != null) {
                      label_0070 :
                         i3 = i1;
                         i2 = len;
                         n0 on0 = v13;
                         n0 on01 = v13;
                         on0 = new n0(oobject1.targetScore, oobject1.score, oobject1.displayTargetScore, oobject1.displayScore, oobject1.scoreProgressColor, oobject1.scoreBlankColor, i4, p1);
                         uArrayList.add(new a(str, on01));
                         obj = oobject.teamFrameColor;
                         a.o(obj, "team.teamFrameColor");
                         hashMap.put(String.valueOf(oobject1.player.userId), obj);
                      }
                   }
                   str = "";
                   goto label_0070 ;
                }else {
                   i2 = len;
                   i3 = i1;
                }
             }
          }else {
             goto label_00b4 ;
          }
          i1 = i3 + 1;
          i = 0;
          uod = this;
          obj = p0;
       }
       uod.a.setValue(uArrayList);
       uod.b.setValue(hashMap);
       return;
    }
    public final void v0(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "1")) {
          return;
       }
       this.c.setValue(Integer.valueOf(p0));
       return;
    }
}
