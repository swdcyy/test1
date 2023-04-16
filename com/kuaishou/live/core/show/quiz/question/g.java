package com.kuaishou.live.core.show.quiz.question.g;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.quiz.question.c;
import gg2.j;
import com.kuaishou.live.core.show.quiz.question.LiveQuizDialogType;
import com.kuaishou.live.core.show.quiz.helper.LiveQuizSoundHelper$LiveQuizSoundType;
import com.kuaishou.live.core.show.quiz.helper.LiveQuizSoundHelper;
import java.lang.Runnable;
import ekd.k1;
import gg2.h;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import gg2.i;
import java.util.Objects;
import java.lang.Enum;
import com.kuaishou.live.core.show.quiz.helper.LiveQuizSoundHelper$b;
import android.media.SoundPool;

public class g extends c	// class@000e43
{
    public c p;
    public Runnable q;
    public static String sLivePresenterClassName = "LiveQuizQuestionSoundPresenter";

    public void g(){
       super();
    }
    public void E8(){
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "2")) {
          return;
       }
       g tp = this.p;
       c h = tp.h;
       if (h == null) {
          return;
       }
       this.q = new j(this);
       c f = tp.f;
       if (f == LiveQuizDialogType.USER_RESULT_RIGHT) {
          h.a(LiveQuizSoundHelper$LiveQuizSoundType.CORRECT_ANSWER);
       }else if(f == LiveQuizDialogType.USER_RESULT_WRONG){
          h.a(LiveQuizSoundHelper$LiveQuizSoundType.WRONG_ANSWER);
       }else {
          h.a(LiveQuizSoundHelper$LiveQuizSoundType.POPUP);
          k1.r(this.q, 1000);
          if (!PatchProxy.applyVoid(objArray, this, og, "3")) {
             tp = Functions.e;
             this.X7(this.p.j.subscribe(new h(this), tp));
             this.X7(this.p.k.subscribe(new i(this), tp));
          }
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g.class, "4")) {
          return;
       }
       g tq = this.q;
       if (tq != null) {
          k1.m(tq);
       }
       c h = this.p.h;
       if (h != null) {
          Objects.requireNonNull(h);
          if (!PatchProxy.applyVoid(objArray, h, LiveQuizSoundHelper.class, "8") && h.a != null) {
             LiveQuizSoundHelper$LiveQuizSoundType[] liveQuizSoun = LiveQuizSoundHelper$LiveQuizSoundType.values();
             int len = liveQuizSoun.length;
             int i = 0;
             while (i < len) {
                object oobject = liveQuizSoun[i];
                if (!oobject.equals(LiveQuizSoundHelper$LiveQuizSoundType.POPUP)) {
                   h.a.stop(h.b[oobject.ordinal()].b);
                }
                i = i + 1;
             }
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.p = this.q8(c.class);
       return;
    }
}
