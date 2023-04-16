package lt1.j$b;
import bt1.c;
import lt1.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import yh3.a;
import java.lang.Boolean;
import zs1.b;
import ut1.f;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkTimeLine;
import java.util.Objects;
import android.os.CountDownTimer;
import pu1.m;
import msd.a;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import java.lang.Long;
import java.lang.System;
import pp.c;
import com.kuaishou.android.live.log.b;
import lt1.k;
import bt1.a;
import kotlin.jvm.internal.a;
import bt1.b;

public final class j$b implements c	// class@003030
{
    public final j b;

    public void j$b(j p0){
       this.b = p0;
       super();
    }
    public void Y0(){
       Object obj = this;
       if (PatchProxy.applyVoid(null, obj, j$b.class, "1")) {
          return;
       }
       j$b b = obj.b;
       b.r0(b.w0()).setValue(Boolean.TRUE);
       f value = obj.b.j.l().getValue();
       if (value != null) {
          j$b b1 = obj.b;
          LiveMultiPkTimeLine liveMultiPkT = value.m();
          Objects.requireNonNull(b1);
          if (!PatchProxy.applyVoidOneRefs(liveMultiPkT, b1, j.class, "4")) {
             j e = b1.e;
             if (e != null) {
                e.cancel();
             }
             long l = m.a.a(liveMultiPkT, b1.l);
             b.e0(LiveCommonLogTag.MULTI_PK, "LiveMultiPkVoteCountDownViewModel#startTimer", "serverTime", b1.l.invoke(), "timeLine.voteDeadline", Long.valueOf(liveMultiPkT.voteDeadline), "clientTime", Long.valueOf(System.currentTimeMillis()));
             if (l - 0x36ee80 >= 0) {
                b1.f = true;
             }
             k ok = new k(b1, l, l, 1000);
             b1.e = liveMultiPkT;
             liveMultiPkT.start();
          }
       }
       return;
    }
    public void Z1(){
       if (PatchProxy.applyVoid(null, this, j$b.class, "3")) {
          return;
       }
       j$b tb = this.b;
       tb.r0(tb.w0()).setValue(Boolean.FALSE);
       return;
    }
    public void e2(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$b.class, "2")) {
          return;
       }
       a.p(p0, "gameInfo");
       j$b tb = this.b;
       tb.r0(tb.w0()).setValue(Boolean.FALSE);
       return;
    }
    public void i2(){
       b.b(this);
    }
}
