package com.kuaishou.merchant.live.entry.LiveMerchantEntryInterceptPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.live.entry.LiveMerchantEntryInterceptPresenter$a;
import nsd.u;
import com.kuaishou.merchant.live.entry.LiveMerchantEntryInterceptPresenter$exitAction$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.merchant.live.entry.LiveMerchantEntryInterceptPresenter$onBind$1;
import io.reactivex.g;
import brd.t;
import ur5.b;
import b64.b;
import msd.a;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.library.widget.popup.common.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.KwaiDialogFragment;
import ur5.a;

public final class LiveMerchantEntryInterceptPresenter extends PresenterV2	// class@001a13
{
    public a p;
    public b q;
    public ProgressFragment r;
    public c s;
    public a t;
    public static boolean u;
    public static final LiveMerchantEntryInterceptPresenter$a v;

    static {
       LiveMerchantEntryInterceptPresenter.v = new LiveMerchantEntryInterceptPresenter$a(null);
    }
    public void LiveMerchantEntryInterceptPresenter(){
       super();
       this.t = LiveMerchantEntryInterceptPresenter$exitAction$1.INSTANCE;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantEntryInterceptPresenter.class, "2")) {
          return;
       }
       LiveMerchantEntryInterceptPresenter tq = this.q;
       if (tq == null) {
          a.S("mLiveStartPushInterceptService");
       }
       tq.a(t.create(new LiveMerchantEntryInterceptPresenter$onBind$1(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantEntryInterceptPresenter.class, "6")) {
          return;
       }
       LiveMerchantEntryInterceptPresenter tt = this.t;
       if (tt != null) {
          tt = new b(tt);
       }
       k1.m(tt);
       tt = this.q;
       if (tt == null) {
          a.S("mLiveStartPushInterceptService");
       }
       tt.a(null);
       this.P8();
       tt = this.s;
       if (tt != null) {
          tt.o();
       }
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantEntryInterceptPresenter.class, "5")) {
          return;
       }
       LiveMerchantEntryInterceptPresenter tr = this.r;
       if (tr != null && tr.isAdded()) {
          tr.dismissAllowingStateLoss();
       }
       this.r = null;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantEntryInterceptPresenter.class, "1")) {
          return;
       }
       this.p = this.q8(a.class);
       this.q = this.q8(b.class);
       return;
    }
}
