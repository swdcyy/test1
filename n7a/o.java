package n7a.o;
import n7a.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$o;
import n7a.j;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import n7a.k;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import android.view.View;
import ekd.m1;
import com.kwai.component.photo.detail.slide.widget.SlideLongAtlasRecyclerView;
import io.reactivex.subjects.PublishSubject;

public class o extends a	// class@003102
{
    public String A;
    public RecyclerView$r B;
    public RecyclerView$o C;
    public PublishSubject v;
    public PublishSubject w;
    public SlideLongAtlasRecyclerView x;
    public boolean y;
    public int z;

    public void o(){
       super();
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, o.class, "4")) {
          return;
       }
       super.J8();
       this.u = null;
       o tx = this.x;
       if (tx != null) {
          o tB = this.B;
          if (tB != null) {
             tx.removeOnScrollListener(tB);
          }
          tx = this.C;
          if (tx != null) {
             this.x.removeOnChildAttachStateChangeListener(tx);
          }
       }
       this.B = null;
       this.x = null;
       this.C = null;
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, o.class, "3")) {
          return;
       }
       if (this.v == null) {
          return;
       }
       o tw = this.w;
       if (tw != null) {
          this.X7(tw.subscribe(new j(this)));
       }
       this.X7(this.v.subscribe(new k(this)));
       return;
    }
    public final ViewGroup S8(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, o.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getActivity() == null) {
          return objArray;
       }
       return this.getActivity().findViewById(0x1020002);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
          return;
       }
       this.x = m1.f(p0, 0x7f0a2999);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o.class, "2")) {
          return;
       }
       super.j8();
       this.v = this.t8("FEATURED_LONG_ATLAS_OPEN");
       this.w = this.t8("SLIDE_PLAY_ATLAS_RV_ID");
       return;
    }
}
