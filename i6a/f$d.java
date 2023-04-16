package i6a.f$d;
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

public final class f$d implements SeekBar$OnSeekBarChangeListener	// class@002793
{
    public final f b;

    public void f$d(f p0){
       this.b = p0;
       super();
    }
    public void onProgressChanged(SeekBar p0,int p1,boolean p2){
       if (PatchProxy.isSupport2(f$d.class, "1") && PatchProxy.applyVoidThreeRefsWithListener(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, f$d.class, "1")) {
          return;
       }
       if (p0 != null) {
          f$d tb = this.b;
          int i = tb.Z8(tb.X8(p0.getProgress()));
          f x = this.b.x;
          if (x == null) {
             a.S("secondCardProgressDecreaseText");
          }
          f y = this.b.y;
          if (y == null) {
             a.S("secondCardProgressDefaultText");
          }
          f z = this.b.z;
          if (z == null) {
             a.S("secondCardProgressIncreaseText");
          }
          tb.d9(i, x, y, z);
       }
       PatchProxy.onMethodExit(f$d.class, "1");
       return;
    }
    public void onStartTrackingTouch(SeekBar p0){
    }
    public void onStopTrackingTouch(SeekBar p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, f$d.class, "2")) {
          return;
       }
       if (p0 != null) {
          p0.setProgress(this.b.X8(p0.getProgress()));
          int i = this.b.X8(p0.getProgress());
          p0.setProgress(i);
          f$d tb = this.b;
          tb.a9(f.V8(tb).get(this.b.H), this.b.Z8(i));
          this.b.e9();
       }
       PatchProxy.onMethodExit(f$d.class, "2");
       return;
    }
}
