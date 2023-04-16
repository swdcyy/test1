package bi4.b;
import xh4.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bi4.c;
import bi4.a;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import ok0.n;
import rk0.b;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import java.lang.Boolean;
import com.kwai.feature.component.entry.view.SearchSwitcherEntryView;

public class b extends c	// class@000382
{
    public c C;

    public void b(Fragment p0){
       super(p0);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       super.E8();
       this.J0(this.C.b, new a(this));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       super.F8();
       this.C = ViewModelProviders.of(this.R8()).get(c.class);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       super.H8();
       this.C = null;
       return;
    }
    public void V8(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "2")) {
          return;
       }
       if (p0) {
          c tu = this.u;
          if (tu != null && !PatchProxy.applyVoidOneRefs(tu, this, c.class, "12")) {
             tu = this.v;
             if (tu != null) {
                tu.g("DETAIL_SEARCH_BAR");
             }
          }
       }
       return;
    }
}
