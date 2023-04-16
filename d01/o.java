package d01.o;
import ml8.d;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;

public class o implements d	// class@001ee2
{
    public int b;
    public View c;

    public void o(int p0){
       super();
       this.b = p0;
    }
    public View a(){
       return this.c;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
          return;
       }
       this.c = m1.f(p0, this.b);
       return;
    }
}
