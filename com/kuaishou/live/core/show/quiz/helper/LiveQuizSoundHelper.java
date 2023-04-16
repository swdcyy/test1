package com.kuaishou.live.core.show.quiz.helper.LiveQuizSoundHelper;
import java.lang.Object;
import android.media.SoundPool;
import com.kuaishou.live.core.show.quiz.helper.LiveQuizSoundHelper$LiveQuizSoundType;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.quiz.helper.LiveQuizSoundHelper$b;
import java.lang.Enum;
import com.kuaishou.live.core.show.quiz.helper.LiveQuizSoundHelper$a;
import java.lang.Boolean;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class LiveQuizSoundHelper	// class@000e0a
{
    public SoundPool a;
    public LiveQuizSoundHelper$b[] b;
    public boolean c;

    public void LiveQuizSoundHelper(){
       super();
       int i = 0;
       this.a = new SoundPool(LiveQuizSoundHelper$LiveQuizSoundType.values().length, 3, i);
       if (PatchProxy.applyVoid(null, this, LiveQuizSoundHelper.class, "11")) {
       }else {
          LiveQuizSoundHelper$b[] uobArray = new LiveQuizSoundHelper$b[LiveQuizSoundHelper$LiveQuizSoundType.values().length];
          this.b = uobArray;
          LiveQuizSoundHelper$LiveQuizSoundType[] liveQuizSoun = LiveQuizSoundHelper$LiveQuizSoundType.values();
          int len = liveQuizSoun.length;
          for (; i < len; i = i + 1) {
             this.b[liveQuizSoun[i].ordinal()] = new LiveQuizSoundHelper$b(null);
          }
       }
       return;
    }
    public void a(LiveQuizSoundHelper$LiveQuizSoundType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveQuizSoundHelper.class, "4")) {
          return;
       }
       this.b(p0, false);
       return;
    }
    public void b(LiveQuizSoundHelper$LiveQuizSoundType p0,boolean p1){
       LiveQuizSoundHelper liveQuizSoun = LiveQuizSoundHelper.class;
       if (PatchProxy.isSupport(liveQuizSoun) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, liveQuizSoun, "5")) {
          return;
       }
       if (this.a == null) {
          return;
       }
       object oobject = this.b[p0.ordinal()];
       this.d();
       this.c(p0);
       if (!oobject.a()) {
          b.c0(LiveLogTag.LIVE_QUIZ, "playLiveQuizSound, res not found", "type", p0);
       }
       LiveQuizSoundHelper ta = this.a;
       int i = oobject.a();
       int i1 = (p1)? -1: 0;
       int i2 = ta.play(i, 0x3f800000, 0x3f800000, 0, i1, 0x3f800000);
       if (!i2) {
          b.c0(LiveLogTag.LIVE_QUIZ, "playLiveQuizSound not loaded in memory", "type", p0);
       }
       oobject.b = i2;
       return;
    }
    public void c(LiveQuizSoundHelper$LiveQuizSoundType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveQuizSoundHelper.class, "6")) {
          return;
       }
       LiveQuizSoundHelper ta = this.a;
       if (ta == null) {
          return;
       }
       ta.stop(this.b[p0.ordinal()].b);
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, LiveQuizSoundHelper.class, "1")) {
          return;
       }
       if (this.c != null) {
          return;
       }
       if (this.a == null) {
          return;
       }
       LiveQuizSoundHelper$LiveQuizSoundType[] liveQuizSoun = LiveQuizSoundHelper$LiveQuizSoundType.values();
       int len = liveQuizSoun.length;
       boolean b = false;
       int i = 0;
       int i1 = 0;
       LiveQuizSoundHelper liveQuizSoun1 = 1;
       while (i < len) {
          object oobject = liveQuizSoun[i];
          if (this.b[oobject.ordinal()].a == null) {
             if (!PatchProxy.applyVoidOneRefs(oobject, this, LiveQuizSoundHelper.class, "10")) {
                this.b[oobject.ordinal()].a = this.a.load(oobject.getAudioFilePath(), liveQuizSoun1);
             }
             if (this.b[oobject.ordinal()].a == null) {
                i1 = i1 + 1;
             }
          }
          i = i + 1;
       }
       if (!i1) {
          b = true;
       }
       this.c = b;
       return;
    }
}
