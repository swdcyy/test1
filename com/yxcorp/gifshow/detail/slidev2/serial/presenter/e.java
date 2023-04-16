package com.yxcorp.gifshow.detail.slidev2.serial.presenter.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.library.groot.slide.viewpager.KwaiGrootViewPager;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import com.yxcorp.gifshow.detail.slidev2.serial.presenter.d;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import android.view.View;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class e extends PresenterV2	// class@0019ea
{
    public KwaiGrootViewPager p;
    public SlidePlayViewModel q;
    public BaseFragment r;
    public t s;
    public QPhoto t;
    public i u;

    public void e(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       e tr = this.r;
       if (tr != null) {
          SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tr.getParentFragment());
          this.q = slidePlayVie;
          this.p = slidePlayVie.d1(KwaiGrootViewPager.class);
       }
       this.X7(this.s.subscribe(new d(this), Functions.e));
       return;
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, e.class, "4");
    }
    public void doBindView(View p0){
       PatchProxy.applyVoidOneRefs(p0, this, e.class, "2");
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.s = this.r8("SERIAL_LAST_EPISODE_SWITCH_TO_FIRST_OBSERVABLE");
       this.t = this.q8(QPhoto.class);
       this.r = this.t8("DETAIL_FRAGMENT");
       return;
    }
}
