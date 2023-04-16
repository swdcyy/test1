package f6a.f$e;
import java.lang.Runnable;
import f6a.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.widget.TextView;
import android.widget.SeekBar;
import android.widget.ImageView;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.paycourse.TrialPlayInfo;
import vca.i;

public final class f$e implements Runnable	// class@0022cf
{
    public final f b;

    public void f$e(f p0){
       this.b = p0;
       super();
    }
    public final void run(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, f$e.class, "1")) {
          return;
       }
       long l = this.b.a9();
       long l1 = this.b.V8();
       f v = this.b.v;
       if (v == null) {
          a.S("mTotalDurationView");
       }
       v.setText(this.b.S8(l));
       v = this.b.w;
       if (v == null) {
          a.S("mCurrentDurationView");
       }
       v.setText(this.b.S8(l1));
       f.P8(this.b).setProgress((int)(((float)l1 / (float)l) * (float)f.P8(this.b).getMax()));
       v = this.b.s;
       if (v == null) {
          a.S("mDirectionForeground");
       }
       v.setRotation(this.b.Z8());
       f$e tb = this.b;
       Objects.requireNonNull(tb);
       f obj = PatchProxy.applyWithListener(objArray, tb, f.class, "6");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = tb.p;
          if (obj == null) {
             a.S("mPhoto");
          }
          b = (i.a(obj.getEntity()) != null && tb.V8() - 0xea60 >= 0)? true: false;
          PatchProxy.onMethodExit(f.class, "6");
       }
       if (b) {
          tb = this.b;
          tb.R8(tb.E);
       }
       PatchProxy.onMethodExit(f$e.class, "1");
       return;
    }
}
