package com.yxcorp.gifshow.atlas_detail.horizontal.presenter.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.util.SparseIntArray;
import k99.n;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.d$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import java.lang.Integer;
import moc.b;
import k99.m;
import erd.g;
import crd.b;
import brd.t;
import j99.r;
import android.view.View;
import java.util.List;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.d$b;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.log.widget.CommonLogViewPager;
import com.yxcorp.gifshow.widget.viewpager.PhotosViewPager;
import androidx.viewpager.widget.ViewPager;
import h3.a;
import ekd.m1;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import io.reactivex.subjects.PublishSubject;

public class d extends PresenterV2	// class@001bc4
{
    public ObjectAnimator A;
    public final Runnable B;
    public boolean C;
    public PublishSubject D;
    public NormalDetailBizParam E;
    public final a F;
    public PhotosViewPager p;
    public View q;
    public QPhoto r;
    public List s;
    public BaseFragment t;
    public PhotoDetailParam u;
    public r v;
    public PhotoDetailLogger w;
    public SparseIntArray x;
    public SparseIntArray y;
    public int z;

    public void d(){
       super();
       this.x = new SparseIntArray();
       this.z = 1;
       this.B = new n(this);
       this.F = new d$a(this);
    }
    public void E8(){
       boolean b;
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "3")) {
          return;
       }
       NormalDetailBizParam mKeyOfAtlasV = this.E.mKeyOfAtlasViewedCounts;
       if (mKeyOfAtlasV != null) {
          Object obj = b.b(mKeyOfAtlasV.intValue());
          if (obj instanceof SparseIntArray) {
             this.y = obj;
          }
       }
       this.X7(this.D.subscribe(new m(this)));
       b = false;
       if (!PatchProxy.applyVoid(objArray, this, uod, "6")) {
          uod = this.v;
          if (uod != null) {
             uod.z();
          }
          this.q.setVisibility(4);
          int i = 1;
          this.z = i;
          this.x.clear();
          this.x.put(b, i);
       }
       this.s.add(this.F);
       this.p.addOnPageChangeListener(new d$b(this));
       this.p.setIgnoreEdge(b);
       if (this.E.mFromSlidePlayPhotoClick != null) {
          this.p.setEdgeScrollable(b);
       }
       this.p.setOffscreenPageLimit(2);
       this.p.setAdapter(this.v);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       this.v.z();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a3f92);
       this.p = m1.f(p0, 0x7f0a4452);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.r = this.q8(QPhoto.class);
       this.s = this.r8("DETAIL_ATTACH_LISTENERS");
       this.t = this.r8("DETAIL_FRAGMENT");
       this.u = this.q8(PhotoDetailParam.class);
       this.v = this.q8(r.class);
       this.w = this.r8("DETAIL_LOGGER");
       this.D = this.r8("IS_NONET_TOAST_SHOWED_SUBJECT");
       this.E = this.q8(NormalDetailBizParam.class);
       return;
    }
}
