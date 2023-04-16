package com.yxcorp.gifshow.v3.editor.cover.d1$b;
import nwc.c;
import com.yxcorp.gifshow.v3.editor.cover.d1;
import java.lang.Object;
import nwc.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.v3.editor.cover.e1;
import t36.f$a;
import t36.f;
import java.util.concurrent.atomic.AtomicBoolean;
import com.yxcorp.gifshow.v3.editor.cover.f1;
import com.yxcorp.gifshow.util.PostUtils;

public class d1$b implements c	// class@000e56
{
    public final d1 b;

    public void d1$b(d1 p0){
       this.b = p0;
       super();
    }
    public void a(boolean p0){
       b.d(this, p0);
    }
    public void k(boolean p0){
       b.a(this, p0);
    }
    public void n(){
       b.e(this);
    }
    public void q(boolean p0,boolean p1){
       d1$b uob = d1$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uob, "1")) {
          return;
       }
       d1$b tb = this.b;
       if (tb.w == null) {
          i1.c(new RuntimeException("PhotosGenerateCoverPresenter can\'t generate cover, activity = null"));
          this.b.t.onNext(Boolean.FALSE);
          this.b.s.s0(e1.a);
          return;
       }else if(p0){
          tb.A.set(true);
       }
       d1 y = this.b.y;
       try{
          y.set(p0);
          this.b.P8(p0);
          return;
       }catch(java.lang.Exception e4){
          this.b.x.set(false);
          this.b.t.onNext(Boolean.FALSE);
          this.b.s.s0(f1.a);
          PostUtils.D("PhotosGenerateCoverPresenter", "generateCoverRequest", e4);
          throw e4;
       }
    }
    public void t(){
       b.b(this);
    }
}
