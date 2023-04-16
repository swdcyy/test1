package bc9.b0$b;
import cc9.i;
import bc9.b0;
import java.lang.Object;
import cc9.q;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import cc9.h;
import cc9.p;
import com.yxcorp.gifshow.camera.record.assistant.a;
import ec9.j;
import cc9.d;
import sa6.a;
import android.content.Intent;
import com.yxcorp.gifshow.camera.record.base.d;
import vf9.f0;
import com.yxcorp.gifshow.camera.record.base.b;
import com.kwai.feature.post.api.music.data.MusicSource;
import java.util.Objects;
import j8c.a;
import q87.c;
import dc9.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import vf9.s;

public final class b0$b implements i	// class@0003d9
{
    public final b0 a;

    public void b0$b(b0 p0){
       this.a = p0;
       super();
    }
    public void a(Object p0){
       f0 j;
       if (PatchProxy.applyVoidOneRefs(p0, this, b0$b.class, "1")) {
       }else {
          a.p(p0, "newState");
          this.a.t = p0;
          p0 = p0.c();
          if (!a.g(this.a.o, p0)) {
             if (p0 instanceof p) {
                b0$b ta = this.a;
                boolean b = false;
                boolean b1 = true;
                if (ta.o == null) {
                   ta.g2().g().w0(new d(6, b));
                   this.a.g2().g().w0(new d(7, b1));
                   this.a.g2().g().w0(new d(9, b1));
                   if (this.a.g2().n() == null) {
                      Intent obj = this.a.d.d(f0.k);
                      a.o(obj, "mCallerContext.getData\(MusicData.sDefaultValue\)");
                      a uoa = this.a.g2();
                      obj = (obj.a == MusicSource.MAGIC_FACE)? null: obj.j;
                      uoa.K(obj);
                   }
                }
                ta = this.a;
                Objects.requireNonNull(ta);
                if (!PatchProxy.applyVoidOneRefs(p0, ta, b0.class, "5")) {
                   a.p(p0, "newMagicItemState");
                   ta.o = p0;
                   Object[] objArray = new Object[b];
                   String str = "CameraAssistant";
                   a.D().w(str, "onMusicItemSelected", objArray);
                   if (p0.c() != null && (a.g(p0.c(), ta.p) ^ b1)) {
                      Object[] objArray1 = new Object[b];
                      a.D().w(str, "play music", objArray1);
                      d d = ta.d;
                      a.o(d, "mCallerContext");
                      BaseFragment uBaseFragmen = d.f();
                      a.o(uBaseFragmen, "mCallerContext.fragment");
                      ta.u.h().h(uBaseFragmen, ta.u.m());
                      Intent intent = p0.c();
                      ta.p = intent;
                      s os = new s(intent, true, true, true, true);
                      ta.d.m(ta);
                   }
                }
             }else {
                p0 = this.a;
                if (p0.o != null) {
                   p0.h2();
                }
             }
          }
       }
       return;
    }
}
