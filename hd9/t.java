package hd9.t;
import erd.g;
import com.yxcorp.gifshow.camera.record.followshoot.d;
import java.lang.Object;
import ed9.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;
import oc9.d0;
import com.yxcorp.gifshow.camera.record.base.d;
import com.kwai.video.player.MediaInfo;
import com.yxcorp.gifshow.camera.record.followshoot.f;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import oc9.w;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.followshoot.e;
import com.yxcorp.gifshow.camera.record.followshoot.f$f;

public final class t implements g	// class@00262b
{
    public final d b;

    public void t(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       t tb = this.b;
       Objects.requireNonNull(tb);
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, uod, "20")) {
       }else {
          int i = 0;
          Object[] objArray = new Object[i];
          a.D().A("UseSampleController", "handleCountDownFinishEvent", objArray);
          if (tb.f2()) {
             if (!tb.a2() && (tb.w != null && tb.f2())) {
                tb.E2(0);
                tb.y2();
             }
          label_0040 :
             if (!PatchProxy.applyVoid(null, tb, uod, "23")) {
                Object[] objArray1 = new Object[i];
                a.D().A("UseSampleController", "observeAudioDataToStartCapture", objArray1);
                if (tb.w != null) {
                   if (TextUtils.x(tb.w.getMediaInfo().mAudioDecoderImpl)) {
                      objArray1 = new Object[i];
                      a.D().A("UseSampleController", "startCapture", objArray1);
                      tb.d.b().y();
                   }else {
                      tb.B = true;
                      tb.w.a(new e(tb));
                   }
                   tb.z2();
                }
             }
          }
       }
       return;
    }
}
