package com.kwai.live.gzone.tab.page.LiveGzoneLifeStatePage;
import java.lang.Object;
import com.kwai.live.gzone.tab.bean.LiveGzoneTabState$State;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import g77.f;
import com.kwai.live.gzone.tab.bean.LiveGzoneTabState;
import com.google.common.collect.ImmutableTable;
import java.util.List;
import java.lang.StringBuilder;
import ok.n;
import java.util.Iterator;

public abstract class LiveGzoneLifeStatePage	// class@000e1c
{
    public LiveGzoneTabState$State b;

    public void LiveGzoneLifeStatePage(){
       super();
       this.b = LiveGzoneTabState$State.INIT;
    }
    public void a(){
    }
    public void b(){
    }
    public abstract void e();
    public abstract void f();
    public abstract void g();
    public final boolean h(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneLifeStatePage.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.b.index() == LiveGzoneTabState$State.UNBIND.index())? true: false;
       return b;
    }
    public void i(LiveGzoneTabState$State p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneLifeStatePage.class, "4")) {
          return;
       }
       LiveGzoneLifeStatePage tb = this.b;
       f uof = new f(this);
       if (!PatchProxy.applyVoidThreeRefs(tb, p0, uof, null, LiveGzoneTabState.class, "1")) {
          List list = LiveGzoneTabState.a.get(tb, p0);
          boolean b = (list != null)? true: false;
          n.o(b, "不能从 "+tb+" 跳到 "+p0);
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             uof.a(iterator.next());
          }
       }
       return;
    }
    public abstract void j();
    public void onCreate(){
    }
    public void onDestroy(){
    }
}
