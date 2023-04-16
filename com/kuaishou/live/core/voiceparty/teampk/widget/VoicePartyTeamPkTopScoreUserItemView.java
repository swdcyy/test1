package com.kuaishou.live.core.voiceparty.teampk.widget.VoicePartyTeamPkTopScoreUserItemView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import cw2.c;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import java.lang.Integer;
import d61.c0;
import com.kuaishou.live.common.core.component.pk.LivePkResourcePathConstant;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.live.core.voiceparty.teampk.widget.VoicePartyTeamPkTopScoreUserItemView$a;

public class VoicePartyTeamPkTopScoreUserItemView extends FrameLayout	// class@001946
{
    public KwaiImageView b;
    public KwaiImageView c;
    public UserInfo d;
    public VoicePartyTeamPkTopScoreUserItemView$a e;

    public void VoicePartyTeamPkTopScoreUserItemView(Context p0){
       super(p0, null, 0);
    }
    public void VoicePartyTeamPkTopScoreUserItemView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void VoicePartyTeamPkTopScoreUserItemView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTeamPkTopScoreUserItemView.class, "1")) {
       }else {
          a.d(p0, R.layout.arg_RES_7f0d16e0, this, true);
          this.b = this.findViewById(0x7f0a44fc);
          this.c = this.findViewById(0x7f0a44fd);
          this.setOnClickListener(new c(this));
       }
       return;
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VoicePartyTeamPkTopScoreUserItemView.class, "3")) {
          return;
       }
       this.d = objArray;
       this.b.setVisibility(8);
       this.c.setVisibility(8);
       return;
    }
    public void setRank(int p0){
       if (PatchProxy.isSupport(VoicePartyTeamPkTopScoreUserItemView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, VoicePartyTeamPkTopScoreUserItemView.class, "2")) {
          return;
       }
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 == 3) {
                this.c.L(c0.a.b(LivePkResourcePathConstant.LIVE_PK_RANK_THIRD_PATH.getResourcePath()));
             }
          }else {
             this.c.L(c0.a.b(LivePkResourcePathConstant.LIVE_PK_RANK_SECOND_PATH.getResourcePath()));
          }
       }else {
          this.c.L(c0.a.b(LivePkResourcePathConstant.LIVE_PK_RANK_FIRST_PATH.getResourcePath()));
       }
       return;
    }
    public void setVoicePartyTeamPkTopScoreUserItemClickListener(VoicePartyTeamPkTopScoreUserItemView$a p0){
       this.e = p0;
    }
}
