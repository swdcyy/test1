package com.yxcorp.gifshow.photoad.PlaySecondsTimer$mProgressUpdateHandler$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.photoad.PlaySecondsTimer;
import ekd.y0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.photoad.PlaySecondsTimer$mProgressUpdateHandler$2$a;
import java.lang.Runnable;

public final class PlaySecondsTimer$mProgressUpdateHandler$2 extends Lambda implements a	// class@000f6e
{
    public final PlaySecondsTimer this$0;

    public void PlaySecondsTimer$mProgressUpdateHandler$2(PlaySecondsTimer p0){
       this.this$0 = p0;
       super(0);
    }
    public final y0 invoke(){
       Object obj = PatchProxy.apply(null, this, PlaySecondsTimer$mProgressUpdateHandler$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new y0(500, new PlaySecondsTimer$mProgressUpdateHandler$2$a(this));
    }
    public Object invoke(){
       return this.invoke();
    }
}
