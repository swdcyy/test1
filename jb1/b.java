package jb1.b;
import y8c.g;
import java.lang.String;
import p91.m;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Object;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import o56.c;
import o56.a;
import android.app.Application;
import g9c.a;
import java.util.List;
import jb1.a;
import java.util.Comparator;
import java.util.Collections;
import java.lang.Number;
import java.util.Iterator;
import com.kwai.framework.model.user.UserInfo;
import android.view.ViewGroup;
import y8c.f;
import android.view.View;
import i2b.a;
import jb1.b$c;
import ml8.c;
import jb1.b$b;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import bb1.f;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class b extends g	// class@002b0b
{
    public String A;
    public LiveApiParams$AssistantType B;
    public String C;
    public String D;
    public String E;
    public m F;
    public final int w;
    public final int x;
    public int y;
    public int z;
    public static final int G;

    public void b(String p0,String p1,String p2,String p3,m p4){
       super();
       this.w = 1;
       this.x = 2;
       this.y = 0;
       this.z = 0;
       this.A = p0;
       this.C = p1;
       this.B = ((QCurrentUser.me().getId()).equals(p1))? LiveApiParams$AssistantType.PUSHER: LiveApiParams$AssistantType.SUPER_ADMIN;
       this.D = p2;
       this.E = p3;
       if (p4 != null) {
          this.F = p4;
       }
       return;
    }
    public Object N0(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.f0(p0) == 2) {
          if (!p0 && this.y > null) {
             return a.a().a().getString(0x7f102861);
          }else {
             return a.a().a().getString(0x7f10285b);
          }
       }else {
          int i = 1;
          if (p0 >= (this.y + i)) {
             i = this.z;
          }
          return super.N0((p0 - i));
       }
    }
    public void W0(List p0){
       int i;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "4")) {
          return;
       }
       Collections.sort(p0, a.b);
       super.W0(p0);
       p0 = PatchProxy.apply(null, this, uob, "2");
       if (p0 != PatchProxyResult.class) {
          i = p0.intValue();
       }else {
          i = 0;
          Iterator iterator = this.Q0().iterator();
          while (iterator.hasNext() && iterator.next().isWatching()) {
             i++;
          }
       }
       this.y = i;
       this.z = this.r1();
       return;
    }
    public int f0(int p0){
       if (p0) {
          b ty = this.y;
          if (ty <= null || p0 != (ty + 1)) {
             return 1;
          }
       }
       return 2;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (super.getItemCount() + this.z);
    }
    public f h1(ViewGroup p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 == 1) {
          return new f(a.i(p0, 0x7f0d0920), new b$c(this));
       }else {
          return new f(a.i(p0, 0x7f0d0921), new b$b(this));
       }
    }
    public int r1(){
       b obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.Q0().isEmpty()) {
          return 0;
       }
       obj = this.y;
       if (obj > null && obj < this.Q0().size()) {
          return 2;
       }
       return 1;
    }
    public void s1(int p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "8")) {
          return;
       }
       if (this.F == null) {
          return;
       }
       ClientContentWrapper$LiveVoicePartyPackage liveVoicePar = new ClientContentWrapper$LiveVoicePartyPackage();
       liveVoicePar.voicePartyId = this.D;
       liveVoicePar.theaterId = this.E;
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "ADMINISTRATOR_SETTING_CARD";
       i3 oi3 = i3.f();
       oi3.c("btn_type", Integer.valueOf(p0));
       oi3.c("status", Integer.valueOf(p1));
       uElementPack.params = oi3.e();
       ClientContent$LiveStreamPackage liveStreamPa = this.F.a();
       liveStreamPa.anchorUserId = this.C;
       liveStreamPa.liveStreamId = this.A;
       p1 = 26;
       if (!PatchProxy.isSupport(f.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(p1), liveVoicePar, uElementPack, liveStreamPa, null, f.class, "19")) {
          ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
          uContentWrap.liveVoicePartyPackage = liveVoicePar;
          uElementPack.action = p1;
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.H("", 1, uElementPack, uContentPack, uContentWrap);
       }
       return;
    }
}
