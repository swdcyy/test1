package i6a.f$c;
import android.widget.SeekBar$OnSeekBarChangeListener;
import i6a.f;
import java.lang.Object;
import android.widget.SeekBar;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import java.util.List;
import com.yxcorp.gifshow.detail.model.meta.InterestManagementMeta$InterestEntity;

public final class f$c implements SeekBar$OnSeekBarChangeListener	// class@002792
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
       if (p0 != null) {
          f$c tb = this.b;
          int i = tb.Z8(tb.X8(p0.getProgress()));
          f s = this.b.s;
          if (s == null) {
             a.S("firstCardProgressDecreaseText");
          }
          f t = this.b.t;
          if (t == null) {
             a.S("firstCardProgressDefaultText");
          }
          f u = this.b.u;
          if (u == null) {
             a.S("firstCardProgressIncreaseText");
          }
          tb.d9(i, s, t, u);
       }
       PatchProxy.onMethodExit(f$c.class, "1");
       return;
    }
    public void onStartTrackingTouch(SeekBar p0){
    }
    public void onStopTrackingTouch(SeekBar p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, f$c.class, "2")) {
          return;
       }
       if (p0 != null) {
          int i = this.b.X8(p0.getProgress());
          p0.setProgress(i);
          f$c tb = this.b;
          tb.a9(f.V8(tb).get(this.b.G), this.b.Z8(i));
          this.b.c9();
       }
       PatchProxy.onMethodExit(f$c.class, "2");
       return;
    }
}
