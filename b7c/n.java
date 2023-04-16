package b7c.n;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.RecoUser;
import com.kwai.framework.model.user.User;
import f7c.c;
import a7c.c;
import java.lang.Integer;
import android.view.ViewGroup;
import java.util.Collection;
import ekd.q;
import b7c.a;
import x6c.a;
import a7c.h;
import y8c.g;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import k17.b;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$l;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import y8c.q;
import ija.t;
import java.util.List;
import ok.h;
import com.google.common.collect.Lists;
import g9c.a;
import android.view.View;
import ekd.m1;
import m01.a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public class n extends PresenterV2	// class@0003cf
{
    public CustomRecyclerView p;
    public a q;
    public RecyclerFragment r;
    public List s;
    public RecoUser t;
    public int u;
    public c v;
    public h w;

    public void n(){
       super();
    }
    public void E8(){
       n on = n.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, on, "3")) {
          return;
       }
       int i = c.a(this.v.od(this.t.mUser));
       if (i != -1) {
          this.u = i;
       }
       this.p.setTag(R.id.tag_view_refere, Integer.valueOf(this.u));
       if (q.f(this.s)) {
          this.p.setVisibility(8);
       }else if(PatchProxy.applyVoid(objArray, this, on, "4") || this.q != null){
          this.q = new a(new a(this.w, objArray));
          this.p.setLayoutManager(new LinearLayoutManager(this.getContext(), 0, 0));
          this.p.addItemDecoration(new b(0, a1.d(R.dimen.arg_RES_7f0702ab), a1.d(R.dimen.arg_RES_7f0702ab), a1.d(R.dimen.arg_RES_7f07034b)));
          boolean b = true;
          this.p.setHasFixedSize(b);
          this.p.setItemAnimator(objArray);
          this.p.setNestedScrollingEnabled(0);
          this.p.setDisableScroll(b);
          this.p.setAdapter(this.q);
       }
       this.q.r1(this.t);
       this.p.setVisibility(0);
       this.q.o1(this.r);
       List list = Lists.h(this.s, t.b);
       n tq = this.q;
       if (list.size() > 3) {
          list = list.subList(0, 3);
       }
       tq.W0(list);
       this.q.k0();
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, n.class, "5")) {
          return;
       }
       n tq = this.q;
       if (tq != null) {
          tq.onDestroy();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3049);
       m1.a(p0, a.b, R.id.photo_list_layout);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, n.class, "1")) {
          return;
       }
       this.r = this.r8("FRAGMENT");
       this.s = this.s8(List.class);
       this.t = this.s8(RecoUser.class);
       this.u = this.r8("PAGE_REFERER").intValue();
       this.v = this.r8("PYMK_ACCESS_IDSITEM_CLICK_LISTENER");
       this.w = this.t8("PYMK_ACCESS_IDSPYMK_PARAMS");
       return;
    }
}
