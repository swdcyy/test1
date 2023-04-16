package abc.a$b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import abc.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import android.view.View;
import ekd.m1;
import java.lang.Integer;

public class a$b extends PresenterV2	// class@0000c3
{
    public int p;
    public TextView q;

    public void a$b(){
       super();
    }
    public void a$b(a$a p0){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "3")) {
          return;
       }
       this.q.setText(this.p);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a3f23);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "1")) {
          return;
       }
       this.p = this.q8(Integer.class).intValue();
       return;
    }
}
