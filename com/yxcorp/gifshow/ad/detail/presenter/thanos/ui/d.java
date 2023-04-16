package com.yxcorp.gifshow.ad.detail.presenter.thanos.ui.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import r19.j;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.ui.d$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.util.List;
import java.lang.Runnable;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class d extends PresenterV2	// class@0016db
{
    public TextView p;
    public QPhoto q;
    public List r;
    public BaseFragment s;
    public final Runnable t;
    public final a u;

    public void d(){
       super();
       this.t = new j(this);
       this.u = new d$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       int i = 0;
       float f = 0;
       if (this.q.isAtlasPhotos()) {
          this.p.setText(R.string.arg_RES_7f103c5b);
          this.p.setAlpha(f);
          this.p.setVisibility(i);
       }else if(this.q.isImageType()){
          this.p.setText(R.string.arg_RES_7f103c53);
          this.p.setAlpha(f);
          this.p.setVisibility(i);
       }else {
          this.p.setVisibility(8);
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(this.s.getParentFragment());
       if (slidePlayVie != null) {
          slidePlayVie.P(this.s, this.u);
       }else {
          this.r.add(this.u);
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       this.p.removeCallbacks(this.t);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0add);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.q = this.q8(QPhoto.class);
       this.r = this.r8("DETAIL_ATTACH_LISTENERS");
       this.s = this.r8("DETAIL_FRAGMENT");
       return;
    }
}
