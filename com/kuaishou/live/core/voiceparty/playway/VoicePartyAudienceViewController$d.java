package com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController$d;
import co2.i0;
import com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import po2.b;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;
import java.lang.UnsupportedOperationException;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import java.lang.Boolean;
import lnc.a1;
import java.lang.Integer;
import yu2.d$b;
import io.reactivex.subjects.PublishSubject;
import lp3.e;
import lp3.c;
import lp3.b;
import hp2.e;
import com.kuaishou.live.core.voiceparty.core.audience.AudienceVoicePartyManager;
import com.kuaishou.live.core.voiceparty.core.shared.a;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import com.google.gson.JsonObject;
import co2.f2;
import kotlin.jvm.internal.a;
import yu2.d$a;

public final class VoicePartyAudienceViewController$d implements i0	// class@001841
{
    public final VoicePartyAudienceViewController b;

    public void VoicePartyAudienceViewController$d(VoicePartyAudienceViewController p0){
       this.b = p0;
       super();
    }
    public int Ac(){
       VoicePartyAudienceViewController obj = PatchProxy.apply(null, this, VoicePartyAudienceViewController$d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b.t;
       int i = (obj != null)? (int)obj.i: 0;
       return i;
    }
    public ClientContentWrapper$LiveVoicePartyPackage B(){
       Object obj = PatchProxy.apply(null, this, VoicePartyAudienceViewController$d.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       throw new UnsupportedOperationException("Not implemented");
    }
    public ClientContent$LiveVoicePartyPackageV2 Dc(){
       Object obj = PatchProxy.apply(null, this, VoicePartyAudienceViewController$d.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       throw new UnsupportedOperationException("Not implemented");
    }
    public boolean L2(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, VoicePartyAudienceViewController$d.class, "7");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       throw new UnsupportedOperationException("Not implemented");
    }
    public int S5(){
       VoicePartyAudienceViewController obj = PatchProxy.apply(null, this, VoicePartyAudienceViewController$d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b.t;
       b h = (obj != null)? obj.h: a1.d(R.dimen.arg_RES_7f07091d);
       return h;
    }
    public boolean U4(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, VoicePartyAudienceViewController$d.class, "11");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       throw new UnsupportedOperationException("Not implemented");
    }
    public String We(){
       Object obj = PatchProxy.apply(null, this, VoicePartyAudienceViewController$d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       throw new UnsupportedOperationException("Not implemented");
    }
    public void a0(int p0){
       VoicePartyAudienceViewController$d uod = VoicePartyAudienceViewController$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "1")) {
          return;
       }
       this.b.w.onNext(new d$b(p0));
       return;
    }
    public boolean b2(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, VoicePartyAudienceViewController$d.class, "9");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       throw new UnsupportedOperationException("Not implemented");
    }
    public boolean cd(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, VoicePartyAudienceViewController$d.class, "10");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       throw new UnsupportedOperationException("Not implemented");
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public String g0(){
       Object obj = PatchProxy.apply(null, this, VoicePartyAudienceViewController$d.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       throw new UnsupportedOperationException("Not implemented");
    }
    public e h3(){
       Object obj = PatchProxy.apply(null, this, VoicePartyAudienceViewController$d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return VoicePartyAudienceViewController.V2(this.b).f();
    }
    public String k0(){
       Object obj = PatchProxy.apply(null, this, VoicePartyAudienceViewController$d.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       throw new UnsupportedOperationException("Not implemented");
    }
    public VoicePartyMicSeatData na(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, VoicePartyAudienceViewController$d.class, "14");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       throw new UnsupportedOperationException("Not implemented");
    }
    public boolean p6(){
       Object obj = PatchProxy.apply(null, this, VoicePartyAudienceViewController$d.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       throw new UnsupportedOperationException("Not implemented");
    }
    public JsonObject q1(){
       Object obj = PatchProxy.apply(null, this, VoicePartyAudienceViewController$d.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       throw new UnsupportedOperationException("Not implemented");
    }
    public f2 r0(){
       Object obj = PatchProxy.apply(null, this, VoicePartyAudienceViewController$d.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       throw new UnsupportedOperationException("Not implemented");
    }
    public boolean w2(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, VoicePartyAudienceViewController$d.class, "8");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       throw new UnsupportedOperationException("Not implemented");
    }
    public boolean wd(){
       return true;
    }
    public void xf(String p0,int p1){
       VoicePartyAudienceViewController$d uod = VoicePartyAudienceViewController$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uod, "2")) {
          return;
       }
       a.p(p0, "musicId");
       this.b.w.onNext(new d$a(p0, p1));
       return;
    }
    public ClientContent$LiveVoicePartyPackageV2 y(){
       Object obj = PatchProxy.apply(null, this, VoicePartyAudienceViewController$d.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       throw new UnsupportedOperationException("Not implemented");
    }
}
