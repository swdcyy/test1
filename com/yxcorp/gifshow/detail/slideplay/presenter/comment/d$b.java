package com.yxcorp.gifshow.detail.slideplay.presenter.comment.d$b;
import yg5.t0;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import yg5.s0;
import yg5.r0;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import yy6.c;
import io.reactivex.subjects.PublishSubject;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import rd5.g;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.QComment;
import ek9.t0;
import zca.f;
import com.yxcorp.gifshow.event.PipModeStatus;
import brd.y;
import im8.f;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibleEvent;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibleEvent$Operation;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibilityCause;
import xx9.a;

public class d$b implements t0	// class@001859
{
    public final d b;

    public void d$b(d p0){
       this.b = p0;
       super();
    }
    public void s(boolean p0){
       d$b uob = d$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "2")) {
          return;
       }
       if (!p0) {
          this.b.V8(true);
       }
       return;
    }
    public void wd(int p0,int p1,int p2,float p3,int p4){
       s0.c(this, p0, p1, p2, p3, p4);
    }
    public void xe(boolean p0,r0 p1){
       d$b tb;
       Activity activity;
       d uod = d.class;
       d$b uob = d$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uob, "1")) {
          return;
       }
       boolean b = false;
       if (p0) {
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, uod, "13") && tb.Y != null) {
             activity = tb.getActivity();
             Objects.requireNonNull(activity);
             activity.F2(tb.V0);
             tb.V8(b);
             tb.D.a();
             Boolean tRUE = Boolean.TRUE;
             tb.K.onNext(tRUE);
             uod = tb.Q;
             if (uod != null) {
                uod.h.onNext(tRUE);
             }
             uod = tb.U;
             if (uod != null && uod.g != null) {
                tb.O.f(uod.h, null, uod.k);
                tb.U = null;
             }
             d p = tb.P;
             if (p != null) {
                p.onNext(new f(PipModeStatus.DISABLE, 1));
             }
          }
       label_0076 :
          this.b.B.get().enterStayForComments();
       }else {
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, uod, "14")) {
             activity = tb.getActivity();
             Objects.requireNonNull(activity);
             activity.l3(tb.V0);
             tb.B.get().exitStayForComments();
             Boolean fALSE = Boolean.FALSE;
             tb.K.onNext(fALSE);
             uod = tb.Q;
             if (uod != null) {
                uod.h.onNext(fALSE);
             }
             uod = tb.A;
             if (uod != null) {
                uod.d(new ChangeScreenVisibleEvent(tb.x, ChangeScreenVisibleEvent$Operation.UNCLEAR, ChangeScreenVisibilityCause.SHOW_COMMENT));
             }
             uod = tb.P;
             if (uod != null) {
                uod.onNext(new f(PipModeStatus.ENABLE, 1));
             }
             tb.U = null;
             tb.T = b;
          }
       }
       return;
    }
}
