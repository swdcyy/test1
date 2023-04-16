package f42.f$a;
import ekd.f$h;
import java.lang.Object;
import java.lang.String;
import android.text.Spannable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import android.text.SpannableString;
import d61.f0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class f$a implements f$h	// class@002864
{
    public String a;

    public void f$a(){
       super();
    }
    public void f$a(String p0){
       super();
       this.a = p0;
    }
    public Spannable a(float p0){
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new SpannableString(f0.k((long)p0));
    }
    public Spannable b(float p0){
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Spannable spannable = (TextUtils.x(this.a))? this.a(p0): new SpannableString(this.a);
       return spannable;
    }
}
