package ho1.l$a;
import ekd.f$h;
import ho1.l$b;
import android.widget.TextView;
import java.lang.Object;
import java.text.DecimalFormat;
import java.lang.String;
import android.text.Spannable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Double;
import com.yxcorp.utility.TextUtils;
import java.math.BigDecimal;
import java.lang.CharSequence;
import ho1.l;

public class l$a implements f$h	// class@00275e
{
    public final DecimalFormat a;
    public final l$b b;
    public final TextView c;
    public final int d;
    public final long e;

    public void l$a(l$b p0,TextView p1,int p2,long p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
       this.a = new DecimalFormat("0");
    }
    public Spannable a(float p0){
       l$a uoa = l$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.b.b((long)p0);
       uoa = this.c;
       String str = new BigDecimal(Double.valueOf(this.a.format((double)p0)).doubleValue()).toPlainString();
       if (str.contains(".")) {
          String str1 = "";
          str = (str.replaceAll("0*$", str1)).replaceAll("\\.$", str1);
       }
       return l.a(uoa, str, this.d);
    }
    public Spannable b(float p0){
       l$a uoa = l$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.b.b(this.e);
       return this.a(p0);
    }
}
