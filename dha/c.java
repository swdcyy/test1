package dha.c;
import vga.b;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.Object;
import xl8.b;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.refresh.RefreshLayout$h;
import com.kwai.library.widget.refresh.RefreshLayout;

public final class c implements b	// class@0024a2
{
    public final BaseFragment a;
    public final b b;
    public final PublishSubject c;
    public RefreshLayout d;
    public RefreshLayout$h e;
    public boolean f;

    public void c(RecyclerFragment p0){
       super();
       this.f = true;
       this.a = p0;
       this.b = new b(Boolean.FALSE);
       this.c = PublishSubject.g();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       c te = this.e;
       if (te != null) {
          c td = this.d;
          if (td != null) {
             td.E(te);
          }else {
             te = this.a;
             if (te instanceof RecyclerFragment) {
                te.Ac().E(this.e);
             }
          }
          this.e = null;
       }
       return;
    }
}
