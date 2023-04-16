package ec9.w;
import ec9.k;
import ec9.w$a;
import nsd.u;
import ec9.b1;
import ec9.f1;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import u80.j;
import sa6.a;
import cc9.k;
import j8c.a;
import q87.c;
import sa6.b;
import cc9.q;
import java.lang.Integer;
import cc9.h;
import cc9.j;
import u80.d;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.util.Map;
import java.util.List;
import crd.b;
import lnc.b9;
import kotlin.Pair;
import brd.t;
import brd.w;
import t45.d;
import brd.z;
import ec9.x;
import ec9.y;
import erd.g;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public final class w extends k	// class@0021a0
{
    public final HashMap b;
    public final f1 c;
    public static final w$a d;

    static {
       w.d = new w$a(null);
    }
    public void w(b1 p0,f1 p1){
       a.p(p0, "provider");
       a.p(p1, "viewModel");
       super(p0);
       this.c = p1;
       this.b = new HashMap();
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, w.class, "4")) {
          return;
       }
       this.d();
       d.a(-215111236).g40("CameraAssistant");
       return;
    }
    public void c(a p0){
       Object[] objArray1;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, w.class, "1")) {
       }else {
          a.p(obj1, "action");
          int i = 0;
          Object[] objArray = new Object[i];
          String str = "CameraAssistant";
          a.D().s(str, "CheckOrDownloadKSActionDelegate", objArray);
          b uob = this.a().j();
          if (obj1.b() != uob.b()) {
             objArray1 = new Object[i];
             a.D().A(str, "CheckOrDownloadKSActionDelegate, action.index != listState.currentSelectPosition", objArray1);
          }else {
             h oh = uob.i().get(Integer.valueOf(obj1.b()));
             if (!oh instanceof j) {
                objArray1 = new Object[i];
                a.D().A(str, "DownloadKSActionDelegate state error", objArray1);
             }else {
                h oh1 = oh;
                if (oh1.d() != null) {
                   uob.i().put(Integer.valueOf(obj1.b()), j.a(oh1, null, 0, false, null, 15, null));
                   this.a().h(q.a(uob, null, 0, null, null, false, true, false, false, 207, null));
                }else {
                   KSTemplateDetailInfo mTemplateId = oh1.b().mTemplateId;
                   b9.a(obj.b.get(Integer.valueOf(obj1.b())));
                   b uob1 = t.concat(t.just(new Pair(Integer.valueOf(i), null)), d.a(-215111236).gt(str, mTemplateId)).observeOn(d.a).subscribe(new x(obj, mTemplateId, obj1), new y(obj, mTemplateId, obj1));
                   a.o(uob1, "disposable");
                   obj.b.put(Integer.valueOf(obj1.b()), uob1);
                }
             }
          }
       }
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, w.class, "3")) {
          return;
       }
       Iterator iterator = this.b.entrySet().iterator();
       while (iterator.hasNext()) {
          b9.a(iterator.next().getValue());
       }
       return;
    }
}
