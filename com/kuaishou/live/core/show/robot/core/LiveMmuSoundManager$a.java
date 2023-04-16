package com.kuaishou.live.core.show.robot.core.LiveMmuSoundManager$a;
import com.kuaishou.protobuf.mmusound.soundrecognize.MmuSoundCallback;
import com.kuaishou.live.core.show.robot.core.LiveMmuSoundManager;
import java.lang.Object;
import com.kuaishou.protobuf.mmusound.soundrecognize.SoundOutputData;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import si2.f;
import java.lang.Runnable;
import ekd.k1;
import w51.a;
import com.kuaishou.live.core.show.robot.core.a;
import java.lang.Integer;
import java.util.List;
import java.lang.StringBuilder;
import com.kuaishou.live.core.show.robot.core.LiveMmuSoundManager$c;
import z12.e;
import java.lang.Boolean;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import java.util.LinkedList;
import com.kuaishou.live.core.show.robot.core.LiveMmuSoundManager$d;
import java.util.Iterator;
import java.lang.System;

public class LiveMmuSoundManager$a implements MmuSoundCallback	// class@000fc5
{
    public final LiveMmuSoundManager a;

    public void LiveMmuSoundManager$a(LiveMmuSoundManager p0){
       this.a = p0;
       super();
    }
    public void dataProcessCallback(SoundOutputData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMmuSoundManager$a.class, "2")) {
          return;
       }
       if (!TextUtils.n(p0.sessionid, this.a.b)) {
          b.d0(LiveLogTag.LIVE_ROBOT, "dataProcessCallback", "data.sessionid", p0.sessionid, "mDetectionSessionId", this.a.b);
          return;
       }else {
          k1.p(new f(this, p0), this.a);
          if (a.S()) {
             LiveMmuSoundManager p = this.a.p;
             if (p != null) {
                p.b(p0.mAudioData);
             }
          }
          return;
       }
    }
    public void errorCallback(int p0,int p1){
       LiveMmuSoundManager$a uoa = LiveMmuSoundManager$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "3")) {
          return;
       }
       b.r(LiveLogTag.LIVE_ROBOT.appendTag("LiveMmuSoundManager"), "mmu detection failed with error type  "+p0+" code "+p1);
       LiveMmuSoundManager e = this.a.e;
       if (e != null) {
          e.onError(p0, p1);
       }
       return;
    }
    public void logCallback(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMmuSoundManager$a.class, "4")) {
          return;
       }
       b.S(LiveLogTag.LIVE_ROBOT.appendTag("LiveMmuSoundManager"), "logCallback", "logString", p0);
       return;
    }
    public void wakeupCallback(int p0,int p1,String p2){
       a liveMmuSound1;
       LiveMmuSoundManager e;
       LiveMmuSoundManager$a ta2;
       LiveMmuSoundManager$d b;
       if (PatchProxy.isSupport(LiveMmuSoundManager$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, LiveMmuSoundManager$a.class, "1")) {
          return;
       }
       String str = "LiveMmuSoundManager";
       if (!TextUtils.n(p2, this.a.b)) {
          b.r(LiveLogTag.LIVE_ROBOT.appendTag(str), "wakeupCallback session:"+p2+", localSession:"+this.a.b);
          return;
       }else {
          String[] stringArray = new String[0];
          e.c(str, "mmu sdk detected keyword with id "+p0+" in session "+p2, stringArray);
          this.a.f = true;
          LiveLogTag lIVE_ROBOT = LiveLogTag.LIVE_ROBOT;
          lIVE_ROBOT.appendTag(str);
          b.S(lIVE_ROBOT, "wakeupCallback", "mNeedLastSecondSoundData", Boolean.valueOf(this.a.h));
          LiveMmuSoundManager$a ta = this.a;
          if (ta.h != null) {
             Objects.requireNonNull(ta);
             LiveMmuSoundManager liveMmuSound = LiveMmuSoundManager.class;
             if (PatchProxy.isSupport(liveMmuSound)) {
                liveMmuSound1 = PatchProxy.applyOneRefs(Integer.valueOf(p1), ta, liveMmuSound, "13");
                if (liveMmuSound1 != PatchProxyResult.class) {
                }else if(q.f(ta.m)){
                   lIVE_ROBOT.appendTag(str);
                   b.P(lIVE_ROBOT, "getLastSecondSoundData , mLastSecondData is null");
                   liveMmuSound1 = null;
                }else {
                   String[] stringArray1 = new String[0];
                   e.c(str, "getLastSecondSoundData, wakeUpBufferId: "+p1+", currentBufferId: "+ta.m.getLast().a, stringArray1);
                   liveMmuSound1 = new byte[ta.i];
                   Iterator iterator = ta.m.iterator();
                   int i = 0;
                   while (iterator.hasNext()) {
                      LiveMmuSoundManager$d uod = iterator.next();
                      b = uod.b;
                      System.arraycopy(b, 0, liveMmuSound1, i, b.length);
                      i = i + uod.b.length;
                   }
                }
             }else {
                goto label_00ac ;
             }
             LiveMmuSoundManager$a ta1 = this.a;
             ta1.d(liveMmuSound1, ta1.l, ta1.k);
             e = this.a.e;
             if (e != null) {
                e.a(p0);
             }
             if (a.S()) {
                ta2 = this.a;
                ta2.g(ta2.q);
                str = a.d;
                ta2.q = new a(str+this.a.b+"_local_wake_up_one_second.pcm", p2);
                this.a.q.b(liveMmuSound1);
                this.a.q.a();
                ta2 = this.a;
                ta2.q = null;
                ta2.g(ta2.p);
                ta2.p = new a(str+this.a.b+".opus", this.a.b);
             }
          }else {
             lIVE_ROBOT.appendTag(str);
             b.T(lIVE_ROBOT, "wakeupCallback", "keyWordId", Integer.valueOf(p0), "mLiveMmuSoundListener", this.a.e);
             e = this.a.e;
             if (e != null) {
                e.a(p0);
             }
          }
          ta2.i = 0;
          return;
       }
    }
}
