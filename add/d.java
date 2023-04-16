package add.d;
import java.lang.Object;
import android.text.SpannableStringBuilder;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.CharSequence;
import android.text.style.AbsoluteSizeSpan;

public class d	// class@0000e0
{

    public void d(){
       super();
    }
    public static void a(SpannableStringBuilder p0,String p1,int p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, d.class, "3")) {
          return;
       }
       p0.append(p1);
       p0.setSpan(new AbsoluteSizeSpan(p2, false), p0.length(), p0.length(), 33);
       return;
    }
}
