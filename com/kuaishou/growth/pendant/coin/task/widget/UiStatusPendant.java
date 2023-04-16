package com.kuaishou.growth.pendant.coin.task.widget.UiStatusPendant;
import com.kuaishou.growth.pendant.coin.core.KemPendantV2;
import com.kuaishou.growth.pendant.coin.task.widget.UiStatusPendant$a;
import nsd.u;
import java.util.LinkedHashMap;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.growth.pendant.coin.task.widget.UiStatusPendant$d;
import com.kuaishou.growth.pendant.coin.task.widget.UiStatusPendant$b;
import com.kuaishou.growth.pendant.coin.task.widget.UiStatusPendant$c;
import android.util.AttributeSet;
import java.util.Map;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.kuaishou.growth.pendant.ui.widget.CircularProgressView;
import com.kuaishou.growth.pendant.ui.widget.PendantAnimImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;
import gd0.b;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.growth.pendant.coin.task.widget.UiStatusPendant$e;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import brd.t;
import yd0.f;
import android.widget.FrameLayout;
import qf0.b;
import com.kuaishou.growth.pendant.model.TaskParamsV2;
import mf0.b;
import java.lang.Boolean;
import com.kuaishou.growth.pendant.coin.task.widget.UiStatusPendant$f;
import java.lang.Runnable;
import rd0.a;
import com.yxcorp.gifshow.widget.density.KwaiFixedScreenWidthFrameLayout;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.CDNUrl;
import zd0.b;
import ae0.b;

public final class UiStatusPendant extends KemPendantV2	// class@00062d
{
    public PendantAnimImageView o;
    public KwaiBindableImageView p;
    public CircularProgressView q;
    public ImageView r;
    public a s;
    public b t;
    public b u;
    public final m v;
    public final m w;
    public final UiStatusPendant$c x;
    public static final Map y;
    public static final UiStatusPendant$a z;

    static {
       UiStatusPendant.z = new UiStatusPendant$a(null);
       UiStatusPendant.y = new LinkedHashMap();
    }
    public void UiStatusPendant(Context p0){
       a.p(p0, "context");
       super(p0);
       this.v = new UiStatusPendant$d(this);
       this.w = new UiStatusPendant$b(this);
       this.x = new UiStatusPendant$c(this);
    }
    public void UiStatusPendant(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.v = new UiStatusPendant$d(this);
       this.w = new UiStatusPendant$b(this);
       this.x = new UiStatusPendant$c(this);
    }
    public void UiStatusPendant(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.v = new UiStatusPendant$d(this);
       this.w = new UiStatusPendant$b(this);
       this.x = new UiStatusPendant$c(this);
    }
    public static final Map getAnimTagMaps(){
       return UiStatusPendant.y;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UiStatusPendant.class, "3")) {
          return;
       }
       a.p(p0, "view");
       super.doBindView(p0);
       this.q = m1.f(p0, 0x7f0a32de);
       this.o = m1.f(p0, 0x7f0a2fc8);
       this.p = m1.f(p0, 0x7f0a2fce);
       this.r = m1.f(p0, 0x7f0a2fca);
       return;
    }
    public void o(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UiStatusPendant.class, "1")) {
          return;
       }
       a.p(p0, "context");
       super.o(p0);
       this.f(this.x);
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, UiStatusPendant.class, "7")) {
          return;
       }
       super.onAttachedToWindow();
       this.u = this.getUiChangedSubject().subscribe(new UiStatusPendant$e(this), Functions.d());
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, UiStatusPendant.class, "8")) {
          return;
       }
       super.onDetachedFromWindow();
       f.b(this.u);
       UiStatusPendant.y.remove(String.valueOf(this.hashCode()));
       this.k(this.x);
       return;
    }
    public void p(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UiStatusPendant.class, "2")) {
          return;
       }
       a.p(p0, "context");
       super.p(p0);
       if (b.j()) {
          this.v();
       }
       return;
    }
    public void s(){
       if (PatchProxy.applyVoid(null, this, UiStatusPendant.class, "6")) {
          return;
       }
       if (!b.u(this.getMParams()) && !a.g(UiStatusPendant.y.get(String.valueOf(this.hashCode())), Boolean.TRUE)) {
          UiStatusPendant ts = this.s;
          if (ts != null) {
             ts.j(new UiStatusPendant$f(this));
          }
       }
       return;
    }
    public final void v(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, UiStatusPendant.class, "4")) {
          return;
       }
       Context realContext = this.getRealContext();
       a.o(realContext, "realContext");
       a uoa = new a(realContext, this.o, this.getMParams(), null, 8, null);
       this.s = v0;
       if (!PatchProxy.applyVoid(objArray, this, UiStatusPendant.class, "5")) {
          UiStatusPendant to = this.o;
          if (to != null) {
             to.setFailureImage(R.drawable.arg_RES_7f081a93);
          }
          to = this.p;
          int i = 8;
          if (to != null) {
             to.setVisibility(i);
             to.setFailureImage(R.drawable.arg_RES_7f081a92);
          }
          to = this.q;
          if (to != null) {
             to.setVisibility(i);
          }
          to = this.r;
          if (to != null) {
             to.setOnClickListener(this.w);
          }
          if (b.u(this.getMParams())) {
             to = this.s;
             if (to != null) {
                uoa = a.class;
                if (!PatchProxy.applyVoid(objArray, to, uoa, "10")) {
                   a h = to.h;
                   if (h != null) {
                      PatchProxyResult patchProxyRe = PatchProxyResult.class;
                      Object obj = PatchProxy.apply(objArray, to, uoa, "3");
                      if (obj != patchProxyRe) {
                      }else {
                         uoa = to.i;
                         Object obj1 = PatchProxy.applyOneRefs(uoa, objArray, b.class, "22");
                         if (obj1 != patchProxyRe) {
                            obj = obj1;
                         }else {
                            a.p(uoa, "$this$getFinishedImageCdnUrls");
                            String mFinishedIco = uoa.getMFinishedIconUrl();
                            CDNUrl uCDNUrl = (mFinishedIco == null || !mFinishedIco.length())? 1: null;
                            if (!uCDNUrl) {
                               objArray = new CDNUrl[]{new CDNUrl("", uoa.getMFinishedIconUrl())};
                            }else {
                               mFinishedIco = uoa.getMCompleteIconUrl();
                               uCDNUrl = (mFinishedIco == null || !mFinishedIco.length())? 1: null;
                               if (!uCDNUrl) {
                                  objArray = new CDNUrl[]{new CDNUrl("", uoa.getMCompleteIconUrl())};
                               }
                            }
                            obj = objArray;
                         }
                      }
                      to.a(h, obj);
                   }
                }
             }
          }else {
             to = this.r;
             if (to != null) {
                to.setVisibility(i);
             }
             to = this.s;
             if (to != null) {
                to.j(new b(this));
             }
          }
       }
    label_00fc :
       this.t = new b(this.getMParams());
       this.setOnClickListener(this.v);
       return;
    }
}
