package djc.h0;
import djc.w;
import djc.f0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.widget.TextView;
import java.lang.CharSequence;
import java.lang.Boolean;

public final class h0 implements w	// class@0021f7
{
    public final f0 b;

    public void h0(f0 p0){
       a.p(p0, "forwardFansBanner");
       super();
       this.b = p0;
    }
    public View da(){
       Object obj = PatchProxy.apply(null, this, h0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return null;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h0.class, "1")) {
          return;
       }
       if (p0 != null) {
          TextView textView = p0.findViewById(R.id.share_title);
          TextView textView1 = p0.findViewById(R.id.share_sub_title);
          if (textView != null) {
             textView.setText(this.b.a);
          }
          if (textView1 != null) {
             textView1.setText(this.b.b);
          }
       }
       return;
    }
    public boolean p9(){
       Object obj = PatchProxy.apply(null, this, h0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return false;
    }
    public int y0(){
       return 0x7f0d0487;
    }
}
