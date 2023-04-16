package gc9.a$d;
import erd.g;
import gc9.a;
import java.lang.Object;
import vf9.g0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import java.lang.Runnable;
import android.view.View;
import gc9.e;
import vf9.f0;
import com.kwai.feature.post.api.music.data.MusicSource;

public final class a$d implements g	// class@00246c
{
    public final a b;

    public void a$d(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d.class, "1")) {
       }else {
          a$d tb = this.b;
          a.o(p0, "musicMode");
          Objects.requireNonNull(tb);
          a uoa = a.class;
          if (!PatchProxy.applyVoidOneRefs(p0, tb, uoa, "8")) {
             int i = 0;
             Object[] objArray = new Object[i];
             a.D().w("RecordAudioController", "onMusicModeChanged, enter:"+p0.a, objArray);
             if (!PatchProxy.applyVoid(null, tb, uoa, "9")) {
                int i1 = CameraLogger.d(tb.d);
                int i2 = 1;
                if (i1) {
                   if (i1 != i2) {
                      if (i1 != 5) {
                         tb.k2(i);
                      }else {
                         Object[] objArray1 = new Object[i];
                         a.D().w("RecordAudioController", "onMusicModeChanged, sidebar is not shown, run after show", objArray1);
                         i1 = tb.r;
                         if (i1 != null) {
                            a o = tb.o;
                            if (o != null) {
                               o.removeCallbacks(i1);
                            }
                         }
                         tb.r = new e(tb, (tb.t ^ i2));
                      }
                   }else {
                      tb.k2(i);
                   }
                }else if(tb.d.d(f0.k).a == MusicSource.MAGIC_FACE){
                   i = true;
                }
                tb.k2(i);
             }
          }
       }
       return;
    }
}
