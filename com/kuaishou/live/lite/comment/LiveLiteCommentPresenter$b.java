package com.kuaishou.live.lite.comment.LiveLiteCommentPresenter$b;
import n93.b;
import com.kuaishou.live.lite.comment.LiveLiteCommentPresenter;
import java.lang.Object;
import n93.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ip3.a;
import com.kuaishou.live.service.ServiceProvider;

public final class LiveLiteCommentPresenter$b implements b	// class@0007e6
{
    public final LiveLiteCommentPresenter a;

    public void LiveLiteCommentPresenter$b(LiveLiteCommentPresenter p0){
       this.a = p0;
       super();
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteCommentPresenter$b.class, "2")) {
          return;
       }
       a.p(p0, "itemViewController");
       b uob = this.a.y.a().get();
       if (uob != null) {
          uob.a(p0);
       }
       return;
    }
    public void b(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteCommentPresenter$b.class, "1")) {
          return;
       }
       a.p(p0, "itemViewController");
       b uob = this.a.y.a().get();
       if (uob != null) {
          uob.b(p0);
       }
       return;
    }
}
