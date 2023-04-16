package mj9.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import jj9.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import xl8.b;
import java.util.List;
import hlb.d;
import mj9.a;
import mj9.c;
import mj9.a$a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.ViewGroup$MarginLayoutParams;
import com.kwai.component.feedstaggercard.model.CardStyle;
import lnc.a1;
import g9c.a;
import android.view.View;
import ekd.m1;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import tj9.a;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kwai.component.homepage_interface.homeitemfragment.a;
import oj9.e;

public class d extends PresenterV2	// class@003041
{
    public RecyclerView p;
    public a q;
    public CardStyle r;
    public b s;
    public a t;
    public e u;
    public List v;

    public void d(){
       super();
       this.U7(new b());
    }
    public void E8(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uod, "5") && !q.f(this.v)) {
          int i = 0;
          if (this.s.a() == null) {
             this.s.d(this.v.get(i));
          }
          if (this.q == null) {
             a uoa = new a(this.s, new c(this));
             this.q = uoa;
             this.p.setAdapter(uoa);
          }
          ViewGroup$MarginLayoutParams layoutParams = this.p.getLayoutParams();
          float f = (this.r.isCornerCard != null)? 48.00f: 52.00f;
          layoutParams.height = a1.e(f);
          this.p.setLayoutParams(layoutParams);
          this.p.setVisibility(i);
          this.q.W0(this.v);
          this.q.k0();
       }
       return;
    }
    public void doBindView(View p0){
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uod, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3bcf);
       if (!PatchProxy.applyVoid(null, this, uod, "3")) {
          this.p.setLayoutManager(new LinearLayoutManager(this.getContext(), 0, 0));
          a uoa = new a(0, a1.e(8.00f), 0, 0, a1.e(19.00f), a1.e(19.00f));
          this.p.addItemDecoration(v7);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.s = this.r8("HOT_CHANNEL_COLUMN_CURRENT_TAG");
       this.t = this.r8("HOT_CHANNEL_COLUMN_REFRESH_CONTROLLER");
       this.u = this.r8("HOT_CHANNEL_COLUMN_PAGE_LIST");
       this.v = this.r8("HOT_CHANNEL_SUBNTAGS");
       this.r = this.r8("HOT_CHANNEL_CARD_STYLE");
       return;
    }
}
