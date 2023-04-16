package jb1.i;
import android.view.View$OnClickListener;
import jb1.b$c;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jb1.b;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import nl8.p;
import com.kwai.framework.model.user.UserInfo;
import java.util.ArrayList;
import java.lang.Integer;
import com.kwai.framework.model.user.UserExtraInfo;
import com.kwai.framework.model.live.LiveAdminPrivilege;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import bb1.f;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import mz6.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import y8c.r;
import android.content.Context;
import jb1.c;
import android.content.DialogInterface$OnClickListener;
import android.app.Dialog;

public final class i implements View$OnClickListener	// class@002b12
{
    public final b$c b;

    public void i(b$c p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       i b = this.b;
       Objects.requireNonNull(b);
       if (PatchProxy.applyVoid(null, b, b$c.class, "7")) {
       }else {
          b b1 = b.p.B;
          LiveApiParams$AssistantType pUSHER = LiveApiParams$AssistantType.PUSHER;
          if (b1 == pUSHER || b1 == LiveApiParams$AssistantType.SUPER_ADMIN) {
             UserInfo userInfo = b.t();
             if (userInfo != null) {
                int i = 1;
                if (userInfo.getAssistantType() != i || b.p.B == pUSHER) {
                   ArrayList uArrayList = new ArrayList();
                   int assistantTyp = userInfo.getAssistantType();
                   if (assistantTyp != i) {
                      if (assistantTyp == 2) {
                         int i1 = 0x7f101d16;
                         if (b.p.B == LiveApiParams$AssistantType.SUPER_ADMIN) {
                            uArrayList.add(Integer.valueOf(i1));
                         }else {
                            uArrayList.add(Integer.valueOf(R.string.arg_RES_7f102cfd));
                            uArrayList.add(Integer.valueOf(i1));
                         }
                      }
                   }else {
                      uArrayList.add(Integer.valueOf(R.string.arg_RES_7f102cfb));
                      uArrayList.add(Integer.valueOf(R.string.arg_RES_7f10406c));
                   }
                   if (b.p.B == pUSHER) {
                      UserExtraInfo mPrivilege = userInfo.mExtraInfo.mPrivilege;
                      if (mPrivilege != null) {
                         int i2 = (mPrivilege.mForbidComment != null)? 0x7f102078: 0x7f1020a2;
                         uArrayList.add(Integer.valueOf(i2));
                         i2 = (userInfo.mExtraInfo.mPrivilege.mKickUser != null)? 0x7f102079: 0x7f1020a3;
                         uArrayList.add(Integer.valueOf(i2));
                         i2 = (userInfo.mExtraInfo.mPrivilege.mBlock != null)? 0x7f102077: 0x7f1020a1;
                         uArrayList.add(Integer.valueOf(i2));
                         if (!TextUtils.x(b.p.D)) {
                            i2 = (userInfo.mExtraInfo.mPrivilege.mControl != null)? 0x7f102075: 0x7f10209e;
                            uArrayList.add(Integer.valueOf(i2));
                         }
                         b$c p = b.p;
                         b d = p.D;
                         b e = p.E;
                         b c = p.C;
                         b a = p.A;
                         if (!PatchProxy.applyVoidFourRefs(d, e, c, a, p, b.class, "7") && p.F != null) {
                            ClientContentWrapper$LiveVoicePartyPackage liveVoicePar = new ClientContentWrapper$LiveVoicePartyPackage();
                            liveVoicePar.voicePartyId = d;
                            liveVoicePar.theaterId = e;
                            ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                            uElementPack.action2 = "ADMINISTRATOR_SETTING_CARD";
                            ClientContent$LiveStreamPackage liveStreamPa = p.F.a();
                            liveStreamPa.anchorUserId = c;
                            liveStreamPa.liveStreamId = a;
                            if (!PatchProxy.isSupport(f.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(26), liveVoicePar, uElementPack, liveStreamPa, null, f.class, "18")) {
                               ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
                               uContentWrap.liveVoicePartyPackage = liveVoicePar;
                               uElementPack.action = 26;
                               ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                               uContentPack.liveStreamPackage = liveStreamPa;
                               u1.v0(9, uElementPack, uContentPack, uContentWrap);
                            }
                         }
                      }
                   }
                label_015f :
                   int[] ointArray = new int[uArrayList.size()];
                   for (i = 0; i < uArrayList.size(); i = i + 1) {
                      ointArray[i] = uArrayList.get(i).intValue();
                   }
                   b uob = new b(b.C());
                   uob.j(ointArray);
                   uob.l(new c(b, userInfo));
                   uob.q();
                }
             }
          }
       }
       return;
    }
}
