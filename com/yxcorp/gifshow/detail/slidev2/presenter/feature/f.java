package com.yxcorp.gifshow.detail.slidev2.presenter.feature.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.f$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import e8a.o;
import erd.g;
import crd.b;
import jta.c;
import r7a.f;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.CommonMeta;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class f extends PresenterV2	// class@001942
{
    public QPhoto p;
    public f q;
    public PhotoDetailParam r;
    public BaseFragment s;
    public DetailPlayConfig t;
    public boolean u;
    public SlidePlayViewModel v;
    public final c w;

    public void f(){
       super();
       this.w = new f$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       this.v = SlidePlayViewModel.B0(this.s.getParentFragment());
       this.t = this.r.getDetailPlayConfig();
       this.X7(this.s.getActivity().m().subscribe(new o(this)));
       this.q.a(this.w);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "5")) {
          return;
       }
       this.q.c(this.w);
       return;
    }
    public void P8(){
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "3")) {
          return;
       }
       int i = 1;
       if (this.v.r() && this.u != null) {
          this.t.setContinuePlayStrategy(2);
          this.t.setSavePlayProgressStrategy(i);
       }else if(this.p.getExtraSaveProgressTime() > 0){
          this.t.setSavePlayProgressStrategy(i);
          this.t.setContinuePlayStrategy(i);
          return;
       }else if(this.p.getCommonMeta() == null || this.p.getCommonMeta().mIsSmallWindowDismissPhoto == null){
          this.t.setContinuePlayStrategy(this.p.getContinuePlayStrategy());
          this.t.setSavePlayProgressStrategy(0);
       }
       if (!PatchProxy.applyVoid(objArray, this, uof, "4") && this.t.getContinuePlayStrategy() != 2) {
          this.t.setContinuePlayStrategy(3);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.r8("NASA_SIDEBAR_STATUS");
       this.r = this.q8(PhotoDetailParam.class);
       this.s = this.r8("DETAIL_FRAGMENT");
       return;
    }
}
