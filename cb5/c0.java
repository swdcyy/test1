package cb5.c0;
import cb5.g;
import android.view.View;
import cb5.c0$a;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.a;
import g9c.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView$i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class c0 extends g	// class@000444
{
    public RecyclerFragment t;
    public boolean u;
    public final RecyclerView$i v;

    public void c0(View p0){
       super(p0);
       this.v = new c0$a(this);
    }
    public void c0(Fragment p0){
       super(p0);
       this.v = new c0$a(this);
    }
    public void c0(Fragment p0,int p1){
       super(p0.getView(), p1);
       this.v = new c0$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c0.class, "2")) {
          return;
       }
       super.E8();
       if (this.u == null) {
          this.u = true;
          this.t.ia().F0(this.v);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c0.class, "3")) {
          return;
       }
       super.J8();
       if (this.u != null) {
          this.u = false;
          this.t.ia().I0(this.v);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c0.class, "1")) {
          return;
       }
       super.j8();
       this.t = this.r8("FRAGMENT");
       return;
    }
}
