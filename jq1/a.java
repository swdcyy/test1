package jq1.a;
import androidx.lifecycle.Observer;
import jq1.b;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xp5.g;
import com.kuaishou.protobuf.livestream.nano.LiveScoreLineChatTeam;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.model.LiveMultiLineGiftBattleModel;
import java.lang.Long;
import java.lang.Number;
import com.kuaishou.protobuf.livestream.nano.LiveScoreLineChatTeamMember;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import e17.i;
import com.kuaishou.protobuf.livestream.nano.LiveScoreLineChatTimeLine;
import n91.f;
import com.kuaishou.live.common.core.component.multipk.utils.LiveMultiPkResourceTypes;
import pu1.d;
import com.kuaishou.protobuf.livestream.nano.LiveScoreLineChatVoteEnd;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.util.Objects;
import android.widget.ImageView;
import java.util.Map;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;

public final class a implements Observer	// class@002bf2
{
    public final b b;

    public void a(b p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          int i = 0;
          int i1 = 1;
          if (p0 != null && p0.intValue() == i1) {
             if (this.b.g.e()) {
                p0 = "";
                LiveScoreLineChatTeam[] liveScoreLin2 = this.b.f.Z();
                if (liveScoreLin2 != null) {
                   int len = liveScoreLin2.length;
                   int i5 = 0;
                   while (i5 < len) {
                      object oobject1 = liveScoreLin2[i5];
                      Long longx1 = this.b.f.V();
                      if (longx1 != null) {
                         LiveScoreLineChatTeam teamMember = oobject1.teamMember;
                         if (!teamMember[i].player.userId - longx1.longValue()) {
                            p0 = teamMember[i].player.userName;
                            a.o(p0, "it.teamMember[0].player.userName");
                         }
                      }
                      i5 = i5 + 1;
                   }
                }
                i.d(R.style.arg_RES_7f11066a, p0+"开启了礼物大作战");
             }
             p0 = this.b.f.a0();
             if (p0 != null && p0.voteDeadline - (this.b.h.s() + (long)1000) >= 0) {
                this.b.c(LiveMultiPkResourceTypes.WISH_BATTLE_ANIMATION_START);
             }
          }else if(p0 == null){
             LiveScoreLineChatVoteEnd liveScoreLin = 2;
             if (p0.intValue() == liveScoreLin) {
                p0 = this.b.f.b0();
                if (p0 != null) {
                   p0 = p0.voteEndPicUrl;
                   if (p0 != null) {
                      int i2 = (!p0.length)? 1: 0;
                      if (i2 ^ i1) {
                         a tb = this.b;
                         p0 = p0[i];
                         p0 = (p0 != null)? p0.url: null;
                         tb.d(p0);
                      }
                   }
                }
                p0 = this.b.f.Z();
                if (p0 != null) {
                   LiveScoreLineChatVoteEnd liveScoreLin1 = this.b.f.b0();
                   if (liveScoreLin1 != null) {
                      a tb1 = this.b;
                      Objects.requireNonNull(tb1);
                      if (!PatchProxy.applyVoidTwoRefs(p0, liveScoreLin1, tb1, b.class, "5")) {
                         int i3 = (!p0.length)? 1: 0;
                         if (!i3 && p0.length >= liveScoreLin) {
                            tb1.a.setVisibility(8);
                            i3 = p0.length;
                            int i4 = 0;
                            while (i4 < i3) {
                               object oobject = p0[i4];
                               if (a.g(String.valueOf(oobject.teamMember[i].player.userId), tb1.g.d())) {
                                  LiveScoreLineChatVoteEnd authorIdToRa = liveScoreLin1.authorIdToRankState;
                                  String str = tb1.g.d();
                                  Long longx = (str != null)? Long.valueOf(Long.parseLong(str)): null;
                                  Integer integer = authorIdToRa.get(longx);
                                  LiveMultiPkResourceTypes liveMultiPkR = 3;
                                  if (integer != null && integer.intValue() == liveMultiPkR) {
                                     tb1.b(LiveMultiPkResourceTypes.FINAL_TIE, liveScoreLin1.voteEndText, LiveMultiPkResourceTypes.WISH_BATTLE_RESULT_FOURTH_BOTTOM, e0.i(liveScoreLin1.voteEndPicUrl));
                                     break ;
                                  }else {
                                     LiveScoreLineChatTeam currentRank = oobject.currentRank;
                                     if (currentRank != i1) {
                                        if (currentRank != liveScoreLin) {
                                           if (currentRank != liveMultiPkR) {
                                              if (currentRank != 4) {
                                                 tb1.b(LiveMultiPkResourceTypes.FINAL_LOSE, liveScoreLin1.voteEndText, LiveMultiPkResourceTypes.WISH_BATTLE_RESULT_FOURTH_BOTTOM, e0.i(liveScoreLin1.voteEndPicUrl));
                                              }else {
                                                 tb1.b(LiveMultiPkResourceTypes.MULTI_PK_ANIMATION_FOURTH, liveScoreLin1.voteEndText, LiveMultiPkResourceTypes.WISH_BATTLE_RESULT_FOURTH_BOTTOM, e0.i(liveScoreLin1.voteEndPicUrl));
                                              }
                                           }else {
                                              tb1.b(LiveMultiPkResourceTypes.MULTI_PK_ANIMATION_THIRD, liveScoreLin1.voteEndText, LiveMultiPkResourceTypes.WISH_BATTLE_RESULT_FIRST_BOTTOM, e0.i(liveScoreLin1.voteEndPicUrl));
                                           }
                                        }else {
                                           tb1.b(LiveMultiPkResourceTypes.MULTI_PK_ANIMATION_SECOND, liveScoreLin1.voteEndText, LiveMultiPkResourceTypes.WISH_BATTLE_RESULT_SECOND_AND_THIRD_BOTTOM, e0.i(liveScoreLin1.voteEndPicUrl));
                                        }
                                     }else {
                                        tb1.b(LiveMultiPkResourceTypes.MULTI_PK_ANIMATION_FIRST, liveScoreLin1.voteEndText, LiveMultiPkResourceTypes.WISH_BATTLE_RESULT_FIRST_BOTTOM, e0.i(liveScoreLin1.voteEndPicUrl));
                                     }
                                  }
                               }
                               i4 = i4 + 1;
                            }
                         }
                      }
                   }
                }
             }
          }
       }
    label_01b3 :
       return;
    }
}
