package com.kuaishou.live.core.voiceparty.crossroompk.stageview.VoicePartyCrossRoomPkStageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.crossroompk.stageview.scoreprogress.view.LivePkScoreProgressView;
import com.kuaishou.live.core.voiceparty.crossroompk.stageview.anchor.VoicePartyCrossRoomPkAnchorAndTopContributorView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.kuaishou.live.core.voiceparty.crossroompk.stageview.a;
import com.kuaishou.live.core.voiceparty.crossroompk.stageview.anchor.VoicePartyCrossRoomPkAnchorAndTopContributorView$c;
import hr2.b;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import mr2.d;
import com.kuaishou.live.common.core.component.pk.LivePkResource$PkSkinResource;
import com.kuaishou.live.common.core.component.pk.b;
import java.util.Objects;
import mr2.c;
import sh3.a;
import android.util.SparseArray;
import com.kuaishou.live.core.voiceparty.crossroompk.stageview.anchor.VoicePartyCrossRoomPkAnchorAndTopContributorView$b;
import java.lang.Integer;
import mr2.b;
import mr2.a;
import java.lang.CharSequence;
import android.widget.FrameLayout;
import hr2.c;
import com.kuaishou.live.core.voiceparty.crossroompk.resource.VoicePartyCrossRoomPkSkinResource;
import com.kuaishou.live.core.voiceparty.crossroompk.stageview.VoicePartyCrossRoomPkStageView$a;
import hc.b;
import fr2.b;
import java.lang.Boolean;
import com.kuaishou.livestream.message.nano.LiveVoicePartyPkTeamStatistic;
import rr2.k;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.common.core.basic.widget.LiveUserView;
import ir2.a;
import ir2.b;
import com.kuaishou.livestream.message.nano.LiveVoicePartyPkTopContributor;
import java.util.List;
import android.graphics.drawable.Drawable;
import java.lang.Long;
import d61.g;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.crossroompk.stageview.VoicePartyCrossRoomPkStageView$b;

public class VoicePartyCrossRoomPkStageView extends ConstraintLayout	// class@001483
{
    public d B;
    public VoicePartyCrossRoomPkAnchorAndTopContributorView C;
    public View D;
    public TextView E;
    public KwaiImageView F;
    public KwaiImageView G;
    public KwaiImageView H;
    public KwaiImageView I;
    public LivePkScoreProgressView J;
    public boolean K;
    public VoicePartyCrossRoomPkStageView$b L;
    public boolean M;
    public boolean N;
    public int O;

    public void VoicePartyCrossRoomPkStageView(Context p0){
       super(p0, null);
    }
    public void VoicePartyCrossRoomPkStageView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void VoicePartyCrossRoomPkStageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       a.c(p0, R.layout.arg_RES_7f0d0e48, this);
       if (PatchProxy.applyVoid(null, this, VoicePartyCrossRoomPkStageView.class, "1")) {
       }else {
          this.J = this.findViewById(0x7f0a2752);
          this.C = this.findViewById(0x7f0a2748);
          this.G = this.findViewById(0x7f0a2753);
          this.D = this.findViewById(0x7f0a2747);
          this.E = this.findViewById(0x7f0a2750);
          this.F = this.findViewById(0x7f0a2751);
          this.I = this.findViewById(0x7f0a2754);
          this.C.setOnClickListener(new a(this));
          this.F.setOnClickListener(new b(this));
          this.M();
       }
       return;
    }
    public void L(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyCrossRoomPkStageView.class, "2")) {
          return;
       }
       d uod = new d(p0);
       this.B = uod;
       this.J.a(uod);
       return;
    }
    public final void M(){
       if (PatchProxy.applyVoid(null, this, VoicePartyCrossRoomPkStageView.class, "13")) {
          return;
       }
       b.e(this.F, LivePkResource$PkSkinResource.END_PK_ICON);
       return;
    }
    public void N(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VoicePartyCrossRoomPkStageView.class, "11")) {
          return;
       }
       VoicePartyCrossRoomPkStageView tB = this.B;
       Objects.requireNonNull(tB);
       if (!PatchProxy.applyVoid(objArray, tB, d.class, "3")) {
          tB.b.c.setValue(objArray);
       }
       this.M();
       this.V(this.O);
       tB = this.C;
       Objects.requireNonNull(tB);
       if (!PatchProxy.applyVoid(objArray, tB, VoicePartyCrossRoomPkAnchorAndTopContributorView.class, "6")) {
          tB.b();
          for (int i = 0; i < 3; i = i + 1) {
             tB.i.get(i).b();
             tB.j.get(i).b();
          }
       }
       return;
    }
    public void O(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VoicePartyCrossRoomPkStageView.class, "10")) {
          return;
       }
       VoicePartyCrossRoomPkStageView tB = this.B;
       Objects.requireNonNull(tB);
       if (!PatchProxy.applyVoid(objArray, tB, d.class, "2")) {
          tB.b.b.setValue(Integer.valueOf(false));
          tB.c.c.setValue(String.valueOf(false));
          tB.d.c.setValue(String.valueOf(false));
          tB.e.a.setValue(Integer.valueOf(8));
       }
       this.E.setText("");
       this.C.setVisibility(8);
       this.D.setVisibility(8);
       this.C.setVisibility(8);
       if (this.H != null) {
          this.T(false);
          this.H.setVisibility(8);
       }
       this.K = false;
       this.V(false);
       return;
    }
    public void P(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VoicePartyCrossRoomPkStageView.class, "7")) {
          return;
       }
       this.K = false;
       this.D.setVisibility(4);
       this.C.setVisibility(4);
       if (!PatchProxy.applyVoid(objArray, this, VoicePartyCrossRoomPkStageView.class, "14")) {
          int i = (this.M != null)? 0x7f0a1bd9: 0x7f0a1bdf;
          KwaiImageView kwaiImageVie = this.findViewById(i);
          this.H = kwaiImageVie;
          kwaiImageVie.setOnClickListener(new c(this));
       }
       VoicePartyCrossRoomPkStageView tH = this.H;
       if (tH != null && this.N != null) {
          tH.setVisibility(4);
       }
       return;
    }
    public void Q(){
       if (PatchProxy.applyVoid(null, this, VoicePartyCrossRoomPkStageView.class, "9")) {
          return;
       }
       this.V(2);
       return;
    }
    public void R(){
       if (PatchProxy.applyVoid(null, this, VoicePartyCrossRoomPkStageView.class, "8")) {
          return;
       }
       int i = 0;
       this.D.setVisibility(i);
       this.C.setVisibility(i);
       VoicePartyCrossRoomPkStageView tH = this.H;
       if (tH != null && this.N != null) {
          tH.setVisibility(i);
       }
       tH = this.F;
       int i1 = (this.N != null)? 0: 8;
       tH.setVisibility(i1);
       this.V(1);
       this.B.b.a.setValue(Integer.valueOf(i));
       this.B.c.a.setValue(Integer.valueOf(i));
       this.B.c.b.setValue(Integer.valueOf(i));
       this.B.d.a.setValue(Integer.valueOf(i));
       this.B.d.b.setValue(Integer.valueOf(i));
       return;
    }
    public void S(){
       if (PatchProxy.applyVoid(null, this, VoicePartyCrossRoomPkStageView.class, "4")) {
          return;
       }
       this.G.setVisibility(0);
       b.b(this.G, VoicePartyCrossRoomPkSkinResource.START_CROSS_ROOM_BATTLE_ANIM, 1, new VoicePartyCrossRoomPkStageView$a(this));
       return;
    }
    public void T(boolean p0){
       if (PatchProxy.isSupport(VoicePartyCrossRoomPkStageView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, VoicePartyCrossRoomPkStageView.class, "6")) {
          return;
       }
       VoicePartyCrossRoomPkStageView tH = this.H;
       if (tH == null) {
          return;
       }
       int i = 0x7f081355;
       if (this.N != null) {
          if (!p0) {
             i = 0x7f081356;
          }
          tH.setImageResource(i);
       }else if(p0){
          tH.setVisibility(0);
          this.H.setImageResource(i);
       }else {
          tH.setVisibility(8);
       }
       return;
    }
    public void U(LiveVoicePartyPkTeamStatistic[] p0){
       VoicePartyCrossRoomPkStageView tC;
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyCrossRoomPkStageView.class, "3")) {
          return;
       }
       int i = 1;
       LiveVoicePartyPkTeamStatistic liveVoicePar = k.m(p0, i);
       LiveVoicePartyPkTeamStatistic liveVoicePar1 = k.m(p0, 2);
       if (liveVoicePar != null && liveVoicePar1 != null) {
          if (this.K == null) {
             this.K = i;
             this.C.setVisibility(0);
             this.D.setVisibility(0);
             tC = this.C;
             UserInfo userInfo = UserInfo.convertFromProto(liveVoicePar.author);
             UserInfo userInfo1 = UserInfo.convertFromProto(liveVoicePar1.author);
             VoicePartyCrossRoomPkStageView tM = this.M;
             Objects.requireNonNull(tC);
             if (!PatchProxy.isSupport(VoicePartyCrossRoomPkAnchorAndTopContributorView.class) || !PatchProxy.applyVoidThreeRefs(userInfo, userInfo1, Boolean.valueOf(tM), tC, VoicePartyCrossRoomPkAnchorAndTopContributorView.class, "4")) {
                k.a(tC.e, userInfo);
                k.a(tC.f, userInfo1);
                tC.h.setText(tC.a((tM ^ 0x01)));
                tC.g.setText(tC.a(tM));
                tC.e.setOnClickListener(new a(tC, userInfo));
                tC.f.setOnClickListener(new b(tC, userInfo1));
             }
          }
          tC = this.C;
          List list = k.k(liveVoicePar.topContributor);
          List list1 = k.k(liveVoicePar1.topContributor);
          Objects.requireNonNull(tC);
          if (!PatchProxy.applyVoidTwoRefs(list, list1, tC, VoicePartyCrossRoomPkAnchorAndTopContributorView.class, "5")) {
             tC.c(tC.i, list);
             tC.c(tC.j, list1);
          }
          this.B.b(liveVoicePar.score, liveVoicePar1.score);
       }
       return;
    }
    public final void V(int p0){
       if (PatchProxy.isSupport(VoicePartyCrossRoomPkStageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, VoicePartyCrossRoomPkStageView.class, "12")) {
          return;
       }
       this.O = p0;
       if (p0) {
          if (p0 != 1) {
             if (p0 == 2) {
                b.e(this.I, LivePkResource$PkSkinResource.CHAT_ICON);
             }
          }else {
             b.a(this.I, VoicePartyCrossRoomPkSkinResource.COUNT_DOWN_LEFT_ICON);
          }
       }else {
          this.I.setImageDrawable(null);
       }
       return;
    }
    public void setIsAnchor(boolean p0){
       this.N = p0;
    }
    public void setIsYellowTeam(boolean p0){
       this.M = p0;
    }
    public void setPkCountDownTimeMs(long p0){
       String str;
       if (PatchProxy.isSupport(VoicePartyCrossRoomPkStageView.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, VoicePartyCrossRoomPkStageView.class, "5")) {
          return;
       }
       VoicePartyCrossRoomPkStageView tE = this.E;
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          str = PatchProxy.applyOneRefs(Long.valueOf(p0), null, og, "13");
          if (str != PatchProxyResult.class) {
          label_0052 :
             tE.setText(str);
             return;
          }
       }
       p0 = p0 / 1000;
       long l = p0 / 60;
       Object[] objArray = new Object[]{g.d(l),g.d((p0 % 60))};
       str = String.format("%s:%s", objArray);
       goto label_0052 ;
    }
    public void setViewClickListener(VoicePartyCrossRoomPkStageView$b p0){
       this.L = p0;
    }
}
