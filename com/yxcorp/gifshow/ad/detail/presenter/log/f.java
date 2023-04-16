package com.yxcorp.gifshow.ad.detail.presenter.log.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.detail.presenter.log.f$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.util.List;
import android.view.View;
import ekd.m1;
import com.kwai.framework.player.ui.impl.KwaiContentFrame;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import wl9.x;
import com.kwai.framework.model.feed.BaseFeed;
import mxb.j;
import com.kuaishou.commercial.log.a;
import mxb.j0;
import com.yxcorp.gifshow.photoad.o;

public class f extends PresenterV2	// class@001667
{
    public KwaiContentFrame p;
    public QPhoto q;
    public List r;
    public SlidePlayViewModel s;
    public BaseFragment t;
    public final a u;

    public void f(){
       super();
       this.u = new f$a(this);
    }
    public void E8(){
       boolean b;
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "6")) {
          return;
       }
       Object obj = PatchProxy.apply(objArray, this, uof, "8");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(this.q.isAd() || (this.q.getPlcEntryStyleInfo() != null && this.q.getPlcEntryStyleInfo().mBizType == 39)){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          uof = this.t;
          if (uof != null) {
             this.s = SlidePlayViewModel.B0(uof.getParentFragment());
          }
          uof = this.s;
          if (uof != null) {
             uof.P(this.t, this.u);
          }else {
             uof = this.r;
             if (uof != null) {
                uof.add(this.u);
             }
          }
       }
       return;
    }
    public void J8(){
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3120);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.q = this.q8(QPhoto.class);
       this.r = this.t8("DETAIL_ATTACH_LISTENERS");
       this.t = this.t8("DETAIL_FRAGMENT");
       return;
    }
    public void onHomeSplashStateEvent(x p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "7")) {
          return;
       }
       j oj = a.a(this.q.mEntity);
       f tp = this.p;
       if (tp != null) {
          oj.m(tp).n(1);
       }else {
          oj.m(this.m8()).n(0);
       }
       o.z().i(oj, 0);
       return;
    }
}
