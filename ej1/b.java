package ej1.b;
import android.text.InputFilter;
import cj1.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import kotlin.text.Regex;
import java.lang.CharSequence;
import android.text.Spanned;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.TextUtils;

public final class b implements InputFilter	// class@002174
{
    public final Regex a;
    public final b b;

    public void b(b p0){
       a.p(p0, "diyInputInfo");
       super();
       this.b = p0;
       p0 = p0.c;
       Regex regex = (p0 != null)? new Regex(p0): null;
       this.a = regex;
       return;
    }
    public CharSequence filter(CharSequence p0,int p1,int p2,Spanned p3,int p4,int p5){
       String obj;
       String str;
       if (PatchProxy.isSupport(b.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,Integer.valueOf(p4),Integer.valueOf(p5)};
          obj = PatchProxy.apply(objArray, this, b.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = "";
       if (p0 != null) {
          str = p0.toString();
          if (str != null) {
          label_0048 :
             p2 = (p3 != null)? p3.length(): 0;
             if (p2 >= this.b.d()) {
                return obj;
             }else if((str.length() + p2) > this.b.d()){
                str = str.substring(0, (this.b.d() - p2));
                a.o(str, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
             }
             b ta = this.a;
             if (ta == null || (ta.matches(str) == true || TextUtils.x(str))) {
                obj = str;
             }
             return obj;
          }
       }
       str = obj;
       goto label_0048 ;
    }
}
