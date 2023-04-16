package ec9.e0;
import ec9.k;
import ec9.e0$a;
import nsd.u;
import ec9.b1;
import ec9.f1;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import sa6.a;
import cc9.k;
import j8c.a;
import q87.c;
import sa6.b;
import cc9.q;
import java.lang.Integer;
import cc9.h;
import cc9.p;
import ac9.j;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import crd.b;
import lnc.b9;
import android.content.Intent;
import java.util.List;
import com.yxcorp.gifshow.camera.record.music.g;
import t16.a;
import com.kuaishou.android.model.music.Music;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.music.g$a;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import com.kwai.feature.post.api.music.data.MusicSource;
import t45.d;
import brd.z;
import ec9.f0;
import ec9.g0;
import erd.g;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public final class e0 extends k	// class@00216f
{
    public final HashMap b;
    public final f1 c;
    public static final e0$a d;

    static {
       e0.d = new e0$a(null);
    }
    public void e0(b1 p0,f1 p1){
       a.p(p0, "provider");
       a.p(p1, "viewModel");
       super(p0);
       this.c = p1;
       this.b = new HashMap();
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, e0.class, "4")) {
          return;
       }
       this.d();
       return;
    }
    public void c(a p0){
       Music music;
       if (PatchProxy.applyVoidOneRefs(p0, this, e0.class, "1")) {
       }else {
          a.p(p0, "action");
          Object[] objArray = new Object[0];
          a.D().s("CameraAssistant", "CheckOrDownloadMusic", objArray);
          b uob = this.a().j();
          h oh = uob.i().get(Integer.valueOf(p0.b()));
          if (oh instanceof p) {
             Activity activity = this.c.u0().getActivity();
             if (activity instanceof GifshowActivity && p0.b() == uob.b()) {
                b uob1 = this.b.get(Integer.valueOf(p0.b()));
                if (uob1 != null) {
                   b9.a(uob1);
                }
                if (oh.c() != null) {
                   if (uob.h()) {
                      this.a().h(q.a(uob, null, 0, 0, null, false, false, false, false, 239, null));
                   }
                }else {
                   g$a e = g.e;
                   String str = "music";
                   a uoa = new a(str, "inner_resource");
                   Activity uActivity = activity;
                   music = oh.b();
                   Objects.requireNonNull(e);
                   t ot = PatchProxy.applyThreeRefs(uoa, uActivity, music, e, g$a.class, "7");
                   if (ot != PatchProxyResult.class) {
                   }else {
                      a.p(uoa, "param");
                      a.p(uActivity, "activity");
                      a.p(music, str);
                      ot = g$a.e(e, uoa, uActivity, music, true, null, 16, 0);
                   }
                   b uob2 = ot.observeOn(d.a).subscribe(new f0(this, p0), new g0(this, p0));
                   a.o(uob2, "disposable");
                   this.b.put(Integer.valueOf(p0.b()), uob2);
                }
             }
          }
       }
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, e0.class, "3")) {
          return;
       }
       Iterator iterator = this.b.entrySet().iterator();
       while (iterator.hasNext()) {
          b9.a(iterator.next().getValue());
       }
       return;
    }
}
