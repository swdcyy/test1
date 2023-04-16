package cr2.c;
import wp2.f;
import cr2.c$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pr2.a;
import wp2.e;
import tp2.d;
import co2.f2;
import pr2.f$b;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.System;
import cr2.b;
import java.lang.Long;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import q2b.h$b;
import k2b.u1;

public class c extends f	// class@0023cb
{
    public a k;
    public f2 l;
    public d m;
    public long n;
    public String o;
    public final f$b p;

    public void c(){
       super();
       this.o = "";
       this.p = new c$a(this);
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.k = this.f(a.class);
       d uod = this.f(d.class);
       this.m = uod;
       this.l = uod.r0();
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.k.V(this.p);
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       this.k.d0(this.p);
       if (this.l.h() == 6 && !this.m.U0()) {
          this.m();
       }
       return;
    }
    public void m(){
       ClientEvent$ElementPackage uElementPack;
       i3 oi3;
       ClientContent$ContentPackage uContentPack;
       h$b uob1;
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "4")) {
          return;
       }
       ClientContent$LiveVoicePartyPackageV2 liveVoicePar = PatchProxy.apply(objArray, this, uoc, "5");
       if (liveVoicePar != PatchProxyResult.class) {
       }else if(this.m.B() != null){
          liveVoicePar = this.m.B();
       }else {
          liveVoicePar = objArray;
       }
       if (liveVoicePar != null && this.n - null) {
          ClientContent$LiveStreamPackage liveStreamPa = this.m.a();
          c to = this.o;
          c tn = this.n;
          long l = System.currentTimeMillis();
          b uob = b.class;
          if (PatchProxy.isSupport(uob)) {
             Object[] objArray1 = new Object[]{liveStreamPa,liveVoicePar,to,Long.valueOf(tn),Long.valueOf(l)};
             if (!PatchProxy.applyVoid(objArray1, objArray, uob, "2")) {
             }
          }else {
          }
       }
    label_00b4 :
       return;
    }
}
