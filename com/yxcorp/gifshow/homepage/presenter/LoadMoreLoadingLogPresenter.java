package com.yxcorp.gifshow.homepage.presenter.LoadMoreLoadingLogPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.LazyThreadSafetyMode;
import com.yxcorp.gifshow.homepage.presenter.LoadMoreLoadingLogPresenter$mScrollListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.homepage.presenter.LoadMoreLoadingLogPresenter$mLoadingObserver$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.homepage.presenter.LoadMoreLoadingLogPresenter$b;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.homepage.presenter.LoadMoreLoadingLogPresenter$a;
import qvb.q;
import qvb.a;
import com.kwai.robust.PatchProxyResult;
import qvb.n0;

public final class LoadMoreLoadingLogPresenter extends PresenterV2	// class@001798
{
    public RecyclerFragment p;
    public n0 q;
    public final p r;
    public final p s;
    public boolean t;
    public long u;

    public void LoadMoreLoadingLogPresenter(){
       super();
       LazyThreadSafetyMode nONE = LazyThreadSafetyMode.NONE;
       this.r = s.b(nONE, new LoadMoreLoadingLogPresenter$mScrollListener$2(this));
       this.s = s.b(nONE, new LoadMoreLoadingLogPresenter$mLoadingObserver$2(this));
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, LoadMoreLoadingLogPresenter.class, "8")) {
          return;
       }
       LoadMoreLoadingLogPresenter tp = this.p;
       if (tp == null) {
          a.S("mFragment");
       }
       tp.h0().addOnScrollListener(this.S8());
       tp = this.q;
       if (tp == null) {
          a.S("mPageList");
       }
       tp.h(this.R8());
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LoadMoreLoadingLogPresenter.class, "9")) {
          return;
       }
       LoadMoreLoadingLogPresenter tp = this.p;
       if (tp == null) {
          a.S("mFragment");
       }
       tp.h0().removeOnScrollListener(this.S8());
       tp = this.q;
       if (tp == null) {
          a.S("mPageList");
       }
       tp.f(this.R8());
       return;
    }
    public final RecyclerFragment P8(){
       LoadMoreLoadingLogPresenter obj = PatchProxy.apply(null, this, LoadMoreLoadingLogPresenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj == null) {
          a.S("mFragment");
       }
       return obj;
    }
    public final LoadMoreLoadingLogPresenter$a R8(){
       Object obj = PatchProxy.apply(null, this, LoadMoreLoadingLogPresenter.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.getValue();
    }
    public final LoadMoreLoadingLogPresenter$b S8(){
       Object obj = PatchProxy.apply(null, this, LoadMoreLoadingLogPresenter.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.r.getValue();
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LoadMoreLoadingLogPresenter.class, "1")) {
          return;
       }
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.p = obj;
       obj = this.r8("PAGE_LIST");
       a.o(obj, "inject\(PageAccessIds.PAGE_LIST\)");
       this.q = obj;
       return;
    }
}
