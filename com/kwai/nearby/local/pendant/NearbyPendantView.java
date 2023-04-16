package com.kwai.nearby.local.pendant.NearbyPendantView;
import android.widget.FrameLayout;
import com.kwai.nearby.local.pendant.NearbyPendantView$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.nearby.local.pendant.PendantAnimImageView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.List;
import crd.b;
import lnc.b9;
import com.yxcorp.utility.n;
import com.kwai.nearby.local.pendant.NearbyPendantView$c;
import android.view.View$OnClickListener;
import ekd.m1;
import com.kwai.nearby.model.NearbyPendantInfo$NearbyPendantConfig;
import java.lang.Boolean;
import com.kwai.nearby.local.pendant.NearbyPendantView$d;
import com.kwai.nearby.local.pendant.NearbyPendantView$e;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import android.net.Uri;
import com.kwai.nearby.local.pendant.NearbyPendantView$f;
import ub.b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;
import com.kwai.nearby.local.pendant.NearbyPendantView$b;
import cd7.g;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import java.io.File;
import ekd.j;
import com.yxcorp.utility.Log;
import qkd.b;
import java.lang.StringBuilder;
import cd7.c;
import io.reactivex.g;
import cd7.d;
import erd.o;
import com.kwai.nearby.local.pendant.a;
import t45.d;
import brd.z;
import cd7.e;
import java.util.concurrent.Callable;
import cd7.a;
import cd7.b;
import erd.g;

public final class NearbyPendantView extends FrameLayout	// class@000f9d
{
    public NearbyPendantInfo$NearbyPendantConfig b;
    public NearbyPendantView$b c;
    public b d;
    public PendantAnimImageView e;
    public ImageView f;
    public ImageView g;
    public static final NearbyPendantView$a h;

    static {
       NearbyPendantView.h = new NearbyPendantView$a(null);
    }
    public void NearbyPendantView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void NearbyPendantView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void NearbyPendantView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       LayoutInflater.from(p0).inflate(R.layout.arg_RES_7f0d1094, this);
    }
    public void NearbyPendantView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public static final PendantAnimImageView a(NearbyPendantView p0){
       p0 = p0.e;
       if (p0 == null) {
          a.S("mPendantIconView");
       }
       return p0;
    }
    public final void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, NearbyPendantView.class, "8")) {
          return;
       }
       NearbyPendantView te = this.e;
       String str = "mPendantIconView";
       if (te == null) {
          a.S(str);
       }
       if (te != null) {
          te = this.e;
          if (te == null) {
             a.S(str);
          }
          Objects.requireNonNull(te);
          if (!PatchProxy.applyVoid(objArray, te, PendantAnimImageView.class, "4")) {
             te.x.clear();
          }
       }
       b9.a(this.d);
       return;
    }
    public final void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, NearbyPendantView.class, "4")) {
          return;
       }
       int i = 1;
       View[] viewArray = new View[i];
       NearbyPendantView tf = this.f;
       if (tf == null) {
          a.S("mPendantCloseView");
       }
       viewArray[0] = tf;
       n.Z(0, viewArray);
       NearbyPendantView tf1 = this.f;
       if (tf1 == null) {
          a.S("mPendantCloseView");
       }
       m1.a(tf1, new NearbyPendantView$c(this), R.id.pendant_close);
       tf1 = this.b;
       if (tf1 != null) {
          objArray = Boolean.valueOf(tf1.mHasXMark);
       }
       a.m(objArray);
       if (!objArray.booleanValue()) {
          View[] viewArray1 = new View[i];
          tf1 = this.f;
          if (tf1 == null) {
             a.S("mPendantCloseView");
          }
          viewArray1[0] = tf1;
          n.Z(8, viewArray1);
       }
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, NearbyPendantView.class, "3")) {
          return;
       }
       View[] viewArray = new View[1];
       NearbyPendantView te = this.e;
       String str = "mPendantIconView";
       if (te == null) {
          a.S(str);
       }
       viewArray[0] = te;
       n.Z(0, viewArray);
       NearbyPendantView te1 = this.e;
       if (te1 == null) {
          a.S(str);
       }
       m1.a(te1, new NearbyPendantView$d(this), R.id.pendant_icon);
       te1 = this.g;
       if (te1 == null) {
          a.S("mAdsorptionStateView");
       }
       m1.a(te1, new NearbyPendantView$e(this), R.id.iv_adsorptionState_icon);
       return;
    }
    public final void e(){
       NearbyPendantView te;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, NearbyPendantView.class, "7")) {
          return;
       }
       NearbyPendantView tb = this.b;
       NearbyPendantInfo$NearbyPendantConfig mIconUrl = (tb != null)? tb.mIconUrl: objArray;
       String str = "mPendantIconView";
       if (!TextUtils.x(mIconUrl)) {
          a$a uoa = a.d();
          uoa.b(":ks-features:ft-social:nearby");
          uoa.d(ImageSource.ICON);
          a uoa1 = uoa.a();
          te = this.e;
          if (te == null) {
             a.S(str);
          }
          tb = this.b;
          if (tb != null) {
             objArray = tb.mIconUrl;
          }
          te.E(Uri.parse(objArray), uoa1, 0, 0, new NearbyPendantView$f(this));
       }else {
          View[] viewArray = new View[2];
          int i = 0;
          te = this.e;
          if (te == null) {
             a.S(str);
          }
          viewArray[i] = te;
          NearbyPendantView tf = this.f;
          if (tf == null) {
             a.S("mPendantCloseView");
          }
          viewArray[1] = tf;
          n.Z(8, viewArray);
       }
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, NearbyPendantView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       View view = this.findViewById(R.id.pendant_icon);
       a.o(view, "findViewById\(R.id.pendant_icon\)");
       this.e = view;
       view = this.findViewById(R.id.pendant_close);
       a.o(view, "findViewById\(R.id.pendant_close\)");
       this.f = view;
       view = this.findViewById(R.id.iv_adsorptionState_icon);
       a.o(view, "findViewById\(R.id.iv_adsorptionState_icon\)");
       this.g = view;
       return;
    }
    public final void setClickListener(NearbyPendantView$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NearbyPendantView.class, "9")) {
          return;
       }
       a.p(p0, "listener");
       this.c = p0;
       return;
    }
    public final void setPendantData(NearbyPendantInfo$NearbyPendantConfig p0){
       Object[] objArray1;
       if (PatchProxy.applyVoidOneRefs(p0, this, NearbyPendantView.class, "2")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.b = p0;
       if (!TextUtils.x(p0.mAnimationResourceURL)) {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, NearbyPendantView.class, "5")) {
             NearbyPendantView tb = this.b;
             if (tb != null && !TextUtils.x(tb.mAnimationResourceURL)) {
                tb = this.b;
                tb = (tb != null)? tb.mAnimationResourceURL: objArray;
                if (tb != null) {
                   String str = g.b(tb);
                   g og = g.class;
                   t ot = PatchProxy.applyTwoRefs(tb, str, objArray, og, "3");
                   if (ot != PatchProxyResult.class) {
                   }else {
                      String obj = PatchProxy.applyOneRefs(tb, objArray, og, "4");
                      boolean b = false;
                      if (obj != PatchProxyResult.class) {
                         b = obj.booleanValue();
                      }else {
                         obj = g.b(tb);
                         File uFile = new File(g.a);
                         if (uFile.exists() && (uFile.isDirectory() && (!uFile.isHidden() && !j.h(uFile.listFiles())))) {
                            File[] uFileArray = uFile.listFiles();
                            int len = uFileArray.length;
                            int i = 0;
                            while (true) {
                               if (i < len) {
                                  if (!(uFileArray[i].getName()).equals(obj)) {
                                     i = i + 1;
                                  }
                               }
                            }
                         }
                      label_00a0 :
                         b = true;
                      }
                      obj = "AnimationResourceManager";
                      if (b) {
                         Log.g(obj, "download pendant animation resource");
                         String a = g.a;
                         b.m(new File(a));
                         t ot1 = PatchProxy.applyThreeRefs(tb, a, str, null, g.class, "1");
                         if (ot1 != PatchProxyResult.class) {
                         }else {
                            obj = a+File.separator+str;
                            ot1 = t.create(new c(tb, obj, str)).map(new d(obj));
                         }
                         ot = ot1.map(a.b).subscribeOn(d.c).observeOn(d.a);
                      }else {
                         Log.g(obj, "get cache pendant animation resource");
                         ot = t.fromCallable(new e(new File(g.a+File.separator+g.b(tb)))).subscribeOn(d.c).observeOn(d.a);
                      }
                   }
                   this.d = ot.subscribe(new a(this, tb), new b(this, tb));
                }
             }
          }
       }else {
          this.e();
       }
       return;
    }
}
