package com.yxcorp.gifshow.detail.slideplay.presenter.comment.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import mx9.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.kuaishou.android.model.mix.QComment;
import java.util.Objects;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import p5a.e;
import de5.a;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.framework.player.core.b;
import vy6.a;
import wkd.b;
import l66.a;
import lnc.u1;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import brd.t;
import t45.d;
import brd.z;
import mx9.c;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import java.util.List;
import z8a.c;
import mx9.b;
import com.kwai.component.photo.detail.slide.degrade.SlidePlayDegradeApi;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import al9.a;
import com.kwai.framework.init.e;
import mx9.d;
import qvb.i;
import java.util.Iterator;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class e extends PresenterV2	// class@00185b
{
    public f p;
    public a q;
    public PhotoDetailParam r;
    public a s;
    public BaseFragment t;

    public void e(){
       super();
       this.p = new f();
    }
    public void E8(){
       boolean b1;
       RxBus f;
       z a;
       Object[] objArray = null;
       String str = "2";
       if (PatchProxy.applyVoid(objArray, this, e.class, str)) {
          return;
       }
       e tp = this.p;
       boolean b = true;
       tp.b = b;
       e tr = this.r;
       PhotoDetailParam mPhoto = tr.mPhoto;
       e tq = this.q;
       e ts = this.s;
       e tt = this.t;
       QComment comment = tr.getDetailCommonParam().getComment();
       Objects.requireNonNull(tp);
       int i = 0;
       if (PatchProxy.isSupport(f.class)) {
          Object[] objArray1 = new Object[]{mPhoto,tq,ts,tt,comment};
          if (!PatchProxy.applyVoid(objArray1, tp, f.class, "3")) {
          label_0049 :
             tp.c = mPhoto;
             tp.e = ts;
             tp.f = SlidePlayViewModel.B0(tt.getParentFragment());
             tp.g = tt;
             tp.d = tq;
             tp.h = comment;
             tp.i = i;
             if (f.a() && (mPhoto.hasGodCommentShow() || comment != null)) {
                if (!PatchProxy.applyVoid(objArray, tp, f.class, "4") && tp.d != null) {
                   if (SlidePlayDegradeApi.COMMENT_LIST.shouldDegrade()) {
                      tp.d.e0(RequestTiming.ON_HOME_PAGE_CREATED);
                   }
                   if (tp.b != null) {
                      tp.a.add(e.b().observeOn(d.a).subscribe(new d(tp), Functions.d()));
                   }else if(tp.d.isEmpty()){
                      tp.b();
                      tp.d.e0(RequestTiming.DEFAULT);
                   }
                }
             }else {
                f obj = PatchProxy.apply(objArray, objArray, f.class, str);
                if (obj != PatchProxyResult.class) {
                   b1 = obj.booleanValue();
                }else if(a.t().d("enableOptimizedPreloadCommentList", i) && f.a()){
                   i = 1;
                }
                b1 = i;
                if (b1) {
                   tp.i = b;
                   ts.getPlayer().addOnInfoListener(tp.k);
                   obj = tp.f;
                   if (obj != null) {
                      obj.P(tt, tp.l);
                   }
                   b.a(0x6d2a4fdd).a(tp);
                   u1.a(tp);
                   f = RxBus.f;
                   a = d.a;
                   tp.a.add(f.f(n.class).observeOn(a).subscribe(new c(tp), Functions.d()));
                   tp.a.add(f.f(c.class).observeOn(a).subscribe(new b(tp), Functions.d()));
                }
             }
          }
       }else {
          goto label_0049 ;
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "3")) {
          return;
       }
       e tp = this.p;
       Objects.requireNonNull(tp);
       if (!PatchProxy.applyVoid(objArray, tp, f.class, "10")) {
          Iterator iterator = tp.a.iterator();
          while (iterator.hasNext()) {
             b uob = iterator.next();
             if (uob != null && !uob.isDisposed()) {
                uob.dispose();
             }
          }
          if (tp.i != null) {
             if (tp.f != null) {
                tp.e.getPlayer().removeOnInfoListener(tp.k);
             }
             b.a(0x6d2a4fdd).c(tp);
             u1.b(tp);
             f g = tp.g;
             if (g != null) {
                tp.f.D(g, tp.l);
             }
          }
          tp.e = objArray;
          tp.f = objArray;
          tp.d = objArray;
          tp.c = objArray;
          tp.g = objArray;
          tp.i = false;
          tp.a.clear();
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.q = this.q8(a.class);
       this.r = this.q8(PhotoDetailParam.class);
       this.s = this.q8(a.class);
       this.t = this.r8("DETAIL_FRAGMENT");
       return;
    }
}
