package com.yxcorp.gifshow.detail.slidev2.presenter.NasaSlidePlayRecordPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slidev2.presenter.NasaSlidePlayRecordPresenter$mAttachChangedListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import sy6.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qw6.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import e6a.e;
import d6a.f;
import com.kwai.robust.PatchProxyResult;

public final class NasaSlidePlayRecordPresenter extends PresenterV2	// class@0018be
{
    public String p;
    public a q;
    public int r;
    public int s;
    public int t;
    public int u;
    public final p v;

    public void NasaSlidePlayRecordPresenter(){
       super();
       this.u = -1;
       this.v = s.c(new NasaSlidePlayRecordPresenter$mAttachChangedListener$2(this));
    }
    public static final a P8(NasaSlidePlayRecordPresenter p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("mSlidePlayViewModel");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, NasaSlidePlayRecordPresenter.class, "3")) {
          return;
       }
       NasaSlidePlayRecordPresenter tq = this.q;
       if (tq == null) {
          a.S("mSlidePlayViewModel");
       }
       tq.h(this.R8());
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, NasaSlidePlayRecordPresenter.class, "4")) {
          return;
       }
       NasaSlidePlayRecordPresenter tq = this.q;
       if (tq == null) {
          a.S("mSlidePlayViewModel");
       }
       tq.l(this.R8());
       RxBus f = RxBus.f;
       NasaSlidePlayRecordPresenter tp = this.p;
       if (tp == null) {
          a.S("mSlidePlayId");
       }
       f.b(new e(f.c(tp), this.r, this.s, this.t));
       return;
    }
    public final a R8(){
       Object obj = PatchProxy.apply(null, this, NasaSlidePlayRecordPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.v.getValue();
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, NasaSlidePlayRecordPresenter.class, "2")) {
          return;
       }
       Object obj = this.q8(a.class);
       a.o(obj, "inject\(ISlidePlayProvider::class.java\)");
       this.q = obj;
       obj = this.r8("SLIDE_PLAY_FETCHER_ID");
       a.o(obj, "inject\(AccessIds.SLIDE_PLAY_FETCHER_ID\)");
       this.p = obj;
       return;
    }
}
