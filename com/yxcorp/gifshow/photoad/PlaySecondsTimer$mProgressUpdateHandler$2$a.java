package com.yxcorp.gifshow.photoad.PlaySecondsTimer$mProgressUpdateHandler$2$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.photoad.PlaySecondsTimer$mProgressUpdateHandler$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.photoad.PlaySecondsTimer;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import qrd.p;
import java.util.Collection;
import java.lang.Number;
import java.lang.StringBuilder;
import yx.j0;
import mxb.j0;
import mxb.i0;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.photoad.PlaySecondsTimer$mProgressUpdateHandler$2$a$a;
import erd.g;
import android.os.SystemClock;

public final class PlaySecondsTimer$mProgressUpdateHandler$2$a implements Runnable	// class@000f6d
{
    public final PlaySecondsTimer$mProgressUpdateHandler$2 b;

    public void PlaySecondsTimer$mProgressUpdateHandler$2$a(PlaySecondsTimer$mProgressUpdateHandler$2 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, PlaySecondsTimer$mProgressUpdateHandler$2$a.class, str)) {
          return;
       }
       PlaySecondsTimer$mProgressUpdateHandler$2 this$0 = this.b.this$0;
       Objects.requireNonNull(this$0);
       PlaySecondsTimer$mProgressUpdateHandler$2 obj = PatchProxy.apply(objArray, this$0, PlaySecondsTimer.class, str);
       if (obj != PatchProxyResult.class) {
       }else {
          obj = this$0.e.getValue();
       }
       int i = 1;
       int i1 = 0;
       int i2 = (obj == null || obj.isEmpty())? 1: 0;
       if (!i2) {
          objArray = obj;
       }
       if (objArray != null) {
          String str1 = "PlaySecondsTimer";
          if (this.b.this$0.d < objArray.size()) {
             int i3 = objArray.get(this.b.this$0.d).intValue();
             if (this.b.this$0.a - (long)i3 >= 0) {
                Object[] objArray1 = new Object[i1];
                j0.a(str1, "report:"+i3, objArray1);
                i0.a().e(905, this.b.this$0.g.mEntity).d(new PlaySecondsTimer$mProgressUpdateHandler$2$a$a(i3, this)).a();
                PlaySecondsTimer$mProgressUpdateHandler$2 this$01 = this.b.this$0;
                this$01.d = this$01.d + i;
             }
             long l = SystemClock.elapsedRealtime();
             obj = this.b.this$0;
             obj.a = obj.a + (l - obj.b);
             obj.b = l;
          }else {
             Object[] objArray2 = new Object[i1];
             j0.a(str1, "all play time has reported", objArray2);
             this.b.this$0.c();
          }
       }
       return;
    }
}
