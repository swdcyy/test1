package com.kwai.slide.play.detail.information.imquickreply.IMQuickReplyElementView$onBindData$$inlined$apply$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.slide.play.detail.information.imquickreply.IMQuickReplyElementView;
import java.lang.Object;
import cr7.i;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import qp7.c;
import qp7.d;
import cr7.h;
import java.util.Objects;
import io.reactivex.subjects.PublishSubject;

public final class IMQuickReplyElementView$onBindData$$inlined$apply$lambda$1 extends Lambda implements l	// class@0017e5
{
    public final IMQuickReplyElementView this$0;

    public void IMQuickReplyElementView$onBindData$$inlined$apply$lambda$1(IMQuickReplyElementView p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(i p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, IMQuickReplyElementView$onBindData$$inlined$apply$lambda$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       h oh = this.this$0.l();
       Objects.requireNonNull(oh);
       if (!PatchProxy.applyVoidOneRefs(p0, oh, h.class, "1")) {
          a.p(p0, "item");
          oh.a.onNext(p0);
       }
       PatchProxy.onMethodExit(IMQuickReplyElementView$onBindData$$inlined$apply$lambda$1.class, "1");
       return;
    }
}
