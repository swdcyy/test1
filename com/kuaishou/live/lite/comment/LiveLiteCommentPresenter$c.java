package com.kuaishou.live.lite.comment.LiveLiteCommentPresenter$c;
import s93.s;
import com.kuaishou.live.lite.comment.LiveLiteCommentPresenter;
import java.lang.Object;
import s93.x;
import s93.s$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ip3.a;
import com.kuaishou.live.service.ServiceProvider;
import u93.b;

public final class LiveLiteCommentPresenter$c implements s	// class@0007e7
{
    public final LiveLiteCommentPresenter a;

    public void LiveLiteCommentPresenter$c(LiveLiteCommentPresenter p0){
       this.a = p0;
       super();
    }
    public void a(x p0,s$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteCommentPresenter$c.class, "1")) {
          return;
       }
       a.p(p0, "parameter");
       s os = this.a.v.a().get();
       if (os != null) {
          os.a(p0, p1);
       }
       return;
    }
    public void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteCommentPresenter$c.class, "2")) {
          return;
       }
       a.p(p0, "commentData");
       s os = this.a.v.a().get();
       if (os != null) {
          os.b(p0);
       }
       return;
    }
}
