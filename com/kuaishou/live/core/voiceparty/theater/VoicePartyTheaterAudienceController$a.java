package com.kuaishou.live.core.voiceparty.theater.VoicePartyTheaterAudienceController$a;
import gp2.q;
import com.kuaishou.live.core.voiceparty.theater.VoicePartyTheaterAudienceController;
import java.lang.Object;
import op2.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import iw2.a;
import kw2.f;
import kw2.c;
import pb1.c;
import com.kuaishou.live.core.voiceparty.theater.VoicePartyTheaterAudienceController$a$a;
import com.kuaishou.live.core.voiceparty.theater.VoicePartyTheaterAudienceController$a$b;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import java.lang.CharSequence;
import android.text.TextUtils;
import kw2.e;
import eu2.g;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import co2.f2;
import dw2.c;
import op2.j;
import op2.i;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterDisplayMode;
import dw2.k;
import java.lang.Enum;
import m91.b;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import pq5.c;
import com.kwai.feature.api.live.base.service.pendant.LivePendantContainerHideFlags;
import lnc.a1;
import g81.c;
import com.kwai.feature.api.live.service.show.comments.view.LayoutParamsType;
import com.kwai.feature.api.live.service.show.comments.LiveCommentsBiz;
import com.kuaishou.live.comments.view.a;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager$BizType;
import mrd.c;
import java.lang.Boolean;
import brd.y;
import mw2.f;
import rw2.b;
import com.kwai.video.waynelive.quality.LiveQualityItem;
import java.util.List;

public final class VoicePartyTheaterAudienceController$a implements q	// class@001952
{
    public final VoicePartyTheaterAudienceController b;

    public void VoicePartyTheaterAudienceController$a(VoicePartyTheaterAudienceController p0){
       this.b = p0;
       super();
    }
    public void B(int p0,f p1){
       if (PatchProxy.isSupport(VoicePartyTheaterAudienceController$a.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, VoicePartyTheaterAudienceController$a.class, "2")) {
          return;
       }
       a.p(p1, "info");
       this.b.Z2();
       return;
    }
    public void P(f p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTheaterAudienceController$a.class, "1")) {
          return;
       }
       a.p(p0, "info");
       VoicePartyTheaterAudienceController.V2(this.b).a();
       c uoc = this.b.v.d().f();
       if (uoc != null) {
          str = k0.b(p0, VoicePartyTheaterAudienceController$a$a.a, VoicePartyTheaterAudienceController$a$b.a).orNull();
          if (TextUtils.isEmpty(str)) {
             uoc.c();
          }else {
             uoc.a(str);
          }
       }
       g og = this.b.v.c().i();
       if (og != null) {
          VoicePartyTheaterAudienceController$a tb = this.b;
          Objects.requireNonNull(tb);
          StringBuilder str1 = PatchProxy.applyOneRefs(p0, tb, VoicePartyTheaterAudienceController.class, "13");
          if (str1 != PatchProxyResult.class) {
          }else {
             str1 = "";
             str = tb.u.b();
             if (str == null) {
                str = "";
             }
             str1 = str1+str+"¡¡ÕýÔÚ·ÅÓ³£º";
             str = p0.d();
             int i = (!str.length())? 1: 0;
             if (i) {
                str = p0.f();
             }
             str1 = str1+str;
             a.o(str1, "StringBuilder\(\)\n      .a¡­Name }\)\n      .toString\(\)");
          }
          og.e(str1);
       }
       VoicePartyTheaterAudienceController.Y2(this.b).a(p0);
       return;
    }
    public void W(){
       i.i(this);
    }
    public void e0(){
       if (PatchProxy.applyVoid(null, this, VoicePartyTheaterAudienceController$a.class, "3")) {
          return;
       }
       c uoc = this.b.v.d().f();
       if (uoc != null) {
          uoc.c();
       }
       g og = this.b.v.c().i();
       if (og != null) {
          og.m();
       }
       VoicePartyTheaterAudienceController.Y2(this.b).a(null);
       return;
    }
    public void k(TheaterDisplayMode p0){
       b uob;
       c uoc1;
       LiveBulletinLayoutManager liveBulletin;
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTheaterAudienceController$a.class, "4")) {
          return;
       }
       String str = "displayMode";
       a.p(p0, str);
       VoicePartyTheaterAudienceController$a tb = this.b;
       Objects.requireNonNull(tb);
       String str1 = 2;
       if (!PatchProxy.applyVoidOneRefs(p0, tb, VoicePartyTheaterAudienceController.class, "11")) {
          int i1 = k.b[p0.ordinal()];
          if (i1 != 1) {
             if (i1 != str1) {
                if (i1 == 3) {
                   uob = tb.v.c().a();
                   if (uob != null) {
                      uob.Pj(AudienceBizRelation.VOICE_PARTY_THEATER_PORTRAIT_FULL_SCREEN);
                   }
                   uoc1 = tb.v.d().e();
                   if (uoc1 != null) {
                      uoc1.a8(LivePendantContainerHideFlags.VOICE_PARTY_THEATER);
                   }
                   i1 = a1.d(0x7f07107d) + a1.e(20.00f);
                   c uoc2 = tb.v.d().c();
                   if (uoc2 != null) {
                      uoc2.K0(LayoutParamsType.RIGHT_MARGIN, LiveCommentsBiz.VOICE_PARTY_THEATER_FULLSCREEN.ordinal(), i1);
                   }
                   liveBulletin = tb.v.d().b();
                   if (liveBulletin != null) {
                      liveBulletin.h(LiveBulletinLayoutManager$BizType.VOICE_PARTY_THEATER_FULL_SCREEN, i1);
                   }
                }
             }else {
                uob = tb.v.c().a();
                if (uob != null) {
                   uob.Pj(AudienceBizRelation.VOICE_PARTY_THEATER_LANDSCAPE_FULL_SCREEN);
                }
                liveBulletin = tb.v.d().b();
                if (liveBulletin != null) {
                   liveBulletin.k(LiveBulletinLayoutManager$BizType.VOICE_PARTY_THEATER_FULL_SCREEN);
                }
             }
          }else {
             uob = tb.v.c().a();
             if (uob != null) {
                uob.yj(AudienceBizRelation.VOICE_PARTY_THEATER_PORTRAIT_FULL_SCREEN);
                uob.yj(AudienceBizRelation.VOICE_PARTY_THEATER_LANDSCAPE_FULL_SCREEN);
             }
             uoc1 = tb.v.d().e();
             if (uoc1 != null) {
                uoc1.Gm(LivePendantContainerHideFlags.VOICE_PARTY_THEATER);
             }
             uoc1 = tb.v.d().c();
             if (uoc1 != null) {
                uoc1.K0(LayoutParamsType.RIGHT_MARGIN, LiveCommentsBiz.VOICE_PARTY_THEATER_FULLSCREEN.ordinal(), 0);
             }
             liveBulletin = tb.v.d().b();
             if (liveBulletin != null) {
                liveBulletin.k(LiveBulletinLayoutManager$BizType.VOICE_PARTY_THEATER_FULL_SCREEN);
             }
          }
       }
    label_0100 :
       int i = k.a[p0.ordinal()];
       if (i != 1 && i != str1) {
          this.b.v.d().a().onNext(Boolean.TRUE);
          this.b.j.e();
       }else {
          this.b.j.d();
          this.b.v.d().a().onNext(Boolean.FALSE);
       }
       c uoc = VoicePartyTheaterAudienceController.Y2(this.b);
       Objects.requireNonNull(uoc);
       if (!PatchProxy.applyVoidOneRefs(p0, uoc, c.class, "1")) {
          a.p(p0, str);
          uoc.c.c(p0);
       }
       return;
    }
    public void onPause(){
       i.c(this);
    }
    public void onProgress(long p0,long p1){
       i.f(this, p0, p1);
    }
    public void onResume(){
       i.h(this);
    }
    public void p(){
       i.e(this);
    }
    public void y(LiveQualityItem p0,List p1){
       i.g(this, p0, p1);
    }
}
