package com.yxcorp.gifshow.follow.stagger.presenter.PlcCoverPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.follow.stagger.presenter.PlcCoverPresenter$a;
import nsd.u;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.w;
import tkd.b;
import tkd.d;
import w06.b;
import w06.a;
import android.app.Activity;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$PageType;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import h4a.a;
import u06.a;
import u06.c;
import x06.b;
import com.yxcorp.gifshow.follow.stagger.presenter.PlcCoverPresenter$b;
import erd.g;
import x06.c;
import com.yxcorp.gifshow.follow.stagger.presenter.PlcCoverPresenter$c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.component.feedstaggercard.model.CardStyle;

public final class PlcCoverPresenter extends PresenterV2	// class@001206
{
    public QPhoto p;
    public a q;
    public ViewGroup r;
    public View s;
    public BaseFragment t;
    public PlcCoverPresenter$MaskView u;
    public CardStyle v;
    public Boolean w;
    public static final PlcCoverPresenter$a x;

    static {
       PlcCoverPresenter.x = new PlcCoverPresenter$a(null);
    }
    public void PlcCoverPresenter(){
       super();
       this.w = Boolean.FALSE;
    }
    public void E8(){
       c uoc;
       if (PatchProxy.applyVoid(null, this, PlcCoverPresenter.class, "3")) {
          return;
       }
       this.R8();
       PlcCoverPresenter tr = this.r;
       if (tr != null) {
          PlcCoverPresenter tu = this.u;
          if (tu != null) {
             tr.removeView(tu);
          }
          if (a.g(this.w, Boolean.FALSE)) {
             return;
          }else {
             tu = this.p;
             if (tu != null) {
                QPhoto mEntity = tu.mEntity;
                if (mEntity != null) {
                   w.B1(mEntity, true);
                }
             }
             b uob = d.a(0x10c9d447);
             a.o(uob, "PluginManager.get\(IPlcLo¡­elperFactory::class.java\)");
             a uoa = d.a(0x32a36e7d).ct().c(this.getActivity()).e(PlcEntryStyleInfo$PageType.ATTENTION_LIST).b(this.p).f(this.t).d(uob).build();
             this.q = uoa;
             if (uoa != null) {
                uoa.initialize();
             }
             tu = this.q;
             if (tu != null) {
                uoc = tu.c();
                if (uoc != null) {
                   uoc.n(new b("PlcCoverPresenter", new PlcCoverPresenter$b(this, tr)));
                }
             }
             tu = this.q;
             if (tu != null) {
                uoc = tu.c();
                if (uoc != null) {
                   uoc.v(new c(new PlcCoverPresenter$c(this, tr)));
                }
             }
          }
       }
    label_00a5 :
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, PlcCoverPresenter.class, "6")) {
          return;
       }
       this.R8();
       return;
    }
    public final int P8(){
       PlcCoverPresenter obj = PatchProxy.apply(null, this, PlcCoverPresenter.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.v;
       int i = 0x7f0702ef;
       if (obj != null && CardStyle.isV4Bottom(obj.mBottomType)) {
          i = 0x7f07031f;
       }
       return i;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, PlcCoverPresenter.class, "5")) {
          return;
       }
       PlcCoverPresenter tp = this.p;
       if (tp != null) {
          QPhoto mEntity = tp.mEntity;
          if (mEntity != null) {
             w.B1(mEntity, false);
          }
       }
       tp = this.s;
       if (tp != null) {
          PlcCoverPresenter tr = this.r;
          if (tr != null) {
             tr.removeView(tp);
          }
       }
       tp = this.q;
       if (tp != null) {
          tp.release();
       }
       this.q = null;
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcCoverPresenter.class, "2")) {
          return;
       }
       ViewGroup viewGroup = (p0 != null)? p0.findViewById(R.id.photo_cover_container): null;
       this.r = viewGroup;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, PlcCoverPresenter.class, "1")) {
          return;
       }
       this.p = this.s8(QPhoto.class);
       this.t = this.r8("FRAGMENT");
       this.v = this.t8("PAGE_CARD_STYLE");
       this.w = this.t8("FOLLOW_NEED_SHOW_PLC");
       return;
    }
}
