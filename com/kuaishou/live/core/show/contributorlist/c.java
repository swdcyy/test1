package com.kuaishou.live.core.show.contributorlist.c;
import com.kuaishou.live.core.show.contributorlist.LiveContributorListDialogFragment$d;
import com.kuaishou.live.core.show.contributorlist.b;
import java.lang.Object;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import t02.a0;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import wj2.r0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import p62.k;
import java.lang.Boolean;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.live.core.voiceparty.d0;
import mk1.b;
import e92.a;
import jk1.f;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.CharSequence;
import android.text.TextUtils;
import lnc.i3;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import k2b.u1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;

public class c implements LiveContributorListDialogFragment$d	// class@000ada
{
    public final b a;

    public void c(b p0){
       this.a = p0;
       super();
    }
    public void a(UserInfo p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "1")) {
          return;
       }
       this.a.q.U.w0(new UserProfile(p0), LiveStreamClickType.VOICE_PARTY, 18, true, 71);
       k.a(this.a.q.Z2.a(), p1);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       k.b(this.a.q.Z2.a());
       return;
    }
    public void c(UserInfo p0,boolean p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoc, "4")) {
          return;
       }
       d0.c(this.a.p);
       b q = this.a.q;
       a0 x1 = q.x1;
       if (x1 != null) {
          x1.bb(a.a(q, p0, 28));
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.a.q.Z2.a();
       String str = "1";
       String str1 = (p1)? str: "0";
       if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, str1, null, k.class, str)) {
          ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "VOICE_PARTY_CONTRIBUTION_LIST_SEND_GIFT";
          if (!TextUtils.isEmpty(str1)) {
             i3 oi3 = i3.f();
             oi3.d("if_rank", str1);
             uElementPack.params = oi3.e();
          }
          ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
          uClickEvent.contentPackage = uContentPack;
          uClickEvent.type = 5;
          uClickEvent.elementPackage = uElementPack;
          u1.z(urlPackage, uClickEvent);
       }
       return;
    }
    public void d(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "3")) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.a.q.Z2.a();
       String str = (p0)? "1": "0";
       if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, str, null, k.class, "4")) {
          ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
          urlPackage.page = 13;
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "VOICE_PARTY_CONTRIBUTION_LIST_SEND_GIFT";
          if (!TextUtils.isEmpty(str)) {
             i3 oi3 = i3.f();
             oi3.d("if_rank", str);
             uElementPack.params = oi3.e();
          }
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
          showEvent.contentPackage = uContentPack;
          showEvent.type = 5;
          showEvent.elementPackage = uElementPack;
          u1.z0(urlPackage, showEvent);
       }
       return;
    }
}
