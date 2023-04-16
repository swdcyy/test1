package nx1.q;
import android.app.Activity;
import o63.a;
import lx1.c;
import java.lang.Object;
import java.util.LinkedList;
import java.util.ArrayList;
import com.kuaishou.livestream.message.nano.LiveInteractiveWidgetProto$LiveInteractiveWidget;
import nx1.j;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cxd.b;
import nx1.g;
import java.lang.System;
import rx4.b;
import android.view.ViewGroup;
import com.kuaishou.live.basic.tk.LiveTkBridge;
import com.kuaishou.commercial.q;
import msd.a;
import tx4.l;
import rx4.a;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import nx1.f;
import sx4.e$a;
import brd.t;
import nx1.p;
import nx1.o;
import erd.g;
import crd.b;
import java.util.List;
import java.lang.StringBuilder;

public class q	// class@00341a
{
    public final List a;
    public final List b;
    public final List c;
    public final Activity d;
    public final a e;
    public final c f;

    public void q(Activity p0,a p1,c p2){
       super();
       this.a = new LinkedList();
       this.b = new LinkedList();
       this.c = new ArrayList();
       this.d = p0;
       this.e = p1;
       this.f = p2;
    }
    public final j a(LiveInteractiveWidgetProto$LiveInteractiveWidget p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j obj = PatchProxy.applyOneRefs(p0, this, q.class, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new j(p0.bundleId, p0.viewKey, p0.dataP, this.e);
       q td = this.d;
       j oj = j.class;
       g og = PatchProxy.applyTwoRefs(td, null, obj, oj, "1");
       if (og != patchProxyRe) {
       }else if(td == null){
          og = g.b;
       }else {
          obj.h = System.currentTimeMillis();
          if (!PatchProxy.applyVoidOneRefs(td, obj, oj, "3")) {
             if (obj.e != null) {
                obj.b();
             }
             a uoa = new b(td, null, obj.a, "Live").c(new LiveTkBridge(obj.d, q.b, q.b)).b();
             uoa.A();
             b.Z(LiveLogTag.LIVE_SCENE_ACTIVITY_WIDGET, "start load");
             obj.e = uoa;
          }
          og = new f(obj, null);
       }
       obj.f = t.fromPublisher(og).subscribe(new p(this, obj, p0), new o(this, obj, p0));
       return obj;
    }
    public List b(){
       return this.c;
    }
    public final String c(LiveInteractiveWidgetProto$LiveInteractiveWidget p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, q.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.bundleId+"_"+p0.viewKey;
    }
}
