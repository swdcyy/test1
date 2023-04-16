package h83.c;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.LiveData;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.view.View;
import ec3.d;
import com.kuaishou.live.common.multiinteract.view.LiveInteractWidgetContainer;
import h83.c$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import h83.c$b;
import h83.c$c;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatLayoutConfig;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatWindow;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatCanvasSize;
import com.kuaishou.live.common.multiinteract.view.LiveInteractWidgetContainer$a;

public final class c extends ViewController	// class@002cf8
{
    public final HashMap j;
    public final HashMap k;
    public LiveInteractWidgetContainer l;
    public final LiveData m;
    public final LiveData n;
    public final LiveData o;
    public final String p;

    public void c(LiveData p0,LiveData p1,LiveData p2,String p3){
       a.p(p0, "participantInfoList");
       a.p(p1, "muteStatusList");
       a.p(p2, "layoutConfig");
       super();
       this.m = p0;
       this.n = p1;
       this.o = p2;
       this.p = p3;
       this.j = new HashMap();
       this.k = new HashMap();
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.R2(d.b(this.D2(), R.layout.live_lite_multi_line_container_layout));
       this.l = this.A2(0x7f0a1982);
       this.m.observe(this, new c$a(this));
       this.n.observe(this, new c$b(this));
       this.o.observe(this, new c$c(this));
       return;
    }
    public final int V2(InteractiveChatLayoutConfig p0){
       InteractiveChatLayoutConfig obj = PatchProxy.applyOneRefs(p0, this, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = p0.windowInfo;
       a.o(obj, "layoutConfig.windowInfo");
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return 1;
          }
          float f = (float)obj[i].width / (float)p0.canvasSize.width;
          if (f - 0x3f000000 < 0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return 2;
    }
    public final void W2(String p0,LiveInteractWidgetContainer$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "10")) {
          return;
       }
       c tl = this.l;
       if (tl == null) {
          a.S("widgetContainer");
       }
       tl.a(p0, p1);
       return;
    }
}
