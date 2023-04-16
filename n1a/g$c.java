package n1a.g$c;
import tyc.u4;
import n1a.g;
import java.lang.CharSequence;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.widget.TextView;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import android.widget.EditText;

public class g$c extends u4	// class@0030ba
{
    public final g b;

    public void g$c(g p0){
       this.b = p0;
       super();
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(g$c.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, g$c.class, "1")) {
          return;
       }
       String str = p0.toString();
       g$c tb = this.b;
       tb.s.setEnabled(tb.P8(str));
       if (TextUtils.t(str) > 30) {
          tb = 1;
          while (tb <= p3) {
             int i = p1 + p3;
             int i1 = i - tb;
             String str1 = str.substring(0, i1)+str.substring(i);
             if (TextUtils.t(str1) <= 30) {
                this.b.r.setText(str1);
                this.b.r.setSelection(i1);
                break ;
             }
             tb++;
          }
       }
       return;
    }
}
