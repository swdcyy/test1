package com.kuaishou.merchant.feed.widget.MerchantKwaiImageView;
import com.yxcorp.gifshow.widget.density.KwaiFixedSimpleDraweeView;
import java.lang.String;
import java.util.regex.Pattern;
import java.util.IdentityHashMap;
import mw3.b;
import java.lang.Object;
import mw3.a;
import mw3.e;
import mw3.c;
import mw3.d;
import android.content.Context;
import android.util.AttributeSet;
import java.util.HashSet;
import com.kwai.sdk.switchconfig.a;
import ll8.c$b;
import android.content.res.TypedArray;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import android.net.Uri;
import ub.b;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import pb.d;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import ac.a;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import java.util.List;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.Set;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.kuaishou.merchant.feed.widget.b;
import java.util.ArrayList;
import lnc.c3$b;
import lnc.c3;
import ekd.x0;
import com.kuaishou.merchant.feed.widget.MerchantKwaiImageView$a;
import rb.g;
import com.kuaishou.merchant.feed.widget.a;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import java.lang.Exception;
import p74.a;
import java.lang.Throwable;
import o74.a;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;

public class MerchantKwaiImageView extends KwaiFixedSimpleDraweeView	// class@0016b9
{
    public boolean A;
    public boolean B;
    public boolean C;
    public g D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public final Set z;
    public static final String I;
    public static final Pattern J;
    public static final Pattern K;
    public static final Pattern L;
    public static final Pattern M;
    public static final Pattern N;
    public static final Pattern O;
    public static final IdentityHashMap P;

    static {
       MerchantKwaiImageView.I = "MerchantKwaiImageView";
       Pattern pattern = Pattern.compile("x-oss-process|imageView2|@base@tag");
       MerchantKwaiImageView.J = pattern;
       Pattern pattern1 = Pattern.compile("ali-ec|ali-ad");
       MerchantKwaiImageView.K = pattern1;
       Pattern pattern2 = Pattern.compile("tx-ec|tx-ad");
       MerchantKwaiImageView.L = pattern2;
       Pattern pattern3 = Pattern.compile("js-ec|js-ad");
       MerchantKwaiImageView.M = pattern3;
       Pattern pattern4 = Pattern.compile("p1-ec.yximgs.com|p2-ec.yximgs.com");
       MerchantKwaiImageView.N = pattern4;
       Pattern pattern5 = Pattern.compile("eckwai.com");
       MerchantKwaiImageView.O = pattern5;
       IdentityHashMap identityHash = new IdentityHashMap();
       MerchantKwaiImageView.P = identityHash;
       identityHash.put(pattern, new b());
       identityHash.put(pattern1, new a());
       identityHash.put(pattern2, new e());
       identityHash.put(pattern3, new c());
       identityHash.put(pattern4, new d());
       identityHash.put(pattern5, new a());
    }
    public void MerchantKwaiImageView(Context p0){
       super(p0, null, 0);
    }
    public void MerchantKwaiImageView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void MerchantKwaiImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.z = new HashSet();
       this.A = a.t().d("enableMerchantImageLibCrop", false);
       this.B = false;
       this.C = false;
       this.H = true;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.r3, false, false);
       this.E = typedArray.getBoolean(false, false);
       this.F = typedArray.getBoolean(true, true);
       typedArray.recycle();
       this.getHierarchy().x(false);
       this.B = a.t().d("merchantEnableECKwaiCDNClip", false);
    }
    public ImageRequest D(Uri p0,int p1,int p2,boolean p3,b p4,Object p5){
       if (PatchProxy.isSupport(MerchantKwaiImageView.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Boolean.valueOf(p3),p4,p5};
          Object obj = PatchProxy.apply(objArray, this, MerchantKwaiImageView.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       ImageRequest imageRequest = this.K(p0, p1, p2, p3);
       d uod = this.f0(p4, p5, imageRequest);
       a uoa = (uod == null)? null: uod.e();
       this.setController(uoa);
       return imageRequest;
    }
    public void L(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantKwaiImageView.class, "6")) {
          return;
       }
       a$a uoa = a.d();
       uoa.b(":ks-features:ft-merchant:merchant-kernels:base-ui");
       this.u0();
       this.M(p0, uoa.a());
       return;
    }
    public void P(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantKwaiImageView.class, "4")) {
          return;
       }
       a$a uoa = a.d();
       uoa.b(":ks-features:ft-merchant:merchant-kernels:base-ui");
       this.u0();
       this.S(p0, uoa.a());
       return;
    }
    public void U(CDNUrl[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantKwaiImageView.class, "5")) {
          return;
       }
       a$a uoa = a.d();
       uoa.b(":ks-features:ft-merchant:merchant-kernels:base-ui");
       this.u0();
       this.X(p0, uoa.a());
       return;
    }
    public d f0(b p0,Object p1,ImageRequest p2){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, MerchantKwaiImageView.class, "8");
       if (obj != patchProxyRe) {
          return obj;
       }
       p2 = this.v0(p2);
       if (this.F == null) {
          obj = PatchProxy.applyOneRefs(p2, this, MerchantKwaiImageView.class, "11");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(p2 == null){
             b = false;
          }else {
             b = this.z.contains(p2.s().toString());
          }
          if (b) {
             this.G = true;
             return null;
          }
       }
       d uod = super.f0(p0, p1, p2);
       this.setConfig(uod);
       return uod;
    }
    public d g0(b p0,Object p1,ImageRequest[] p2){
       int this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, MerchantKwaiImageView.class, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       int len = p2.length;
       ImageRequest[] imageRequest = new ImageRequest[len];
       boolean b = false;
       for (this = 0; this < p2.length; this++) {
          imageRequest[this] = this.v0(p2[this]);
       }
       if (this.F == null) {
          p2 = PatchProxy.applyOneRefs(imageRequest, this, MerchantKwaiImageView.class, "12");
          if (p2 != patchProxyRe) {
             b = p2.booleanValue();
          }else {
             int i = 0;
             while (i < len) {
                if (this.z.contains(imageRequest[i].s().toString())) {
                   b = true;
                   break ;
                }
                i++;
             }
          }
          if (b) {
             this.G = true;
             return Fresco.newDraweeControllerBuilder();
          }
       }
       d uod = super.g0(p0, p1, imageRequest);
       this.setConfig(uod);
       return uod;
    }
    public void s0(List p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantKwaiImageView.class, "3")) {
          return;
       }
       p0 = c3.b(p0, b.a, new ArrayList());
       Uri uri = x0.f(p1);
       if (uri != null && !uri.isOpaque()) {
          p0.add(new CDNUrl(uri.getHost(), p1));
       }
       a$a uoa = a.d();
       uoa.b(":ks-features:ft-merchant:merchant-kernels:base-ui");
       this.u0();
       this.S(p0, uoa.a());
       return;
    }
    public void setAnimateEnabled(boolean p0){
       this.E = p0;
    }
    public final void setConfig(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantKwaiImageView.class, "13")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0.q(this.E);
       p0.C(new MerchantKwaiImageView$a(this));
       return;
    }
    public void setController(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantKwaiImageView.class, "10")) {
          return;
       }
       if (this.G != null) {
          this.G = false;
          return;
       }else {
          super.setController(p0);
          return;
       }
    }
    public void setEnableDebugOverlay(boolean p0){
       this.C = p0;
    }
    public void setEnableReloadSameUrl(boolean p0){
       this.F = p0;
    }
    public void setImageCDNClipEnabled(boolean p0){
       this.H = p0;
    }
    public void setImagePerfDataListener(g p0){
       this.D = p0;
    }
    public void t0(CDNUrl[] p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantKwaiImageView.class, "2")) {
          return;
       }
       this.s0(c3.b(p0, a.a, new ArrayList()), p1);
       return;
    }
    public final void u0(){
       if (PatchProxy.applyVoid(null, this, MerchantKwaiImageView.class, "1")) {
          return;
       }
       if (this.A != null) {
          ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
          if (layoutParams != null) {
             ViewGroup$LayoutParams width = layoutParams.width;
             if (width > null) {
                layoutParams = layoutParams.height;
                if (layoutParams > null) {
                   this.l0(true, width, layoutParams);
                }
             }
          }
       }
       return;
    }
    public final ImageRequest v0(ImageRequest p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyOneRefs(p0, this, MerchantKwaiImageView.class, "14");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = p0.s().toString();
       Object obj1 = PatchProxy.applyOneRefs(obj, this, MerchantKwaiImageView.class, "17");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(this.A == null && (!MerchantKwaiImageView.J.matcher(obj).find() && (!MerchantKwaiImageView.K.matcher(obj).find() && (!MerchantKwaiImageView.L.matcher(obj).find() && (!MerchantKwaiImageView.M.matcher(obj).find() && (MerchantKwaiImageView.N.matcher(obj).find() || (this.B != null && MerchantKwaiImageView.O.matcher(obj).find()))))))){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          try{
             ImageRequestBuilder imageRequest = ImageRequestBuilder.d(p0);
             imageRequest.x(Uri.parse(this.w0(obj)));
             return imageRequest.a();
          }catch(java.lang.Exception e0){
             a.l(MerchantCommonLogBiz.KERNELS, MerchantKwaiImageView.I, e0.getMessage(), e0);
          }
          return p0;
       }else {
          goto label_00a0 ;
       }
    }
    public String w0(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ViewGroup$LayoutParams obj = PatchProxy.applyOneRefs(p0, this, MerchantKwaiImageView.class, "15");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (!TextUtils.x(p0) && this.H != null) {
          obj = this.getLayoutParams();
          if (obj == null || (obj.width > null && obj.height > null)) {
             a.d(MerchantCommonLogBiz.KERNELS, MerchantKwaiImageView.I, "cdn crop image url"+p0);
             Pattern pattern = PatchProxy.applyOneRefs(p0, this, MerchantKwaiImageView.class, "16");
             if (pattern != patchProxyRe) {
             }else {
                Pattern j = MerchantKwaiImageView.J;
                if (!j.matcher(p0).find()) {
                   pattern = MerchantKwaiImageView.K;
                   if (!pattern.matcher(p0).find()) {
                      pattern = MerchantKwaiImageView.L;
                      if (!pattern.matcher(p0).find()) {
                         pattern = MerchantKwaiImageView.M;
                         if (!pattern.matcher(p0).find()) {
                            pattern = MerchantKwaiImageView.N;
                            if (!pattern.matcher(p0).find()) {
                               pattern = MerchantKwaiImageView.O;
                               if (!pattern.matcher(p0).find()) {
                               }
                            }
                         }
                      }
                   }
                }
             }
          label_009f :
             p0 = MerchantKwaiImageView.P.get(pattern).a(p0, (int)((double)obj.width * 0x3ff0000000000000), (int)((double)obj.height * 0x3ff0000000000000));
          }
       }
    label_00b9 :
       return p0;
    }
}
