package com.kuaishou.live.core.voiceparty.b$a;
import co2.r;
import pp2.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pp2.a$a;
import java.lang.Throwable;
import java.lang.StackTraceElement;
import kotlin.jvm.internal.a;
import pp.c;
import hp2.b;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Integer;
import java.lang.Boolean;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartyMicSeatsReadyResponse$VoicePartyUserInitialState;
import ht2.a;

public final class b$a extends a implements r	// class@001339
{

    public void b$a(){
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "4")) {
          return;
       }
       if (a.d.a()) {
          String str = new Throwable().getStackTrace()[0].toString();
          a.o(str, "Throwable\(\).stackTrace[0].toString\(\)");
          b.Z(b.a(), "dispatch callback "+str);
       }
       Iterator iterator = this.k0().iterator();
       while (iterator.hasNext()) {
          Object[] objArray = iterator.next();
          if (!objArray instanceof r) {
             objArray = null;
          }
          if (objArray != null) {
             objArray.a();
          }
       }
       return;
    }
    public void b0(int p0,boolean p1){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uoa, "3")) {
          return;
       }
       if (a.d.a()) {
          String str = new Throwable().getStackTrace()[0].toString();
          a.o(str, "Throwable\(\).stackTrace[0].toString\(\)");
          b.Z(b.a(), "dispatch callback "+str);
       }
       Iterator iterator = this.k0().iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (!obj instanceof r) {
             obj = null;
          }
          if (obj != null) {
             obj.b0(p0, p1);
          }
       }
       return;
    }
    public void c(int p0){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       if (a.d.a()) {
          String str = new Throwable().getStackTrace()[0].toString();
          a.o(str, "Throwable\(\).stackTrace[0].toString\(\)");
          b.Z(b.a(), "dispatch callback "+str);
       }
       Iterator iterator = this.k0().iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (!obj instanceof r) {
             obj = null;
          }
          if (obj != null) {
             obj.c(p0);
          }
       }
       return;
    }
    public void n(int p0,LiveVoicePartyMicSeatsReadyResponse$VoicePartyUserInitialState p1,a p2){
       if (PatchProxy.isSupport(b$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, b$a.class, "1")) {
          return;
       }
       a.p(p2, "micSeatChangedInfo");
       if (a.d.a()) {
          String str = new Throwable().getStackTrace()[0].toString();
          a.o(str, "Throwable\(\).stackTrace[0].toString\(\)");
          b.Z(b.a(), "dispatch callback "+str);
       }
       Iterator iterator = this.k0().iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (!obj instanceof r) {
             obj = null;
          }
          if (obj != null) {
             obj.n(p0, p1, p2);
          }
       }
       return;
    }
}
