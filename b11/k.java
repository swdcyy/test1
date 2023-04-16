package b11.k;
import java.lang.Object;
import android.text.SpannableStringBuilder;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;

public class k	// class@000305
{
    public final SpannableStringBuilder a;

    public void k(){
       super();
       this.a = new SpannableStringBuilder();
    }
    public k a(String p0,int p1){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, ok, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (TextUtils.isEmpty(p0)) {
          return this;
       }else {
          this.a.append(p0);
          this.a.setSpan(new ForegroundColorSpan(p1), this.a.length(), this.a.length(), 33);
          return this;
       }
    }
}
