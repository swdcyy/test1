package com.yxcorp.gifshow.relation.explore.search.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.relation.explore.search.d$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.q;
import qvb.a;
import android.widget.EditText;
import android.content.Context;
import android.view.View;
import com.yxcorp.utility.n;
import jac.d;
import android.view.View$OnFocusChangeListener;
import com.yxcorp.gifshow.relation.explore.search.a;
import android.app.Activity;
import ekd.m1;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.library.widget.refresh.RefreshLayout;
import lnc.a1;
import ekd.p1;
import jac.c;
import android.view.View$OnClickListener;
import jac.a;
import jac.b;
import com.yxcorp.gifshow.relation.explore.search.d$a;
import android.text.TextWatcher;
import jac.e;
import android.widget.TextView$OnEditorActionListener;
import com.yxcorp.gifshow.relation.explore.search.ExploreSearchFragment;
import com.yxcorp.gifshow.relation.explore.search.c;
import y8c.t;
import jac.f;
import y8c.g;

public class d extends PresenterV2	// class@001879
{
    public c p;
    public f q;
    public g r;
    public ExploreSearchFragment s;
    public boolean t;
    public EditText u;
    public View v;
    public RecyclerView w;
    public RefreshLayout x;
    public final q y;

    public void d(){
       super();
       this.y = new d$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       this.p.h(this.y);
       this.u.requestFocus();
       n.b0(this.getContext(), this.u, true);
       this.u.setOnFocusChangeListener(new d(this));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, d.class, "6")) {
          return;
       }
       a.a = null;
       a.b = null;
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       this.p.f(this.y);
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, d.class, "7")) {
          return;
       }
       if (this.getActivity() != null) {
          this.getActivity().finish();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.w = m1.f(p0, 0x7f0a34da);
       this.u = m1.f(p0, 0x7f0a0e9c);
       this.x = m1.f(p0, 0x7f0a3537);
       this.v = m1.f(p0, 0x7f0a073b);
       p1.c(this.v, a1.e(10.00f), a1.e(10.00f), a1.e(10.00f), a1.e(10.00f));
       m1.a(p0, new c(this), R.id.clear_button);
       m1.a(p0, new a(this), R.id.cancel_search);
       m1.a(p0, new b(this), R.id.search_layout);
       m1.e(p0, new d$a(this), R.id.find);
       this.u.setOnEditorActionListener(new e(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.s = this.r8("FRAGMENT");
       this.p = this.r8("PAGE_LIST");
       this.q = this.q8(t.class);
       this.r = this.r8("ADAPTER");
       return;
    }
}
