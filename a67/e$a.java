package a67.e$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import a67.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.widget.TextView;
import a67.d;
import android.view.View$OnClickListener;
import android.view.View;
import ekd.m1;
import java.lang.Integer;

public class e$a extends PresenterV2	// class@000055
{
    public TextView p;
    public int q;
    public String r;
    public final e s;

    public void e$a(e p0){
       this.s = p0;
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "3")) {
          return;
       }
       this.p.setText(this.r);
       this.p.setOnClickListener(new d(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a1e57);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "1")) {
          return;
       }
       this.q = this.r8("ADAPTER_POSITION").intValue();
       this.r = this.q8(String.class);
       return;
    }
}
