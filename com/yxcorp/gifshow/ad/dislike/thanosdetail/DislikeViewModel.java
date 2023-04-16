package com.yxcorp.gifshow.ad.dislike.thanosdetail.DislikeViewModel;
import e59.b;
import com.yxcorp.gifshow.ad.dislike.thanosdetail.DislikeViewModel$a;
import nsd.u;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import msd.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import android.os.Handler;
import com.yxcorp.gifshow.util.rx.RxBus;
import wl9.x;
import java.lang.Class;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.ad.dislike.thanosdetail.DislikeViewModel$1;
import m29.d;
import msd.l;
import erd.g;
import crd.b;
import ujc.e;
import com.yxcorp.gifshow.ad.dislike.thanosdetail.DislikeViewModel$2;
import java.util.List;
import com.kuaishou.commercial.photoreduce.a;
import java.util.Collection;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.component.photo.reduce.d;
import l29.d;
import com.kuaishou.commercial.photoreduce.a$a;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.dislike.DislikeHelper;
import android.app.Activity;
import mxb.j0;
import mxb.i0;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.ad.dislike.thanosdetail.DislikeViewModel$b;
import wkd.b;
import mxb.f0;
import android.view.MotionEvent;
import com.kuaishou.commercial.photoreduce.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeMenuInfo;
import mxb.c;
import ekd.q;

public final class DislikeViewModel extends b	// class@001747
{
    public boolean c;
    public final List d;
    public MotionEvent e;
    public d f;
    public Handler g;
    public boolean h;
    public b i;
    public b j;
    public final boolean k;
    public final QPhoto l;
    public final PhotoDetailParam m;
    public final NasaBizParam n;
    public final a o;
    public final BaseFragment p;
    public final SlidePlayViewModel q;
    public static final DislikeViewModel$a r;

    static {
       DislikeViewModel.r = new DislikeViewModel$a(null);
    }
    public void DislikeViewModel(QPhoto p0,PhotoDetailParam p1,NasaBizParam p2,a p3,BaseFragment p4,SlidePlayViewModel p5){
       z a;
       a.p(p0, "mPhoto");
       a.p(p1, "mDetailParams");
       a.p(p2, "mNasaBizParam");
       a.p(p3, "mActivityRef");
       a.p(p4, "mPhotoFragment");
       super();
       this.l = p0;
       this.m = p1;
       this.n = p2;
       this.o = p3;
       this.p = p4;
       this.q = p5;
       this.c = true;
       ArrayList uArrayList = new ArrayList();
       this.d = uArrayList;
       this.g = new Handler();
       RxBus f = RxBus.f;
       a = d.a;
       this.j = f.f(x.class).observeOn(a).subscribe(new d(new DislikeViewModel$1(this)));
       t ot = f.f(e.class).observeOn(a);
       this.i = ot.subscribe(new d(new DislikeViewModel$2(this)));
       List list = a.b(p0);
       if (list != null) {
          uArrayList.addAll(list);
       }
       uArrayList = p3.invoke();
       if (!uArrayList instanceof GifshowActivity) {
          uArrayList = null;
       }
       if (uArrayList != null) {
          this.f = new d(p0, uArrayList);
       }
       this.k = d.a(p0);
       return;
    }
    public final void c(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DislikeViewModel.class, "7")) {
          return;
       }
       a.p(p0, "reason");
       DislikeHelper.a.a(this.o.invoke(), this.l, p0);
       this.f();
       return;
    }
    public final BaseFragment d(){
       return this.p;
    }
    public final List e(){
       return this.d;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, DislikeViewModel.class, "4")) {
          return;
       }
       this.a(3);
       this.h = false;
       DislikeViewModel tq = this.q;
       if (tq != null) {
          tq.d(true, 4);
       }
       this.e = null;
       return;
    }
    public final void g(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DislikeViewModel.class, "9")) {
          return;
       }
       i0.a().e(4, this.l.mEntity).d(new DislikeViewModel$b(p0)).a();
       b.a(-762347696).r1(this.l.mEntity, "key_feedbacktype", "-1");
       return;
    }
    public final void h(MotionEvent p0){
       boolean b;
       DislikeViewModel td;
       DislikeViewModel uDislikeView = DislikeViewModel.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uDislikeView, "3")) {
          return;
       }
       a.p(p0, "motionEvent");
       if (this.c != null) {
          this.e = p0;
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, uDislikeView, "8")) {
             DislikeHelper.h(this.l);
          }
          uDislikeView = this.l;
          objArray = PatchProxy.applyOneRefs(uDislikeView, objArray, b.class, "1");
          if (objArray != PatchProxyResult.class) {
             b = objArray.booleanValue();
          }else {
             PhotoAdvertisement$NegativeMenuInfo negativeMenu = c.v(uDislikeView);
             b = (negativeMenu != null && (!q.f(negativeMenu.negativeMenus) && !q.f(negativeMenu.thanosDetailNegativeMenu)))? true: false;
          }
          if (!b) {
             td = this.d;
             td = (td == null || td.isEmpty())? 1: null;
             if (!td) {
             label_006c :
                if (this.k != null) {
                   this.a(2);
                }else {
                   this.a(false);
                }
             }else {
                this.a(true);
             }
          }else {
             goto label_006c ;
          }
          this.h = true;
          td = this.q;
          if (td != null) {
             td.d(false, 4);
          }
       }
       return;
    }
    public final void onHomeSplashStateEvent(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DislikeViewModel.class, "2")) {
          return;
       }
       a.p(p0, "event");
       p0 = p0.a;
       if (p0 == 4) {
          this.c = true;
       }else if(p0 == 3){
          this.c = false;
       }
       return;
    }
    public final void onSplashEyemaxEnterDetailEvent(x p0){
       this.c = true;
    }
}
