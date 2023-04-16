package gg0.d;
import java.lang.Runnable;
import gg0.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import java.lang.StringBuilder;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.List;
import hg0.b;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import crd.b;
import lnc.b9;
import hg0.a;

public final class d implements Runnable	// class@0024d3
{
    public final c b;

    public void d(c p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "1")) {
          return;
       }
       d tb = this.b;
       Objects.requireNonNull(tb);
       c uoc = c.class;
       if (!PatchProxy.applyVoid(objArray, tb, uoc, "7")) {
          float p = c.p;
          if (p - tb.l >= 0) {
             TaskCenterLogUtil.e(TaskCenterLogUtil.b, "BrowseDetailTask", "onCountdown: block by 当前作品观看时长超过限定值-"+tb.l+" s", false, 4, null);
             tb.a(c.q);
             c.r.add(tb.o);
          }else {
             float f = tb.j + 0.10f;
             tb.j = f;
             c.p = p + 0.10f;
             if (f - (float)tb.f.getMCheckValue() >= 0 && (!PatchProxy.applyVoid(objArray, tb, uoc, "9") && tb.n == null)) {
                tb.n = true;
                b9.a(tb.k);
                tb.k = tb.e();
             }
          label_0086 :
             tb.q(((float)tb.f.getMCurrentProgress() + tb.j));
          }
       }
       return;
    }
}
