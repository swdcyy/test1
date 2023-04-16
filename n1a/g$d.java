package n1a.g$d;
import android.widget.TextView$OnEditorActionListener;
import n1a.g;
import java.lang.Object;
import android.widget.TextView;
import android.view.KeyEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.widget.EditText;
import android.text.Editable;
import com.yxcorp.utility.TextUtils;

public class g$d implements TextView$OnEditorActionListener	// class@0030bb
{
    public final g a;

    public void g$d(g p0){
       this.a = p0;
       super();
    }
    public boolean onEditorAction(TextView p0,int p1,KeyEvent p2){
       if (PatchProxy.isSupport(g$d.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, g$d.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       if (p1 == 6 && this.a.s.isEnabled()) {
          g$d ta = this.a;
          if (ta.P8(TextUtils.G(ta.r).toString())) {
             this.a.s.callOnClick();
          }
       }
       return true;
    }
}
