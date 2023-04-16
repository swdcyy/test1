package com.yxcorp.gifshow.photoad.PlaySecondsTimer$mProgressUpdateHandler$2$a$a;
import erd.g;
import com.yxcorp.gifshow.photoad.PlaySecondsTimer$mProgressUpdateHandler$2$a;
import java.lang.Object;
import vq4.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import vq4.d;
import com.yxcorp.gifshow.photoad.PlaySecondsTimer$mProgressUpdateHandler$2;
import com.yxcorp.gifshow.photoad.PlaySecondsTimer;

public final class PlaySecondsTimer$mProgressUpdateHandler$2$a$a implements g	// class@000f6c
{
    public final int b;
    public final PlaySecondsTimer$mProgressUpdateHandler$2$a c;

    public void PlaySecondsTimer$mProgressUpdateHandler$2$a$a(int p0,PlaySecondsTimer$mProgressUpdateHandler$2$a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, PlaySecondsTimer$mProgressUpdateHandler$2$a$a.class, "1")) {
       }else {
          a.p(p0, "clientAdLog");
          p0 = p0.F;
          p0.N = this.b;
          p0.p0 = this.c.b.this$0.c;
          PatchProxy.onMethodExit(PlaySecondsTimer$mProgressUpdateHandler$2$a$a.class, "1");
       }
       return;
    }
}
