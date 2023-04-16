package bg9.a;
import w07.l;
import java.lang.Object;
import u07.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kwai.library.widget.popup.common.c;
import android.widget.TextView;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public class a implements l	// class@000493
{
    public int a;
    public int b;
    public int c;

    public void a(int p0,int p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          p0 = p0.z();
          if (p0 != null) {
             p0 = p0.findViewById(R.id.positive);
             if (p0 != null) {
                p0.setTextColor(a1.a(this.b));
                p0.setBackgroundResource(this.a);
                if (p0.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
                   ViewGroup$MarginLayoutParams layoutParams = p0.getLayoutParams();
                   layoutParams.width = this.c;
                   p0.setLayoutParams(layoutParams);
                }
             }
          }
       }
       return;
    }
}
