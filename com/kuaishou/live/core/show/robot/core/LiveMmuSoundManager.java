package com.kuaishou.live.core.show.robot.core.LiveMmuSoundManager;
import java.lang.Object;
import com.kuaishou.live.core.show.robot.core.LiveMmuSoundManager$WorkMode;
import com.kuaishou.live.core.show.robot.core.LiveMmuSoundManager$a;
import java.lang.String;
import com.kuaishou.live.core.show.robot.core.LiveMmuSoundManager$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.ExecutorService;
import t45.c;
import si2.c;
import java.lang.Runnable;
import java.util.concurrent.Future;
import java.lang.Integer;
import java.lang.System;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.Enum;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.robot.core.LiveMmuSoundManager$b;
import si2.e;
import w51.a;
import com.kuaishou.live.core.show.robot.core.a;
import si2.d;
import ekd.k1;
import z12.e;
import si2.b;
import java.lang.Boolean;
import java.lang.StringBuilder;
import java.lang.Long;
import si2.a;

public class LiveMmuSoundManager	// class@000fca
{
    public long a;
    public String b;
    public ExecutorService c;
    public boolean d;
    public LiveMmuSoundManager$c e;
    public boolean f;
    public LiveMmuSoundManager$WorkMode g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public int l;
    public LinkedList m;
    public int n;
    public a o;
    public a p;
    public a q;
    public long r;
    public final MmuSoundCallback s;

    public void LiveMmuSoundManager(){
       super();
       this.g = LiveMmuSoundManager$WorkMode.IDLE;
       this.s = new LiveMmuSoundManager$a(this);
    }
    public void a(String p0,LiveMmuSoundManager$c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMmuSoundManager.class, "1")) {
          return;
       }
       this.e = p1;
       ExecutorService uExecutorSer = c.f("VoiceCommentMmuDetection");
       this.c = uExecutorSer;
       uExecutorSer.submit(new c(this, p0));
       this.d = true;
       return;
    }
    public final boolean b(){
       boolean b = (this.d != null && this.a)? true: false;
       return b;
    }
    public void c(byte[] p0,int p1,int p2){
       LiveMmuSoundManager to;
       LiveMmuSoundManager liveMmuSound = LiveMmuSoundManager.class;
       if (PatchProxy.isSupport(liveMmuSound) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, LiveMmuSoundManager.class, "7")) {
          return;
       }
       if (this.g == LiveMmuSoundManager$WorkMode.IDLE) {
          return;
       }
       if ((System.currentTimeMillis() - this.r) - 500 > 0) {
          LiveLogTag lIVE_ROBOT = LiveLogTag.LIVE_ROBOT;
          lIVE_ROBOT.appendTag("LiveMmuSoundManager");
          LiveLogTag liveLogTag = lIVE_ROBOT;
          b.U(liveLogTag, "onReceiveAudioData", "mDetectionSessionId", this.b, "dataSize", Integer.valueOf(p0.length), "mWorkMode", Integer.valueOf(this.g.ordinal()));
          this.r = System.currentTimeMillis();
       }
       if (this.j == null) {
          this.j = (p1 * 2) * p2;
          this.i = 0;
          this.l = p1;
          this.k = p2;
       }
       p1 = LiveMmuSoundManager$b.a[this.g.ordinal()];
       if (p1 != 1) {
          if (p1 == 2) {
             this.d(p0, this.l, this.k);
          }
       }else {
          to = this.l;
          LiveMmuSoundManager tk = this.k;
          if (PatchProxy.isSupport(liveMmuSound) && (!PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(to), Integer.valueOf(tk), this, LiveMmuSoundManager.class, "8") && this.d != null)) {
             this.c.submit(new e(this, p0, to, tk));
          }
       }
       if (a.S()) {
          to = this.o;
          if (to != null) {
             to.b(p0);
          }
       }
       return;
    }
    public void d(byte[] p0,int p1,int p2){
       if (PatchProxy.isSupport(LiveMmuSoundManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, LiveMmuSoundManager.class, "9")) {
          return;
       }
       if (this.d != null) {
          this.c.submit(new d(this, p0, p1, p2));
       }
       return;
    }
    public void e(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveMmuSoundManager.class, "11")) {
          return;
       }
       String str = "LiveMmuSoundManager";
       b.P(LiveLogTag.LIVE_ROBOT.appendTag(str), "release");
       k1.n(this);
       this.e = objArray;
       if (this.d != null) {
          String[] stringArray = new String[0];
          e.c(str, "schedule release mmu", stringArray);
          this.c.submit(new b(this));
       }
       this.d = false;
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, LiveMmuSoundManager.class, "15")) {
          return;
       }
       this.g(this.p);
       this.g(this.o);
       this.g(this.q);
       return;
    }
    public void g(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMmuSoundManager.class, "14")) {
          return;
       }
       if (p0 != null) {
          p0.a();
       }
       return;
    }
    public void h(String p0,boolean p1){
       LiveMmuSoundManager liveMmuSound = LiveMmuSoundManager.class;
       if (PatchProxy.isSupport(liveMmuSound) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, liveMmuSound, "2")) {
          return;
       }
       b.P(LiveLogTag.LIVE_ROBOT.appendTag("LiveMmuSoundManager"), "startDetecting session:"+p0+", mDetectionSessionId:"+this.b);
       this.b = p0;
       this.g = LiveMmuSoundManager$WorkMode.DETECTING;
       this.f = false;
       this.h = p1;
       this.m = null;
       if (a.S()) {
          this.g(this.o);
          this.o = new a(a.d+this.b+"_"+System.currentTimeMillis()+".pcm", p0);
       }
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, LiveMmuSoundManager.class, "5")) {
          return;
       }
       b.S(LiveLogTag.LIVE_ROBOT.appendTag("LiveMmuSoundManager"), "startProcessingData", "mDetectionSessionId", this.b);
       this.g = LiveMmuSoundManager$WorkMode.PROCESSING;
       return;
    }
    public void j(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMmuSoundManager.class, "4")) {
          return;
       }
       b.S(LiveLogTag.LIVE_ROBOT.appendTag("LiveMmuSoundManager"), "startProcessingData session:"+p0, "mDetectionSessionId", this.b);
       this.b = p0;
       this.g = LiveMmuSoundManager$WorkMode.PROCESSING;
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, LiveMmuSoundManager.class, "3")) {
          return;
       }
       b.S(LiveLogTag.LIVE_ROBOT.appendTag("LiveMmuSoundManager"), "stopDetecting session:"+this.b, "time", Long.valueOf(System.currentTimeMillis()));
       if (this.d != null) {
          this.c.submit(new a(this));
       }
       this.i = 0;
       this.m = null;
       this.g = LiveMmuSoundManager$WorkMode.IDLE;
       return;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, LiveMmuSoundManager.class, "6")) {
          return;
       }
       b.S(LiveLogTag.LIVE_ROBOT.appendTag("LiveMmuSoundManager"), "stopProcessingData", "mDetectionSessionId", this.b);
       this.g = LiveMmuSoundManager$WorkMode.IDLE;
       this.f();
       return;
    }
}
