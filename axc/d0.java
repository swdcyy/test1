package axc.d0;
import android.text.InputFilter;
import com.yxcorp.gifshow.v3.widget.TextBasePanelFragment;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.Spanned;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;

public final class d0 implements InputFilter	// class@0002e3
{
    public final TextBasePanelFragment a;

    public void d0(TextBasePanelFragment p0){
       this.a = p0;
       super();
    }
    public CharSequence filter(CharSequence p0,int p1,int p2,Spanned p3,int p4,int p5){
       Object obj;
       int i = 0;
       if (PatchProxy.isSupport(d0.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,Integer.valueOf(p4),Integer.valueOf(p5)};
          obj = PatchProxy.apply(objArray, this, d0.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = (p0 != null)? p0.length(): 0;
       if (p3 != null) {
          i = p3.length();
       }
       i = i + obj;
       String str = "";
       if (i > this.a.xh()) {
          this.a.Dh();
          i = i - this.a.xh();
          if (p0 != null) {
             p0 = p0.subSequence(p1, (p0.length() - i));
             if (p0 != null) {
                str = p0;
             }
          }
          return str;
       }else if(p0 != null){
          String str1 = str;
       }
       return p0;
    }
}
