package a99.j;
import a99.g;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import l17.a;
import m99.f;
import im8.f;
import android.view.View;
import l99.a;
import a99.j$a;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class j extends g	// class@000068
{
    public f N;

    public void j(){
       super();
    }
    public boolean V8(RecyclerView p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (a.a(p0).c() < this.x.s1())? true: false;
       return b;
    }
    public RecyclerView W8(){
       Object obj = PatchProxy.apply(null, this, j.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.N.get();
    }
    public View Y8(){
       Object obj = PatchProxy.apply(null, this, j.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.N.get();
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, j.class, "4")) {
          return;
       }
       if (this.N.get() != null) {
          a.a(this.N.get());
          j$a uoa = new j$a(this, this.N.get().getContext());
          uoa.p((this.x.getItemCount() + 1));
          this.N.get().getLayoutManager().startSmoothScroll(uoa);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       super.j8();
       this.N = this.x8("DETAIL_COMMENT_RECYCLER_VIEW");
       return;
    }
}
