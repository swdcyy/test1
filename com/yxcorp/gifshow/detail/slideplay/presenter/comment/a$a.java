package com.yxcorp.gifshow.detail.slideplay.presenter.comment.a$a;
import d6a.a;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import ekd.y0;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import java.lang.Float;
import io.reactivex.subjects.PublishSubject;

public class a$a extends a	// class@001854
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void F1(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$a.class, "2")) {
          return;
       }
       a$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, a.class, "9")) {
          a z = tb.z;
          if (z != null) {
             z.e();
          }
       }
       return;
    }
    public void i2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$a.class, "1")) {
          return;
       }
       a$a tb = this.b;
       tb.B = false;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, a.class, "8")) {
          a z = tb.z;
          if (z != null) {
             tb.q = 0;
             z.d();
          }
       }
       this.b.r.s.onNext(Float.valueOf(0x3f800000));
       return;
    }
}
