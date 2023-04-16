package com.yxcorp.plugin.search.result.reduce.presenter.a;
import ucd.n;
import java.util.List;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z8c.a;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$l;
import com.yxcorp.plugin.search.result.reduce.presenter.a$a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import g9c.a;
import android.view.View;
import ekd.m1;
import com.yxcorp.plugin.search.utils.f0$c;
import com.kwai.library.widget.popup.common.c;

public class a extends n	// class@00232b
{
    public RecyclerView p;
    public List q;
    public SearchResultFragment r;
    public f0$c s;
    public c t;

    public void a(List p0,SearchResultFragment p1){
       super();
       this.q = p0;
       this.r = p1;
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "3")) {
          return;
       }
       a uoa = new a();
       uoa.p(false);
       uoa.q(false);
       uoa.o(objArray);
       this.p.setLayoutManager(new LinearLayoutManager(this.getContext()));
       this.p.addItemDecoration(uoa);
       this.p.setItemAnimator(objArray);
       a$a uoa1 = new a$a(this);
       this.p.setAdapter(uoa1);
       uoa1.W0(this.q);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0955);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.s = this.q8(f0$c.class);
       this.t = this.r8("SEARCH_REDUCE_POPUP");
       return;
    }
}
