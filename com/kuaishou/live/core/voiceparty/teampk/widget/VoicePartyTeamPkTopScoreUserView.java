package com.kuaishou.live.core.voiceparty.teampk.widget.VoicePartyTeamPkTopScoreUserView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import com.kuaishou.live.core.voiceparty.teampk.widget.VoicePartyTeamPkTopScoreUserView$TopScoreUserListTeam;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.core.voiceparty.teampk.widget.VoicePartyTeamPkTopScoreUserItemView;
import android.widget.FrameLayout;
import android.view.View;
import com.kuaishou.live.core.voiceparty.teampk.widget.VoicePartyTeamPkTopScoreUserItemView$a;
import com.kuaishou.livestream.message.nano.TeamPkTopUser;
import ekd.j;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kwai.framework.model.user.UserInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;

public class VoicePartyTeamPkTopScoreUserView extends LinearLayout	// class@001948
{
    public VoicePartyTeamPkTopScoreUserView$TopScoreUserListTeam b;

    public void VoicePartyTeamPkTopScoreUserView(Context p0){
       super(p0, null, 0);
    }
    public void VoicePartyTeamPkTopScoreUserView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void VoicePartyTeamPkTopScoreUserView(Context p0,AttributeSet p1,int p2){
       int i1;
       super(p0, p1, p2);
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyTeamPkTopScoreUserView.class, "1")) {
       }else {
          int i = 0;
          if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyTeamPkTopScoreUserView.class, "4")) {
             TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.f6);
             VoicePartyTeamPkTopScoreUserView$TopScoreUserListTeam yELLOW = VoicePartyTeamPkTopScoreUserView$TopScoreUserListTeam.YELLOW;
             this.b = (!typedArray.getInt(i, yELLOW.value))? yELLOW: VoicePartyTeamPkTopScoreUserView$TopScoreUserListTeam.BLUE;
             typedArray.recycle();
          }
          if (!PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTeamPkTopScoreUserView.class, "2")) {
             this.setOrientation(i);
             this.setLayoutParams(new LinearLayout$LayoutParams(-2, -2));
             for (; i < 3; i = i + 1) {
                VoicePartyTeamPkTopScoreUserItemView voicePartyTe = new VoicePartyTeamPkTopScoreUserItemView(p0);
                if (this.b == VoicePartyTeamPkTopScoreUserView$TopScoreUserListTeam.YELLOW) {
                   i1 = i + 1;
                   voicePartyTe.setRank(i1);
                }else {
                   i1 = i - 3;
                   voicePartyTe.setRank(i1);
                }
                voicePartyTe.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
                voicePartyTe.a();
                this.addView(voicePartyTe);
             }
          }
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, VoicePartyTeamPkTopScoreUserView.class, "6")) {
          return;
       }
       for (int i = 0; i < this.getChildCount(); i = i + 1) {
          this.getChildAt(i).a();
       }
       return;
    }
    public void setScoreUserItemClickListener(VoicePartyTeamPkTopScoreUserItemView$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTeamPkTopScoreUserView.class, "3")) {
          return;
       }
       for (int i = 0; i < 3; i = i + 1) {
          this.getChildAt(i).setVoicePartyTeamPkTopScoreUserItemClickListener(p0);
       }
       return;
    }
    public void setTopScoreUserData(TeamPkTopUser[] p0){
       VoicePartyTeamPkTopScoreUserItemView childAt;
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTeamPkTopScoreUserView.class, "5")) {
          return;
       }
       if (j.h(p0)) {
          this.a();
          return;
       }else {
          int i = 0;
          while (i < 3) {
             if (this.b == VoicePartyTeamPkTopScoreUserView$TopScoreUserListTeam.YELLOW) {
                childAt = this.getChildAt(i);
             }else {
                int i2 = i - 3;
                i2 = i2 - 1;
                childAt = this.getChildAt(i2);
             }
             if (childAt != null) {
                int i1 = p0.length - 1;
                if (i > i1) {
                   childAt.a();
                }else if(p0[i] != null){
                   UserInfo userInfo = UserInfo.convertFromProto(p0[i].user);
                   if (!PatchProxy.applyVoidOneRefs(userInfo, childAt, VoicePartyTeamPkTopScoreUserItemView.class, "4")) {
                      VoicePartyTeamPkTopScoreUserItemView d = childAt.d;
                      if (d == null || !TextUtils.n(d.mId, userInfo.mId)) {
                         childAt.d = userInfo;
                         if (!PatchProxy.applyVoidOneRefs(userInfo, childAt, VoicePartyTeamPkTopScoreUserItemView.class, "5") && userInfo != null) {
                            childAt.b.setVisibility(0);
                            childAt.c.setVisibility(0);
                            g.d(childAt.b, userInfo, HeadImageSize.SMALL);
                         }
                      }
                   }
                }
             }
             i = i + 1;
          }
          return;
       }
    }
}
