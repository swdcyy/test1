package ht1.d;
import ht1.a;
import ht1.d$a;
import nsd.u;
import java.lang.String;
import java.util.Map;
import java.lang.Object;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import java.util.List;
import pp.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$LiveResourceFileType;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import t45.d;
import ht1.f;
import java.lang.Runnable;
import crd.b;
import brd.z;
import kotlin.jvm.internal.a;
import pu1.d;
import com.kwai.robust.PatchProxyResult;
import pu1.j;
import com.airbnb.lottie.LottieAnimationView;
import com.kuaishou.live.common.core.component.multipk.utils.LiveMultiPkLottieResourceTypes;
import com.yxcorp.gifshow.image.KwaiImageView;
import hc.b;
import pu1.k;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Number;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Objects;
import d61.k;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import android.net.Uri;
import ekd.x0;
import ht1.d$b;
import ub.b;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.io.File;
import java.io.FileInputStream;
import qkd.b;
import java.io.InputStream;
import com.airbnb.lottie.LottieTask;
import com.airbnb.lottie.a;
import ht1.d$c;
import w4.j;
import java.io.IOException;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;
import j80.f;
import java.lang.Enum;
import ht1.c;

public final class d implements a	// class@002778
{
    public final List a;
    public b b;
    public boolean c;
    public boolean d;
    public final String e;
    public final String f;
    public final Map g;
    public final Map h;
    public static final d$a i;

    static {
       d.i = new d$a(null);
    }
    public void d(String p0,String p1,Map p2,Map p3){
       super();
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.h = p3;
       List list = LiveCommonLogTag.MULTI_PK.appendTag("SkinManager");
       this.a = list;
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
       }else {
          String str = "";
          boolean b = this.n(p1, this.p(str, "live_multi_pk_resource_image_honor_skin", p1), LiveResourceFileUtil$LiveResourceFileType.LIVE_MULTI_PK_RESOURCE_IMAGE_HONOR_SKIN);
          this.c = b;
          boolean b1 = (b)? false: this.n(p0, this.p(str, "live_multi_pk_resource_image_activity_skin", p0), LiveResourceFileUtil$LiveResourceFileType.LIVE_MULTI_PK_RESOURCE_IMAGE_ACTIVITY_SKIN);
          this.d = b1;
          b.P(list, "checkSkinValidenableUseHonorSkinFeature = "+this.c+" enableUseActivitySkinFeature = "+this.d);
       }
       if (!PatchProxy.applyVoid(null, this, d.class, "2")) {
          b uob = d.c.d(new f(this));
          a.o(uob, "KwaiSchedulers.ASYNC.sch¡­ownloadNormalSkin\(\)\n    }");
          this.b = uob;
       }
       return;
    }
    public String a(d p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "resource");
       if (this.k(p0)) {
          b.P(this.a, "getLocalFilePath, useHonorSkin, sourceName = "+p0.getLocalFileName());
          return this.q(p0);
       }else if(this.j(p0)){
          b.P(this.a, "getLocalFilePath, useActivitySkin, sourceName = "+p0.getLocalFileName());
          return this.o(p0);
       }else if(this.l(p0)){
          b.P(this.a, "getLocalFilePath, useNormalSkin, sourceName = "+p0.getLocalFileName());
          return this.r(p0);
       }else {
          b.P(this.a, "getLocalFilePath, not exist, sourceName = "+p0.getLocalFileName());
          return null;
       }
    }
    public void b(LottieAnimationView p0,LiveMultiPkLottieResourceTypes p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "26")) {
          return;
       }
       a.p(p0, "targetView");
       a.p(p1, "resource");
       this.h(p0, p1, true, false, false);
       return;
    }
    public void c(KwaiImageView p0,d p1,Object p2,b p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, d.class, "11")) {
          return;
       }
       a.p(p0, "targetView");
       a.p(p1, "resource");
       if (this.k(p1)) {
          b.P(this.a, "bindAnimResource, useHonorSkin, sourceName = "+p1.getLocalFileName());
          this.g(p0, this.q(p1), p3);
          return;
       }else if(this.j(p1)){
          b.P(this.a, "bindAnimResource, useActivitySkin, sourceName = "+p1.getLocalFileName());
          this.g(p0, this.o(p1), p3);
          return;
       }else if(this.l(p1)){
          b.P(this.a, "bindAnimResource, useNormalSkin, sourceName = "+p1.getLocalFileName());
          this.g(p0, this.r(p1), p3);
          return;
       }else {
          b.P(this.a, "bindAnimResource, useCDN, sourceName = "+p1.getLocalFileName());
          k.b.a(p0, p1.getCDNUrl(), p3, p2);
          return;
       }
    }
    public void d(KwaiImageView p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "12")) {
          return;
       }
       a.p(p0, "targetView");
       a.p(p1, "resource");
       this.c(p0, p1, null, null);
       return;
    }
    public void e(LottieAnimationView p0,LiveMultiPkLottieResourceTypes p1,boolean p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, d.class, "27")) {
          return;
       }
       a.p(p0, "targetView");
       a.p(p1, "resource");
       this.h(p0, p1, true, false, p2);
       return;
    }
    public int f(String p0,int p1){
       String obj;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uod, "9");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a.p(p0, "colorKey");
       obj = null;
       if (this.c != null) {
          d th = this.h;
          if (th != null) {
             obj = th.get(p0);
          }
       }
       if (this.d != null && (this.g != null && TextUtils.x(obj))) {
          obj = this.g.get(p0);
       }
    label_0047 :
       if (TextUtils.x(obj)) {
          Objects.requireNonNull(k.b);
          obj = k.a.get(p0);
       }
       b.T(this.a, "get pk color skin", "colorKey", p0, "colorValue", obj);
       if (!TextUtils.x(obj)) {
          p1 = k.b(obj);
       }
       return p1;
    }
    public final void g(KwaiImageView p0,String p1,b p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, d.class, "25")) {
          return;
       }
       d uod = Fresco.newDraweeControllerBuilder();
       uod.q(true);
       d uod1 = uod.D(x0.f("file://"+p1));
       uod1.s(new d$b(p2));
       p0.setController(uod1.e());
       return;
    }
    public final void h(LottieAnimationView p0,LiveMultiPkLottieResourceTypes p1,boolean p2,boolean p3,boolean p4){
       String str;
       Object obj;
       String str1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(d.class)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Boolean.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, d.class, "28")) {
             return;
          }
       }
       a.p(p0, "targetView");
       a.p(p1, "resource");
       if (this.k(p1)) {
          this.s(p4, "bindLottie, useHonorSkin, sourceName = "+p1.getLocalFileName());
          str = this.q(p1);
          obj = PatchProxy.applyOneRefs(p1, this, d.class, "20");
          str1 = (obj != patchProxyRe)? obj: this.p(p1.getLottieImageResFolderPath(), "live_multi_pk_resource_image_honor_skin", this.f);
          this.i(p0, str, str1, p2, p3);
          return;
       }else if(this.j(p1)){
          this.s(p4, "bindLottie, useActivitySkin, sourceName = "+p1.getLocalFileName());
          str = this.o(p1);
          obj = PatchProxy.applyOneRefs(p1, this, d.class, "22");
          str1 = (obj != patchProxyRe)? obj: this.p(p1.getLottieImageResFolderPath(), "live_multi_pk_resource_image_activity_skin", this.e);
          this.i(p0, str, str1, p2, p3);
          return;
       }else if(this.l(p1)){
          this.s(p4, "bindLottie, useNormalSkin, sourceName = "+p1.getLocalFileName());
          str = this.r(p1);
          obj = PatchProxy.applyOneRefs(p1, this, d.class, "18");
          str1 = (obj != patchProxyRe)? obj: this.p(p1.getLottieImageResFolderPath(), "live_multi_pk_resource_image_normal_skin", "");
          this.i(p0, str, str1, p2, p3);
       }
       return;
    }
    public final void i(LottieAnimationView p0,String p1,String p2,boolean p3,boolean p4){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uod, "30")) {
             return;
          }
       }
       try{
          FileInputStream uFileInputSt = b.b0(new File(p1));
          d$c uoc = new d$c(uFileInputSt, p0, p2, p3, p4);
          a.d(uFileInputSt, p1).addListener(uod);
       }catch(java.io.IOException e8){
          e8.printStackTrace();
       }
       return;
    }
    public final boolean j(j p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.d == null) {
          return false;
       }
       return this.m(LiveResourceFileUtil$LiveResourceFileType.LIVE_MULTI_PK_RESOURCE_IMAGE_ACTIVITY_SKIN, this.o(p0));
    }
    public final boolean k(j p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.c == null) {
          return false;
       }
       return this.m(LiveResourceFileUtil$LiveResourceFileType.LIVE_MULTI_PK_RESOURCE_IMAGE_HONOR_SKIN, this.q(p0));
    }
    public final boolean l(j p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       File uFile = LiveResourceFileUtil.j(LiveResourceFileUtil$LiveResourceFileType.LIVE_MULTI_PK_RESOURCE_IMAGE_NORMAL_SKIN, this.r(p0));
       boolean b = (uFile != null && uFile.exists())? true: false;
       return b;
    }
    public final boolean m(LiveResourceFileUtil$LiveResourceFileType p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       File uFile = LiveResourceFileUtil.j(p0, p1);
       boolean b = (uFile != null && uFile.exists())? true: false;
       return b;
    }
    public final boolean n(String p0,String p1,LiveResourceFileUtil$LiveResourceFileType p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, d.class, "7");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (TextUtils.x(p0)) {
          return b;
       }
       p0 = PatchProxy.applyTwoRefs(p1, p2, this, d.class, "8");
       if (p0 != patchProxyRe) {
          b = p0.booleanValue();
       }else {
          File uFile = LiveResourceFileUtil.j(p2, p1);
          if (uFile == null || !uFile.exists()) {
             b.P(this.a, "canUseSkin, do not has resource");
          }else {
             long l = f.d(p1);
             if (l > 0) {
                b.P(this.a, "canUseSkin, has resource, do nothing, fileType = ,"+p2.toString()+" filePath = ,"+p1+" fileSize = "+l);
                b = true;
             }else {
                b.P(this.a, "can not use skin, fileSize == 0");
             }
          }
       }
       return b;
    }
    public final String o(j p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p(p0.getLocalFileName(), "live_multi_pk_resource_image_activity_skin", this.e);
    }
    public final String p(String p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, d.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p2)) {
          return LiveResourceFileUtil.k(p1)+'/'+p0;
       }
       return LiveResourceFileUtil.k(p1)+'/'+p2+'/'+p0;
    }
    public final String q(j p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p(p0.getLocalFileName(), "live_multi_pk_resource_image_honor_skin", this.f);
    }
    public final String r(j p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p(p0.getLocalFileName(), "live_multi_pk_resource_image_normal_skin", "");
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, d.class, "10")) {
          return;
       }
       d tb = this.b;
       if (tb == null) {
          a.S("tryDownloadResourceTaskDisposable");
       }
       tb.dispose();
       return;
    }
    public final void s(boolean p0,String p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uod, "29")) {
          return;
       }
       if (p0) {
          return;
       }
       b.P(this.a, p1);
       return;
    }
    public final void t(String p0,LiveResourceFileUtil$LiveResourceFileType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "6")) {
          return;
       }
       b.P(this.a, "tryDownloadSkin, startDownloadRes, fileType = "+p1.toString()+" filePath = "+p0);
       d$a i = d.i;
       Objects.requireNonNull(i);
       if (!PatchProxy.applyVoidOneRefs(p1, i, d$a.class, "1")) {
          a.p(p1, "fileType");
          d.a.d(new c(p1));
       }
       return;
    }
}
