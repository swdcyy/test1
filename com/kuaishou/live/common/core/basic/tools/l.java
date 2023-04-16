package com.kuaishou.live.common.core.basic.tools.l;
import java.lang.Object;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import android.net.Uri;
import ekd.x0;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Runnable;
import msd.l;
import java.lang.Boolean;
import wkd.b;
import com.kwai.framework.perf.phonelevel.d;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.kuaishou.live.common.core.basic.tools.l$c;
import ub.b;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import hc.b;
import java.lang.Integer;
import ekd.j;
import s0d.f;
import s0d.e;
import com.kuaishou.live.common.core.basic.tools.l$b;
import com.kuaishou.live.common.core.basic.tools.l$d;
import uc.d;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import va1.u;
import erd.o;
import com.kuaishou.live.common.core.basic.tools.j;
import t45.d;
import brd.z;
import com.kuaishou.live.common.core.basic.tools.k;
import hc.a;
import dc.a;
import com.kuaishou.live.common.core.basic.tools.l$e;
import java.io.File;
import qkd.b;
import com.facebook.drawee.view.DraweeView;
import android.graphics.drawable.Animatable;
import com.kuaishou.live.core.basic.widget.LiveKwaiImageView;
import android.widget.ImageView;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import com.kuaishou.live.common.core.basic.tools.l$a;

public final class l	// class@000efe
{

    public void l(){
       super();
    }
    public static void a(KwaiImageView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, l.class, "5")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (TextUtils.x(p1) || !l.h(p1)) {
          b.B(LiveLogTag.LIVE_ERROR_LOG_TAG, "invalid controlFile path or the file is not fully loaded, stop binding image");
          return;
       }else {
          p0.setImageURI(x0.f("file://"+p1));
          return;
       }
    }
    public static void b(KwaiImageView p0,String p1,boolean p2,Runnable p3,l p4){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, null, ol, "7")) {
             return;
          }
       }
       if (p0 == null) {
          return;
       }else if(p2 && b.a(-404437045).g()){
          if (p3 != null) {
             b.B(LiveLogTag.LIVE_ERROR_LOG_TAG, "stop loading webp in lowPhone");
             p3.run();
          }
          return;
       }else if(TextUtils.x(p1) || !l.h(p1)){
          b.B(LiveLogTag.LIVE_ERROR_LOG_TAG, "invalid controlFile path or the file is not fully loaded, stop binding webp");
          if (p3 != null) {
             p3.run();
          }
          return;
       }else {
          d uod = Fresco.newDraweeControllerBuilder().D(x0.f("file://"+p1));
          uod.s(new l$c(p4, p3));
          p0.setController(uod.e());
          return;
       }
    }
    public static void c(KwaiImageView p0,CDNUrl[] p1,int p2,b p3){
       if (PatchProxy.isSupport(l.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), null, null, l.class, "6")) {
          return;
       }
       if (p0 != null && !j.h(p1)) {
          d uod = Fresco.newDraweeControllerBuilder();
          uod.q(true);
          uod.u(f.x().r(p1).w());
          uod.s(new l$b(p2, null));
          p0.setController(uod.e());
       }
       return;
    }
    public static void d(KwaiImageView p0,CDNUrl[] p1,boolean p2,Runnable p3,l p4){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, null, ol, "8")) {
             return;
          }
       }
       if (p0 == null) {
          return;
       }else if(p2 && b.a(-404437045).g()){
          b.B(LiveLogTag.LIVE_ERROR_LOG_TAG, "stop loading webp in lowPhone");
          p3.run();
          return;
       }else if(j.h(p1)){
          b.B(LiveLogTag.LIVE_ERROR_LOG_TAG, "invalid cdnurl, stop binding online webp");
          p3.run();
          return;
       }else {
          d uod = Fresco.newDraweeControllerBuilder();
          uod.u(f.x().r(p1).w());
          uod.s(new l$d(p4, p3));
          p0.setController(uod.e());
          return;
       }
    }
    public static t e(CDNUrl[] p0,d p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, l.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.fromArray(p0).map(new u(p1)).concatMapDelayError(j.b).take(1).observeOn(d.a);
    }
    public static l f(){
       Object obj = PatchProxy.apply(null, null, l.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return k.b;
    }
    public static a g(a p0,int p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, ol, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new l$e(p0.f(), p1);
    }
    public static boolean h(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, l.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 1;
       String[] stringArray = new String[i];
       stringArray[0] = p0;
       File uFile = b.B(stringArray);
       if (uFile == null || !uFile.exists()) {
          i = false;
       }
       return i;
    }
    public static boolean i(KwaiImageView p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, l.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0.getController() != null) {
          Animatable animatable = p0.getController().getAnimatable();
          if (animatable != null && animatable.isRunning()) {
             b = true;
          }
       }
       return b;
    }
    public static void j(KwaiImageView p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, l.class, "10")) {
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
    public static void k(LiveKwaiImageView p0,CDNUrl[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, l.class, "2")) {
          return;
       }
       if (p0 != null && !j.h(p1)) {
          if (p0.getTag() instanceof String && TextUtils.n(p0.getTag(), p1[0].getUrl())) {
             return;
          }else {
             a$a uoa = a.d();
             uoa.b(":ks-features:ft-live:live-external:live-lite-api");
             uoa.d(ImageSource.WIDGET_IMAGE);
             p0.Y(p1, uoa.a(), new l$a(p0, p1));
          }
       }
       return;
    }
}
