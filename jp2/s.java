package jp2.s;
import jp2.r;
import pp2.a;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import pp2.a$a;
import java.lang.Throwable;
import java.lang.StackTraceElement;
import pp.c;
import hp2.b;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.model.Lyrics;

public class s extends a implements r	// class@003321
{

    public void s(){
       super();
    }
    public void C1(KtvMusicOrderInfo p0,boolean p1,long p2){
       if (PatchProxy.isSupport(s.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Long.valueOf(p2), this, s.class, "10")) {
          return;
       }
       a.p(p0, "music");
       if (a.d.a()) {
          String str = new Throwable().getStackTrace()[0].toString();
          a.o(str, "Throwable\(\).stackTrace[0].toString\(\)");
          b.Z(b.a(), "dispatch callback "+str);
       }
       Iterator iterator = this.k0().iterator();
       while (iterator.hasNext()) {
          iterator.next().C1(p0, p1, p2);
       }
       return;
    }
    public void J(KtvMusicOrderInfo p0,Lyrics p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, s.class, "7")) {
          return;
       }
       a.p(p0, "music");
       if (a.d.a()) {
          String str = new Throwable().getStackTrace()[0].toString();
          a.o(str, "Throwable\(\).stackTrace[0].toString\(\)");
          b.Z(b.a(), "dispatch callback "+str);
       }
       Iterator iterator = this.k0().iterator();
       while (iterator.hasNext()) {
          iterator.next().J(p0, p1);
       }
       return;
    }
    public void K1(KtvMusicOrderInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "5")) {
          return;
       }
       a.p(p0, "music");
       if (a.d.a()) {
          String str = new Throwable().getStackTrace()[0].toString();
          a.o(str, "Throwable\(\).stackTrace[0].toString\(\)");
          b.Z(b.a(), "dispatch callback "+str);
       }
       Iterator iterator = this.k0().iterator();
       while (iterator.hasNext()) {
          iterator.next().K1(p0);
       }
       return;
    }
    public void S0(KtvMusicOrderInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "9")) {
          return;
       }
       a.p(p0, "music");
       if (a.d.a()) {
          String str = new Throwable().getStackTrace()[0].toString();
          a.o(str, "Throwable\(\).stackTrace[0].toString\(\)");
          b.Z(b.a(), "dispatch callback "+str);
       }
       Iterator iterator = this.k0().iterator();
       while (iterator.hasNext()) {
          iterator.next().S0(p0);
       }
       return;
    }
    public void Z(KtvMusicOrderInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "2")) {
          return;
       }
       a.p(p0, "music");
       if (a.d.a()) {
          String str = new Throwable().getStackTrace()[0].toString();
          a.o(str, "Throwable\(\).stackTrace[0].toString\(\)");
          b.Z(b.a(), "dispatch callback "+str);
       }
       Iterator iterator = this.k0().iterator();
       while (iterator.hasNext()) {
          iterator.next().Z(p0);
       }
       return;
    }
    public void b2(KtvMusicOrderInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "6")) {
          return;
       }
       a.p(p0, "music");
       if (a.d.a()) {
          String str = new Throwable().getStackTrace()[0].toString();
          a.o(str, "Throwable\(\).stackTrace[0].toString\(\)");
          b.Z(b.a(), "dispatch callback "+str);
       }
       Iterator iterator = this.k0().iterator();
       while (iterator.hasNext()) {
          iterator.next().b2(p0);
       }
       return;
    }
    public void p0(KtvMusicOrderInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "8")) {
          return;
       }
       a.p(p0, "music");
       if (a.d.a()) {
          String str = new Throwable().getStackTrace()[0].toString();
          a.o(str, "Throwable\(\).stackTrace[0].toString\(\)");
          b.Z(b.a(), "dispatch callback "+str);
       }
       Iterator iterator = this.k0().iterator();
       while (iterator.hasNext()) {
          iterator.next().p0(p0);
       }
       return;
    }
    public void q2(KtvMusicOrderInfo p0,Lyrics p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, s.class, "4")) {
          return;
       }
       a.p(p0, "music");
       if (a.d.a()) {
          String str = new Throwable().getStackTrace()[0].toString();
          a.o(str, "Throwable\(\).stackTrace[0].toString\(\)");
          b.Z(b.a(), "dispatch callback "+str);
       }
       Iterator iterator = this.k0().iterator();
       while (iterator.hasNext()) {
          iterator.next().q2(p0, p1);
       }
       return;
    }
    public void u1(){
       if (PatchProxy.applyVoid(null, this, s.class, "1")) {
          return;
       }
       if (a.d.a()) {
          String str = new Throwable().getStackTrace()[0].toString();
          a.o(str, "Throwable\(\).stackTrace[0].toString\(\)");
          b.Z(b.a(), "dispatch callback "+str);
       }
       Iterator iterator = this.k0().iterator();
       while (iterator.hasNext()) {
          iterator.next().u1();
       }
       return;
    }
    public void x1(KtvMusicOrderInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "3")) {
          return;
       }
       a.p(p0, "music");
       if (a.d.a()) {
          String str = new Throwable().getStackTrace()[0].toString();
          a.o(str, "Throwable\(\).stackTrace[0].toString\(\)");
          b.Z(b.a(), "dispatch callback "+str);
       }
       Iterator iterator = this.k0().iterator();
       while (iterator.hasNext()) {
          iterator.next().x1(p0);
       }
       return;
    }
}
