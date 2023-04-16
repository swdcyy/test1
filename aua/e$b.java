package aua.e$b;
import java.lang.Object;
import aua.e$a;
import android.widget.TextView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class e$b	// class@00030b
{
    public int a;
    public float b;

    public void e$b(){
       super();
    }
    public void e$b(e$a p0){
       super();
    }
    public void a(TextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$b.class, "2")) {
          return;
       }
       if (p0 != null) {
          p0.setTextColor(this.a);
          p0.setTextSize(0, this.b);
       }
       return;
    }
}
