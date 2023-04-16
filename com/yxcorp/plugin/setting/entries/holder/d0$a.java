package com.yxcorp.plugin.setting.entries.holder.d0$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.setting.entries.holder.d0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import nl9.d;
import brd.t;
import com.yxcorp.plugin.setting.entries.holder.b0;
import brd.w;
import erd.c;
import t45.d;
import brd.z;
import kgd.z0;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import kgd.b1;
import erd.o;
import kgd.a1;
import com.yxcorp.gifshow.util.rx.RxBus;
import wl9.p;
import kgd.y0;
import kgd.x0;
import kgd.w0;
import wkd.b;
import com.kwai.component.menudot.b;
import nc5.c;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Integer;
import com.yxcorp.gifshow.commercial.model.PhotoAdDownloadCenterItemModel;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.commercial.model.PhotoAdDownloadCenterItemModel$a;
import java.lang.Enum;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Objects;
import java.lang.Boolean;
import nc5.i;
import lnc.j9;
import k2b.e0;
import android.view.View;
import ekd.m1;
import android.widget.FrameLayout;
import ml8.c;

public class d0$a extends PresenterV2	// class@00084a
{
    public TextView p;
    public FrameLayout q;
    public TextView r;
    public ViewGroup s;
    public c t;
    public final d0 u;

    public void d0$a(d0 p0){
       this.u = p0;
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d0$a.class, "5")) {
          return;
       }
       z a = d.a;
       t.zip(d.a(0x4bd38ddd).D40(), d.a(0x4bd38ddd).h60(), b0.a).observeOn(a).subscribe(new z0(this), Functions.d());
       t ot = d.a(0x4bd38ddd).hR().subscribeOn(d.c).map(new b1(this)).observeOn(a);
       ot.subscribe(new a1(this), Functions.d());
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, d0$a.class, "2")) {
          return;
       }
       RxBus.f.f(p.class).doOnSubscribe(new y0(this)).observeOn(d.a).subscribe(new x0(this));
       this.t = new w0(this);
       b.a(0x34c80eb4).r(1022, this.t);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, d0$a.class, "3")) {
          return;
       }
       b.a(0x34c80eb4).s(1022, this.t);
       return;
    }
    public final void P8(List p0,int p1,KwaiImageView p2){
       if (PatchProxy.isSupport(d0$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, d0$a.class, "13")) {
          return;
       }
       Object[] objArray = null;
       PhotoAdDownloadCenterItemModel photoAdDownl = (p1 < p0.size())? p0.get(p1): objArray;
       if (photoAdDownl != null) {
          Object[] objArray1 = PatchProxy.apply(objArray, photoAdDownl, PhotoAdDownloadCenterItemModel.class, "1");
          if (objArray1 != PatchProxyResult.class) {
          }else if(PhotoAdDownloadCenterItemModel$a.a[photoAdDownl.a.ordinal()] != 1){
             photoAdDownl = photoAdDownl.b;
             if (photoAdDownl != null) {
                objArray = photoAdDownl.getAppIcon();
             }
          }else if(!TextUtils.x(k.B(photoAdDownl.c).mAppIconUrl)){
             objArray = k.B(photoAdDownl.c).mAppIconUrl;
          }
          objArray1 = objArray;
          p2.L(objArray1);
          p2.setVisibility(0);
       }else {
          p2.setVisibility(4);
       }
       return;
    }
    public final void R8(){
       int i;
       d0$a uoa = d0$a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "6")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "8")) {
          i = d.a(0x4bd38ddd).Je();
          if (i > 0) {
             this.p.setVisibility(false);
             this.p.setText(String.valueOf(i));
          }else {
             this.p.setVisibility(8);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "7")) {
          uoa = this.u;
          Objects.requireNonNull(uoa);
          Object obj = PatchProxy.apply(objArray, uoa, d0.class, "5");
          boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): i.c(1022);
          if (b) {
             j9.a(this.r, true);
          }else {
             j9.a(this.r, false);
          }
          i.e(1022, this.u.c);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d0$a.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0d6a);
       this.r = m1.f(p0, 0x7f0a0d6d);
       this.q = m1.f(p0, 0x7f0a0d6b);
       return;
    }
    public void onEventMainThread(p p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d0$a.class, "4")) {
          return;
       }
       if (p0 != null && this.u.b.R1()) {
          this.R8();
       }
       return;
    }
}
