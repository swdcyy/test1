package com.yxcorp.gifshow.relation.explore.presenter.w;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import fac.c;
import android.view.ViewGroup$MarginLayoutParams;
import com.kwai.framework.model.user.RecoUser;
import ija.t;
import java.util.List;
import ok.h;
import com.google.common.collect.Lists;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.relation.explore.presenter.w$a;
import android.view.View$OnClickListener;
import hac.i1;
import android.view.View$OnLongClickListener;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.CoverMeta;
import kp.r1;
import com.yxcorp.gifshow.model.CDNUrl;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import kb.c;
import hac.k1;
import java.util.concurrent.ExecutorService;
import t45.c;
import kb.e;
import java.util.concurrent.Executor;
import android.graphics.Bitmap;
import brd.t;
import ii5.a;
import t45.d;
import brd.z;
import hac.j1;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import io.reactivex.subjects.PublishSubject;

public class w extends PresenterV2	// class@001868
{
    public BaseFragment p;
    public PublishSubject q;
    public RecoUser r;
    public QPhoto s;
    public c t;
    public KwaiImageView u;
    public View v;
    public ImageView w;
    public Bitmap x;
    public final String y;

    public void w(){
       super();
       this.y = "PymkBigCardVideoItemPresenter";
    }
    public void E8(){
       w ow = w.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ow, "3")) {
          return;
       }
       RecyclerView$LayoutParams layoutParams = this.m8().getLayoutParams();
       layoutParams.width = this.t.g();
       layoutParams.height = this.t.c();
       this.m8().setLayoutParams(layoutParams);
       this.s = Lists.h(this.r.mFeedList, t.b).get(0);
       this.v.setOnClickListener(new w$a(this));
       if (!this.t.d()) {
          this.v.setOnLongClickListener(new i1(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, ow, "5")) {
          CoverMeta uCoverMeta = r1.D0(Lists.h(this.r.mFeedList, t.b).get(0).mEntity);
          CDNUrl[] uCDNUrlArray = new CDNUrl[0];
          if (uCoverMeta != null) {
             uCDNUrlArray = uCoverMeta.mCoverThumbnailUrls;
          }
          if (uCDNUrlArray != null && uCDNUrlArray.length) {
             object oobject = uCDNUrlArray[0];
             if (oobject != null) {
                Fresco.getImagePipeline().fetchDecodedImage(ImageRequest.c(oobject.mUrl), objArray).f(new k1(this), c.c());
             }
          }
       }
    label_00a6 :
       return;
    }
    public void P8(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "4")) {
          return;
       }
       this.X7(a.c(p0, true).subscribeOn(d.c).observeOn(d.a).subscribe(new j1(this), Functions.d()));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "2")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a3105);
       this.v = m1.f(p0, 0x7f0a2a9b);
       this.w = m1.f(p0, 0x7f0a2a9c);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, w.class, "1")) {
          return;
       }
       this.r = this.q8(RecoUser.class);
       this.t = this.q8(c.class);
       this.p = this.r8("FRAGMENT");
       this.q = this.r8("PYMK_ACCESS_IDSbigcard_btn");
       return;
    }
}
