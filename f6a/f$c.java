package f6a.f$c;
import android.widget.SeekBar$OnSeekBarChangeListener;
import f6a.f;
import java.lang.Object;
import android.widget.SeekBar;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Long;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class f$c implements SeekBar$OnSeekBarChangeListener	// class@0022cd
{
    public final f b;

    public void f$c(f p0){
       this.b = p0;
       super();
    }
    public void onProgressChanged(SeekBar p0,int p1,boolean p2){
       if (PatchProxy.isSupport2(f$c.class, "1") && PatchProxy.applyVoidThreeRefsWithListener(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, f$c.class, "1")) {
          return;
       }
       a.p(p0, "seekBar");
       if (!p2 || !this.b.e9()) {
          PatchProxy.onMethodExit(f$c.class, "1");
          return;
       }else {
          f$c tb = this.b;
          tb.h9((((long)p1 * tb.a9()) / (long)p0.getMax()));
          PatchProxy.onMethodExit(f$c.class, "1");
          return;
       }
    }
    public void onStartTrackingTouch(SeekBar p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, f$c.class, "2")) {
          return;
       }
       if (!this.b.e9()) {
          PatchProxy.onMethodExit(f$c.class, "2");
          return;
       }else {
          f$c tb = this.b;
          tb.z = tb.V8();
          PatchProxy.onMethodExit(f$c.class, "2");
          return;
       }
    }
    public void onStopTrackingTouch(SeekBar p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, f$c.class, "3")) {
          return;
       }
       if (!this.b.e9()) {
          PatchProxy.onMethodExit(f$c.class, "3");
          return;
       }else {
          f$c tb = this.b;
          tb.A = tb.V8();
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidWithListener(null, tb, f.class, "16")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "PROGRESS_BUTTON";
             i3 oi3 = i3.f();
             oi3.d("progress_type", "VERTICAL_FULL_SCREE");
             oi3.c("time_start", Long.valueOf(tb.z));
             oi3.c("time_end", Long.valueOf(tb.A));
             uElementPack.params = oi3.toString();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             f p = tb.p;
             if (p == null) {
                a.S("mPhoto");
             }
             uContentPack.photoPackage = w1.f(p.mEntity);
             f q = tb.q;
             if (q == null) {
                a.S("mPanoramaDetailFragment");
             }
             u1.M("", q, 1, uElementPack, uContentPack, null);
             PatchProxy.onMethodExit(f.class, "16");
          }
          PatchProxy.onMethodExit(f$c.class, "3");
          return;
       }
    }
}
