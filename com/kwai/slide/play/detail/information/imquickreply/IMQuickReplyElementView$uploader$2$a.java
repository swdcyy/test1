package com.kwai.slide.play.detail.information.imquickreply.IMQuickReplyElementView$uploader$2$a;
import t2b.a$a;
import com.kwai.slide.play.detail.information.imquickreply.IMQuickReplyElementView$uploader$2;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import cr7.i;
import qp7.c;
import qp7.d;
import cr7.h;
import java.util.Objects;
import io.reactivex.subjects.PublishSubject;

public final class IMQuickReplyElementView$uploader$2$a implements a$a	// class@0017e7
{
    public final IMQuickReplyElementView$uploader$2 a;

    public void IMQuickReplyElementView$uploader$2$a(IMQuickReplyElementView$uploader$2 p0){
       this.a = p0;
       super();
    }
    public final void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMQuickReplyElementView$uploader$2$a.class, "1")) {
          return;
       }
       a.o(p0, "it");
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          i oi = iterator.next();
          h oh = this.a.this$0.l();
          a.o(oi, "item");
          Objects.requireNonNull(oh);
          if (PatchProxy.applyVoidOneRefs(oi, oh, h.class, "2")) {
             continue ;
          }else {
             a.p(oi, "item");
             oh.b.onNext(oi);
          }
       }
       return;
    }
}
