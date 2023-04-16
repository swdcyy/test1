package com.yxcorp.gifshow.music.cloudmusic.common.category.CategoryOptPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.music.cloudmusic.common.c$a;
import java.util.Collection;
import ekd.q;
import android.view.ViewGroup;
import com.yxcorp.gifshow.music.cloudmusic.common.category.CategoryOptPresenter$b;
import qob.c;
import com.yxcorp.gifshow.music.cloudmusic.common.category.CategoryOptPresenter$c;
import com.yxcorp.gifshow.music.cloudmusic.common.category.CategoryOptPresenter$1;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.music.cloudmusic.common.category.CategoryOptPresenter$a;
import androidx.recyclerview.widget.RecyclerView$n;
import java.util.Objects;
import java.util.List;
import com.yxcorp.gifshow.music.cloudmusic.common.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import jqb.k;
import android.view.View;
import jqb.c;
import android.view.ViewStub;
import qvb.i;
import kob.n;

public class CategoryOptPresenter extends PresenterV2	// class@00200b
{
    public RecyclerView p;
    public CategoryOptPresenter$b q;
    public c$a r;
    public BaseFragment s;
    public i t;
    public n u;

    public void CategoryOptPresenter(){
       super();
    }
    public void E8(){
       CategoryOptPresenter uCategoryOpt = CategoryOptPresenter.class;
       if (PatchProxy.applyVoid(null, this, uCategoryOpt, "4")) {
          return;
       }
       if (q.f(this.r.e)) {
          this.p.setVisibility(8);
          return;
       }else {
          this.p.setVisibility(0);
          if (this.q == null) {
             this.q = new CategoryOptPresenter$b(new c(this));
             this.p.setVisibility(0);
             this.p.setLayoutManager(new CategoryOptPresenter$1(this, this.getContext(), 3));
             this.p.setAdapter(this.q);
             this.p.setOverScrollMode(2);
             this.p.addItemDecoration(new CategoryOptPresenter$a(this));
          }
          CategoryOptPresenter tq = this.q;
          c$a e = this.r.e;
          Objects.requireNonNull(tq);
          if (!PatchProxy.applyVoidOneRefs(e, tq, CategoryOptPresenter$b.class, "1")) {
             tq.e.clear();
             tq.e.addAll(e);
          }
          this.q.k0();
          c$a e1 = this.r.e;
          if (!PatchProxy.applyVoidOneRefs(e1, this, uCategoryOpt, "5") && (this.t instanceof c && (this.r.b == null && !q.f(e1)))) {
             k.l(e1, 0, this.s);
          }
       label_00a6 :
          this.r.b = true;
          return;
       }
    }
    public void doBindView(View p0){
       CategoryOptPresenter uCategoryOpt = CategoryOptPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uCategoryOpt, "2")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, uCategoryOpt, "3")) {
          int i = (c.b)? 0x7f0a067e: 0x7f0a067b;
          ViewStub viewStub = p0.findViewById(i);
          if (viewStub != null) {
             viewStub.setLayoutResource(R.layout.arg_RES_7f0d0ff5);
             viewStub.inflate();
          }
       }
       this.p = p0.findViewById(0x7f0a2ca1);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, CategoryOptPresenter.class, "1")) {
          return;
       }
       this.r = this.q8(c$a.class);
       this.s = this.r8("FRAGMENT");
       this.t = this.r8("CLOUD_MUSIC_PAGE_LIST");
       this.u = this.r8("CLOUD_MUSIC_INTENT_FETCHER");
       return;
    }
}
