package com.kuaishou.live.common.core.component.pk.b;
import java.lang.Object;
import android.widget.ImageView;
import com.kuaishou.live.common.core.component.pk.LivePkResource$PkSkinResource;
import hc.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.Boolean;
import java.io.File;
import java.io.FileInputStream;
import qkd.b;
import java.io.InputStream;
import com.airbnb.lottie.LottieTask;
import com.airbnb.lottie.a;
import com.kuaishou.live.common.core.component.pk.a;
import w4.j;
import java.io.IOException;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import d61.c0;
import com.facebook.drawee.view.SimpleDraweeView;
import boc.d0;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import java.lang.StringBuilder;
import android.net.Uri;
import ekd.w0;
import com.kuaishou.live.common.core.component.pk.b$a;
import ub.b;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Enum;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$LiveResourceFileType;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;
import java.lang.Integer;
import kw1.b;
import com.kuaishou.live.common.core.component.pk.b$b;
import com.kuaishou.live.common.core.component.pk.LivePkResourcePathConstant;
import hc.a;
import hw1.e;
import java.lang.Runnable;
import ekd.k1;
import com.facebook.drawee.view.DraweeView;
import android.graphics.drawable.Animatable;

public final class b	// class@001735
{

    public void b(){
       super();
    }
    public static void a(ImageView p0,LivePkResource$PkSkinResource p1,b p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "15")) {
          return;
       }
       p1 = p1.mBackUpDrawableRes;
       if (p1 != -1) {
          p0.setImageResource(p1);
          b.k(p2);
       }
       return;
    }
    public static void b(KwaiImageView p0,LivePkResource$PkSkinResource p1,b p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, null, null, b.class, "2")) {
          return;
       }
       b.f(p0, p1, true, null);
       return;
    }
    public static void c(LottieAnimationView p0,LivePkResource$PkSkinResource p1){
       b.d(p0, p1, true, false, null);
    }
    public static void d(LottieAnimationView p0,LivePkResource$PkSkinResource p1,boolean p2,boolean p3,b p4){
       b uob = b.class;
       int i = 0;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Boolean.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, null, uob, "7")) {
             return;
          }
       }
       if (p0 != null && p1 != null) {
          if (!b.g(p1)) {
             b.a(p0, p1, p4);
             if (p2 && p0.getVisibility()) {
                p0.setVisibility(i);
             }
             return;
          }else {
             try{
                String str = b.i(p1.mLocalFileResPath, p1.mResourceScopeType);
                FileInputStream uFileInputSt = b.b0(new File(str));
                a uoa = new a(uFileInputSt, p0, p1, p2, p3);
                a.d(uFileInputSt, str).addListener(uob);
             }catch(java.io.IOException e7){
                e7.printStackTrace();
             }
          }
       }
    }
    public static void e(KwaiImageView p0,LivePkResource$PkSkinResource p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "1")) {
          return;
       }
       b.f(p0, p1, false, null);
       return;
    }
    public static void f(KwaiImageView p0,LivePkResource$PkSkinResource p1,boolean p2,b p3){
       boolean b;
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), p3, null, b.class, "3")) {
          return;
       }
       if (p0 != null && p1 != null) {
          b = true;
          if (!b.g(p1)) {
             Object obj = PatchProxy.applyThreeRefs(p0, p1, p3, null, b.class, "16");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(TextUtils.x(p1.mBackUpCdnUrl)){
                b = false;
             }else {
                d0.d(p0, c0.a.b(p1.mBackUpCdnUrl));
                b.k(p3);
             }
             if (!b) {
                b.a(p0, p1, p3);
             }
             return;
          }else {
             d uod = Fresco.newDraweeControllerBuilder();
             uod.q(b);
             d uod1 = uod.D(w0.f("file://"+b.i(p1.mLocalFileResPath, p1.mResourceScopeType)));
             uod1.s(new b$a(p2, p3));
             p0.setController(uod1.e());
          }
       }
       return;
    }
    public static boolean g(LivePkResource$PkSkinResource p0){
       boolean b;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, uob, "11");
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       b = false;
       if (p0 == null || TextUtils.x(p0.mLocalFileResPath)) {
          LiveLogTag pK = LiveLogTag.PK;
          String str = (p0 == null)? "": p0.toString();
          b.C(pK, "LivePkResourceUtils checkResourceValid resource empty", c.j("type", str));
          return b;
       }else {
          Object obj2 = PatchProxy.applyOneRefs(p0, obj, uob, "13");
          if (obj2 != patchProxyRe) {
             b1 = obj2.booleanValue();
          }else if(TextUtils.x(p0.mLocalFileResPath)){
             b1 = true;
          }else {
             b1 = false;
          }
          if (b1) {
             b.C(LiveLogTag.PK, "LivePkResourceUtils checkResourceValid resource disable", c.j("type", p0.toString()));
             return b;
          }else {
             File uFile = LiveResourceFileUtil.j(LiveResourceFileUtil$LiveResourceFileType.LIVE_PK_RESOURCE, b.i(p0.mLocalFileResPath, p0.mResourceScopeType));
             if (uFile != null && uFile.exists()) {
                b = true;
             }
             if (!b) {
                b.C(LiveLogTag.PK, "LivePkResourceUtils checkResourceValid file empty or file not exits", c.k("type", p0.toString(), "path", p0.mLocalFileResPath));
                b.h();
             }
             return b;
          }
       }
    }
    public static void h(){
       if (PatchProxy.applyVoid(null, null, b.class, "12")) {
          return;
       }
       b.Z(LiveLogTag.PK, "LivePkResourceUtils downloadPkResource");
       LiveResourceFileUtil.h(LiveResourceFileUtil$LiveResourceFileType.LIVE_PK_RESOURCE);
       LiveResourceFileUtil.h(LiveResourceFileUtil$LiveResourceFileType.LIVE_PK_SCORE_LIMIT_RESOURCE);
       LiveResourceFileUtil.h(LiveResourceFileUtil$LiveResourceFileType.LIVE_PK_IMAGE_CUSTOM_SKIN_V2);
       LiveResourceFileUtil.h(LiveResourceFileUtil$LiveResourceFileType.LIVE_PK_IMAGE_ANCHOR_HONOR_V2);
       return;
    }
    public static String i(String p0,int p1){
       Object obj1;
       Object obj2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object obj = null;
       if (PatchProxy.isSupport(uob)) {
          obj1 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), obj, uob, "18");
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj2 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), obj, uob, "8");
          if (obj2 != patchProxyRe) {
          }else {
          label_0034 :
             String str = "/";
             if (b.i(p1) || b.h(p1)) {
                obj2 = PatchProxy.applyOneRefs(p0, obj, uob, "10");
                if (obj2 != patchProxyRe) {
                }else {
                   obj2 = LiveResourceFileUtil.k("live_pk_image_resource_anchor_honor_v2")+str+b.f()+str+TextUtils.k(p0);
                }
                LiveResourceFileUtil$LiveResourceFileType lIVE_PK_IMAG = LiveResourceFileUtil$LiveResourceFileType.LIVE_PK_IMAGE_ANCHOR_HONOR_V2;
                if (!b.S(LiveResourceFileUtil.j(lIVE_PK_IMAG, obj2))) {
                   LiveResourceFileUtil.h(lIVE_PK_IMAG);
                }
             }
             if (b.g()) {
                obj1 = PatchProxy.applyOneRefs(p0, obj, uob, "9");
                obj2 = (obj1 != patchProxyRe)? obj1: LiveResourceFileUtil.k("live_pk_image_resource_custom_skin_v2")+str+b.c()+str+TextUtils.k(p0);
                LiveResourceFileUtil$LiveResourceFileType lIVE_PK_IMAG1 = LiveResourceFileUtil$LiveResourceFileType.LIVE_PK_IMAGE_CUSTOM_SKIN_V2;
                if (!b.S(LiveResourceFileUtil.j(lIVE_PK_IMAG1, obj2))) {
                   LiveResourceFileUtil.h(lIVE_PK_IMAG1);
                }
             }
             obj2 = LiveResourceFileUtil.k("live_pk_resource")+str+p0;
          }
       }else {
          goto label_0034 ;
       }
       b.d0(LiveLogTag.PK_SKIN, "getFilePath", "filePath", obj2, "resourceValidType", Integer.valueOf(p1));
       return obj2;
    }
    public static void j(){
       if (PatchProxy.applyVoid(null, null, b.class, "19")) {
          return;
       }
       LivePkResource$PkSkinResource[] pkSkinResour = LivePkResource$PkSkinResource.values();
       int len = pkSkinResour.length;
       int i = 0;
       while (i < len) {
          object oobject = pkSkinResour[i];
          int i1 = b$b.a[oobject.ordinal()];
          String str = "live_pk_win.json";
          if (i1 != 1) {
             if (i1 != 2) {
                if (i1 != 3) {
                   if (i1 != 4) {
                      if (i1 == 5) {
                         oobject.mLottieImageResFolderPath = null;
                         oobject.mLocalFileResPath = "live_pk_tie.json";
                         oobject.mBackUpCdnUrl = LivePkResourcePathConstant.LIVE_PK_TIE_BACKUP_V2_PATH.getResourcePath();
                      }
                   }else {
                      oobject.mLottieImageResFolderPath = null;
                      oobject.mLocalFileResPath = "live_pk_lose.json";
                      oobject.mBackUpCdnUrl = LivePkResourcePathConstant.LIVE_PK_LOSE_BACKUP_V2_PATH.getResourcePath();
                   }
                }else {
                   oobject.mLottieImageResFolderPath = null;
                   oobject.mLocalFileResPath = str;
                   oobject.mBackUpCdnUrl = LivePkResourcePathConstant.LIVE_PK_WIN_BACKUP_V2_PATH.getResourcePath();
                }
             }else {
                oobject.mLottieImageResFolderPath = null;
                oobject.mLocalFileResPath = "live_pk_tie.json";
                oobject.mBackUpCdnUrl = LivePkResourcePathConstant.LIVE_PK_TIE_BACKUP_V2_PATH.getResourcePath();
             }
          }else {
             oobject.mLottieImageResFolderPath = null;
             oobject.mLocalFileResPath = str;
             oobject.mBackUpCdnUrl = LivePkResourcePathConstant.LIVE_PK_WIN_BACKUP_V2_PATH.getResourcePath();
          }
          i = i + 1;
       }
       return;
    }
    public static void k(b p0){
       Object obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, b.class, "17")) {
          return;
       }
       if (p0 != null) {
          p0.e(obj);
          k1.r(new e(p0), 3000);
       }
       return;
    }
    public static void l(KwaiImageView p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "4")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       a controller = p0.getController();
       if (controller == null) {
          return;
       }
       Animatable animatable = controller.getAnimatable();
       if (animatable != null && animatable.isRunning()) {
          animatable.stop();
       }
       p0.setController(null);
       return;
    }
}
