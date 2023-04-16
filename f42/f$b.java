package f42.f$b;
import ekd.f$h;
import java.lang.Object;
import java.lang.String;
import android.text.Spannable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import android.text.SpannableString;
import java.lang.StringBuilder;
import com.yxcorp.utility.TextUtils;
import java.lang.Long;
import java.lang.CharSequence;

public class f$b implements f$h	// class@002865
{
    public String a;

    public void f$b(){
       super();
       this.a = "";
    }
    public void f$b(String p0){
       super();
       this.a = "";
       this.a = p0;
    }
    public Spannable a(float p0){
       f$b uob = f$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       long l = (long)p0;
       long l1 = l / 0x36ee80;
       long l2 = (l / 0xea60) - (l1 * 60);
       Object[] objArray = new Object[]{Long.valueOf(l1),Long.valueOf(l2),Long.valueOf((((l / 1000) - (60 * l2)) - (3600 * l1)))};
       return new SpannableString(this.a+String.format("%02d:%02d:%02d", objArray));
    }
    public Spannable b(float p0){
       f$b uob = f$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, uob, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a(p0);
    }
}
