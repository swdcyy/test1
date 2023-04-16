package hb1.c;
import android.widget.TextView$OnEditorActionListener;
import com.kuaishou.live.common.core.component.admin.sensitivewords.SensitiveWordInputLayout;
import java.lang.Object;
import android.widget.TextView;
import android.view.KeyEvent;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class c implements TextView$OnEditorActionListener	// class@002665
{
    public final SensitiveWordInputLayout a;

    public void c(SensitiveWordInputLayout p0){
       this.a = p0;
    }
    public final boolean onEditorAction(TextView p0,int p1,KeyEvent p2){
       boolean b;
       c ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.isSupport(SensitiveWordInputLayout.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, ta, SensitiveWordInputLayout.class, "8");
          if (p0 != PatchProxyResult.class) {
             b = p0.booleanValue();
          label_0030 :
             return b;
          }
       }
       if (6 == p1) {
          ta.b();
       }
       b = false;
       goto label_0030 ;
    }
}
