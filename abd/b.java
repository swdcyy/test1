package abd.b;
import i8d.j0;
import com.yxcorp.plugin.search.result.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import abd.a;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import y8c.q;
import y8c.g;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.GridLayoutManager;
import java.util.List;
import g9c.a;
import java.util.Collection;
import ekd.q;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.yxcorp.plugin.search.entity.kbox.KBoxItem;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import abd.b$a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.x;
import nfd.t0;
import android.view.View;
import joc.y;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.component.feedstaggercard.PhotoItemViewParam;

public class b extends j0	// class@0000bf
{
    public boolean A;
    public final a B;
    public b$a C;
    public GridLayoutManager D;
    public RecyclerView$n E;
    public RecyclerView F;
    public int G;
    public KBoxItem H;
    public BaseFragment x;
    public SearchItem y;
    public PhotoItemViewParam z;

    public void b(a p0){
       super();
       this.G = 2;
       this.B = p0;
    }
    public void E8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "4")) {
          return;
       }
       super.E8();
       if (!PatchProxy.applyVoid(objArray, this, uob, "7") && this.A == null) {
          this.E = new a(this);
          this.A = true;
          uob = this.x;
          if (uob instanceof RecyclerFragment) {
             this.C.o1(uob);
          }
          this.F.addItemDecoration(this.E);
       }
       uob = this.D;
       if (uob != null) {
          uob.setSpanCount(this.G);
       }
       if (q.f(this.C.Q0()) || this.H != this.y.mKBoxItem) {
          SearchItem mKBoxItem = this.y.mKBoxItem;
          this.H = mKBoxItem;
          int i = 18;
          if (mKBoxItem.mKBoxFeeds.size() > i) {
             this.C.W0(this.y.mKBoxItem.mKBoxFeeds.subList(0, i));
          }else {
             this.C.W0(this.y.mKBoxItem.mKBoxFeeds);
          }
       }
       uob = this.x;
       if (uob instanceof RecyclerFragment) {
          this.C.o1(uob);
       }
       this.C.k0();
       return;
    }
    public void F8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "3")) {
          return;
       }
       super.F8();
       this.C = new b$a(this);
       GridLayoutManager gridLayoutMa = new GridLayoutManager(this.getActivity(), 1);
       this.D = gridLayoutMa;
       gridLayoutMa.setOrientation(0);
       this.F.setLayoutManager(this.D);
       this.F.setItemAnimator(objArray);
       this.F.setHasFixedSize(1);
       this.F.setAdapter(this.C);
       x ox = new x();
       x.x(this.F, 6000);
       ox.y(0x3f4ccccd);
       ox.w(((- t0.i) * 2));
       ox.b(this.F);
       y.b(this.F);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       super.H8();
       this.C.Z0();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       super.J8();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.F = m1.f(p0, 0x7f0a06d2);
       return;
    }
    public RecyclerView h0(){
       return this.F;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       super.j8();
       this.x = this.r8("FRAGMENT");
       this.y = this.q8(SearchItem.class);
       this.z = this.r8("FEED_ITEM_VIEW_PARAM");
       return;
    }
}
