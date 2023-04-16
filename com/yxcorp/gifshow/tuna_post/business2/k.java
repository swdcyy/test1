package com.yxcorp.gifshow.tuna_post.business2.k;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import brd.t;
import d36.d;
import com.yxcorp.gifshow.tuna_post.business2.k$a;
import io.reactivex.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import d36.d$a;
import com.yxcorp.gifshow.tuna_post.business2.g;
import os5.q;
import tkd.b;
import com.kwai.feature.api.live.plugin.dva.LivePluginManager;
import tmc.p;
import j26.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import d36.f;
import t45.d;
import brd.z;
import tmc.m;
import erd.g;
import crd.b;
import tmc.o;
import lq.f;
import d36.a;
import tmc.n;
import com.kwai.feature.post.api.feature.tuna.UpdateShareBusinessLinkModel;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.post.api.feature.tuna.ShareBusinessLinkInfo;
import com.kwai.feature.post.api.feature.tuna.ShareBusinessLinkInfo$DialogInfo;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import com.kwai.feature.post.api.feature.tuna.ShareBusinessLinkInfo$DialogItemInfo;
import brd.v;
import com.kwai.feature.post.api.feature.live.ShareLivePredictionConfig;
import brd.g;

public class k extends PresenterV2	// class@001e39
{
    public d p;
    public ShareBusinessLinkInfo q;
    public UpdateShareBusinessLinkModel r;
    public boolean s;
    public t t;
    public boolean u;
    public c$a v;
    public UpdateShareBusinessLinkModel w;
    public boolean x;
    public final t y;
    public v z;

    public void k(t p0,d p1,boolean p2){
       super();
       this.x = false;
       t ot = t.create(new k$a(this));
       this.y = ot;
       this.p = p1;
       this.t = p0;
       this.u = p2;
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
       }else {
          d$a uoa = this.p.b();
          if (uoa != null && g.b(2)) {
             this.U7(LivePluginManager.b(q.class).kQ(ot, new p(this, uoa), this.u));
          }
       }
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, k.class, "3")) {
          return;
       }
       RxBus f = RxBus.f;
       z a = d.a;
       this.X7(f.f(f.class).observeOn(a).subscribe(new m(this)));
       this.X7(this.t.observeOn(a).subscribe(new o(this), f.b));
       this.X7(f.f(a.class).observeOn(a).subscribe(new n(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, k.class, "4")) {
          return;
       }
       this.z = null;
       return;
    }
    public final void P8(UpdateShareBusinessLinkModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "15")) {
          return;
       }
       if (!TextUtils.x(p0.mSubtype) && TextUtils.x(p0.mEntryId)) {
          p0.mEntryId = p0.mSubtype;
       }
       if (!TextUtils.x(p0.mEntryId) && TextUtils.x(p0.mSubtype)) {
          p0.mSubtype = p0.mEntryId;
       }
       return;
    }
    public final void R8(ShareBusinessLinkInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "10")) {
          return;
       }
       p0 = p0.mDialog;
       ShareBusinessLinkInfo$DialogInfo uDialogInfo = (this.p.b() != null)? 1: null;
       ShareBusinessLinkInfo$DialogItemInfo uDialogItemI = null;
       if (uDialogInfo && (p0 != null && !q.f(p0.mItems))) {
          Iterator iterator = p0.mItems.iterator();
          while (true) {
             if (iterator.hasNext()) {
                ShareBusinessLinkInfo$DialogItemInfo uDialogItemI1 = iterator.next();
                boolean b = g.c(uDialogItemI1.mEntryId);
                this.x = b;
                if (b) {
                   uDialogItemI = uDialogItemI1;
                }
             }
          }
       }
       if (this.x != null) {
          k tr = this.r;
          UpdateShareBusinessLinkModel mServiceId = (tr != null && g.c(tr.mEntryId))? this.r.mServiceId: "";
          k tz = this.z;
          if (tz != null && (!tz.isDisposed() && uDialogItemI != null)) {
             ShareLivePredictionConfig shareLivePre = new ShareLivePredictionConfig();
             shareLivePre.canShow = true;
             shareLivePre.reservationId = mServiceId;
             shareLivePre.desc = uDialogItemI.mItemDesc;
             this.z.onNext(shareLivePre);
          }
       }
       return;
    }
    public final void S8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, k.class, "16")) {
          return;
       }
       k tr = this.r;
       if (tr == null) {
          this.p.a(objArray);
          tr = this.q;
          if (tr != null) {
             this.R8(tr);
          }
       }else {
          this.p.a(tr);
       }
       return;
    }
}
