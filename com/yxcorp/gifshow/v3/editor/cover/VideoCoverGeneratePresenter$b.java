package com.yxcorp.gifshow.v3.editor.cover.VideoCoverGeneratePresenter$b;
import nwc.c;
import com.yxcorp.gifshow.v3.editor.cover.VideoCoverGeneratePresenter;
import java.lang.Object;
import nwc.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.v3.editor.cover.i2;
import t36.f$a;
import t36.f;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;

public class VideoCoverGeneratePresenter$b implements c	// class@000e37
{
    public final VideoCoverGeneratePresenter b;

    public void VideoCoverGeneratePresenter$b(VideoCoverGeneratePresenter p0){
       this.b = p0;
       super();
    }
    public void a(boolean p0){
       b.d(this, p0);
    }
    public void k(boolean p0){
       VideoCoverGeneratePresenter$b uob = VideoCoverGeneratePresenter$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("VideoCoverGeneratePresenter", "attachPlayerOriginalFrame isAttach:"+p0, objArray);
       if (p0) {
          this.b.R8();
       }else {
          this.b.S8();
       }
       return;
    }
    public void n(){
       b.e(this);
    }
    public void q(boolean p0,boolean p1){
       VideoCoverGeneratePresenter$b uob = VideoCoverGeneratePresenter$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uob, "2")) {
          return;
       }
       try{
          Object[] objArray = new Object[0];
          a.D().w("VideoCoverGeneratePresenter", "generateCoverRequest:"+p0+","+p1, objArray);
          if (!p0 || !p1) {
             this.b.V8();
          }else {
             this.b.x.onNext(Boolean.TRUE);
             this.b.w.s0(i2.a);
          }
          return;
       }catch(java.lang.Exception e6){
          this.b.C.set(0);
          PostUtils.D("VideoCoverGeneratePresenter", "generateCoverRequest,generateCover", e6);
          throw e6;
       }
    }
    public void t(){
       b.b(this);
    }
}
