package com.yxcorp.gifshow.v3.editor.cover.VideoCoverEditorPresenter$b;
import com.yxcorp.gifshow.widget.EditCoverSeekBar$c;
import com.yxcorp.gifshow.v3.editor.cover.VideoCoverEditorPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.widget.EditCoverSeekBar;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import java.lang.Float;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import java.lang.Math;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import ooc.g1;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;

public class VideoCoverEditorPresenter$b implements EditCoverSeekBar$c	// class@000e2d
{
    public final VideoCoverEditorPresenter a;

    public void VideoCoverEditorPresenter$b(VideoCoverEditorPresenter p0){
       this.a = p0;
       super();
    }
    public void a(EditCoverSeekBar p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoCoverEditorPresenter$b.class, "2")) {
          return;
       }
       if (this.a.A.get() != null) {
          this.a.A.get().a(p0);
       }
       return;
    }
    public void b(EditCoverSeekBar p0,float p1){
       VideoCoverEditorPresenter$b uob = VideoCoverEditorPresenter$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uob, "3")) {
          return;
       }
       uob = this.a;
       uob.R = p1;
       uob.R8(p1);
       uob = this.a;
       VideoCoverEditorPresenter u = uob.U;
       if (u != null) {
          uob.S = Math.max(0, (u.getVideoLength() * (double)p1));
       }
       Object[] objArray = new Object[0];
       a.D().w("VideoCoverEditorPresenter", "onChangeEnd progress: "+p1+" mCoverPosition: "+this.a.S, objArray);
       uob = this.a;
       g1.v(uob.t, uob.u, String.valueOf(uob.R));
       if (this.a.A.get() != null) {
          this.a.A.get().b(p0, p1);
       }
       p0.P = Boolean.FALSE;
       return;
    }
    public void c(EditCoverSeekBar p0,float p1){
       VideoCoverEditorPresenter$b uob = VideoCoverEditorPresenter$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uob, "1")) {
          return;
       }
       uob = this.a;
       uob.R = p1;
       Boolean tRUE = Boolean.TRUE;
       uob.N.onNext(tRUE);
       this.a.R8(p1);
       this.a.K.onNext(tRUE);
       if (this.a.A.get() != null) {
          this.a.A.get().c(p0, p1);
       }
       return;
    }
}
