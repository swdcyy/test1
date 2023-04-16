package bu2.l$d;
import au2.b;
import bu2.l;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import k2b.e0;
import au2.c;
import sx1.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import sx1.a$b;
import java.lang.System;
import java.util.List;
import java.util.Collections;
import com.kwai.feature.api.social.message.imshare.model.IMShareRequest;
import lnc.a1;
import tkd.b;
import tkd.d;
import dw5.a;
import bw5.u;
import ss2.f;
import ss2.g;
import co2.f2;
import co2.q1;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.core.voiceparty.online.userlist.VoicePartyOnlineUser;
import y8c.g;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import t45.d;
import brd.z;
import bu2.f;
import sfc.a;
import erd.g;
import crd.b;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.live.core.voiceparty.d0;
import bu2.c;
import com.kuaishou.live.core.voiceparty.teampk.jointeam.VoicePartyAudienceTeamPkJoinBattleDialogFragment$a;
import com.kuaishou.live.core.voiceparty.teampk.jointeam.VoicePartyAudienceTeamPkJoinBattleDialogFragment;
import bw2.b;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import bw2.a;
import com.kwai.library.widget.popup.common.c;
import bu2.m;
import z1.a;
import au2.a;
import qvb.i;

public class l$d implements b	// class@000462
{
    public final VoicePartyMicSeatData a;
    public final int b;
    public final l c;

    public void l$d(l p0,VoicePartyMicSeatData p1,int p2){
       this.c = p0;
       super();
       this.a = p1;
       this.b = p2;
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, l$d.class, "5")) {
          return;
       }
       l$d tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(objArray, tc, l.class, "12") && tc.V8() != null) {
          c.a(tc.x.b(), tc.x.a(), tc.x.y(), "INVITE_MORE_FRIEND");
          tc.c9();
          a uoa = new a(tc.getActivity(), tc.x.getLiveStreamId(), tc.V8(), tc.C);
          if (!PatchProxy.applyVoid(objArray, uoa, a.class, "4")) {
             String str = String.valueOf(System.currentTimeMillis());
             IMShareRequest iMShareReque = uoa.a(str, Collections.emptyList());
             iMShareReque.comment = a1.p(0x7f101d72);
             uoa.c(str);
             d.a(0x7904f115).rr(uoa.a, iMShareReque);
          }
       }
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$d.class, "4")) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.c.a9();
       l y = this.c.y;
       l$d ta = this.a;
       f uof = (ta != null)? g.a(ta): null;
       q1.y(liveStreamPa, y, uof, p0);
       return;
    }
    public void c(UserInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$d.class, "3")) {
          return;
       }
       this.c.e9(p0, 89);
       return;
    }
    public void d(VoicePartyOnlineUser p0,boolean p1,g p2,int p3){
       if (PatchProxy.isSupport(l$d.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), p2, Integer.valueOf(p3), this, l$d.class, "2")) {
          return;
       }
       this.c.S8(p0, p2, p3);
       return;
    }
    public void e(){
    }
    public void f(VoicePartyOnlineUser p0,boolean p1,g p2,int p3){
       boolean b;
       l ol = l.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       l$d uod = l$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), p2, Integer.valueOf(p3), this, l$d.class, "1")) {
          return;
       }
       if (p0.mIsUserNotInLivingRoom != null) {
          l$d tc = this.c;
          Objects.requireNonNull(tc);
          if (!PatchProxy.isSupport(ol) || (!PatchProxy.applyVoidThreeRefs(p0, p2, Integer.valueOf(p3), tc, l.class, "13") && tc.V8() != null)) {
             tc.c9();
             a uoa = new a(tc.getActivity(), tc.x.getLiveStreamId(), tc.V8(), tc.C);
             tc.X7(uoa.b(p0.mApplyUserInfo.mId).observeOn(d.a).subscribe(new f(uoa, p0, p2, p3), new a()));
          }
          return;
       }else {
          Object[] objArray = null;
          Object obj = PatchProxy.apply(objArray, this, uod, "6");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(this.c.y.h() != 5){
             uod = this.b;
             if (uod == 4 || uod == 1) {
                b = true;
             }
          }
          b = false;
          if (b) {
             uod = this.c;
             Objects.requireNonNull(uod);
             if (!PatchProxy.isSupport(ol) || !PatchProxy.applyVoidThreeRefs(p0, p2, Integer.valueOf(p3), uod, l.class, "3")) {
                d0.c(uod.B);
                if (uod.B == null) {
                   uod.B = VoicePartyAudienceTeamPkJoinBattleDialogFragment.xh(new c(uod, p0, p2, p3));
                }
                uod.B.yh(p0);
                uod.B.Ah(b.b(p0));
                uod.B.zh(uod.b9().m(false), uod.b9().f(false));
                l b1 = uod.B;
                c uoc = PatchProxy.apply(objArray, uod, ol, "18");
                if (uoc != patchProxyRe) {
                }else {
                   uoc = uod.x.b().getChildFragmentManager();
                }
                b1.show(uoc, VoicePartyAudienceTeamPkJoinBattleDialogFragment.class.getName());
                uod.D.c(1, 2);
                if (!PatchProxy.applyVoid(objArray, uod, ol, "4")) {
                   uod.D.c(1, 2);
                   uod.D.c(2, 2);
                }
             }
             d0.e(this.c.A);
          }else {
             this.c.d9(this.a, p0.mApplyUserInfo.mId, this.b, new m(p2, p0));
          }
          return;
       }
    }
    public void g(boolean p0){
       a.c(this, p0);
    }
    public void h(i p0){
       a.f(this, p0);
    }
}
